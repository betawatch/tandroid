package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class to implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ vo a;

    public to(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        vo voVar = this.a;
        wo woVar = voVar.Y2;
        if (!(view instanceof pa) || (tL_username = ((pa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            View view2 = woVar.fragmentView;
            if (view2 instanceof ScrollView) {
                ((ScrollView) view2).smoothScrollTo(0, woVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            woVar.a.requestFocus();
            AndroidUtilities.showKeyboard(woVar.a);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getContext(), 0, woVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new e7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(24));
        alertDialog$Builder.o();
    }
}
