// default package

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tz extends mz0 implements kv4 {
    public final long S1;
    public final c6c T1;
    public final gf0 U1;
    public final tb V1;
    public final ry2 W1;
    public final nz X1;
    public final su Y1;
    public final su Z1;
    public final su a2;
    public final jf5 b2;
    public final io c2;
    public final rz d2;
    public final rz[] e2;
    public final FrameLayout f2;
    public hv4 g2;
    public final sz h2;
    public Runnable i2;
    public long j2;
    public long k2;
    public boolean l2;
    public final pn2[] m2;
    public gn n2;
    public final fn0 o2;
    public final fn0 p2;
    public final pn2[] q2;
    public boolean r2;
    public l7c s2;
    public boolean t2;
    public boolean u2;

    public tz(Context context, ylb ylbVar, sz szVar, hv4 hv4Var) {
        super(context, null, false, false, 2, ylbVar);
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.e2 = new rz[3];
        this.l2 = true;
        this.m2 = new pn2[1];
        hz hzVar = new hz(this);
        d53 d53Var = d53.h;
        this.o2 = new fn0(0, hzVar, d53Var, 380L, false);
        this.p2 = new fn0(0, new hz(this), d53Var, 380L, false);
        this.q2 = new pn2[1];
        this.g2 = hv4Var;
        this.h2 = szVar;
        long j = hv4Var.b;
        this.S1 = j;
        this.L1 = true;
        this.u1 = 0.2f;
        hv4 l = lv4.c(this.a).l(j, this);
        this.W1 = new ry2(new hz(this));
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        J();
        e00.Y0(this.o1, context, ylbVar, l.d);
        TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(z8c.h(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = c6c.j(-1, linearLayout);
        nz nzVar = new nz(this, context, ylbVar);
        this.X1 = nzVar;
        nzVar.P = true;
        this.g2.e();
        hv4 hv4Var2 = this.g2;
        long j2 = hv4Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var2.f;
        long j3 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : hv4Var2.f.bid_levels.get(0).amount;
        int i = j3 > 100000 ? ((((int) j3) * 3) / 2000) * 1000 : j3 > 30000 ? 100000 : 50000;
        int i2 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i4 >= 50) {
                z = i4 == 50 ? false : z;
                if (i4 > i) {
                    arrayList2.add(Integer.valueOf(i));
                    break;
                } else {
                    arrayList2.add(Integer.valueOf(i4));
                    if (iArr[i3] == i) {
                        break;
                    }
                }
            } else {
                z = true;
            }
            i3++;
            i2 = 15;
        }
        if (z) {
            arrayList2.add(0, 50);
        }
        byte b = 2;
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            iArr2[i5] = ((Integer) arrayList2.get(i5)).intValue();
        }
        nz nzVar2 = this.X1;
        nzVar2.f0 = iArr2;
        linearLayout.addView(nzVar2, qoe.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        su suVar = new su(context, ylbVar, (byte) 1);
        this.Y1 = suVar;
        int L = gm.L(12.0f);
        int i6 = cmb.Z6;
        int v0 = cmb.v0(i6, this.J0);
        int l2 = on2.l(cmb.v0(cmb.h6, this.J0), cmb.v0(i6, this.J0));
        fg0 i0 = cmb.i0(L, L, L, L, v0, l2, l2);
        wmb M = anb.M(i6);
        suVar.setBackground(i0);
        anb.j(suVar, i0, M, null, ylbVar);
        suVar.setOnClickListener(new iz(this, b));
        ((TextView) suVar.c).setText(jb6.M0(2131750308, null));
        su suVar2 = new su(context, ylbVar, (byte) 1);
        this.Z1 = suVar2;
        ShapeDrawable b0 = cmb.b0(gm.L(12.0f), cmb.v0(i6, this.J0));
        wmb M2 = anb.M(i6);
        suVar2.setBackground(b0);
        anb.j(suVar2, b0, M2, null, ylbVar);
        ((TextView) suVar2.c).setText(jb6.M0(2131750306, null));
        su suVar3 = new su(context, ylbVar, (byte) 1);
        this.a2 = suVar3;
        ShapeDrawable b02 = cmb.b0(gm.L(12.0f), cmb.v0(i6, this.J0));
        wmb M3 = anb.M(i6);
        suVar3.setBackground(b02);
        anb.j(suVar3, b02, M3, null, ylbVar);
        ((TextView) suVar3.c).setText(jb6.M0(2131750309, null));
        linearLayout2.addView(suVar, qoe.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), qoe.l(0.0f, 10, -1));
        linearLayout2.addView(suVar2, qoe.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), qoe.l(0.0f, 10, -1));
        linearLayout2.addView(suVar3, qoe.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, qoe.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l.e.acquired_count > 0) {
            l66 l66Var = new l66(context, ylbVar);
            l66Var.setGravity(17);
            l66Var.setTextSize(1, 16.0f);
            int i7 = cmb.I6;
            anb.X(l66Var, i7, ylbVar);
            anb.G(l66Var, i7, ylbVar);
            l66Var.setOnClickListener(new b0(this, new boolean[1], ylbVar, (byte) 7));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new gn(l.c, l66Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            l66Var.setText(TextUtils.concat(gm.E2(jb6.F("Gift2AuctionsItemsBought2", l.e.acquired_count, spannableStringBuilder), true, gm.L(2.6666667f), gm.L(1.0f))));
            rve.b(l66Var, 0.02f, 1.5f);
            linearLayout.addView(l66Var, qoe.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i8 = cmb.K6;
        jf5 jf5Var = new jf5(context, i8, 21, 0, 0, false, true, ylbVar);
        this.b2 = jf5Var;
        linearLayout.addView(jf5Var, qoe.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        io ioVar = new io(context, false, false, false);
        this.c2 = ioVar;
        ioVar.setTextSize(gm.L(12.5f));
        ioVar.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        ioVar.setSizeableBackground(cmb.Z(0, 0, 9, 9));
        ioVar.setHideBackgroundIfEmpty(true);
        jf5Var.setOnWidthUpdateListener(new b1(this, (byte) 29));
        jf5Var.addView(ioVar, qoe.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        rz rzVar = new rz(context, ylbVar);
        this.d2 = rzVar;
        io ioVar2 = rzVar.b;
        anb.q(ioVar2);
        ioVar2.setTextColor(cmb.v0(i8, this.J0));
        rzVar.b(W1);
        linearLayout.addView(rzVar, qoe.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        jf5 jf5Var2 = new jf5(context, i8, 21, 15, 0, false, false, ylbVar);
        jf5Var2.setText(jb6.M0(2131750253, null));
        linearLayout.addView(jf5Var2, qoe.o(-1, -2));
        int i9 = 0;
        while (true) {
            rz[] rzVarArr = this.e2;
            if (i9 >= rzVarArr.length) {
                break;
            }
            rzVarArr[i9] = new rz(context, ylbVar);
            int i10 = i9 + 1;
            this.e2[i9].a(i10, true, false);
            this.e2[i9].setBackground(cmb.L0(false));
            rz rzVar2 = this.e2[i9];
            rzVar2.f = i9 < 2;
            rzVar2.setOnClickListener(new x10((byte) 1));
            linearLayout.addView(this.e2[i9], qoe.o(-1, -2));
            i9 = i10;
        }
        tb tbVar = new tb(context, true, ylbVar, (byte) 1);
        this.V1 = tbVar;
        tbVar.f();
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.u0;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.b.addView(tbVar, d);
        r59 r59Var = this.n1;
        int i13 = this.u0;
        r59Var.setPadding(i13, 0, i13, gm.L(64.0f));
        this.n1.setOnItemClickListener(new l5((byte) 0));
        long j4 = l.e.bid_amount;
        nz nzVar3 = this.X1;
        if (j4 > 0) {
            nzVar3.setValue((int) j4);
        } else {
            nzVar3.setValue((int) l.e());
        }
        i1(false);
        this.n1.setOverScrollMode(2);
        gf0 gf0Var = new gf0(this.a, ylbVar, context);
        this.U1 = gf0Var;
        gf0Var.setScaleX(0.6f);
        gf0Var.setScaleY(0.6f);
        gf0Var.setAlpha(0.0f);
        gf0Var.setEnabled(false);
        gf0Var.setClickable(false);
        this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new kz(context, ylbVar, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2 = frameLayout;
        this.c.addView(frameLayout, qoe.e(-1, 100, 48));
        e1();
        this.s2.O(false);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 10), this.J0);
        this.s2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131750277, null);
    }

    public final void Y0() {
        boolean z = this.r2 && !this.J;
        if (this.t2 != z) {
            this.t2 = z;
            gf0 gf0Var = this.U1;
            if (gf0Var != null) {
                gf0Var.setEnabled(z);
                gf0Var.setClickable(z);
                wi8.s(gf0Var.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f), z ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void Z0() {
        nz nzVar = this.X1;
        int value = nzVar.getValue();
        if (nzVar.getProgress() > 0.99f) {
            nzVar.g(jb6.M0(2131750255, null));
            return;
        }
        long j = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j2 = tL_StarGiftAuctionUserState.bid_amount;
        if (j == j2) {
            nzVar.g(jb6.M0(2131750250, null));
            return;
        }
        if (j2 <= 0 || tL_StarGiftAuctionUserState.returned) {
            nzVar.g(null);
            return;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            nzVar.g("+".concat(jb6.E(j3, ',')));
        } else {
            nzVar.g(null);
        }
    }

    public final void a1(int i) {
        this.X1.f(bg5.b(this.a, i, 3), bg5.b(this.a, i, 4), true);
        g1(this.r2);
        h1(this.r2);
        d1(this.r2);
        Z0();
    }

    public final void b1(int i) {
        if (this.u2) {
            return;
        }
        long j = this.g2.e.bid_amount;
        long j2 = j > 0 ? i - j : i;
        byte b = 0;
        if (jva.v(this.a, false).e && jva.v(this.a, false).n(null, false, false).amount < j2) {
            new dxa(getContext(), this.J0, j2, 14, null, null, 0L).show();
            return;
        }
        this.u2 = true;
        this.V1.setLoading(true);
        lv4.c(this.a).k(this.S1, this.h2, i, new jz(this, j, b));
    }

    public final void c1() {
        FrameLayout frameLayout;
        if (this.s0 == null || this.b == null || (frameLayout = this.f2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + gm.L(10.0f)));
    }

    @Override // my0
    public final void d0(float f) {
        super.d0(f);
        Y0();
    }

    public final void d1(boolean z) {
        long value = this.X1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j = tL_StarGiftAuctionUserState.bid_amount;
        byte b = 0;
        byte b2 = 1;
        tb tbVar = this.V1;
        if (value == j) {
            tbVar.i(jb6.M0(2131747564, null), z, true);
            tbVar.setOnClickListener(new iz(this, b));
            return;
        }
        pn2[] pn2VarArr = this.q2;
        if (j >= value || tL_StarGiftAuctionUserState.returned) {
            tbVar.i(nxa.Z0(false, jb6.a0(null, null, 2131750272, jb6.E(value, ',')), pn2VarArr), z, true);
        } else {
            tbVar.i(nxa.Z0(false, jb6.a0(null, null, 2131750271, jb6.E(value - j, ',')), pn2VarArr), z, true);
        }
        tbVar.setOnClickListener(new iz(this, b2));
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        lv4.c(this.a).n(this.S1, this);
        this.W1.b();
        super.dismiss();
    }

    public final void e1() {
        int f = on2.f(this.o2.e, on2.f(this.p2.e, cmb.v0(cmb.K6, this.J0), cmb.v0(cmb.p7, this.J0)), cmb.v0(cmb.kk, this.J0));
        this.b2.setTextColor(f);
        io ioVar = this.c2;
        ioVar.setTextColor(f);
        this.d2.b.setTextColor(f);
        if (cmb.F1(ioVar.getSizeableBackground(), cmb.p1(0.15f, f), false)) {
            ioVar.invalidate();
        }
    }

    public final void f1(long j, boolean z) {
        int i = (int) j;
        ((io) this.Z1.b).c(j >= 3600 ? gm.j0(i) : gm.h0(i, true), z, true);
    }

    public final void g1(boolean z) {
        long value = this.X1.getValue();
        hv4 hv4Var = this.g2;
        int i = hv4Var.i;
        int c = hv4Var.c(ConnectionsManager.getInstance(hv4Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.g2.e.bid_amount);
        rz rzVar = this.d2;
        rzVar.d.c(nxa.b1(false, "⭐️".concat(jb6.E((int) max, ',')), 0.78f, rzVar.e), false, true);
        if (i > 0) {
            c = Math.min(i, c);
        }
        rzVar.a(c, false, z);
        hv4 hv4Var2 = this.g2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var2.f;
        io ioVar = this.c2;
        if (tL_starGiftAuctionState != null && c > 0 && hv4Var2.d.title != null && hv4Var2.d() == 1) {
            hv4 hv4Var3 = this.g2;
            hv4Var3.getClass();
            if (!hv4Var3.g(ConnectionsManager.getInstance(z8c.t0).getCurrentTime())) {
                hv4 hv4Var4 = this.g2;
                int i2 = hv4Var4.f.last_gift_num + c;
                if (i2 <= hv4Var4.d.availability_total) {
                    ioVar.setText(this.g2.d.title + " #" + jb6.E(i2, ','));
                    return;
                }
            }
        }
        ioVar.setText(null);
    }

    public final void h1(boolean z) {
        boolean z2;
        int d = this.g2.d();
        long value = this.X1.getValue();
        long j = this.g2.e.bid_amount;
        jf5 jf5Var = this.b2;
        boolean z3 = false;
        if (value <= j) {
            z2 = true;
            if (d == 2) {
                jf5Var.c(jb6.M0(2131750302, null), z);
            } else if (d == 3) {
                jf5Var.c(jb6.M0(2131750302, null), z);
            } else if (d == 1) {
                jf5Var.c(jb6.M0(2131750301, null), z);
                z2 = false;
                z3 = true;
            } else {
                jf5Var.c(jb6.M0(2131750304, null), z);
            }
            this.o2.a(z3, z);
            this.p2.a(z2, z);
        }
        jf5Var.c(jb6.M0(2131750304, null), z);
        z2 = false;
        this.o2.a(z3, z);
        this.p2.a(z2, z);
    }

    public final void i1(boolean z) {
        d Q;
        int i;
        io ioVar = (io) this.Y1.b;
        StringBuilder sb = new StringBuilder("⭐️");
        long e = (int) this.g2.e();
        sb.append(e < 1000000 ? jb6.E(e, ',') : gm.o0((int) e, 1000000));
        byte b = 0;
        ioVar.c(nxa.b1(false, sb.toString(), 0.78f, this.m2), z, true);
        if (this.g2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g = this.g2.g(currentTime);
            hv4 hv4Var = this.g2;
            ry2 ry2Var = this.W1;
            if (g) {
                long max = Math.max(0, hv4Var.f.start_date - currentTime);
                ry2Var.a(max);
                f1(max, z);
            } else {
                long max2 = Math.max(0, hv4Var.f.next_round_at - currentTime);
                ry2Var.a(max2);
                f1(max2, z);
            }
            gn gnVar = this.n2;
            su suVar = this.a2;
            if (gnVar == null && this.g2.d.sticker != null) {
                this.n2 = new gn(this.g2.d.sticker.id, ((io) suVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.n2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.n2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) jb6.E(this.g2.f.gifts_left, ','));
            ((io) suVar.b).c(spannableStringBuilder, z, true);
            TextView textView = (TextView) this.Z1.c;
            hv4 hv4Var2 = this.g2;
            hv4Var2.getClass();
            if (hv4Var2.g(ConnectionsManager.getInstance(z8c.t0).getCurrentTime())) {
                i = 2131750305;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.g2.f;
                i = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750307 : 2131750306;
            }
            textView.setText(jb6.M0(i, null));
            rz[] rzVarArr = this.e2;
            int min = Math.min(rzVarArr.length, this.g2.f.top_bidders.size());
            if (min > 0) {
                int i2 = 0;
                while (i2 < min) {
                    int i3 = i2 + 1;
                    Long l = this.g2.f.top_bidders.get(i2);
                    long longValue = l.longValue();
                    TLRPC.User W1 = oc7.r1(this.a).W1(l);
                    if (W1 != null) {
                        rzVarArr[i2].b(W1);
                    }
                    rz rzVar = rzVarArr[i2];
                    rzVar.d.c(nxa.b1(false, "⭐️".concat(jb6.E((int) this.g2.b(i3), ',')), 0.78f, rzVar.e), z, true);
                    rzVarArr[i2].setOnClickListener(new lz(this, longValue, b));
                    i2 = i3;
                }
            }
        }
        hv4 hv4Var3 = this.g2;
        long b2 = hv4Var3.b(hv4Var3.d.gifts_per_round) + 1;
        nz nzVar = this.X1;
        nzVar.setStarsTop(b2);
        nzVar.setTopText(jb6.G(this.g2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        g1(z);
        h1(z);
        d1(z);
        Z0();
        long n = pg3.n(this.g2.e.peer);
        long j = this.g2.e.acquired_count;
        if (this.k2 < j && !this.l2 && (Q = LaunchActivity.Q()) != null) {
            long j2 = this.j2;
            if (j2 != 0) {
                yv1 ga = yv1.ga(j2);
                ga.whenFullyVisible(new mz(ga, b));
                Q.presentFragment(ga);
                Runnable runnable = this.i2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (n != 0) {
            this.j2 = n;
        }
        this.k2 = j;
        this.l2 = false;
    }

    @Override // my0
    public final void k0() {
        this.r2 = false;
        Y0();
        u31.h(this.c);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            if (this.b2 == null || this.c2 == null || this.d2 == null) {
                return;
            }
            e1();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // kv4
    public final void q(hv4 hv4Var) {
        this.g2 = hv4Var;
        i1(this.r2);
    }

    @Override // my0
    public final void w() {
        this.r2 = true;
        Y0();
        u31.a(this.c, new oz((byte) 0));
    }
}
