// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yc6 extends FrameLayout {
    public static tk4 y;
    public final in a;
    public final in b;
    public final de0 c;
    public final ShapeDrawable d;
    public boolean e;
    public final vnb f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public yc6(Context context, vnb vnbVar) {
        super(context);
        this.w = 0.0f;
        this.f = vnbVar;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        ShapeDrawable K = aob.K(hl.L(42.0f), -1);
        this.d = K;
        de0Var.setBackground(K);
        de0Var.t(hl.L(30.0f), hl.L(30.0f));
        boolean z = ob6.a0;
        addView(de0Var, tre.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 11.0f, z ? 15.0f : 0.0f, 0.0f));
        in inVar = new in(context, true, true, true);
        this.a = inVar;
        k43 k43Var = k43.h;
        inVar.b(0.4f, 350L, k43Var);
        inVar.setScaleProperty(0.6f);
        inVar.setTextSize(hl.L(16.0f));
        inVar.setEllipsizeByGradient(true);
        yob.U(inVar, aob.G6, vnbVar);
        inVar.setTypeface(hl.o());
        inVar.setGravity(ob6.a0 ? 5 : 3);
        inVar.getDrawable().N = hl.q.x;
        jn7.i(inVar);
        boolean z2 = ob6.a0;
        addView(inVar, tre.d(-1, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 16 : 73, 10.0f, z2 ? 73 : 16, 0.0f));
        in inVar2 = new in(context, true, true, true);
        this.b = inVar2;
        inVar2.setScaleProperty(0.6f);
        inVar2.b(0.4f, 350L, k43Var);
        inVar2.setTextSize(hl.L(14.0f));
        inVar2.setEllipsizeByGradient(true);
        yob.U(inVar2, aob.A6, vnbVar);
        inVar2.setGravity(ob6.a0 ? 5 : 3);
        boolean z3 = ob6.a0;
        addView(inVar2, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 16 : 73, 35.0f, z3 ? 73 : 16, 0.0f));
        de0Var.setAlpha(this.w);
        inVar.setAlpha(this.w);
        inVar2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i, boolean z, boolean z2) {
        String str;
        CharSequence charSequence;
        this.e = z;
        in inVar = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = pv3.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), inVar.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            inVar.c(charSequence, this.h && !ob6.a0 && z2, true);
        }
        in inVar2 = this.b;
        if (tL_messageMediaVenue != null) {
            inVar2.c(tL_messageMediaVenue.address, this.h && !ob6.a0 && z2, true);
        }
        int i2 = i % 7;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        de0 de0Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                yob.x(this, mutate, aob.ej, this.f, PorterDuff.Mode.MULTIPLY);
                zm2 zm2Var = new zm2(aob.K(hl.L(42.0f), 0), mutate);
                int L = hl.L(42.0f);
                int L2 = hl.L(42.0f);
                zm2Var.h = L;
                zm2Var.n = L2;
                int L3 = hl.L(24.0f);
                int L4 = hl.L(24.0f);
                zm2Var.e = L3;
                zm2Var.f = L4;
                de0Var.setImageDrawable(zm2Var);
            } else {
                de0Var.o(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(i3);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z3 = tL_messageMediaVenue == null;
        final float f = this.w;
        final float f2 = z3 ? 0.0f : 1.0f;
        final long abs = (long) (Math.abs(f - f2) * 150.0f);
        this.x = ValueAnimator.ofFloat(f, f2);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xc6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = abs;
                float R1 = hl.R1(f, f2, j > 0 ? Math.min(Math.max(elapsedRealtime2 / j, 0.0f), 1.0f) : 1.0f);
                yc6 yc6Var = yc6.this;
                yc6Var.w = R1;
                yc6Var.c.setAlpha(R1);
                yc6Var.a.setAlpha(yc6Var.w);
                yc6Var.b.setAlpha(yc6Var.w);
                yc6Var.invalidate();
            }
        });
        this.x.setDuration(z3 ? Long.MAX_VALUE : abs);
        this.x.start();
        de0Var.setAlpha(f);
        inVar.setAlpha(f);
        inVar2.setAlpha(f);
        try {
            try {
                if (tL_messageMediaVenue == null) {
                    setContentDescription(null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
                        sb.append(tL_messageMediaVenue.title);
                    }
                    String str2 = tL_messageMediaVenue != null ? tL_messageMediaVenue.address : null;
                    if (!TextUtils.isEmpty(str2)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append((CharSequence) str2);
                    }
                    setContentDescription(sb.length() > 0 ? sb.toString() : null);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            setContentDescription(null);
        }
        invalidate();
    }

    public de0 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tk4 tk4Var = y;
        vnb vnbVar = this.f;
        if (tk4Var == null) {
            tk4 tk4Var2 = new tk4(getContext(), vnbVar);
            y = tk4Var2;
            tk4Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        tk4 tk4Var3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = hl.L(56.0f);
        tk4Var3.P = measuredWidth;
        tk4Var3.Q = measuredHeight;
        tk4Var3.R = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(hl.L(2.0f), ik8.D(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = vnbVar == null ? null : vnbVar.d("paintDivider");
            if (d == null) {
                d = aob.j0;
            }
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(72.0f), getHeight() - 1, ob6.a0 ? getWidth() - hl.L(72.0f) : getWidth(), getHeight() - 1, d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z) {
        this.h = z;
    }
}
