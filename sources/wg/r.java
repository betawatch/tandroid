package wg;

import ai.ae;
import ai.kc;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y90;
import sg.w1;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final ae a;
    public final o b;
    public final TextView c;
    public final y90 d;
    public final g6 e;
    public final v90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, g6 g6Var) {
        super(context);
        this.e = g6Var;
        LinearLayout e = sl.e(context, 1);
        ae aeVar = new ae(context, 1, 0, 4);
        this.a = aeVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = k6.Mj;
        canvas.drawColor(i0.a.f(0.5f, k6.w0(i10, g6Var), k6.w0(k6.h5, g6Var)));
        aeVar.setBackgroundBitmap(createBitmap);
        tg.g gVar = aeVar.b;
        gVar.z = i10;
        gVar.A = k6.Lj;
        gVar.b();
        e.addView(aeVar, z5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.a;
        w1Var.q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.l = new kc(this, 5);
        w1Var.c();
        aeVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        sl.k(22.0f, 1, textView);
        int i11 = k6.G6;
        r6.W(textView, i11, g6Var);
        textView.setGravity(1);
        e.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        v90 v90Var = new v90(this);
        this.f = v90Var;
        y90 y90Var = new y90(context, v90Var, g6Var);
        this.d = y90Var;
        y90Var.setTextSize(1, 15.0f);
        y90Var.setGravity(17);
        r6.W(y90Var, i11, g6Var);
        y90Var.setMovementMethod(LinkMovementMethod.getInstance());
        r6.I(y90Var, k6.J6, g6Var);
        y90Var.setImportantForAccessibility(2);
        e.addView(y90Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, z5.e(-1, 234, 48));
        addView(e);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = k6.Lj;
        g6 g6Var = this.e;
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.Mj, g6Var);
        int f10 = i0.a.f(f7, w02, -371690);
        int f11 = i0.a.f(f7, w03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.f(i11 / (paintArr.length - 1), f10, f11), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v90 v90Var = this.f;
        if (v90Var != null) {
            canvas.save();
            y90 y90Var = this.d;
            canvas.translate(y90Var.getLeft(), y90Var.getTop());
            if (v90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ae aeVar = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((aeVar.getMeasuredHeight() / 2.0f) + aeVar.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = k6.a7;
        g6 g6Var = this.e;
        r6.i(i10, this, g6Var);
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        y90 y90Var = this.d;
        y90Var.setText(formatString);
        r6.W(y90Var, k6.r5, g6Var);
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
        ae aeVar = this.a;
        final float f7 = aeVar.b.l;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(aeVar.e0);
        aeVar.d();
        aeVar.l();
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
        this.n.setInterpolator(bs.h);
        this.n.start();
    }
}
