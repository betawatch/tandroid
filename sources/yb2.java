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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yb2 {
    public final wb2 a;
    public boolean b;
    public pkb c;
    public pkb d;
    public v41 e;
    public v41 f;
    public StaticLayout g;
    public StaticLayout h;
    public m66 i;
    public q66 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ab9 t;
    public boolean u;
    public boolean v;

    public yb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int L;
        int extraTextX;
        int i;
        rb2 rb2Var;
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new v41(wb2Var);
        }
        if (this.f == null) {
            v41 v41Var = new v41(wb2Var);
            this.f = v41Var;
            v41Var.f = new ib2(wb2Var, (byte) 0);
        }
        float backgroundDrawableRight = ((wb2Var.getBackgroundDrawableRight() + (dc2Var != null ? dc2Var.i0 : 0.0f)) - hl.L(10 + ((!wb2Var.Q5.O3() || wb2Var.C6 || wb2Var.K) ? 0 : 6))) - wb2Var.getExtraTextX();
        m47 m47Var = wb2Var.L;
        if (m47Var == null || m47Var.i) {
            if (wb2Var.Q5.O3()) {
                i = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                if (wb2Var.Q5.D == 19) {
                    i -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i)) - hl.q.x);
                }
            } else {
                boolean z = wb2Var.C6;
                int i2 = wb2Var.N6;
                if (z) {
                    L = hl.L(12.0f) + i2;
                    extraTextX = wb2Var.getExtraTextX();
                } else {
                    L = hl.L(wb2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = wb2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
        } else {
            i = (int) wb2Var.s3;
        }
        int L2 = ((int) (i + dc2Var.h0)) - hl.L(1.33f);
        int i3 = wb2Var.r0;
        float f = L2;
        int i4 = (int) (backgroundDrawableRight - f);
        int x = (int) motionEvent.getX();
        int P1 = (int) wb2Var.P1(motionEvent);
        int L3 = (int) (hl.L(10.0f) + L2 + this.c.c + hl.L(4.0f));
        int L4 = hl.L(4.33f) + i3;
        RectF rectF = hl.P;
        float f2 = L3;
        rectF.set(f2, L4, this.d.c + f2 + hl.L(4.0f), hl.L(17.33f) + L4);
        boolean contains = rectF.contains(motionEvent.getX(), wb2Var.P1(motionEvent));
        rectF.set(f, i3, L2 + i4, this.r + i3);
        boolean z2 = !contains && !wb2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), wb2Var.P1(motionEvent));
        if (((z2 && !wb2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                m66 m66Var = new m66(wb2Var);
                this.i = m66Var;
                m66Var.d = new ib2(wb2Var, (byte) 0);
            }
            int L5 = (hl.L(10.0f) + L2) - this.o;
            int L6 = hl.L(22.0f) + i3;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x < L5 || P1 < L6 || x > L5 + i4 || P1 > this.g.getHeight() + L6) {
                    wb2Var.i3(1);
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
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e8c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof c8c) || c8c.h) && !hl.A1())) {
                                int action = motionEvent.getAction();
                                q66 q66Var = this.j;
                                if (action == 0) {
                                    if (q66Var == null || q66Var.i != characterStyleArr[0]) {
                                        this.i.l(q66Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        vnb vnbVar = wb2Var.cc;
                                        float f4 = i5;
                                        float[] fArr = wb2.Id;
                                        q66 q66Var2 = new q66(characterStyle, vnbVar, f3, f4, 0);
                                        this.j = q66Var2;
                                        ab9 ab9Var = this.t;
                                        if (ab9Var != null) {
                                            q66Var2.d(aob.p1(0.1f, ab9Var.h()));
                                        }
                                        try {
                                            f66 b = this.j.b();
                                            int[] Z1 = wb2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z2 = false;
                                    }
                                    wb2Var.invalidate();
                                } else if (q66Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = q66Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        wb2Var.eb.L(wb2Var, characterStyle3, false);
                                        wb2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
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
                rb2 rb2Var2 = wb2Var.eb;
                if (rb2Var2 != null) {
                    rb2Var2.n0(wb2Var, (int) ((this.d.c / 2.0f) + hl.L(4.0f) + L3), L4);
                }
            } else if (this.v && !dc2Var.a3 && (rb2Var = wb2Var.eb) != null) {
                rb2Var.J0(wb2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            m66 m66Var2 = this.i;
            if (m66Var2 != null) {
                m66Var2.e(true);
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
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        j47 j47Var = wb2Var.M;
        if (j47Var == null || j47Var.h) {
            float f = this.b ? 1.0f : 0.0f;
            if (dc2Var.S2) {
                f = hl.R1(1.0f - f, f, dc2Var.L1);
            }
            float f2 = f * 1.0f;
            if (f2 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((wb2Var.getBackgroundDrawableRight() + (dc2Var != null ? dc2Var.i0 : 0.0f)) - hl.L(10 + ((!wb2Var.Q5.O3() || wb2Var.C6 || wb2Var.K) ? 0 : 6))) - wb2Var.getExtraTextX();
            m47 m47Var = wb2Var.L;
            if (m47Var != null && !m47Var.i) {
                i = (int) wb2Var.s3;
            } else if (wb2Var.Q5.O3()) {
                i = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                if (wb2Var.Q5.D == 19) {
                    i -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i)) - hl.q.x);
                }
            } else {
                boolean z = wb2Var.C6;
                int i2 = wb2Var.N6;
                if (z) {
                    L = hl.L(12.0f) + i2;
                    extraTextX = wb2Var.getExtraTextX();
                } else {
                    L = hl.L(wb2Var.K ? 12.0f : 18.0f) + i2;
                    extraTextX = wb2Var.getExtraTextX();
                }
                i = L + extraTextX;
            }
            int L2 = ((int) (i + dc2Var.h0)) - hl.L(1.33f);
            int i3 = wb2Var.r0;
            float f3 = L2;
            int i4 = (int) (backgroundDrawableRight - f3);
            int i5 = this.r;
            if (dc2Var.Y2) {
                i5 = hl.U1(dc2Var.L1, dc2Var.U2, i5);
            }
            if (this.n && wb2Var.getPrimaryMessageObject() != null) {
                boolean z2 = wb2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = dc2Var.a3;
            ab9 ab9Var = this.t;
            if (ab9Var == null) {
                ab9Var = new ab9(wb2Var);
                this.t = ab9Var;
            }
            int n = ab9Var.n(wb2Var.cc);
            canvas.save();
            canvas.translate(f3, i3);
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, i4, i5);
            v41 v41Var = this.f;
            float a = v41Var != null ? v41Var.a(0.01f) : 1.0f;
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f2, false, false);
            this.t.f(canvas, rectF, f2);
            pkb pkbVar = this.c;
            if (pkbVar != null) {
                pkbVar.c(hl.L(10.0f), hl.L(12.0f), f2, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (hl.L(10.0f) + this.c.c + hl.L(4.0f)), hl.L(4.33f), hl.L(10.0f) + r1 + this.d.c, hl.L(21.66f));
                    v41 v41Var2 = this.e;
                    float a2 = v41Var2 != null ? v41Var2.a(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, hl.L(17.0f), hl.L(17.0f), this.t.g);
                    this.d.c(hl.L(5.0f) + r1, hl.L(12.0f), f2, n, canvas);
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
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        j47 j47Var = wb2Var.M;
        if (j47Var == null || j47Var.h) {
            float f5 = this.b ? 1.0f : 0.0f;
            if (dc2Var.S2) {
                f5 = hl.R1(1.0f - f5, f5, dc2Var.L1);
            }
            float f6 = 1.0f * f5;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = ((wb2Var.getBackgroundDrawableRight() + (dc2Var != null ? dc2Var.i0 : 0.0f)) - hl.L(10 + ((!wb2Var.Q5.O3() || wb2Var.C6 || wb2Var.K) ? 0 : 6))) - wb2Var.getExtraTextX();
            m47 m47Var = wb2Var.L;
            if (m47Var == null || m47Var.i) {
                if (wb2Var.Q5.O3()) {
                    i = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                    if (wb2Var.Q5.D == 19) {
                        i -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i)) - hl.q.x);
                    }
                } else {
                    boolean z = wb2Var.C6;
                    int i5 = wb2Var.N6;
                    if (z) {
                        L = hl.L(12.0f) + i5;
                        extraTextX = wb2Var.getExtraTextX();
                    } else {
                        L = hl.L(wb2Var.K ? 12.0f : 18.0f) + i5;
                        extraTextX = wb2Var.getExtraTextX();
                    }
                    i = L + extraTextX;
                }
            } else {
                i = (int) wb2Var.s3;
            }
            int L2 = ((int) (i + dc2Var.h0)) - hl.L(1.33f);
            int i6 = wb2Var.r0;
            float f7 = L2;
            int i7 = (int) (backgroundDrawableRight - f7);
            int i8 = this.r;
            if (dc2Var.Y2) {
                i8 = hl.U1(dc2Var.L1, dc2Var.U2, i8);
            }
            int i9 = i8;
            float f8 = (!this.n || (wb2Var.getPrimaryMessageObject() != null && wb2Var.getPrimaryMessageObject().c3)) ? 1.0f : 0.0f;
            if (dc2Var.a3) {
                f8 = hl.R1(1.0f - f8, f8, dc2Var.L1);
            }
            float f9 = f8;
            ab9 ab9Var = this.t;
            if (ab9Var == null) {
                ab9Var = new ab9(wb2Var);
                this.t = ab9Var;
            }
            int n = ab9Var.n(wb2Var.cc);
            canvas2.save();
            canvas2.translate(f7, i6);
            RectF rectF2 = hl.P;
            float f10 = i7;
            float f11 = i9;
            rectF2.set(0.0f, 0.0f, f10, f11);
            v41 v41Var = this.f;
            float a = v41Var != null ? v41Var.a(0.01f) : 1.0f;
            canvas2.scale(a, a, rectF2.centerX(), rectF2.centerY());
            if (this.g != null) {
                if (this.n) {
                    f3 = f11;
                    i2 = n;
                    rectF = rectF2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f10, i9 - 1, jn7.d4, 31);
                } else {
                    i2 = n;
                    rectF = rectF2;
                    f3 = f11;
                }
                canvas2.save();
                canvas2.translate(hl.L(10.0f) - this.o, hl.L(22.0f));
                aob.Z2.linkColor = i2;
                m66 m66Var = this.i;
                if (m66Var != null && m66Var.g(canvas2)) {
                    wb2Var.r2();
                }
                if (wb2Var.Q5.O3()) {
                    aob.Z2.setColor(aob.v0(aob.Wc, wb2Var.cc));
                } else {
                    aob.Z2.setColor(aob.v0(aob.Vc, wb2Var.cc));
                }
                int alpha = aob.Z2.getAlpha();
                aob.Z2.setAlpha((int) (alpha * f6));
                rb2 rb2Var = wb2Var.eb;
                if (rb2Var != null && rb2Var.l2() != null && wb2Var.getDelegate().l2().y(wb2Var.Q5)) {
                    bmb l2 = wb2Var.eb.l2();
                    boolean O3 = wb2Var.Q5.O3();
                    StaticLayout staticLayout = this.g;
                    Paint paint = l2.p;
                    if (l2.s0) {
                        Paint paint2 = l2.o;
                        if (O3) {
                            int i10 = aob.Mc;
                            paint2.setColor(l2.s(i10));
                            paint.setColor(l2.s(i10));
                        } else {
                            int i11 = aob.lg;
                            paint2.setColor(l2.s(i11));
                            paint.setColor(l2.s(i11));
                        }
                        f = f9;
                        f2 = f6;
                        f4 = f10;
                        i3 = i7;
                        i4 = alpha;
                        l2.g(canvas, staticLayout, l2.u, l2.v, true, true, 0.0f);
                        canvas2 = canvas;
                        this.g.draw(canvas2);
                        canvas2.restore();
                        aob.Z2.setAlpha(i4);
                        rectF.set(hl.L(10.0f), hl.L(6.33f) + hl.L(22.0f) + this.p, i3 - hl.L(10.0f), uh9.w(6.33f, hl.L(22.0f) + this.p, 1));
                        aob.c3.setColor(i2);
                        aob.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                        canvas2.drawRect(rectF, aob.c3);
                        canvas2.save();
                        canvas2.translate(hl.L(10.0f) - this.q, hl.L(12.66f) + hl.L(22.0f) + this.p);
                        aob.c3.setColor(i2);
                        aob.c3.setAlpha((int) (r2.getAlpha() * f2));
                        this.h.draw(canvas2);
                        canvas2.restore();
                        if (wb2Var.P1 == null) {
                            wb2Var.P1 = new pm3((byte) 7);
                        }
                        if (this.n) {
                            canvas2.save();
                            int L3 = hl.L(hl.L(12.66f) + (hl.L(22.0f) + this.p) < i9 ? 20.0f : 24.0f);
                            float f12 = f3;
                            rectF.set(0.0f, qu6.x(6.66f, i9, L3), f4, f12);
                            float f13 = (1.0f - f) * f2;
                            wb2Var.P1.r(canvas2, rectF, 3, f13);
                            float f14 = i9 - L3;
                            rectF.set(i3 - hl.L(60.0f), f14, i3 - hl.L(32.0f), f12);
                            wb2Var.P1.r(canvas2, rectF, 2, f13);
                            rectF.set(i3 - hl.L(32.0f), f14, f4, f12);
                            canvas2.drawRect(rectF, wb2Var.P1.w(f13, 2));
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
                aob.Z2.setAlpha(i4);
                rectF.set(hl.L(10.0f), hl.L(6.33f) + hl.L(22.0f) + this.p, i3 - hl.L(10.0f), uh9.w(6.33f, hl.L(22.0f) + this.p, 1));
                aob.c3.setColor(i2);
                aob.c3.setAlpha((int) (r2.getAlpha() * 0.5f * f2));
                canvas2.drawRect(rectF, aob.c3);
                canvas2.save();
                canvas2.translate(hl.L(10.0f) - this.q, hl.L(12.66f) + hl.L(22.0f) + this.p);
                aob.c3.setColor(i2);
                aob.c3.setAlpha((int) (r2.getAlpha() * f2));
                this.h.draw(canvas2);
                canvas2.restore();
                if (wb2Var.P1 == null) {
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
                    Drawable mutate = wb2Var.getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
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
                int L4 = hl.L(16.0f);
                this.l.setBounds((i3 - L4) - hl.L(7.0f), (i9 - L4) - hl.L(5.0f), i3 - hl.L(7.0f), i9 - hl.L(5.0f));
                canvas2.rotate(hl.U1(f, 0, jn7.J2), this.l.getBounds().centerX(), this.l.getBounds().centerY());
                this.l.setAlpha((int) (f2 * 255.0f));
                this.l.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
    }
}
