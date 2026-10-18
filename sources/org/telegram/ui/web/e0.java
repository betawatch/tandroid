package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.mh0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e0 extends sn {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ a1 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Tc = a1Var;
        this.Rc = user;
        this.Sc = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new mh0(this, this.Sc, 2)), R.raw.contact_check).j();
    }
}
