// default package

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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sv3 extends w39 {
    public final TLRPC.TL_inputStickerSetShortName F;
    public TLRPC.TL_messages_stickerSet G;
    public TLRPC.TL_messages_stickerSet H;
    public String I;
    public String J;
    public String[] K;
    public int L;
    public final /* synthetic */ tv3 O;
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
    public final SparseIntArray E = new SparseIntArray();
    public final HashSet M = new HashSet();
    public final li3 N = new li3(this, 21);

    public sv3(tv3 tv3Var) {
        this.O = tv3Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.F = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        qv3 qv3Var;
        tv3 tv3Var;
        TLRPC.TL_messages_stickerSet n0;
        int i;
        tv3 tv3Var2;
        qv3 qv3Var2;
        ew3 ew3Var;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList arrayList2;
        int i2;
        qv3 qv3Var3;
        ArrayList arrayList3;
        SparseIntArray sparseIntArray;
        this.I = str;
        tv3 tv3Var3 = this.O;
        qv3 qv3Var4 = tv3Var3.e;
        ew3 ew3Var2 = tv3Var3.s;
        li3 li3Var = this.N;
        int i3 = 1;
        if (str != null) {
            tv3Var3.f.c(true);
            qv3Var4.n(false);
            gl.r(li3Var);
            gl.d3(li3Var, 100L);
            return;
        }
        qv3Var4.n(true);
        gl.r(li3Var);
        int i4 = ew3.C1;
        hq6 d0 = hq6.d0(ew3Var2.a);
        this.y = 0;
        ArrayList arrayList4 = this.s;
        arrayList4.clear();
        this.w.clear();
        SparseIntArray sparseIntArray2 = this.E;
        sparseIntArray2.clear();
        ArrayList arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = this.h;
        arrayList6.clear();
        HashMap hashMap = this.f;
        hashMap.clear();
        this.y++;
        boolean z = false;
        arrayList4.add(null);
        ArrayList arrayList7 = this.r;
        arrayList7.clear();
        if (tv3Var3.a == 1) {
            if (ew3Var2.A1 != null && (ew3Var2.E0(0) || ew3Var2.E0(1) || ew3Var2.E0(2) || ew3Var2.E0(3) || ew3Var2.E0(4))) {
                arrayList4.add(ew3Var2.n1);
                this.y++;
            }
            ArrayList<TLRPC.Document> j0 = d0.j0(2, false);
            if (!j0.isEmpty()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.G;
                if (tL_messages_stickerSet2 == null) {
                    tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                    this.G = tL_messages_stickerSet2;
                }
                tL_messages_stickerSet2.documents = j0;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.G.set.title = k96.M0(2131750829, null);
                arrayList5.add(this.G);
            }
            ArrayList<TLRPC.Document> j02 = d0.j0(0, false);
            if (!j02.isEmpty()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.H;
                if (tL_messages_stickerSet3 == null) {
                    tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                    this.H = tL_messages_stickerSet3;
                }
                tL_messages_stickerSet3.documents = j02;
                if (ew3Var2.z1 != null) {
                    j02.add(0, ew3Var2.o1);
                }
                this.H.set = new TLRPC.TL_stickerSet();
                this.H.set.title = k96.M0(2131746171, null);
                arrayList5.add(this.H);
            }
        }
        arrayList5.addAll(d0.t0(tv3Var3.a == 0 ? 5 : 0));
        int i5 = 0;
        while (i5 < arrayList5.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i5);
            sparseIntArray2.put(this.y, i5);
            arrayList4.add(z);
            this.y += i3;
            arrayList4.addAll(tL_messages_stickerSet4.documents);
            this.y = tL_messages_stickerSet4.documents.size() + this.y;
            String str2 = tL_messages_stickerSet4 == this.H ? "recent" : tL_messages_stickerSet4 == this.G ? "fav" : tL_messages_stickerSet4;
            int i6 = 0;
            while (i6 < tL_messages_stickerSet4.documents.size()) {
                hashMap.put(Long.valueOf(tL_messages_stickerSet4.documents.get(i6).id), str2);
                i6++;
                sparseIntArray2 = sparseIntArray2;
            }
            SparseIntArray sparseIntArray3 = sparseIntArray2;
            h04 h04Var = new h04();
            h04Var.c = tL_messages_stickerSet4.documents;
            h04Var.b = tL_messages_stickerSet4.set;
            h04Var.f = true;
            h04Var.g = false;
            h04Var.h = true;
            h04Var.e = true;
            if (tL_messages_stickerSet4 == this.G) {
                h04Var.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet4 == this.H) {
                h04Var.j = R.drawable.msg_emoji_recent;
            }
            arrayList7.add(h04Var);
            arrayList6.add(tL_messages_stickerSet4);
            i5++;
            sparseIntArray2 = sparseIntArray3;
            i3 = 1;
            z = false;
        }
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        if (tv3Var3.a == 0) {
            ArrayList arrayList8 = d0.t0[1];
            if (arrayList8 != null) {
                int i7 = 0;
                while (i7 < arrayList8.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i7);
                    if (!(stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered)) {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                            tL_messages_stickerSet5.set = stickerSet;
                            tL_messages_stickerSet5.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList arrayList9 = arrayList8;
                            i = i7;
                            Long valueOf = Long.valueOf(stickerSet.id);
                            HashMap hashMap2 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList10 = (ArrayList) hashMap2.get(valueOf);
                            tL_messages_stickerSet5.packs = arrayList10;
                            if (arrayList10 == null) {
                                HashMap hashMap3 = new HashMap();
                                ew3Var = ew3Var2;
                                int i8 = 0;
                                while (i8 < tL_messages_stickerSet5.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet5.documents.get(i8);
                                    if (document == null) {
                                        qv3Var3 = qv3Var4;
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i2 = i8;
                                        ArrayList j = vu3.j(k27.V(document, null, null), null);
                                        qv3Var3 = qv3Var4;
                                        int i9 = 0;
                                        while (i9 < j.size()) {
                                            String charSequence = ((tu3) j.get(i9)).c.toString();
                                            ArrayList arrayList11 = (ArrayList) hashMap3.get(charSequence);
                                            ArrayList arrayList12 = j;
                                            if (arrayList11 == null) {
                                                arrayList3 = new ArrayList();
                                                hashMap3.put(charSequence, arrayList3);
                                            } else {
                                                arrayList3 = arrayList11;
                                            }
                                            tv3 tv3Var4 = tv3Var3;
                                            i9 = mue.c(i9, 1, document.id, arrayList3);
                                            tv3Var3 = tv3Var4;
                                            j = arrayList12;
                                            document = document;
                                        }
                                    }
                                    i8 = i2 + 1;
                                    arrayList9 = arrayList2;
                                    qv3Var4 = qv3Var3;
                                    tv3Var3 = tv3Var3;
                                }
                                tv3Var2 = tv3Var3;
                                qv3Var2 = qv3Var4;
                                arrayList = arrayList9;
                                tL_messages_stickerSet5.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap3.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet5.packs.add(tL_stickerPack);
                                }
                                hashMap2.put(Long.valueOf(tL_messages_stickerSet5.set.id), tL_messages_stickerSet5.packs);
                            } else {
                                tv3Var2 = tv3Var3;
                                qv3Var2 = qv3Var4;
                                ew3Var = ew3Var2;
                                arrayList = arrayList9;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet5;
                            if (tL_messages_stickerSet.set != null) {
                            }
                            sparseIntArray = sparseIntArray4;
                            break;
                            break;
                        }
                        tv3Var2 = tv3Var3;
                        qv3Var2 = qv3Var4;
                        ew3Var = ew3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        sparseIntArray = sparseIntArray4;
                        break;
                        break;
                    }
                    tL_messages_stickerSet = hq6.d0(ew3Var2.a).n0(hq6.b0(stickerSetCovered.set), false);
                    if (tL_messages_stickerSet != null) {
                        tv3Var2 = tv3Var3;
                        qv3Var2 = qv3Var4;
                        ew3Var = ew3Var2;
                        arrayList = arrayList8;
                        i = i7;
                        if (tL_messages_stickerSet.set != null) {
                            for (int i10 = 0; i10 < arrayList7.size(); i10++) {
                                TLRPC.StickerSet stickerSet2 = ((h04) arrayList7.get(i10)).b;
                                if (stickerSet2 == null || stickerSet2.id != tL_messages_stickerSet.set.id) {
                                }
                            }
                            arrayList5.add(tL_messages_stickerSet);
                            arrayList6.add(tL_messages_stickerSet);
                            sparseIntArray = sparseIntArray4;
                            sparseIntArray.put(this.y, i5);
                            i5++;
                            arrayList4.add(null);
                            this.y++;
                            arrayList4.addAll(tL_messages_stickerSet.documents);
                            this.y = tL_messages_stickerSet.documents.size() + this.y;
                            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                hashMap.put(Long.valueOf(tL_messages_stickerSet.documents.get(i11).id), tL_messages_stickerSet);
                            }
                            h04 h04Var2 = new h04();
                            h04Var2.c = tL_messages_stickerSet.documents;
                            h04Var2.b = tL_messages_stickerSet.set;
                            h04Var2.f = false;
                            h04Var2.g = true;
                            h04Var2.h = true;
                            h04Var2.e = true;
                            arrayList7.add(h04Var2);
                        }
                        sparseIntArray = sparseIntArray4;
                        break;
                    }
                    tv3Var2 = tv3Var3;
                    qv3Var2 = qv3Var4;
                    ew3Var = ew3Var2;
                    arrayList = arrayList8;
                    i = i7;
                    sparseIntArray = sparseIntArray4;
                    break;
                    break;
                    i7 = i + 1;
                    sparseIntArray4 = sparseIntArray;
                    ew3Var2 = ew3Var;
                    arrayList8 = arrayList;
                    qv3Var4 = qv3Var2;
                    tv3Var3 = tv3Var2;
                }
            }
            tv3 tv3Var5 = tv3Var3;
            qv3Var = qv3Var4;
            boolean z2 = false;
            for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                try {
                    z2 = ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z2) {
                    break;
                }
            }
            if (!z2 && (n0 = d0.n0(this.F, false)) != null) {
                arrayList6.add(n0);
            }
            tv3Var = tv3Var5;
        } else {
            qv3Var = qv3Var4;
            tv3Var = tv3Var3;
        }
        tv3Var.r = true;
        if (this.c != arrayList6.size()) {
            HashMap hashMap4 = this.d;
            hashMap4.clear();
            for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                if (tL_messages_stickerSet6 != null) {
                    for (int i14 = 0; i14 < tL_messages_stickerSet6.packs.size(); i14++) {
                        String str3 = tL_messages_stickerSet6.packs.get(i14).emoticon;
                        ArrayList arrayList13 = (ArrayList) hashMap4.get(str3);
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                            hashMap4.put(str3, arrayList13);
                        }
                        arrayList13.addAll(tL_messages_stickerSet6.packs.get(i14).documents);
                    }
                }
            }
            this.c = arrayList6.size();
        }
        this.x = false;
        qv3Var.p(arrayList7);
        this.J = null;
        f();
    }

    @Override // w39
    public final int b() {
        return this.y;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.x && i == this.y - 1) {
            return 3;
        }
        if (this.E.get(i, -1) >= 0) {
            return 1;
        }
        if (i < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i >= arrayList.size() || arrayList.get(i) != this.O.s.n1) ? 2 : 4;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLRPC.StickerSet stickerSet;
        tv3 tv3Var = this.O;
        ew3 ew3Var = tv3Var.s;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            view.setTag(34);
            view.setLayoutParams(new e49(-1, (int) ew3Var.r1));
            return;
        }
        if (i2 == 1) {
            int i3 = this.E.get(i);
            if (i3 >= 0) {
                ArrayList arrayList = this.n;
                if (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                    vza vzaVar = (vza) view;
                    if (this.J == null) {
                        vzaVar.a(0, str);
                        return;
                    }
                    int indexOf = str.toLowerCase().indexOf(this.J.toLowerCase());
                    if (indexOf < 0) {
                        vzaVar.a(0, str);
                        return;
                    } else {
                        vzaVar.b(str, 0, null, indexOf, this.J.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                pv3 pv3Var = (pv3) view;
                int i4 = this.L;
                if (pv3Var.b != i4) {
                    pv3Var.b = i4;
                    tx9.D(y6c.t0, pv3Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i);
        iv3 iv3Var = (iv3) view;
        if (document == ew3Var.o1) {
            iv3Var.setSticker(null);
            fm2 fm2Var = iv3Var.a;
            if (fm2Var == null) {
                ShapeDrawable b0 = bkb.b0(gl.L(28.0f), -1);
                int i5 = bkb.Df;
                vkb K = zkb.K(0.12f, i5);
                zkb.k(iv3Var, b0, K.a, -1, 2, K.d, ew3Var.J0, PorterDuff.Mode.SRC_IN);
                Drawable mutate = tv3Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                zkb.x(iv3Var, mutate, i5, ew3Var.J0, PorterDuff.Mode.MULTIPLY);
                fm2Var = new fm2(b0, mutate);
                int L = gl.L(56.0f);
                int L2 = gl.L(56.0f);
                fm2Var.h = L;
                fm2Var.n = L2;
                int L3 = gl.L(24.0f);
                int L4 = gl.L(24.0f);
                fm2Var.e = L3;
                fm2Var.f = L4;
                fm2Var.r = true;
                iv3Var.a = fm2Var;
            }
            iv3Var.setDrawable(fm2Var);
            return;
        }
        ArrayList arrayList3 = this.w;
        long longValue = i >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i6 = tv3Var.a;
        if (i6 != 0) {
            iv3Var.a(null, i6 == 1);
            iv3Var.setSticker(document);
            return;
        }
        if (document != null) {
            iv3Var.setSticker(null);
            iv3Var.a(document, tv3Var.a == 1);
            return;
        }
        iv3Var.setSticker(null);
        boolean z = tv3Var.a == 1;
        if (iv3Var.h != longValue) {
            vl vlVar = iv3Var.d;
            if (vlVar != null) {
                vlVar.o(iv3Var);
            }
            if (longValue == 0) {
                iv3Var.b = false;
                iv3Var.h = 0L;
                iv3Var.d = null;
                return;
            }
            iv3Var.b = true;
            iv3Var.h = longValue;
            vl m = vl.m(iv3Var.c, longValue, null, e66.e(z ? 1 : 16388) ? 3 : 13);
            iv3Var.d = m;
            if (iv3Var.w) {
                m.b(iv3Var);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        tv3 tv3Var = this.O;
        ew3 ew3Var = tv3Var.s;
        if (i == 0) {
            view = new View(tv3Var.getContext());
        } else if (i == 1) {
            Context context = tv3Var.getContext();
            int i2 = ew3.C1;
            view = new vza(context, true, false, ew3Var.J0, false);
        } else if (i == 3) {
            Context context2 = tv3Var.getContext();
            boolean z = tv3Var.a == 0;
            pv3 pv3Var = new pv3(context2);
            pv3Var.b = -1;
            be0 be0Var = new be0(context2);
            pv3Var.a = be0Var;
            pv3Var.addView(be0Var, nme.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(k96.M0(z ? 2131748021 : 2131747957, null));
            pv3Var.addView(textView, nme.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            view = pv3Var;
        } else if (i == 4) {
            cw3 cw3Var = new cw3(ew3Var, tv3Var.getContext());
            ew3Var.B1.add(cw3Var);
            cw3Var.e = new av3(ew3Var, (byte) 2);
            view = cw3Var;
        } else {
            view = new iv3(tv3Var.getContext(), tv3Var.b);
        }
        return new y29(view);
    }
}
