package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class y1 extends View {
    public qg.c1 E;
    public float F;
    public float G;
    public qg.q1 H;
    public Runnable I;
    public boolean J;
    public x1 K;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final l.d d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean v;
    public final e6 w;
    public final e6 x;
    public final e6 y;

    public y1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.v = true;
        this.w = new e6(this);
        this.x = new e6(this);
        this.y = new e6(this);
        this.H = new qg.q1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new l.d(context, new w1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f7, float f10) {
        this.F = f7;
        this.G = f10;
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
        x1 x1Var = this.K;
        float d = this.w.d(x1Var != null ? x1Var.get() : this.H.c, false);
        float d10 = this.x.d(this.F, false);
        float d11 = this.y.d(this.G, false);
        boolean z11 = this.h;
        if (z11) {
            float f7 = this.n;
            if (f7 != 1.0f) {
                this.n = Math.min(1.0f, (min / 200.0f) + f7);
                invalidate();
                z10 = this.f;
                if (z10) {
                    float f10 = this.r;
                    if (f10 != 1.0f) {
                        this.r = Math.min(1.0f, (min / 200.0f) + f10);
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
                        int i10 = -dp3;
                        int i11 = -dp;
                        rectF2.set(AndroidUtilities.lerp(i10, i11, this.r), 0.0f, AndroidUtilities.lerp(dp3, dp, this.r), AndroidUtilities.lerp(dp3, dp, this.r) * 2);
                        path.arcTo(rectF2, -90.0f, 90.0f);
                        path.lineTo(AndroidUtilities.lerp(dp3, dp2, this.r), height);
                        rectF2.set(AndroidUtilities.lerp(i10, -dp2, this.r), height - (dp2 * 2), AndroidUtilities.lerp(dp3, dp2, this.r), height);
                        path.arcTo(rectF2, 0.0f, 180.0f);
                        float f11 = dp;
                        path.lineTo(AndroidUtilities.lerp(i10, i11, this.r), f11);
                        rectF2.set(AndroidUtilities.lerp(i10, i11, this.r), 0.0f, AndroidUtilities.lerp(dp3, dp, this.r), dp * 2);
                        path.arcTo(rectF2, -180.0f, 90.0f);
                        path.close();
                        if (this.n != 0.0f) {
                            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
                        }
                        canvas.save();
                        float dp4 = AndroidUtilities.dp(32.0f);
                        pr prVar = pr.f;
                        canvas.translate(prVar.getInterpolation(this.r) * dp4, rectF.top);
                        canvas.drawPath(path, this.a);
                        canvas.restore();
                        float f12 = (d - d10) / (d11 - d10);
                        float f13 = dp2 * 1.5f;
                        a(prVar.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), w7.p.a(com.google.android.gms.internal.vision.e2.z(1.0f, f12, rectF.height(), rectF.top), rectF.top + f11, rectF.bottom - Math.min(f13, f11)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f13, f11), f11, f12), this.r), canvas, false);
                        if (this.J && this.r != 0.0f && this.v && this.E != null) {
                            qg.c1 c1Var = this.E;
                            float f14 = c1Var.c.g.a;
                            a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var.getCurrentBrush().h() * com.google.android.gms.internal.vision.e2.x(f14, 0.043945312f, d, 0.00390625f * f14) * this.E.getCurrentBrush().g(), canvas, true);
                        }
                        if (this.n != 0.0f) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if (!z10) {
                    float f15 = this.r;
                    if (f15 != 0.0f) {
                        this.r = Math.max(0.0f, f15 - (min / 200.0f));
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
                int i102 = -dp32;
                int i112 = -dp5;
                rectF22.set(AndroidUtilities.lerp(i102, i112, this.r), 0.0f, AndroidUtilities.lerp(dp32, dp5, this.r), AndroidUtilities.lerp(dp32, dp5, this.r) * 2);
                path2.arcTo(rectF22, -90.0f, 90.0f);
                path2.lineTo(AndroidUtilities.lerp(dp32, dp22, this.r), height2);
                rectF22.set(AndroidUtilities.lerp(i102, -dp22, this.r), height2 - (dp22 * 2), AndroidUtilities.lerp(dp32, dp22, this.r), height2);
                path2.arcTo(rectF22, 0.0f, 180.0f);
                float f112 = dp5;
                path2.lineTo(AndroidUtilities.lerp(i102, i112, this.r), f112);
                rectF22.set(AndroidUtilities.lerp(i102, i112, this.r), 0.0f, AndroidUtilities.lerp(dp32, dp5, this.r), dp5 * 2);
                path2.arcTo(rectF22, -180.0f, 90.0f);
                path2.close();
                if (this.n != 0.0f) {
                }
                canvas.save();
                float dp42 = AndroidUtilities.dp(32.0f);
                pr prVar2 = pr.f;
                canvas.translate(prVar2.getInterpolation(this.r) * dp42, rectF3.top);
                canvas.drawPath(path2, this.a);
                canvas.restore();
                float f122 = (d - d10) / (d11 - d10);
                float f132 = dp22 * 1.5f;
                a(prVar2.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), w7.p.a(com.google.android.gms.internal.vision.e2.z(1.0f, f122, rectF3.height(), rectF3.top), rectF3.top + f112, rectF3.bottom - Math.min(f132, f112)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f132, f112), f112, f122), this.r), canvas, false);
                if (this.J) {
                    qg.c1 c1Var2 = this.E;
                    float f142 = c1Var2.c.g.a;
                    a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var2.getCurrentBrush().h() * com.google.android.gms.internal.vision.e2.x(f142, 0.043945312f, d, 0.00390625f * f142) * this.E.getCurrentBrush().g(), canvas, true);
                }
                if (this.n != 0.0f) {
                }
            }
        }
        if (!z11) {
            float f16 = this.n;
            if (f16 != 0.0f) {
                this.n = Math.max(0.0f, f16 - (min / 200.0f));
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
        int i1022 = -dp322;
        int i1122 = -dp52;
        rectF222.set(AndroidUtilities.lerp(i1022, i1122, this.r), 0.0f, AndroidUtilities.lerp(dp322, dp52, this.r), AndroidUtilities.lerp(dp322, dp52, this.r) * 2);
        path22.arcTo(rectF222, -90.0f, 90.0f);
        path22.lineTo(AndroidUtilities.lerp(dp322, dp222, this.r), height22);
        rectF222.set(AndroidUtilities.lerp(i1022, -dp222, this.r), height22 - (dp222 * 2), AndroidUtilities.lerp(dp322, dp222, this.r), height22);
        path22.arcTo(rectF222, 0.0f, 180.0f);
        float f1122 = dp52;
        path22.lineTo(AndroidUtilities.lerp(i1022, i1122, this.r), f1122);
        rectF222.set(AndroidUtilities.lerp(i1022, i1122, this.r), 0.0f, AndroidUtilities.lerp(dp322, dp52, this.r), dp52 * 2);
        path22.arcTo(rectF222, -180.0f, 90.0f);
        path22.close();
        if (this.n != 0.0f) {
        }
        canvas.save();
        float dp422 = AndroidUtilities.dp(32.0f);
        pr prVar22 = pr.f;
        canvas.translate(prVar22.getInterpolation(this.r) * dp422, rectF32.top);
        canvas.drawPath(path22, this.a);
        canvas.restore();
        float f1222 = (d - d10) / (d11 - d10);
        float f1322 = dp222 * 1.5f;
        a(prVar22.getInterpolation(this.r) * AndroidUtilities.dp(32.0f), w7.p.a(com.google.android.gms.internal.vision.e2.z(1.0f, f1222, rectF32.height(), rectF32.top), rectF32.top + f1122, rectF32.bottom - Math.min(f1322, f1122)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f1322, f1122), f1122, f1222), this.r), canvas, false);
        if (this.J) {
        }
        if (this.n != 0.0f) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
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

    public void setBrushWeight(float f7) {
        this.H.c = f7;
        invalidate();
    }

    public void setColorSwatch(qg.q1 q1Var) {
        this.H = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(qg.c1 c1Var) {
        this.E = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(x1 x1Var) {
        this.K = x1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
