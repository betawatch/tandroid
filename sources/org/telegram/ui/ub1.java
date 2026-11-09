package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic1 b;

    public /* synthetic */ ub1(ic1 ic1Var, int i7) {
        this.a = i7;
        this.b = ic1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ic1 ic1Var = this.b;
                    org.telegram.messenger.g0.r(ic1Var.R0);
                    ic1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                ic1 ic1Var2 = this.b;
                if (ic1Var2.m0 && ic1Var2.l0 && System.currentTimeMillis() - ic1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(ic1Var2.R0);
                    ic1Var2.Q0 = false;
                    ic1Var2.J0 = System.currentTimeMillis();
                    ic1Var2.Z.setRelativePosition(ic1Var2.Y);
                    ic1Var2.a0 = true;
                    ic1Var2.G0 = true;
                    ic1Var2.p0 = ic1Var2.o0;
                    ic1Var2.y();
                    break;
                }
                break;
            case 2:
                ic1 ic1Var3 = this.b;
                if (ic1Var3.G0 && System.currentTimeMillis() - ic1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(ic1Var3.R0);
                    ic1Var3.Q0 = false;
                    ic1Var3.J0 = System.currentTimeMillis();
                    ic1Var3.Y.setRelativePosition(ic1Var3.Z);
                    ic1Var3.a0 = false;
                    ic1Var3.G0 = false;
                    ic1Var3.p0 = ic1Var3.o0;
                    ic1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ic1 ic1Var4 = this.b;
                if (currentTimeMillis - ic1Var4.J0 >= 500) {
                    ic1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = ic1Var4.B0;
                    if (!z9 && ic1Var4.A0) {
                        ic1Var4.d(!z9);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ic1 ic1Var5 = this.b;
                if (currentTimeMillis2 - ic1Var5.J0 >= 500) {
                    ic1Var5.J0 = System.currentTimeMillis();
                    if (ic1Var5.A0) {
                        ic1Var5.d(!ic1Var5.B0);
                        break;
                    }
                }
                break;
            case 5:
                ic1 ic1Var6 = this.b;
                if (ic1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ic1Var6.s();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ic1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.g();
                break;
        }
    }
}
