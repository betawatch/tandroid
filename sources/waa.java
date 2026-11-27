// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class waa implements ka1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public waa(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // ka1
    public final boolean B(String str, da1 da1Var) {
        this.a = null;
        this.b = null;
        hl.d3(new jr9((Object) this, (Object) str, (Object) da1Var, (byte) 12), 750L);
        return true;
    }

    @Override // ka1
    public final String I() {
        return null;
    }

    @Override // ka1
    public final void q(String str) {
        TLObject tLObject = this.a;
        byte b = 0;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                hl.c3(new vaa(this, b));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.V = 4;
            sessionsActivity.o0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.q0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // ka1
    public final void onDismiss() {
    }

    @Override // ka1
    public final void p0(fi7 fi7Var) {
    }
}
