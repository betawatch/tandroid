package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class f0 extends zn {
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

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc.U)), new ai.j(this, this.Rc, 28)), R.raw.contact_check).j();
    }
}
