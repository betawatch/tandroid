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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yl0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fm0 e;

    public yl0(fm0 fm0Var, Context context, int i7) {
        this.e = fm0Var;
        this.c = context;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 8 || i7 == 12;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.l0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        fm0 fm0Var = this.e;
        if (i7 == fm0Var.S || i7 == fm0Var.h0 || i7 == fm0Var.U || i7 == fm0Var.a0) {
            return 2;
        }
        if (i7 == fm0Var.R) {
            return 1;
        }
        if (i7 == fm0Var.T) {
            return 3;
        }
        if (i7 == fm0Var.V) {
            return 5;
        }
        if (i7 == fm0Var.W) {
            return 6;
        }
        if (i7 == fm0Var.i0) {
            return 10;
        }
        if (i7 == fm0Var.j0) {
            return 11;
        }
        if (i7 == fm0Var.b0) {
            return 7;
        }
        if (i7 >= fm0Var.c0 && i7 < fm0Var.d0) {
            return fm0Var.L == null ? 8 : 12;
        }
        if (i7 < fm0Var.e0 || i7 >= fm0Var.f0) {
            return (i7 == fm0Var.l0 - 1 || i7 == fm0Var.k0) ? 4 : 2;
        }
        return 9;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = f1Var.a;
        fm0 fm0Var = this.e;
        HashMap hashMap = fm0Var.N;
        ArrayList arrayList = fm0Var.m0;
        ArrayList arrayList2 = fm0Var.M;
        lm0 lm0Var = fm0Var.q0;
        int d = d(i7);
        int i11 = this.d;
        int i12 = 1;
        r11 = true;
        boolean z10 = true;
        int i13 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, view, lm0Var.getResourceProvider());
                ((im0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i7 != fm0Var.S) {
                    if (i7 != fm0Var.a0) {
                        if (i7 == fm0Var.h0) {
                            a9Var.setText(org.telegram.messenger.hd.N0(2131743495, null));
                            break;
                        }
                    } else {
                        a9Var.setText("");
                        a9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        N0 = org.telegram.messenger.hd.N0(lm0Var.a ? 2131752422 : 2131743507, null);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(lm0Var.a ? 2131752310 : 2131743489, null);
                    }
                    a9Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(N0, new ii(this, i11, 27)), true));
                    break;
                }
                break;
            case 3:
                ((em0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                n8Var.updateColors();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n8Var, lm0Var.getResourceProvider());
                n8Var.updateColors();
                if (i7 == fm0Var.W) {
                    n8Var.k(org.telegram.messenger.hd.N0(lm0Var.a ? 2131752312 : 2131743492, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == fm0Var.b0) {
                    o4Var.c(org.telegram.messenger.hd.N0(2131743496, null), false);
                }
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, lm0Var.getResourceProvider());
                break;
            case 8:
                ul0 ul0Var = (ul0) view;
                int i14 = i7 - fm0Var.c0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ul0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.r;
                    ul0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = fm0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ul0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                fm0Var.G = view;
                km0 km0Var = fm0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                ArrayList arrayList3 = di.y8.y(i10, false).I;
                arrayList2.add(org.telegram.messenger.hd.N0(2131749929, null));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (fm0Var.L == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        y5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i12 = 1;
                }
                xl0 xl0Var = new xl0(this, i13);
                ArrayList arrayList4 = km0Var.f;
                boolean z11 = km0Var.L == 0;
                km0Var.L = 0;
                km0Var.h = xl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                km0Var.c.f();
                km0Var.a(i16, z11);
                fm0Var.l(km0Var);
                view.post(new vl0(fm0Var, 3));
                break;
            case 11:
                ((dm0) view).updateColors();
                break;
            case 12:
                bi.g3 g3Var = (bi.g3) view;
                int i17 = i7 - fm0Var.c0;
                if (fm0Var.K != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    g3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = fm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    g3Var.f(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var5;
        fm0 fm0Var = this.e;
        lm0 lm0Var = fm0Var.q0;
        switch (i7) {
            case 1:
                Context context = fm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                im0 im0Var = new im0(this.d, i10, context, h6Var);
                fm0Var.f = im0Var;
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, im0Var, lm0Var.getResourceProvider());
                im0Var.a(fm0Var.h, false);
                im0Var.setOnColorClick(new xl0(this, 1));
                view2 = im0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.a9(fm0Var.getContext(), lm0Var.getResourceProvider());
                break;
            case 3:
                em0 em0Var = new em0(fm0Var, fm0Var.getContext());
                fm0Var.E = em0Var;
                em0Var.b(false);
                view2 = em0Var;
                break;
            case 4:
                View lnVar = new org.telegram.ui.Components.ln(fm0Var.getContext(), 19);
                lnVar.setTag(-33024);
                view = lnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(fm0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View n8Var = new org.telegram.ui.Cells.n8(fm0Var.getContext(), lm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n8Var, lm0Var.getResourceProvider());
                view2 = n8Var;
                break;
            case 7:
                Context context2 = fm0Var.getContext();
                h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View o4Var = new org.telegram.ui.Cells.o4(context2, h6Var2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, lm0Var.getResourceProvider());
                view2 = o4Var;
                break;
            case 8:
                Context context3 = fm0Var.getContext();
                h6Var3 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View ul0Var = new ul0(context3, h6Var3, false);
                ul0Var.setTag(-33024);
                view = ul0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                h6Var4 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context4, h6Var4);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(35);
                yzVar.setTag(-33024);
                view = yzVar;
                view2 = view;
                break;
            case 10:
                View lnVar2 = new org.telegram.ui.Components.ln(fm0Var.getContext(), 20);
                lnVar2.setTag(-33024);
                view = lnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new dm0(fm0Var, fm0Var.getContext());
                break;
            case 12:
                Context context5 = fm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                h6Var5 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View g3Var = new bi.g3(i11, context5, h6Var5);
                g3Var.setTag(-33024);
                view = g3Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.mj0(view2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        fm0 fm0Var = this.e;
        ArrayList arrayList = fm0Var.m0;
        int i7 = f1Var.f;
        View view = f1Var.a;
        if (i7 == 10) {
            fm0Var.G = view;
            view.post(new vl0(fm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            ul0 ul0Var = (ul0) view;
            int b10 = f1Var.b() - fm0Var.c0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ul0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = fm0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ul0Var.b(z10, false);
            return;
        }
        if (i7 == 12) {
            bi.g3 g3Var = (bi.g3) view;
            int b11 = f1Var.b() - fm0Var.c0;
            if (fm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = fm0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                g3Var.f(z10, false);
            }
        }
    }
}
