package z3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
