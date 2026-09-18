package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ d2(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final a4 a4Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                a4.a0(a4Var, tLObject, tL_error);
                                break;
                            default:
                                a4.z0(a4Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final a4 a4Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                a4.a0(a4Var2, tLObject, tL_error);
                                break;
                            default:
                                a4.z0(a4Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
