package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s81 implements u9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public s81(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new r81(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.f.add(0, tL_authorization);
            sessionsActivity.V = 4;
            sessionsActivity.k0(false);
        } else {
            sessionsActivity.e.add(0, tL_authorization);
        }
        sessionsActivity.m0();
        sessionsActivity.a.l();
        sessionsActivity.s.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.u9
    public final boolean e1(String str, m9 m9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new rf0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
