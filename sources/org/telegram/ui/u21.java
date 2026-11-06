package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u21 extends UndoView {
    public final /* synthetic */ SessionsActivity j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.j0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void d(int i7, boolean z9) {
        int i10;
        if (!z9 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i10 = ((org.telegram.ui.ActionBar.f2) this.j0).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new h50(25, this, tL_authorization));
        }
        super.d(i7, z9);
    }
}
