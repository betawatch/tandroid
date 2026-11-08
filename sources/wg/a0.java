package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import bi.ea;
import c8.ha;
import di.p4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a0 extends na implements ls {
    public final ArrayList P1;
    public final List Q1;
    public final List R1;
    public final List S1;
    public final TLRPC.Chat T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public xg.c Y1;
    public int Z1;
    public int a2;
    public int b2;
    public boolean c2;
    public int d2;
    public long e2;
    public int f2;
    public int g2;
    public long h2;
    public final yg.a i2;
    public sg.i0 j2;
    public int k2;
    public i l2;
    public final TL_stories.PrepaidGiveaway m2;
    public String n2;
    public boolean o2;
    public boolean p2;
    public final t q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f2 f2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(f2Var, false);
        int i7 = 5;
        this.P1 = new ArrayList();
        this.Q1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.R1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.S1 = Arrays.asList(750, 10000, 50000);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        int i10 = yg.d.w;
        this.Z1 = 2;
        this.a2 = 0;
        int i11 = yg.u.w;
        this.b2 = 0;
        this.d2 = 12;
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
        this.e2 = calendar.getTimeInMillis();
        this.f2 = 2;
        this.g2 = 2;
        this.n2 = "";
        this.p2 = true;
        this.q2 = new t(this, 0);
        this.m2 = prepaidGiveaway;
        this.r1 = 0.15f;
        this.u0 = false;
        this.v0 = false;
        this.T0 = false;
        this.t0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = yg.d.w;
            this.Z1 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.m = false;
        this.k1.setItemAnimator(kVar);
        pj0 pj0Var = this.k1;
        int i14 = this.t0;
        pj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f));
        this.k1.setOnScrollListener(new z());
        this.k1.setOnItemClickListener(new p4(23, this, f2Var));
        TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-j3));
        this.T1 = M0;
        xg.c cVar = this.Y1;
        ArrayList arrayList = this.P1;
        pj0 pj0Var2 = this.k1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        cVar.e = arrayList;
        cVar.w = M0;
        cVar.f = pj0Var2;
        cVar.h = uVar;
        cVar.n = uVar2;
        cVar.s = uVar3;
        k1(false, false);
        yg.a aVar = new yg.a(getContext(), this.I0);
        this.i2 = aVar;
        aVar.setOnClickListener(new rq(this, prepaidGiveaway, j3, f2Var));
        j1(false);
        this.b.addView(aVar, ha.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.a, M0, new v(this, i7));
        qs.f(this.a).c(this, qs.x3);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        xg.c cVar = new xg.c(this.I0);
        this.Y1 = cVar;
        return cVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        int i7 = this.a2;
        int i10 = yg.d.w;
        return i7 == 1 ? id.M0(2131749681, null) : id.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override // org.telegram.ui.Components.na
    public final void R0(Canvas canvas, int i7) {
        this.k2 = i7;
    }

    public final ArrayList d1(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j3);
        if (g12 != null) {
            for (int i7 = 0; i7 < g12.winners.size(); i7++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i7);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        pj0 pj0Var;
        if (i7 == qs.x3 && (pj0Var = this.k1) != null && pj0Var.G) {
            k1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        i iVar = this.l2;
        if (iVar != null) {
            iVar.run();
        }
        qs.f(this.a).n(this, qs.x3);
    }

    public final int e1() {
        int i7 = this.Z1;
        int i10 = yg.d.w;
        if (i7 == 2) {
            return ((Integer) this.Q1.get(this.f2)).intValue();
        }
        List h12 = h1();
        int i11 = this.g2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.g2 = 0;
        }
        if (this.g2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.g2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i7 = this.Z1;
        int i10 = yg.d.w;
        if (i7 == 2) {
            e12 = ((Integer) this.Q1.get(this.f2)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.h2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = s.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j3) {
        ArrayList v = ea.y(this.a, false).v();
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

    public final List h1() {
        int i7 = this.Z1;
        int i10 = yg.d.w;
        if (i7 == 2) {
            return this.Q1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.h2);
        if (g12 != null) {
            for (int i11 = 0; i11 < g12.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean i1() {
        return this.m2 != null;
    }

    public final void j1(boolean z9) {
        boolean i12 = i1();
        yg.a aVar = this.i2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.m2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z9);
                return;
            } else {
                aVar.a(s.g() * prepaidGiveaway.quantity, z9);
                return;
            }
        }
        int i7 = this.a2;
        int i10 = yg.d.w;
        if (i7 == 0) {
            aVar.a(f1(), z9);
            return;
        }
        ArrayList arrayList = this.V1;
        int g10 = s.g() * arrayList.size();
        boolean z10 = arrayList.size() > 0;
        aVar.e = true;
        fi.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z10);
        dVar.c(g10, z9);
        dVar.i(id.M0(2131749681, null), z9, true);
        r6.i(k6.h5, aVar.b, aVar.c);
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
    public final void k1(boolean z9, boolean z10) {
        int i7;
        ?? r10;
        int i10;
        boolean z11;
        String str;
        ?? r102;
        xg.c cVar;
        ?? r103;
        int i11;
        int i12;
        long longValue;
        ArrayList arrayList = this.P1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i13 = this.Z1;
        int i14 = yg.d.w;
        boolean z12 = i13 == 3;
        xg.b bVar = new xg.b(0, false);
        bVar.g = z12;
        arrayList.add(bVar);
        boolean i15 = i1();
        ArrayList arrayList3 = this.V1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.m2;
        if (i15) {
            xg.b bVar2 = new xg.b(14, false);
            bVar2.f = prepaidGiveaway;
            arrayList.add(bVar2);
        } else {
            int size = arrayList3.size();
            xg.b bVar3 = new xg.b(2, this.Z1 == 2);
            bVar3.l = 2;
            bVar3.i = size;
            bVar3.f = null;
            arrayList.add(bVar3);
            int size2 = arrayList3.size();
            xg.b bVar4 = new xg.b(2, this.Z1 == 3);
            bVar4.l = 3;
            bVar4.i = size2;
            bVar4.f = null;
            arrayList.add(bVar4);
        }
        arrayList.add(new xg.b(4, false));
        TLRPC.Chat chat = this.T1;
        boolean V = t3.V(chat);
        int i16 = this.Z1;
        ArrayList arrayList4 = this.W1;
        ArrayList arrayList5 = this.U1;
        if (i16 == 3) {
            if (!i1()) {
                String M0 = id.M0(2131753200, null);
                int f12 = f1();
                xg.b bVar5 = new xg.b(13, false);
                bVar5.c = M0;
                bVar5.i = f12;
                arrayList.add(bVar5);
                ArrayList v = ea.y(this.a, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    for (int i17 = 0; i17 < v.size(); i17++) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i17);
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                    }
                }
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList6.size(); i19 = i11 + 1) {
                    TL_stars.TL_starsGiveawayOption g12 = g1(((Long) arrayList6.get(i19)).longValue());
                    if (!g12.missingStorePrice) {
                        if (this.h2 == 0 && g12.isDefault) {
                            this.h2 = g12.stars;
                        }
                        if (!g12.extended || this.c2) {
                            int i20 = i18 + 1;
                            int i21 = this.c2 ? i19 : i19 + 2;
                            long j3 = g12.stars;
                            ArrayList d12 = d1(j3);
                            if (d12.isEmpty()) {
                                float f10 = j3;
                                i11 = i19;
                                i12 = i20;
                                ArrayList d13 = d1(this.h2);
                                int i22 = this.g2;
                                if (i22 < 0 || i22 >= d13.size()) {
                                    this.g2 = 0;
                                }
                                longValue = Math.round(f10 / (this.g2 >= d13.size() ? 1L : ((Long) d13.get(this.g2)).longValue()));
                            } else {
                                i11 = i19;
                                i12 = i20;
                                longValue = ((Long) d12.get(Utilities.j(this.g2, d12.size() - 1, 0))).longValue();
                            }
                            arrayList.add(xg.b.d(g12, i21, longValue, this.h2 == g12.stars, true));
                            i18 = i12;
                        }
                    }
                    i11 = i19;
                }
                if (!this.c2 && i18 < arrayList6.size()) {
                    arrayList.add(new xg.b(18, false));
                }
                if (i18 <= 0) {
                    arrayList.add(xg.b.d(null, 0, 1L, false, true));
                    arrayList.add(xg.b.d(null, 1, 1L, false, true));
                    arrayList.add(xg.b.d(null, 2, 1L, false, false));
                }
                bVar5.i = f1();
                arrayList.add(xg.b.c(id.M0(2131753199, null), false));
                List h12 = h1();
                int i23 = this.g2;
                if (i23 < 0 || i23 >= h12.size()) {
                    this.g2 = 0;
                }
                if (h12.size() > 1) {
                    arrayList.add(xg.b.f(id.M0(2131753195, null)));
                    List h13 = h1();
                    int i24 = this.g2;
                    xg.b bVar6 = new xg.b(5, false);
                    bVar6.k = h13;
                    bVar6.i = i24;
                    arrayList.add(bVar6);
                    arrayList.add(xg.b.c(id.M0(2131753194, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.h2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(xg.b.f(id.M0(2131753558, null)));
            if (!i1()) {
                arrayList.add(xg.b.b(f1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(xg.b.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(xg.b.b(s.g() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList5.get(i25);
                i25++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(xg.b.b(f1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int f13 = f1();
                    xg.b bVar7 = new xg.b(9, false);
                    bVar7.d = (TLRPC.InputPeer) tLObject;
                    bVar7.e = null;
                    bVar7.g = true;
                    bVar7.i = f13;
                    arrayList.add(bVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r103 = 0;
                arrayList.add(new xg.b(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(xg.b.c(id.M0(2131753553, null), r103));
            arrayList.add(xg.b.f(id.M0(2131753536, null)));
            int i26 = yg.u.w;
            arrayList.add(xg.b.e(r103, this.b2, true, arrayList4));
            arrayList.add(xg.b.e(1, this.b2, r103, arrayList4));
            arrayList.add(xg.b.c(id.M0(V ? 2131753551 : 2131753550, null), r103));
        } else {
            String str2 = null;
            if (this.a2 == 0) {
                if (!i1()) {
                    String M02 = id.M0(2131753323, null);
                    int f14 = f1();
                    xg.b bVar8 = new xg.b(13, false);
                    bVar8.c = M02;
                    bVar8.i = f14;
                    arrayList.add(bVar8);
                    int i27 = this.f2;
                    xg.b bVar9 = new xg.b(5, false);
                    bVar9.k = this.Q1;
                    bVar9.i = i27;
                    arrayList.add(bVar9);
                    str2 = null;
                    arrayList.add(xg.b.c(id.M0(2131753552, null), false));
                }
                arrayList.add(xg.b.f(id.M0(2131753558, str2)));
                if (!i1()) {
                    arrayList.add(xg.b.b(f1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(xg.b.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(xg.b.b(s.g() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i28 = 0;
                while (i28 < size4) {
                    Object obj2 = arrayList5.get(i28);
                    i28++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(xg.b.b(f1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int f15 = f1();
                        xg.b bVar10 = new xg.b(9, false);
                        bVar10.d = (TLRPC.InputPeer) tLObject2;
                        bVar10.e = null;
                        bVar10.g = true;
                        bVar10.i = f15;
                        arrayList.add(bVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r10 = 0;
                    arrayList.add(new xg.b(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(xg.b.c(id.M0(2131753553, null), r10));
                arrayList.add(xg.b.f(id.M0(2131753536, null)));
                int i29 = yg.u.w;
                arrayList.add(xg.b.e(r10, this.b2, true, arrayList4));
                arrayList.add(xg.b.e(1, this.b2, r10, arrayList4));
                str2 = null;
                arrayList.add(xg.b.c(id.M0(V ? 2131753551 : 2131753550, null), r10));
            }
            if (!i1()) {
                arrayList.add(xg.b.f(id.M0(2131753537, str2)));
                int i30 = this.a2;
                int i31 = yg.d.w;
                ArrayList b10 = s.b(i30 == 0 ? e1() : arrayList3.size(), this.X1);
                int i32 = 0;
                while (i32 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i32);
                    int i33 = tL_premiumGiftCodeOption.months;
                    int i34 = this.a2;
                    int i35 = yg.d.w;
                    int e12 = i34 == 0 ? e1() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i36 = this.d2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z13 = i32 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    int i37 = i32;
                    xg.b bVar11 = new xg.b(12, i33 == i36);
                    bVar11.i = i33;
                    bVar11.j = e12;
                    bVar11.h = j10;
                    bVar11.g = z13;
                    bVar11.c = str3;
                    bVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(bVar11);
                    i32 = i37 + 1;
                    b10 = arrayList7;
                }
            }
            if (!i1()) {
                i7 = 3;
                arrayList.add(xg.b.c(org.telegram.messenger.g0.S2(id.M0(2131753187, null), k6.Uc, 0, new t(this, i7), this.I0), true));
                i10 = this.Z1;
                int i38 = yg.d.w;
                if (i10 != i7 || this.a2 == 0) {
                    String M03 = id.M0(2131753484, null);
                    boolean z14 = this.o2;
                    int i39 = yg.y.L;
                    xg.b bVar12 = new xg.b(15, z14);
                    bVar12.c = M03;
                    bVar12.g = z14;
                    bVar12.l = 1;
                    arrayList.add(bVar12);
                    if (this.o2) {
                        z11 = false;
                        str = null;
                        arrayList.add(xg.b.c(id.M0(this.Z1 == 3 ? 2131753237 : 2131753485, null), false));
                    } else {
                        int e13 = i1() ? prepaidGiveaway.quantity : e1();
                        z11 = false;
                        xg.b bVar13 = new xg.b(16, false);
                        bVar13.i = e13;
                        arrayList.add(bVar13);
                        String G = id.G(this.d2, "BoldMonths", new Object[0]);
                        if (this.Z1 == 3) {
                            if (this.n2.isEmpty()) {
                                arrayList.add(xg.b.c(org.telegram.messenger.g0.X2(id.G((int) this.h2, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(xg.b.c(org.telegram.messenger.g0.X2(id.G((int) this.h2, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(e13), this.n2)), false));
                            }
                        } else if (this.n2.isEmpty()) {
                            arrayList.add(xg.b.c(org.telegram.messenger.g0.X2(id.G(e13, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(xg.b.c(org.telegram.messenger.g0.X2(id.G(e13, "BoostingGiveawayAdditionPrizeCountNameHint", this.n2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(xg.b.f(id.M0(2131753538, str)));
                    long j11 = this.e2;
                    xg.b bVar14 = new xg.b(10, z11);
                    bVar14.h = j11;
                    arrayList.add(bVar14);
                    if (this.Z1 != 3) {
                        if (i1()) {
                            r102 = 0;
                            arrayList.add(xg.b.c(id.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", id.G((int) this.h2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(xg.b.c(id.G(e1(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", id.G((int) this.h2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (i1()) {
                            arrayList.add(xg.b.c(id.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(xg.b.c(id.G(e1(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String M04 = id.M0(2131753368, null);
                    xg.b bVar15 = new xg.b(15, this.p2);
                    bVar15.c = M04;
                    bVar15.g = r102;
                    bVar15.l = r102;
                    arrayList.add(bVar15);
                    if (i1()) {
                        arrayList.add(xg.b.c(id.M0(2131753367, null), r102));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(id.M0(2131753367, null));
                        sb2.append(this.Z1 != 3 ? jg.g.l(2131753187, null, new StringBuilder("\n\n")) : "");
                        arrayList.add(xg.b.c(org.telegram.messenger.g0.S2(sb2.toString(), k6.Uc, 0, new t(this, 4), this.I0), true));
                    }
                }
                cVar = this.Y1;
                if (cVar != null && z10) {
                    if (z9) {
                        cVar.f();
                        return;
                    } else {
                        cVar.E(arrayList2, arrayList);
                        return;
                    }
                }
                return;
            }
        }
        i7 = 3;
        i10 = this.Z1;
        int i382 = yg.d.w;
        if (i10 != i7) {
        }
        String M032 = id.M0(2131753484, null);
        boolean z142 = this.o2;
        int i392 = yg.y.L;
        xg.b bVar122 = new xg.b(15, z142);
        bVar122.c = M032;
        bVar122.g = z142;
        bVar122.l = 1;
        arrayList.add(bVar122);
        if (this.o2) {
        }
        arrayList.add(xg.b.f(id.M0(2131753538, str)));
        long j112 = this.e2;
        xg.b bVar142 = new xg.b(10, z11);
        bVar142.h = j112;
        arrayList.add(bVar142);
        if (this.Z1 != 3) {
        }
        String M042 = id.M0(2131753368, null);
        xg.b bVar152 = new xg.b(15, this.p2);
        bVar152.c = M042;
        bVar152.g = r102;
        bVar152.l = r102;
        arrayList.add(bVar152);
        if (i1()) {
        }
        cVar = this.Y1;
        if (cVar != null) {
            if (z9) {
            }
        }
    }
}
