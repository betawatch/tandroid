package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x6 extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final pg.s0 b;

    public x6(Context context, pg.s0 s0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = s0Var;
        addView(s0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pg.s0 s0Var = this.b;
        s0Var.measure(i10, i11);
        int measuredWidth = (s0Var.getMeasuredWidth() - s0Var.getPaddingLeft()) - s0Var.getPaddingRight();
        int measuredHeight = (s0Var.getMeasuredHeight() - s0Var.getPaddingTop()) - s0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        s0Var.setPivotX(s0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        s0Var.setPivotY(s0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        s0Var.setTranslationX((f13 / 2.0f) - (f10 + s0Var.getPaddingLeft()));
        s0Var.setTranslationY((f14 / 2.0f) - (f12 + s0Var.getPaddingTop()));
        s0Var.setScaleX(min);
        s0Var.setScaleY(min);
    }
}
