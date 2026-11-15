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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wl0 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dm0 e;

    public wl0(dm0 dm0Var, Context context, int i7) {
        this.e = dm0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 8 || i7 == 12;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.l0;
    }

    @Override // v4.h0
    public final int d(int i7) {
        dm0 dm0Var = this.e;
        if (i7 == dm0Var.S || i7 == dm0Var.h0 || i7 == dm0Var.U || i7 == dm0Var.a0) {
            return 2;
        }
        if (i7 == dm0Var.R) {
            return 1;
        }
        if (i7 == dm0Var.T) {
            return 3;
        }
        if (i7 == dm0Var.V) {
            return 5;
        }
        if (i7 == dm0Var.W) {
            return 6;
        }
        if (i7 == dm0Var.i0) {
            return 10;
        }
        if (i7 == dm0Var.j0) {
            return 11;
        }
        if (i7 == dm0Var.b0) {
            return 7;
        }
        if (i7 >= dm0Var.c0 && i7 < dm0Var.d0) {
            return dm0Var.L == null ? 8 : 12;
        }
        if (i7 < dm0Var.e0 || i7 >= dm0Var.f0) {
            return (i7 == dm0Var.l0 - 1 || i7 == dm0Var.k0) ? 4 : 2;
        }
        return 9;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        String M0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = e1Var.a;
        dm0 dm0Var = this.e;
        HashMap hashMap = dm0Var.N;
        ArrayList arrayList = dm0Var.m0;
        ArrayList arrayList2 = dm0Var.M;
        jm0 jm0Var = dm0Var.q0;
        int d = d(i7);
        int i11 = this.d;
        int i12 = 1;
        r11 = true;
        boolean z10 = true;
        int i13 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, view, jm0Var.getResourceProvider());
                ((gm0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i7 != dm0Var.S) {
                    if (i7 != dm0Var.a0) {
                        if (i7 == dm0Var.h0) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131743740, null));
                            break;
                        }
                    } else {
                        y8Var.setText("");
                        y8Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        M0 = org.telegram.messenger.hd.M0(jm0Var.a ? 2131752434 : 2131743752, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(jm0Var.a ? 2131752322 : 2131743734, null);
                    }
                    y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.a2(this, i11, 24)), true));
                    break;
                }
                break;
            case 3:
                ((cm0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.updateColors();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, jm0Var.getResourceProvider());
                l8Var.updateColors();
                if (i7 == dm0Var.W) {
                    l8Var.k(org.telegram.messenger.hd.M0(jm0Var.a ? 2131752324 : 2131743737, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == dm0Var.b0) {
                    n4Var.c(org.telegram.messenger.hd.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, jm0Var.getResourceProvider());
                break;
            case 8:
                sl0 sl0Var = (sl0) view;
                int i14 = i7 - dm0Var.c0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    sl0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.r;
                    sl0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = dm0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    sl0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                dm0Var.G = view;
                im0 im0Var = dm0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                ArrayList arrayList3 = di.u8.y(i10, false).I;
                arrayList2.add(org.telegram.messenger.hd.M0(2131749946, null));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dm0Var.L == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        p5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i12 = 1;
                }
                vl0 vl0Var = new vl0(this, i13);
                ArrayList arrayList4 = im0Var.f;
                boolean z11 = im0Var.L == 0;
                im0Var.L = 0;
                im0Var.h = vl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                im0Var.c.f();
                im0Var.a(i16, z11);
                dm0Var.l(im0Var);
                view.post(new tl0(dm0Var, 3));
                break;
            case 11:
                ((bm0) view).updateColors();
                break;
            case 12:
                bi.i2 i2Var = (bi.i2) view;
                int i17 = i7 - dm0Var.c0;
                if (dm0Var.K != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = dm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    i2Var.f(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        dm0 dm0Var = this.e;
        jm0 jm0Var = dm0Var.q0;
        switch (i7) {
            case 1:
                Context context = dm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                gm0 gm0Var = new gm0(this.d, i10, context, e6Var);
                dm0Var.f = gm0Var;
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, gm0Var, jm0Var.getResourceProvider());
                gm0Var.a(dm0Var.h, false);
                gm0Var.setOnColorClick(new vl0(this, 1));
                view2 = gm0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.y8(dm0Var.getContext(), jm0Var.getResourceProvider());
                break;
            case 3:
                cm0 cm0Var = new cm0(dm0Var, dm0Var.getContext());
                dm0Var.E = cm0Var;
                cm0Var.b(false);
                view2 = cm0Var;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(dm0Var.getContext(), 19);
                bnVar.setTag(-33024);
                view = bnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(dm0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(dm0Var.getContext(), jm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, jm0Var.getResourceProvider());
                view2 = l8Var;
                break;
            case 7:
                Context context2 = dm0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, e6Var2);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, jm0Var.getResourceProvider());
                view2 = n4Var;
                break;
            case 8:
                Context context3 = dm0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View sl0Var = new sl0(context3, e6Var3, false);
                sl0Var.setTag(-33024);
                view = sl0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                e6Var4 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context4, e6Var4);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(35);
                pzVar.setTag(-33024);
                view = pzVar;
                view2 = view;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(dm0Var.getContext(), 20);
                bnVar2.setTag(-33024);
                view = bnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new bm0(dm0Var, dm0Var.getContext());
                break;
            case 12:
                Context context5 = dm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View i2Var = new bi.i2(i11, context5, e6Var5);
                i2Var.setTag(-33024);
                view = i2Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.cj0(view2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dm0 dm0Var = this.e;
        ArrayList arrayList = dm0Var.m0;
        int i7 = e1Var.f;
        View view = e1Var.a;
        if (i7 == 10) {
            dm0Var.G = view;
            view.post(new tl0(dm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            sl0 sl0Var = (sl0) view;
            int b10 = e1Var.b() - dm0Var.c0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            sl0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = dm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            sl0Var.b(z10, false);
            return;
        }
        if (i7 == 12) {
            bi.i2 i2Var = (bi.i2) view;
            int b11 = e1Var.b() - dm0Var.c0;
            if (dm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = dm0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                i2Var.f(z10, false);
            }
        }
    }
}
