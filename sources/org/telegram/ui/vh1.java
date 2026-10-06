package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki1 b;

    public /* synthetic */ vh1(ki1 ki1Var, int i10) {
        this.a = i10;
        this.b = ki1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ki1 ki1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ki1Var.S0);
                    ki1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ki1 ki1Var2 = this.b;
                if (ki1Var2.n0 && ki1Var2.m0 && System.currentTimeMillis() - ki1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ki1Var2.S0);
                    ki1Var2.R0 = false;
                    ki1Var2.K0 = System.currentTimeMillis();
                    ki1Var2.Z.setRelativePosition(ki1Var2.Y);
                    ki1Var2.a0 = true;
                    ki1Var2.H0 = true;
                    ki1Var2.q0 = ki1Var2.p0;
                    ki1Var2.H();
                    break;
                }
                break;
            case 2:
                ki1 ki1Var3 = this.b;
                if (ki1Var3.H0 && System.currentTimeMillis() - ki1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ki1Var3.S0);
                    ki1Var3.R0 = false;
                    ki1Var3.K0 = System.currentTimeMillis();
                    ki1Var3.Y.setRelativePosition(ki1Var3.Z);
                    ki1Var3.a0 = false;
                    ki1Var3.H0 = false;
                    ki1Var3.q0 = ki1Var3.p0;
                    ki1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ki1 ki1Var4 = this.b;
                if (currentTimeMillis - ki1Var4.K0 >= 500) {
                    ki1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ki1Var4.C0;
                    if (!z10 && ki1Var4.B0) {
                        ki1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ki1 ki1Var5 = this.b;
                if (currentTimeMillis2 - ki1Var5.K0 >= 500) {
                    ki1Var5.K0 = System.currentTimeMillis();
                    if (ki1Var5.B0) {
                        ki1Var5.m(!ki1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                ki1 ki1Var6 = this.b;
                if (ki1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ki1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ki1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
