package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii1 b;

    public /* synthetic */ th1(ii1 ii1Var, int i10) {
        this.a = i10;
        this.b = ii1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ii1 ii1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
                    ii1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ii1 ii1Var2 = this.b;
                if (ii1Var2.k0 && ii1Var2.j0 && System.currentTimeMillis() - ii1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ii1Var2.P0);
                    ii1Var2.O0 = false;
                    ii1Var2.H0 = System.currentTimeMillis();
                    ii1Var2.W.setRelativePosition(ii1Var2.V);
                    ii1Var2.X = true;
                    ii1Var2.E0 = true;
                    ii1Var2.n0 = ii1Var2.m0;
                    ii1Var2.H();
                    break;
                }
                break;
            case 2:
                ii1 ii1Var3 = this.b;
                if (ii1Var3.E0 && System.currentTimeMillis() - ii1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ii1Var3.P0);
                    ii1Var3.O0 = false;
                    ii1Var3.H0 = System.currentTimeMillis();
                    ii1Var3.V.setRelativePosition(ii1Var3.W);
                    ii1Var3.X = false;
                    ii1Var3.E0 = false;
                    ii1Var3.n0 = ii1Var3.m0;
                    ii1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ii1 ii1Var4 = this.b;
                if (currentTimeMillis - ii1Var4.H0 >= 500) {
                    ii1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ii1Var4.z0;
                    if (!z4 && ii1Var4.y0) {
                        ii1Var4.m(!z4);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ii1 ii1Var5 = this.b;
                if (currentTimeMillis2 - ii1Var5.H0 >= 500) {
                    ii1Var5.H0 = System.currentTimeMillis();
                    if (ii1Var5.y0) {
                        ii1Var5.m(!ii1Var5.z0);
                        break;
                    }
                }
                break;
            case 5:
                ii1 ii1Var6 = this.b;
                if (ii1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ii1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ii1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
