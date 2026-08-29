package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sw0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ tw0 b;

    public sw0(tw0 tw0Var, String str) {
        this.b = tw0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.mc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), resourceProvider);
            ubVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ubVar.b.setText(string);
            b10 = a02.b(ubVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.lb();
        }
        b10.j();
    }
}
