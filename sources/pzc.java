// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pzc implements Comparable {
    public final int a;
    public final lzc b;

    public pzc(int i, lzc lzcVar) {
        this.a = i;
        this.b = lzcVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((pzc) obj).a);
    }
}
