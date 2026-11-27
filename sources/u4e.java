// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class u4e implements Cloneable {
    public final s6e a;
    public s6e b;

    public u4e(s6e s6eVar) {
        this.a = s6eVar;
        if (s6eVar.m()) {
            lq5.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (s6e) s6eVar.d(4);
    }

    public final s6e a() {
        boolean m = this.b.m();
        s6e s6eVar = this.b;
        if (m) {
            s6eVar.getClass();
            zee.c.a(s6eVar.getClass()).zzf(s6eVar);
            s6eVar.j();
            s6eVar = this.b;
        }
        s6eVar.getClass();
        if (s6e.c(s6eVar, true)) {
            return s6eVar;
        }
        throw new mie();
    }

    public final void b() {
        if (this.b.m()) {
            return;
        }
        s6e s6eVar = (s6e) this.a.d(4);
        zee.c.a(s6eVar.getClass()).zzg(s6eVar, this.b);
        this.b = s6eVar;
    }

    public final Object clone() {
        u4e u4eVar = (u4e) this.a.d(5);
        boolean m = this.b.m();
        s6e s6eVar = this.b;
        if (m) {
            s6eVar.getClass();
            zee.c.a(s6eVar.getClass()).zzf(s6eVar);
            s6eVar.j();
            s6eVar = this.b;
        }
        u4eVar.b = s6eVar;
        return u4eVar;
    }
}
