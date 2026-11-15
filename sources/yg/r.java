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
import c8.ja;
import di.pa;
import di.xb;
import n2.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z70;
import ug.r1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final xb a;
    public final o b;
    public final TextView c;
    public final z70 d;
    public final e6 e;
    public final o0 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, e6 e6Var) {
        super(context);
        this.e = e6Var;
        LinearLayout f10 = k5.f(context, 1);
        xb xbVar = new xb(context, 1, 0, 5);
        this.a = xbVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = j6.Dk;
        canvas.drawColor(i0.a.f(0.5f, j6.w0(i7, e6Var), j6.w0(j6.h5, e6Var)));
        xbVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = xbVar.b;
        fVar.z = i7;
        fVar.A = j6.Ck;
        fVar.b();
        f10.addView(xbVar, ja.r(ns.q2, ns.q2, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        r1 r1Var = oVar.a;
        r1Var.q = false;
        r1Var.K = false;
        r1Var.L = true;
        r1Var.H = true;
        r1Var.l = new pa(this, 5);
        r1Var.c();
        xbVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        i20.o(textView, 1, 22.0f);
        int i10 = j6.G6;
        q6.U(textView, i10, e6Var);
        textView.setGravity(1);
        f10.addView(textView, ja.t(-2, -2, 1, 24, -8, 24, 0));
        o0 o0Var = new o0(this);
        this.f = o0Var;
        z70 z70Var = new z70(context, o0Var, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 15.0f);
        z70Var.setGravity(17);
        q6.U(z70Var, i10, e6Var);
        z70Var.setMovementMethod(LinkMovementMethod.getInstance());
        q6.G(z70Var, j6.J6, e6Var);
        z70Var.setImportantForAccessibility(2);
        f10.addView(z70Var, ja.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, ja.e(-1, ns.J3, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = j6.Ck;
        e6 e6Var = this.e;
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.Dk, e6Var);
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
            z70 z70Var = this.d;
            canvas.translate(z70Var.getLeft(), z70Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        xb xbVar = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((xbVar.getMeasuredHeight() / 2.0f) + xbVar.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i7 = j6.a7;
        e6 e6Var = this.e;
        q6.h(i7, this, e6Var);
        this.c.setText(hd.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        String a02 = hd.a0(null, null, t3.V(chat) ? 2131753510 : 2131753505, new Object[0]);
        z70 z70Var = this.d;
        z70Var.setText(a02);
        q6.U(z70Var, j6.r5, e6Var);
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
        xb xbVar = this.a;
        final float f10 = xbVar.b.l;
        final float f11 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(xbVar.f0);
        xbVar.d();
        xbVar.l();
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
        this.n.setInterpolator(er.h);
        this.n.start();
    }
}
