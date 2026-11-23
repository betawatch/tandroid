package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import c8.m9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r1 extends View {
    public final c6 E;
    public sg.t0 F;
    public float G;
    public float H;
    public sg.g1 I;
    public Runnable J;
    public boolean K;
    public q1 L;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final nd0 d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final c6 x;
    public final c6 y;

    public r1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new c6(this);
        this.y = new c6(this);
        this.E = new c6(this);
        this.I = new sg.g1(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new nd0(context, new p1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.G = f10;
        this.H = f11;
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
        boolean z10;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        q1 q1Var = this.L;
        float e10 = this.x.e(false, q1Var != null ? q1Var.get() : this.I.c);
        float e11 = this.y.e(false, this.G);
        float e12 = this.E.e(false, this.H);
        boolean z11 = this.h;
        if (z11) {
            float f10 = this.n;
            if (f10 != 1.0f) {
                this.n = org.telegram.ui.Cells.c0.f(min, 200.0f, f10, 1.0f);
                invalidate();
                z10 = this.f;
                if (z10) {
                    float f11 = this.r;
                    if (f11 != 1.0f) {
                        this.r = org.telegram.ui.Cells.c0.f(min, 200.0f, f11, 1.0f);
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
                        kr krVar = kr.f;
                        canvas.translate(krVar.getInterpolation(this.r) * L4, rectF.top);
                        canvas.drawPath(path, this.a);
                        canvas.restore();
                        float f13 = (e10 - e11) / (e12 - e11);
                        float f14 = L2 * 1.5f;
                        a(krVar.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), m9.a(com.google.android.gms.internal.vision.e2.z(1.0f, f13, rectF.height(), rectF.top), rectF.top + f12, rectF.bottom - Math.min(f14, f12)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f14, f12), f12, f13), this.r), canvas, false);
                        if (this.K && this.r != 0.0f && this.w && this.F != null) {
                            sg.t0 t0Var = this.F;
                            float f15 = t0Var.c.g.a;
                            a(getWidth() / 2.0f, getHeight() / 2.0f, t0Var.getCurrentBrush().h() * com.google.android.gms.internal.vision.e2.x(f15, 0.043945312f, e10, 0.00390625f * f15) * this.F.getCurrentBrush().g(), canvas, true);
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
                        this.r = org.telegram.ui.Cells.c0.B(min, 200.0f, f16, 0.0f);
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
                kr krVar2 = kr.f;
                canvas.translate(krVar2.getInterpolation(this.r) * L42, rectF3.top);
                canvas.drawPath(path2, this.a);
                canvas.restore();
                float f132 = (e10 - e11) / (e12 - e11);
                float f142 = L22 * 1.5f;
                a(krVar2.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), m9.a(com.google.android.gms.internal.vision.e2.z(1.0f, f132, rectF3.height(), rectF3.top), rectF3.top + f122, rectF3.bottom - Math.min(f142, f122)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f142, f122), f122, f132), this.r), canvas, false);
                if (this.K) {
                    sg.t0 t0Var2 = this.F;
                    float f152 = t0Var2.c.g.a;
                    a(getWidth() / 2.0f, getHeight() / 2.0f, t0Var2.getCurrentBrush().h() * com.google.android.gms.internal.vision.e2.x(f152, 0.043945312f, e10, 0.00390625f * f152) * this.F.getCurrentBrush().g(), canvas, true);
                }
                if (this.n != 0.0f) {
                }
            }
        }
        if (!z11) {
            float f17 = this.n;
            if (f17 != 0.0f) {
                this.n = org.telegram.ui.Cells.c0.B(min, 200.0f, f17, 0.0f);
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
        kr krVar22 = kr.f;
        canvas.translate(krVar22.getInterpolation(this.r) * L422, rectF32.top);
        canvas.drawPath(path22, this.a);
        canvas.restore();
        float f1322 = (e10 - e11) / (e12 - e11);
        float f1422 = L222 * 1.5f;
        a(krVar22.getInterpolation(this.r) * org.telegram.messenger.g0.L(32.0f), m9.a(com.google.android.gms.internal.vision.e2.z(1.0f, f1322, rectF32.height(), rectF32.top), rectF32.top + f1222, rectF32.bottom - Math.min(f1422, f1222)), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.T1(Math.min(f1422, f1222), f1222, f1322), this.r), canvas, false);
        if (this.K) {
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
        this.I.c = f10;
        invalidate();
    }

    public void setColorSwatch(sg.g1 g1Var) {
        this.I = g1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.K = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(sg.t0 t0Var) {
        this.F = t0Var;
    }

    public void setShowPreview(boolean z10) {
        this.w = z10;
        invalidate();
    }

    public void setValueOverride(q1 q1Var) {
        this.L = q1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
