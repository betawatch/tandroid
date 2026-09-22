package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f0 extends bo {
    public boolean Pc;
    public final /* synthetic */ TLRPC.User Qc;
    public final /* synthetic */ long Rc;
    public final /* synthetic */ d1 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d1 d1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Sc = d1Var;
        this.Qc = user;
        this.Rc = j3;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc.U)), new ai.j(this, this.Rc, 28)), R.raw.contact_check).j();
    }
}
