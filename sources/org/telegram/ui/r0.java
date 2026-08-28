package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r0 extends g7.a6 {
    public final /* synthetic */ l4 a;

    public r0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // g7.a6
    public final void a(boolean z10) {
        if (z10) {
            this.a.d0.h(false);
        }
    }

    @Override // g7.a6
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(this.a.c0, null));
        }
    }
}
