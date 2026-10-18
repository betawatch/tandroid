package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vo implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ xo a;

    public vo(xo xoVar) {
        this.a = xoVar;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        xo xoVar = this.a;
        yo yoVar = xoVar.Y2;
        if (!(view instanceof ra) || (tL_username = ((ra) view).v) == null) {
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
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new e7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(24));
        alertDialog$Builder.o();
    }
}
