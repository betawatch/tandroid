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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xl0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ em0 e;

    public xl0(em0 em0Var, Context context, int i7) {
        this.e = em0Var;
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
        em0 em0Var = this.e;
        if (i7 == em0Var.R || i7 == em0Var.g0 || i7 == em0Var.T || i7 == em0Var.W) {
            return 2;
        }
        if (i7 == em0Var.Q) {
            return 1;
        }
        if (i7 == em0Var.S) {
            return 3;
        }
        if (i7 == em0Var.U) {
            return 5;
        }
        if (i7 == em0Var.V) {
            return 6;
        }
        if (i7 == em0Var.h0) {
            return 10;
        }
        if (i7 == em0Var.i0) {
            return 11;
        }
        if (i7 == em0Var.a0) {
            return 7;
        }
        if (i7 >= em0Var.b0 && i7 < em0Var.c0) {
            return em0Var.K == null ? 8 : 12;
        }
        if (i7 < em0Var.d0 || i7 >= em0Var.e0) {
            return (i7 == em0Var.k0 - 1 || i7 == em0Var.j0) ? 4 : 2;
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
        em0 em0Var = this.e;
        HashMap hashMap = em0Var.M;
        ArrayList arrayList = em0Var.l0;
        ArrayList arrayList2 = em0Var.L;
        km0 km0Var = em0Var.p0;
        int d = d(i7);
        int i11 = this.d;
        int i12 = 1;
        r11 = true;
        boolean z9 = true;
        int i13 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, view, km0Var.getResourceProvider());
                ((hm0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 != em0Var.R) {
                    if (i7 != em0Var.W) {
                        if (i7 == em0Var.g0) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131743740, null));
                            break;
                        }
                    } else {
                        z8Var.setText("");
                        z8Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        M0 = org.telegram.messenger.id.M0(km0Var.a ? 2131752434 : 2131743752, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(km0Var.a ? 2131752322 : 2131743734, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.q2(this, i11, 21)), true));
                    break;
                }
                break;
            case 3:
                ((dm0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.updateColors();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, km0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == em0Var.V) {
                    m8Var.k(org.telegram.messenger.id.M0(km0Var.a ? 2131752324 : 2131743737, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == em0Var.a0) {
                    n4Var.c(org.telegram.messenger.id.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, km0Var.getResourceProvider());
                break;
            case 8:
                tl0 tl0Var = (tl0) view;
                int i14 = i7 - em0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    tl0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = em0Var.r;
                    tl0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = em0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    tl0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                em0Var.F = view;
                jm0 jm0Var = em0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                ArrayList arrayList3 = bi.ea.y(i10, false).I;
                arrayList2.add(org.telegram.messenger.id.M0(2131749946, null));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (em0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        q5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(q5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i12 = 1;
                }
                wl0 wl0Var = new wl0(this, i13);
                ArrayList arrayList4 = jm0Var.f;
                boolean z10 = jm0Var.K == 0;
                jm0Var.K = 0;
                jm0Var.h = wl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                jm0Var.c.f();
                jm0Var.a(i16, z10);
                em0Var.l(jm0Var);
                view.post(new ul0(em0Var, 3));
                break;
            case 11:
                ((cm0) view).updateColors();
                break;
            case 12:
                zh.y0 y0Var = (zh.y0) view;
                int i17 = i7 - em0Var.b0;
                if (em0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = em0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = em0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z9 = false;
                    }
                    y0Var.f(z9, false);
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var5;
        em0 em0Var = this.e;
        km0 km0Var = em0Var.p0;
        switch (i7) {
            case 1:
                Context context = em0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                hm0 hm0Var = new hm0(this.d, i10, context, h6Var);
                em0Var.f = hm0Var;
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, hm0Var, km0Var.getResourceProvider());
                hm0Var.a(em0Var.h, false);
                hm0Var.setOnColorClick(new wl0(this, 1));
                view2 = hm0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.z8(em0Var.getContext(), km0Var.getResourceProvider());
                break;
            case 3:
                dm0 dm0Var = new dm0(em0Var, em0Var.getContext());
                em0Var.D = dm0Var;
                dm0Var.b(false);
                view2 = dm0Var;
                break;
            case 4:
                View smVar = new org.telegram.ui.Components.sm(em0Var.getContext(), 19);
                smVar.setTag(-33024);
                view = smVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(em0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(em0Var.getContext(), km0Var.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, km0Var.getResourceProvider());
                view2 = m8Var;
                break;
            case 7:
                Context context2 = em0Var.getContext();
                h6Var2 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, h6Var2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, km0Var.getResourceProvider());
                view2 = n4Var;
                break;
            case 8:
                Context context3 = em0Var.getContext();
                h6Var3 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View tl0Var = new tl0(context3, h6Var3, false);
                tl0Var.setTag(-33024);
                view = tl0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                h6Var4 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context4, h6Var4);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(35);
                lzVar.setTag(-33024);
                view = lzVar;
                view2 = view;
                break;
            case 10:
                View smVar2 = new org.telegram.ui.Components.sm(em0Var.getContext(), 20);
                smVar2.setTag(-33024);
                view = smVar2;
                view2 = view;
                break;
            case 11:
                view2 = new cm0(em0Var, em0Var.getContext());
                break;
            case 12:
                Context context5 = em0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                h6Var5 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View y0Var = new zh.y0(i11, context5, h6Var5);
                y0Var.setTag(-33024);
                view = y0Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.xi0(view2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        em0 em0Var = this.e;
        ArrayList arrayList = em0Var.l0;
        int i7 = d1Var.f;
        View view = d1Var.a;
        if (i7 == 10) {
            em0Var.F = view;
            view.post(new ul0(em0Var, 2));
            return;
        }
        boolean z9 = true;
        if (i7 == 8) {
            tl0 tl0Var = (tl0) view;
            int b10 = d1Var.b() - em0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            tl0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = em0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = em0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z9 = false;
            }
            tl0Var.b(z9, false);
            return;
        }
        if (i7 == 12) {
            zh.y0 y0Var = (zh.y0) view;
            int b11 = d1Var.b() - em0Var.b0;
            if (em0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = em0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = em0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z9 = false;
                }
                y0Var.f(z9, false);
            }
        }
    }
}
