// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vj7 implements ta1, noc {
    public final va1 a;
    public final /* synthetic */ wj7 b;

    public vj7(wj7 wj7Var, va1 va1Var) {
        this.b = wj7Var;
        this.a = va1Var;
    }

    @Override // noc
    public final void a(hz9 hz9Var, int i) {
        this.a.a(hz9Var, i);
    }

    @Override // ta1
    public final ow5 b(Object obj, ks4 ks4Var) {
        wj7 wj7Var = this.b;
        ua1 ua1Var = new ua1(wj7Var, this);
        ow5 E = this.a.E((f9c) obj, ua1Var);
        if (E != null) {
            wj7.h.set(wj7Var, null);
        }
        return E;
    }

    @Override // ta1
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // zw2
    public final mx2 getContext() {
        return this.a.e;
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
