package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        org.telegram.ui.Components.gc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.b6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), resourceProvider);
            obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            obVar.b.setText(string);
            b10 = a02.b(obVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.gb();
        }
        b10.j();
    }
}
