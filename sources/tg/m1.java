package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import c8.j9;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public final v5 D;
    public sg.v0 E;
    public float F;
    public float G;
    public sg.i1 H;
    public Runnable I;
    public boolean J;
    public l1 K;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final uy d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final v5 x;
    public final v5 y;

    public m1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new v5(this);
        this.y = new v5(this);
        this.D = new v5(this);
        this.H = new sg.i1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new uy(context, new k1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z9) {
        if (z9) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.b);
        if (z9) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.F = f10;
        this.G = f11;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z9;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        l1 l1Var = this.K;
        float e10 = this.x.e(false, l1Var != null ? l1Var.get() : this.H.c);
        float e11 = this.y.e(false, this.F);
        float e12 = this.D.e(false, this.G);
        boolean z10 = this.h;
        if (z10) {
            float f10 = this.n;
            if (f10 != 1.0f) {
                this.n = org.telegram.ui.Cells.f1.e(min, 200.0f, f10, 1.0f);
                invalidate();
                z9 = this.f;
                if (z9) {
                    float f11 = this.r;
                    if (f11 != 1.0f) {
                        this.r = org.telegram.ui.Cells.f1.e(min, 200.0f, f11, 1.0f);
                        invalidate();
                        RectF rectF = this.e;
                        float height = rectF.height();
                        int L = org.telegram.messenger.g0.L(16.0f);
                        int L2 = org.telegram.messenger.g0.L(3.0f);
                        int L3 = org.telegram.messenger.g0.L(3.0f);
                        Path path = this.c;
                        path.rewind();
                        path.moveTo(0.0f, 0.0f);
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        int i7 = -L3;
                        int i10 = -L;
                        rectF2.set(org.telegram.messenger.g0.W1(this.r, i7, i10), 0.0f, org.telegram.messenger.g0.W1(this.r, L3, L), org.telegram.messenger.g0.W1(this.r, L3, L) * 2);
                        path.arcTo(rectF2, -90.0f, 90.0f);
                        path.lineTo(org.telegram.messenger.g0.W1(this.r, L3, L2), height);
                        rectF2.set(org.telegram.messenger.g0.W1(this.r, i7, -L2), height - (L2 * 2), org.telegram.messenger.g0.W1(this.r, L3, L2), height);
                        path.arcTo(rectF2, 0.0f, 180.0f);
                        float f12 = L;
                        path.lineTo(org.telegram.messenger.g0.W1(this.r, i7, i10), f12);
                        rectF2.set(org.telegram.messenger.g0.W1(this.r, i7, i10), 0.0f, org.telegram.messenger.g0.W1(this.r, L3, L), L * 2);
                        path.arcTo(rectF2, -180.0f, 90.0f);
                        path.close();
                        if (this.n != 0.0f) {
                            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
                        }
                        canvas.save();
                        float L4 = org.telegram.messenger.g0.L(32.0f);
                        wq wqVar = wq.f;
                        canvas.translate(wqVar.getInterpolation(this.r) * L4, rectF.top);
                        canvas.drawPath(path, this.a);
                        canvas.restore();
                        float f13 = (e10 - e11) / (e12 - e11);
                        float f14 = L2 * 1.5f;
                        a(wqVar.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), j9.a(com.google.android.recaptcha.internal.a.z(1.0f, f13, rectF.height(), rectF.top), rectF.top + f12, rectF.bottom - Math.min(f14, f12)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f14, f12), f12, f13), this.r), canvas, false);
                        if (this.J && this.r != 0.0f && this.w && this.E != null) {
                            sg.v0 v0Var = this.E;
                            float f15 = v0Var.c.g.a;
                            a(getWidth() / 2.0f, getHeight() / 2.0f, v0Var.getCurrentBrush().h() * com.google.android.recaptcha.internal.a.x(f15, 0.043945312f, e10, 0.00390625f * f15) * this.E.getCurrentBrush().g(), canvas, true);
                        }
                        if (this.n != 0.0f) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if (!z9) {
                    float f16 = this.r;
                    if (f16 != 0.0f) {
                        this.r = org.telegram.ui.Cells.f1.v(min, 200.0f, f16, 0.0f);
                        invalidate();
                    }
                }
                RectF rectF3 = this.e;
                float height2 = rectF3.height();
                int L5 = org.telegram.messenger.g0.L(16.0f);
                int L22 = org.telegram.messenger.g0.L(3.0f);
                int L32 = org.telegram.messenger.g0.L(3.0f);
                Path path2 = this.c;
                path2.rewind();
                path2.moveTo(0.0f, 0.0f);
                RectF rectF22 = org.telegram.messenger.g0.P;
                int i72 = -L32;
                int i102 = -L5;
                rectF22.set(org.telegram.messenger.g0.W1(this.r, i72, i102), 0.0f, org.telegram.messenger.g0.W1(this.r, L32, L5), org.telegram.messenger.g0.W1(this.r, L32, L5) * 2);
                path2.arcTo(rectF22, -90.0f, 90.0f);
                path2.lineTo(org.telegram.messenger.g0.W1(this.r, L32, L22), height2);
                rectF22.set(org.telegram.messenger.g0.W1(this.r, i72, -L22), height2 - (L22 * 2), org.telegram.messenger.g0.W1(this.r, L32, L22), height2);
                path2.arcTo(rectF22, 0.0f, 180.0f);
                float f122 = L5;
                path2.lineTo(org.telegram.messenger.g0.W1(this.r, i72, i102), f122);
                rectF22.set(org.telegram.messenger.g0.W1(this.r, i72, i102), 0.0f, org.telegram.messenger.g0.W1(this.r, L32, L5), L5 * 2);
                path2.arcTo(rectF22, -180.0f, 90.0f);
                path2.close();
                if (this.n != 0.0f) {
                }
                canvas.save();
                float L42 = org.telegram.messenger.g0.L(32.0f);
                wq wqVar2 = wq.f;
                canvas.translate(wqVar2.getInterpolation(this.r) * L42, rectF3.top);
                canvas.drawPath(path2, this.a);
                canvas.restore();
                float f132 = (e10 - e11) / (e12 - e11);
                float f142 = L22 * 1.5f;
                a(wqVar2.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), j9.a(com.google.android.recaptcha.internal.a.z(1.0f, f132, rectF3.height(), rectF3.top), rectF3.top + f122, rectF3.bottom - Math.min(f142, f122)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f142, f122), f122, f132), this.r), canvas, false);
                if (this.J) {
                    sg.v0 v0Var2 = this.E;
                    float f152 = v0Var2.c.g.a;
                    a(getWidth() / 2.0f, getHeight() / 2.0f, v0Var2.getCurrentBrush().h() * com.google.android.recaptcha.internal.a.x(f152, 0.043945312f, e10, 0.00390625f * f152) * this.E.getCurrentBrush().g(), canvas, true);
                }
                if (this.n != 0.0f) {
                }
            }
        }
        if (!z10) {
            float f17 = this.n;
            if (f17 != 0.0f) {
                this.n = org.telegram.ui.Cells.f1.v(min, 200.0f, f17, 0.0f);
                invalidate();
            }
        }
        z9 = this.f;
        if (z9) {
        }
        if (!z9) {
        }
        RectF rectF32 = this.e;
        float height22 = rectF32.height();
        int L52 = org.telegram.messenger.g0.L(16.0f);
        int L222 = org.telegram.messenger.g0.L(3.0f);
        int L322 = org.telegram.messenger.g0.L(3.0f);
        Path path22 = this.c;
        path22.rewind();
        path22.moveTo(0.0f, 0.0f);
        RectF rectF222 = org.telegram.messenger.g0.P;
        int i722 = -L322;
        int i1022 = -L52;
        rectF222.set(org.telegram.messenger.g0.W1(this.r, i722, i1022), 0.0f, org.telegram.messenger.g0.W1(this.r, L322, L52), org.telegram.messenger.g0.W1(this.r, L322, L52) * 2);
        path22.arcTo(rectF222, -90.0f, 90.0f);
        path22.lineTo(org.telegram.messenger.g0.W1(this.r, L322, L222), height22);
        rectF222.set(org.telegram.messenger.g0.W1(this.r, i722, -L222), height22 - (L222 * 2), org.telegram.messenger.g0.W1(this.r, L322, L222), height22);
        path22.arcTo(rectF222, 0.0f, 180.0f);
        float f1222 = L52;
        path22.lineTo(org.telegram.messenger.g0.W1(this.r, i722, i1022), f1222);
        rectF222.set(org.telegram.messenger.g0.W1(this.r, i722, i1022), 0.0f, org.telegram.messenger.g0.W1(this.r, L322, L52), L52 * 2);
        path22.arcTo(rectF222, -180.0f, 90.0f);
        path22.close();
        if (this.n != 0.0f) {
        }
        canvas.save();
        float L422 = org.telegram.messenger.g0.L(32.0f);
        wq wqVar22 = wq.f;
        canvas.translate(wqVar22.getInterpolation(this.r) * L422, rectF32.top);
        canvas.drawPath(path22, this.a);
        canvas.restore();
        float f1322 = (e10 - e11) / (e12 - e11);
        float f1422 = L222 * 1.5f;
        a(wqVar22.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), j9.a(com.google.android.recaptcha.internal.a.z(1.0f, f1322, rectF32.height(), rectF32.top), rectF32.top + f1222, rectF32.bottom - Math.min(f1422, f1222)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f1422, f1222), f1222, f1322), this.r), canvas, false);
        if (this.J) {
        }
        if (this.n != 0.0f) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
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
        this.H.c = f10;
        invalidate();
    }

    public void setColorSwatch(sg.i1 i1Var) {
        this.H = i1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z9) {
        this.J = z9;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(sg.v0 v0Var) {
        this.E = v0Var;
    }

    public void setShowPreview(boolean z9) {
        this.w = z9;
        invalidate();
    }

    public void setValueOverride(l1 l1Var) {
        this.K = l1Var;
        invalidate();
    }

    public void setViewHidden(boolean z9) {
        this.h = z9;
        invalidate();
    }
}
