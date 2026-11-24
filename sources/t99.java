// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ k47 e;

    public /* synthetic */ t99(yv1 yv1Var, Activity activity, ylb ylbVar, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = activity;
        this.d = ylbVar;
        this.e = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.e;
        ylb ylbVar = this.d;
        Activity activity = this.c;
        yv1 yv1Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, (byte) 3), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                break;
            case 1:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, b2), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                break;
            default:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, (byte) 4), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                break;
        }
    }
}
