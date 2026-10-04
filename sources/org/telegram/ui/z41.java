package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class z41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ z41(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e51 e51Var = this.b;
                z41 z41Var = e51Var.Z;
                if (e51Var.w != null) {
                    e51Var.a0 = r2.n() / e51Var.w.p();
                    c51 c51Var = e51Var.N;
                    if (c51Var != null) {
                        c51Var.Xd = (e51Var.w.p() - e51Var.w.n()) / 1000;
                        e51Var.N.q4();
                        org.telegram.ui.Components.bp0 seekBarWaveform = e51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = e51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (e51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z41Var);
                        AndroidUtilities.runOnUIThread(z41Var, 16L);
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
                e51 e51Var2 = this.b;
                if (e51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new z41(e51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = e51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        e51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
