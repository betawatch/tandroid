// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vd0 implements rb1 {
    public final ud0[] a;

    public vd0(ud0[] ud0VarArr) {
        this.a = ud0VarArr;
    }

    @Override // rb1
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (ud0 ud0Var : this.a) {
            xp3 xp3Var = ud0Var.f;
            if (xp3Var == null) {
                rr5.e("handle");
                throw null;
            }
            xp3Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
