package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ul0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bm0 e;

    public ul0(bm0 bm0Var, Context context, int i7) {
        this.e = bm0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 8 || i7 == 12;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.k0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        bm0 bm0Var = this.e;
        if (i7 == bm0Var.R || i7 == bm0Var.g0 || i7 == bm0Var.T || i7 == bm0Var.W) {
            return 2;
        }
        if (i7 == bm0Var.Q) {
            return 1;
        }
        if (i7 == bm0Var.S) {
            return 3;
        }
        if (i7 == bm0Var.U) {
            return 5;
        }
        if (i7 == bm0Var.V) {
            return 6;
        }
        if (i7 == bm0Var.h0) {
            return 10;
        }
        if (i7 == bm0Var.i0) {
            return 11;
        }
        if (i7 == bm0Var.a0) {
            return 7;
        }
        if (i7 >= bm0Var.b0 && i7 < bm0Var.c0) {
            return bm0Var.K == null ? 8 : 12;
        }
        if (i7 < bm0Var.d0 || i7 >= bm0Var.e0) {
            return (i7 == bm0Var.k0 - 1 || i7 == bm0Var.j0) ? 4 : 2;
        }
        return 9;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = d1Var.a;
        bm0 bm0Var = this.e;
        HashMap hashMap = bm0Var.M;
        ArrayList arrayList = bm0Var.l0;
        ArrayList arrayList2 = bm0Var.L;
        hm0 hm0Var = bm0Var.p0;
        int d = d(i7);
        int i11 = this.d;
        int i12 = 1;
        r11 = true;
        boolean z9 = true;
        int i13 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, view, hm0Var.getResourceProvider());
                ((em0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 != bm0Var.R) {
                    if (i7 != bm0Var.W) {
                        if (i7 == bm0Var.g0) {
                            z8Var.setText(org.telegram.messenger.hd.M0(2131743741, null));
                            break;
                        }
                    } else {
                        z8Var.setText("");
                        z8Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        M0 = org.telegram.messenger.hd.M0(hm0Var.a ? 2131752434 : 2131743753, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(hm0Var.a ? 2131752322 : 2131743735, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.r2(this, i11, 21)), true));
                    break;
                }
                break;
            case 3:
                ((am0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.updateColors();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m8Var, hm0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == bm0Var.V) {
                    m8Var.k(org.telegram.messenger.hd.M0(hm0Var.a ? 2131752324 : 2131743738, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == bm0Var.a0) {
                    n4Var.c(org.telegram.messenger.hd.M0(2131743742, null), false);
                }
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, hm0Var.getResourceProvider());
                break;
            case 8:
                ql0 ql0Var = (ql0) view;
                int i14 = i7 - bm0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ql0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bm0Var.r;
                    ql0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = bm0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ql0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                bm0Var.F = view;
                gm0 gm0Var = bm0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                ArrayList arrayList3 = bi.ea.y(i10, false).I;
                arrayList2.add(org.telegram.messenger.hd.M0(2131749945, null));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (bm0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        r5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(r5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i12 = 1;
                }
                tl0 tl0Var = new tl0(this, i13);
                ArrayList arrayList4 = gm0Var.f;
                boolean z10 = gm0Var.K == 0;
                gm0Var.K = 0;
                gm0Var.h = tl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                gm0Var.c.f();
                gm0Var.a(i16, z10);
                bm0Var.l(gm0Var);
                view.post(new rl0(bm0Var, 3));
                break;
            case 11:
                ((zl0) view).updateColors();
                break;
            case 12:
                zh.z0 z0Var = (zh.z0) view;
                int i17 = i7 - bm0Var.b0;
                if (bm0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    z0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bm0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = bm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z9 = false;
                    }
                    z0Var.f(z9, false);
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var5;
        bm0 bm0Var = this.e;
        hm0 hm0Var = bm0Var.p0;
        switch (i7) {
            case 1:
                Context context = bm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                em0 em0Var = new em0(this.d, i10, context, f6Var);
                bm0Var.f = em0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, em0Var, hm0Var.getResourceProvider());
                em0Var.a(bm0Var.h, false);
                em0Var.setOnColorClick(new tl0(this, 1));
                view2 = em0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.z8(bm0Var.getContext(), hm0Var.getResourceProvider());
                break;
            case 3:
                am0 am0Var = new am0(bm0Var, bm0Var.getContext());
                bm0Var.D = am0Var;
                am0Var.b(false);
                view2 = am0Var;
                break;
            case 4:
                View tmVar = new org.telegram.ui.Components.tm(bm0Var.getContext(), 19);
                tmVar.setTag(-33024);
                view = tmVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(bm0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(bm0Var.getContext(), hm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m8Var, hm0Var.getResourceProvider());
                view2 = m8Var;
                break;
            case 7:
                Context context2 = bm0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, f6Var2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, hm0Var.getResourceProvider());
                view2 = n4Var;
                break;
            case 8:
                Context context3 = bm0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View ql0Var = new ql0(context3, f6Var3, false);
                ql0Var.setTag(-33024);
                view = ql0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                f6Var4 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context4, f6Var4);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(35);
                lzVar.setTag(-33024);
                view = lzVar;
                view2 = view;
                break;
            case 10:
                View tmVar2 = new org.telegram.ui.Components.tm(bm0Var.getContext(), 20);
                tmVar2.setTag(-33024);
                view = tmVar2;
                view2 = view;
                break;
            case 11:
                view2 = new zl0(bm0Var, bm0Var.getContext());
                break;
            case 12:
                Context context5 = bm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View z0Var = new zh.z0(i11, context5, f6Var5);
                z0Var.setTag(-33024);
                view = z0Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.xi0(view2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        bm0 bm0Var = this.e;
        ArrayList arrayList = bm0Var.l0;
        int i7 = d1Var.f;
        View view = d1Var.a;
        if (i7 == 10) {
            bm0Var.F = view;
            view.post(new rl0(bm0Var, 2));
            return;
        }
        boolean z9 = true;
        if (i7 == 8) {
            ql0 ql0Var = (ql0) view;
            int b10 = d1Var.b() - bm0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ql0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bm0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = bm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z9 = false;
            }
            ql0Var.b(z9, false);
            return;
        }
        if (i7 == 12) {
            zh.z0 z0Var = (zh.z0) view;
            int b11 = d1Var.b() - bm0Var.b0;
            if (bm0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                z0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bm0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = bm0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z9 = false;
                }
                z0Var.f(z9, false);
            }
        }
    }
}
