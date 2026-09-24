package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b51 b;

    public /* synthetic */ w41(b51 b51Var, int i10) {
        this.a = i10;
        this.b = b51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b51 b51Var = this.b;
                w41 w41Var = b51Var.Z;
                if (b51Var.w != null) {
                    b51Var.a0 = r2.n() / b51Var.w.p();
                    z41 z41Var = b51Var.N;
                    if (z41Var != null) {
                        z41Var.Xd = (b51Var.w.p() - b51Var.w.n()) / 1000;
                        b51Var.N.q4();
                        org.telegram.ui.Components.vo0 seekBarWaveform = b51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = b51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (b51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(w41Var);
                        AndroidUtilities.runOnUIThread(w41Var, 16L);
                        break;
                    }
                }
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                b51 b51Var2 = this.b;
                if (b51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new w41(b51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = b51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        b51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
