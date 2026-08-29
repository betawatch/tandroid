package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vo implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ xo a;

    public vo(xo xoVar) {
        this.a = xoVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        TLRPC.TL_username tL_username;
        xo xoVar = this.a;
        yo yoVar = xoVar.W2;
        if (!(view instanceof ia) || (tL_username = ((ia) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = yoVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, yoVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            yoVar.a.requestFocus();
            AndroidUtilities.showKeyboard(yoVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getContext(), 0, yoVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new z6(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(18));
        alertDialog$Builder.o();
    }
}
