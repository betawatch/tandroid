// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
