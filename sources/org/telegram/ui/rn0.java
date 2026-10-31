package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class rn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.messenger.kp D;
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.p6 a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.r8 e;
    public final kl f;
    public final org.telegram.ui.ActionBar.u5 h;
    public boolean n;
    public final org.telegram.ui.Components.d5 r;
    public final org.telegram.ui.Components.d5 s;
    public final org.telegram.ui.Components.d5 w;
    public final th.u5 x;
    public final org.telegram.ui.Components.t5 y;

    public rn0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        CharSequence p5;
        long c10;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.e = r8Var;
        this.w = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 13, this, false);
        this.x = new th.u5(this);
        this.y = new org.telegram.ui.Components.t5(this, 320L, org.telegram.ui.Components.gr.h);
        this.F = new RectF();
        this.b = i10;
        this.a = p6Var;
        long j11 = 0;
        boolean z10 = j10 < 0;
        this.c = z10;
        kl klVar = new kl(this, context, 2);
        this.f = klVar;
        this.r = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), klVar);
        this.s = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), klVar);
        klVar.setLeftDrawableOutside(true);
        klVar.setRightDrawableOutside(true);
        klVar.setTextColor(-1);
        klVar.setTextSize(20);
        klVar.setTypeface(org.telegram.messenger.i0.o());
        klVar.setWidthWrapContent(true);
        addView(klVar, w7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.h = u5Var;
        u5Var.setTextSize(14);
        u5Var.setTextColor(-2130706433);
        u5Var.setGravity(1);
        addView(u5Var, w7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.i0.L(96.0f));
        if (z10) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
            p5 = L0 == null ? "" : L0.title;
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
            c10 = org.telegram.messenger.o5.c(L0);
            if (L0 != null) {
                j11 = org.telegram.messenger.o5.f(L0.emoji_status);
            }
        } else {
            TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
            p5 = org.telegram.messenger.h20.p(f7);
            r8Var.r(f7);
            imageReceiver.i0(f7, r8Var, null);
            c10 = org.telegram.messenger.o5.c(f7);
            if (f7 != null) {
                j11 = org.telegram.messenger.o5.f(f7.emoji_status);
            }
        }
        try {
            p5 = org.telegram.messenger.k6.m(p5, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(p5, false);
        this.r.j(c10, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j11, false);
        this.f.i(this.s);
        if (this.c) {
            long j12 = -j10;
            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j12));
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j12);
            if (M0 == null || M0.participants_count <= 0) {
                if (L02 == null || L02.participants_count <= 0) {
                    boolean t02 = org.telegram.messenger.w3.t0(L02);
                    if (org.telegram.messenger.w3.V(L02)) {
                        this.h.l(org.telegram.messenger.cd.L0(t02 ? 2131752318 : 2131752329, null).toLowerCase(), false);
                    } else {
                        this.h.l(org.telegram.messenger.cd.L0(t02 ? 2131748653 : 2131748656, null).toLowerCase(), false);
                    }
                } else if (org.telegram.messenger.w3.V(L02)) {
                    this.h.l(org.telegram.messenger.cd.H(',', "Subscribers", L02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.cd.H(',', "Members", L02.participants_count), false);
                }
            } else if (org.telegram.messenger.w3.V(L02)) {
                this.h.l(org.telegram.messenger.cd.H(',', "Subscribers", M0.participants_count), false);
            } else {
                this.h.l(org.telegram.messenger.cd.H(',', "Members", M0.participants_count), false);
            }
        } else {
            this.h.l(org.telegram.messenger.cd.L0(2131747842, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        if (i10 >= 14) {
            org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).r4;
            org.telegram.messenger.kp d = lpVar != null ? lpVar.d(i10) : null;
            if (d != null) {
                int f7 = d.f();
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.f(f7)], p6Var);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.f(f7)], p6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(j10)], p6Var);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(j10)], p6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(j11)], p6Var);
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(j11)], p6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h8));
    }

    public void b(int i10, boolean z10) {
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.b).s4;
        c(lpVar == null ? null : lpVar.d(i10), z10);
    }

    public final void c(org.telegram.messenger.kp kpVar, boolean z10) {
        this.D = kpVar;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        kl klVar = this.f;
        org.telegram.ui.Components.d5 d5Var = this.r;
        org.telegram.ui.Components.d5 d5Var2 = this.s;
        org.telegram.ui.ActionBar.u5 u5Var = this.h;
        org.telegram.ui.Components.d5 d5Var3 = this.w;
        if (kpVar != null) {
            int i10 = kpVar.a;
            if (i10 != 0) {
                d5Var3.k(Integer.valueOf(i10));
            } else {
                d5Var3.k(Integer.valueOf(tn0.A0(kpVar.c(a2))));
            }
            d5Var2.k(Integer.valueOf(i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
            d5Var.k(Integer.valueOf(i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
            int f7 = i0.b.f(0.5f, kpVar.m(a2), kpVar.n(a2));
            int i11 = org.telegram.ui.ActionBar.t6.s8;
            if (org.telegram.ui.ActionBar.t6.e1(org.telegram.ui.ActionBar.t6.w0(i11, p6Var))) {
                u5Var.setTextColor(org.telegram.ui.ActionBar.t6.D(a2, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), f7, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, p6Var), f7));
            } else {
                u5Var.setTextColor(f7);
            }
            klVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) > 0.8f) {
                d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var)));
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) < 0.2f) {
                d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var))));
            } else {
                d5Var3.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.t6.ni;
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
            u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
            klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        }
        this.E = 0;
        this.x.c(kpVar, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        org.telegram.messenger.kp kpVar;
        int i10;
        org.telegram.ui.Components.d5 d5Var = this.w;
        if (j10 == 0) {
            d5Var.g(null, z11);
        } else {
            d5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        org.telegram.messenger.kp kpVar2 = this.D;
        if (kpVar2 != null) {
            int i11 = kpVar2.a;
            if (i11 != 0) {
                d5Var.k(Integer.valueOf(i11));
            } else {
                d5Var.k(Integer.valueOf(tn0.A0(kpVar2.c(a2))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) > 0.8f) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var)));
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) < 0.2f) {
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A8, false))));
            } else {
                d5Var.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.kp kpVar3 = this.D;
        org.telegram.ui.Components.d5 d5Var2 = this.s;
        if (kpVar3 != null) {
            int e = kpVar3.e(1, p6Var);
            if (this.D.o(a2)) {
                kpVar = this.D;
                i10 = 4;
            } else {
                kpVar = this.D;
                i10 = 2;
            }
            d5Var2.k(Integer.valueOf(i0.b.f(0.5f, e, kpVar.e(i10, p6Var))));
        } else {
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.y.a(z10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - org.telegram.messenger.i0.L(82.0f);
        RectF rectF = this.F;
        rectF.set((getWidth() - org.telegram.messenger.i0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.i0.L(168.0f), (org.telegram.messenger.i0.L(86.0f) + getWidth()) / 2.0f, height);
        rh.j0.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int L = org.telegram.messenger.i0.L(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.J0(L);
        imageReceiver.A0(rectF);
        imageReceiver.h(canvas, null);
        float width = (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(4.0f);
        float L2 = org.telegram.messenger.i0.L(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        int j11;
        org.telegram.ui.Components.d5 d5Var = this.s;
        d5Var.j(j10, z11);
        d5Var.m(z10, z11);
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        org.telegram.messenger.kp kpVar = this.D;
        if (kpVar != null) {
            int h = kpVar.h(a2);
            if (this.D.o(a2)) {
                org.telegram.messenger.kp kpVar2 = this.D;
                j11 = (a2 ? kpVar2.h : kpVar2.g)[4];
            } else {
                j11 = this.D.j(a2);
            }
            d5Var.k(Integer.valueOf(i0.b.f(0.5f, h, j11)));
        } else {
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        this.E = 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
        this.d.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.n != z10) {
            invalidate();
        }
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.d5 d5Var;
        org.telegram.ui.Components.d5 d5Var2;
        kl klVar;
        org.telegram.ui.ActionBar.u5 u5Var;
        int j10;
        org.telegram.ui.Components.d5 d5Var3 = this.w;
        if (d5Var3 == null || (d5Var = this.s) == null || (d5Var2 = this.r) == null || (klVar = this.f) == null || (u5Var = this.h) == null) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        try {
            boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
            org.telegram.messenger.kp kpVar = this.D;
            if (kpVar != null) {
                int i10 = kpVar.a;
                if (i10 != 0) {
                    d5Var3.k(Integer.valueOf(i10));
                } else {
                    d5Var3.k(Integer.valueOf(tn0.A0(kpVar.c(a2))));
                }
                d5Var2.k(Integer.valueOf(i0.b.f(0.25f, this.D.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
                int i11 = this.E;
                if (i11 == 1) {
                    d5Var.k(Integer.valueOf(i0.b.f(0.5f, this.D.e(1, p6Var), this.D.o(a2) ? this.D.e(4, p6Var) : this.D.e(2, p6Var))));
                } else if (i11 == 2) {
                    int h = this.D.h(a2);
                    if (this.D.o(a2)) {
                        org.telegram.messenger.kp kpVar2 = this.D;
                        j10 = (a2 ? kpVar2.h : kpVar2.g)[4];
                    } else {
                        j10 = this.D.j(a2);
                    }
                    d5Var.k(Integer.valueOf(i0.b.f(0.5f, h, j10)));
                } else {
                    d5Var.k(Integer.valueOf(i0.b.f(0.25f, this.D.m(org.telegram.ui.ActionBar.t6.I.q()), -1)));
                }
                int f7 = i0.b.f(0.5f, this.D.m(a2), this.D.n(a2));
                int i12 = org.telegram.ui.ActionBar.t6.s8;
                if (org.telegram.ui.ActionBar.t6.e1(org.telegram.ui.ActionBar.t6.w0(i12, p6Var))) {
                    u5Var.setTextColor(org.telegram.ui.ActionBar.t6.D(a2, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), f7, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, p6Var), f7));
                } else {
                    u5Var.setTextColor(f7);
                }
                klVar.setTextColor(-1);
            } else {
                int i13 = org.telegram.ui.ActionBar.t6.s8;
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) > 0.8f) {
                    d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var)));
                } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i13, p6Var)) < 0.2f) {
                    d5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var))));
                } else {
                    d5Var3.k(Integer.valueOf(tn0.A0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var))));
                }
                int i14 = org.telegram.ui.ActionBar.t6.ni;
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i14, p6Var)));
                d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i14, p6Var)));
                u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
                klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
