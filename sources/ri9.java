// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ri9 {
    public static final Paint C;
    public final int B;
    public final tj9 a;
    public final boolean b;
    public final TL_keyboard.PageButton c;
    public int d;
    public int e;
    public final boolean f;
    public final boolean h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public final PorterDuffColorFilter m;
    public PorterDuffColorFilter n;
    public int o;
    public final uj9 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public qa6 x;
    public boolean y;
    public final Paint g = new Paint(1);
    public final RectF z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e3, code lost:
    
        if (a66.q(((org.telegram.tgnet.tl.TL_keyboard.TL_inlineButtonTypeUrl) r21).url) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ri9(uj9 uj9Var, int i, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, Runnable runnable) {
        wlb wlbVar;
        wlb wlbVar2;
        int i2;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int v0;
        Drawable drawable;
        int v02;
        this.p = uj9Var;
        this.B = Math.max(1, i);
        this.t = runnable;
        this.c = pageButton;
        this.b = z;
        this.q = z2;
        this.r = z3;
        this.f = z5;
        this.s = z4;
        boolean booleanValue = bool != null ? bool.booleanValue() : uj9Var.D();
        wlb wlbVar3 = wlb.h;
        if (richButtonStyle != null) {
            if (richButtonStyle.bg_primary) {
                wlbVar = wlb.n;
            } else if (richButtonStyle.bg_danger) {
                wlbVar = wlb.r;
            } else if (richButtonStyle.bg_success) {
                wlbVar = wlb.s;
            }
            wlbVar2 = wlb.h;
            if (wlbVar == wlbVar2 && z5) {
                wlbVar = wlb.w;
            }
            do4 do4Var = new do4(!booleanValue ? wlbVar.f : wlbVar.c, null);
            do4Var.c = !z ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z4) {
                spannableStringBuilder2.setSpan(do4Var, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new g6c("", (wkb) null), 0, spannableStringBuilder2.length(), 33);
            }
            gm.J2(spannableStringBuilder2);
            Layout.getDesiredWidth(spannableStringBuilder2, uj9Var.w);
            tj9 tj9Var = new tj9(uj9Var, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = tj9Var;
            tj9Var.r = true;
            tj9Var.w = true;
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth)) {
                    if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl)) {
                        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView)) {
                            i2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline ? R.drawable.mini_inline_switch_16 : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy ? R.drawable.bot_card : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? R.drawable.mini_inline_profile_16 : 0;
                        }
                    }
                    i2 = R.drawable.bot_webview;
                }
                i2 = R.drawable.mini_inline_arrow_16;
            } else {
                i2 = R.drawable.mini_inline_copy_16;
            }
            if (i2 != 0) {
                this.i = b10.d(a.b, i2);
            }
            this.e = i();
            ylb ylbVar = uj9Var.D;
            boolean a = ylbVar == null ? ylbVar.a() : cmb.I.o();
            if (booleanValue && a) {
                v02 = cmb.v0(cmb.tb, uj9Var.D);
                int v03 = cmb.v0(cmb.ub, uj9Var.D);
                int v04 = cmb.v0(cmb.vb, uj9Var.D);
                if (v02 == 0 || v03 != 0 || v04 != 0) {
                    z6 = true;
                    if (z6 && wlbVar != wlb.n) {
                        wlbVar = wlbVar2;
                    }
                    i3 = !booleanValue ? wlbVar.d : wlbVar.a;
                    if (booleanValue) {
                        i4 = wlbVar.b;
                        i5 = wlbVar.c;
                    } else {
                        i4 = wlbVar.e;
                        i5 = wlbVar.f;
                    }
                    int v05 = cmb.v0(i5, uj9Var.D);
                    this.h = false;
                    if (z6 || wlbVar != wlb.n) {
                        if (!cmb.d1(i3) || wlbVar == wlb.n) {
                            this.j = cmb.v0(i3, uj9Var.D);
                            if (cmb.d1(i4)) {
                                this.k = on2.f(0.1f, this.j, v05);
                            } else {
                                this.k = cmb.v0(i4, uj9Var.D);
                            }
                        } else {
                            this.j = cmb.p1(wlbVar == wlbVar2 ? 0.08f : 0.1f, cmb.v0(i5, uj9Var.D));
                            this.k = cmb.p1(0.16f, cmb.v0(i5, uj9Var.D));
                        }
                    } else {
                        int v06 = cmb.v0(i5, uj9Var.D);
                        this.k = v06;
                        this.j = v06;
                        this.h = true;
                    }
                    v0 = cmb.v0(i5, uj9Var.D);
                    v0 = z ? cmb.p1(0.5f, v0) : v0;
                    if (v0 == this.l || this.m == null) {
                        this.l = v0;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    do4Var.b = i5;
                    runnable.run();
                    drawable = this.i;
                    if (drawable == null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.l, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
            }
            z6 = false;
            if (z6) {
                wlbVar = wlbVar2;
            }
            if (!booleanValue) {
            }
            if (booleanValue) {
            }
            int v052 = cmb.v0(i5, uj9Var.D);
            this.h = false;
            if (z6) {
            }
            if (cmb.d1(i3)) {
            }
            this.j = cmb.v0(i3, uj9Var.D);
            if (cmb.d1(i4)) {
            }
            v0 = cmb.v0(i5, uj9Var.D);
            if (z) {
            }
            if (v0 == this.l) {
            }
            this.l = v0;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            do4Var.b = i5;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        wlbVar = wlb.h;
        wlbVar2 = wlb.h;
        if (wlbVar == wlbVar2) {
            wlbVar = wlb.w;
        }
        do4 do4Var2 = new do4(!booleanValue ? wlbVar.f : wlbVar.c, null);
        do4Var2.c = !z ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z4) {
        }
        gm.J2(spannableStringBuilder22);
        Layout.getDesiredWidth(spannableStringBuilder22, uj9Var.w);
        tj9 tj9Var2 = new tj9(uj9Var, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = tj9Var2;
        tj9Var2.r = true;
        tj9Var2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i2 != 0) {
        }
        this.e = i();
        ylb ylbVar2 = uj9Var.D;
        if (ylbVar2 == null) {
        }
        if (booleanValue) {
            v02 = cmb.v0(cmb.tb, uj9Var.D);
            int v032 = cmb.v0(cmb.ub, uj9Var.D);
            int v042 = cmb.v0(cmb.vb, uj9Var.D);
            if (v02 == 0) {
            }
            z6 = true;
            if (z6) {
            }
            if (!booleanValue) {
            }
            if (booleanValue) {
            }
            int v0522 = cmb.v0(i5, uj9Var.D);
            this.h = false;
            if (z6) {
            }
            if (cmb.d1(i3)) {
            }
            this.j = cmb.v0(i3, uj9Var.D);
            if (cmb.d1(i4)) {
            }
            v0 = cmb.v0(i5, uj9Var.D);
            if (z) {
            }
            if (v0 == this.l) {
            }
            this.l = v0;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            do4Var2.b = i5;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        z6 = false;
        if (z6) {
        }
        if (!booleanValue) {
        }
        if (booleanValue) {
        }
        int v05222 = cmb.v0(i5, uj9Var.D);
        this.h = false;
        if (z6) {
        }
        if (cmb.d1(i3)) {
        }
        this.j = cmb.v0(i3, uj9Var.D);
        if (cmb.d1(i4)) {
        }
        v0 = cmb.v0(i5, uj9Var.D);
        if (z) {
        }
        if (v0 == this.l) {
        }
        this.l = v0;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        do4Var2.b = i5;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(View view) {
        this.a.i(view);
    }

    public final void b(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Canvas canvas2;
        float f;
        int i5;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.u) {
            float f2 = this.v;
            if (f2 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / gm.r) / 100.0f) + f2;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z = this.f;
        float f3 = z ? 0.09f : 0.04f;
        float f4 = ((1.0f - this.v) * f3) + (1.0f - f3);
        canvas.save();
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, this.e / 2.0f, d() / 2.0f);
        }
        boolean z2 = this.h;
        boolean z3 = this.s;
        boolean z4 = z2 && !z3;
        int i6 = this.j;
        int i7 = this.k;
        if (z4) {
            canvas.saveLayer(0.0f, 0.0f, this.e, d(), null);
            i4 = i6;
            i3 = i7;
        } else {
            if (this.u) {
                i = i7;
                i2 = i;
            } else {
                i = i6;
                i2 = i7;
            }
            Paint paint = this.g;
            paint.setColor(i);
            if (z3) {
                i3 = i2;
                i4 = i6;
            } else {
                i3 = i2;
                i4 = i6;
                canvas.drawRoundRect(0.0f, 0.0f, this.e, d(), d() / 2.0f, d() / 2.0f, paint);
            }
            c(canvas);
        }
        canvas.save();
        int j = j();
        int k = k();
        boolean z5 = l() > Math.max(1, k() - j());
        if (z5) {
            canvas2 = canvas;
            canvas2.saveLayer(j, -gm.L(10.0f), k, gm.L(10.0f) + d(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(j, -gm.L(10.0f), k, gm.L(10.0f) + d());
        canvas2.save();
        tj9 tj9Var = this.a;
        StaticLayout staticLayout = tj9Var.b;
        ArrayList arrayList = tj9Var.x;
        StaticLayout staticLayout2 = tj9Var.b;
        int i8 = tj9Var.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z6 = tj9Var.s > 0;
        if (z6) {
            canvas2.translate(m() - i8, (d() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(m() - i8, ((d() - staticLayout2.getHeight()) / 2.0f) - gm.L(1.0f));
        } else if (z) {
            canvas2.translate(m() - i8, (-lineBaseline) + ((d() * 43) / 56));
        } else {
            canvas2.translate(m() - i8, (-lineBaseline) + ((d() * 65) / nm7.m1));
        }
        tj9Var.d(canvas2, tj9Var.T);
        uj9 uj9Var = this.p;
        if (uj9Var.E()) {
            canvas2.translate(0.0f, gm.L(z6 ? 0.0f : z3 ? 0.66f : 2.0f));
            StaticLayout staticLayout3 = tj9Var.b;
            if (z3) {
                int i9 = staticLayout3.getPaint().linkColor;
                if (this.o != i9 || (porterDuffColorFilter = this.n) == null) {
                    this.o = i9;
                    porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
                    this.n = porterDuffColorFilter;
                }
                f = 2.0f;
                i5 = k;
                gn.drawAnimatedEmojis(canvas2, tj9Var.b, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                canvas2 = canvas;
            } else {
                f = 2.0f;
                i5 = k;
                canvas2 = canvas;
                gn.drawAnimatedEmojis(canvas2, staticLayout3, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f = 2.0f;
            i5 = k;
        }
        canvas2.restore();
        if (z5) {
            float d = d();
            RectF rectF = this.A;
            rectF.set(i5 - gm.L(8.0f), 0.0f, i5, d);
            uj9Var.z.r(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            ur3.d(drawable, this.e - gm.L(12.33f), gm.L(z ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z4) {
            int i10 = this.u ? i3 : i4;
            Paint paint2 = C;
            paint2.setColor(i10);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, d(), d() / f, d() / f, paint2);
            canvas.restore();
            c(canvas);
        }
        canvas.restore();
    }

    public final void c(Canvas canvas) {
        rc2 rc2Var;
        TL_keyboard.PageButton pageButton = this.c;
        boolean z = (pageButton == null || (rc2Var = this.p.E) == null || !rc2Var.P0(pageButton)) ? false : true;
        boolean z2 = this.y;
        Runnable runnable = this.t;
        if (z2 != z) {
            this.y = z;
            qa6 qa6Var = this.x;
            if (z) {
                if (qa6Var == null) {
                    qa6 qa6Var2 = new qa6();
                    this.x = qa6Var2;
                    qa6Var2.D = true;
                    qa6Var2.x.setStrokeWidth(gm.N(1.25f));
                } else {
                    qa6Var.b = -1L;
                    qa6Var.c = -1L;
                }
            } else if (qa6Var != null) {
                qa6Var.a();
            }
            runnable.run();
        }
        qa6 qa6Var3 = this.x;
        if (qa6Var3 != null) {
            if (z || qa6Var3.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f = this.e;
                float d = d();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f, d);
                float f2 = strokeWidth / 2.0f;
                rectF.inset(f2, f2);
                this.x.h((d() / 2.0f) - f2);
                this.x.e(rectF);
                qa6 qa6Var4 = this.x;
                int i = this.l;
                qa6Var4.g(cmb.p1(0.07f, i), cmb.p1(0.175f, i), cmb.p1(0.175f, i), cmb.p1(0.42f, i));
                this.x.setAlpha(nm7.d4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int d() {
        boolean z = this.f;
        uj9 uj9Var = this.p;
        return gm.L(z ? uj9Var.M * 1.166666f : uj9Var.M + 18);
    }

    public final int e() {
        if (this.i == null) {
            return 0;
        }
        return (gm.L(11.66f) / 2) + gm.L(12.33f);
    }

    public final int f() {
        return Math.min(i(), e() + d());
    }

    public final int g() {
        if (this.s) {
            return 0;
        }
        boolean z = this.q;
        boolean z2 = this.f;
        if (z && z2) {
            return gm.L(4.0f);
        }
        if (z2) {
            return gm.L(7.0f);
        }
        return gm.L(this.i != null ? 26.0f : 20.0f);
    }

    public final int h() {
        if (this.s) {
            return 0;
        }
        boolean z = this.r;
        Drawable drawable = this.i;
        boolean z2 = this.f;
        if (z && z2) {
            return gm.L((drawable != null ? 14 : 0) + 4);
        }
        if (z2) {
            return gm.L((drawable != null ? 14 : 0) + 7);
        }
        return gm.L(drawable != null ? 26.0f : 20.0f);
    }

    public final int i() {
        return Math.min(this.B, h() + g() + l());
    }

    public final int j() {
        if (this.s) {
            return 0;
        }
        return this.f ? g() : gm.L(8.0f);
    }

    public final int k() {
        if (this.s) {
            return this.e;
        }
        return this.e - (this.f ? h() : Math.max(gm.L(8.0f), e()));
    }

    public final int l() {
        tj9 tj9Var = this.a;
        return tj9Var.h - tj9Var.f;
    }

    public final float m() {
        if (this.f) {
            return g();
        }
        if (l() > Math.max(1, k() - j())) {
            return j();
        }
        int i = this.e;
        return this.i == null ? (i - l()) / 2.0f : Math.max(Math.min((i - l()) / 2.0f, (this.e - e()) - l()), gm.L(8.0f));
    }

    public final void n(boolean z) {
        if (this.u != z) {
            this.u = z;
            this.t.run();
            if (z) {
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.w.cancel();
                    this.w = null;
                    return;
                }
                return;
            }
            float f = this.v;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new p29(this, (byte) 4));
                this.w.addListener(new c39((Object) this, (byte) 2));
                ValueAnimator valueAnimator2 = this.w;
                boolean z2 = this.f;
                valueAnimator2.setInterpolator(new OvershootInterpolator(z2 ? 3.5f : 2.0f));
                this.w.setDuration(z2 ? 420L : 350L);
                this.w.start();
            }
        }
    }
}
