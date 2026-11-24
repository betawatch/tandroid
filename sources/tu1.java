// default package

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tu1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iv1 b;
    public final /* synthetic */ k47 c;

    public /* synthetic */ tu1(iv1 iv1Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = iv1Var;
        this.c = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.c;
        iv1 iv1Var = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = iv1Var.a;
                yv1Var.i6();
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.k(0L, (yv1Var.a0.getVisibility() != 0 || yv1Var.T.getVisibility() == 0) ? 17 : 16, k47Var.C0(), null, null, new tu1(iv1Var, k47Var, (byte) 2));
                    break;
                }
                break;
            case 1:
                yv1 yv1Var2 = iv1Var.a;
                yv1Var2.kc = k47Var.e1();
                yv1Var2.lc = 0;
                break;
            default:
                yv1 yv1Var3 = iv1Var.a;
                if (yv1Var3.s5()) {
                    y5a b2 = y5a.b(k47Var.C0(), yv1Var3.l6, yv1Var3.F5, yv1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = yv1Var3.X6();
                    yv1Var3.getSendMessagesHelper().q0(b2);
                    break;
                }
                break;
        }
    }
}
