package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e0 extends xn {
    public boolean Pc;
    public final /* synthetic */ TLRPC.User Qc;
    public final /* synthetic */ long Rc;
    public final /* synthetic */ b1 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b1 b1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Sc = b1Var;
        this.Qc = user;
        this.Rc = j3;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc.U)), new ai.j(this, this.Rc, 28)), R.raw.contact_check).j();
    }
}
