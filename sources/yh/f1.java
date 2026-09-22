package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f1(z3 z3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.b = z3Var;
        this.c = j3;
        this.d = j10;
        this.f = callback;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.b, (org.telegram.ui.ActionBar.b2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ f1(z3 z3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.b = z3Var;
        this.f = b2Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
