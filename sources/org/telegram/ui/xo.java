package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xo implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ zo a;

    public xo(zo zoVar) {
        this.a = zoVar;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        TLRPC.TL_username tL_username;
        zo zoVar = this.a;
        ap apVar = zoVar.i3;
        if (!(view instanceof qa) || (tL_username = ((qa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            if (apVar.fragmentView instanceof ScrollView) {
                apVar.a.smoothScrollTo(0, apVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            apVar.b.requestFocus();
            AndroidUtilities.showKeyboard(apVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zoVar.getContext(), 0, apVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new e7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cg(2));
        alertDialog$Builder.p();
    }
}
