package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tw0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ uw0 b;

    public tw0(uw0 uw0Var, String str) {
        this.b = uw0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.ec b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(a02.W(), resourceProvider);
            mbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            mbVar.b.setText(string);
            b10 = a02.b(mbVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.eb();
        }
        b10.j();
    }
}
