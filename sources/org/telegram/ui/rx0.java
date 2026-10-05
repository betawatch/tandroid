package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ sx0 b;

    public rx0(sx0 sx0Var, String str) {
        this.b = sx0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.rc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a02.W(), resourceProvider);
            zbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            zbVar.b.setText(string);
            b10 = a02.b(zbVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.qb();
        }
        b10.j();
    }
}
