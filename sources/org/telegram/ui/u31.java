package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z31 b;

    public /* synthetic */ u31(z31 z31Var, int i10) {
        this.a = i10;
        this.b = z31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z31 z31Var = this.b;
                u31 u31Var = z31Var.Z;
                if (z31Var.w != null) {
                    z31Var.a0 = r2.n() / z31Var.w.p();
                    x31 x31Var = z31Var.N;
                    if (x31Var != null) {
                        x31Var.Xd = (z31Var.w.p() - z31Var.w.n()) / 1000;
                        z31Var.N.q4();
                        org.telegram.ui.Components.fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = z31Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (z31Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(u31Var);
                        AndroidUtilities.runOnUIThread(u31Var, 16L);
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
                z31 z31Var2 = this.b;
                if (z31Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new u31(z31Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = z31Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        z31Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
