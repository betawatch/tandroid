package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.q1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o extends q1 {
    public final /* synthetic */ r r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Context context) {
        super(context);
        this.r = rVar;
    }

    @Override // ug.q1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override // ug.q1, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override // ug.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
