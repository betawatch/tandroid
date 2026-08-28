package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w1 extends View {
    public xf.c1 A;
    public float B;
    public float C;
    public xf.q1 D;
    public Runnable E;
    public boolean F;
    public v1 G;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final m5.c0 d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean v;
    public final y5 w;
    public final y5 x;
    public final y5 y;

    public w1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.v = true;
        this.w = new y5(this);
        this.x = new y5(this);
        this.y = new y5(this);
        this.D = new xf.q1(1.0f, 0.016773745f, -1);
        this.F = true;
        this.d = new m5.c0(context, new u1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f10 - f12) - AndroidUtilities.dp(6.0f), (f11 - f12) - AndroidUtilities.dp(6.0f), f10 + f12 + AndroidUtilities.dp(6.0f), f11 + f12 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.B = f10;
        this.C = f11;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        v1 v1Var = this.G;
        float d = this.w.d(v1Var != null ? v1Var.get() : this.D.c, false);
        float d9 = this.x.d(this.B, false);
        float d10 = this.y.d(this.C, false);
        boolean z11 = this.h;
        if (z11) {
            float f10 = this.n;
            if (f10 != 1.0f) {
                this.n = Math.min(1.0f, (min / 200.0f) + f10);
                invalidate();
                z10 = this.f;
                if (z10) {
                    float f11 = this.r;
                    if (f11 != 1.0f) {
                        this.r = Math.min(1.0f, (min / 200.0f) + f11);
                        invalidate();
                        RectF rectF = this.e;
                        float height = rectF.height();
                        int dp = AndroidUtilities.dp(16.0f);
                        int dp2 = AndroidUtilities.dp(3.0f);
                        int dp3 = AndroidUtilities.dp(3.0f);
                        Path path = this.c;
                        path.rewind();
                        path.moveTo(0.0f, 0.0f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        int i9 = -dp3;
                        int i10 = -dp;
                        rectF2.set(AndroidUtilities.lerp(i9, i10, this.r), 0.0f, AndroidUtilities.lerp(dp3, dp, this.r), AndroidUtilities.lerp(dp3, dp, this.r) * 2);
                        path.arcTo(rectF2, -90.0f, 90.0f);
                        path.lineTo(AndroidUtilities.lerp(dp3, dp2, this.r), height);
                        rectF2.set(AndroidUtilities.lerp(i9, -dp2, this.r), height - (dp2 * 2), AndroidUtilities.lerp(dp3, dp2, this.r), height);
                        path.arcTo(rectF2, 0.0f, 180.0f);
                        float f12 = dp;
                        path.lineTo(AndroidUtilities.lerp(i9, i10, this.r), f12);
                        rectF2.set(AndroidUtilities.lerp(i9, i10, this.r), 0.0f, AndroidUtilities.lerp(dp3, dp, this.r), dp * 2);
                        path.arcTo(rectF2, -180.0f, 90.0f);
                        path.close();
                        if (this.n != 0.0f) {
                            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
                        }
                        canvas.save();
                        float dp4 = AndroidUtilities.dp(32.0f);
                        gr grVar = gr.f;
                        canvas.translate(grVar.getInterpolation(this.r) * dp4, rectF.top);
                        canvas.drawPath(path, this.a);
                        canvas.restore();
                        float f13 = (d - d9) / (d10 - d9);
                        float f14 = dp2 * 1.5f;
                        a(grVar.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), g7.n.a(e2.c.z(1.0f, f13, rectF.height(), rectF.top), rectF.top + f12, rectF.bottom - Math.min(f14, f12)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f14, f12), f12, f13), this.r), canvas, false);
                        if (this.F && this.r != 0.0f && this.v && this.A != null) {
                            xf.c1 c1Var = this.A;
                            float f15 = c1Var.c.g.a;
                            a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var.getCurrentBrush().h() * e2.c.x(f15, 0.043945312f, d, 0.00390625f * f15) * this.A.getCurrentBrush().g(), canvas, true);
                        }
                        if (this.n != 0.0f) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if (!z10) {
                    float f16 = this.r;
                    if (f16 != 0.0f) {
                        this.r = Math.max(0.0f, f16 - (min / 200.0f));
                        invalidate();
                    }
                }
                RectF rectF3 = this.e;
                float height2 = rectF3.height();
                int dp5 = AndroidUtilities.dp(16.0f);
                int dp22 = AndroidUtilities.dp(3.0f);
                int dp32 = AndroidUtilities.dp(3.0f);
                Path path2 = this.c;
                path2.rewind();
                path2.moveTo(0.0f, 0.0f);
                RectF rectF22 = AndroidUtilities.rectTmp;
                int i92 = -dp32;
                int i102 = -dp5;
                rectF22.set(AndroidUtilities.lerp(i92, i102, this.r), 0.0f, AndroidUtilities.lerp(dp32, dp5, this.r), AndroidUtilities.lerp(dp32, dp5, this.r) * 2);
                path2.arcTo(rectF22, -90.0f, 90.0f);
                path2.lineTo(AndroidUtilities.lerp(dp32, dp22, this.r), height2);
                rectF22.set(AndroidUtilities.lerp(i92, -dp22, this.r), height2 - (dp22 * 2), AndroidUtilities.lerp(dp32, dp22, this.r), height2);
                path2.arcTo(rectF22, 0.0f, 180.0f);
                float f122 = dp5;
                path2.lineTo(AndroidUtilities.lerp(i92, i102, this.r), f122);
                rectF22.set(AndroidUtilities.lerp(i92, i102, this.r), 0.0f, AndroidUtilities.lerp(dp32, dp5, this.r), dp5 * 2);
                path2.arcTo(rectF22, -180.0f, 90.0f);
                path2.close();
                if (this.n != 0.0f) {
                }
                canvas.save();
                float dp42 = AndroidUtilities.dp(32.0f);
                gr grVar2 = gr.f;
                canvas.translate(grVar2.getInterpolation(this.r) * dp42, rectF3.top);
                canvas.drawPath(path2, this.a);
                canvas.restore();
                float f132 = (d - d9) / (d10 - d9);
                float f142 = dp22 * 1.5f;
                a(grVar2.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), g7.n.a(e2.c.z(1.0f, f132, rectF3.height(), rectF3.top), rectF3.top + f122, rectF3.bottom - Math.min(f142, f122)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f142, f122), f122, f132), this.r), canvas, false);
                if (this.F) {
                    xf.c1 c1Var2 = this.A;
                    float f152 = c1Var2.c.g.a;
                    a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var2.getCurrentBrush().h() * e2.c.x(f152, 0.043945312f, d, 0.00390625f * f152) * this.A.getCurrentBrush().g(), canvas, true);
                }
                if (this.n != 0.0f) {
                }
            }
        }
        if (!z11) {
            float f17 = this.n;
            if (f17 != 0.0f) {
                this.n = Math.max(0.0f, f17 - (min / 200.0f));
                invalidate();
            }
        }
        z10 = this.f;
        if (z10) {
        }
        if (!z10) {
        }
        RectF rectF32 = this.e;
        float height22 = rectF32.height();
        int dp52 = AndroidUtilities.dp(16.0f);
        int dp222 = AndroidUtilities.dp(3.0f);
        int dp322 = AndroidUtilities.dp(3.0f);
        Path path22 = this.c;
        path22.rewind();
        path22.moveTo(0.0f, 0.0f);
        RectF rectF222 = AndroidUtilities.rectTmp;
        int i922 = -dp322;
        int i1022 = -dp52;
        rectF222.set(AndroidUtilities.lerp(i922, i1022, this.r), 0.0f, AndroidUtilities.lerp(dp322, dp52, this.r), AndroidUtilities.lerp(dp322, dp52, this.r) * 2);
        path22.arcTo(rectF222, -90.0f, 90.0f);
        path22.lineTo(AndroidUtilities.lerp(dp322, dp222, this.r), height22);
        rectF222.set(AndroidUtilities.lerp(i922, -dp222, this.r), height22 - (dp222 * 2), AndroidUtilities.lerp(dp322, dp222, this.r), height22);
        path22.arcTo(rectF222, 0.0f, 180.0f);
        float f1222 = dp52;
        path22.lineTo(AndroidUtilities.lerp(i922, i1022, this.r), f1222);
        rectF222.set(AndroidUtilities.lerp(i922, i1022, this.r), 0.0f, AndroidUtilities.lerp(dp322, dp52, this.r), dp52 * 2);
        path22.arcTo(rectF222, -180.0f, 90.0f);
        path22.close();
        if (this.n != 0.0f) {
        }
        canvas.save();
        float dp422 = AndroidUtilities.dp(32.0f);
        gr grVar22 = gr.f;
        canvas.translate(grVar22.getInterpolation(this.r) * dp422, rectF32.top);
        canvas.drawPath(path22, this.a);
        canvas.restore();
        float f1322 = (d - d9) / (d10 - d9);
        float f1422 = dp222 * 1.5f;
        a(grVar22.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), g7.n.a(e2.c.z(1.0f, f1322, rectF32.height(), rectF32.top), rectF32.top + f1222, rectF32.bottom - Math.min(f1422, f1222)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f1422, f1222), f1222, f1322), this.r), canvas, false);
        if (this.F) {
        }
        if (this.n != 0.0f) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.D.c = f10;
        invalidate();
    }

    public void setColorSwatch(xf.q1 q1Var) {
        this.D = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.E = runnable;
    }

    public void setRenderView(xf.c1 c1Var) {
        this.A = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(v1 v1Var) {
        this.G = v1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
