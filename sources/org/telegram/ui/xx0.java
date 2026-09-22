package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.Components.oc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.e6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), resourceProvider);
            wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            wbVar.b.setText(string);
            b10 = a02.b(wbVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.nb();
        }
        b10.j();
    }
}
