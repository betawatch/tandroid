package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c0 extends qn {
    public boolean Mc;
    public final /* synthetic */ TLRPC.User Nc;
    public final /* synthetic */ long Oc;
    public final /* synthetic */ y0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y0 y0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Pc = y0Var;
        this.Nc = user;
        this.Oc = j10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        oc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc.Q)), new b0(this, this.Oc, 0)), R.raw.contact_check).j();
    }
}
