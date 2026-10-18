package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.lh0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class f0 extends sn {
    public boolean Rc;
    public final /* synthetic */ TLRPC.User Sc;
    public final /* synthetic */ long Tc;
    public final /* synthetic */ b1 Uc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b1 b1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Uc = b1Var;
        this.Sc = user;
        this.Tc = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Rc) {
            return;
        }
        this.Rc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Sc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Uc.U)), new lh0(this, this.Tc, 2)), R.raw.contact_check).j();
    }
}
