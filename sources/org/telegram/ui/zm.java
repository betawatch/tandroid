package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.ActionBar.j5 {
    public boolean N0;
    public final /* synthetic */ an O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(an anVar, Activity activity) {
        super(activity);
        this.O0 = anVar;
        this.N0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i7) {
        super.d(i7);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            an anVar = this.O0;
            anVar.V2 = L;
            NumberTextView numberTextView = anVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
