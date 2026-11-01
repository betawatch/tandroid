package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s51 extends org.telegram.ui.Components.uk0 {
    public int e3;
    public final /* synthetic */ s61 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(s61 s61Var, Context context) {
        super(context, null);
        this.f3 = s61Var;
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        x51 x51Var;
        super.onMeasure(i10, i11);
        if (this.e3 != getMeasuredHeight() && (x51Var = this.f3.W) != null) {
            x51Var.f();
        }
        this.e3 = getMeasuredHeight();
    }
}
