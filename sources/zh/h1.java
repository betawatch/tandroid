package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.dd;
import bi.ea;
import bi.gc;
import bi.i5;
import bi.m6;
import bi.sc;
import bi.ub;
import bi.v9;
import bi.va;
import c8.ha;
import c8.ka;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.ok;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class h1 extends na implements ls {
    public static final /* synthetic */ int q2 = 0;
    public final int P1;
    public l41 Q1;
    public List R1;
    public TLRPC.DisallowedGiftsSettings S1;
    public final long T1;
    public final boolean U1;
    public final String V1;
    public final sc W1;
    public final sq0 X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final jy a2;
    public final s0 b2;
    public final jb c2;
    public final jb d2;
    public final ArrayList e2;
    public final v9 f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public boolean k2;
    public boolean l2;
    public boolean m2;
    public gc n2;
    public final w70 o2;
    public boolean p2;

    public h1(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.k1, getContext(), this.P1, 0, true, new q0(this, 0), this.I0);
        this.Q1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return this.U1 ? hd.M0(2131749938, null) : i6.m(hd.a0(null, null, 2131749847, this.V1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, l41 l41Var) {
        long j3;
        boolean z9;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i7 = 2;
        sq0 sq0Var = this.X1;
        long j10 = this.T1;
        long j11 = 0;
        int i10 = 0;
        boolean z11 = this.U1;
        if (z11 || j10 < 0 || ((disallowedGiftsSettings4 = this.S1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z9 = false;
        } else {
            arrayList.add(x31.k(sq0Var));
            arrayList.add(x31.k(this.Y1));
            ArrayList arrayList2 = this.e2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                x31 q10 = x31.q(1, 34);
                q10.u = 1;
                arrayList.add(q10);
                x31 q11 = x31.q(2, 34);
                q11.u = 1;
                arrayList.add(q11);
                x31 q12 = x31.q(3, 34);
                q12.u = 1;
                arrayList.add(q12);
            } else {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = y0.b;
                    long j12 = j11;
                    x31 K = x31.K(y0.class);
                    K.u = 1;
                    K.G = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j12;
                }
                j3 = j11;
            }
            z9 = true;
        }
        int i13 = this.P1;
        ea y10 = ea.y(i13, false);
        ArrayList arrayList3 = this.k2 ? y10.J : y10.I;
        if (this.S1 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new hi.j1(this, i7)).collect(Collectors.toCollection(new ok(1)));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new aa.m(7)).collect(Collectors.toCollection(new ok(1)));
        }
        long e10 = p10.i(i13).e();
        v9 v9Var = this.f2;
        if (j10 != e10 && v9Var != null) {
            ArrayList arrayList4 = v9Var.l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (qp.s1(i13).Y5 || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.S1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || v9Var == null || v9Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.S1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(x31.D(org.telegram.messenger.g0.L(300.0f)));
            return;
        }
        if (z9) {
            arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
        } else {
            arrayList.add(x31.k(sq0Var));
        }
        arrayList.add(x31.k(this.Z1));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.S1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i15)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.h2 = -1;
        this.g2 = -1;
        if (!arrayList3.isEmpty()) {
            this.g2 = arrayList5.size();
            arrayList5.add(hd.M0(2131749949, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.S1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z10) {
            this.h2 = arrayList5.size();
            arrayList5.add(hd.M0(2131749945, null));
        }
        this.i2 = arrayList5.size();
        arrayList5.add(hd.M0(2131749948, null));
        if (this.l2 && !this.m2) {
            this.m2 = true;
            this.j2 = this.i2;
        }
        int i16 = this.j2;
        n0 n0Var = new n0(this, i10);
        int i17 = f1.b;
        x31 K2 = x31.K(f1.class);
        K2.d = 1;
        K2.G = arrayList5;
        K2.z = i16;
        K2.H = n0Var;
        arrayList.add(K2);
        boolean z12 = this.j2 == this.i2 && !z11 && j10 >= j3;
        if (z12 != this.p2) {
            this.p2 = z12;
            ViewPropertyAnimator duration = this.c2.animate().alpha(!z12 ? 1.0f : 0.0f).scaleX(!z12 ? 1.0f : 0.85f).scaleY(!z12 ? 1.0f : 0.85f).setDuration(380L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            this.d2.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.85f).scaleY(z12 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(xqVar).start();
        }
        if (v9Var != null && this.j2 == this.h2) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = v9Var.l;
            int size3 = arrayList6.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList6.get(i18);
                i18++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i20);
            int i21 = this.j2;
            if (i21 == this.g2 || i21 == this.h2 || (i21 == this.i2 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j3 || i21 == this.i2) {
                    starGift = starGift3;
                } else {
                    x31 i22 = y0.i(i21, starGift3, i21 == this.h2, starGift3.limited && (disallowedGiftsSettings2 = this.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(i22);
                    i19++;
                }
                int i23 = this.j2;
                arrayList.add(y0.i(i23, starGift, i23 == this.h2, starGift.limited && (disallowedGiftsSettings = this.S1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i19++;
            }
        }
        int i24 = this.j2;
        int i25 = this.h2;
        if (i24 == i25 && v9Var != null && !v9Var.j) {
            v9Var.a();
            x31 q13 = x31.q(4, 34);
            q13.u = 1;
            arrayList.add(q13);
            x31 q14 = x31.q(5, 34);
            q14.u = 1;
            arrayList.add(q14);
            x31 q15 = x31.q(6, 34);
            q15.u = 1;
            arrayList.add(q15);
        } else if (i24 != i25 && y10.C) {
            x31 q16 = x31.q(4, 34);
            q16.u = 1;
            arrayList.add(q16);
            x31 q17 = x31.q(5, 34);
            q17.u = 1;
            arrayList.add(q17);
            x31 q18 = x31.q(6, 34);
            q18.u = 1;
            arrayList.add(q18);
        }
        arrayList.add(x31.D(org.telegram.messenger.g0.L(i19 >= 9 ? 40.0f : 300.0f)));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if (i7 == qs.j5) {
            f1();
            return;
        }
        if (i7 == qs.F3) {
            l41 l41Var2 = this.Q1;
            if (l41Var2 != null) {
                l41Var2.O(true);
                return;
            }
            return;
        }
        if (i7 != qs.E0) {
            if (i7 != qs.I3) {
                if (i7 == qs.G3 && objArr[1] == this.f2 && (l41Var = this.Q1) != null) {
                    l41Var.O(true);
                    return;
                }
                return;
            }
            if (this.I) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new hc(this.c, this.I0).s(starGift.sticker, hd.M0(2131749966, null), org.telegram.messenger.g0.X2(hd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            l41 l41Var3 = this.Q1;
            if (l41Var3 != null) {
                l41Var3.O(true);
                return;
            }
            return;
        }
        if (this.I) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        long j3 = this.T1;
        if (longValue == j3 && j3 > 0) {
            int i11 = this.P1;
            TLRPC.UserFull b22 = qp.s1(i11).b2(j3);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j3 == p10.i(i11).e() || b22 == null) ? null : b22.disallowed_stargifts;
            this.S1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.messenger.camera.q.s(hd.a0(null, null, 2131743743, m5.t(j3)), hc.a0(T), R.raw.error, 36);
                    return;
                }
                return;
            }
            l41 l41Var4 = this.Q1;
            if (l41Var4 != null) {
                l41Var4.O(true);
            }
        }
        ArrayList arrayList = this.e2;
        if (arrayList == null || arrayList.isEmpty()) {
            f1();
            l41 l41Var5 = this.Q1;
            if (l41Var5 != null) {
                l41Var5.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        int i7 = this.P1;
        qs.f(i7).n(this, qs.j5);
        qs.f(i7).n(this, qs.F3);
        qs.f(i7).n(this, qs.E0);
        qs.f(i7).n(this, qs.I3);
        qs.f(i7).n(this, qs.G3);
    }

    public final void e1(boolean z9) {
        this.k2 = z9;
        this.Q1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.e2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.R1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
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
                    ug.j jVar = new ug.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        f5.a aVar = new f5.a();
                        aVar.b = "inapp";
                        aVar.a = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj).g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new u5.e(this, 15));
            }
        }
        if (arrayList.isEmpty()) {
            wg.s.j(this.P1, null, new n0(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        int i7 = this.P1;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.S1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.messenger.camera.q.s(hd.a0(null, null, 2131743743, m5.t(this.T1)), hc.a0(T), R.raw.error, 36);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0450  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1(final Context context, final int i7, final long j3, List list, final c20 c20Var) {
        super(context, null, false, false, null);
        int i10;
        int i11;
        this.e2 = new ArrayList();
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        new ArrayList();
        this.P1 = i7;
        this.T1 = j3;
        boolean z9 = p10.i(i7).e() == j3;
        this.U1 = z9;
        this.R1 = list;
        int i12 = k6.b6;
        w0(i12);
        P(i12);
        this.f2 = ea.y(i7, false).G(p10.i(i7).e(), true);
        ea.y(i7, false).U();
        l9 l9Var = new l9(context);
        int i13 = 2;
        l9Var.setImportantForAccessibility(2);
        w8 w8Var = new w8((f6) null);
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            this.V1 = t10.k(a22);
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
            TLRPC.UserFull b22 = qp.s1(i7).b2(j3);
            this.S1 = (j3 == p10.i(i7).e() || b22 == null) ? null : b22.disallowed_stargifts;
            if (b22 == null) {
                qp.s1(i7).W2(a22, 0, true, null);
            }
            i10 = i14;
        } else {
            i10 = i14;
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            this.V1 = M0 == null ? "" : M0.title;
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
        }
        this.r1 = 0.1f;
        sc scVar = new sc(i7, context, this.I0);
        this.W1 = scVar;
        ka.a(scVar);
        scVar.setOnClickListener(new a(this, i13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y1 = frameLayout;
        sq0 sq0Var = new sq0(context, 21);
        this.X1 = sq0Var;
        sq0Var.setClipChildren(false);
        sq0Var.setClipToPadding(false);
        gc gcVar = new gc(context, 70, 0, 0);
        this.n2 = gcVar;
        sq0Var.addView(gcVar, ha.c(-1.0f, -1));
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(42.0f));
        sq0Var.addView(l9Var, ha.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ka.a(l9Var);
        l9Var.setOnClickListener(new di.u1(this, j3, 5));
        sq0Var.addView(scVar, ha.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, ha.e(-1, -2, 55));
        TextView g10 = k5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        int i15 = k6.j5;
        r6.V(g10, i15, this.I0);
        g10.setGravity(17);
        linearLayout.addView(g10, ha.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(fi.m3.a(g10.getText(), g10.getPaint()));
        w70 w70Var = new w70(context, this.I0);
        int i16 = k6.Uc;
        r6.H(w70Var, i16, this.I0);
        w70Var.setTextSize(1, 14.0f);
        r6.V(w70Var, i15, this.I0);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.33f), 1.0f);
        linearLayout.addView(w70Var, ha.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(hd.M0(2131750074, null));
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750073, this.V1)), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(hd.M0(2131750072, null), new org.telegram.ui.Wallet.z(20)), true)));
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z1 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        r6.V(textView, i15, this.I0);
        textView.setGravity(17);
        linearLayout2.addView(textView, ha.t(-1, -2, 1, 4, 0, 4, 0));
        jb jbVar = new jb(5, context, this.I0);
        this.c2 = jbVar;
        r6.H(jbVar, i16, this.I0);
        jbVar.setTextSize(1, 14.0f);
        r6.V(jbVar, i15, this.I0);
        jbVar.setGravity(17);
        jb jbVar2 = new jb(6, context, this.I0);
        this.d2 = jbVar2;
        r6.H(jbVar2, i16, this.I0);
        jbVar2.setTextSize(1, 14.0f);
        r6.V(jbVar2, i15, this.I0);
        jbVar2.setGravity(17);
        jbVar2.setAlpha(0.0f);
        jbVar2.setScaleX(0.85f);
        jbVar2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(jbVar, ha.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(jbVar2, ha.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(hd.M0(i10 < 0 ? 2131749964 : z9 ? 2131749955 : 2131749965, null));
        int i17 = 16;
        int i18 = qs.G3;
        if (z9) {
            linearLayout2.addView(frameLayout2, ha.t(-2, -2, 1, 0, 9, 0, 4));
            w70 w70Var2 = new w70(context, this.I0);
            r6.H(w70Var2, i16, this.I0);
            w70Var2.setTextSize(1, 14.0f);
            r6.V(w70Var2, i15, this.I0);
            w70Var2.setGravity(17);
            linearLayout2.addView(w70Var2, ha.t(-2, -2, 1, 26, 4, 26, 6));
            jbVar.setText(hd.M0(2131749954, null));
            w70Var2.setText(hd.M0(2131749953, null));
            this.o2 = w70Var2;
        } else {
            if (i10 >= 0) {
                linearLayout2.addView(frameLayout2, ha.t(-1, -2, 1, 0, 9, 0, 6));
                v9 G = ea.y(i7, false).G(j3, true);
                bi.i0 i0Var = new bi.i0(this, G, j3, c20Var, context);
                i0Var.run();
                jbVar.addOnAttachStateChangeListener(new m6(i0Var, 12));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                qs.f(i7).h(jbVar, i18, new org.telegram.ui.Wallet.t(i17, G, i0Var));
                jy jyVar = new jy(i11, false);
                this.a2 = jyVar;
                jyVar.O = new ai.l(this, i17);
                this.k1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                this.k1.setClipToPadding(false);
                this.k1.setClipChildren(false);
                this.k1.setLayoutManager(jyVar);
                this.k1.setSelectorType(9);
                this.k1.setSelectorDrawableColor(0);
                s0 s0Var = new s0();
                this.b2 = s0Var;
                s0Var.C = false;
                s0Var.m = false;
                s0Var.n(350L);
                s0Var.o(xq.h);
                s0Var.D = 40L;
                this.k1.setItemAnimator(s0Var);
                this.k1.setOnItemClickListener(new bj0() { // from class: zh.p0
                    @Override // org.telegram.ui.Components.bj0
                    public final void c(int i19, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        h1 h1Var = h1.this;
                        org.telegram.ui.ActionBar.l2 l2Var = h1Var.c;
                        int i20 = 1;
                        x31 G2 = h1Var.Q1.G(i19 - 1);
                        if (G2 != null && G2.H(y0.class)) {
                            Object obj = G2.G;
                            boolean z10 = obj instanceof ug.j;
                            Context context2 = context;
                            int i21 = i7;
                            c20 c20Var2 = c20Var;
                            int i22 = 0;
                            if (z10) {
                                new t0(h1Var, context2, i21, (ug.j) obj, h1Var.T1, new l0(h1Var, c20Var2, i22)).show();
                                return;
                            }
                            if (obj instanceof TL_stars.StarGift) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                v9 v9Var = h1Var.f2;
                                long j10 = j3;
                                if (v9Var != null && h1Var.j2 == h1Var.h2) {
                                    ArrayList arrayList = v9Var.l;
                                    int size = arrayList.size();
                                    while (true) {
                                        if (i22 >= size) {
                                            savedStarGift = null;
                                            break;
                                        }
                                        Object obj2 = arrayList.get(i22);
                                        i22++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                        if (savedStarGift2.gift.id == starGift.id) {
                                            savedStarGift = savedStarGift2;
                                            break;
                                        }
                                    }
                                    if (savedStarGift == null) {
                                        return;
                                    }
                                    i5 i5Var = new i5(h1Var, h1Var.getContext(), i21, p10.i(i21).e(), h1Var.I0);
                                    i5Var.j2(savedStarGift, null);
                                    i5Var.Y1(j10, new bi.r2(h1Var, i5Var, j10, c20Var2, 7));
                                    return;
                                }
                                if (G2.q && starGift.availability_resale > 0) {
                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                    if (T == null) {
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                                    d2Var.a = true;
                                    d2Var.e = true;
                                    u0 u0Var = new u0(j10, starGift.title, starGift.id, h1Var.I0, l2Var.getViewTreeObserver(), new m0());
                                    u0Var.e = new org.telegram.ui.Wallet.t(15, h1Var, c20Var2);
                                    T.showAsSheet(u0Var, d2Var);
                                    return;
                                }
                                if (starGift.auction) {
                                    v.e1(context2, h1Var.I0, i21, j10, starGift.id, new l0(h1Var, c20Var2, i20));
                                    return;
                                }
                                if (!starGift.sold_out) {
                                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                        new hc(l2Var, h1Var.I0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(hd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                        return;
                                    }
                                    ub ubVar = new ub(h1Var, context2, i21, starGift, c20Var2, 26);
                                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, h1Var.getContext(), null);
                                        u1Var.r(500L);
                                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                        checkcansendgift.gift_id = starGift.id;
                                        ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new bi.g2(h1Var, u1Var, ubVar, c20Var2, 20));
                                        return;
                                    }
                                    if (!starGift.require_premium || p10.i(i21).q()) {
                                        ubVar.run();
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                    if (T2 == null) {
                                        return;
                                    }
                                    ug.f1 f1Var = new ug.f1(T2, i21, null, null, starGift, h1Var.I0);
                                    l9 l9Var2 = new l9(h1Var.getContext());
                                    g5 g5Var = new g5(org.telegram.messenger.g0.L(160.0f), 4, l9Var2, false);
                                    l9Var2.setImageDrawable(g5Var);
                                    l9Var2.addOnAttachStateChangeListener(new px0(g5Var, 1));
                                    g5Var.i(starGift.getDocument(), false);
                                    f1Var.t2 = l9Var2;
                                    f1Var.show();
                                    g5Var.f();
                                    return;
                                }
                                f6 f6Var = h1Var.I0;
                                if (context2 == null) {
                                    return;
                                }
                                org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context2, f6Var, false);
                                LinearLayout f10 = k5.f(context2, 1);
                                f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                f10.setClipChildren(false);
                                f10.setClipToPadding(false);
                                l9 l9Var3 = new l9(context2);
                                dd.d1(l9Var3.getImageReceiver(), starGift, qs.q2);
                                f10.addView(l9Var3, ha.t(qs.q2, qs.q2, 17, 0, -8, 0, 10));
                                TextView textView2 = new TextView(context2);
                                k5.n(textView2, k6.j5, f6Var, 1, 20.0f);
                                k5.m(textView2, 17, null, 2131749968);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, ha.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                f11.setTextSize(1, 14.0f);
                                f11.setTypeface(org.telegram.messenger.g0.o());
                                f11.setGravity(17);
                                org.telegram.messenger.camera.q.o(f11, k6.q7, f6Var, null, 2131749969);
                                f10.addView(f11, ha.t(-1, -2, 17, 20, 0, 20, 4));
                                tx0 tx0Var = new tx0(context2, f6Var);
                                if (starGift.first_sale_date != 0) {
                                    tx0Var.g(starGift.first_sale_date, hd.M0(2131749971, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    tx0Var.g(starGift.last_sale_date, hd.M0(2131749970, null));
                                }
                                tx0Var.c(hd.M0(2131749967, null), dd.a1(false, jg.g.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    dd.H0(tx0Var, i21, starGift, f6Var);
                                }
                                f10.addView(tx0Var, ha.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                fi.d dVar = new fi.d(context2, f6Var, true);
                                dVar.i(hd.M0(2131747830, null), false, true);
                                f10.addView(dVar, ha.o(-1, 48));
                                l10.N = f10;
                                org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
                                v2VarArr[0].T0 = false;
                                dVar.setOnClickListener(new va(v2VarArr, 2));
                                v2VarArr[0].N();
                                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                                    v2VarArr[0].a0(T3);
                                }
                                v2VarArr[0].show();
                            }
                        }
                    }
                });
                f1();
                this.Q1.O(false);
                b1();
                if (org.telegram.messenger.v1.a(i7).c(j3)) {
                    e1(true);
                }
                qs.f(i7).c(this, qs.j5);
                qs.f(i7).c(this, qs.F3);
                qs.f(i7).c(this, qs.E0);
                qs.f(i7).c(this, qs.I3);
                qs.f(i7).c(this, i18);
                this.l1.setTitle(O0());
                qs.i(this.l1.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, ha.t(-2, -2, 1, 0, 9, 0, 4));
            qs.i(jbVar);
            jbVar.setText(i6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749963, this.V1)), jbVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i11 = 3;
        jy jyVar2 = new jy(i11, false);
        this.a2 = jyVar2;
        jyVar2.O = new ai.l(this, i17);
        this.k1.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.k1.setClipToPadding(false);
        this.k1.setClipChildren(false);
        this.k1.setLayoutManager(jyVar2);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        s0 s0Var2 = new s0();
        this.b2 = s0Var2;
        s0Var2.C = false;
        s0Var2.m = false;
        s0Var2.n(350L);
        s0Var2.o(xq.h);
        s0Var2.D = 40L;
        this.k1.setItemAnimator(s0Var2);
        this.k1.setOnItemClickListener(new bj0() { // from class: zh.p0
            @Override // org.telegram.ui.Components.bj0
            public final void c(int i19, View view) {
                TL_stars.SavedStarGift savedStarGift;
                h1 h1Var = h1.this;
                org.telegram.ui.ActionBar.l2 l2Var = h1Var.c;
                int i20 = 1;
                x31 G2 = h1Var.Q1.G(i19 - 1);
                if (G2 != null && G2.H(y0.class)) {
                    Object obj = G2.G;
                    boolean z10 = obj instanceof ug.j;
                    Context context2 = context;
                    int i21 = i7;
                    c20 c20Var2 = c20Var;
                    int i22 = 0;
                    if (z10) {
                        new t0(h1Var, context2, i21, (ug.j) obj, h1Var.T1, new l0(h1Var, c20Var2, i22)).show();
                        return;
                    }
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        v9 v9Var = h1Var.f2;
                        long j10 = j3;
                        if (v9Var != null && h1Var.j2 == h1Var.h2) {
                            ArrayList arrayList = v9Var.l;
                            int size = arrayList.size();
                            while (true) {
                                if (i22 >= size) {
                                    savedStarGift = null;
                                    break;
                                }
                                Object obj2 = arrayList.get(i22);
                                i22++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                if (savedStarGift2.gift.id == starGift.id) {
                                    savedStarGift = savedStarGift2;
                                    break;
                                }
                            }
                            if (savedStarGift == null) {
                                return;
                            }
                            i5 i5Var = new i5(h1Var, h1Var.getContext(), i21, p10.i(i21).e(), h1Var.I0);
                            i5Var.j2(savedStarGift, null);
                            i5Var.Y1(j10, new bi.r2(h1Var, i5Var, j10, c20Var2, 7));
                            return;
                        }
                        if (G2.q && starGift.availability_resale > 0) {
                            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                            if (T == null) {
                                return;
                            }
                            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                            d2Var.a = true;
                            d2Var.e = true;
                            u0 u0Var = new u0(j10, starGift.title, starGift.id, h1Var.I0, l2Var.getViewTreeObserver(), new m0());
                            u0Var.e = new org.telegram.ui.Wallet.t(15, h1Var, c20Var2);
                            T.showAsSheet(u0Var, d2Var);
                            return;
                        }
                        if (starGift.auction) {
                            v.e1(context2, h1Var.I0, i21, j10, starGift.id, new l0(h1Var, c20Var2, i20));
                            return;
                        }
                        if (!starGift.sold_out) {
                            if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                new hc(l2Var, h1Var.I0).R(starGift.getDocument(), org.telegram.messenger.g0.X2(hd.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                return;
                            }
                            ub ubVar = new ub(h1Var, context2, i21, starGift, c20Var2, 26);
                            if (starGift.locked_until_date > ConnectionsManager.getInstance(i21).getCurrentTime()) {
                                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, h1Var.getContext(), null);
                                u1Var.r(500L);
                                TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                checkcansendgift.gift_id = starGift.id;
                                ConnectionsManager.getInstance(i21).sendRequest(checkcansendgift, new bi.g2(h1Var, u1Var, ubVar, c20Var2, 20));
                                return;
                            }
                            if (!starGift.require_premium || p10.i(i21).q()) {
                                ubVar.run();
                                return;
                            }
                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                            if (T2 == null) {
                                return;
                            }
                            ug.f1 f1Var = new ug.f1(T2, i21, null, null, starGift, h1Var.I0);
                            l9 l9Var2 = new l9(h1Var.getContext());
                            g5 g5Var = new g5(org.telegram.messenger.g0.L(160.0f), 4, l9Var2, false);
                            l9Var2.setImageDrawable(g5Var);
                            l9Var2.addOnAttachStateChangeListener(new px0(g5Var, 1));
                            g5Var.i(starGift.getDocument(), false);
                            f1Var.t2 = l9Var2;
                            f1Var.show();
                            g5Var.f();
                            return;
                        }
                        f6 f6Var = h1Var.I0;
                        if (context2 == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context2, f6Var, false);
                        LinearLayout f10 = k5.f(context2, 1);
                        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                        f10.setClipChildren(false);
                        f10.setClipToPadding(false);
                        l9 l9Var3 = new l9(context2);
                        dd.d1(l9Var3.getImageReceiver(), starGift, qs.q2);
                        f10.addView(l9Var3, ha.t(qs.q2, qs.q2, 17, 0, -8, 0, 10));
                        TextView textView2 = new TextView(context2);
                        k5.n(textView2, k6.j5, f6Var, 1, 20.0f);
                        k5.m(textView2, 17, null, 2131749968);
                        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, ha.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        f11.setTextSize(1, 14.0f);
                        f11.setTypeface(org.telegram.messenger.g0.o());
                        f11.setGravity(17);
                        org.telegram.messenger.camera.q.o(f11, k6.q7, f6Var, null, 2131749969);
                        f10.addView(f11, ha.t(-1, -2, 17, 20, 0, 20, 4));
                        tx0 tx0Var = new tx0(context2, f6Var);
                        if (starGift.first_sale_date != 0) {
                            tx0Var.g(starGift.first_sale_date, hd.M0(2131749971, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            tx0Var.g(starGift.last_sale_date, hd.M0(2131749970, null));
                        }
                        tx0Var.c(hd.M0(2131749967, null), dd.a1(false, jg.g.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            dd.H0(tx0Var, i21, starGift, f6Var);
                        }
                        f10.addView(tx0Var, ha.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        fi.d dVar = new fi.d(context2, f6Var, true);
                        dVar.i(hd.M0(2131747830, null), false, true);
                        f10.addView(dVar, ha.o(-1, 48));
                        l10.N = f10;
                        org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
                        v2VarArr[0].T0 = false;
                        dVar.setOnClickListener(new va(v2VarArr, 2));
                        v2VarArr[0].N();
                        org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T3)) {
                            v2VarArr[0].a0(T3);
                        }
                        v2VarArr[0].show();
                    }
                }
            }
        });
        f1();
        this.Q1.O(false);
        b1();
        if (org.telegram.messenger.v1.a(i7).c(j3)) {
        }
        qs.f(i7).c(this, qs.j5);
        qs.f(i7).c(this, qs.F3);
        qs.f(i7).c(this, qs.E0);
        qs.f(i7).c(this, qs.I3);
        qs.f(i7).c(this, i18);
        this.l1.setTitle(O0());
        qs.i(this.l1.getTitleTextView());
    }
}
