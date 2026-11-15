package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u21 implements s9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public u21(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public final void M(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                org.telegram.messenger.g0.h3(new t21(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.V = 4;
            sessionsActivity.p0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.r0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.s9
    public final boolean d1(String str, j9 j9Var) {
        this.a = null;
        this.b = null;
        org.telegram.messenger.g0.i3(new q21(this, str, j9Var, 2), 750L);
        return true;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void onDismiss() {
    }
}
