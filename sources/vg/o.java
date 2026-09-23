package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.v1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o extends v1 {
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Context context) {
        super(context);
        this.n = rVar;
    }

    @Override // rg.v1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.b.setPaused(false);
    }

    @Override // rg.v1, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.b.setPaused(true);
    }

    @Override // rg.v1, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
