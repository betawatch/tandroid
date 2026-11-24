// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class u17 extends FrameLayout implements jm7 {
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final pg6 K;
    public zna L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final q17 R;
    public im0 S;
    public final Path T;
    public final RectF U;
    public final ylb a;
    public final t17 b;
    public final jg2 c;
    public final n17 d;
    public final pt7 e;
    public final k17 f;
    public final d h;
    public float n;
    public float r;
    public float s;
    public float w;
    public k0 x;
    public r17 y;

    /* JADX WARN: Multi-variable type inference failed */
    public u17(Context context, long j, long j2, d dVar, ylb ylbVar) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new pg6(this, (byte) 16);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new q17(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = dVar;
        this.a = ylbVar;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(gm.L(126.0f), gm.q.y * 0.22f);
        t17 t17Var = new t17(this, context, ylbVar);
        this.b = t17Var;
        jg2 jg2Var = new jg2((byte) 3, this, false);
        this.c = jg2Var;
        jg2Var.i1(1);
        n17 n17Var = new n17(this);
        this.d = n17Var;
        n17Var.O = new o17(this);
        sc3 sc3Var = new sc3();
        sc3Var.c = (short) 150;
        sc3Var.e = (short) 150;
        sc3Var.f = (short) 150;
        sc3Var.g = (short) 150;
        sc3Var.d = (short) 150;
        sc3Var.o = d53.f;
        sc3Var.C = false;
        t17Var.setItemAnimator(sc3Var);
        t17Var.setClipToPadding(false);
        t17Var.setLayoutManager(jg2Var);
        k17 k17Var = new k17(context, j, j2, new p17(this, dVar), ylbVar, h());
        this.f = k17Var;
        pt7 pt7Var = new pt7();
        pt7Var.d = null;
        pt7Var.f = false;
        ot7 ot7Var = new ot7(pt7Var, 0 == true ? 1 : 0);
        pt7Var.c = k17Var;
        k17Var.B(ot7Var);
        this.e = pt7Var;
        t17Var.setAdapter(pt7Var);
        t17Var.setTranslationY(gm.L(6.0f));
        addView(t17Var, qoe.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        n17 n17Var;
        k17 k17Var;
        t17 t17Var = this.b;
        if (t17Var == null || this.c == null) {
            return;
        }
        boolean g = g();
        this.s = 0.0f;
        pt7 pt7Var = this.e;
        if (g) {
            float min = Math.min(Math.max(0.0f, t17Var.getTranslationY() + (pt7Var.f ? pt7Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            this.r = min;
        } else {
            this.n = Math.max(Math.max(0.0f, t17Var.getTranslationY() + (pt7Var.f ? pt7Var.e.getBottom() : 0)) - this.s, this.N * getHeight());
            this.r = getMeasuredHeight();
        }
        im0 im0Var = this.S;
        if (im0Var != null) {
            im0Var.setBounds(0, ((int) this.n) - gm.L(5.0f), getMeasuredWidth(), gm.L(5.0f) + ((int) this.r));
            Path path = this.T;
            path.rewind();
            Rect rect = this.S.S.m;
            RectF rectF = this.U;
            rectF.set(rect);
            if (t17Var == null || (n17Var = this.d) == null || t17Var.getLayoutManager() != n17Var || (k17Var = this.f) == null || k17Var.S == null) {
                path.addRoundRect(rectF, gm.L(22.0f), gm.L(22.0f), Path.Direction.CW);
            } else {
                rectF.inset(gm.L(2.0f), gm.L(2.0f));
                path.addRoundRect(rectF, gm.L(20.0f), gm.L(20.0f), Path.Direction.CW);
            }
            path.close();
            invalidate();
        }
    }

    public final void c() {
        int i;
        n17 n17Var;
        k17 k17Var;
        t17 t17Var = this.b;
        if (t17Var == null || this.c == null) {
            return;
        }
        boolean z = (t17Var == null || (n17Var = this.d) == null || t17Var.getLayoutManager() != n17Var || (k17Var = this.f) == null || k17Var.S == null) ? false : true;
        if (this.S == null) {
            t17Var.setPadding(0, 0, 0, 0);
            return;
        }
        float f = 5.0f;
        int L = gm.L(z ? 7.0f : 5.0f);
        if (z) {
            i = gm.L(2.0f);
            f = 7.0f;
        } else {
            i = 0;
        }
        t17Var.setPadding(L, i, gm.L(f), z ? gm.L(2.0f) : 0);
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.n;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            gm.d0(this.b, new bn0((byte) 18));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float min;
        im0 im0Var = this.S;
        if (im0Var != null) {
            im0Var.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g = g();
        k17 k17Var = this.f;
        this.s = gm.L((((k17Var.N() || k17Var.S != null) && (k17Var.y0 || k17Var.B0 != null) && k17Var.I() == null && k17Var.V == null) ? 2 : 0) + 2);
        canvas.save();
        float L = gm.L(6.0f);
        float f = this.n;
        pt7 pt7Var = this.e;
        t17 t17Var = this.b;
        Rect rect = this.E;
        if (g) {
            float min2 = Math.min(Math.max(0.0f, t17Var.getTranslationY() + (pt7Var.f ? pt7Var.e.getTop() : getHeight())) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.r = min2;
            rect.set(0, 0, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (t17Var.getLayoutManager() == this.d) {
                this.s += gm.L(2.0f);
                L += gm.L(2.0f);
            }
            float max = Math.max(0.0f, t17Var.getTranslationY() + (pt7Var.f ? pt7Var.e.getBottom() : 0)) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f - this.n) > 0.1f) {
            i();
        }
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setShadowLayer(gm.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.F;
        Integer num = this.G;
        paint2.setColor(num != null ? num.intValue() : cmb.v0(cmb.Ie, this.a));
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f) {
        RectF rectF = gm.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f, f, this.F);
    }

    public final boolean g() {
        f69 layoutManager = this.b.getLayoutManager();
        jg2 jg2Var = this.c;
        return layoutManager == jg2Var && jg2Var.t;
    }

    public k17 getAdapter() {
        return this.f;
    }

    public u46 getCurrentLayoutManager() {
        f69 layoutManager = this.b.getLayoutManager();
        jg2 jg2Var = this.c;
        return layoutManager == jg2Var ? jg2Var : this.d;
    }

    public t17 getListView() {
        return this.b;
    }

    public u46 getNeededLayoutManager() {
        k17 k17Var = this.f;
        return ((k17Var.N() || k17Var.S != null) && (k17Var.y0 || k17Var.B0 != null)) ? this.d : this.c;
    }

    public boolean h() {
        return this instanceof v38;
    }

    public final void o(boolean z) {
        if (z) {
            boolean g = g();
            if (!this.J) {
                this.I = true;
                t17 t17Var = this.b;
                f69 layoutManager = t17Var.getLayoutManager();
                jg2 jg2Var = this.c;
                if (layoutManager == jg2Var) {
                    jg2Var.g1(0, g ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    t17Var.setTranslationY(g ? -(this.w + gm.L(12.0f)) : t17Var.computeVerticalScrollOffset() + this.w);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z;
        pg6 pg6Var = this.K;
        gm.r(pg6Var);
        zna znaVar = this.L;
        if (znaVar != null) {
            znaVar.d();
        }
        d dVar = this.h;
        gm.d3(pg6Var, (dVar == null || !dVar.getFragmentBeginToShow()) ? 100L : 0L);
        if (z) {
            m();
        } else {
            j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }

    public final void p(r17 r17Var) {
        this.y = r17Var;
        t17 listView = getListView();
        k0 k0Var = new k0(this, r17Var, (byte) 16);
        this.x = k0Var;
        listView.setOnItemClickListener(k0Var);
        getListView().setOnTouchListener(new a7(this, (byte) 10));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(im0 im0Var) {
        this.S = im0Var;
        im0Var.r(gm.L(22.0f));
        this.S.q(gm.L(5.0f));
        c();
    }

    public void setDialogId(long j) {
        k17 k17Var = this.f;
        if (k17Var.n != j) {
            k17Var.n = j;
        }
    }

    public void setIgnoreLayout(boolean z) {
        this.H = z;
    }

    public void setOverrideColor(int i) {
        this.G = Integer.valueOf(i);
        invalidate();
    }

    public void setReversed(boolean z) {
        if (z != g()) {
            this.I = true;
            this.c.j1(z);
            k17 k17Var = this.f;
            if (k17Var.M0 != z) {
                k17Var.M0 = z;
                int i = k17Var.N0;
                if (i > 0) {
                    k17Var.g(0);
                }
                if (i > 1) {
                    k17Var.g(i - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z) {
    }

    public void m() {
    }

    public void n(boolean z) {
    }
}
