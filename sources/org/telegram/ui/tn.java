package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.ActionBar.u5 {
    public boolean M0;
    public final /* synthetic */ un N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(un unVar, Activity activity) {
        super(activity);
        this.N0 = unVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.u5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int L = org.telegram.messenger.i0.L(4.0f) + getTextWidth();
            un unVar = this.N0;
            unVar.U2 = L;
            NumberTextView numberTextView = unVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
