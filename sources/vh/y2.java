package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class y2 extends FrameLayout {
    public final RectF D;
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.t5 J;
    public qz0 K;
    public final Path L;
    public boolean M;
    public final w9 a;
    public final ii b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final d0 h;
    public final dc n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public qz0 x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [vh.t2] */
    public y2(Context context, th.b bVar, s9 s9Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final k7 k7Var = (k7) this;
        this.h = new d0(k7Var, 10);
        this.n = new dc(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        Path path = new Path();
        this.y = path;
        this.D = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.L(4.33f), -org.telegram.messenger.i0.L(4.33f));
        path.lineTo(org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f));
        path.moveTo(-org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f));
        path.lineTo(org.telegram.messenger.i0.L(4.33f), -org.telegram.messenger.i0.L(4.33f));
        this.a = new w9(s9Var, this, 0, !k7Var.O.r0.c());
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(44.0f));
        final int i10 = 0;
        ii iiVar = new ii(k7Var, context, d20.s0, (t2) new j20() { // from class: vh.t2
            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                k7 k7Var2 = k7Var;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        p51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < k7Var2.d.size(); i14++) {
                            Integer num = (Integer) k7Var2.d.get(i14);
                            int intValue = num.intValue();
                            n5 n5Var = (n5) k7Var2.c.get(intValue);
                            int i15 = w2.b;
                            a51 K = a51.K(w2.class);
                            K.d = intValue;
                            K.G = n5Var;
                            K.z = i13;
                            int i16 = 1;
                            K.L(k7Var2.f == intValue);
                            K.f = k7Var2.e.contains(num);
                            K.D = new rh.r0(k7Var2, intValue, i16);
                            arrayList.add(K);
                            if (k7Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        p51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        k7Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            k7Var2.d.add(Integer.valueOf(((a51) obj3).d));
                        }
                        org.telegram.messenger.i0.d0(k7Var2.b, new ph.h1(k7Var2, 24));
                        break;
                }
            }
        }, new rh.d0(k7Var, 26), bVar);
        this.b = iiVar;
        iiVar.f3.r = false;
        iiVar.setClipToPadding(false);
        iiVar.setClipChildren(false);
        iiVar.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        addView(iiVar, w7.b6.e(-2, 120, 85));
        iiVar.z1(true);
        final int i11 = 1;
        iiVar.E1(new j20() { // from class: vh.t2
            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                k7 k7Var2 = k7Var;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        p51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < k7Var2.d.size(); i14++) {
                            Integer num = (Integer) k7Var2.d.get(i14);
                            int intValue = num.intValue();
                            n5 n5Var = (n5) k7Var2.c.get(intValue);
                            int i15 = w2.b;
                            a51 K = a51.K(w2.class);
                            K.d = intValue;
                            K.G = n5Var;
                            K.z = i13;
                            int i16 = 1;
                            K.L(k7Var2.f == intValue);
                            K.f = k7Var2.e.contains(num);
                            K.D = new rh.r0(k7Var2, intValue, i16);
                            arrayList.add(K);
                            if (k7Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        p51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        k7Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            k7Var2.d.add(Integer.valueOf(((a51) obj3).d));
                        }
                        org.telegram.messenger.i0.d0(k7Var2.b, new ph.h1(k7Var2, 24));
                        break;
                }
            }
        }, true);
        c(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10) {
        if (f10 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        k7 k7Var = (k7) this;
        boolean c10 = k7Var.O.r0.c();
        w9 w9Var = this.a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = k7Var.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                w9Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = w9Var.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f7, f7, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
        }
        if (f10 < 1.0f) {
            canvas.restore();
        }
    }

    public final int b(int i10) {
        if (!this.d.contains(Integer.valueOf(i10))) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < Math.min(i10, this.c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z10, boolean z11) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        ii iiVar = this.b;
        iiVar.animate().cancel();
        if (z11) {
            iiVar.setVisibility(0);
            z20.m(iiVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new sg.y(11, this, z10)).setUpdateListener(new qh.e0(this, 29)), gr.h, 360L);
        } else {
            iiVar.setVisibility(z10 ? 0 : 8);
            iiVar.setAlpha(z10 ? 1.0f : 0.0f);
            iiVar.setScaleX(z10 ? 1.0f : 0.65f);
            iiVar.setScaleY(z10 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z10 && this.I) {
            this.I = false;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.n.a(0.1f);
        canvas.save();
        float width = getWidth() - org.telegram.messenger.i0.L(42.0f);
        float height = getHeight() - org.telegram.messenger.i0.L(34.0f);
        float width2 = getWidth() - org.telegram.messenger.i0.L(12.0f);
        float height2 = getHeight() - org.telegram.messenger.i0.L(4.0f);
        RectF rectF = this.r;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        float L = org.telegram.messenger.i0.L(2.0f);
        Paint paint = this.w;
        paint.setStrokeWidth(L);
        paint.setAlpha(zs.e4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.i0.L(0.9f), paint);
        qz0 qz0Var = this.x;
        ii iiVar = this.b;
        if (qz0Var != null) {
            qz0Var.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - org.telegram.messenger.i0.L(0.6f), 1.0f - iiVar.getAlpha(), -1, canvas);
        }
        if (iiVar.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (iiVar.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float d = this.J.d(this.I);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, d);
                float k10 = this.K.k() + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(11.0f);
                float L2 = org.telegram.messenger.i0.L(32.0f);
                float f7 = rectF.right - k10;
                float L3 = (rectF.top - org.telegram.messenger.i0.L(9.66f)) - L2;
                float f10 = rectF.right;
                float L4 = rectF.top - org.telegram.messenger.i0.L(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(f7, L3, f10, L4);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.i0.L(4.0f));
                Path path = this.H;
                path.rewind();
                float L5 = org.telegram.messenger.i0.L(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.G;
                rectF4.set(f11, f12, f11 + L5, f12 + L5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f13 = rectF3.right;
                float f14 = rectF3.top;
                rectF4.set(f13 - L5, f14, f13, f14 + L5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f15 = rectF3.right;
                float f16 = rectF3.bottom;
                rectF4.set(f15 - L5, f16 - L5, f15, f16);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(14.5f), rectF3.bottom + org.telegram.messenger.i0.L(5.66f));
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(21.0f), rectF3.bottom);
                float f17 = rectF3.left;
                float f18 = rectF3.bottom;
                rectF4.set(f17, f18 - L5, f17 + L5, f18);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += org.telegram.messenger.i0.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L5, d);
                canvas.restore();
                canvas.save();
                canvas.scale(T1, T1, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - k10) + org.telegram.messenger.i0.L(11.0f), (rectF.top - org.telegram.messenger.i0.L(9.66f)) - (L2 / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ii iiVar = this.b;
        if (view != iiVar) {
            return super.drawChild(canvas, view, j10);
        }
        float x10 = iiVar.getX();
        float y3 = iiVar.getY();
        float x11 = iiVar.getX() + iiVar.getWidth();
        float y10 = iiVar.getY() + iiVar.getHeight();
        RectF rectF = this.D;
        rectF.set(x10, y3, x11, y10);
        org.telegram.messenger.i0.i3(rectF, iiVar.getScaleX(), iiVar.getPivotX() + iiVar.getX(), iiVar.getPivotY() + iiVar.getY());
        a(canvas, rectF, org.telegram.messenger.i0.L(10.0f), iiVar.getAlpha());
        Path path = this.L;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ii iiVar = this.b;
        iiVar.setPivotX(iiVar.getWidth() - org.telegram.messenger.i0.L(15.0f));
        iiVar.setPivotY(iiVar.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        dc dcVar = this.n;
        if (action == 0) {
            dcVar.c(contains);
            if (this.M && !contains) {
                if (!this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.i) {
                c(!this.M, true);
            }
            dcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        return dcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        org.telegram.messenger.i0.d0(this.b, new ag.s2(this, i10, 6));
    }
}
