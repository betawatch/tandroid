package zh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.dd;
import bi.ea;
import bi.gd;
import bi.tc;
import c8.ha;
import c8.ka;
import fi.r7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.s9;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.f7;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends ma implements v9 {
    public static final /* synthetic */ int v2 = 0;
    public final long S1;
    public final x31 T1;
    public final bi.c U1;
    public final bi.w V1;
    public final bg.q W1;
    public final i X1;
    public final pg.h Y1;
    public final pg.h Z1;
    public final pg.h a2;
    public final n4 b2;
    public final i6 c2;
    public final j d2;
    public final j[] e2;
    public final FrameLayout f2;
    public s9 g2;
    public final k h2;
    public Runnable i2;
    public long j2;
    public long k2;
    public boolean l2;
    public final wp[] m2;
    public q5 n2;
    public final te.a o2;
    public final te.a p2;
    public final wp[] q2;
    public boolean r2;
    public m41 s2;
    public boolean t2;
    public boolean u2;

    public l(Context context, h6 h6Var, k kVar, s9 s9Var) {
        super(context, null, false, false, 2, h6Var);
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.e2 = new j[3];
        this.l2 = true;
        this.m2 = new wp[1];
        g gVar = new g(this);
        wq wqVar = wq.h;
        this.o2 = new te.a(0, gVar, wqVar, 380L, false);
        this.p2 = new te.a(0, new g(this), wqVar, 380L, false);
        this.q2 = new wp[1];
        this.g2 = s9Var;
        this.h2 = kVar;
        long j3 = s9Var.b;
        this.S1 = j3;
        this.L1 = true;
        this.u1 = 0.2f;
        s9 l10 = w9.c(this.a).l(j3, this);
        this.W1 = new bg.q(new g(this));
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        N();
        u.d1(this.o1, context, h6Var, l10.d);
        TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(p10.i(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = x31.j(-1, linearLayout);
        i iVar = new i(this, context, h6Var);
        this.X1 = iVar;
        iVar.O = true;
        this.g2.e();
        s9 s9Var2 = this.g2;
        long j10 = s9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var2.f;
        long j11 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : s9Var2.f.bid_levels.get(0).amount;
        int i7 = j11 > 100000 ? ((((int) j11) * 3) / 2000) * 1000 : j11 > 30000 ? 100000 : 50000;
        int i10 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        boolean z9 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = iArr[i11];
            if (i12 >= 50) {
                z9 = i12 == 50 ? false : z9;
                if (i12 <= i7) {
                    arrayList2.add(Integer.valueOf(i12));
                    if (iArr[i11] == i7) {
                        break;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(i7));
                    break;
                }
            } else {
                z9 = true;
            }
            i11++;
            i10 = 15;
        }
        if (z9) {
            arrayList2.add(0, 50);
        }
        int i13 = 2;
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            iArr2[i14] = ((Integer) arrayList2.get(i14)).intValue();
        }
        i iVar2 = this.X1;
        iVar2.e0 = iArr2;
        linearLayout.addView(iVar2, ha.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        pg.h hVar = new pg.h(4, context, h6Var);
        this.Y1 = hVar;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i15 = m6.a7;
        int w02 = m6.w0(i15, this.I0);
        int k10 = i0.a.k(m6.w0(m6.i6, this.I0), m6.w0(i15, this.I0));
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, k10, k10);
        p6 M = t6.M(i15);
        hVar.setBackground(k02);
        t6.j(hVar, k02, M, null, h6Var);
        hVar.setOnClickListener(new h(this, i13));
        ((TextView) hVar.c).setText(id.M0(2131750375, null));
        pg.h hVar2 = new pg.h(4, context, h6Var);
        this.Z1 = hVar2;
        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(12.0f), m6.w0(i15, this.I0));
        p6 M2 = t6.M(i15);
        hVar2.setBackground(d02);
        t6.j(hVar2, d02, M2, null, h6Var);
        ((TextView) hVar2.c).setText(id.M0(2131750373, null));
        pg.h hVar3 = new pg.h(4, context, h6Var);
        this.a2 = hVar3;
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(12.0f), m6.w0(i15, this.I0));
        p6 M3 = t6.M(i15);
        hVar3.setBackground(d03);
        t6.j(hVar3, d03, M3, null, h6Var);
        ((TextView) hVar3.c).setText(id.M0(2131750376, null));
        linearLayout2.addView(hVar, ha.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ha.l(0.0f, 10, -1));
        linearLayout2.addView(hVar2, ha.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ha.l(0.0f, 10, -1));
        linearLayout2.addView(hVar3, ha.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, ha.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.e.acquired_count > 0) {
            w70 w70Var = new w70(context, h6Var);
            w70Var.setGravity(17);
            w70Var.setTextSize(1, 16.0f);
            int i16 = m6.J6;
            t6.U(w70Var, i16, h6Var);
            t6.G(w70Var, i16, h6Var);
            w70Var.setOnClickListener(new td0(this, new boolean[1], h6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new q5(l10.c, w70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(id.F("Gift2AuctionsItemsBought2", l10.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            ka.b(w70Var, 0.02f, 1.5f);
            linearLayout.addView(w70Var, ha.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = m6.L6;
        n4 n4Var = new n4(context, i17, 21, 0, 0, false, true, h6Var);
        this.b2 = n4Var;
        linearLayout.addView(n4Var, ha.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        i6 i6Var = new i6(context, false, false, false);
        this.c2 = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        i6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i6Var.setSizeableBackground(m6.b0(0, 0, 9, 9));
        i6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new wg.a0(this, 3));
        n4Var.addView(i6Var, ha.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        j jVar = new j(context, h6Var);
        this.d2 = jVar;
        i6 i6Var2 = jVar.b;
        t6.q(i6Var2);
        i6Var2.setTextColor(m6.w0(i17, this.I0));
        jVar.c(a22);
        linearLayout.addView(jVar, ha.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        n4 n4Var2 = new n4(context, i17, 21, 15, 0, false, false, h6Var);
        n4Var2.setText(id.M0(2131750320, null));
        linearLayout.addView(n4Var2, ha.o(-1, -2));
        int i18 = 0;
        while (true) {
            j[] jVarArr = this.e2;
            if (i18 >= jVarArr.length) {
                break;
            }
            jVarArr[i18] = new j(context, h6Var);
            int i19 = i18 + 1;
            this.e2[i18].b(i19, true, false);
            this.e2[i18].setBackground(m6.N0(false));
            j jVar2 = this.e2[i18];
            jVar2.f = i18 < 2;
            jVar2.setOnClickListener(new bi.l1(23));
            linearLayout.addView(this.e2[i18], ha.o(-1, -2));
            i18 = i19;
        }
        bi.w wVar = new bi.w(3, context, h6Var, true);
        this.V1 = wVar;
        wVar.f();
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.t0;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.b.addView(wVar, d);
        pj0 pj0Var = this.n1;
        int i22 = this.t0;
        pj0Var.setPadding(i22, 0, i22, org.telegram.messenger.g0.L(64.0f));
        this.n1.setOnItemClickListener(new f7(4));
        long j12 = l10.e.bid_amount;
        if (j12 > 0) {
            this.X1.setValue((int) j12);
        } else {
            this.X1.setValue((int) l10.e());
        }
        n1(false);
        this.n1.setOverScrollMode(2);
        bi.c cVar = new bi.c(this.a, context, h6Var);
        this.U1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.c.addView(cVar, ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ka.a(cVar);
        cVar.setOnClickListener(new gd(2, context, h6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2 = frameLayout;
        this.c.addView(frameLayout, ha.e(-1, 100, 48));
        j1();
        this.s2.O(false);
    }

    public static void d1(l lVar, int i7) {
        lVar.X1.f(di.t.b(lVar.a, i7, 3), di.t.b(lVar.a, i7, 4), true);
        lVar.l1(lVar.r2);
        lVar.m1(lVar.r2);
        lVar.i1(lVar.r2);
        lVar.f1();
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.a, 0, true, new hi.u1(this, 27), this.I0);
        this.s2 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131750344, null);
    }

    @Override // org.telegram.messenger.v9
    public final void c(s9 s9Var) {
        this.g2 = s9Var;
        n1(this.r2);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        w9.c(this.a).n(this.S1, this);
        this.W1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z9 = this.r2 && !this.I;
        if (this.t2 != z9) {
            this.t2 = z9;
            bi.c cVar = this.U1;
            if (cVar != null) {
                cVar.setEnabled(z9);
                cVar.setClickable(z9);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z9 ? 1.0f : 0.6f).scaleY(z9 ? 1.0f : 0.6f), z9 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void f1() {
        i iVar = this.X1;
        int value = iVar.getValue();
        if (iVar.getProgress() > 0.99f) {
            iVar.g(id.M0(2131750322, null));
            return;
        }
        long j3 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        if (j3 == j10) {
            iVar.g(id.M0(2131750317, null));
            return;
        }
        if (j10 <= 0 || tL_StarGiftAuctionUserState.returned) {
            iVar.g(null);
            return;
        }
        long j11 = j3 - j10;
        if (j11 <= 0) {
            iVar.g(null);
            return;
        }
        iVar.g("+" + id.E(j11, ','));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    public final void g1(int i7) {
        if (this.u2) {
            return;
        }
        long j3 = this.g2.e.bid_amount;
        long j10 = j3 > 0 ? i7 - j3 : i7;
        if (ea.y(this.a, false).e && ea.y(this.a, false).q(null, false, false).amount < j10) {
            new tc(getContext(), this.I0, j10, 14, null, null, 0L).show();
            return;
        }
        this.u2 = true;
        this.V1.setLoading(true);
        w9.c(this.a).k(this.S1, this.h2, i7, new ii.g0(this, j3, 2));
    }

    public final void h1() {
        FrameLayout frameLayout;
        if (this.r0 == null || this.b == null || (frameLayout = this.f2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
    }

    public final void i1(boolean z9) {
        long value = this.X1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = 0;
        int i10 = 1;
        bi.w wVar = this.V1;
        if (value == j3) {
            wVar.i(id.M0(2131747831, null), z9, true);
            wVar.setOnClickListener(new h(this, i7));
            return;
        }
        wp[] wpVarArr = this.q2;
        if (j3 >= value || tL_StarGiftAuctionUserState.returned) {
            wVar.i(dd.Y0(false, id.a0(null, null, 2131750339, id.E(value, ',')), wpVarArr), z9, true);
        } else {
            wVar.i(dd.Y0(false, id.a0(null, null, 2131750338, id.E(value - j3, ',')), wpVarArr), z9, true);
        }
        wVar.setOnClickListener(new h(this, i10));
    }

    public final void j1() {
        int f10 = i0.a.f(this.o2.e, i0.a.f(this.p2.e, m6.w0(m6.L6, this.I0), m6.w0(m6.q7, this.I0)), m6.w0(m6.ik, this.I0));
        this.b2.setTextColor(f10);
        i6 i6Var = this.c2;
        i6Var.setTextColor(f10);
        this.d2.b.setTextColor(f10);
        if (m6.H1(i6Var.getSizeableBackground(), m6.r1(0.15f, f10), false)) {
            i6Var.invalidate();
        }
    }

    public final void k1(long j3, boolean z9) {
        ((i6) this.Z1.b).c(j3 >= 3600 ? org.telegram.messenger.g0.j0((int) j3) : org.telegram.messenger.g0.h0((int) j3, true), z9, true);
    }

    public final void l1(boolean z9) {
        long value = this.X1.getValue();
        s9 s9Var = this.g2;
        int i7 = s9Var.i;
        int c10 = s9Var.c(ConnectionsManager.getInstance(s9Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.g2.e.bid_amount);
        j jVar = this.d2;
        jVar.a(max, false);
        if (i7 > 0) {
            c10 = Math.min(i7, c10);
        }
        jVar.b(c10, false, z9);
        s9 s9Var2 = this.g2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var2.f;
        i6 i6Var = this.c2;
        if (tL_starGiftAuctionState != null && c10 > 0 && s9Var2.d.title != null && s9Var2.d() == 1) {
            s9 s9Var3 = this.g2;
            s9Var3.getClass();
            if (!s9Var3.g(ConnectionsManager.getInstance(p10.s0).getCurrentTime())) {
                s9 s9Var4 = this.g2;
                int i10 = s9Var4.f.last_gift_num + c10;
                if (i10 <= s9Var4.d.availability_total) {
                    i6Var.setText(this.g2.d.title + " #" + id.E(i10, ','));
                    return;
                }
            }
        }
        i6Var.setText(null);
    }

    public final void m1(boolean z9) {
        boolean z10;
        int d = this.g2.d();
        long value = this.X1.getValue();
        long j3 = this.g2.e.bid_amount;
        n4 n4Var = this.b2;
        boolean z11 = false;
        if (value <= j3) {
            z10 = true;
            if (d == 2) {
                n4Var.c(id.M0(2131750369, null), z9);
            } else if (d == 3) {
                n4Var.c(id.M0(2131750369, null), z9);
            } else if (d == 1) {
                n4Var.c(id.M0(2131750368, null), z9);
                z10 = false;
                z11 = true;
            } else {
                n4Var.c(id.M0(2131750371, null), z9);
            }
            this.o2.a(z11, z9);
            this.p2.a(z10, z9);
        }
        n4Var.c(id.M0(2131750371, null), z9);
        z10 = false;
        this.o2.a(z11, z9);
        this.p2.a(z10, z9);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void n0() {
        this.r2 = false;
        e1();
        bc.h(this.c);
    }

    public final void n1(boolean z9) {
        org.telegram.ui.ActionBar.f2 Q;
        int i7;
        i6 i6Var = (i6) this.Y1.b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.g2.e();
        sb2.append(e10 < 1000000 ? id.E(e10, ',') : org.telegram.messenger.g0.o0((int) e10, 1000000));
        int i10 = 1;
        i6Var.c(dd.a1(false, sb2.toString(), 0.78f, this.m2), z9, true);
        if (this.g2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g10 = this.g2.g(currentTime);
            bg.q qVar = this.W1;
            if (g10) {
                long max = Math.max(0, this.g2.f.start_date - currentTime);
                qVar.a(max);
                k1(max, z9);
            } else {
                long max2 = Math.max(0, this.g2.f.next_round_at - currentTime);
                qVar.a(max2);
                k1(max2, z9);
            }
            q5 q5Var = this.n2;
            pg.h hVar = this.a2;
            if (q5Var == null && this.g2.d.sticker != null) {
                this.n2 = new q5(this.g2.d.sticker.id, ((i6) hVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.n2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.n2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) id.E(this.g2.f.gifts_left, ','));
            ((i6) hVar.b).c(spannableStringBuilder, z9, true);
            TextView textView = (TextView) this.Z1.c;
            s9 s9Var = this.g2;
            s9Var.getClass();
            if (s9Var.g(ConnectionsManager.getInstance(p10.s0).getCurrentTime())) {
                i7 = 2131750372;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.g2.f;
                i7 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750374 : 2131750373;
            }
            textView.setText(id.M0(i7, null));
            j[] jVarArr = this.e2;
            int min = Math.min(jVarArr.length, this.g2.f.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.g2.f.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User a22 = qp.s1(this.a).a2(l10);
                    if (a22 != null) {
                        jVarArr[i11].c(a22);
                    }
                    jVarArr[i11].a(this.g2.b(i12), z9);
                    jVarArr[i11].setOnClickListener(new di.u1(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        s9 s9Var2 = this.g2;
        long b10 = s9Var2.b(s9Var2.d.gifts_per_round) + 1;
        i iVar = this.X1;
        iVar.setStarsTop(b10);
        iVar.setTopText(id.G(this.g2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z9);
        m1(z9);
        i1(z9);
        f1();
        long o4 = m5.o(this.g2.e.peer);
        long j3 = this.g2.e.acquired_count;
        if (this.k2 < j3 && !this.l2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.j2;
            if (j10 != 0) {
                cn ta2 = cn.ta(j10);
                ta2.whenFullyVisible(new qg.b(ta2, i10));
                Q.presentFragment(ta2);
                Runnable runnable = this.i2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.j2 = o4;
        }
        this.k2 = j3;
        this.l2 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            if (this.b2 == null || this.c2 == null || this.d2 == null) {
                return;
            }
            j1();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.r2 = true;
        e1();
        bc.a(this.c, new r7(16));
    }
}
