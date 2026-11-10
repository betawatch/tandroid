package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc1 b;

    public /* synthetic */ wb1(jc1 jc1Var, int i7) {
        this.a = i7;
        this.b = jc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    jc1 jc1Var = this.b;
                    org.telegram.messenger.g0.r(jc1Var.R0);
                    jc1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                jc1 jc1Var2 = this.b;
                if (jc1Var2.m0 && jc1Var2.l0 && System.currentTimeMillis() - jc1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(jc1Var2.R0);
                    jc1Var2.Q0 = false;
                    jc1Var2.J0 = System.currentTimeMillis();
                    jc1Var2.Z.setRelativePosition(jc1Var2.Y);
                    jc1Var2.a0 = true;
                    jc1Var2.G0 = true;
                    jc1Var2.p0 = jc1Var2.o0;
                    jc1Var2.y();
                    break;
                }
                break;
            case 2:
                jc1 jc1Var3 = this.b;
                if (jc1Var3.G0 && System.currentTimeMillis() - jc1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(jc1Var3.R0);
                    jc1Var3.Q0 = false;
                    jc1Var3.J0 = System.currentTimeMillis();
                    jc1Var3.Y.setRelativePosition(jc1Var3.Z);
                    jc1Var3.a0 = false;
                    jc1Var3.G0 = false;
                    jc1Var3.p0 = jc1Var3.o0;
                    jc1Var3.y();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                jc1 jc1Var4 = this.b;
                if (currentTimeMillis - jc1Var4.J0 >= 500) {
                    jc1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = jc1Var4.B0;
                    if (!z9 && jc1Var4.A0) {
                        jc1Var4.d(!z9);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                jc1 jc1Var5 = this.b;
                if (currentTimeMillis2 - jc1Var5.J0 >= 500) {
                    jc1Var5.J0 = System.currentTimeMillis();
                    if (jc1Var5.A0) {
                        jc1Var5.d(!jc1Var5.B0);
                        break;
                    }
                }
                break;
            case 5:
                jc1 jc1Var6 = this.b;
                if (jc1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    jc1Var6.s();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(jc1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.g();
                break;
        }
    }
}
