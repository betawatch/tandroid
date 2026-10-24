package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.oh0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f0 extends sn {
    public boolean ed;
    public final /* synthetic */ TLRPC.User fd;
    public final /* synthetic */ long gd;
    public final /* synthetic */ b1 hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b1 b1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.hd = b1Var;
        this.fd = user;
        this.gd = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ed) {
            return;
        }
        this.ed = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.hd.U)), new oh0(this, this.gd, 2)), R.raw.contact_check).j();
    }
}
