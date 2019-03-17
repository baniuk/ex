import unittest
from elevator import elevator


class TestElevator(unittest.TestCase):

    def __init__(self, *args, **kwargs):
        super(TestElevator, self).__init__(*args, **kwargs)

    def test_elevator_1(self):
        a = [40, 40, 100, 80, 20]
        b = [3, 3, 2, 2, 3]
        X = 5
        W = 200
        self.assertEqual(elevator(a, b, X, W), 6)

    def test_elevator_1(self):
        a = [60, 80, 40]
        b = [2, 3, 5]
        X = 2
        W = 200
        self.assertEqual(elevator(a, b, X, W), 5)
