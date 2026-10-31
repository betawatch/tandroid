package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final jg.y0 b;

    public r6(Context context, jg.y0 y0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = y0Var;
        addView(y0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jg.y0 y0Var = this.b;
        y0Var.measure(i10, i11);
        int measuredWidth = (y0Var.getMeasuredWidth() - y0Var.getPaddingLeft()) - y0Var.getPaddingRight();
        int measuredHeight = (y0Var.getMeasuredHeight() - y0Var.getPaddingTop()) - y0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        y0Var.setPivotX(y0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        y0Var.setPivotY(y0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        y0Var.setTranslationX((f13 / 2.0f) - (f10 + y0Var.getPaddingLeft()));
        y0Var.setTranslationY((f14 / 2.0f) - (f12 + y0Var.getPaddingTop()));
        y0Var.setScaleX(min);
        y0Var.setScaleY(min);
    }
}
