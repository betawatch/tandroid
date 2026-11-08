package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc1 b;

    public /* synthetic */ sb1(fc1 fc1Var, int i7) {
        this.a = i7;
        this.b = fc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    fc1 fc1Var = this.b;
                    org.telegram.messenger.g0.r(fc1Var.R0);
                    fc1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                fc1 fc1Var2 = this.b;
                if (fc1Var2.m0 && fc1Var2.l0 && System.currentTimeMillis() - fc1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var2.R0);
                    fc1Var2.Q0 = false;
                    fc1Var2.J0 = System.currentTimeMillis();
                    fc1Var2.Z.setRelativePosition(fc1Var2.Y);
                    fc1Var2.a0 = true;
                    fc1Var2.G0 = true;
                    fc1Var2.p0 = fc1Var2.o0;
                    fc1Var2.y();
                    break;
                }
                break;
            case 2:
                fc1 fc1Var3 = this.b;
                if (fc1Var3.G0 && System.currentTimeMillis() - fc1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var3.R0);
                    fc1Var3.Q0 = false;
                    fc1Var3.J0 = System.currentTimeMillis();
                    fc1Var3.Y.setRelativePosition(fc1Var3.Z);
                    fc1Var3.a0 = false;
                    fc1Var3.G0 = false;
                    fc1Var3.p0 = fc1Var3.o0;
                    fc1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                fc1 fc1Var4 = this.b;
                if (currentTimeMillis - fc1Var4.J0 >= 500) {
                    fc1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = fc1Var4.B0;
                    if (!z9 && fc1Var4.A0) {
                        fc1Var4.d(!z9);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                fc1 fc1Var5 = this.b;
                if (currentTimeMillis2 - fc1Var5.J0 >= 500) {
                    fc1Var5.J0 = System.currentTimeMillis();
                    if (fc1Var5.A0) {
                        fc1Var5.d(!fc1Var5.B0);
                        break;
                    }
                }
                break;
            case 5:
                fc1 fc1Var6 = this.b;
                if (fc1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    fc1Var6.s();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(fc1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.g();
                break;
        }
    }
}
