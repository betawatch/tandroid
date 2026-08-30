package uf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ q0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final u0 u0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: uf.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                u0 u0Var2 = u0Var;
                                u0Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        u0Var2.finishFragment();
                                        break;
                                    } else {
                                        y3.s(R.string.UnknownError, qc.a0(u0Var2), null);
                                        break;
                                    }
                                } else {
                                    qc.b0(tL_error2);
                                    break;
                                }
                            default:
                                u0 u0Var3 = u0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        u0Var3.finishFragment();
                                        break;
                                    } else {
                                        u0Var3.b.a(0.0f);
                                        y3.s(R.string.UnknownError, qc.a0(u0Var3), null);
                                        break;
                                    }
                                } else {
                                    u0Var3.b.a(0.0f);
                                    qc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final u0 u0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: uf.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                u0 u0Var22 = u0Var2;
                                u0Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        u0Var22.finishFragment();
                                        break;
                                    } else {
                                        y3.s(R.string.UnknownError, qc.a0(u0Var22), null);
                                        break;
                                    }
                                } else {
                                    qc.b0(tL_error2);
                                    break;
                                }
                            default:
                                u0 u0Var3 = u0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        u0Var3.finishFragment();
                                        break;
                                    } else {
                                        u0Var3.b.a(0.0f);
                                        y3.s(R.string.UnknownError, qc.a0(u0Var3), null);
                                        break;
                                    }
                                } else {
                                    u0Var3.b.a(0.0f);
                                    qc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
