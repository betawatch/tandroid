package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s0 extends h7.j0 {
    public final /* synthetic */ m4 a;

    public s0(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // h7.j0
    public final void a(boolean z10) {
        if (z10) {
            this.a.d0.h(false);
        }
    }

    @Override // h7.j0
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(this.a.c0, null));
        }
    }
}
