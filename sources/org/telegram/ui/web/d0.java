package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d0 extends rn {
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

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        mc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc.Q)), new c0(this, this.Oc, 0)), R.raw.contact_check).j();
    }
}
