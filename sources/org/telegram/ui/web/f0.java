package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class f0 extends yn {
    public boolean Kc;
    public final /* synthetic */ TLRPC.User Lc;
    public final /* synthetic */ long Mc;
    public final /* synthetic */ c1 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c1 c1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Nc = c1Var;
        this.Lc = user;
        this.Mc = j3;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Kc) {
            return;
        }
        this.Kc = true;
        yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Nc.U)), new ai.j(this, this.Mc, 28)), R.raw.contact_check).j();
    }
}
