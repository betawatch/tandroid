package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;

    public /* synthetic */ wg1(lh1 lh1Var, int i10) {
        this.a = i10;
        this.b = lh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    lh1 lh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
                    lh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                lh1 lh1Var2 = this.b;
                if (lh1Var2.j0 && lh1Var2.i0 && System.currentTimeMillis() - lh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(lh1Var2.O0);
                    lh1Var2.N0 = false;
                    lh1Var2.G0 = System.currentTimeMillis();
                    lh1Var2.V.setRelativePosition(lh1Var2.U);
                    lh1Var2.W = true;
                    lh1Var2.D0 = true;
                    lh1Var2.m0 = lh1Var2.l0;
                    lh1Var2.H();
                    break;
                }
                break;
            case 2:
                lh1 lh1Var3 = this.b;
                if (lh1Var3.D0 && System.currentTimeMillis() - lh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(lh1Var3.O0);
                    lh1Var3.N0 = false;
                    lh1Var3.G0 = System.currentTimeMillis();
                    lh1Var3.U.setRelativePosition(lh1Var3.V);
                    lh1Var3.W = false;
                    lh1Var3.D0 = false;
                    lh1Var3.m0 = lh1Var3.l0;
                    lh1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                lh1 lh1Var4 = this.b;
                if (currentTimeMillis - lh1Var4.G0 >= 500) {
                    lh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = lh1Var4.y0;
                    if (!z10 && lh1Var4.x0) {
                        lh1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                lh1 lh1Var5 = this.b;
                if (currentTimeMillis2 - lh1Var5.G0 >= 500) {
                    lh1Var5.G0 = System.currentTimeMillis();
                    if (lh1Var5.x0) {
                        lh1Var5.m(!lh1Var5.y0);
                        break;
                    }
                }
                break;
            case 5:
                lh1 lh1Var6 = this.b;
                if (lh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    lh1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(lh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
