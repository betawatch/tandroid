package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
