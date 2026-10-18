package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh1 b;

    public /* synthetic */ ug1(jh1 jh1Var, int i10) {
        this.a = i10;
        this.b = jh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    jh1 jh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(jh1Var.S0);
                    jh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                jh1 jh1Var2 = this.b;
                if (jh1Var2.n0 && jh1Var2.m0 && System.currentTimeMillis() - jh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(jh1Var2.S0);
                    jh1Var2.R0 = false;
                    jh1Var2.K0 = System.currentTimeMillis();
                    jh1Var2.Z.setRelativePosition(jh1Var2.Y);
                    jh1Var2.a0 = true;
                    jh1Var2.H0 = true;
                    jh1Var2.q0 = jh1Var2.p0;
                    jh1Var2.G();
                    break;
                }
                break;
            case 2:
                jh1 jh1Var3 = this.b;
                if (jh1Var3.H0 && System.currentTimeMillis() - jh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(jh1Var3.S0);
                    jh1Var3.R0 = false;
                    jh1Var3.K0 = System.currentTimeMillis();
                    jh1Var3.Y.setRelativePosition(jh1Var3.Z);
                    jh1Var3.a0 = false;
                    jh1Var3.H0 = false;
                    jh1Var3.q0 = jh1Var3.p0;
                    jh1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                jh1 jh1Var4 = this.b;
                if (currentTimeMillis - jh1Var4.K0 >= 500) {
                    jh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = jh1Var4.C0;
                    if (!z10 && jh1Var4.B0) {
                        jh1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                jh1 jh1Var5 = this.b;
                if (currentTimeMillis2 - jh1Var5.K0 >= 500) {
                    jh1Var5.K0 = System.currentTimeMillis();
                    if (jh1Var5.B0) {
                        jh1Var5.l(!jh1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                jh1 jh1Var6 = this.b;
                if (jh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    jh1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(jh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}
