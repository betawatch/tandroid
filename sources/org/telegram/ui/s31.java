package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ s31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x31 x31Var = this.b;
                s31 s31Var = x31Var.Z;
                if (x31Var.w != null) {
                    x31Var.a0 = r2.n() / x31Var.w.p();
                    v31 v31Var = x31Var.N;
                    if (v31Var != null) {
                        v31Var.Xd = (x31Var.w.p() - x31Var.w.n()) / 1000;
                        x31Var.N.q4();
                        org.telegram.ui.Components.gp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = x31Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (x31Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(s31Var);
                        AndroidUtilities.runOnUIThread(s31Var, 16L);
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
                x31 x31Var2 = this.b;
                if (x31Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new s31(x31Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = x31Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        x31Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
