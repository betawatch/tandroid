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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xo0 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ep0 e;

    public xo0(ep0 ep0Var, Context context, int i10) {
        this.e = ep0Var;
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
        ep0 ep0Var = this.e;
        if (i10 == ep0Var.R || i10 == ep0Var.g0 || i10 == ep0Var.T || i10 == ep0Var.W) {
            return 2;
        }
        if (i10 == ep0Var.Q) {
            return 1;
        }
        if (i10 == ep0Var.S) {
            return 3;
        }
        if (i10 == ep0Var.U) {
            return 5;
        }
        if (i10 == ep0Var.V) {
            return 6;
        }
        if (i10 == ep0Var.h0) {
            return 10;
        }
        if (i10 == ep0Var.i0) {
            return 11;
        }
        if (i10 == ep0Var.a0) {
            return 7;
        }
        if (i10 >= ep0Var.b0 && i10 < ep0Var.c0) {
            return ep0Var.K == null ? 8 : 12;
        }
        if (i10 < ep0Var.d0 || i10 >= ep0Var.e0) {
            return (i10 == ep0Var.k0 - 1 || i10 == ep0Var.j0) ? 4 : 2;
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
        ep0 ep0Var = this.e;
        HashMap hashMap = ep0Var.M;
        ArrayList arrayList = ep0Var.l0;
        ArrayList arrayList2 = ep0Var.L;
        kp0 kp0Var = ep0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                ((hp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 != ep0Var.R) {
                    if (i10 != ep0Var.W) {
                        if (i10 == ep0Var.g0) {
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
                        string = LocaleController.getString(kp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(kp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    d9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.e2(this, i12, 23)), true));
                    break;
                }
                break;
            case 3:
                dp0 dp0Var = (dp0) view;
                kp0 kp0Var2 = dp0Var.d.p0;
                dp0Var.setBackgroundColor(kp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                dp0Var.a.setTextColor(kp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.v();
                q8Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                q8Var.v();
                if (i10 == ep0Var.V) {
                    q8Var.i(LocaleController.getString(kp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == ep0Var.a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 8:
                so0 so0Var = (so0) view;
                int i14 = i10 - ep0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    so0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ep0Var.r;
                    so0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = ep0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    so0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                ep0Var.F = view;
                jp0 jp0Var = ep0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                ArrayList arrayList3 = ai.ga.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (ep0Var.K == starGift) {
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
                wo0 wo0Var = new wo0(this, 0);
                ArrayList arrayList4 = jp0Var.f;
                boolean z11 = jp0Var.K == 0;
                jp0Var.K = 0;
                jp0Var.h = wo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                jp0Var.c.l();
                jp0Var.a(i16, z11);
                ep0Var.l(jp0Var);
                view.post(new uo0(ep0Var, 3));
                break;
            case 11:
                ((cp0) view).a();
                break;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i17 = i10 - ep0Var.b0;
                if (ep0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ep0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = ep0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        ep0 ep0Var = this.e;
        kp0 kp0Var = ep0Var.p0;
        switch (i10) {
            case 1:
                Context context = ep0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                hp0 hp0Var = new hp0(this.d, i11, context, d6Var);
                ep0Var.f = hp0Var;
                hp0Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                hp0Var.a(ep0Var.h, false);
                hp0Var.setOnColorClick(new wo0(this, 1));
                view2 = hp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.d9(ep0Var.getContext(), kp0Var.getResourceProvider());
                break;
            case 3:
                dp0 dp0Var = new dp0(ep0Var, ep0Var.getContext());
                ep0Var.y = dp0Var;
                dp0Var.b(false);
                view2 = dp0Var;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(ep0Var.getContext(), 20);
                unVar.setTag(-33024);
                view = unVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(ep0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(ep0Var.getContext(), kp0Var.getResourceProvider());
                q8Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = q8Var;
                break;
            case 7:
                Context context2 = ep0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, d6Var2);
                l4Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = l4Var;
                break;
            case 8:
                Context context3 = ep0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                View so0Var = new so0(context3, d6Var3, false);
                so0Var.setTag(-33024);
                view = so0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context4, d6Var4);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(35);
                b10Var.setTag(-33024);
                view = b10Var;
                view2 = view;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(ep0Var.getContext(), 21);
                unVar2.setTag(-33024);
                view = unVar2;
                view2 = view;
                break;
            case 11:
                view2 = new cp0(ep0Var, ep0Var.getContext());
                break;
            case 12:
                Context context5 = ep0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
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
        ep0 ep0Var = this.e;
        ArrayList arrayList = ep0Var.l0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 10) {
            ep0Var.F = view;
            view.post(new uo0(ep0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            so0 so0Var = (so0) view;
            int b10 = b1Var.b() - ep0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            so0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ep0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = ep0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            so0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - ep0Var.b0;
            if (ep0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ep0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = ep0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
