package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.kh0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class e0 extends qn {
    public boolean Rc;
    public final /* synthetic */ TLRPC.User Sc;
    public final /* synthetic */ long Tc;
    public final /* synthetic */ a1 Uc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Uc = a1Var;
        this.Sc = user;
        this.Tc = j10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Rc) {
            return;
        }
        this.Rc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Sc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Uc.U)), new kh0(this, this.Tc, 2)), R.raw.contact_check).j();
    }
}
