import sys

class SieveOfEratosthenes():
    """docstring for SieveOfEratosthenes.
    Creates a sieve of eratosthenes to solve
    prime numbers in a given range.
    """
    def __init__(self, upper_limit):
        # super(SieveOfEratosthenes, self).__init__()
        self.upper_limit = upper_limit
        self.sieve = [True]*upper_limit
        self.sievify()

    def sievify(self):
        ul = self.upper_limit
        for i in range(2,int(self.upper_limit**0.5)):
            if(self.sieve[i] is True):
                for j in range(i*i, ul, i):
                    self.sieve[j] = False

    def __repr__(self):
        ret = []
        for i in range(2, self.upper_limit):
            if self.sieve[i] is True:
                ret.append(i)
        return str(ret)

if __name__ == "__main__":
    if(len(sys.argv) != 2):
        print("Usage: python3 ", sys.argv[0], " [number]")
    else:
        s = SieveOfEratosthenes(int(sys.argv[1]))
        print(s)
