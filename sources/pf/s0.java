package pf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i9) {
        this.a = i9;
        this.b = w0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final w0 w0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: pf.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                w0 w0Var2 = w0Var;
                                w0Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var2.finishFragment();
                                        break;
                                    } else {
                                        ll.p(R.string.UnknownError, oc.a0(w0Var2), null);
                                        break;
                                    }
                                } else {
                                    oc.b0(tL_error2);
                                    break;
                                }
                            default:
                                w0 w0Var3 = w0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var3.finishFragment();
                                        break;
                                    } else {
                                        w0Var3.b.a(0.0f);
                                        ll.p(R.string.UnknownError, oc.a0(w0Var3), null);
                                        break;
                                    }
                                } else {
                                    w0Var3.b.a(0.0f);
                                    oc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final w0 w0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: pf.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w0 w0Var22 = w0Var2;
                                w0Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var22.finishFragment();
                                        break;
                                    } else {
                                        ll.p(R.string.UnknownError, oc.a0(w0Var22), null);
                                        break;
                                    }
                                } else {
                                    oc.b0(tL_error2);
                                    break;
                                }
                            default:
                                w0 w0Var3 = w0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        w0Var3.finishFragment();
                                        break;
                                    } else {
                                        w0Var3.b.a(0.0f);
                                        ll.p(R.string.UnknownError, oc.a0(w0Var3), null);
                                        break;
                                    }
                                } else {
                                    w0Var3.b.a(0.0f);
                                    oc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
