// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ur7 implements sa1 {
    public final cq4 a;
    public final /* synthetic */ vr7 b;

    public ur7(vr7 vr7Var, cq4 cq4Var) {
        this.b = vr7Var;
        this.a = cq4Var;
    }

    @Override // sa1
    public final void cancel() {
        vr7 vr7Var = this.b;
        ls lsVar = vr7Var.b;
        cq4 cq4Var = this.a;
        lsVar.remove(cq4Var);
        if (ur5.a(vr7Var.c, cq4Var)) {
            cq4Var.a();
            vr7Var.c = null;
        }
        cq4Var.b.remove(this);
        sr4 sr4Var = cq4Var.c;
        if (sr4Var != null) {
            sr4Var.invoke();
        }
        cq4Var.c = null;
    }
}
