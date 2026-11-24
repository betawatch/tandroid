// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x08 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ x08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.i0();
                break;
            case 1:
                pVar.getMessagesController().b4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    w18 w18Var = pVar.a1;
                    if (w18Var != null) {
                        w18Var.c(4);
                    }
                    pVar.finishFragment();
                    break;
                } else if (pVar.g1 == 1 && !pVar.isFinishing()) {
                    pVar.finishFragment();
                    break;
                }
                break;
            case 2:
                if (pVar.e0 != null) {
                    pVar.A0();
                    pVar.e0 = null;
                    break;
                }
                break;
            default:
                pVar.f[0].requestFocus();
                gm.E3(pVar.f[0]);
                break;
        }
    }
}
