package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uo implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ wo a;

    public uo(wo woVar) {
        this.a = woVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        wo woVar = this.a;
        xo xoVar = woVar.W2;
        if (!(view instanceof ka) || (tL_username = ((ka) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = xoVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, xoVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            xoVar.a.requestFocus();
            AndroidUtilities.showKeyboard(xoVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getContext(), 0, xoVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ng.a(29));
        alertDialog$Builder.o();
    }
}
