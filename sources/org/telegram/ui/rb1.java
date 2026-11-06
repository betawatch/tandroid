package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;

    public /* synthetic */ rb1(ec1 ec1Var, int i7) {
        this.a = i7;
        this.b = ec1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ec1 ec1Var = this.b;
                    org.telegram.messenger.g0.r(ec1Var.R0);
                    ec1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ec1 ec1Var2 = this.b;
                if (ec1Var2.m0 && ec1Var2.l0 && System.currentTimeMillis() - ec1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var2.R0);
                    ec1Var2.Q0 = false;
                    ec1Var2.J0 = System.currentTimeMillis();
                    ec1Var2.Z.setRelativePosition(ec1Var2.Y);
                    ec1Var2.a0 = true;
                    ec1Var2.G0 = true;
                    ec1Var2.p0 = ec1Var2.o0;
                    ec1Var2.y();
                    break;
                }
                break;
            case 2:
                ec1 ec1Var3 = this.b;
                if (ec1Var3.G0 && System.currentTimeMillis() - ec1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var3.R0);
                    ec1Var3.Q0 = false;
                    ec1Var3.J0 = System.currentTimeMillis();
                    ec1Var3.Y.setRelativePosition(ec1Var3.Z);
                    ec1Var3.a0 = false;
                    ec1Var3.G0 = false;
                    ec1Var3.p0 = ec1Var3.o0;
                    ec1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ec1 ec1Var4 = this.b;
                if (currentTimeMillis - ec1Var4.J0 >= 500) {
                    ec1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = ec1Var4.B0;
                    if (!z9 && ec1Var4.A0) {
                        ec1Var4.d(!z9);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ec1 ec1Var5 = this.b;
                if (currentTimeMillis2 - ec1Var5.J0 >= 500) {
                    ec1Var5.J0 = System.currentTimeMillis();
                    if (ec1Var5.A0) {
                        ec1Var5.d(!ec1Var5.B0);
                        break;
                    }
                }
                break;
            case 5:
                ec1 ec1Var6 = this.b;
                if (ec1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ec1Var6.s();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ec1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.g();
                break;
        }
    }
}
