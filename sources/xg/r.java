package xg;

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
import bi.dc;
import bi.qd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.x90;
import tg.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends FrameLayout {
    public final qd a;
    public final o b;
    public final TextView c;
    public final aa0 d;
    public final u6 e;
    public final x90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public r(Context context, u6 u6Var) {
        super(context);
        this.e = u6Var;
        LinearLayout d = wh.d(context, 1);
        qd qdVar = new qd(context, 1, 0, 4);
        this.a = qdVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = y6.Mj;
        canvas.drawColor(i0.a.f(0.5f, y6.w0(i10, u6Var), y6.w0(y6.h5, u6Var)));
        qdVar.setBackgroundBitmap(createBitmap);
        ug.g gVar = qdVar.b;
        gVar.z = i10;
        gVar.A = y6.Lj;
        gVar.b();
        d.addView(qdVar, kb1.u(160, 160, 1));
        o oVar = new o(this, context);
        this.b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.a;
        w1Var.q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.l = new dc(this, 5);
        w1Var.c();
        qdVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.c = textView;
        wh.j(22.0f, 1, textView);
        int i11 = y6.G6;
        f7.V(textView, i11, u6Var);
        textView.setGravity(1);
        d.addView(textView, kb1.x(-2, -2, 1, 24, -8, 24, 0));
        x90 x90Var = new x90(this);
        this.f = x90Var;
        aa0 aa0Var = new aa0(context, x90Var, u6Var);
        this.d = aa0Var;
        aa0Var.setTextSize(1, 15.0f);
        aa0Var.setGravity(17);
        f7.V(aa0Var, i11, u6Var);
        aa0Var.setMovementMethod(LinkMovementMethod.getInstance());
        f7.H(aa0Var, y6.J6, u6Var);
        aa0Var.setImportantForAccessibility(2);
        d.addView(aa0Var, kb1.h(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, kb1.i(-1, 234, 48));
        addView(d);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = y6.Lj;
        u6 u6Var = this.e;
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.Mj, u6Var);
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
        x90 x90Var = this.f;
        if (x90Var != null) {
            canvas.save();
            aa0 aa0Var = this.d;
            canvas.translate(aa0Var.getLeft(), aa0Var.getTop());
            if (x90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qd qdVar = this.a;
        o oVar = this.b;
        oVar.setTranslationY(((qdVar.getMeasuredHeight() / 2.0f) + qdVar.getTop()) - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new p());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = y6.a7;
        u6 u6Var = this.e;
        f7.i(i10, this, u6Var);
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        aa0 aa0Var = this.d;
        aa0Var.setText(formatString);
        f7.V(aa0Var, y6.r5, u6Var);
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
        qd qdVar = this.a;
        final float f7 = qdVar.b.l;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(qdVar.e0);
        qdVar.d();
        qdVar.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xg.m
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
                ug.g gVar = rVar.a.b;
                gVar.f = (f13 * 360.0f * (z11 ? 1 : -1)) + gVar.f;
                rVar.a.b.b();
                rVar.a(rVar.a.b.l);
            }
        });
        this.n.addListener(new q(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(ds.h);
        this.n.start();
    }
}
