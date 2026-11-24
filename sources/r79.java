// default package

import android.app.Activity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ wjb d;
    public final /* synthetic */ k27 e;

    public /* synthetic */ r79(mu1 mu1Var, Activity activity, wjb wjbVar, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = activity;
        this.d = wjbVar;
        this.e = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.e;
        wjb wjbVar = this.d;
        Activity activity = this.c;
        mu1 mu1Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                u21.b0(mu1Var).c(gl.O2(k96.M0(2131754484, null), -1, 2, new m9(activity, (byte) 3), wjbVar)).j();
                mu1Var.Na(k27Var);
                mu1Var.Pa(k27Var);
                break;
            case 1:
                u21.b0(mu1Var).c(gl.O2(k96.M0(2131754484, null), -1, 2, new m9(activity, b2), wjbVar)).j();
                mu1Var.Na(k27Var);
                mu1Var.Pa(k27Var);
                break;
            default:
                u21.b0(mu1Var).c(gl.O2(k96.M0(2131754484, null), -1, 2, new m9(activity, (byte) 4), wjbVar)).j();
                mu1Var.Na(k27Var);
                mu1Var.Pa(k27Var);
                break;
        }
    }
}
