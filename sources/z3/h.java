package z3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final long a;
    public final byte[] b;

    public h(long j10, byte[] bArr) {
        this.a = j10;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((h) obj).a);
    }
}
