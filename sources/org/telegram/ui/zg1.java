package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ zg1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    oh1 oh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
                    oh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                oh1 oh1Var2 = this.b;
                if (oh1Var2.j0 && oh1Var2.i0 && System.currentTimeMillis() - oh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var2.O0);
                    oh1Var2.N0 = false;
                    oh1Var2.G0 = System.currentTimeMillis();
                    oh1Var2.V.setRelativePosition(oh1Var2.U);
                    oh1Var2.W = true;
                    oh1Var2.D0 = true;
                    oh1Var2.m0 = oh1Var2.l0;
                    oh1Var2.H();
                    break;
                }
                break;
            case 2:
                oh1 oh1Var3 = this.b;
                if (oh1Var3.D0 && System.currentTimeMillis() - oh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var3.O0);
                    oh1Var3.N0 = false;
                    oh1Var3.G0 = System.currentTimeMillis();
                    oh1Var3.U.setRelativePosition(oh1Var3.V);
                    oh1Var3.W = false;
                    oh1Var3.D0 = false;
                    oh1Var3.m0 = oh1Var3.l0;
                    oh1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                oh1 oh1Var4 = this.b;
                if (currentTimeMillis - oh1Var4.G0 >= 500) {
                    oh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = oh1Var4.y0;
                    if (!z10 && oh1Var4.x0) {
                        oh1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                oh1 oh1Var5 = this.b;
                if (currentTimeMillis2 - oh1Var5.G0 >= 500) {
                    oh1Var5.G0 = System.currentTimeMillis();
                    if (oh1Var5.x0) {
                        oh1Var5.m(!oh1Var5.y0);
                        break;
                    }
                }
                break;
            case 5:
                oh1 oh1Var6 = this.b;
                if (oh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    oh1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(oh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
