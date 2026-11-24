// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class rq9 extends b2 implements cx2 {
    public final fw2 e;

    public rq9(fw2 fw2Var, sw2 sw2Var) {
        super(sw2Var, true);
        this.e = fw2Var;
    }

    @Override // pt5
    public final boolean A() {
        return true;
    }

    @Override // pt5
    public void f(Object obj) {
        r3c.c(dle.a(this.e), zsd.a(obj));
    }

    @Override // pt5
    public void g(Object obj) {
        this.e.resumeWith(zsd.a(obj));
    }

    @Override // cx2
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.e;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }
}
