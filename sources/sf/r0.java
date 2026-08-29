package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ r0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final v0 v0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: sf.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v0 v0Var2 = v0Var;
                                v0Var2.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        v0Var2.finishFragment();
                                        break;
                                    } else {
                                        x3.s(R.string.UnknownError, tc.a0(v0Var2), null);
                                        break;
                                    }
                                } else {
                                    tc.b0(tL_error2);
                                    break;
                                }
                            default:
                                v0 v0Var3 = v0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        v0Var3.finishFragment();
                                        break;
                                    } else {
                                        v0Var3.b.a(0.0f);
                                        x3.s(R.string.UnknownError, tc.a0(v0Var3), null);
                                        break;
                                    }
                                } else {
                                    v0Var3.b.a(0.0f);
                                    tc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final v0 v0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: sf.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                v0 v0Var22 = v0Var2;
                                v0Var22.b.a(0.0f);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        v0Var22.finishFragment();
                                        break;
                                    } else {
                                        x3.s(R.string.UnknownError, tc.a0(v0Var22), null);
                                        break;
                                    }
                                } else {
                                    tc.b0(tL_error2);
                                    break;
                                }
                            default:
                                v0 v0Var3 = v0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                                        v0Var3.finishFragment();
                                        break;
                                    } else {
                                        v0Var3.b.a(0.0f);
                                        x3.s(R.string.UnknownError, tc.a0(v0Var3), null);
                                        break;
                                    }
                                } else {
                                    v0Var3.b.a(0.0f);
                                    tc.b0(tL_error3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
