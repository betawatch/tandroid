package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ x31(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c41 c41Var = this.b;
                x31 x31Var = c41Var.Z;
                if (c41Var.w != null) {
                    c41Var.a0 = r2.n() / c41Var.w.p();
                    a41 a41Var = c41Var.N;
                    if (a41Var != null) {
                        a41Var.Yd = (c41Var.w.p() - c41Var.w.n()) / 1000;
                        c41Var.N.s4();
                        org.telegram.ui.Components.pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = c41Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (c41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x31Var);
                        AndroidUtilities.runOnUIThread(x31Var, 16L);
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
                c41 c41Var2 = this.b;
                if (c41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new x31(c41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = c41Var2.O;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        c41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
