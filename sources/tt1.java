// default package

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju1 b;
    public final /* synthetic */ r47 c;

    public /* synthetic */ tt1(ju1 ju1Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = ju1Var;
        this.c = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.c;
        ju1 ju1Var = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = ju1Var.a;
                zu1Var.i6();
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    undoView.k(0L, (zu1Var.a0.getVisibility() != 0 || zu1Var.T.getVisibility() == 0) ? 17 : 16, r47Var.C0(), null, null, new tt1(ju1Var, r47Var, (byte) 2));
                    break;
                }
                break;
            case 1:
                zu1 zu1Var2 = ju1Var.a;
                zu1Var2.lc = r47Var.e1();
                zu1Var2.mc = 0;
                break;
            default:
                zu1 zu1Var3 = ju1Var.a;
                if (zu1Var3.r5()) {
                    p7a b2 = p7a.b(r47Var.C0(), zu1Var3.l6, zu1Var3.F5, zu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b2.K = zu1Var3.X6();
                    zu1Var3.getSendMessagesHelper().q0(b2);
                    break;
                }
                break;
        }
    }
}
