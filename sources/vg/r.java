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
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.cg0;
import rg.x1;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final cg0 a;
    public final o b;
    public final TextView c;
    public final q90 d;
    public final d6 e;
    public final n90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        LinearLayout e7 = bi.e(context, 1);
        cg0 cg0Var = new cg0(context, 1, 0, 3);
        this.a = cg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = i6.Mj;
        canvas.drawColor(i0.a.d(0.5f, i6.v0(i10, d6Var), i6.v0(i6.h5, d6Var)));
        cg0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = cg0Var.b;
        aVar.w = i10;
        aVar.x = i6.Lj;
        aVar.b();
        e7.addView(cg0Var, z5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        x1 x1Var = oVar.a;
        x1Var.q = false;
        x1Var.K = false;
        x1Var.L = true;
        x1Var.H = true;
        x1Var.l = new y7(this, 4);
        x1Var.c();
        cg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        bi.j(22.0f, 1, textView);
        int i11 = i6.G6;
        textView.setTextColor(i6.v0(i11, d6Var));
        textView.setGravity(1);
        e7.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        n90 n90Var = new n90(this);
        this.f = n90Var;
        q90 q90Var = new q90(context, n90Var, d6Var);
        this.d = q90Var;
        q90Var.setTextSize(1, 15.0f);
        q90Var.setGravity(17);
        q90Var.setTextColor(i6.v0(i11, d6Var));
        q90Var.setMovementMethod(LinkMovementMethod.getInstance());
        q90Var.setLinkTextColor(i6.v0(i6.J6, d6Var));
        q90Var.setImportantForAccessibility(2);
        e7.addView(q90Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, z5.e(-1, 234, 48));
        addView(e7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = i6.Lj;
        d6 d6Var = this.e;
        int v02 = i6.v0(i10, d6Var);
        int v03 = i6.v0(i6.Mj, d6Var);
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
        n90 n90Var = this.f;
        if (n90Var != null) {
            canvas.save();
            q90 q90Var = this.d;
            canvas.translate(q90Var.getLeft(), q90Var.getTop());
            if (n90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        cg0 cg0Var = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((cg0Var.getMeasuredHeight() / 2.0f) + cg0Var.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = i6.a7;
        d6 d6Var = this.e;
        setBackgroundColor(i6.v0(i10, d6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        q90 q90Var = this.d;
        q90Var.setText(formatString);
        q90Var.setTextColor(i6.v0(i6.r5, d6Var));
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
        cg0 cg0Var = this.a;
        final float f7 = cg0Var.b.i;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(cg0Var.U);
        cg0Var.d();
        cg0Var.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                cg0 cg0Var2 = rVar.a;
                cg0Var2.b.i = AndroidUtilities.lerp(f7, f10, floatValue);
                sg.a aVar = cg0Var2.b;
                aVar.f = (f11 * 360.0f * (z10 ? 1 : -1)) + aVar.f;
                aVar.b();
                rVar.a(cg0Var2.b.i);
            }
        });
        this.n.addListener(new q(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(tr.h);
        this.n.start();
    }
}
