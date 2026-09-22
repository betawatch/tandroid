package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ c2(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final z3 z3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                z3.a0(z3Var, tLObject, tL_error);
                                break;
                            default:
                                z3.z0(z3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final z3 z3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                z3.a0(z3Var2, tLObject, tL_error);
                                break;
                            default:
                                z3.z0(z3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
