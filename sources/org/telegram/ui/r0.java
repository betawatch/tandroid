package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class r0 extends w7.j0 {
    public final /* synthetic */ l4 a;

    public r0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // w7.j0
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.kk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(this.a.g0, null));
        }
    }
}
