package sg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final /* synthetic */ b0 d;

    public x(b0 b0Var) {
        this.d = b0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.i0.T1(b0Var.e, org.telegram.messenger.i0.L(8.0f), b0Var.j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = b0Var.f;
        float f7 = b0Var.j;
        RectF rectF3 = this.c;
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
