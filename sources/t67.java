// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t67 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z67 b;

    public /* synthetic */ t67(z67 z67Var, byte b) {
        this.a = b;
        this.b = z67Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final z67 z67Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: s67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        z67 z67Var2 = z67Var;
                        switch (b3) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: s67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        z67 z67Var2 = z67Var;
                        switch (b32) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                hl.c3(new Runnable() { // from class: s67
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        z67 z67Var2 = z67Var;
                        switch (b32) {
                            case 0:
                                z67Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                z67Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                z67Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
