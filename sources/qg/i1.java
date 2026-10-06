package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class i1 extends zl0 {
    public static final Paint j3;
    public static final Paint k3;
    public static final Path l3;
    public static final Paint m3;
    public final Paint e3;
    public final Paint f3;
    public int g3;
    public pg.u0 h3;
    public q0.a i3;

    static {
        Paint paint = new Paint(1);
        j3 = paint;
        Paint paint2 = new Paint(1);
        k3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        l3 = new Path();
        m3 = new Paint(1);
    }

    public i1(Context context) {
        super(context, null);
        this.e3 = new Paint(1);
        Paint paint = new Paint(1);
        this.f3 = paint;
        this.g3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new s4.s(7));
        setAdapter(new g1(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ai.g(this, 15));
    }

    public static void x1(Canvas canvas, RectF rectF, int i10) {
        float f7 = rectF.left;
        while (f7 <= rectF.right) {
            float f10 = rectF.top;
            while (f10 <= rectF.bottom) {
                float f11 = i10;
                float f12 = f7 + f11;
                float f13 = f10 + f11;
                Paint paint = j3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f7, f10, f12, f13, paint);
                float f14 = i10 * 2;
                float f15 = f7 + f14;
                Paint paint2 = k3;
                float f16 = f10;
                canvas2.drawRect(f12, f16, f15, f13, paint2);
                float f17 = f16 + f14;
                canvas2.drawRect(f12, f13, f15, f17, paint);
                canvas2.drawRect(f7, f13, f12, f17, paint2);
                canvas = canvas2;
                f10 = f17;
            }
            f7 += i10 * 2;
            canvas = canvas;
        }
    }

    public static void y1(float f7, float f10, float f11, int i10, Canvas canvas) {
        Paint paint = m3;
        paint.setColor(i10);
        if (paint.getAlpha() == 255) {
            canvas.drawCircle(f7, f10, f11, paint);
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
        paint.setAlpha(255);
        canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
        Path path = l3;
        path.rewind();
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) hg.c.e(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) hg.c.e(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
        path.addArc(rectF, -45.0f, 180.0f);
        canvas.save();
        canvas.clipPath(path);
        x1(canvas, rectF, AndroidUtilities.dp(4.0f));
        canvas.restore();
        paint.setColor(i10);
        canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
    }

    public int getSelectedColorIndex() {
        return this.g3;
    }

    public void setColorListener(q0.a aVar) {
        this.i3 = aVar;
    }

    public void setColorPalette(pg.u0 u0Var) {
        this.h3 = u0Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.g3 = i10;
        getAdapter().l();
    }

    public final void z1(float f7, boolean z10) {
        float interpolation = z10 ? tr.g.getInterpolation(f7) : tr.i.getInterpolation(f7);
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i10 == 0) {
                childAt.setAlpha(interpolation == 1.0f ? 1.0f : 0.0f);
            } else {
                float f10 = i10 * childCount;
                float min = Math.min(interpolation, f10) / f10;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }
}
