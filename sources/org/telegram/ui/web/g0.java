package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class g0 extends co {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ d1 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d1 d1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Tc = d1Var;
        this.Rc = user;
        this.Sc = j3;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new bi.g(this, this.Sc, 28)), R.raw.contact_check).j();
    }
}
