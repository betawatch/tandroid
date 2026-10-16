package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e1(r3 r3Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = r3Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m1(this.b, (org.telegram.ui.ActionBar.a2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m1(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ e1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, long j10, long j11, long j12) {
        this.b = r3Var;
        this.f = a2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
