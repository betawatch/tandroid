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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tc6 extends FrameLayout {
    public static tk4 y;
    public final io a;
    public final io b;
    public final bf0 c;
    public final ShapeDrawable d;
    public boolean e;
    public final ylb f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public tc6(Context context, ylb ylbVar) {
        super(context);
        this.w = 0.0f;
        this.f = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        ShapeDrawable K = cmb.K(gm.L(42.0f), -1);
        this.d = K;
        bf0Var.setBackground(K);
        bf0Var.t(gm.L(30.0f), gm.L(30.0f));
        boolean z = jb6.a0;
        addView(bf0Var, qoe.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 11.0f, z ? 15.0f : 0.0f, 0.0f));
        io ioVar = new io(context, true, true, true);
        this.a = ioVar;
        d53 d53Var = d53.h;
        ioVar.b(0.4f, 350L, d53Var);
        ioVar.setScaleProperty(0.6f);
        ioVar.setTextSize(gm.L(16.0f));
        ioVar.setEllipsizeByGradient(true);
        anb.U(ioVar, cmb.F6, ylbVar);
        ioVar.setTypeface(gm.o());
        ioVar.setGravity(jb6.a0 ? 5 : 3);
        ioVar.getDrawable().N = gm.q.x;
        nm7.i(ioVar);
        boolean z2 = jb6.a0;
        addView(ioVar, qoe.d(-1, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 16 : 73, 10.0f, z2 ? 73 : 16, 0.0f));
        io ioVar2 = new io(context, true, true, true);
        this.b = ioVar2;
        ioVar2.setScaleProperty(0.6f);
        ioVar2.b(0.4f, 350L, d53Var);
        ioVar2.setTextSize(gm.L(14.0f));
        ioVar2.setEllipsizeByGradient(true);
        anb.U(ioVar2, cmb.z6, ylbVar);
        ioVar2.setGravity(jb6.a0 ? 5 : 3);
        boolean z3 = jb6.a0;
        addView(ioVar2, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 16 : 73, 35.0f, z3 ? 73 : 16, 0.0f));
        bf0Var.setAlpha(this.w);
        ioVar.setAlpha(this.w);
        ioVar2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i, boolean z, boolean z2) {
        String str;
        CharSequence charSequence;
        this.e = z;
        io ioVar = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = gw3.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), ioVar.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            ioVar.c(charSequence, this.h && !jb6.a0 && z2, true);
        }
        io ioVar2 = this.b;
        if (tL_messageMediaVenue != null) {
            ioVar2.c(tL_messageMediaVenue.address, this.h && !jb6.a0 && z2, true);
        }
        int i2 = i % 7;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        bf0 bf0Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                anb.x(this, mutate, cmb.dj, this.f, PorterDuff.Mode.MULTIPLY);
                sn2 sn2Var = new sn2(cmb.K(gm.L(42.0f), 0), mutate);
                int L = gm.L(42.0f);
                int L2 = gm.L(42.0f);
                sn2Var.h = L;
                sn2Var.n = L2;
                int L3 = gm.L(24.0f);
                int L4 = gm.L(24.0f);
                sn2Var.e = L3;
                sn2Var.f = L4;
                bf0Var.setImageDrawable(sn2Var);
            } else {
                bf0Var.o(tL_messageMediaVenue.icon, null, null);
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
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sc6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j = abs;
                float R1 = gm.R1(f, f2, j > 0 ? Math.min(Math.max(elapsedRealtime2 / j, 0.0f), 1.0f) : 1.0f);
                tc6 tc6Var = tc6.this;
                tc6Var.w = R1;
                tc6Var.c.setAlpha(R1);
                tc6Var.a.setAlpha(tc6Var.w);
                tc6Var.b.setAlpha(tc6Var.w);
                tc6Var.invalidate();
            }
        });
        this.x.setDuration(z3 ? Long.MAX_VALUE : abs);
        this.x.start();
        bf0Var.setAlpha(f);
        ioVar.setAlpha(f);
        ioVar2.setAlpha(f);
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

    public bf0 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        tk4 tk4Var = y;
        ylb ylbVar = this.f;
        if (tk4Var == null) {
            tk4 tk4Var2 = new tk4(getContext(), ylbVar);
            y = tk4Var2;
            tk4Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        tk4 tk4Var3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = gm.L(56.0f);
        tk4Var3.P = measuredWidth;
        tk4Var3.Q = measuredHeight;
        tk4Var3.R = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(gm.L(2.0f), wi8.D(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = ylbVar == null ? null : ylbVar.d("paintDivider");
            if (d == null) {
                d = cmb.j0;
            }
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(72.0f), getHeight() - 1, jb6.a0 ? getWidth() - gm.L(72.0f) : getWidth(), getHeight() - 1, d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z) {
        this.h = z;
    }
}
