package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yb0 extends wn {
    public boolean Pc;
    public final /* synthetic */ TLRPC.User Qc;
    public final /* synthetic */ TLRPC.User[] Rc;
    public final /* synthetic */ long Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.Qc = user;
        this.Rc = userArr;
        this.Sc = j3;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Rc[0])), new ai.j(this, this.Sc, 25)), R.raw.contact_check).j();
    }
}
