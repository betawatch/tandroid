package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ y1(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final r3 r3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r3.b0(r3Var, tLObject, tL_error);
                                break;
                            default:
                                r3.A0(r3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final r3 r3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r3.b0(r3Var2, tLObject, tL_error);
                                break;
                            default:
                                r3.A0(r3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
