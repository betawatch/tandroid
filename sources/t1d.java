// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t1d implements nd0 {
    public final /* synthetic */ hy4 a;

    public t1d(hy4 hy4Var) {
        this.a = hy4Var;
    }

    @Override // nd0
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        o59 o59Var = this.a.y;
        o59Var.sendMessage(o59Var.obtainMessage(1, valueOf));
    }
}
