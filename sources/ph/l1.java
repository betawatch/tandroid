package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.qk;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.f11;
import org.telegram.ui.ko;
import org.telegram.ui.mb;
import org.telegram.ui.xa;
import rh.e6;
import rh.h8;
import rh.o7;
import rh.v5;
import rh.w7;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l1 extends ha implements us {
    public static final /* synthetic */ int q2 = 0;
    public final int P1;
    public p51 Q1;
    public List R1;
    public TLRPC.DisallowedGiftsSettings S1;
    public final long T1;
    public final boolean U1;
    public final String V1;
    public final w7 W1;
    public final dg0 X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final yy a2;
    public final u0 b2;
    public final kg.t1 c2;
    public final kg.t1 d2;
    public final ArrayList e2;
    public final v5 f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public boolean k2;
    public boolean l2;
    public boolean m2;
    public o7 n2;
    public final p80 o2;
    public boolean p2;

    public l1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.P1, 0, true, new ag.a(this, 25), this.I0);
        this.Q1 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return this.U1 ? cd.L0(2131749948, null) : k6.m(cd.a0(null, null, 2131749857, this.V1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, p51 p51Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 3;
        int i11 = 2;
        dg0 dg0Var = this.X1;
        long j11 = this.T1;
        long j12 = 0;
        int i12 = 0;
        boolean z12 = this.U1;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.S1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(a51.k(dg0Var));
            arrayList.add(a51.k(this.Y1));
            ArrayList arrayList2 = this.e2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                a51 q6 = a51.q(1, 34);
                q6.u = 1;
                arrayList.add(q6);
                a51 q10 = a51.q(2, 34);
                q10.u = 1;
                arrayList.add(q10);
                a51 q11 = a51.q(3, 34);
                q11.u = 1;
                arrayList.add(q11);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = b1.b;
                    a51 K = a51.K(b1.class);
                    K.u = 1;
                    K.G = (kg.m) obj;
                    arrayList.add(K);
                    j12 = j12;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i15 = this.P1;
        e6 y3 = e6.y(i15, false);
        ArrayList arrayList3 = this.k2 ? y3.J : y3.I;
        if (this.S1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new xh.d1(this, i11)).collect(Collectors.toCollection(new qk(1)));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new xa(i10)).collect(Collectors.toCollection(new qk(1)));
        }
        long e = d20.i(i15).e();
        v5 v5Var = this.f2;
        if (j11 != e && v5Var != null) {
            ArrayList arrayList4 = v5Var.l;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList4.get(i16);
                i16++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (vp.r1(i15).Z5 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.S1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || v5Var == null || v5Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.S1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(a51.D(org.telegram.messenger.i0.L(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(a51.D(org.telegram.messenger.i0.L(16.0f)));
        } else {
            arrayList.add(a51.k(dg0Var));
        }
        arrayList.add(a51.k(this.Z1));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.S1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i17)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.h2 = -1;
        this.g2 = -1;
        if (!arrayList3.isEmpty()) {
            this.g2 = arrayList5.size();
            arrayList5.add(cd.L0(2131749959, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.S1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.h2 = arrayList5.size();
            arrayList5.add(cd.L0(2131749955, null));
        }
        this.i2 = arrayList5.size();
        arrayList5.add(cd.L0(2131749958, null));
        if (this.l2 && !this.m2) {
            this.m2 = true;
            this.j2 = this.i2;
        }
        int i18 = this.j2;
        q0 q0Var = new q0(this, i12);
        int i19 = j1.b;
        a51 K2 = a51.K(j1.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i18;
        K2.H = q0Var;
        arrayList.add(K2);
        boolean z13 = this.j2 == this.i2 && !z12 && j11 >= j10;
        if (z13 != this.p2) {
            this.p2 = z13;
            ViewPropertyAnimator duration = this.c2.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            this.d2.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(grVar).start();
        }
        if (v5Var != null && this.j2 == this.h2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = v5Var.l;
            int size3 = arrayList6.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj3 = arrayList6.get(i20);
                i20++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i22);
            int i23 = this.j2;
            if (i23 == this.g2 || i23 == this.h2 || (i23 == this.i2 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i23 == this.i2) {
                    starGift = starGift3;
                } else {
                    a51 i24 = b1.i(i23, starGift3, i23 == this.h2, starGift3.limited && (disallowedGiftsSettings2 = this.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(i24);
                    i21++;
                }
                int i25 = this.j2;
                arrayList.add(b1.i(i25, starGift, i25 == this.h2, starGift.limited && (disallowedGiftsSettings = this.S1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i26 = this.j2;
        int i27 = this.h2;
        if (i26 == i27 && v5Var != null && !v5Var.j) {
            v5Var.b();
            a51 q12 = a51.q(4, 34);
            q12.u = 1;
            arrayList.add(q12);
            a51 q13 = a51.q(5, 34);
            q13.u = 1;
            arrayList.add(q13);
            a51 q14 = a51.q(6, 34);
            q14.u = 1;
            arrayList.add(q14);
        } else if (i26 != i27 && y3.C) {
            a51 q15 = a51.q(4, 34);
            q15.u = 1;
            arrayList.add(q15);
            a51 q16 = a51.q(5, 34);
            q16.u = 1;
            arrayList.add(q16);
            a51 q17 = a51.q(6, 34);
            q17.u = 1;
            arrayList.add(q17);
        }
        arrayList.add(a51.D(org.telegram.messenger.i0.L(i21 < 9 ? 300.0f : 40.0f)));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 == zs.j5) {
            f1();
            return;
        }
        if (i10 == zs.F3) {
            p51 p51Var2 = this.Q1;
            if (p51Var2 != null) {
                p51Var2.O(true);
                return;
            }
            return;
        }
        if (i10 != zs.E0) {
            if (i10 != zs.I3) {
                if (i10 == zs.G3 && objArr[1] == this.f2 && (p51Var = this.Q1) != null) {
                    p51Var.O(true);
                    return;
                }
                return;
            }
            if (this.I) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new cc(this.c, this.I0).s(starGift.sticker, cd.L0(2131749976, null), org.telegram.messenger.i0.W2(cd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            p51 p51Var3 = this.Q1;
            if (p51Var3 != null) {
                p51Var3.O(true);
                return;
            }
            return;
        }
        if (this.I) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        long j10 = this.T1;
        if (longValue == j10 && j10 > 0) {
            int i12 = this.P1;
            TLRPC.UserFull a2 = vp.r1(i12).a2(j10);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == d20.i(i12).e() || a2 == null) ? null : a2.disallowed_stargifts;
            this.S1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    z20.s(cd.a0(null, null, 2131743768, o5.t(j10)), cc.a0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            p51 p51Var4 = this.Q1;
            if (p51Var4 != null) {
                p51Var4.O(true);
            }
        }
        ArrayList arrayList = this.e2;
        if (arrayList == null || arrayList.isEmpty()) {
            f1();
            p51 p51Var5 = this.Q1;
            if (p51Var5 != null) {
                p51Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.P1;
        zs.f(i10).n(this, zs.j5);
        zs.f(i10).n(this, zs.F3);
        zs.f(i10).n(this, zs.E0);
        zs.f(i10).n(this, zs.I3);
        zs.f(i10).n(this, zs.G3);
    }

    public final void e1(boolean z10) {
        this.k2 = z10;
        this.Q1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.e2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.R1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.R1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.R1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.R1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    kg.m mVar = new kg.m(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(mVar);
                    if (org.telegram.messenger.v2.b()) {
                        if (mVar.f() > j10) {
                            j10 = mVar.f();
                        }
                    } else if (mVar.h() != null && org.telegram.messenger.u1.i().k()) {
                        c5.a aVar = new c5.a();
                        aVar.c = "inapp";
                        aVar.b = mVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.v2.b()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((kg.m) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.u1.i().o(arrayList2, new mg.l(this, 22));
            }
        }
        if (arrayList.isEmpty()) {
            mg.k0.j(this.P1, null, new q0(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        int i10 = this.P1;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.S1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            z20.s(cd.a0(null, null, 2131743768, o5.t(this.T1)), cc.a0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0457  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1(final Context context, final int i10, final long j10, List list, final q20 q20Var) {
        super(context, null, false, false, null);
        int i11;
        int i12;
        this.e2 = new ArrayList();
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        new ArrayList();
        this.P1 = i10;
        this.T1 = j10;
        boolean z10 = d20.i(i10).e() == j10;
        this.U1 = z10;
        this.R1 = list;
        int i13 = t6.b6;
        w0(i13);
        Q(i13);
        this.f2 = e6.y(i10, false).G(d20.i(i10).e(), true);
        e6.y(i10, false).U();
        g9 g9Var = new g9(context);
        g9Var.setImportantForAccessibility(2);
        r8 r8Var = new r8((p6) null);
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 > 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            this.V1 = h20.k(Z1);
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
            this.S1 = (j10 == d20.i(i10).e() || a2 == null) ? null : a2.disallowed_stargifts;
            if (a2 == null) {
                vp.r1(i10).U2(Z1, 0, true, null);
            }
            i11 = i14;
        } else {
            i11 = i14;
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            this.V1 = L0 == null ? "" : L0.title;
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        this.r1 = 0.1f;
        w7 w7Var = new w7(i10, context, this.I0);
        this.W1 = w7Var;
        w7.e6.a(w7Var);
        w7Var.setOnClickListener(new ag.g(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y1 = frameLayout;
        dg0 dg0Var = new dg0(context, 18);
        this.X1 = dg0Var;
        dg0Var.setClipChildren(false);
        dg0Var.setClipToPadding(false);
        o7 o7Var = new o7(context, 70, 0, 0);
        this.n2 = o7Var;
        dg0Var.addView(o7Var, b6.c(-1.0f, -1));
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(42.0f));
        dg0Var.addView(g9Var, b6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        w7.e6.a(g9Var);
        g9Var.setOnClickListener(new ih.p(this, j10, 4));
        dg0Var.addView(w7Var, b6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, b6.e(-1, -2, 55));
        TextView g10 = m5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.i0.o());
        int i15 = t6.j5;
        a7.V(g10, i15, this.I0);
        g10.setGravity(17);
        linearLayout.addView(g10, b6.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(vh.p2.a(g10.getText(), g10.getPaint()));
        p80 p80Var = new p80(context, this.I0);
        int i16 = t6.Uc;
        a7.H(p80Var, i16, this.I0);
        p80Var.setTextSize(1, 14.0f);
        a7.V(p80Var, i15, this.I0);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.33f), 1.0f);
        linearLayout.addView(p80Var, b6.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(cd.L0(2131750084, null));
        p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750083, this.V1)), " ", org.telegram.messenger.i0.G2(org.telegram.messenger.i0.k2(cd.L0(2131750082, null), new org.telegram.ui.Components.voip.m0(28)), true)));
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z1 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        a7.V(textView, i15, this.I0);
        textView.setGravity(17);
        linearLayout2.addView(textView, b6.t(-1, -2, 1, 4, 0, 4, 0));
        kg.t1 t1Var = new kg.t1(5, context, this.I0);
        this.c2 = t1Var;
        a7.H(t1Var, i16, this.I0);
        t1Var.setTextSize(1, 14.0f);
        a7.V(t1Var, i15, this.I0);
        t1Var.setGravity(17);
        kg.t1 t1Var2 = new kg.t1(6, context, this.I0);
        this.d2 = t1Var2;
        a7.H(t1Var2, i16, this.I0);
        t1Var2.setTextSize(1, 14.0f);
        a7.V(t1Var2, i15, this.I0);
        t1Var2.setGravity(17);
        t1Var2.setAlpha(0.0f);
        t1Var2.setScaleX(0.85f);
        t1Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(t1Var, b6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(t1Var2, b6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(cd.L0(i11 < 0 ? 2131749974 : z10 ? 2131749965 : 2131749975, null));
        int i17 = zs.G3;
        if (z10) {
            linearLayout2.addView(frameLayout2, b6.t(-2, -2, 1, 0, 9, 0, 4));
            p80 p80Var2 = new p80(context, this.I0);
            a7.H(p80Var2, i16, this.I0);
            p80Var2.setTextSize(1, 14.0f);
            a7.V(p80Var2, i15, this.I0);
            p80Var2.setGravity(17);
            linearLayout2.addView(p80Var2, b6.t(-2, -2, 1, 26, 4, 26, 6));
            t1Var.setText(cd.L0(2131749964, null));
            p80Var2.setText(cd.L0(2131749963, null));
            this.o2 = p80Var2;
        } else {
            if (i11 >= 0) {
                linearLayout2.addView(frameLayout2, b6.t(-1, -2, 1, 0, 9, 0, 6));
                v5 G = e6.y(i10, false).G(j10, true);
                org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(this, G, j10, q20Var, context, 9);
                gVar.run();
                t1Var.addOnAttachStateChangeListener(new l.d(gVar, 10));
                i12 = 3;
                if (G.l.size() < 3) {
                    G.b();
                }
                zs.f(i10).h(t1Var, i17, new f11(22, G, gVar));
                yy yyVar = new yy(i12, false);
                this.a2 = yyVar;
                yyVar.O = new jg.h1(this, 11);
                this.k1.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                this.k1.setClipToPadding(false);
                this.k1.setClipChildren(false);
                this.k1.setLayoutManager(yyVar);
                this.k1.setSelectorType(9);
                this.k1.setSelectorDrawableColor(0);
                u0 u0Var = new u0();
                this.b2 = u0Var;
                u0Var.C = false;
                u0Var.m = false;
                u0Var.n(350L);
                u0Var.o(gr.h);
                u0Var.D = 40L;
                this.k1.setItemAnimator(u0Var);
                this.k1.setOnItemClickListener(new gk0() { // from class: ph.s0
                    @Override // org.telegram.ui.Components.gk0
                    public final void f(int i18, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        l1 l1Var = l1.this;
                        org.telegram.ui.ActionBar.p2 p2Var = l1Var.c;
                        int i19 = 1;
                        a51 G2 = l1Var.Q1.G(i18 - 1);
                        if (G2 != null && G2.H(b1.class)) {
                            Object obj = G2.G;
                            boolean z11 = obj instanceof kg.m;
                            Context context2 = context;
                            int i20 = i10;
                            q20 q20Var2 = q20Var;
                            int i21 = 0;
                            if (z11) {
                                new v0(l1Var, context2, i20, (kg.m) obj, l1Var.T1, new n0(l1Var, q20Var2, i21)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                v5 v5Var = l1Var.f2;
                                long j11 = j10;
                                if (v5Var != null && l1Var.j2 == l1Var.h2) {
                                    ArrayList arrayList = v5Var.l;
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i21 >= size) {
                                            savedStarGift = null;
                                            break;
                                        }
                                        Object obj2 = arrayList.get(i21);
                                        i21++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                        if (savedStarGift2.gift.id == starGift.id) {
                                            savedStarGift = savedStarGift2;
                                            break;
                                        }
                                    }
                                    if (savedStarGift == null) {
                                        return;
                                    }
                                    w0 w0Var = new w0(l1Var, l1Var.getContext(), i20, d20.i(i20).e(), l1Var.I0);
                                    w0Var.j2(savedStarGift, null);
                                    w0Var.Y1(j11, new ko(l1Var, w0Var, j11, q20Var2, 3));
                                    return;
                                }
                                if (G2.q && starGift.availability_resale > 0) {
                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                    if (T == null) {
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                                    i2Var.a = true;
                                    i2Var.e = true;
                                    x0 x0Var = new x0(j11, starGift.title, starGift.id, l1Var.I0, p2Var.getViewTreeObserver(), new o0());
                                    x0Var.e = new f11(21, l1Var, q20Var2);
                                    T.showAsSheet(x0Var, i2Var);
                                    return;
                                }
                                if (starGift.auction) {
                                    w.e1(context2, l1Var.I0, i20, j11, starGift.id, new n0(l1Var, q20Var2, i19));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new cc(p2Var, l1Var.I0).R(starGift.getDocument(), org.telegram.messenger.i0.W2(cd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    i2.g1 g1Var = new i2.g1(l1Var, context2, i20, starGift, q20Var2, 20);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i20).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, l1Var.getContext(), null);
                                        x1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i20).sendRequest(checkcansendgift, new mb((Object) l1Var, x1Var, (Object) g1Var, q20Var2, 11));
                                        return;
                                    }
                                    if (!starGift.require_premium || d20.i(i20).q()) {
                                        g1Var.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    kg.v1 v1Var = new kg.v1(T2, i20, null, null, starGift, l1Var.I0);
                                    g9 g9Var2 = new g9(l1Var.getContext());
                                    d5 d5Var = new d5(org.telegram.messenger.i0.L(160.0f), 4, g9Var2, false);
                                    g9Var2.setImageDrawable(d5Var);
                                    g9Var2.addOnAttachStateChangeListener(new sy0(d5Var, 1));
                                    d5Var.i(starGift.getDocument(), false);
                                    v1Var.t2 = g9Var2;
                                    v1Var.show();
                                    d5Var.f();
                                    return;
                                }
                                p6 p6Var = l1Var.I0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context2, p6Var, false);
                                LinearLayout f7 = m5.f(context2, 1);
                                f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                                f7.setClipChildren(false);
                                f7.setClipToPadding(false);
                                g9 g9Var3 = new g9(context2);
                                h8.c1(g9Var3.getImageReceiver(), starGift, zs.q2);
                                f7.addView(g9Var3, b6.t(zs.q2, zs.q2, 17, 0, -8, 0, 10));
                                TextView textView2 = new TextView(context2);
                                m5.m(textView2, t6.j5, p6Var, 1, 20.0f);
                                m5.l(textView2, 17, null, 2131749978);
                                TextView f10 = z20.f(f7, textView2, b6.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f10.setTextSize(1, 14.0f);
                                f10.setTypeface(org.telegram.messenger.i0.o());
                                f10.setGravity(17);
                                z20.p(f10, t6.q7, p6Var, null, 2131749979);
                                f7.addView(f10, b6.t(-1, -2, 17, 20, 0, 20, 4));
                                wy0 wy0Var = new wy0(context2, p6Var);
                                if (starGift.first_sale_date != 0) {
                                    wy0Var.g(starGift.first_sale_date, cd.L0(2131749981, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    wy0Var.g(starGift.last_sale_date, cd.L0(2131749980, null));
                                }
                                wy0Var.c(cd.L0(2131749977, null), h8.Z0(false, i0.a.k(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    h8.G0(wy0Var, i20, starGift, p6Var);
                                }
                                f7.addView(wy0Var, b6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                vh.d dVar = new vh.d(context2, p6Var, true);
                                dVar.i(cd.L0(2131747847, null), false, true);
                                f7.addView(dVar, b6.o(-1, 48));
                                k10.N = f7;
                                org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
                                z2VarArr[0].T0 = false;
                                dVar.setOnClickListener(new rh.p6(z2VarArr, 2));
                                z2VarArr[0].O();
                                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T3)) {
                                    z2VarArr[0].a0(T3);
                                }
                                z2VarArr[0].show();
                            }
                        }
                    }
                });
                f1();
                this.Q1.O(false);
                b1();
                if (org.telegram.messenger.y1.a(i10).c(j10)) {
                    e1(true);
                }
                zs.f(i10).c(this, zs.j5);
                zs.f(i10).c(this, zs.F3);
                zs.f(i10).c(this, zs.E0);
                zs.f(i10).c(this, zs.I3);
                zs.f(i10).c(this, i17);
                this.l1.setTitle(O0());
                zs.i(this.l1.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, b6.t(-2, -2, 1, 0, 9, 0, 4));
            zs.i(t1Var);
            t1Var.setText(k6.m(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749973, this.V1)), t1Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i12 = 3;
        yy yyVar2 = new yy(i12, false);
        this.a2 = yyVar2;
        yyVar2.O = new jg.h1(this, 11);
        this.k1.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        this.k1.setClipToPadding(false);
        this.k1.setClipChildren(false);
        this.k1.setLayoutManager(yyVar2);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        u0 u0Var2 = new u0();
        this.b2 = u0Var2;
        u0Var2.C = false;
        u0Var2.m = false;
        u0Var2.n(350L);
        u0Var2.o(gr.h);
        u0Var2.D = 40L;
        this.k1.setItemAnimator(u0Var2);
        this.k1.setOnItemClickListener(new gk0() { // from class: ph.s0
            @Override // org.telegram.ui.Components.gk0
            public final void f(int i18, View view) {
                TL_stars.SavedStarGift savedStarGift;
                l1 l1Var = l1.this;
                org.telegram.ui.ActionBar.p2 p2Var = l1Var.c;
                int i19 = 1;
                a51 G2 = l1Var.Q1.G(i18 - 1);
                if (G2 != null && G2.H(b1.class)) {
                    Object obj = G2.G;
                    boolean z11 = obj instanceof kg.m;
                    Context context2 = context;
                    int i20 = i10;
                    q20 q20Var2 = q20Var;
                    int i21 = 0;
                    if (z11) {
                        new v0(l1Var, context2, i20, (kg.m) obj, l1Var.T1, new n0(l1Var, q20Var2, i21)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        v5 v5Var = l1Var.f2;
                        long j11 = j10;
                        if (v5Var != null && l1Var.j2 == l1Var.h2) {
                            ArrayList arrayList = v5Var.l;
                            int size = arrayList.size();
                            while (true) {
                                if (i21 >= size) {
                                    savedStarGift = null;
                                    break;
                                }
                                Object obj2 = arrayList.get(i21);
                                i21++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                if (savedStarGift2.gift.id == starGift.id) {
                                    savedStarGift = savedStarGift2;
                                    break;
                                }
                            }
                            if (savedStarGift == null) {
                                return;
                            }
                            w0 w0Var = new w0(l1Var, l1Var.getContext(), i20, d20.i(i20).e(), l1Var.I0);
                            w0Var.j2(savedStarGift, null);
                            w0Var.Y1(j11, new ko(l1Var, w0Var, j11, q20Var2, 3));
                            return;
                        }
                        if (G2.q && starGift.availability_resale > 0) {
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T == null) {
                                return;
                            }
                            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                            i2Var.a = true;
                            i2Var.e = true;
                            x0 x0Var = new x0(j11, starGift.title, starGift.id, l1Var.I0, p2Var.getViewTreeObserver(), new o0());
                            x0Var.e = new f11(21, l1Var, q20Var2);
                            T.showAsSheet(x0Var, i2Var);
                            return;
                        }
                        if (starGift.auction) {
                            w.e1(context2, l1Var.I0, i20, j11, starGift.id, new n0(l1Var, q20Var2, i19));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new cc(p2Var, l1Var.I0).R(starGift.getDocument(), org.telegram.messenger.i0.W2(cd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            i2.g1 g1Var = new i2.g1(l1Var, context2, i20, starGift, q20Var2, 20);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i20).getCurrentTime()) {
                                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, l1Var.getContext(), null);
                                x1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i20).sendRequest(checkcansendgift, new mb((Object) l1Var, x1Var, (Object) g1Var, q20Var2, 11));
                                return;
                            }
                            if (!starGift.require_premium || d20.i(i20).q()) {
                                g1Var.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            kg.v1 v1Var = new kg.v1(T2, i20, null, null, starGift, l1Var.I0);
                            g9 g9Var2 = new g9(l1Var.getContext());
                            d5 d5Var = new d5(org.telegram.messenger.i0.L(160.0f), 4, g9Var2, false);
                            g9Var2.setImageDrawable(d5Var);
                            g9Var2.addOnAttachStateChangeListener(new sy0(d5Var, 1));
                            d5Var.i(starGift.getDocument(), false);
                            v1Var.t2 = g9Var2;
                            v1Var.show();
                            d5Var.f();
                            return;
                        }
                        p6 p6Var = l1Var.I0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context2, p6Var, false);
                        LinearLayout f7 = m5.f(context2, 1);
                        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                        f7.setClipChildren(false);
                        f7.setClipToPadding(false);
                        g9 g9Var3 = new g9(context2);
                        h8.c1(g9Var3.getImageReceiver(), starGift, zs.q2);
                        f7.addView(g9Var3, b6.t(zs.q2, zs.q2, 17, 0, -8, 0, 10));
                        TextView textView2 = new TextView(context2);
                        m5.m(textView2, t6.j5, p6Var, 1, 20.0f);
                        m5.l(textView2, 17, null, 2131749978);
                        TextView f10 = z20.f(f7, textView2, b6.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f10.setTextSize(1, 14.0f);
                        f10.setTypeface(org.telegram.messenger.i0.o());
                        f10.setGravity(17);
                        z20.p(f10, t6.q7, p6Var, null, 2131749979);
                        f7.addView(f10, b6.t(-1, -2, 17, 20, 0, 20, 4));
                        wy0 wy0Var = new wy0(context2, p6Var);
                        if (starGift.first_sale_date != 0) {
                            wy0Var.g(starGift.first_sale_date, cd.L0(2131749981, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            wy0Var.g(starGift.last_sale_date, cd.L0(2131749980, null));
                        }
                        wy0Var.c(cd.L0(2131749977, null), h8.Z0(false, i0.a.k(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            h8.G0(wy0Var, i20, starGift, p6Var);
                        }
                        f7.addView(wy0Var, b6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        vh.d dVar = new vh.d(context2, p6Var, true);
                        dVar.i(cd.L0(2131747847, null), false, true);
                        f7.addView(dVar, b6.o(-1, 48));
                        k10.N = f7;
                        org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
                        z2VarArr[0].T0 = false;
                        dVar.setOnClickListener(new rh.p6(z2VarArr, 2));
                        z2VarArr[0].O();
                        org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T3)) {
                            z2VarArr[0].a0(T3);
                        }
                        z2VarArr[0].show();
                    }
                }
            }
        });
        f1();
        this.Q1.O(false);
        b1();
        if (org.telegram.messenger.y1.a(i10).c(j10)) {
        }
        zs.f(i10).c(this, zs.j5);
        zs.f(i10).c(this, zs.F3);
        zs.f(i10).c(this, zs.E0);
        zs.f(i10).c(this, zs.I3);
        zs.f(i10).c(this, i17);
        this.l1.setTitle(O0());
        zs.i(this.l1.getTitleTextView());
    }
}
