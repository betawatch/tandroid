package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a51 b;

    public /* synthetic */ v41(a51 a51Var, int i10) {
        this.a = i10;
        this.b = a51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a51 a51Var = this.b;
                v41 v41Var = a51Var.Z;
                if (a51Var.w != null) {
                    a51Var.a0 = r2.n() / a51Var.w.p();
                    y41 y41Var = a51Var.N;
                    if (y41Var != null) {
                        y41Var.Xd = (a51Var.w.p() - a51Var.w.n()) / 1000;
                        a51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = a51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = a51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (a51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(v41Var);
                        AndroidUtilities.runOnUIThread(v41Var, 16L);
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
                a51 a51Var2 = this.b;
                if (a51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new v41(a51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = a51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        a51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
