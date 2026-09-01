package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x71 extends UndoView {
    public final /* synthetic */ SessionsActivity c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.c0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void e(int i10, boolean z4) {
        int i11;
        if (!z4 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.p2) this.c0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new tb0(19, this, tL_authorization));
        }
        super.e(i10, z4);
    }
}
