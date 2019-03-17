# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

import itertools as it


class Elevator:
    """Implement elevator."""

    _w = 0  # weight of all passengers
    _in_el = []  # list of passengers in lelevator
    _X = 0  # number of people allowed
    _W = 0  # max weight allowed

    def __init__(self, X, W):
        """Build elevator of capacity X and allowed load W."""
        self._X = X
        self._W = W

    def add(self, p):
        """
        Add passenger if he fits.

        Returns:
            True if passenger got in, False otherwise
        """
        if len(self._in_el) < self._X and self._w+p['weight'] <= self._W:
            self._w += p['weight']
            self._in_el.append(p)
            return True
        else:
            return False

    def return_to_ground(self):
        """
        Run upstairs and back.

        Returns:
            number of stops.
        """
        self._w = 0
        s = set()
        [s.add(p['floor']) for p in self._in_el]
        self._in_el.clear()
        return len(s)+1


def elevator(a, b, X, W):
    queue = [{'floor': ia, 'weight': ib} for ia, ib in zip(a, b)]

    elevator = Elevator(X, W)
    total_stops = 0
    while len(queue) != 0:
        # load passengers
        in_e = [p for p in it.takewhile(lambda p: elevator.add(p), queue)]
        # remove those who get in
        [queue.remove(p) for p in in_e]
        # go up and return for next batch
        total_stops += elevator.return_to_ground()
    return total_stops
