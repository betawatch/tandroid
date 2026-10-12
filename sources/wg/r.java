package wg;

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
import di.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.jg0;
import sg.w1;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final jg0 a;
    public final o b;
    public final TextView c;
    public final da0 d;
    public final c6 e;
    public final aa0 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, c6 c6Var) {
        super(context);
        this.e = c6Var;
        LinearLayout e = yh.e(context, 1);
        jg0 jg0Var = new jg0(context, 1, 0, 3);
        this.a = jg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = g6.Mj;
        canvas.drawColor(i0.a.d(0.5f, g6.w0(i10, c6Var), g6.w0(g6.h5, c6Var)));
        jg0Var.setBackgroundBitmap(createBitmap);
        tg.g gVar = jg0Var.b;
        gVar.z = i10;
        gVar.A = g6.Lj;
        gVar.b();
        e.addView(jg0Var, a6.q(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.a;
        w1Var.q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.l = new w7(this, 4);
        w1Var.c();
        jg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        yh.k(22.0f, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.w0(i11, c6Var));
        textView.setGravity(1);
        e.addView(textView, a6.t(-2, -2, 1, 24, -8, 24, 0));
        aa0 aa0Var = new aa0(this);
        this.f = aa0Var;
        da0 da0Var = new da0(context, aa0Var, c6Var);
        this.d = da0Var;
        da0Var.setTextSize(1, 15.0f);
        da0Var.setGravity(17);
        da0Var.setTextColor(g6.w0(i11, c6Var));
        da0Var.setMovementMethod(LinkMovementMethod.getInstance());
        da0Var.setLinkTextColor(g6.w0(g6.J6, c6Var));
        da0Var.setImportantForAccessibility(2);
        e.addView(da0Var, a6.a(-2.0f, 24.0f, 8.0f, 24.0f, 18.0f, -1, 17));
        setClipChildren(false);
        addView(oVar, a6.e(-1, 234, 48));
        addView(e);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = g6.Lj;
        c6 c6Var = this.e;
        int w02 = g6.w0(i10, c6Var);
        int w03 = g6.w0(g6.Mj, c6Var);
        int d = i0.a.d(f7, w02, -371690);
        int d10 = i0.a.d(f7, w03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.d(i11 / (paintArr.length - 1), d, d10), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        aa0 aa0Var = this.f;
        if (aa0Var != null) {
            canvas.save();
            da0 da0Var = this.d;
            canvas.translate(da0Var.getLeft(), da0Var.getTop());
            if (aa0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        jg0 jg0Var = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((jg0Var.getMeasuredHeight() / 2.0f) + jg0Var.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = g6.a7;
        c6 c6Var = this.e;
        setBackgroundColor(g6.w0(i10, c6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        da0 da0Var = this.d;
        da0Var.setText(formatString);
        da0Var.setTextColor(g6.w0(g6.r5, c6Var));
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
        jg0 jg0Var = this.a;
        final float f7 = jg0Var.b.l;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(jg0Var.b0);
        jg0Var.d();
        jg0Var.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r rVar = r.this;
                float[] fArr2 = fArr;
                float f11 = f7;
                float f12 = f10;
                boolean z11 = z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f13 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                rVar.a.b.l = AndroidUtilities.lerp(f11, f12, floatValue);
                tg.g gVar = rVar.a.b;
                gVar.f = (f13 * 360.0f * (z11 ? 1 : -1)) + gVar.f;
                rVar.a.b.b();
                rVar.a(rVar.a.b.l);
            }
        });
        this.n.addListener(new q(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(es.h);
        this.n.start();
    }
}
