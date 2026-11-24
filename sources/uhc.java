// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uhc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iic b;

    public /* synthetic */ uhc(iic iicVar, byte b) {
        this.a = b;
        this.b = iicVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        byte b = this.a;
        int i = 1;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                if (iicVar.n0 && iicVar.m0 && System.currentTimeMillis() - iicVar.K0 > 500) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    iicVar.K0 = System.currentTimeMillis();
                    iicVar.a0.setRelativePosition(iicVar.Z);
                    iicVar.b0 = true;
                    iicVar.H0 = true;
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    break;
                }
                break;
            case 2:
                if (iicVar.H0 && System.currentTimeMillis() - iicVar.K0 > 500) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    iicVar.K0 = System.currentTimeMillis();
                    iicVar.Z.setRelativePosition(iicVar.a0);
                    iicVar.b0 = false;
                    iicVar.H0 = false;
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    break;
                }
                break;
            case 3:
                if (System.currentTimeMillis() - iicVar.K0 >= 500) {
                    iicVar.K0 = System.currentTimeMillis();
                    boolean z = iicVar.C0;
                    if (!z && iicVar.B0) {
                        iicVar.c(!z);
                        break;
                    }
                }
                break;
            case 4:
                if (System.currentTimeMillis() - iicVar.K0 >= 500) {
                    iicVar.K0 = System.currentTimeMillis();
                    if (iicVar.B0) {
                        iicVar.c(!iicVar.C0);
                        break;
                    }
                }
                break;
            case 5:
                if (iicVar.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    iicVar.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i = 0;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(iicVar.b, false, Integer.valueOf(i));
                    break;
                }
                break;
            default:
                iicVar.g();
                break;
        }
    }
}
