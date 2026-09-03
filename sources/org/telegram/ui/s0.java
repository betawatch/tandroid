package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s0 extends k7.x5 {
    public final /* synthetic */ n4 a;

    public s0(n4 n4Var) {
        this.a = n4Var;
    }

    @Override // k7.x5
    public final void a(boolean z4) {
        if (z4) {
            this.a.e0.h(false);
        }
    }

    @Override // k7.x5
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.a.d0, null));
        }
    }
}
