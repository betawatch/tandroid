package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.ActionBar.k5 {
    public boolean M0;
    public final /* synthetic */ an N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(an anVar, Activity activity) {
        super(activity);
        this.N0 = anVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void d(int i7) {
        super.d(i7);
        if (this.M0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            an anVar = this.N0;
            anVar.U2 = L;
            NumberTextView numberTextView = anVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
