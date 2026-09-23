package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ c2(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final y3 y3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                y3.a0(y3Var, tLObject, tL_error);
                                break;
                            default:
                                y3.z0(y3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final y3 y3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                y3.a0(y3Var2, tLObject, tL_error);
                                break;
                            default:
                                y3.z0(y3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
