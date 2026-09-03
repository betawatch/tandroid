package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ r41(w41 w41Var, int i10) {
        this.a = i10;
        this.b = w41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w41 w41Var = this.b;
                r41 r41Var = w41Var.W;
                if (w41Var.w != null) {
                    w41Var.X = r2.n() / w41Var.w.p();
                    u41 u41Var = w41Var.K;
                    if (u41Var != null) {
                        u41Var.Ud = (w41Var.w.p() - w41Var.w.n()) / 1000;
                        w41Var.K.q4();
                        org.telegram.ui.Components.mo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = w41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (w41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(r41Var);
                        AndroidUtilities.runOnUIThread(r41Var, 16L);
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
                w41 w41Var2 = this.b;
                if (w41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new r41(w41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = w41Var2.L;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        w41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
