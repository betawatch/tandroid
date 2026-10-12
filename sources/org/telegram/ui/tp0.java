package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tp0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aq0 e;

    public tp0(aq0 aq0Var, Context context, int i10) {
        this.e = aq0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        aq0 aq0Var = this.e;
        if (i10 == aq0Var.R || i10 == aq0Var.g0 || i10 == aq0Var.T || i10 == aq0Var.W) {
            return 2;
        }
        if (i10 == aq0Var.Q) {
            return 1;
        }
        if (i10 == aq0Var.S) {
            return 3;
        }
        if (i10 == aq0Var.U) {
            return 5;
        }
        if (i10 == aq0Var.V) {
            return 6;
        }
        if (i10 == aq0Var.h0) {
            return 10;
        }
        if (i10 == aq0Var.i0) {
            return 11;
        }
        if (i10 == aq0Var.a0) {
            return 7;
        }
        if (i10 >= aq0Var.b0 && i10 < aq0Var.c0) {
            return aq0Var.K == null ? 8 : 12;
        }
        if (i10 < aq0Var.d0 || i10 >= aq0Var.e0) {
            return (i10 == aq0Var.k0 - 1 || i10 == aq0Var.j0) ? 4 : 2;
        }
        return 9;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = b1Var.a;
        aq0 aq0Var = this.e;
        HashMap hashMap = aq0Var.M;
        ArrayList arrayList = aq0Var.l0;
        ArrayList arrayList2 = aq0Var.L;
        gq0 gq0Var = aq0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                ((dq0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != aq0Var.R) {
                    if (i10 != aq0Var.W) {
                        if (i10 == aq0Var.g0) {
                            e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            break;
                        }
                    } else {
                        e9Var.setText("");
                        e9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(gq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(gq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o8(this, i12, 23)), true));
                    break;
                }
                break;
            case 3:
                zp0 zp0Var = (zp0) view;
                gq0 gq0Var2 = zp0Var.d.p0;
                zp0Var.setBackgroundColor(gq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                zp0Var.a.setTextColor(gq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                r8Var.v();
                if (i10 == aq0Var.V) {
                    r8Var.i(LocaleController.getString(gq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == aq0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 8:
                op0 op0Var = (op0) view;
                int i14 = i10 - aq0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    op0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = aq0Var.r;
                    op0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = aq0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    op0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                aq0Var.F = view;
                fq0 fq0Var = aq0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                ArrayList arrayList3 = zh.n5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (aq0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        b6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(b6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                sp0 sp0Var = new sp0(this, 0);
                ArrayList arrayList4 = fq0Var.f;
                boolean z11 = fq0Var.K == 0;
                fq0Var.K = 0;
                fq0Var.h = sp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                fq0Var.c.l();
                fq0Var.a(i16, z11);
                aq0Var.l(fq0Var);
                view.post(new qp0(aq0Var, 3));
                break;
            case 11:
                ((yp0) view).a();
                break;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i17 = i10 - aq0Var.b0;
                if (aq0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = aq0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = aq0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    h1Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        aq0 aq0Var = this.e;
        gq0 gq0Var = aq0Var.p0;
        switch (i10) {
            case 1:
                Context context = aq0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                dq0 dq0Var = new dq0(this.d, i11, context, c6Var);
                aq0Var.f = dq0Var;
                dq0Var.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                dq0Var.a(aq0Var.h, false);
                dq0Var.setOnColorClick(new sp0(this, 1));
                view2 = dq0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(aq0Var.getContext(), gq0Var.getResourceProvider());
                break;
            case 3:
                zp0 zp0Var = new zp0(aq0Var, aq0Var.getContext());
                aq0Var.y = zp0Var;
                zp0Var.b(false);
                view2 = zp0Var;
                break;
            case 4:
                View xnVar = new org.telegram.ui.Components.xn(aq0Var.getContext(), 20);
                xnVar.setTag(-33024);
                view = xnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(aq0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(aq0Var.getContext(), gq0Var.getResourceProvider());
                r8Var.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = aq0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, c6Var2);
                m4Var.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = aq0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                View op0Var = new op0(context3, c6Var3, false);
                op0Var.setTag(-33024);
                view = op0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context4, c6Var4);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(35);
                f10Var.setTag(-33024);
                view = f10Var;
                view2 = view;
                break;
            case 10:
                View xnVar2 = new org.telegram.ui.Components.xn(aq0Var.getContext(), 21);
                xnVar2.setTag(-33024);
                view = xnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new yp0(aq0Var, aq0Var.getContext());
                break;
            case 12:
                Context context5 = aq0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, c6Var5);
                h1Var.setTag(-33024);
                view = h1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.wl0(view2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        aq0 aq0Var = this.e;
        ArrayList arrayList = aq0Var.l0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 10) {
            aq0Var.F = view;
            view.post(new qp0(aq0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            op0 op0Var = (op0) view;
            int b10 = b1Var.b() - aq0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            op0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = aq0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = aq0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            op0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - aq0Var.b0;
            if (aq0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = aq0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = aq0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
