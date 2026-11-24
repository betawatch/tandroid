// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo1 b;
    public final /* synthetic */ c41 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ q63 e;

    public /* synthetic */ w99(bo1 bo1Var, c41 c41Var, Context context, q63 q63Var, byte b) {
        this.a = b;
        this.b = bo1Var;
        this.c = c41Var;
        this.d = context;
        this.e = q63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        q63 q63Var = this.e;
        Context context = this.d;
        c41 c41Var = this.c;
        bo1 bo1Var = this.b;
        switch (b) {
            case 0:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 9), q63Var)).j();
                break;
            case 1:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 12), q63Var)).j();
                break;
            default:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 13), q63Var)).j();
                break;
        }
    }
}
