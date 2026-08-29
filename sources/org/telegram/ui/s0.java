package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s0 extends i7.b6 {
    public final /* synthetic */ m4 a;

    public s0(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // i7.b6
    public final void a(boolean z10) {
        if (z10) {
            this.a.d0.h(false);
        }
    }

    @Override // i7.b6
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(this.a.c0, null));
        }
    }
}
