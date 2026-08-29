package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d0 extends tn {
    public boolean Mc;
    public final /* synthetic */ TLRPC.User Nc;
    public final /* synthetic */ long Oc;
    public final /* synthetic */ z0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Pc = z0Var;
        this.Nc = user;
        this.Oc = j10;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        tc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc.Q)), new eg.z1(this, this.Oc, 28)), R.raw.contact_check).j();
    }
}
