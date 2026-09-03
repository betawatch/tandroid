package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wb0 extends xn {
    public boolean Nc;
    public final /* synthetic */ TLRPC.User Oc;
    public final /* synthetic */ TLRPC.User[] Pc;
    public final /* synthetic */ long Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.Oc = user;
        this.Pc = userArr;
        this.Qc = j10;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        org.telegram.ui.Components.qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc[0])), new hg.y1(this, this.Qc, 21)), R.raw.contact_check).j();
    }
}
