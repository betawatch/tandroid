package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ zx0 b;

    public yx0(zx0 zx0Var, String str) {
        this.b = zx0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.pc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), resourceProvider);
            xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            xbVar.b.setText(string);
            b10 = a02.b(xbVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.ob();
        }
        b10.j();
    }
}
