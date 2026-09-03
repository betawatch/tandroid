package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ek;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a1 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f;
    public final org.telegram.ui.Components.z5 h;
    public final RectF n;
    public Boolean r;
    public final /* synthetic */ x1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(x1 x1Var, Context context) {
        super(context);
        this.s = x1Var;
        this.a = new Paint(1);
        this.b = new Paint(3);
        this.c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, pr.h);
        this.n = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        int i11;
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        x1 x1Var = this.s;
        ek ekVar = x1Var.f;
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
        Paint paint = this.a;
        paint.setColor(v02);
        paint.setAlpha((int) ((this.d == null ? 1.0f : 0.85f) * 255.0f));
        View[] viewPages = ekVar.getViewPages();
        x1Var.x = 0.0f;
        boolean z4 = false;
        for (View view : viewPages) {
            if (view instanceof i1) {
                i1 i1Var = (i1) view;
                x1Var.x += Utilities.clamp(1.0f - Math.abs(i1Var.getTranslationX() / i1Var.getMeasuredWidth()), 1.0f, 0.0f) * i1Var.b();
                if (i1Var.getVisibility() == 0) {
                    i1Var.c();
                }
            }
        }
        float d = this.h.d(x1Var.x <= 0.0f ? 1.0f : 0.0f, false);
        float paddingTop = (x1Var.x + ekVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ekVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f.reset();
            this.f.postScale(16.0f, 16.0f);
            this.f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.b);
        }
        boolean z10 = rectF.top < ((float) AndroidUtilities.statusBarHeight);
        Boolean bool = this.r;
        if (bool == null || bool.booleanValue() != z10) {
            this.r = Boolean.valueOf(z10);
            Window window = x1Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z4 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z4);
        }
        float f10 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f10, AndroidUtilities.dp(14.0f) * f10, paint);
        RectF rectF2 = this.n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + getWidth()) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f10 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            x1 x1Var = this.s;
            if (y10 < x1Var.x) {
                x1Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.b.setShader(null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            x1 x1Var = this.s;
            g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
            if (g6Var != null) {
                g6Var2 = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
                if (!g6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            if (x1Var.w == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            x1Var.w.run(createBitmap, Float.valueOf(16.0f));
            Utilities.stackBlurBitmap(createBitmap, 8);
            this.d = createBitmap;
            Bitmap bitmap = this.d;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.e = bitmapShader;
            this.b.setShader(bitmapShader);
            if (this.f == null) {
                this.f = new Matrix();
            }
            this.f.postScale(16.0f, 16.0f);
            this.e.setLocalMatrix(this.f);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        x1 x1Var = this.s;
        x1Var.n = min;
        ek ekVar = x1Var.f;
        ekVar.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        ekVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        w1 w1Var = x1Var.h;
        if (w1Var != null) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
