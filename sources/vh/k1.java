package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ix;
import org.telegram.ui.i31;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k1 extends s4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final /* synthetic */ l1 N;
    public int c;
    public boolean x;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();
    public int y = 0;
    public final SparseIntArray D = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final d0 M = new d0(this, 4);

    public k1(l1 l1Var) {
        this.N = l1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        j1 j1Var;
        l1 l1Var;
        TLRPC.TL_messages_stickerSet m0;
        int i10;
        l1 l1Var2;
        j1 j1Var2;
        u1 u1Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i11;
        j1 j1Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        l1 l1Var3 = this.N;
        j1 j1Var4 = l1Var3.e;
        u1 u1Var2 = l1Var3.s;
        this.H = str;
        d0 d0Var = this.M;
        int i12 = 1;
        if (str != null) {
            l1Var3.f.c(true);
            j1Var4.n(false);
            org.telegram.messenger.i0.r(d0Var);
            org.telegram.messenger.i0.h3(d0Var, 100L);
            return;
        }
        j1Var4.n(true);
        org.telegram.messenger.i0.r(d0Var);
        int i13 = u1.y1;
        ui b02 = ui.b0(u1Var2.a);
        this.y = 0;
        ArrayList arrayList4 = this.s;
        arrayList4.clear();
        this.w.clear();
        SparseIntArray sparseIntArray2 = this.D;
        sparseIntArray2.clear();
        ArrayList arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = this.h;
        arrayList6.clear();
        HashMap hashMap = this.f;
        hashMap.clear();
        this.y++;
        boolean z10 = false;
        arrayList4.add(null);
        ArrayList arrayList7 = this.r;
        arrayList7.clear();
        if (l1Var3.a == 1) {
            if (u1Var2.x1 != null && (u1Var2.J0(0) || u1Var2.J0(1) || u1Var2.J0(2) || u1Var2.J0(3) || u1Var2.J0(4))) {
                arrayList4.add(u1Var2.k1);
                this.y++;
            }
            ArrayList<TLRPC.Document> i02 = b02.i0(2, false);
            if (!i02.isEmpty()) {
                if (this.F == null) {
                    this.F = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.F;
                tL_messages_stickerSet2.documents = i02;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.F.set.title = cd.L0(2131750842, null);
                arrayList5.add(this.F);
            }
            ArrayList<TLRPC.Document> i03 = b02.i0(0, false);
            if (!i03.isEmpty()) {
                if (this.G == null) {
                    this.G = new TLRPC.TL_messages_stickerSet();
                }
                this.G.documents = i03;
                if (u1Var2.w1 != null) {
                    i03.add(0, u1Var2.l1);
                }
                this.G.set = new TLRPC.TL_stickerSet();
                this.G.set.title = cd.L0(2131746379, null);
                arrayList5.add(this.G);
            }
        }
        arrayList5.addAll(b02.s0(l1Var3.a == 0 ? 5 : 0));
        int i14 = 0;
        while (i14 < arrayList5.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i14);
            sparseIntArray2.put(this.y, i14);
            arrayList4.add(z10);
            this.y += i12;
            arrayList4.addAll(tL_messages_stickerSet3.documents);
            this.y = tL_messages_stickerSet3.documents.size() + this.y;
            String str2 = tL_messages_stickerSet3 == this.G ? "recent" : tL_messages_stickerSet3 == this.F ? "fav" : tL_messages_stickerSet3;
            int i15 = 0;
            while (i15 < tL_messages_stickerSet3.documents.size()) {
                hashMap.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i15).id), str2);
                i15++;
                sparseIntArray2 = sparseIntArray2;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            ix ixVar = new ix();
            ixVar.c = tL_messages_stickerSet3.documents;
            ixVar.b = tL_messages_stickerSet3.set;
            ixVar.f = true;
            ixVar.g = false;
            ixVar.h = true;
            ixVar.e = true;
            if (tL_messages_stickerSet3 == this.F) {
                ixVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.G) {
                ixVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(ixVar);
            arrayList6.add(tL_messages_stickerSet3);
            i14++;
            sparseIntArray2 = sparseIntArray3;
            i12 = 1;
            z10 = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (l1Var3.a == 0) {
            ArrayList arrayList8 = b02.s0[1];
            if (arrayList8 != null) {
                int i16 = 0;
                while (i16 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i16);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        tL_messages_stickerSet = ui.b0(u1Var2.a).m0(ui.Z(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            l1Var2 = l1Var3;
                            j1Var2 = j1Var4;
                            u1Var = u1Var2;
                            arrayList = arrayList8;
                            i10 = i16;
                            if (tL_messages_stickerSet.set != null) {
                                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                                    TLRPC.StickerSet stickerSet = ((ix) arrayList7.get(i17)).b;
                                    if (stickerSet == null || stickerSet.id != tL_messages_stickerSet.set.id) {
                                    }
                                }
                                arrayList5.add(tL_messages_stickerSet);
                                arrayList6.add(tL_messages_stickerSet);
                                sparseIntArray = sparseIntArray4;
                                sparseIntArray.put(this.y, i14);
                                i14++;
                                arrayList4.add(null);
                                this.y++;
                                arrayList4.addAll(tL_messages_stickerSet.documents);
                                this.y = tL_messages_stickerSet.documents.size() + this.y;
                                for (int i18 = 0; i18 < tL_messages_stickerSet.documents.size(); i18++) {
                                    hashMap.put(Long.valueOf(tL_messages_stickerSet.documents.get(i18).id), tL_messages_stickerSet);
                                }
                                ix ixVar2 = new ix();
                                ixVar2.c = tL_messages_stickerSet.documents;
                                ixVar2.b = tL_messages_stickerSet.set;
                                ixVar2.f = false;
                                ixVar2.g = true;
                                ixVar2.h = true;
                                ixVar2.e = true;
                                arrayList7.add(ixVar2);
                                i16 = i10 + 1;
                                sparseIntArray4 = sparseIntArray;
                                u1Var2 = u1Var;
                                arrayList8 = arrayList;
                                j1Var4 = j1Var2;
                                l1Var3 = l1Var2;
                            }
                            sparseIntArray = sparseIntArray4;
                            i16 = i10 + 1;
                            sparseIntArray4 = sparseIntArray;
                            u1Var2 = u1Var;
                            arrayList8 = arrayList;
                            j1Var4 = j1Var2;
                            l1Var3 = l1Var2;
                        }
                        l1Var2 = l1Var3;
                        j1Var2 = j1Var4;
                        u1Var = u1Var2;
                        arrayList = arrayList8;
                        i10 = i16;
                        sparseIntArray = sparseIntArray4;
                        i16 = i10 + 1;
                        sparseIntArray4 = sparseIntArray;
                        u1Var2 = u1Var;
                        arrayList8 = arrayList;
                        j1Var4 = j1Var2;
                        l1Var3 = l1Var2;
                    } else {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                            tL_messages_stickerSet4.set = stickerSet2;
                            tL_messages_stickerSet4.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList arrayList9 = arrayList8;
                            i10 = i16;
                            Long valueOf = Long.valueOf(stickerSet2.id);
                            HashMap hashMap2 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList10 = (ArrayList) hashMap2.get(valueOf);
                            tL_messages_stickerSet4.packs = arrayList10;
                            if (arrayList10 == null) {
                                HashMap hashMap3 = new HashMap();
                                u1Var = u1Var2;
                                int i19 = 0;
                                while (i19 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i19);
                                    if (document == null) {
                                        j1Var3 = j1Var4;
                                        arrayList2 = arrayList9;
                                        i11 = i19;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i11 = i19;
                                        ArrayList j10 = org.telegram.messenger.k6.j(jj.V(document, null, null), null);
                                        j1Var3 = j1Var4;
                                        int i20 = 0;
                                        while (i20 < j10.size()) {
                                            String charSequence = ((org.telegram.messenger.i6) j10.get(i20)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j10;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            l1 l1Var4 = l1Var3;
                                            i20 = c3.i0.k(i20, 1, document.id, arrayList3);
                                            l1Var3 = l1Var4;
                                            j10 = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i19 = i11 + 1;
                                    arrayList9 = arrayList2;
                                    j1Var4 = j1Var3;
                                    l1Var3 = l1Var3;
                                }
                                l1Var2 = l1Var3;
                                j1Var2 = j1Var4;
                                arrayList = arrayList9;
                                tL_messages_stickerSet4.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap3.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet4.packs.add(tL_stickerPack);
                                }
                                hashMap2.put(Long.valueOf(tL_messages_stickerSet4.set.id), tL_messages_stickerSet4.packs);
                            } else {
                                l1Var2 = l1Var3;
                                j1Var2 = j1Var4;
                                u1Var = u1Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            i16 = i10 + 1;
                            sparseIntArray4 = sparseIntArray;
                            u1Var2 = u1Var;
                            arrayList8 = arrayList;
                            j1Var4 = j1Var2;
                            l1Var3 = l1Var2;
                        }
                        l1Var2 = l1Var3;
                        j1Var2 = j1Var4;
                        u1Var = u1Var2;
                        arrayList = arrayList8;
                        i10 = i16;
                        sparseIntArray = sparseIntArray4;
                        i16 = i10 + 1;
                        sparseIntArray4 = sparseIntArray;
                        u1Var2 = u1Var;
                        arrayList8 = arrayList;
                        j1Var4 = j1Var2;
                        l1Var3 = l1Var2;
                    }
                }
            }
            l1 l1Var5 = l1Var3;
            j1Var = j1Var4;
            boolean z11 = false;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                try {
                    z11 = ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z11) {
                    break;
                }
            }
            if (!z11 && (m0 = b02.m0(this.E, false)) != null) {
                arrayList6.add(m0);
            }
            l1Var = l1Var5;
        } else {
            j1Var = j1Var4;
            l1Var = l1Var3;
        }
        l1Var.r = true;
        if (this.c != arrayList6.size()) {
            HashMap hashMap4 = this.d;
            hashMap4.clear();
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i22);
                if (tL_messages_stickerSet5 != null) {
                    for (int i23 = 0; i23 < tL_messages_stickerSet5.packs.size(); i23++) {
                        String str3 = tL_messages_stickerSet5.packs.get(i23).emoticon;
                        ArrayList arrayList13 = (ArrayList) hashMap4.get(str3);
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                            hashMap4.put(str3, arrayList13);
                        }
                        arrayList13.addAll(tL_messages_stickerSet5.packs.get(i23).documents);
                    }
                }
            }
            this.c = arrayList6.size();
        }
        this.x = false;
        j1Var.p(arrayList7);
        this.I = null;
        f();
    }

    @Override // s4.g0
    public final int b() {
        return this.y;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.x && i10 == this.y - 1) {
            return 3;
        }
        if (this.D.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i10 >= arrayList.size() || arrayList.get(i10) != this.N.s.k1) ? 2 : 4;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        l1 l1Var = this.N;
        u1 u1Var = l1Var.s;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) u1Var.o1));
            return;
        }
        if (i11 == 1) {
            int i12 = this.D.get(i10);
            if (i12 >= 0) {
                ArrayList arrayList = this.n;
                if (i12 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                if (this.I == null) {
                    n8Var.a(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.I.toLowerCase());
                if (indexOf < 0) {
                    n8Var.a(0, str);
                    return;
                } else {
                    n8Var.b(str, 0, null, indexOf, this.I.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                i1 i1Var = (i1) view;
                int i13 = this.K;
                if (i1Var.b != i13) {
                    i1Var.b = i13;
                    i31.D(d20.s0, i1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        a1 a1Var = (a1) view;
        if (document == u1Var.l1) {
            a1Var.setSticker(null);
            if (a1Var.a == null) {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), -1);
                int i14 = org.telegram.ui.ActionBar.t6.Bf;
                org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.12f, i14);
                org.telegram.ui.ActionBar.a7.l(a1Var, d02, L.a, -1, 2, L.d, u1Var.I0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = l1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                org.telegram.ui.ActionBar.a7.y(a1Var, mutate, i14, u1Var.I0, PorterDuff.Mode.MULTIPLY);
                eq eqVar = new eq(d02, mutate);
                int L2 = org.telegram.messenger.i0.L(56.0f);
                int L3 = org.telegram.messenger.i0.L(56.0f);
                eqVar.h = L2;
                eqVar.n = L3;
                int L4 = org.telegram.messenger.i0.L(24.0f);
                int L5 = org.telegram.messenger.i0.L(24.0f);
                eqVar.e = L4;
                eqVar.f = L5;
                eqVar.r = true;
                a1Var.a = eqVar;
            }
            a1Var.setDrawable(a1Var.a);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = l1Var.a;
        if (i15 != 0) {
            a1Var.a(null, i15 == 1);
            a1Var.setSticker(document);
            return;
        }
        if (document != null) {
            a1Var.setSticker(null);
            a1Var.a(document, l1Var.a == 1);
            return;
        }
        a1Var.setSticker(null);
        boolean z10 = l1Var.a == 1;
        if (a1Var.h == longValue) {
            return;
        }
        org.telegram.ui.Components.f5 f5Var = a1Var.d;
        if (f5Var != null) {
            f5Var.n(a1Var);
        }
        if (longValue == 0) {
            a1Var.b = false;
            a1Var.h = 0L;
            a1Var.d = null;
            return;
        }
        a1Var.b = true;
        a1Var.h = longValue;
        org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(a1Var.c, longValue, null, sc.e(z10 ? 1 : 16388) ? 3 : 13);
        a1Var.d = m10;
        if (a1Var.w) {
            m10.a(a1Var);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View n8Var;
        l1 l1Var = this.N;
        u1 u1Var = l1Var.s;
        if (i10 == 0) {
            n8Var = new View(l1Var.getContext());
        } else if (i10 == 1) {
            Context context = l1Var.getContext();
            int i11 = u1.y1;
            n8Var = new org.telegram.ui.Cells.n8(context, true, false, u1Var.I0, false);
        } else if (i10 == 3) {
            Context context2 = l1Var.getContext();
            boolean z10 = l1Var.a == 0;
            i1 i1Var = new i1(context2);
            i1Var.b = -1;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context2);
            i1Var.a = g9Var;
            i1Var.addView(g9Var, w7.b6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(cd.L0(z10 ? 2131748230 : 2131748165, null));
            i1Var.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            n8Var = i1Var;
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(u1Var, l1Var.getContext());
            f5Var.f = new v0(u1Var, 2);
            n8Var = f5Var;
        } else {
            n8Var = new a1(l1Var.getContext(), l1Var.b);
        }
        return new ck0(n8Var);
    }
}
