package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class so implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ uo a;

    public so(uo uoVar) {
        this.a = uoVar;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        TLRPC.TL_username tL_username;
        uo uoVar = this.a;
        vo voVar = uoVar.W2;
        if (!(view instanceof ja) || (tL_username = ((ja) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = voVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, voVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            voVar.a.requestFocus();
            AndroidUtilities.showKeyboard(voVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getContext(), 0, voVar.getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.P = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(24));
        alertDialog$Builder.o();
    }
}
