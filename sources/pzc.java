// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
