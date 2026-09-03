package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y0 implements pa.v {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ pa.u c;

    public y0(Class cls, Class cls2, pa.u uVar) {
        this.a = cls;
        this.b = cls2;
        this.c = uVar;
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
