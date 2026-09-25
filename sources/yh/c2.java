package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ c2(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final x3 x3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                x3.a0(x3Var, tLObject, tL_error);
                                break;
                            default:
                                x3.z0(x3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final x3 x3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                x3.a0(x3Var2, tLObject, tL_error);
                                break;
                            default:
                                x3.z0(x3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
