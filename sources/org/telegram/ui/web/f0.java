package org.telegram.ui.web;

import android.os.Bundle;
import bi.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f0 extends eo {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ c1 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c1 c1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Tc = c1Var;
        this.Rc = user;
        this.Sc = j3;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        wc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new va(this, this.Sc, 23)), R.raw.contact_check).j();
    }
}
