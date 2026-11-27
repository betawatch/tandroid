// default package

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn3 b;

    public /* synthetic */ vm3(bn3 bn3Var, byte b) {
        this.a = b;
        this.b = bn3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en3 en3Var;
        en3 en3Var2;
        en3 en3Var3;
        byte b = this.a;
        bn3 bn3Var = this.b;
        switch (b) {
            case 0:
                byte b2 = bn3Var.r;
                if ((b2 == 3 || b2 == 4) && !wf3.B(bn3Var.f.a.F3)) {
                    bn3Var.w.setIsland(true);
                    break;
                }
                break;
            case 1:
                tx1 tx1Var = bn3Var.f.a.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = bn3Var.f.a;
                chatActivityEnterView.F1 = 0L;
                chatActivityEnterView.G1 = null;
                break;
            case 3:
                d dVar = bn3Var.f;
                String B = bn3Var.B();
                zj3 zj3Var = new zj3(bn3Var, (byte) 3);
                ChatActivityEnterView chatActivityEnterView2 = dVar.a;
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView2.n1(B, zj3Var);
                break;
            case 4:
                tx1 tx1Var2 = bn3Var.f.a.F0;
                if (tx1Var2 != null) {
                    tx1Var2.requestFocus();
                    break;
                }
                break;
            case 5:
                if (bn3Var.r == 3 && (en3Var = bn3Var.s) != null) {
                    en3Var.e();
                    break;
                }
                break;
            case 6:
                if (bn3Var.r == 1) {
                    bn3Var.Q(true);
                    break;
                }
                break;
            case 7:
                if (bn3Var.r == 1) {
                    bn3Var.Q(false);
                    break;
                }
                break;
            case 8:
                bn3Var.b(0.0f, 320L, k43.h);
                hl.d3(new vm3(bn3Var, (byte) 11), 360L);
                break;
            case 9:
                if (!bn3Var.s()) {
                    bn3Var.f.d(null);
                    bn3Var.b(0.0f, 240L, k43.g);
                    break;
                }
                break;
            case 10:
                if (!bn3Var.s() && (en3Var2 = bn3Var.s) != null) {
                    en3Var2.setShown(false);
                    break;
                }
                break;
            default:
                if (!bn3Var.s() && (en3Var3 = bn3Var.s) != null) {
                    en3Var3.e();
                    break;
                }
                break;
        }
    }
}
