package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ y31(d41 d41Var, int i9) {
        this.a = i9;
        this.b = d41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                y31 y31Var = d41Var.V;
                if (d41Var.w != null) {
                    d41Var.W = r2.o() / d41Var.w.q();
                    b41 b41Var = d41Var.J;
                    if (b41Var != null) {
                        b41Var.Td = (d41Var.w.q() - d41Var.w.o()) / 1000;
                        d41Var.J.q4();
                        org.telegram.ui.Components.rn0 seekBarWaveform = d41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = d41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (d41Var.w.z()) {
                        AndroidUtilities.cancelRunOnUIThread(y31Var);
                        AndroidUtilities.runOnUIThread(y31Var, 16L);
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
                d41 d41Var2 = this.b;
                if (d41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new y31(d41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = d41Var2.K;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        d41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
