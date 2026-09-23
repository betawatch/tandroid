package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi1 b;

    public /* synthetic */ xh1(mi1 mi1Var, int i10) {
        this.a = i10;
        this.b = mi1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    mi1 mi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
                    mi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                mi1 mi1Var2 = this.b;
                if (mi1Var2.n0 && mi1Var2.m0 && System.currentTimeMillis() - mi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mi1Var2.S0);
                    mi1Var2.R0 = false;
                    mi1Var2.K0 = System.currentTimeMillis();
                    mi1Var2.Z.setRelativePosition(mi1Var2.Y);
                    mi1Var2.a0 = true;
                    mi1Var2.H0 = true;
                    mi1Var2.q0 = mi1Var2.p0;
                    mi1Var2.H();
                    break;
                }
                break;
            case 2:
                mi1 mi1Var3 = this.b;
                if (mi1Var3.H0 && System.currentTimeMillis() - mi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mi1Var3.S0);
                    mi1Var3.R0 = false;
                    mi1Var3.K0 = System.currentTimeMillis();
                    mi1Var3.Y.setRelativePosition(mi1Var3.Z);
                    mi1Var3.a0 = false;
                    mi1Var3.H0 = false;
                    mi1Var3.q0 = mi1Var3.p0;
                    mi1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                mi1 mi1Var4 = this.b;
                if (currentTimeMillis - mi1Var4.K0 >= 500) {
                    mi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = mi1Var4.C0;
                    if (!z10 && mi1Var4.B0) {
                        mi1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                mi1 mi1Var5 = this.b;
                if (currentTimeMillis2 - mi1Var5.K0 >= 500) {
                    mi1Var5.K0 = System.currentTimeMillis();
                    if (mi1Var5.B0) {
                        mi1Var5.m(!mi1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                mi1 mi1Var6 = this.b;
                if (mi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    mi1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(mi1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
