package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.lh0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e0 extends un {
    public boolean kd;
    public final /* synthetic */ TLRPC.User ld;
    public final /* synthetic */ long md;
    public final /* synthetic */ a1 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.nd = a1Var;
        this.ld = user;
        this.md = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.nd.U)), new lh0(this, this.md, 2)), R.raw.contact_check).j();
    }
}
