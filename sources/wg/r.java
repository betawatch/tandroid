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
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.eg0;
import sg.y1;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final eg0 a;
    public final o b;
    public final TextView c;
    public final d90 d;
    public final f6 e;
    public final a90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f7 = wl.f(context, 1);
        eg0 eg0Var = new eg0(context, 1, 0, 3);
        this.a = eg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.h5, f6Var)));
        eg0Var.setBackgroundBitmap(createBitmap);
        tg.a aVar = eg0Var.b;
        aVar.w = i10;
        aVar.x = j6.Lj;
        aVar.b();
        f7.addView(eg0Var, x5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        y1 y1Var = oVar.a;
        y1Var.q = false;
        y1Var.K = false;
        y1Var.L = true;
        y1Var.H = true;
        y1Var.l = new a8(this, 4);
        y1Var.c();
        eg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        wl.j(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f7.addView(textView, x5.t(-2, -2, 1, 24, -8, 24, 0));
        a90 a90Var = new a90(this);
        this.f = a90Var;
        d90 d90Var = new d90(context, a90Var, f6Var);
        this.d = d90Var;
        d90Var.setTextSize(1, 15.0f);
        d90Var.setGravity(17);
        d90Var.setTextColor(j6.v0(i11, f6Var));
        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
        d90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        d90Var.setImportantForAccessibility(2);
        f7.addView(d90Var, x5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, x5.e(-1, 234, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = j6.Lj;
        f6 f6Var = this.e;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.Mj, f6Var);
        int d = i0.a.d(f7, v02, -371690);
        int d10 = i0.a.d(f7, v03, -14281);
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
        a90 a90Var = this.f;
        if (a90Var != null) {
            canvas.save();
            d90 d90Var = this.d;
            canvas.translate(d90Var.getLeft(), d90Var.getTop());
            if (a90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        eg0 eg0Var = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((eg0Var.getMeasuredHeight() / 2.0f) + eg0Var.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = j6.a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i10, f6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        d90 d90Var = this.d;
        d90Var.setText(formatString);
        d90Var.setTextColor(j6.v0(j6.r5, f6Var));
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
        eg0 eg0Var = this.a;
        final float f7 = eg0Var.b.i;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(eg0Var.U);
        eg0Var.d();
        eg0Var.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                eg0 eg0Var2 = rVar.a;
                eg0Var2.b.i = AndroidUtilities.lerp(f7, f10, floatValue);
                tg.a aVar = eg0Var2.b;
                aVar.f = (f11 * 360.0f * (z10 ? 1 : -1)) + aVar.f;
                aVar.b();
                rVar.a(eg0Var2.b.i);
            }
        });
        this.n.addListener(new q(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(pr.h);
        this.n.start();
    }
}
