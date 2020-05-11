public class Fact {
int Fact(int n) {
    int result;
    if (n==1) return 1;
result = Fact(n-1) *n;
return result;
}
}
