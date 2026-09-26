package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.w1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o extends w1 {
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Context context) {
        super(context);
        this.n = rVar;
    }

    @Override // rg.w1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.b.setPaused(false);
    }

    @Override // rg.w1, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.b.setPaused(true);
    }

    @Override // rg.w1, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
