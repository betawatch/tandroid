// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ x18(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.f[0].requestFocus();
                hl.E3(pVar.f[0]);
                break;
            case 1:
                if (pVar.e0 != null) {
                    pVar.A0();
                    pVar.e0 = null;
                    break;
                }
                break;
            case 2:
                pVar.h0();
                break;
            default:
                pVar.getMessagesController().c4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    z28 z28Var = pVar.a1;
                    if (z28Var != null) {
                        z28Var.c(4);
                    }
                    pVar.finishFragment();
                    break;
                } else if (pVar.g1 == 1 && !pVar.isFinishing()) {
                    pVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
