// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class re1 extends FrameLayout implements snb {
    public final mm E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final mm J;
    public boolean a;
    public final vnb b;
    public final ema c;
    public final ImageView d;
    public final di2 e;
    public final in f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public re1(Context context, vnb vnbVar) {
        super(context);
        this.a = false;
        this.E = new mm(300L, this, k43.f);
        this.J = new mm(400L, this, k43.h);
        this.b = vnbVar;
        yob.h(aob.d6, vnbVar, this);
        ema emaVar = new ema(getContext());
        this.c = emaVar;
        emaVar.setTextSize(16);
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setEllipsizeByGradient(true);
        addView(emaVar, tre.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        di2 di2Var = new di2(hl.L(7.0f), hl.L(1.35f), aob.v0(aob.n6, vnbVar));
        this.e = di2Var;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(di2Var);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        di2Var.setBounds(0, 0, hl.L(14.0f), hl.L(14.0f));
        addView(imageView, tre.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        in inVar = new in(getContext(), false, true, true);
        this.f = inVar;
        inVar.setTextColor(aob.v0(aob.z6, vnbVar));
        inVar.b(0.4f, 120L, k43.g);
        inVar.setTextSize(hl.L(13.0f));
        addView(inVar, tre.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ve1.I.setColor(aob.v0(aob.Fi, vnbVar));
        ve1.J.setColor(aob.v0(aob.V8, vnbVar));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z, boolean z2, long j) {
        this.w = tL_username;
        this.x = z;
        this.y = j;
        invalidate();
        if (this.w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        byte b = 1;
        this.I = j == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z3 = this.a;
        boolean z4 = this.I;
        in inVar = this.f;
        if (z3) {
            inVar.c(ob6.M0(z4 ? 2131743301 : this.H ? 2131743302 : 2131743300, null), z2, !this.H);
        } else {
            inVar.c(ob6.M0(z4 ? 2131743305 : this.H ? 2131743306 : 2131743304, null), z2, !this.H);
        }
        boolean z5 = this.H || this.I;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z5 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new qe1(this, b));
            this.G.setDuration(120L);
            this.G.setInterpolator(k43.g);
            this.G.start();
            return;
        }
        this.F = z5 ? 1.0f : 0.0f;
        int i = aob.z6;
        vnb vnbVar = this.b;
        int f = vm2.f(this.F, aob.v0(i, vnbVar), aob.v0(aob.n6, vnbVar));
        this.e.b(f);
        inVar.setTextColor(f);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ema emaVar = this.c;
        if (!isEmpty) {
            emaVar.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(ob6.M0(2131743303, null));
            spannableString.setSpan(new ho4(aob.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            emaVar.l(spannableStringBuilder, false);
        }
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        float e = this.J.e(false, this.H ? 1.0f : 0.0f);
        Drawable[] drawableArr = this.h;
        if (e < 1.0f) {
            f2 = 0.0f;
            canvas.drawCircle(hl.L(35.0f), hl.L(29.0f), hl.L(16.0f), ve1.J);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f = 255.0f;
            drawableArr[1].setBounds(bp1.A(2, hl.L(35.0f), drawableArr[1]), bp1.y(2, hl.L(29.0f), drawableArr[1]), bp1.w(2, hl.L(35.0f), drawableArr[1]), bp1.i(2, hl.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f = 255.0f;
            f2 = 0.0f;
        }
        if (e > f2) {
            Paint paint = ve1.I;
            int i = (int) (e * f);
            paint.setAlpha(i);
            canvas.drawCircle(hl.L(35.0f), hl.L(29.0f), hl.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i);
            drawableArr[0].setBounds(bp1.A(2, hl.L(35.0f), drawableArr[0]), bp1.y(2, hl.L(29.0f), drawableArr[0]), bp1.w(2, hl.L(35.0f), drawableArr[0]), bp1.i(2, hl.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e2 = this.E.e(false, this.x ? 1.0f : f2);
        if (e2 > f2) {
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) (alpha * e2));
            canvas.drawRect(hl.L(70.0f), getHeight() - 1, getWidth(), getHeight(), aob.j0);
            aob.j0.setAlpha(alpha);
        }
        Paint paint2 = ve1.K;
        paint2.setColor(aob.w0(null, aob.Li, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = hl.P;
        rectF.set(getWidth() - hl.L(37.0f), hl.L(25.0f), getWidth() - hl.L(21.0f), hl.L(27.0f));
        canvas.drawRoundRect(rectF, hl.L(0.3f), hl.L(0.3f), paint2);
        rectF.set(getWidth() - hl.L(37.0f), hl.L(31.0f), getWidth() - hl.L(21.0f), hl.L(33.0f));
        canvas.drawRoundRect(rectF, hl.L(0.3f), hl.L(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z) {
        if (this.r != z) {
            this.r = z;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            byte b = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new qe1(this, b));
            this.s.addListener(new z7((byte) 12, this, z));
            this.s.setInterpolator(k43.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // snb
    public final void updateColors() {
        di2 di2Var;
        in inVar;
        vnb vnbVar = this.b;
        try {
            ve1.I.setColor(aob.v0(aob.Fi, vnbVar));
            ve1.J.setColor(aob.v0(aob.V8, vnbVar));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (di2Var = this.e) != null && (inVar = this.f) != null) {
                int f = vm2.f(this.F, aob.v0(aob.z6, vnbVar), aob.v0(aob.n6, vnbVar));
                di2Var.b(f);
                inVar.setTextColor(f);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
