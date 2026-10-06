package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ x41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c51 c51Var = this.b;
                x41 x41Var = c51Var.Z;
                if (c51Var.w != null) {
                    c51Var.a0 = r2.n() / c51Var.w.p();
                    a51 a51Var = c51Var.N;
                    if (a51Var != null) {
                        a51Var.Xd = (c51Var.w.p() - c51Var.w.n()) / 1000;
                        c51Var.N.q4();
                        org.telegram.ui.Components.cp0 seekBarWaveform = c51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = c51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (c51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x41Var);
                        AndroidUtilities.runOnUIThread(x41Var, 16L);
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
                c51 c51Var2 = this.b;
                if (c51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new x41(c51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = c51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        c51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
