package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                    org.telegram.messenger.g0.r(fc1Var.S0);
                    fc1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                fc1 fc1Var2 = this.b;
                if (fc1Var2.n0 && fc1Var2.m0 && System.currentTimeMillis() - fc1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var2.S0);
                    fc1Var2.R0 = false;
                    fc1Var2.K0 = System.currentTimeMillis();
                    fc1Var2.a0.setRelativePosition(fc1Var2.Z);
                    fc1Var2.b0 = true;
                    fc1Var2.H0 = true;
                    fc1Var2.q0 = fc1Var2.p0;
                    fc1Var2.y();
                    break;
                }
                break;
            case 2:
                fc1 fc1Var3 = this.b;
                if (fc1Var3.H0 && System.currentTimeMillis() - fc1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var3.S0);
                    fc1Var3.R0 = false;
                    fc1Var3.K0 = System.currentTimeMillis();
                    fc1Var3.Z.setRelativePosition(fc1Var3.a0);
                    fc1Var3.b0 = false;
                    fc1Var3.H0 = false;
                    fc1Var3.q0 = fc1Var3.p0;
                    fc1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                fc1 fc1Var4 = this.b;
                if (currentTimeMillis - fc1Var4.K0 >= 500) {
                    fc1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = fc1Var4.C0;
                    if (!z10 && fc1Var4.B0) {
                        fc1Var4.d(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                fc1 fc1Var5 = this.b;
                if (currentTimeMillis2 - fc1Var5.K0 >= 500) {
                    fc1Var5.K0 = System.currentTimeMillis();
                    if (fc1Var5.B0) {
                        fc1Var5.d(!fc1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                fc1 fc1Var6 = this.b;
                if (fc1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
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
