package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ qz0(vz0 vz0Var, int i7) {
        this.a = i7;
        this.b = vz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vz0 vz0Var = this.b;
                qz0 qz0Var = vz0Var.Z;
                if (vz0Var.x != null) {
                    vz0Var.a0 = r2.S() / vz0Var.x.U();
                    tz0 tz0Var = vz0Var.N;
                    if (tz0Var != null) {
                        tz0Var.oc = (vz0Var.x.U() - vz0Var.x.S()) / 1000;
                        vz0Var.N.S3();
                        org.telegram.ui.Components.pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = vz0Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (vz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(qz0Var);
                        org.telegram.messenger.g0.i3(qz0Var, 16L);
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
                vz0 vz0Var2 = this.b;
                if (vz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new qz0(vz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = vz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        vz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
