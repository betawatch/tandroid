package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vm extends org.telegram.ui.ActionBar.k5 {
    public boolean N0;
    public final /* synthetic */ wm O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(wm wmVar, Activity activity) {
        super(activity);
        this.O0 = wmVar;
        this.N0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void d(int i3) {
        super.d(i3);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            wm wmVar = this.O0;
            wmVar.V2 = L;
            NumberTextView numberTextView = wmVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
