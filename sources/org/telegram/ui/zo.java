package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zo implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ bp a;

    public zo(bp bpVar) {
        this.a = bpVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        TLRPC.TL_username tL_username;
        bp bpVar = this.a;
        cp cpVar = bpVar.i3;
        if (!(view instanceof qa) || (tL_username = ((qa) view).v) == null) {
            return;
        }
        if (tL_username.editable) {
            if (cpVar.fragmentView instanceof ScrollView) {
                cpVar.a.smoothScrollTo(0, cpVar.y.getTop() - AndroidUtilities.dp(128.0f));
            }
            cpVar.b.requestFocus();
            AndroidUtilities.showKeyboard(cpVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bpVar.getContext(), 0, cpVar.getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
        alertDialog$Builder.a.T = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
        alertDialog$Builder.k(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new e7(this, tL_username, view, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cg(2));
        alertDialog$Builder.p();
    }
}
