package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class e0 extends zn {
    public boolean Nc;
    public final /* synthetic */ TLRPC.User Oc;
    public final /* synthetic */ long Pc;
    public final /* synthetic */ c1 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c1 c1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Qc = c1Var;
        this.Oc = user;
        this.Pc = j10;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Qc.R)), new gg.y1(this, this.Pc, 24)), R.raw.contact_check).j();
    }
}
