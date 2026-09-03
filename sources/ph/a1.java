package ph;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.gk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final /* synthetic */ y1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y1 y1Var, Context context) {
        super(context);
        this.s = y1Var;
        this.a = new Paint(1);
        this.b = new Paint(3);
        this.c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, mr.h);
        this.n = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        y1 y1Var = this.s;
        gk gkVar = y1Var.f;
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Paint paint = this.a;
        paint.setColor(v02);
        paint.setAlpha((int) ((this.d == null ? 1.0f : 0.85f) * 255.0f));
        View[] viewPages = gkVar.getViewPages();
        y1Var.x = 0.0f;
        boolean z4 = false;
        for (View view : viewPages) {
            if (view instanceof i1) {
                i1 i1Var = (i1) view;
                y1Var.x += Utilities.clamp(1.0f - Math.abs(i1Var.getTranslationX() / i1Var.getMeasuredWidth()), 1.0f, 0.0f) * i1Var.b();
                if (i1Var.getVisibility() == 0) {
                    i1Var.c();
                }
            }
        }
        float d = this.h.d(y1Var.x <= 0.0f ? 1.0f : 0.0f, false);
        float paddingTop = (y1Var.x + gkVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), gkVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
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
            Window window = y1Var.getWindow();
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
            y1 y1Var = this.s;
            if (y10 < y1Var.x) {
                y1Var.dismiss();
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            y1 y1Var = this.s;
            f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
            if (f6Var != null) {
                f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
                if (!f6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            if (y1Var.w == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            y1Var.w.run(createBitmap, Float.valueOf(16.0f));
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
        y1 y1Var = this.s;
        y1Var.n = min;
        gk gkVar = y1Var.f;
        gkVar.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        gkVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        x1 x1Var = y1Var.h;
        if (x1Var != null) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
