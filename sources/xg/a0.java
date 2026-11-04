package xg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import b8.mf;
import ci.e9;
import ei.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a0 extends ma implements cs {
    public final ArrayList Q1;
    public final List R1;
    public final List S1;
    public final List T1;
    public final TLRPC.Chat U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public yg.b Z1;
    public int a2;
    public int b2;
    public int c2;
    public boolean d2;
    public int e2;
    public long f2;
    public int g2;
    public int h2;
    public long i2;
    public final zg.a j2;
    public ua.b k2;
    public int l2;
    public k m2;
    public final TL_stories.PrepaidGiveaway n2;
    public String o2;
    public boolean p2;
    public boolean q2;
    public final t r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d2 d2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(d2Var, false);
        int i3 = 5;
        this.Q1 = new ArrayList();
        this.R1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.S1 = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.T1 = Arrays.asList(750, 10000, 50000);
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        int i10 = zg.d.w;
        this.a2 = 2;
        this.b2 = 0;
        int i11 = zg.u.w;
        this.c2 = 0;
        this.e2 = 12;
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
        this.f2 = calendar.getTimeInMillis();
        this.g2 = 2;
        this.h2 = 2;
        this.o2 = "";
        this.q2 = true;
        this.r2 = new t(this, 0);
        this.n2 = prepaidGiveaway;
        this.s1 = 0.15f;
        this.v0 = false;
        this.w0 = false;
        this.U0 = false;
        this.u0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.m1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.m1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = zg.d.w;
            this.a2 = 3;
        }
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.m = false;
        this.l1.setItemAnimator(kVar);
        tj0 tj0Var = this.l1;
        int i14 = this.u0;
        tj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(68.0f));
        this.l1.setOnScrollListener(new z());
        this.l1.setOnItemClickListener(new q4(23, this, d2Var));
        TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
        this.U1 = M0;
        yg.b bVar = this.Z1;
        ArrayList arrayList = this.Q1;
        tj0 tj0Var2 = this.l1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.w = M0;
        bVar.f = tj0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        k1(false, false);
        zg.a aVar = new zg.a(getContext(), this.J0);
        this.j2 = aVar;
        aVar.setOnClickListener(new rq(this, prepaidGiveaway, j10, d2Var));
        j1(false);
        this.b.addView(aVar, mf.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.a, M0, new v(this, i3));
        hs.f(this.a).c(this, hs.x3);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        yg.b bVar = new yg.b(this.J0);
        this.Z1 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        int i3 = this.b2;
        int i10 = zg.d.w;
        return i3 == 1 ? bd.M0(2131749688, null) : bd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override // org.telegram.ui.Components.ma
    public final void R0(Canvas canvas, int i3) {
        this.l2 = i3;
    }

    public final ArrayList d1(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j10);
        if (g12 != null) {
            for (int i3 = 0; i3 < g12.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        tj0 tj0Var;
        if (i3 == hs.x3 && (tj0Var = this.l1) != null && tj0Var.H) {
            k1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        k kVar = this.m2;
        if (kVar != null) {
            kVar.run();
        }
        hs.f(this.a).n(this, hs.x3);
    }

    public final int e1() {
        int i3 = this.a2;
        int i10 = zg.d.w;
        if (i3 == 2) {
            return ((Integer) this.R1.get(this.g2)).intValue();
        }
        List h12 = h1();
        int i11 = this.h2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.h2 = 0;
        }
        if (this.h2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.h2)).intValue();
    }

    public final int f1() {
        int e12;
        int g7;
        int i3 = this.a2;
        int i10 = zg.d.w;
        if (i3 == 2) {
            e12 = ((Integer) this.R1.get(this.g2)).intValue();
            g7 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.i2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g7 = s.g();
        }
        return g7 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j10) {
        ArrayList v = e9.y(this.a, false).v();
        if (v == null) {
            return null;
        }
        for (int i3 = 0; i3 < v.size(); i3++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i3);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List h1() {
        int i3 = this.a2;
        int i10 = zg.d.w;
        if (i3 == 2) {
            return this.R1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.i2);
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
        return this.n2 != null;
    }

    public final void j1(boolean z10) {
        boolean i12 = i1();
        zg.a aVar = this.j2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.n2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(s.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i3 = this.b2;
        int i10 = zg.d.w;
        if (i3 == 0) {
            aVar.a(f1(), z10);
            return;
        }
        ArrayList arrayList = this.W1;
        int g7 = s.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        gi.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g7, z10);
        dVar.i(bd.M0(2131749688, null), z10, true);
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
    public final void k1(boolean z10, boolean z11) {
        int i3;
        ?? r10;
        int i10;
        boolean z12;
        String str;
        ?? r102;
        yg.b bVar;
        ?? r103;
        int i11;
        int i12;
        long longValue;
        ArrayList arrayList = this.Q1;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i13 = this.a2;
        int i14 = zg.d.w;
        boolean z13 = i13 == 3;
        yg.a aVar = new yg.a(0, false);
        aVar.g = z13;
        arrayList.add(aVar);
        boolean i15 = i1();
        ArrayList arrayList3 = this.W1;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.n2;
        if (i15) {
            yg.a aVar2 = new yg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            yg.a aVar3 = new yg.a(2, this.a2 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            yg.a aVar4 = new yg.a(2, this.a2 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new yg.a(4, false));
        TLRPC.Chat chat = this.U1;
        boolean V = t3.V(chat);
        int i16 = this.a2;
        ArrayList arrayList4 = this.X1;
        ArrayList arrayList5 = this.V1;
        if (i16 == 3) {
            if (!i1()) {
                String M0 = bd.M0(2131753200, null);
                int f12 = f1();
                yg.a aVar5 = new yg.a(13, false);
                aVar5.c = M0;
                aVar5.i = f12;
                arrayList.add(aVar5);
                ArrayList v = e9.y(this.a, false).v();
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
                        if (this.i2 == 0 && g12.isDefault) {
                            this.i2 = g12.stars;
                        }
                        if (!g12.extended || this.d2) {
                            int i20 = i18 + 1;
                            int i21 = this.d2 ? i19 : i19 + 2;
                            long j10 = g12.stars;
                            ArrayList d12 = d1(j10);
                            if (d12.isEmpty()) {
                                float f10 = j10;
                                i11 = i19;
                                i12 = i20;
                                ArrayList d13 = d1(this.i2);
                                int i22 = this.h2;
                                if (i22 < 0 || i22 >= d13.size()) {
                                    this.h2 = 0;
                                }
                                longValue = Math.round(f10 / (this.h2 >= d13.size() ? 1L : ((Long) d13.get(this.h2)).longValue()));
                            } else {
                                i11 = i19;
                                i12 = i20;
                                longValue = ((Long) d12.get(Utilities.j(this.h2, d12.size() - 1, 0))).longValue();
                            }
                            arrayList.add(yg.a.d(g12, i21, longValue, this.i2 == g12.stars, true));
                            i18 = i12;
                        }
                    }
                    i11 = i19;
                }
                if (!this.d2 && i18 < arrayList6.size()) {
                    arrayList.add(new yg.a(18, false));
                }
                if (i18 <= 0) {
                    arrayList.add(yg.a.d(null, 0, 1L, false, true));
                    arrayList.add(yg.a.d(null, 1, 1L, false, true));
                    arrayList.add(yg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = f1();
                arrayList.add(yg.a.c(bd.M0(2131753199, null), false));
                List h12 = h1();
                int i23 = this.h2;
                if (i23 < 0 || i23 >= h12.size()) {
                    this.h2 = 0;
                }
                if (h12.size() > 1) {
                    arrayList.add(yg.a.f(bd.M0(2131753195, null)));
                    List h13 = h1();
                    int i24 = this.h2;
                    yg.a aVar6 = new yg.a(5, false);
                    aVar6.k = h13;
                    aVar6.i = i24;
                    arrayList.add(aVar6);
                    arrayList.add(yg.a.c(bd.M0(2131753194, null), false));
                }
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.i2 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
            arrayList.add(yg.a.f(bd.M0(2131753558, null)));
            if (!i1()) {
                arrayList.add(yg.a.b(f1(), chat, false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(yg.a.b(prepaidGiveaway.quantity, chat, false));
            } else {
                arrayList.add(yg.a.b(s.g() * prepaidGiveaway.quantity, chat, false));
            }
            int size3 = arrayList5.size();
            int i25 = 0;
            while (i25 < size3) {
                Object obj = arrayList5.get(i25);
                i25++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(yg.a.b(f1(), (TLRPC.Chat) tLObject, true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int f13 = f1();
                    yg.a aVar7 = new yg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = f13;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r103 = 0;
                arrayList.add(new yg.a(8, false));
            } else {
                r103 = 0;
            }
            arrayList.add(yg.a.c(bd.M0(2131753553, null), r103));
            arrayList.add(yg.a.f(bd.M0(2131753536, null)));
            int i26 = zg.u.w;
            arrayList.add(yg.a.e(r103, this.c2, true, arrayList4));
            arrayList.add(yg.a.e(1, this.c2, r103, arrayList4));
            arrayList.add(yg.a.c(bd.M0(V ? 2131753551 : 2131753550, null), r103));
        } else {
            String str2 = null;
            if (this.b2 == 0) {
                if (!i1()) {
                    String M02 = bd.M0(2131753323, null);
                    int f14 = f1();
                    yg.a aVar8 = new yg.a(13, false);
                    aVar8.c = M02;
                    aVar8.i = f14;
                    arrayList.add(aVar8);
                    int i27 = this.g2;
                    yg.a aVar9 = new yg.a(5, false);
                    aVar9.k = this.R1;
                    aVar9.i = i27;
                    arrayList.add(aVar9);
                    str2 = null;
                    arrayList.add(yg.a.c(bd.M0(2131753552, null), false));
                }
                arrayList.add(yg.a.f(bd.M0(2131753558, str2)));
                if (!i1()) {
                    arrayList.add(yg.a.b(f1(), chat, false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(yg.a.b(prepaidGiveaway.quantity, chat, false));
                } else {
                    arrayList.add(yg.a.b(s.g() * prepaidGiveaway.quantity, chat, false));
                }
                int size4 = arrayList5.size();
                int i28 = 0;
                while (i28 < size4) {
                    Object obj2 = arrayList5.get(i28);
                    i28++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(yg.a.b(f1(), (TLRPC.Chat) tLObject2, true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int f15 = f1();
                        yg.a aVar10 = new yg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = f15;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r10 = 0;
                    arrayList.add(new yg.a(8, false));
                } else {
                    r10 = 0;
                }
                arrayList.add(yg.a.c(bd.M0(2131753553, null), r10));
                arrayList.add(yg.a.f(bd.M0(2131753536, null)));
                int i29 = zg.u.w;
                arrayList.add(yg.a.e(r10, this.c2, true, arrayList4));
                arrayList.add(yg.a.e(1, this.c2, r10, arrayList4));
                str2 = null;
                arrayList.add(yg.a.c(bd.M0(V ? 2131753551 : 2131753550, null), r10));
            }
            if (!i1()) {
                arrayList.add(yg.a.f(bd.M0(2131753537, str2)));
                int i30 = this.b2;
                int i31 = zg.d.w;
                ArrayList b10 = s.b(i30 == 0 ? e1() : arrayList3.size(), this.Y1);
                int i32 = 0;
                while (i32 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i32);
                    int i33 = tL_premiumGiftCodeOption.months;
                    int i34 = this.b2;
                    int i35 = zg.d.w;
                    int e12 = i34 == 0 ? e1() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i36 = this.e2;
                    String str3 = tL_premiumGiftCodeOption.currency;
                    boolean z14 = i32 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    int i37 = i32;
                    yg.a aVar11 = new yg.a(12, i33 == i36);
                    aVar11.i = i33;
                    aVar11.j = e12;
                    aVar11.h = j11;
                    aVar11.g = z14;
                    aVar11.c = str3;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i32 = i37 + 1;
                    b10 = arrayList7;
                }
            }
            if (!i1()) {
                i3 = 3;
                arrayList.add(yg.a.c(org.telegram.messenger.g0.S2(bd.M0(2131753187, null), k6.Uc, 0, new t(this, i3), this.J0), true));
                i10 = this.a2;
                int i38 = zg.d.w;
                if (i10 != i3 || this.b2 == 0) {
                    String M03 = bd.M0(2131753484, null);
                    boolean z15 = this.p2;
                    int i39 = zg.y.M;
                    yg.a aVar12 = new yg.a(15, z15);
                    aVar12.c = M03;
                    aVar12.g = z15;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.p2) {
                        z12 = false;
                        str = null;
                        arrayList.add(yg.a.c(bd.M0(this.a2 == 3 ? 2131753237 : 2131753485, null), false));
                    } else {
                        int e13 = i1() ? prepaidGiveaway.quantity : e1();
                        z12 = false;
                        yg.a aVar13 = new yg.a(16, false);
                        aVar13.i = e13;
                        arrayList.add(aVar13);
                        String G = bd.G(this.e2, "BoldMonths", new Object[0]);
                        if (this.a2 == 3) {
                            if (this.o2.isEmpty()) {
                                arrayList.add(yg.a.c(org.telegram.messenger.g0.X2(bd.G((int) this.i2, "BoostingStarsGiveawayAdditionPrizeCountHint", new Object[0])), false));
                            } else {
                                arrayList.add(yg.a.c(org.telegram.messenger.g0.X2(bd.G((int) this.i2, "BoostingStarsGiveawayAdditionPrizeCountNameHint", Integer.valueOf(e13), this.o2)), false));
                            }
                        } else if (this.o2.isEmpty()) {
                            arrayList.add(yg.a.c(org.telegram.messenger.g0.X2(bd.G(e13, "BoostingGiveawayAdditionPrizeCountHint", G)), false));
                        } else {
                            arrayList.add(yg.a.c(org.telegram.messenger.g0.X2(bd.G(e13, "BoostingGiveawayAdditionPrizeCountNameHint", this.o2, G)), false));
                        }
                        str = null;
                    }
                    arrayList.add(yg.a.f(bd.M0(2131753538, str)));
                    long j12 = this.f2;
                    yg.a aVar14 = new yg.a(10, z12);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.a2 != 3) {
                        if (i1()) {
                            r102 = 0;
                            arrayList.add(yg.a.c(bd.G(prepaidGiveaway.quantity, V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", bd.G((int) this.i2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        } else {
                            r102 = 0;
                            arrayList.add(yg.a.c(bd.G(e1(), V ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", bd.G((int) this.i2, "BoostingStarsChooseRandomStars", new Object[0])), false));
                        }
                    } else {
                        r102 = 0;
                        r102 = 0;
                        if (i1()) {
                            arrayList.add(yg.a.c(bd.G(prepaidGiveaway.quantity, V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        } else {
                            arrayList.add(yg.a.c(bd.G(e1(), V ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", new Object[0]), false));
                        }
                    }
                    String M04 = bd.M0(2131753368, null);
                    yg.a aVar15 = new yg.a(15, this.q2);
                    aVar15.c = M04;
                    aVar15.g = r102;
                    aVar15.l = r102;
                    arrayList.add(aVar15);
                    if (i1()) {
                        arrayList.add(yg.a.c(bd.M0(2131753367, null), r102));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(bd.M0(2131753367, null));
                        sb2.append(this.a2 != 3 ? p1.k(2131753187, null, new StringBuilder("\n\n")) : "");
                        arrayList.add(yg.a.c(org.telegram.messenger.g0.S2(sb2.toString(), k6.Uc, 0, new t(this, 4), this.J0), true));
                    }
                }
                bVar = this.Z1;
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
        i3 = 3;
        i10 = this.a2;
        int i382 = zg.d.w;
        if (i10 != i3) {
        }
        String M032 = bd.M0(2131753484, null);
        boolean z152 = this.p2;
        int i392 = zg.y.M;
        yg.a aVar122 = new yg.a(15, z152);
        aVar122.c = M032;
        aVar122.g = z152;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.p2) {
        }
        arrayList.add(yg.a.f(bd.M0(2131753538, str)));
        long j122 = this.f2;
        yg.a aVar142 = new yg.a(10, z12);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.a2 != 3) {
        }
        String M042 = bd.M0(2131753368, null);
        yg.a aVar152 = new yg.a(15, this.q2);
        aVar152.c = M042;
        aVar152.g = r102;
        aVar152.l = r102;
        arrayList.add(aVar152);
        if (i1()) {
        }
        bVar = this.Z1;
        if (bVar != null) {
            if (z10) {
            }
        }
    }
}
