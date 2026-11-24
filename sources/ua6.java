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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ua6 extends FrameLayout {
    public static pi4 y;
    public final hn a;
    public final hn b;
    public final be0 c;
    public final ShapeDrawable d;
    public boolean e;
    public final wjb f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public ua6(Context context, wjb wjbVar) {
        super(context);
        this.w = 0.0f;
        this.f = wjbVar;
        be0 be0Var = new be0(context);
        this.c = be0Var;
        ShapeDrawable K = bkb.K(gl.L(42.0f), -1);
        this.d = K;
        be0Var.setBackground(K);
        be0Var.t(gl.L(30.0f), gl.L(30.0f));
        boolean z = k96.a0;
        addView(be0Var, nme.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 11.0f, z ? 15.0f : 0.0f, 0.0f));
        hn hnVar = new hn(context, true, true, true);
        this.a = hnVar;
        s33 s33Var = s33.h;
        hnVar.b(0.4f, 350L, s33Var);
        hnVar.setScaleProperty(0.6f);
        hnVar.setTextSize(gl.L(16.0f));
        hnVar.setEllipsizeByGradient(true);
        zkb.U(hnVar, bkb.F6, wjbVar);
        hnVar.setTypeface(gl.o());
        hnVar.setGravity(k96.a0 ? 5 : 3);
        hnVar.getDrawable().N = gl.q.x;
        kk7.i(hnVar);
        boolean z2 = k96.a0;
        addView(hnVar, nme.d(-1, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 16 : 73, 10.0f, z2 ? 73 : 16, 0.0f));
        hn hnVar2 = new hn(context, true, true, true);
        this.b = hnVar2;
        hnVar2.setScaleProperty(0.6f);
        hnVar2.b(0.4f, 350L, s33Var);
        hnVar2.setTextSize(gl.L(14.0f));
        hnVar2.setEllipsizeByGradient(true);
        zkb.U(hnVar2, bkb.z6, wjbVar);
        hnVar2.setGravity(k96.a0 ? 5 : 3);
        boolean z3 = k96.a0;
        addView(hnVar2, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 16 : 73, 35.0f, z3 ? 73 : 16, 0.0f));
        be0Var.setAlpha(this.w);
        hnVar.setAlpha(this.w);
        hnVar2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i, boolean z, boolean z2) {
        String str;
        CharSequence charSequence;
        this.e = z;
        hn hnVar = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = vu3.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), hnVar.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            hnVar.c(charSequence, this.h && !k96.a0 && z2, true);
        }
        hn hnVar2 = this.b;
        if (tL_messageMediaVenue != null) {
            hnVar2.c(tL_messageMediaVenue.address, this.h && !k96.a0 && z2, true);
        }
        int i2 = i % 7;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        be0 be0Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                zkb.x(this, mutate, bkb.dj, this.f, PorterDuff.Mode.MULTIPLY);
                fm2 fm2Var = new fm2(bkb.K(gl.L(42.0f), 0), mutate);
                int L = gl.L(42.0f);
                int L2 = gl.L(42.0f);
                fm2Var.h = L;
                fm2Var.n = L2;
                int L3 = gl.L(24.0f);
                int L4 = gl.L(24.0f);
                fm2Var.e = L3;
                fm2Var.f = L4;
                be0Var.setImageDrawable(fm2Var);
            } else {
                be0Var.o(tL_messageMediaVenue.icon, null, null);
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
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ta6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = abs;
                float R1 = gl.R1(f, f2, j > 0 ? Math.min(Math.max(elapsedRealtime2 / j, 0.0f), 1.0f) : 1.0f);
                ua6 ua6Var = ua6.this;
                ua6Var.w = R1;
                ua6Var.c.setAlpha(R1);
                ua6Var.a.setAlpha(ua6Var.w);
                ua6Var.b.setAlpha(ua6Var.w);
                ua6Var.invalidate();
            }
        });
        this.x.setDuration(z3 ? Long.MAX_VALUE : abs);
        this.x.start();
        be0Var.setAlpha(f);
        hnVar.setAlpha(f);
        hnVar2.setAlpha(f);
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

    public be0 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        pi4 pi4Var = y;
        wjb wjbVar = this.f;
        if (pi4Var == null) {
            pi4 pi4Var2 = new pi4(getContext(), wjbVar);
            y = pi4Var2;
            pi4Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        pi4 pi4Var3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = gl.L(56.0f);
        pi4Var3.P = measuredWidth;
        pi4Var3.Q = measuredHeight;
        pi4Var3.R = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(gl.L(2.0f), ug8.D(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = wjbVar == null ? null : wjbVar.d("paintDivider");
            if (d == null) {
                d = bkb.j0;
            }
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(72.0f), getHeight() - 1, k96.a0 ? getWidth() - gl.L(72.0f) : getWidth(), getHeight() - 1, d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z) {
        this.h = z;
    }
}
