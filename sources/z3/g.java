package z3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final long a;
    public final byte[] b;

    public g(long j3, byte[] bArr) {
        this.a = j3;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((g) obj).a);
    }
}
