package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                x31 x31Var = c41Var.V;
                if (c41Var.w != null) {
                    c41Var.W = r2.o() / c41Var.w.q();
                    a41 a41Var = c41Var.J;
                    if (a41Var != null) {
                        a41Var.Td = (c41Var.w.q() - c41Var.w.o()) / 1000;
                        c41Var.J.p4();
                        org.telegram.ui.Components.sn0 seekBarWaveform = c41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = c41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (c41Var.w.z()) {
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
                    org.telegram.ui.Cells.s1 s1Var2 = c41Var2.K;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        c41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
