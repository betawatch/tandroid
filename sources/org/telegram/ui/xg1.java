package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ xg1(mh1 mh1Var, int i9) {
        this.a = i9;
        this.b = mh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    mh1 mh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
                    mh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    break;
                }
                break;
            case 1:
                mh1 mh1Var2 = this.b;
                if (mh1Var2.j0 && mh1Var2.i0 && System.currentTimeMillis() - mh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mh1Var2.O0);
                    mh1Var2.N0 = false;
                    mh1Var2.G0 = System.currentTimeMillis();
                    mh1Var2.V.setRelativePosition(mh1Var2.U);
                    mh1Var2.W = true;
                    mh1Var2.D0 = true;
                    mh1Var2.m0 = mh1Var2.l0;
                    mh1Var2.H();
                    break;
                }
                break;
            case 2:
                mh1 mh1Var3 = this.b;
                if (mh1Var3.D0 && System.currentTimeMillis() - mh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mh1Var3.O0);
                    mh1Var3.N0 = false;
                    mh1Var3.G0 = System.currentTimeMillis();
                    mh1Var3.U.setRelativePosition(mh1Var3.V);
                    mh1Var3.W = false;
                    mh1Var3.D0 = false;
                    mh1Var3.m0 = mh1Var3.l0;
                    mh1Var3.H();
                    break;
                }
                break;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                mh1 mh1Var4 = this.b;
                if (currentTimeMillis - mh1Var4.G0 >= 500) {
                    mh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = mh1Var4.y0;
                    if (!z10 && mh1Var4.x0) {
                        mh1Var4.m(!z10);
                        break;
                    }
                }
                break;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                mh1 mh1Var5 = this.b;
                if (currentTimeMillis2 - mh1Var5.G0 >= 500) {
                    mh1Var5.G0 = System.currentTimeMillis();
                    if (mh1Var5.x0) {
                        mh1Var5.m(!mh1Var5.y0);
                        break;
                    }
                }
                break;
            case 5:
                mh1 mh1Var6 = this.b;
                if (mh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    mh1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(mh1Var6.b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
