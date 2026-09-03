package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c0 extends xn {
    public boolean Nc;
    public final /* synthetic */ TLRPC.User Oc;
    public final /* synthetic */ long Pc;
    public final /* synthetic */ a1 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Qc = a1Var;
        this.Oc = user;
        this.Pc = j10;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Qc.R)), new hg.y1(this, this.Pc, 24)), R.raw.contact_check).j();
    }
}
