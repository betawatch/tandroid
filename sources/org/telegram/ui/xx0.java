package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ yx0 b;

    public xx0(yx0 yx0Var, String str) {
        this.b = yx0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.tc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.e6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), resourceProvider);
            bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            bcVar.b.setText(string);
            b10 = a02.b(bcVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.sb();
        }
        b10.j();
    }
}
