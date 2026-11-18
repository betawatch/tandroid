package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v21 extends UndoView {
    public final /* synthetic */ SessionsActivity k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.k0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void d(int i7, boolean z10) {
        int i10;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i10 = ((org.telegram.ui.ActionBar.h2) this.k0).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new e00(27, this, tL_authorization));
        }
        super.d(i7, z10);
    }
}
