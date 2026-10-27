package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.nh0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e0 extends wn {
    public boolean od;
    public final /* synthetic */ TLRPC.User pd;
    public final /* synthetic */ long qd;
    public final /* synthetic */ a1 rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.rd = a1Var;
        this.pd = user;
        this.qd = j10;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.od) {
            return;
        }
        this.od = true;
        wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.pd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.rd.U)), new nh0(this, this.qd, 2)), R.raw.contact_check).j();
    }
}
