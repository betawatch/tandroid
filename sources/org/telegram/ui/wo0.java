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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wo0 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dp0 e;

    public wo0(dp0 dp0Var, Context context, int i10) {
        this.e = dp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.hm0
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
        dp0 dp0Var = this.e;
        if (i10 == dp0Var.R || i10 == dp0Var.g0 || i10 == dp0Var.T || i10 == dp0Var.W) {
            return 2;
        }
        if (i10 == dp0Var.Q) {
            return 1;
        }
        if (i10 == dp0Var.S) {
            return 3;
        }
        if (i10 == dp0Var.U) {
            return 5;
        }
        if (i10 == dp0Var.V) {
            return 6;
        }
        if (i10 == dp0Var.h0) {
            return 10;
        }
        if (i10 == dp0Var.i0) {
            return 11;
        }
        if (i10 == dp0Var.a0) {
            return 7;
        }
        if (i10 >= dp0Var.b0 && i10 < dp0Var.c0) {
            return dp0Var.K == null ? 8 : 12;
        }
        if (i10 < dp0Var.d0 || i10 >= dp0Var.e0) {
            return (i10 == dp0Var.k0 - 1 || i10 == dp0Var.j0) ? 4 : 2;
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
        dp0 dp0Var = this.e;
        HashMap hashMap = dp0Var.M;
        ArrayList arrayList = dp0Var.l0;
        ArrayList arrayList2 = dp0Var.L;
        jp0 jp0Var = dp0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                ((gp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 != dp0Var.R) {
                    if (i10 != dp0Var.W) {
                        if (i10 == dp0Var.g0) {
                            d9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            break;
                        }
                    } else {
                        d9Var.setText("");
                        d9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(jp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(jp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    d9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.e2(this, i12, 23)), true));
                    break;
                }
                break;
            case 3:
                cp0 cp0Var = (cp0) view;
                jp0 jp0Var2 = cp0Var.d.p0;
                cp0Var.setBackgroundColor(jp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                cp0Var.a.setTextColor(jp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.v();
                q8Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                q8Var.v();
                if (i10 == dp0Var.V) {
                    q8Var.i(LocaleController.getString(jp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == dp0Var.a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 8:
                ro0 ro0Var = (ro0) view;
                int i14 = i10 - dp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ro0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.r;
                    ro0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = dp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ro0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                dp0Var.F = view;
                ip0 ip0Var = dp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                ArrayList arrayList3 = ai.fa.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dp0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        a6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(a6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                vo0 vo0Var = new vo0(this, 0);
                ArrayList arrayList4 = ip0Var.f;
                boolean z11 = ip0Var.K == 0;
                ip0Var.K = 0;
                ip0Var.h = vo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                ip0Var.c.l();
                ip0Var.a(i16, z11);
                dp0Var.l(ip0Var);
                view.post(new to0(dp0Var, 3));
                break;
            case 11:
                ((bp0) view).a();
                break;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i17 = i10 - dp0Var.b0;
                if (dp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = dp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        dp0 dp0Var = this.e;
        jp0 jp0Var = dp0Var.p0;
        switch (i10) {
            case 1:
                Context context = dp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                gp0 gp0Var = new gp0(this.d, i11, context, d6Var);
                dp0Var.f = gp0Var;
                gp0Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                gp0Var.a(dp0Var.h, false);
                gp0Var.setOnColorClick(new vo0(this, 1));
                view2 = gp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.d9(dp0Var.getContext(), jp0Var.getResourceProvider());
                break;
            case 3:
                cp0 cp0Var = new cp0(dp0Var, dp0Var.getContext());
                dp0Var.y = cp0Var;
                cp0Var.b(false);
                view2 = cp0Var;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(dp0Var.getContext(), 20);
                unVar.setTag(-33024);
                view = unVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(dp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(dp0Var.getContext(), jp0Var.getResourceProvider());
                q8Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = q8Var;
                break;
            case 7:
                Context context2 = dp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, d6Var2);
                l4Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = l4Var;
                break;
            case 8:
                Context context3 = dp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View ro0Var = new ro0(context3, d6Var3, false);
                ro0Var.setTag(-33024);
                view = ro0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context4, d6Var4);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(35);
                b10Var.setTag(-33024);
                view = b10Var;
                view2 = view;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(dp0Var.getContext(), 21);
                unVar2.setTag(-33024);
                view = unVar2;
                view2 = view;
                break;
            case 11:
                view2 = new bp0(dp0Var, dp0Var.getContext());
                break;
            case 12:
                Context context5 = dp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, d6Var5);
                h1Var.setTag(-33024);
                view = h1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.sl0(view2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dp0 dp0Var = this.e;
        ArrayList arrayList = dp0Var.l0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 10) {
            dp0Var.F = view;
            view.post(new to0(dp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ro0 ro0Var = (ro0) view;
            int b10 = b1Var.b() - dp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ro0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = dp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ro0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - dp0Var.b0;
            if (dp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = dp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
