package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ ay0 b;

    public zx0(ay0 ay0Var, String str) {
        this.b = ay0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.oc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.b.d.getResourceProvider();
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
