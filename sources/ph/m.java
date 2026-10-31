package ph;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.t9;
import org.telegram.messenger.vp;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.c7;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a80;
import org.telegram.ui.h51;
import org.telegram.ui.un;
import rh.h8;
import rh.x7;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends ha implements w9 {
    public static final /* synthetic */ int s2 = 0;
    public final long P1;
    public final a51 Q1;
    public final rh.a R1;
    public final i S1;
    public final rf.m T1;
    public final h U1;
    public final k V1;
    public final k W1;
    public final k X1;
    public final p4 Y1;
    public final f6 Z1;
    public final j a2;
    public final j[] b2;
    public final FrameLayout c2;
    public t9 d2;
    public final l e2;
    public Runnable f2;
    public long g2;
    public long h2;
    public boolean i2;
    public final dq[] j2;
    public o5 k2;
    public final fe.b l2;
    public final fe.b m2;
    public final dq[] n2;
    public boolean o2;
    public p51 p2;
    public boolean q2;
    public boolean r2;

    public m(Context context, p6 p6Var, l lVar, t9 t9Var) {
        super(context, null, false, false, 2, p6Var);
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.b2 = new j[3];
        this.i2 = true;
        this.j2 = new dq[1];
        f fVar = new f(this);
        gr grVar = gr.h;
        this.l2 = new fe.b(0, fVar, grVar, 380L, false);
        this.m2 = new fe.b(0, new f(this), grVar, 380L, false);
        this.n2 = new dq[1];
        this.d2 = t9Var;
        this.e2 = lVar;
        long j10 = t9Var.b;
        this.P1 = j10;
        this.I1 = true;
        this.r1 = 0.2f;
        t9 l4 = x9.c(this.a).l(j10, this);
        this.T1 = new rf.m(new f(this));
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        w.d1(this.l1, context, p6Var, l4.d);
        TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(d20.i(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Q1 = a51.j(-1, linearLayout);
        h hVar = new h(this, context, p6Var);
        this.U1 = hVar;
        hVar.O = true;
        this.d2.e();
        t9 t9Var2 = this.d2;
        long j11 = t9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = t9Var2.f;
        long j12 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : t9Var2.f.bid_levels.get(0).amount;
        int i10 = j12 > 100000 ? ((((int) j12) * 3) / 2000) * 1000 : j12 > 30000 ? 100000 : 50000;
        int i11 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 >= 50) {
                z10 = i13 == 50 ? false : z10;
                if (i13 <= i10) {
                    arrayList2.add(Integer.valueOf(i13));
                    if (iArr[i12] == i10) {
                        break;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(i10));
                    break;
                }
            } else {
                z10 = true;
            }
            i12++;
            i11 = 15;
        }
        if (z10) {
            arrayList2.add(0, 50);
        }
        int i14 = 2;
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            iArr2[i15] = ((Integer) arrayList2.get(i15)).intValue();
        }
        h hVar2 = this.U1;
        hVar2.e0 = iArr2;
        linearLayout.addView(hVar2, b6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        k kVar = new k(context, p6Var);
        this.V1 = kVar;
        int L = org.telegram.messenger.i0.L(12.0f);
        int i16 = t6.a7;
        int w02 = t6.w0(i16, this.I0);
        int k10 = i0.b.k(t6.w0(t6.i6, this.I0), t6.w0(i16, this.I0));
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, k10, k10);
        w6 N = a7.N(i16);
        kVar.setBackground(k02);
        a7.k(kVar, k02, N, null, p6Var);
        kVar.setOnClickListener(new g(this, i14));
        ((TextView) kVar.c).setText(cd.L0(2131750384, null));
        k kVar2 = new k(context, p6Var);
        this.W1 = kVar2;
        ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(12.0f), t6.w0(i16, this.I0));
        w6 N2 = a7.N(i16);
        kVar2.setBackground(d02);
        a7.k(kVar2, d02, N2, null, p6Var);
        ((TextView) kVar2.c).setText(cd.L0(2131750382, null));
        k kVar3 = new k(context, p6Var);
        this.X1 = kVar3;
        ShapeDrawable d03 = t6.d0(org.telegram.messenger.i0.L(12.0f), t6.w0(i16, this.I0));
        w6 N3 = a7.N(i16);
        kVar3.setBackground(d03);
        a7.k(kVar3, d03, N3, null, p6Var);
        ((TextView) kVar3.c).setText(cd.L0(2131750385, null));
        linearLayout2.addView(kVar, b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), b6.l(0.0f, 10, -1));
        linearLayout2.addView(kVar2, b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), b6.l(0.0f, 10, -1));
        linearLayout2.addView(kVar3, b6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, b6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        int i17 = 24;
        if (l4.e.acquired_count > 0) {
            p80 p80Var = new p80(context, p6Var);
            p80Var.setGravity(17);
            p80Var.setTextSize(1, 16.0f);
            int i18 = t6.J6;
            a7.V(p80Var, i18, p6Var);
            a7.H(p80Var, i18, p6Var);
            p80Var.setOnClickListener(new ag.i(this, new boolean[1], p6Var, i17));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new o5(l4.c, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.H2(cd.F("Gift2AuctionsItemsBought2", l4.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f))));
            e6.b(p80Var, 0.02f, 1.5f);
            linearLayout.addView(p80Var, b6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i19 = t6.L6;
        p4 p4Var = new p4(context, i19, 21, 0, 0, false, true, p6Var);
        this.Y1 = p4Var;
        linearLayout.addView(p4Var, b6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        f6 f6Var = new f6(context, false, false, false);
        this.Z1 = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(12.5f));
        f6Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        f6Var.setSizeableBackground(t6.b0(0, 0, 9, 9));
        f6Var.setHideBackgroundIfEmpty(true);
        p4Var.setOnWidthUpdateListener(new w5(this, 24));
        p4Var.addView(f6Var, b6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        j jVar = new j(context, p6Var);
        this.a2 = jVar;
        f6 f6Var2 = jVar.b;
        a7.r(f6Var2);
        f6Var2.setTextColor(t6.w0(i19, this.I0));
        jVar.c(Z1);
        linearLayout.addView(jVar, b6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        p4 p4Var2 = new p4(context, i19, 21, 15, 0, false, false, p6Var);
        p4Var2.setText(cd.L0(2131750329, null));
        linearLayout.addView(p4Var2, b6.o(-1, -2));
        int i20 = 0;
        while (true) {
            j[] jVarArr = this.b2;
            if (i20 >= jVarArr.length) {
                break;
            }
            jVarArr[i20] = new j(context, p6Var);
            int i21 = i20 + 1;
            this.b2[i20].b(i21, true, false);
            this.b2[i20].setBackground(t6.N0(false));
            j jVar2 = this.b2[i20];
            jVar2.f = i20 < 2;
            jVar2.setOnClickListener(new bh.c(20));
            linearLayout.addView(this.b2[i20], b6.o(-1, -2));
            i20 = i21;
        }
        i iVar = new i(0, context, p6Var, true);
        this.S1 = iVar;
        iVar.f();
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = d.leftMargin;
        int i23 = this.t0;
        d.leftMargin = i22 + i23;
        d.rightMargin += i23;
        this.b.addView(iVar, d);
        tk0 tk0Var = this.k1;
        int i24 = this.t0;
        tk0Var.setPadding(i24, 0, i24, org.telegram.messenger.i0.L(64.0f));
        this.k1.setOnItemClickListener(new c7(4));
        long j13 = l4.e.bid_amount;
        if (j13 > 0) {
            this.U1.setValue((int) j13);
        } else {
            this.U1.setValue((int) l4.e());
        }
        n1(false);
        this.k1.setOverScrollMode(2);
        rh.a aVar = new rh.a(this.a, context, p6Var);
        this.R1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.c.addView(aVar, b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        e6.a(aVar);
        aVar.setOnClickListener(new h51(1, context, p6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c2 = frameLayout;
        this.c.addView(frameLayout, b6.e(-1, 100, 48));
        j1();
        this.p2.O(false);
    }

    public static void d1(m mVar, int i10) {
        mVar.U1.f(th.o.b(mVar.a, i10, 3), th.o.b(mVar.a, i10, 4), true);
        mVar.l1(mVar.o2);
        mVar.m1(mVar.o2);
        mVar.i1(mVar.o2);
        mVar.f1();
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, true, new ag.a(this, 22), this.I0);
        this.p2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131750353, null);
    }

    @Override // org.telegram.messenger.w9
    public final void c(t9 t9Var) {
        this.d2 = t9Var;
        n1(this.o2);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        x9.c(this.a).n(this.P1, this);
        this.T1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z10 = this.o2 && !this.I;
        if (this.q2 != z10) {
            this.q2 = z10;
            rh.a aVar = this.R1;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                z20.l(aVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void f1() {
        h hVar = this.U1;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(cd.L0(2131750331, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.d2.e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            hVar.g(cd.L0(2131750326, null));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            hVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            hVar.g(null);
            return;
        }
        hVar.g("+" + cd.E(j12, ','));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void g0(float f7) {
        super.g0(f7);
        e1();
    }

    public final void g1(int i10) {
        if (this.r2) {
            return;
        }
        long j10 = this.d2.e.bid_amount;
        long j11 = j10 > 0 ? i10 - j10 : i10;
        if (rh.e6.y(this.a, false).e && rh.e6.y(this.a, false).q(null, false, false).amount < j11) {
            new x7(getContext(), this.I0, j11, 14, null, null, 0L).show();
            return;
        }
        this.r2 = true;
        this.S1.setLoading(true);
        x9.c(this.a).k(this.P1, this.e2, i10, new a80(this, j10, 1));
    }

    public final void h1() {
        FrameLayout frameLayout;
        if (this.r0 == null || this.b == null || (frameLayout = this.c2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.i0.L(10.0f)));
    }

    public final void i1(boolean z10) {
        long value = this.U1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.d2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i10 = 0;
        int i11 = 1;
        i iVar = this.S1;
        if (value == j10) {
            iVar.i(cd.L0(2131747847, null), z10, true);
            iVar.setOnClickListener(new g(this, i10));
            return;
        }
        dq[] dqVarArr = this.n2;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            iVar.i(h8.X0(false, cd.a0(null, null, 2131750348, cd.E(value, ',')), dqVarArr), z10, true);
        } else {
            iVar.i(h8.X0(false, cd.a0(null, null, 2131750347, cd.E(value - j10, ',')), dqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, i11));
    }

    public final void j1() {
        int f7 = i0.b.f(this.l2.e, i0.b.f(this.m2.e, t6.w0(t6.L6, this.I0), t6.w0(t6.q7, this.I0)), t6.w0(t6.ik, this.I0));
        this.Y1.setTextColor(f7);
        f6 f6Var = this.Z1;
        f6Var.setTextColor(f7);
        this.a2.b.setTextColor(f7);
        if (t6.H1(f6Var.getSizeableBackground(), t6.r1(0.15f, f7), false)) {
            f6Var.invalidate();
        }
    }

    public final void k1(long j10, boolean z10) {
        ((f6) this.W1.b).c(j10 >= 3600 ? org.telegram.messenger.i0.j0((int) j10) : org.telegram.messenger.i0.h0((int) j10, true), z10, true);
    }

    public final void l1(boolean z10) {
        long value = this.U1.getValue();
        t9 t9Var = this.d2;
        int i10 = t9Var.i;
        int c10 = t9Var.c(ConnectionsManager.getInstance(t9Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.d2.e.bid_amount);
        j jVar = this.a2;
        jVar.a(max, false);
        if (i10 > 0) {
            c10 = Math.min(i10, c10);
        }
        jVar.b(c10, false, z10);
        t9 t9Var2 = this.d2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = t9Var2.f;
        f6 f6Var = this.Z1;
        if (tL_starGiftAuctionState != null && c10 > 0 && t9Var2.d.title != null && t9Var2.d() == 1) {
            t9 t9Var3 = this.d2;
            t9Var3.getClass();
            if (!t9Var3.g(ConnectionsManager.getInstance(d20.s0).getCurrentTime())) {
                t9 t9Var4 = this.d2;
                int i11 = t9Var4.f.last_gift_num + c10;
                if (i11 <= t9Var4.d.availability_total) {
                    f6Var.setText(this.d2.d.title + " #" + cd.E(i11, ','));
                    return;
                }
            }
        }
        f6Var.setText(null);
    }

    public final void m1(boolean z10) {
        boolean z11;
        int d = this.d2.d();
        long value = this.U1.getValue();
        long j10 = this.d2.e.bid_amount;
        p4 p4Var = this.Y1;
        boolean z12 = false;
        if (value <= j10) {
            z11 = true;
            if (d == 2) {
                p4Var.c(cd.L0(2131750378, null), z10);
            } else if (d == 3) {
                p4Var.c(cd.L0(2131750378, null), z10);
            } else if (d == 1) {
                p4Var.c(cd.L0(2131750377, null), z10);
                z11 = false;
                z12 = true;
            } else {
                p4Var.c(cd.L0(2131750380, null), z10);
            }
            this.l2.a(z12, z10);
            this.m2.a(z11, z10);
        }
        p4Var.c(cd.L0(2131750380, null), z10);
        z11 = false;
        this.l2.a(z12, z10);
        this.m2.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void n0() {
        this.o2 = false;
        e1();
        wb.h(this.c);
    }

    public final void n1(boolean z10) {
        org.telegram.ui.ActionBar.k2 Q;
        int i10;
        f6 f6Var = (f6) this.V1.b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e = (int) this.d2.e();
        sb2.append(e < 1000000 ? cd.E(e, ',') : org.telegram.messenger.i0.o0((int) e, 1000000));
        int i11 = 1;
        f6Var.c(h8.Z0(false, sb2.toString(), 0.78f, this.j2), z10, true);
        if (this.d2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g10 = this.d2.g(currentTime);
            rf.m mVar = this.T1;
            if (g10) {
                long max = Math.max(0, this.d2.f.start_date - currentTime);
                mVar.a(max);
                k1(max, z10);
            } else {
                long max2 = Math.max(0, this.d2.f.next_round_at - currentTime);
                mVar.a(max2);
                k1(max2, z10);
            }
            o5 o5Var = this.k2;
            k kVar = this.X1;
            if (o5Var == null && this.d2.d.sticker != null) {
                this.k2 = new o5(this.d2.d.sticker.id, ((f6) kVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.k2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.k2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) cd.E(this.d2.f.gifts_left, ','));
            ((f6) kVar.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.W1.c;
            t9 t9Var = this.d2;
            t9Var.getClass();
            if (t9Var.g(ConnectionsManager.getInstance(d20.s0).getCurrentTime())) {
                i10 = 2131750381;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.d2.f;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750383 : 2131750382;
            }
            textView.setText(cd.L0(i10, null));
            j[] jVarArr = this.b2;
            int min = Math.min(jVarArr.length, this.d2.f.top_bidders.size());
            if (min > 0) {
                int i12 = 0;
                while (i12 < min) {
                    int i13 = i12 + 1;
                    Long l4 = this.d2.f.top_bidders.get(i12);
                    long longValue = l4.longValue();
                    TLRPC.User Z1 = vp.r1(this.a).Z1(l4);
                    if (Z1 != null) {
                        jVarArr[i12].c(Z1);
                    }
                    jVarArr[i12].a(this.d2.b(i13), z10);
                    jVarArr[i12].setOnClickListener(new ih.p(this, longValue, 3));
                    i12 = i13;
                }
            }
        }
        t9 t9Var2 = this.d2;
        long b10 = t9Var2.b(t9Var2.d.gifts_per_round) + 1;
        h hVar = this.U1;
        hVar.setStarsTop(b10);
        hVar.setTopText(cd.G(this.d2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z10);
        m1(z10);
        i1(z10);
        f1();
        long o10 = org.telegram.messenger.o5.o(this.d2.e.peer);
        long j10 = this.d2.e.acquired_count;
        if (this.h2 < j10 && !this.i2 && (Q = LaunchActivity.Q()) != null) {
            long j11 = this.g2;
            if (j11 != 0) {
                un ha = un.ha(j11);
                ha.whenFullyVisible(new gg.b(ha, i11));
                Q.presentFragment(ha);
                Runnable runnable = this.f2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o10 != 0) {
            this.g2 = o10;
        }
        this.h2 = j10;
        this.i2 = false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            if (this.Y1 == null || this.Z1 == null || this.a2 == null) {
                return;
            }
            j1();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.o2 = true;
        e1();
        wb.a(this.c, new mg.u(10));
    }
}
