package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u7 extends View {
    public final /* synthetic */ int a = 3;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.b = strArr;
        this.c = drawable;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.f31 f31Var = (org.telegram.ui.Components.f31) this.d;
                org.telegram.ui.Components.n6 n6Var = f31Var.e;
                float g10 = n6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), n6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    float dp = AndroidUtilities.dp(8.33f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.b;
                    h6Var.setColor(h6Var.b.a(org.telegram.ui.ActionBar.j6.v0(f31Var.I, h6Var.a), false));
                    textColor = f31Var.getTextColor();
                    h6Var.setColor(i0.a.d(f31Var.F, h6Var.getColor(), textColor));
                    h6Var.setAlpha((int) (h6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, dp, dp2, h6Var);
                    n6Var.m(rectF);
                    n6Var.w = (int) (g10 * 255.0f);
                    n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.c));
                    n6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                int[] iArr = (int[]) this.b;
                t50 t50Var = (t50) this.c;
                s50 s50Var = (s50) this.d;
                if (s50Var.h <= 0.0f || s50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    s50Var.f.reset();
                    float width = getWidth() / s50Var.c.getWidth();
                    s50Var.f.postScale(width, width);
                    s50Var.e.setLocalMatrix(s50Var.f);
                    s50Var.d.setAlpha((int) (s50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s50Var.d);
                }
                if (t50Var != null) {
                    if (!t50Var.isAttachedToWindow() || t50Var.getAlpha() <= 0.5f) {
                        s50Var.dismiss();
                    } else {
                        t50Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - t50Var.getScaleX()) * t50Var.getMeasuredWidth()), iArr[1] - ((1.0f - t50Var.getScaleY()) * t50Var.getMeasuredHeight()));
                    if (((u50) t50Var.b).a(canvas2, t50Var.getMeasuredWidth(), s50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    break;
                }
                break;
            case 5:
                super.dispatchDraw(canvas);
                int dp3 = AndroidUtilities.dp(48.0f);
                e70 e70Var = (e70) this.d;
                int i10 = dp3 + ((int) e70Var.b.e);
                Paint paint = (Paint) this.c;
                paint.setColor(e70Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8));
                RectF rectF2 = (RectF) this.b;
                float measuredWidth = getMeasuredWidth();
                lVar = ((org.telegram.ui.ActionBar.p2) e70Var).actionBar;
                rectF2.set(0.0f, 0.0f, measuredWidth, lVar.getMeasuredHeight() + i10);
                e70.a0(e70Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.zf0 zf0Var;
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((h8) this.d).f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.Components.og0 og0Var = (org.telegram.ui.Components.og0) this.d;
                if (!og0Var.n || ((zf0Var = og0Var.r) != null && zf0Var.x)) {
                    int width = getWidth();
                    int dp = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp) - dp;
                    int i11 = dp + ((int) (og0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = og0Var.a0;
                    if (f11 != 0.0f) {
                        float f12 = dp;
                        f7 = height;
                        canvas.drawLine(f12, f7, (f10 * f11) + f12, height, (Paint) this.c);
                    } else {
                        f7 = height;
                    }
                    canvas.drawLine(dp, f7, i11, f7, (Paint) this.b);
                    break;
                }
                break;
            case 2:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                break;
            case 3:
                super.onDraw(canvas);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + n6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                bh.d dVar = (bh.d) this.c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((bh.d) this.c).draw(canvas);
                }
                n6Var.draw(canvas);
                break;
            case 6:
                RectF rectF = (RectF) this.b;
                id0 id0Var = (id0) this.d;
                Drawable drawable2 = id0Var.s;
                Rect rect = (Rect) this.c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                id0Var.s.draw(canvas);
                int i13 = id0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp2) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp2) / 2, AndroidUtilities.dp(4.0f) + r5);
                    int themedColor = id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                    break;
                }
                break;
            case 7:
                float dp3 = AndroidUtilities.dp(10.0f);
                float f13 = dp3 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f14 = dp3 + measuredWidth2;
                rectF2.set(dp3, dp3, f14, f14);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f15 = measuredWidth2 / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp4 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f16 = dp4;
                int width3 = ((int) (rectF2.width() / f16)) + 1;
                int height2 = ((int) (rectF2.height() / f16)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                break;
            case 8:
                org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) this.b;
                super.onDraw(canvas);
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.c;
                d6Var.a = this;
                ((zh.a3) this.d).getClass();
                d6Var.d(0.0f, false);
                float f17 = d6Var.c;
                if (f17 != 0.0f) {
                    if (f17 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (d6Var.c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    q90Var.d(rectF3);
                    q90Var.j(24.0f);
                    q90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    q90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((org.telegram.ui.Components.f31) this.d).e.d + AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.n6) this.b).setBounds(0, 0, i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).g0.invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 2:
                return ((org.telegram.ui.Components.f31) this.d).e == drawable || super.verifyDrawable(drawable);
            case 3:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.n6) this.b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(e70 e70Var, Context context) {
        super(context);
        this.d = e70Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(org.telegram.ui.Components.og0 og0Var, Context context) {
        super(context);
        this.d = og0Var;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(id0 id0Var, Context context, Rect rect) {
        super(context);
        this.d = id0Var;
        this.c = rect;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(org.telegram.ui.Components.f31 f31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = f31Var;
        this.c = f6Var;
        this.b = new org.telegram.ui.Components.h6(this, f6Var);
        f31Var.e.setCallback(this);
    }

    public u7(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, false, false, false);
        this.b = n6Var;
        n6Var.r(-1);
        n6Var.b = 17;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(zh.a3 a3Var, Context context) {
        super(context);
        this.d = a3Var;
        this.b = new org.telegram.ui.Components.q90();
        this.c = new org.telegram.ui.Components.d6(250L, org.telegram.ui.Components.wr.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(s50 s50Var, Context context, t50 t50Var) {
        super(context);
        this.d = s50Var;
        this.c = t50Var;
        this.b = new int[2];
    }
}
