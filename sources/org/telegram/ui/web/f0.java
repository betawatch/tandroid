package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f0 extends fo {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ c1 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c1 c1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Tc = c1Var;
        this.Rc = user;
        this.Sc = j10;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        zc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new e0(this, this.Sc, 0)), R.raw.contact_check).j();
    }
}
