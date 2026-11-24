// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tc2 {
    public final rc2 a;
    public boolean b;
    public uib c;
    public uib d;
    public u51 e;
    public u51 f;
    public StaticLayout g;
    public StaticLayout h;
    public i66 i;
    public m66 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public p99 t;
    public boolean u;
    public boolean v;

    public tc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int L;
        int extraTextX;
        int i;
        mc2 mc2Var;
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new u51(rc2Var);
        }
        if (this.f == null) {
            u51 u51Var = new u51(rc2Var);
            this.f = u51Var;
            u51Var.f = new dc2(rc2Var, (byte) 0);
        }
        float backgroundDrawableRight = ((rc2Var.getBackgroundDrawableRight() + (yc2Var != null ? yc2Var.i0 : 0.0f)) - gm.L(10 + ((!rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? 0 : 6))) - rc2Var.getExtraTextX();
        f47 f47Var = rc2Var.L;
        if (f47Var == null || f47Var.i) {
            if (rc2Var.Q5.O3()) {
                i = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                if (rc2Var.Q5.D == 19) {
                    i -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i)) - gm.q.x);
                }
            } else {
                boolean z = rc2Var.C6;
                int i2 = rc2Var.N6;
                if (z) {
                    L = gm.L(12.0f) + i2;
                    extraTextX = rc2Var.getExtraTextX();
                } else {
                    L = gm.L(rc2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = rc2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
        } else {
            i = (int) rc2Var.s3;
        }
        int L2 = ((int) (i + yc2Var.h0)) - gm.L(1.33f);
        int i3 = rc2Var.r0;
        float f = L2;
        int i4 = (int) (backgroundDrawableRight - f);
        int x = (int) motionEvent.getX();
        int P1 = (int) rc2Var.P1(motionEvent);
        int L3 = (int) (gm.L(10.0f) + L2 + this.c.c + gm.L(4.0f));
        int L4 = gm.L(4.33f) + i3;
        RectF rectF = gm.P;
        float f2 = L3;
        rectF.set(f2, L4, this.d.c + f2 + gm.L(4.0f), gm.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), rc2Var.P1(motionEvent));
        rectF.set(f, i3, L2 + i4, this.r + i3);
        boolean z2 = !contains && !rc2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), rc2Var.P1(motionEvent));
        if (((z2 && !rc2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                i66 i66Var = new i66(rc2Var);
                this.i = i66Var;
                i66Var.d = new dc2(rc2Var, (byte) 0);
            }
            int L5 = (gm.L(10.0f) + L2) - this.o;
            int L6 = gm.L(22.0f) + i3;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x < L5 || P1 < L6 || x > L5 + i4 || P1 > this.g.getHeight() + L6) {
                    rc2Var.i3(1);
                } else {
                    try {
                        int i5 = P1 - L6;
                        int lineForVertical = this.g.getLineForVertical(i5);
                        float f3 = x - L5;
                        int offsetForHorizontal = this.g.getOffsetForHorizontal(lineForVertical, f3);
                        float lineLeft = this.g.getLineLeft(lineForVertical);
                        if (lineLeft <= f3 && lineLeft + this.g.getLineWidth(lineForVertical) >= f3) {
                            Spannable spannable = (Spannable) this.g.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f6c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof d6c) || d6c.h) && !gm.A1())) {
                                int action = motionEvent.getAction();
                                m66 m66Var = this.j;
                                if (action == 0) {
                                    if (m66Var == null || m66Var.i != characterStyleArr[0]) {
                                        this.i.l(m66Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        ylb ylbVar = rc2Var.cc;
                                        float f4 = i5;
                                        float[] fArr = rc2.Id;
                                        m66 m66Var2 = new m66(characterStyle, ylbVar, f3, f4, 0);
                                        this.j = m66Var2;
                                        p99 p99Var = this.t;
                                        if (p99Var != null) {
                                            m66Var2.d(cmb.p1(0.1f, p99Var.h()));
                                        }
                                        try {
                                            b66 b = this.j.b();
                                            int[] Z1 = rc2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z2 = false;
                                    }
                                    rc2Var.invalidate();
                                } else if (m66Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = m66Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        rc2Var.eb.M(rc2Var, characterStyle3, false);
                                        rc2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
            }
        }
        boolean z3 = this.n && z2;
        if (motionEvent.getAction() == 0) {
            this.u = contains;
            this.v = z3;
        } else if (motionEvent.getAction() == 2) {
            this.u = contains;
            this.v = z3;
        } else if (motionEvent.getAction() == 1) {
            if (this.u) {
                mc2 mc2Var2 = rc2Var.eb;
                if (mc2Var2 != null) {
                    mc2Var2.o0(rc2Var, (int) ((this.d.c / 2.0f) + gm.L(4.0f) + L3), L4);
                }
            } else if (this.v && !yc2Var.a3 && (mc2Var = rc2Var.eb) != null) {
                mc2Var.M0(rc2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            i66 i66Var2 = this.i;
            if (i66Var2 != null) {
                i66Var2.e(true);
            }
            this.j = null;
        }
        this.e.c(this.u);
        this.f.c(this.v);
        return this.u || this.v || this.j != null;
    }

    public final void b(Canvas canvas) {
        int L;
        int extraTextX;
        int i;
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        c47 c47Var = rc2Var.M;
        if (c47Var == null || c47Var.h) {
            float f = this.b ? 1.0f : 0.0f;
            if (yc2Var.S2) {
                f = gm.R1(1.0f - f, f, yc2Var.L1);
            }
            float f2 = f * 1.0f;
            if (f2 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((rc2Var.getBackgroundDrawableRight() + (yc2Var != null ? yc2Var.i0 : 0.0f)) - gm.L(10 + ((!rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? 0 : 6))) - rc2Var.getExtraTextX();
            f47 f47Var = rc2Var.L;
            if (f47Var != null && !f47Var.i) {
                i = (int) rc2Var.s3;
            } else if (rc2Var.Q5.O3()) {
                i = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                if (rc2Var.Q5.D == 19) {
                    i -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i)) - gm.q.x);
                }
            } else {
                boolean z = rc2Var.C6;
                int i2 = rc2Var.N6;
                if (z) {
                    L = gm.L(12.0f) + i2;
                    extraTextX = rc2Var.getExtraTextX();
                } else {
                    L = gm.L(rc2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = rc2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
            int L2 = ((int) (i + yc2Var.h0)) - gm.L(1.33f);
            int i3 = rc2Var.r0;
            float f3 = L2;
            int i4 = (int) (backgroundDrawableRight - f3);
            int i5 = this.r;
            if (yc2Var.Y2) {
                i5 = gm.U1(yc2Var.L1, yc2Var.U2, i5);
            }
            if (this.n && rc2Var.getPrimaryMessageObject() != null) {
                boolean z2 = rc2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = yc2Var.a3;
            p99 p99Var = this.t;
            if (p99Var == null) {
                p99Var = new p99(rc2Var);
                this.t = p99Var;
            }
            int n = p99Var.n(rc2Var.cc);
            canvas.save();
            canvas.translate(f3, i3);
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, i4, i5);
            u51 u51Var = this.f;
            float a = u51Var != null ? u51Var.a(0.01f) : 1.0f;
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f2, false, false);
            this.t.f(canvas, rectF, f2);
            uib uibVar = this.c;
            if (uibVar != null) {
                uibVar.c(gm.L(10.0f), gm.L(12.0f), f2, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (gm.L(10.0f) + this.c.c + gm.L(4.0f)), gm.L(4.33f), gm.L(10.0f) + r1 + this.d.c, gm.L(21.66f));
                    u51 u51Var2 = this.e;
                    float a2 = u51Var2 != null ? u51Var2.a(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, gm.L(17.0f), gm.L(17.0f), this.t.g);
                    this.d.c(gm.L(5.0f) + r1, gm.L(12.0f), f2, n, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas) {
        int L;
        int extraTextX;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        RectF rectF;
        float f3;
        int i4;
        float f4;
        Canvas canvas2 = canvas;
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        c47 c47Var = rc2Var.M;
        if (c47Var == null || c47Var.h) {
            float f5 = this.b ? 1.0f : 0.0f;
            if (yc2Var.S2) {
                f5 = gm.R1(1.0f - f5, f5, yc2Var.L1);
            }
            float f6 = 1.0f * f5;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((rc2Var.getBackgroundDrawableRight() + (yc2Var != null ? yc2Var.i0 : 0.0f)) - gm.L(10 + ((!rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? 0 : 6))) - rc2Var.getExtraTextX();
            f47 f47Var = rc2Var.L;
            if (f47Var == null || f47Var.i) {
                if (rc2Var.Q5.O3()) {
                    i = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                    if (rc2Var.Q5.D == 19) {
                        i -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i)) - gm.q.x);
                    }
                } else {
                    boolean z = rc2Var.C6;
                    int i5 = rc2Var.N6;
                    if (z) {
                        L = gm.L(12.0f) + i5;
                        extraTextX = rc2Var.getExtraTextX();
                    } else {
                        L = gm.L(rc2Var.K ? 12.0f : 18.0f) + i5;
                        extraTextX = rc2Var.getExtraTextX();
                    }
                    i = L + extraTextX;
                }
            } else {
                i = (int) rc2Var.s3;
            }
            int L2 = ((int) (i + yc2Var.h0)) - gm.L(1.33f);
            int i6 = rc2Var.r0;
            float f7 = L2;
            int i7 = (int) (backgroundDrawableRight - f7);
            int i8 = this.r;
            if (yc2Var.Y2) {
                i8 = gm.U1(yc2Var.L1, yc2Var.U2, i8);
            }
            int i9 = i8;
            float f8 = (!this.n || (rc2Var.getPrimaryMessageObject() != null && rc2Var.getPrimaryMessageObject().c3)) ? 1.0f : 0.0f;
            if (yc2Var.a3) {
                f8 = gm.R1(1.0f - f8, f8, yc2Var.L1);
            }
            float f9 = f8;
            p99 p99Var = this.t;
            if (p99Var == null) {
                p99Var = new p99(rc2Var);
                this.t = p99Var;
            }
            int n = p99Var.n(rc2Var.cc);
            canvas2.save();
            canvas2.translate(f7, i6);
            RectF rectF2 = gm.P;
            float f10 = i7;
            float f11 = i9;
            rectF2.set(0.0f, 0.0f, f10, f11);
            u51 u51Var = this.f;
            float a = u51Var != null ? u51Var.a(0.01f) : 1.0f;
            canvas2.scale(a, a, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f3 = f11;
                    i2 = n;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f10, i9 - 1, nm7.d4, 31);
                } else {
                    i2 = n;
                    rectF = rectF2;
                    f3 = f11;
                }
                canvas2.save();
                canvas2.translate(gm.L(10.0f) - this.o, gm.L(22.0f));
                cmb.Y2.linkColor = i2;
                i66 i66Var = this.i;
                if (i66Var != null && i66Var.g(canvas2)) {
                    rc2Var.r2();
                }
                if (rc2Var.Q5.O3()) {
                    cmb.Y2.setColor(cmb.v0(cmb.Vc, rc2Var.cc));
                } else {
                    cmb.Y2.setColor(cmb.v0(cmb.Uc, rc2Var.cc));
                }
                int alpha = cmb.Y2.getAlpha();
                cmb.Y2.setAlpha((int) (alpha * f6));
                mc2 mc2Var = rc2Var.eb;
                if (mc2Var != null && mc2Var.p2() != null && rc2Var.getDelegate().p2().y(rc2Var.Q5)) {
                    hkb p2 = rc2Var.eb.p2();
                    boolean O3 = rc2Var.Q5.O3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = p2.p;
                    if (p2.s0) {
                        Paint paint2 = p2.o;
                        if (O3) {
                            int i10 = cmb.Lc;
                            paint2.setColor(p2.s(i10));
                            paint.setColor(p2.s(i10));
                        } else {
                            int i11 = cmb.kg;
                            paint2.setColor(p2.s(i11));
                            paint.setColor(p2.s(i11));
                        }
                        f = f9;
                        f2 = f6;
                        f4 = f10;
                        i3 = i7;
                        i4 = alpha;
                        p2.g(canvas, staticLayout, p2.u, p2.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        cmb.Y2.setAlpha(i4);
                        rectF.set(gm.L(10.0f), gm.L(6.33f) + gm.L(22.0f) + this.p, i3 - gm.L(10.0f), hg9.v(6.33f, gm.L(22.0f) + this.p, 1));
                        cmb.b3.setColor(i2);
                        cmb.b3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                        canvas2.drawRect(rectF, cmb.b3);
                        canvas2.save();
                        canvas2.translate(gm.L(10.0f) - this.q, gm.L(12.66f) + gm.L(22.0f) + this.p);
                        cmb.b3.setColor(i2);
                        cmb.b3.setAlpha((int) (r2.getAlpha() * f2));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (rc2Var.P1 == null) {
                            rc2Var.P1 = new in3((byte) 7);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = gm.L(gm.L(12.66f) + (gm.L(22.0f) + this.p) < i9 ? 20.0f : 24.0f);
                            float f12 = f3;
                            rectF.set(0.0f, kt6.y(6.66f, i9, L3), f4, f12);
                            float f13 = (1.0f - f) * f2;
                            rc2Var.P1.r(canvas2, rectF, 3, f13);
                            float f14 = i9 - L3;
                            rectF.set(i3 - gm.L(60.0f), f14, i3 - gm.L(32.0f), f12);
                            rc2Var.P1.r(canvas2, rectF, 2, f13);
                            rectF.set(i3 - gm.L(32.0f), f14, f4, f12);
                            canvas2.drawRect(rectF, rc2Var.P1.w(f13, 2));
                            canvas2.restore();
                            canvas2.restore();
                        }
                    }
                }
                f = f9;
                f2 = f6;
                i3 = i7;
                i4 = alpha;
                f4 = f10;
                this.g.draw(canvas2);
                canvas2.restore();
                cmb.Y2.setAlpha(i4);
                rectF.set(gm.L(10.0f), gm.L(6.33f) + gm.L(22.0f) + this.p, i3 - gm.L(10.0f), hg9.v(6.33f, gm.L(22.0f) + this.p, 1));
                cmb.b3.setColor(i2);
                cmb.b3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                canvas2.drawRect(rectF, cmb.b3);
                canvas2.save();
                canvas2.translate(gm.L(10.0f) - this.q, gm.L(12.66f) + gm.L(22.0f) + this.p);
                cmb.b3.setColor(i2);
                cmb.b3.setAlpha((int) (r2.getAlpha() * f2));
                this.h.draw(canvas2);
                canvas2.restore();
                if (rc2Var.P1 == null) {
                }
                if (this.n) {
                }
            } else {
                i2 = n;
                f = f9;
                f2 = f6;
                i3 = i7;
            }
            if (this.n) {
                if (this.l == null) {
                    Drawable mutate = rc2Var.getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.l = mutate;
                    this.m = i2;
                    mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                if (i2 != this.m) {
                    Drawable drawable = this.l;
                    this.m = i2;
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                canvas2.save();
                int L4 = gm.L(16.0f);
                this.l.setBounds((i3 - L4) - gm.L(7.0f), (i9 - L4) - gm.L(5.0f), i3 - gm.L(7.0f), i9 - gm.L(5.0f));
                canvas2.rotate(gm.U1(f, 0, nm7.J2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f2 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
