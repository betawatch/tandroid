package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.j60;
import org.telegram.ui.l61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class r3 extends FrameLayout {
    public final Paint B;
    public final RectF C;
    public final RectF D;
    public final Path E;
    public boolean F;
    public final org.telegram.ui.Components.z5 G;
    public k01 H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.fa a;
    public final m3 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final org.telegram.ui.web.o0 h;
    public final rc n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public k01 w;
    public final Path x;
    public final RectF y;

    /* JADX WARN: Type inference failed for: r5v0, types: [ph.l3] */
    public r3(Context context, nh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final w8 w8Var = (w8) this;
        this.h = new org.telegram.ui.web.o0(w8Var, 20);
        this.n = new rc(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.x = path;
        this.y = new RectF();
        this.B = new Paint(1);
        this.C = new RectF();
        this.D = new RectF();
        this.E = new Path();
        this.G = new org.telegram.ui.Components.z5(this, 0L, 320L, nr.h);
        this.I = new Path();
        this.J = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.a = new org.telegram.ui.Components.fa(baVar, this, 0, !w8Var.L.o0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i10 = 0;
        m3 m3Var = new m3(w8Var, context, UserConfig.selectedAccount, new Utilities.Callback2() { // from class: ph.l3
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                w8 w8Var2 = w8Var;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        w51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < w8Var2.d.size(); i14++) {
                            Integer num = (Integer) w8Var2.d.get(i14);
                            int intValue = num.intValue();
                            u6 u6Var = (u6) w8Var2.c.get(intValue);
                            int i15 = p3.a;
                            i51 J = i51.J(p3.class);
                            J.d = intValue;
                            J.G = u6Var;
                            J.z = i13;
                            J.K(w8Var2.f == intValue);
                            J.f = w8Var2.e.contains(num);
                            J.D = new lh.y0(w8Var2, intValue, 23);
                            arrayList.add(J);
                            if (w8Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        w51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        w8Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            w8Var2.d.add(Integer.valueOf(((i51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) w8Var2.b, (h5.d) new mg.i(w8Var2, 4));
                        break;
                }
            }
        }, new lh.m5(w8Var, 25), bVar);
        this.b = m3Var;
        m3Var.V2.r = false;
        m3Var.setClipToPadding(false);
        m3Var.setClipChildren(false);
        m3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(m3Var, k7.b6.e(-2, 120, 85));
        m3Var.w1(true);
        final int i11 = 1;
        m3Var.B1(new Utilities.Callback2() { // from class: ph.l3
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                w8 w8Var2 = w8Var;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        w51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < w8Var2.d.size(); i14++) {
                            Integer num = (Integer) w8Var2.d.get(i14);
                            int intValue = num.intValue();
                            u6 u6Var = (u6) w8Var2.c.get(intValue);
                            int i15 = p3.a;
                            i51 J = i51.J(p3.class);
                            J.d = intValue;
                            J.G = u6Var;
                            J.z = i13;
                            J.K(w8Var2.f == intValue);
                            J.f = w8Var2.e.contains(num);
                            J.D = new lh.y0(w8Var2, intValue, 23);
                            arrayList.add(J);
                            if (w8Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        w51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        w8Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            w8Var2.d.add(Integer.valueOf(((i51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) w8Var2.b, (h5.d) new mg.i(w8Var2, 4));
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

    public final void a(Canvas canvas, RectF rectF, float f10, float f11) {
        if (f11 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f11), 31);
        }
        w8 w8Var = (w8) this;
        boolean c3 = w8Var.L.o0.c();
        org.telegram.ui.Components.fa faVar = this.a;
        Paint paint = this.B;
        if (c3) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = w8Var.K;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                faVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = faVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint3);
                }
                paint.setAlpha((int) (f11 * 51.0f));
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
        }
        if (f11 < 1.0f) {
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

    public final void c(boolean z4, boolean z10) {
        if (this.J == z4) {
            return;
        }
        this.J = z4;
        m3 m3Var = this.b;
        m3Var.animate().cancel();
        if (z10) {
            m3Var.setVisibility(0);
            org.telegram.ui.b.p(m3Var.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.65f).scaleY(z4 ? 1.0f : 0.65f).setListener(new l61(10, this, z4)).setUpdateListener(new nh.e5(this, 17)), nr.h, 360L);
        } else {
            m3Var.setVisibility(z4 ? 0 : 8);
            m3Var.setAlpha(z4 ? 1.0f : 0.0f);
            m3Var.setScaleX(z4 ? 1.0f : 0.65f);
            m3Var.setScaleY(z4 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z4 && this.F) {
            this.F = false;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.n.a(0.1f);
        canvas.save();
        float width = getWidth() - AndroidUtilities.dp(42.0f);
        float height = getHeight() - AndroidUtilities.dp(34.0f);
        float width2 = getWidth() - AndroidUtilities.dp(12.0f);
        float height2 = getHeight() - AndroidUtilities.dp(4.0f);
        RectF rectF = this.r;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        float dp = AndroidUtilities.dp(2.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(dp);
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        k01 k01Var = this.w;
        m3 m3Var = this.b;
        if (k01Var != null) {
            k01Var.c(rectF.centerX() - (this.w.c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - m3Var.getAlpha(), -1, canvas);
        }
        if (m3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (m3Var.getAlpha() * 255.0f));
            canvas.drawPath(this.x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.H != null) {
            float e = this.G.e(this.F);
            if (e > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e);
                float l10 = this.H.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                float f10 = rectF.right - l10;
                float dp3 = (rectF.top - AndroidUtilities.dp(9.66f)) - dp2;
                float f11 = rectF.right;
                float dp4 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.C;
                rectF3.set(f10, dp3, f11, dp4);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e) * AndroidUtilities.dp(4.0f));
                Path path = this.E;
                path.rewind();
                float dp5 = AndroidUtilities.dp(8.0f);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                RectF rectF4 = this.D;
                rectF4.set(f12, f13, f12 + dp5, f13 + dp5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f14 = rectF3.right;
                float f15 = rectF3.top;
                rectF4.set(f14 - dp5, f15, f14, f15 + dp5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f16 = rectF3.right;
                float f17 = rectF3.bottom;
                rectF4.set(f16 - dp5, f17 - dp5, f16, f17);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f18 = rectF3.left;
                float f19 = rectF3.bottom;
                rectF4.set(f18, f19 - dp5, f18 + dp5, f19);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, dp5, e);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.H.c((rectF.right - l10) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), e, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m3 m3Var = this.b;
        if (view != m3Var) {
            return super.drawChild(canvas, view, j10);
        }
        float x10 = m3Var.getX();
        float y10 = m3Var.getY();
        float x11 = m3Var.getX() + m3Var.getWidth();
        float y11 = m3Var.getY() + m3Var.getHeight();
        RectF rectF = this.y;
        rectF.set(x10, y10, x11, y11);
        AndroidUtilities.scaleRect(rectF, m3Var.getScaleX(), m3Var.getPivotX() + m3Var.getX(), m3Var.getPivotY() + m3Var.getY());
        a(canvas, rectF, AndroidUtilities.dp(10.0f), m3Var.getAlpha());
        Path path = this.I;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        m3 m3Var = this.b;
        m3Var.setPivotX(m3Var.getWidth() - AndroidUtilities.dp(15.0f));
        m3Var.setPivotY(m3Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        rc rcVar = this.n;
        if (action == 0) {
            rcVar.c(contains);
            if (this.J && !contains) {
                if (!this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                rcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h) {
                c(!this.J, true);
            }
            rcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
        }
        return rcVar.h || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new j60(this, i10, 1));
    }
}
