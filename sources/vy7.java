// default package

import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vy7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ vy7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.h0();
                break;
            case 1:
                pVar.getMessagesController().b4 = null;
                if (pVar.g1 == 3 && !pVar.isFinishing()) {
                    pVar.g1 = 4;
                    tz7 tz7Var = pVar.a1;
                    if (tz7Var != null) {
                        tz7Var.c(4);
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
                    pVar.z0();
                    pVar.e0 = null;
                    break;
                }
                break;
            default:
                pVar.f[0].requestFocus();
                gl.F3(pVar.f[0]);
                break;
        }
    }
}
