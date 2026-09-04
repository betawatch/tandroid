package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ b2(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final w3 w3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w3.a0(w3Var, tLObject, tL_error);
                                break;
                            default:
                                w3.z0(w3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final w3 w3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w3.a0(w3Var2, tLObject, tL_error);
                                break;
                            default:
                                w3.z0(w3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
