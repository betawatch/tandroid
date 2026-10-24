package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.S0);
                    oh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                oh1 oh1Var2 = this.b;
                if (oh1Var2.n0 && oh1Var2.m0 && System.currentTimeMillis() - oh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var2.S0);
                    oh1Var2.R0 = false;
                    oh1Var2.K0 = System.currentTimeMillis();
                    oh1Var2.Z.setRelativePosition(oh1Var2.Y);
                    oh1Var2.a0 = true;
                    oh1Var2.H0 = true;
                    oh1Var2.q0 = oh1Var2.p0;
                    oh1Var2.G();
                    break;
                }
                break;
            case 2:
                oh1 oh1Var3 = this.b;
                if (oh1Var3.H0 && System.currentTimeMillis() - oh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var3.S0);
                    oh1Var3.R0 = false;
                    oh1Var3.K0 = System.currentTimeMillis();
                    oh1Var3.Y.setRelativePosition(oh1Var3.Z);
                    oh1Var3.a0 = false;
                    oh1Var3.H0 = false;
                    oh1Var3.q0 = oh1Var3.p0;
                    oh1Var3.G();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                oh1 oh1Var4 = this.b;
                if (currentTimeMillis - oh1Var4.K0 >= 500) {
                    oh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = oh1Var4.C0;
                    if (!z10 && oh1Var4.B0) {
                        oh1Var4.l(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                oh1 oh1Var5 = this.b;
                if (currentTimeMillis2 - oh1Var5.K0 >= 500) {
                    oh1Var5.K0 = System.currentTimeMillis();
                    if (oh1Var5.B0) {
                        oh1Var5.l(!oh1Var5.C0);
                        break;
                    }
                }
                break;
            case 5:
                oh1 oh1Var6 = this.b;
                if (oh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    oh1Var6.A();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(oh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.o();
                break;
        }
    }
}
