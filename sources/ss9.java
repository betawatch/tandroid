// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ss9 extends b2 implements my2 {
    public final px2 e;

    public ss9(px2 px2Var, cy2 cy2Var) {
        super(cy2Var, true);
        this.e = px2Var;
    }

    @Override // ov5
    public final boolean A() {
        return true;
    }

    @Override // ov5
    public void f(Object obj) {
        r5c.c(fne.a(this.e), cvd.a(obj));
    }

    @Override // ov5
    public void g(Object obj) {
        this.e.resumeWith(cvd.a(obj));
    }

    @Override // my2
    public final my2 getCallerFrame() {
        px2 px2Var = this.e;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }
}
