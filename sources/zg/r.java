package zg;

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
import b8.mf;
import ci.ab;
import ci.ic;
import m2.p0;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.xq;
import vg.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final ic a;
    public final o b;
    public final TextView c;
    public final s70 d;
    public final e6 e;
    public final p0 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, e6 e6Var) {
        super(context);
        this.e = e6Var;
        LinearLayout f10 = k5.f(context, 1);
        ic icVar = new ic(context, 1, 0, 5);
        this.a = icVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = k6.Ak;
        canvas.drawColor(i0.a.f(0.5f, k6.w0(i3, e6Var), k6.w0(k6.h5, e6Var)));
        icVar.setBackgroundBitmap(createBitmap);
        wg.f fVar = icVar.b;
        fVar.z = i3;
        fVar.A = k6.zk;
        fVar.b();
        f10.addView(icVar, mf.r(hs.q2, hs.q2, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        s1 s1Var = oVar.a;
        s1Var.q = false;
        s1Var.K = false;
        s1Var.L = true;
        s1Var.H = true;
        s1Var.l = new ab(this, 5);
        s1Var.c();
        icVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 22.0f);
        int i10 = k6.G6;
        r6.V(textView, i10, e6Var);
        textView.setGravity(1);
        f10.addView(textView, mf.t(-2, -2, 1, 24, -8, 24, 0));
        p0 p0Var = new p0(this);
        this.f = p0Var;
        s70 s70Var = new s70(context, p0Var, e6Var);
        this.d = s70Var;
        s70Var.setTextSize(1, 15.0f);
        s70Var.setGravity(17);
        r6.V(s70Var, i10, e6Var);
        s70Var.setMovementMethod(LinkMovementMethod.getInstance());
        r6.H(s70Var, k6.J6, e6Var);
        s70Var.setImportantForAccessibility(2);
        f10.addView(s70Var, mf.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, mf.e(-1, hs.J3, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i3 = k6.zk;
        e6 e6Var = this.e;
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.Ak, e6Var);
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
        p0 p0Var = this.f;
        if (p0Var != null) {
            canvas.save();
            s70 s70Var = this.d;
            canvas.translate(s70Var.getLeft(), s70Var.getTop());
            if (p0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ic icVar = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((icVar.getMeasuredHeight() / 2.0f) + icVar.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i3 = k6.a7;
        e6 e6Var = this.e;
        r6.i(i3, this, e6Var);
        this.c.setText(bd.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        String a02 = bd.a0(null, null, t3.V(chat) ? 2131753510 : 2131753505, new Object[0]);
        s70 s70Var = this.d;
        s70Var.setText(a02);
        r6.V(s70Var, k6.r5, e6Var);
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
        ic icVar = this.a;
        final float f10 = icVar.b.l;
        final float f11 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(icVar.f0);
        icVar.d();
        icVar.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zg.m
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
                wg.f fVar = rVar.a.b;
                fVar.f = (f14 * 360.0f * (z11 ? 1 : -1)) + fVar.f;
                rVar.a.b.b();
                rVar.a(rVar.a.b.l);
            }
        });
        this.n.addListener(new q(this, fArr, f10, f11, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(xq.h);
        this.n.start();
    }
}
