package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;

    public /* synthetic */ ub1(hc1 hc1Var, int i7) {
        this.a = i7;
        this.b = hc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    hc1 hc1Var = this.b;
                    org.telegram.messenger.g0.r(hc1Var.S0);
                    hc1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                hc1 hc1Var2 = this.b;
                if (hc1Var2.n0 && hc1Var2.m0 && System.currentTimeMillis() - hc1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(hc1Var2.S0);
                    hc1Var2.R0 = false;
                    hc1Var2.K0 = System.currentTimeMillis();
                    hc1Var2.a0.setRelativePosition(hc1Var2.Z);
                    hc1Var2.b0 = true;
                    hc1Var2.H0 = true;
                    hc1Var2.q0 = hc1Var2.p0;
                    hc1Var2.y();
                    break;
                }
                break;
            case 2:
                hc1 hc1Var3 = this.b;
                if (hc1Var3.H0 && System.currentTimeMillis() - hc1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(hc1Var3.S0);
                    hc1Var3.R0 = false;
                    hc1Var3.K0 = System.currentTimeMillis();
                    hc1Var3.Z.setRelativePosition(hc1Var3.a0);
                    hc1Var3.b0 = false;
                    hc1Var3.H0 = false;
                    hc1Var3.q0 = hc1Var3.p0;
                    hc1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                hc1 hc1Var4 = this.b;
                if (currentTimeMillis - hc1Var4.K0 >= 500) {
                    hc1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = hc1Var4.C0;
                    if (!z10 && hc1Var4.B0) {
                        hc1Var4.d(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                hc1 hc1Var5 = this.b;
                if (currentTimeMillis2 - hc1Var5.K0 >= 500) {
                    hc1Var5.K0 = System.currentTimeMillis();
                    if (hc1Var5.B0) {
                        hc1Var5.d(!hc1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                hc1 hc1Var6 = this.b;
                if (hc1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    hc1Var6.s();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(hc1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.g();
                break;
        }
    }
}
