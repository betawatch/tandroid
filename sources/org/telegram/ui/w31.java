package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ w31(b41 b41Var, int i10) {
        this.a = i10;
        this.b = b41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b41 b41Var = this.b;
                w31 w31Var = b41Var.Z;
                if (b41Var.w != null) {
                    b41Var.a0 = r2.n() / b41Var.w.p();
                    z31 z31Var = b41Var.N;
                    if (z31Var != null) {
                        z31Var.Xd = (b41Var.w.p() - b41Var.w.n()) / 1000;
                        b41Var.N.p4();
                        org.telegram.ui.Components.kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = b41Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (b41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(w31Var);
                        AndroidUtilities.runOnUIThread(w31Var, 16L);
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
                b41 b41Var2 = this.b;
                if (b41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new w31(b41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = b41Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        b41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
