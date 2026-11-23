package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import c8.ma;
import di.y8;
import fi.g4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a0 extends sa implements gs {
    public final ArrayList T1;
    public final List U1;
    public final List V1;
    public final List W1;
    public final TLRPC.Chat X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public xg.b c2;
    public int d2;
    public int e2;
    public int f2;
    public boolean g2;
    public int h2;
    public long i2;
    public int j2;
    public int k2;
    public long l2;
    public final yg.a m2;
    public sg.h0 n2;
    public int o2;
    public i p2;
    public final TL_stories.PrepaidGiveaway q2;
    public String r2;
    public boolean s2;
    public boolean t2;
    public final t u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g2 g2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(g2Var, false);
        int i7 = 5;
        this.T1 = new ArrayList();
        this.U1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.W1 = Arrays.asList(750, 10000, 50000);
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        this.b2 = new ArrayList();
        int i10 = yg.d.w;
        this.d2 = 2;
        this.e2 = 0;
        int i11 = yg.u.w;
        this.f2 = 0;
        this.h2 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.i2 = calendar.getTimeInMillis();
        this.j2 = 2;
        this.k2 = 2;
        this.r2 = "";
        this.t2 = true;
        this.u2 = new t(this, 0);
        this.q2 = prepaidGiveaway;
        this.v1 = 0.15f;
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        this.u0 = 0;
        c1();
        ((ViewGroup.MarginLayoutParams) this.p1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.p1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = yg.d.w;
            this.d2 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(nr.h);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        ek0 ek0Var = this.o1;
        int i14 = this.u0;
        ek0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f));
        this.o1.setOnScrollListener(new z());
        this.o1.setOnItemClickListener(new g4(23, this, g2Var));
        TLRPC.Chat O0 = np.u1(this.a).O0(Long.valueOf(-j3));
        this.X1 = O0;
        xg.b bVar = this.c2;
        ArrayList arrayList = this.T1;
        ek0 ek0Var2 = this.o1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.w = O0;
        bVar.f = ek0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        l1(false, false);
        yg.a aVar = new yg.a(getContext(), this.J0);
        this.m2 = aVar;
        aVar.setOnClickListener(new hr(this, prepaidGiveaway, j3, g2Var));
        k1(false);
        this.b.addView(aVar, ma.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.a, O0, new v(this, i7));
        ls.f(this.a).c(this, ls.z3);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        xg.b bVar = new xg.b(this.J0);
        this.c2 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        int i7 = this.e2;
        int i10 = yg.d.w;
        return i7 == 1 ? hd.N0(2131749507, null) : hd.a0("BoostingStartGiveaway", null, 2131753190, new Object[0]);
    }

    @Override // org.telegram.ui.Components.sa
    public final void S0(Canvas canvas, int i7) {
        this.o2 = i7;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ek0 ek0Var;
        if (i7 == ls.z3 && (ek0Var = this.o1) != null && ek0Var.H) {
            l1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        i iVar = this.p2;
        if (iVar != null) {
            iVar.run();
        }
        ls.f(this.a).n(this, ls.z3);
    }

    public final ArrayList e1(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption h12 = h1(j3);
        if (h12 != null) {
            for (int i7 = 0; i7 < h12.winners.size(); i7++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = h12.winners.get(i7);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int f1() {
        int i7 = this.d2;
        int i10 = yg.d.w;
        if (i7 == 2) {
            return ((Integer) this.U1.get(this.j2)).intValue();
        }
        List i12 = i1();
        int i11 = this.k2;
        if (i11 < 0 || i11 >= i12.size()) {
            this.k2 = 0;
        }
        if (this.k2 >= i12.size()) {
            return 0;
        }
        return ((Integer) i12.get(this.k2)).intValue();
    }

    public final int g1() {
        int f12;
        int g10;
        int i7 = this.d2;
        int i10 = yg.d.w;
        if (i7 == 2) {
            f12 = ((Integer) this.U1.get(this.j2)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption h12 = h1(this.l2);
            if (h12 != null) {
                return h12.yearly_boosts;
            }
            f12 = f1();
            g10 = s.g();
        }
        return g10 * f12;
    }

    public final TL_stars.TL_starsGiveawayOption h1(long j3) {
        ArrayList v = y8.y(this.a, false).v();
        if (v == null) {
            return null;
        }
        for (int i7 = 0; i7 < v.size(); i7++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i7);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j3) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List i1() {
        int i7 = this.d2;
        int i10 = yg.d.w;
        if (i7 == 2) {
            return this.U1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption h12 = h1(this.l2);
        if (h12 != null) {
            for (int i11 = 0; i11 < h12.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = h12.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean j1() {
        return this.q2 != null;
    }

    public final void k1(boolean z10) {
        boolean j12 = j1();
        yg.a aVar = this.m2;
        if (j12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.q2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(s.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i7 = this.e2;
        int i10 = yg.d.w;
        if (i7 == 0) {
            aVar.a(g1(), z10);
            return;
        }
        ArrayList arrayList = this.Z1;
        int g10 = s.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        hi.e eVar = aVar.a;
        eVar.k();
        eVar.setShowZero(true);
        eVar.setEnabled(z11);
        eVar.c(g10, z10);
        eVar.i(hd.N0(2131749507, null), z10, true);
        t6.h(m6.h5, aVar.b, aVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05d3  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(boolean z10, boolean z11) {
        int i7;
        ?? r10;
        int i10;
        boolean z12;
        String str;
        ?? r102;
        xg.b bVar;
        ?? r103;
        int i11;
        int i12;
        long longValue;
        ArrayList arrayList = this.T1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i13 = this.d2;
        int i14 = yg.d.w;
        boolean z13 = i13 == 3;
        xg.a aVar = new xg.a(0, false);
        aVar.g = z13;
        arrayList.add(aVar);
        boolean j12 = j1();
        ArrayList arrayList3 = this.Z1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.q2;
        if (j12) {
            xg.a aVar2 = new xg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            xg.a aVar3 = new xg.a(2, this.d2 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            xg.a aVar4 = new xg.a(2, this.d2 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new xg.a(4, false));
        TLRPC.Chat chat = this.X1;
        boolean V = v3.V(chat);
        int i15 = this.d2;
        ArrayList arrayList4 = this.a2;
        ArrayList arrayList5 = this.Y1;
        if (i15 == 3) {
            if (!j1()) {
                String N0 = hd.N0(2131753197, null);
                int g12 = g1();
                xg.a aVar5 = new xg.a(13, false);
                aVar5.c = N0;
                aVar5.i = g12;
                arrayList.add(aVar5);
                ArrayList v = y8.y(this.a, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    for (int i16 = 0; i16 < v.size(); i16++) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i16);
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                    }
                }
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList6.size(); i18 = i11 + 1) {
                    TL_stars.TL_starsGiveawayOption h12 = h1(((Long) arrayList6.get(i18)).longValue());
                    if (!h12.missingStorePrice) {
                        if (this.l2 == 0 && h12.isDefault) {
                            this.l2 = h12.stars;
                        }
                        if (!h12.extended || this.g2) {
                            int i19 = i17 + 1;
                            int i20 = this.g2 ? i18 : i18 + 2;
                            long j3 = h12.stars;
                            ArrayList e12 = e1(j3);
                            if (e12.isEmpty()) {
                                float f10 = j3;
                                i11 = i18;
                                i12 = i19;
                                ArrayList e13 = e1(this.l2);
                                int i21 = this.k2;
                                if (i21 < 0 || i21 >= e13.size()) {
                                    this.k2 = 0;
                                }
                                longValue = Math.round(f10 / (this.k2 >= e13.size() ? 1L : ((Long) e13.get(this.k2)).longValue()));
                            } else {
                                i11 = i18;
                                i12 = i19;
                                longValue = ((Long) e12.get(Utilities.j(this.k2, e12.size() - 1, 0))).longValue();
                            }
                            arrayList.add(xg.a.d(h12, i20, longValue, this.l2 == h12.stars, true));
                            i17 = i12;
                        }
                    }
                    i11 = i18;
                }
                if (!this.g2 && i17 < arrayList6.size()) {
                    arrayList.add(new xg.a(18, false));
                }
                if (i17 <= 0) {
                    arrayList.add(xg.a.d(null, 0, 1L, false, true));
                    arrayList.add(xg.a.d(null, 1, 1L, false, true));
                    arrayList.add(xg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = g1();
                arrayList.add(xg.a.c(hd.N0(2131753196, null), false));
                List i110 = i1();
                int i22 = this.k2;
                if (i22 < 0 || i22 >= i110.size()) {
                    this.k2 = 0;
                }
                if (i110.size() > 1) {
                    arrayList.add(xg.a.f(hd.N0(2131753192, null)));
                    List i111 = i1();
                    int i23 = this.k2;
                    xg.a aVar6 = new xg.a(5, false);
                    aVar6.k = i111;
                    aVar6.i = i23;
                    arrayList.add(aVar6);
                    arrayList.add(xg.a.c(hd.N0(2131753191, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.l2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(xg.a.f(hd.N0(2131753555, null)));
            if (!j1()) {
                arrayList.add(xg.a.b(g1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(xg.a.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(xg.a.b(s.g() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i24 = 0;
            while (i24 < size3) {
                Object obj = arrayList5.get(i24);
                i24++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(xg.a.b(g1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int g13 = g1();
                    xg.a aVar7 = new xg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = g13;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r103 = 0;
                arrayList.add(new xg.a(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(xg.a.c(hd.N0(2131753550, null), r103));
            arrayList.add(xg.a.f(hd.N0(2131753533, null)));
            int i25 = yg.u.w;
            arrayList.add(xg.a.e(r103, this.f2, true, arrayList4));
            arrayList.add(xg.a.e(1, this.f2, r103, arrayList4));
            arrayList.add(xg.a.c(hd.N0(V ? 2131753548 : 2131753547, null), r103));
        } else {
            String str2 = null;
            if (this.e2 == 0) {
                if (!j1()) {
                    String N02 = hd.N0(2131753320, null);
                    int g14 = g1();
                    xg.a aVar8 = new xg.a(13, false);
                    aVar8.c = N02;
                    aVar8.i = g14;
                    arrayList.add(aVar8);
                    int i26 = this.j2;
                    xg.a aVar9 = new xg.a(5, false);
                    aVar9.k = this.U1;
                    aVar9.i = i26;
                    arrayList.add(aVar9);
                    str2 = null;
                    arrayList.add(xg.a.c(hd.N0(2131753549, null), false));
                }
                arrayList.add(xg.a.f(hd.N0(2131753555, str2)));
                if (!j1()) {
                    arrayList.add(xg.a.b(g1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(xg.a.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(xg.a.b(s.g() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i27 = 0;
                while (i27 < size4) {
                    Object obj2 = arrayList5.get(i27);
                    i27++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(xg.a.b(g1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int g15 = g1();
                        xg.a aVar10 = new xg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = g15;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r10 = 0;
                    arrayList.add(new xg.a(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(xg.a.c(hd.N0(2131753550, null), r10));
                arrayList.add(xg.a.f(hd.N0(2131753533, null)));
                int i28 = yg.u.w;
                arrayList.add(xg.a.e(r10, this.f2, true, arrayList4));
                arrayList.add(xg.a.e(1, this.f2, r10, arrayList4));
                str2 = null;
                arrayList.add(xg.a.c(hd.N0(V ? 2131753548 : 2131753547, null), r10));
            }
            if (!j1()) {
                arrayList.add(xg.a.f(hd.N0(2131753534, str2)));
                int i29 = this.e2;
                int i30 = yg.d.w;
                ArrayList b10 = s.b(i29 == 0 ? f1() : arrayList3.size(), this.b2);
                int i31 = 0;
                while (i31 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i31);
                    int i32 = tL_premiumGiftCodeOption.months;
                    int i33 = this.e2;
                    int i34 = yg.d.w;
                    int f12 = i33 == 0 ? f1() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i35 = this.h2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z14 = i31 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    int i36 = i31;
                    xg.a aVar11 = new xg.a(12, i32 == i35);
                    aVar11.i = i32;
                    aVar11.j = f12;
                    aVar11.h = j10;
                    aVar11.g = z14;
                    aVar11.c = str3;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i31 = i36 + 1;
                    b10 = arrayList7;
                }
            }
            if (!j1()) {
                i7 = 3;
                arrayList.add(xg.a.c(org.telegram.messenger.g0.R2(hd.N0(2131753184, null), m6.Xc, 0, new t(this, i7), this.J0), true));
                i10 = this.d2;
                int i37 = yg.d.w;
                if (i10 != i7 || this.e2 == 0) {
                    String N03 = hd.N0(2131753481, null);
                    boolean z15 = this.s2;
                    int i38 = yg.y.M;
                    xg.a aVar12 = new xg.a(15, z15);
                    aVar12.c = N03;
                    aVar12.g = z15;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.s2) {
                        z12 = false;
                        str = null;
                        arrayList.add(xg.a.c(hd.N0(this.d2 == 3 ? 2131753234 : 2131753482, null), false));
                    } else {
                        int f13 = j1() ? prepaidGiveaway.quantity : f1();
                        z12 = false;
                        xg.a aVar13 = new xg.a(16, false);
                        aVar13.i = f13;
                        arrayList.add(aVar13);
                        String G = hd.G(this.h2, "BoldMonths", new Object[0]);
                        if (this.d2 == 3) {
                            if (this.r2.isEmpty()) {
                                arrayList.add(xg.a.c(org.telegram.messenger.g0.W2(hd.G((int) this.l2, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(xg.a.c(org.telegram.messenger.g0.W2(hd.G((int) this.l2, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(f13), this.r2)), false));
                            }
                        } else if (this.r2.isEmpty()) {
                            arrayList.add(xg.a.c(org.telegram.messenger.g0.W2(hd.G(f13, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(xg.a.c(org.telegram.messenger.g0.W2(hd.G(f13, "BoostingGiveawayAdditionPrizeCountNameHint", this.r2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(xg.a.f(hd.N0(2131753535, str)));
                    long j11 = this.i2;
                    xg.a aVar14 = new xg.a(10, z12);
                    aVar14.h = j11;
                    arrayList.add(aVar14);
                    if (this.d2 != 3) {
                        if (j1()) {
                            r102 = 0;
                            arrayList.add(xg.a.c(hd.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", hd.G((int) this.l2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(xg.a.c(hd.G(f1(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", hd.G((int) this.l2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (j1()) {
                            arrayList.add(xg.a.c(hd.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(xg.a.c(hd.G(f1(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String N04 = hd.N0(2131753365, null);
                    xg.a aVar15 = new xg.a(15, this.t2);
                    aVar15.c = N04;
                    aVar15.g = r102;
                    aVar15.l = r102;
                    arrayList.add(aVar15);
                    if (j1()) {
                        arrayList.add(xg.a.c(hd.N0(2131753364, null), r102));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(hd.N0(2131753364, null));
                        sb2.append(this.d2 != 3 ? i5.c.k(2131753184, null, new StringBuilder("\n\n")) : "");
                        arrayList.add(xg.a.c(org.telegram.messenger.g0.R2(sb2.toString(), m6.Xc, 0, new t(this, 4), this.J0), true));
                    }
                }
                bVar = this.c2;
                if (bVar != null && z11) {
                    if (z10) {
                        bVar.f();
                        return;
                    } else {
                        bVar.E(arrayList2, arrayList);
                        return;
                    }
                }
                return;
            }
        }
        i7 = 3;
        i10 = this.d2;
        int i372 = yg.d.w;
        if (i10 != i7) {
        }
        String N032 = hd.N0(2131753481, null);
        boolean z152 = this.s2;
        int i382 = yg.y.M;
        xg.a aVar122 = new xg.a(15, z152);
        aVar122.c = N032;
        aVar122.g = z152;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.s2) {
        }
        arrayList.add(xg.a.f(hd.N0(2131753535, str)));
        long j112 = this.i2;
        xg.a aVar142 = new xg.a(10, z12);
        aVar142.h = j112;
        arrayList.add(aVar142);
        if (this.d2 != 3) {
        }
        String N042 = hd.N0(2131753365, null);
        xg.a aVar152 = new xg.a(15, this.t2);
        aVar152.c = N042;
        aVar152.g = r102;
        aVar152.l = r102;
        arrayList.add(aVar152);
        if (j1()) {
        }
        bVar = this.c2;
        if (bVar != null) {
            if (z10) {
            }
        }
    }
}
