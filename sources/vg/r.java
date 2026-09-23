package vg;

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
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.zf0;
import rg.u1;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final zf0 a;
    public final o b;
    public final TextView c;
    public final d90 d;
    public final d6 e;
    public final a90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        LinearLayout f7 = ul.f(context, 1);
        zf0 zf0Var = new zf0(context, 1, 0, 3);
        this.a = zf0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.v0(i10, d6Var), h6.v0(h6.h5, d6Var)));
        zf0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = zf0Var.b;
        aVar.w = i10;
        aVar.x = h6.Lj;
        aVar.b();
        f7.addView(zf0Var, x5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        u1 u1Var = oVar.a;
        u1Var.q = false;
        u1Var.K = false;
        u1Var.L = true;
        u1Var.H = true;
        u1Var.l = new x7(this, 4);
        u1Var.c();
        zf0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        ul.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setGravity(1);
        f7.addView(textView, x5.t(-2, -2, 1, 24, -8, 24, 0));
        a90 a90Var = new a90(this);
        this.f = a90Var;
        d90 d90Var = new d90(context, a90Var, d6Var);
        this.d = d90Var;
        d90Var.setTextSize(1, 15.0f);
        d90Var.setGravity(17);
        d90Var.setTextColor(h6.v0(i11, d6Var));
        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
        d90Var.setLinkTextColor(h6.v0(h6.J6, d6Var));
        d90Var.setImportantForAccessibility(2);
        f7.addView(d90Var, x5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, x5.e(-1, 234, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = h6.Lj;
        d6 d6Var = this.e;
        int v02 = h6.v0(i10, d6Var);
        int v03 = h6.v0(h6.Mj, d6Var);
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
        zf0 zf0Var = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((zf0Var.getMeasuredHeight() / 2.0f) + zf0Var.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = h6.a7;
        d6 d6Var = this.e;
        setBackgroundColor(h6.v0(i10, d6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        d90 d90Var = this.d;
        d90Var.setText(formatString);
        d90Var.setTextColor(h6.v0(h6.r5, d6Var));
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
        zf0 zf0Var = this.a;
        final float f7 = zf0Var.b.i;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(zf0Var.U);
        zf0Var.d();
        zf0Var.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                zf0 zf0Var2 = rVar.a;
                zf0Var2.b.i = AndroidUtilities.lerp(f7, f10, floatValue);
                sg.a aVar = zf0Var2.b;
                aVar.f = (f11 * 360.0f * (z10 ? 1 : -1)) + aVar.f;
                aVar.b();
                rVar.a(zf0Var2.b.i);
            }
        });
        this.n.addListener(new q(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(rr.h);
        this.n.start();
    }
}
