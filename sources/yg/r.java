package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.bc;
import di.ta;
import n2.o0;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import ug.s1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final bc a;
    public final o b;
    public final TextView c;
    public final m80 d;
    public final h6 e;
    public final o0 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, h6 h6Var) {
        super(context);
        this.e = h6Var;
        LinearLayout g10 = f3.g(context, 1);
        bc bcVar = new bc(context, 1, 0, 5);
        this.a = bcVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = m6.Dk;
        canvas.drawColor(i0.a.f(0.5f, m6.w0(i7, h6Var), m6.w0(m6.h5, h6Var)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = bcVar.b;
        fVar.z = i7;
        fVar.A = m6.Ck;
        fVar.b();
        g10.addView(bcVar, ma.r(ks.q2, ks.q2, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        s1 s1Var = oVar.a;
        s1Var.q = false;
        s1Var.K = false;
        s1Var.L = true;
        s1Var.H = true;
        s1Var.l = new ta(this, 5);
        s1Var.c();
        bcVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        n10.p(textView, 1, 22.0f);
        int i10 = m6.G6;
        t6.U(textView, i10, h6Var);
        textView.setGravity(1);
        g10.addView(textView, ma.t(-2, -2, 1, 24, -8, 24, 0));
        o0 o0Var = new o0(this);
        this.f = o0Var;
        m80 m80Var = new m80(context, o0Var, h6Var);
        this.d = m80Var;
        m80Var.setTextSize(1, 15.0f);
        m80Var.setGravity(17);
        t6.U(m80Var, i10, h6Var);
        m80Var.setMovementMethod(LinkMovementMethod.getInstance());
        t6.G(m80Var, m6.J6, h6Var);
        m80Var.setImportantForAccessibility(2);
        g10.addView(m80Var, ma.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, ma.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = m6.Ck;
        h6 h6Var = this.e;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.Dk, h6Var);
        int f11 = i0.a.f(f10, w02, -371690);
        int f12 = i0.a.f(f10, w03, -14281);
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            paintArr[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (paintArr.length - 1), f11, f12), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o0 o0Var = this.f;
        if (o0Var != null) {
            canvas.save();
            m80 m80Var = this.d;
            canvas.translate(m80Var.getLeft(), m80Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        bc bcVar = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((bcVar.getMeasuredHeight() / 2.0f) + bcVar.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i7 = m6.a7;
        h6 h6Var = this.e;
        t6.h(i7, this, h6Var);
        this.c.setText(gd.a0("BoostingBoostsViaGifts", null, 2131753559, new Object[0]));
        String a02 = gd.a0(null, null, v3.V(chat) ? 2131753507 : 2131753502, new Object[0]);
        m80 m80Var = this.d;
        m80Var.setText(a02);
        t6.U(m80Var, m6.r5, h6Var);
    }

    public void setPaused(boolean z10) {
        this.a.setPaused(z10);
        this.b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bc bcVar = this.a;
        final float f10 = bcVar.b.l;
        final float f11 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(bcVar.f0);
        bcVar.d();
        bcVar.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r rVar = r.this;
                float[] fArr2 = fArr;
                float f12 = f10;
                float f13 = f11;
                boolean z11 = z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                rVar.a.b.l = g0.T1(f12, f13, floatValue);
                vg.f fVar = rVar.a.b;
                fVar.f = (f14 * 360.0f * (z11 ? 1 : -1)) + fVar.f;
                rVar.a.b.b();
                rVar.a(rVar.a.b.l);
            }
        });
        this.n.addListener(new q(this, fArr, f10, f11, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(nr.h);
        this.n.start();
    }
}
