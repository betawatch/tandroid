// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class re2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if2 b;

    public /* synthetic */ re2(if2 if2Var, byte b) {
        this.a = b;
        this.b = if2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        if2 if2Var = this.b;
        switch (b) {
            case 0:
                if2Var.q1.f();
                break;
            case 1:
                if2Var.E0(true);
                break;
            case 2:
                yv1 yv1Var = if2Var.u1;
                d e0 = xza.e0(yv1Var.getMessagesController().L0(Long.valueOf(-yv1Var.a())), true);
                bh0 bh0Var = new bh0();
                bh0Var.a = true;
                e0.setResourceProvider(yv1Var.getResourceProvider());
                bh0Var.c = new jd((byte) 23);
                bh0Var.d = new re2(if2Var, (byte) 3);
                bh0Var.b = new re2(if2Var, (byte) 4);
                bh0Var.e = true;
                if2Var.Q1 = e0;
                yv1Var.showAsSheet(e0, bh0Var);
                break;
            case 3:
                if2Var.I0();
                break;
            case 4:
                if2Var.Q1 = null;
                break;
            case 5:
                if2Var.I0();
                break;
            case 6:
                if2Var.Q1 = null;
                break;
            default:
                if2Var.N1.c(if2Var.z1);
                break;
        }
    }
}
