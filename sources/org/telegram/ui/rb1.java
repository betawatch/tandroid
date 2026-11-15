package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                    org.telegram.messenger.g0.r(ec1Var.S0);
                    ec1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ec1 ec1Var2 = this.b;
                if (ec1Var2.n0 && ec1Var2.m0 && System.currentTimeMillis() - ec1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var2.S0);
                    ec1Var2.R0 = false;
                    ec1Var2.K0 = System.currentTimeMillis();
                    ec1Var2.a0.setRelativePosition(ec1Var2.Z);
                    ec1Var2.b0 = true;
                    ec1Var2.H0 = true;
                    ec1Var2.q0 = ec1Var2.p0;
                    ec1Var2.y();
                    break;
                }
                break;
            case 2:
                ec1 ec1Var3 = this.b;
                if (ec1Var3.H0 && System.currentTimeMillis() - ec1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var3.S0);
                    ec1Var3.R0 = false;
                    ec1Var3.K0 = System.currentTimeMillis();
                    ec1Var3.Z.setRelativePosition(ec1Var3.a0);
                    ec1Var3.b0 = false;
                    ec1Var3.H0 = false;
                    ec1Var3.q0 = ec1Var3.p0;
                    ec1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ec1 ec1Var4 = this.b;
                if (currentTimeMillis - ec1Var4.K0 >= 500) {
                    ec1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ec1Var4.C0;
                    if (!z10 && ec1Var4.B0) {
                        ec1Var4.d(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ec1 ec1Var5 = this.b;
                if (currentTimeMillis2 - ec1Var5.K0 >= 500) {
                    ec1Var5.K0 = System.currentTimeMillis();
                    if (ec1Var5.B0) {
                        ec1Var5.d(!ec1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                ec1 ec1Var6 = this.b;
                if (ec1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
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
