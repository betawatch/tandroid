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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ cp0 e;

    public vo0(cp0 cp0Var, Context context, int i10) {
        this.e = cp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.im0
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
        cp0 cp0Var = this.e;
        if (i10 == cp0Var.R || i10 == cp0Var.g0 || i10 == cp0Var.T || i10 == cp0Var.W) {
            return 2;
        }
        if (i10 == cp0Var.Q) {
            return 1;
        }
        if (i10 == cp0Var.S) {
            return 3;
        }
        if (i10 == cp0Var.U) {
            return 5;
        }
        if (i10 == cp0Var.V) {
            return 6;
        }
        if (i10 == cp0Var.h0) {
            return 10;
        }
        if (i10 == cp0Var.i0) {
            return 11;
        }
        if (i10 == cp0Var.a0) {
            return 7;
        }
        if (i10 >= cp0Var.b0 && i10 < cp0Var.c0) {
            return cp0Var.K == null ? 8 : 12;
        }
        if (i10 < cp0Var.d0 || i10 >= cp0Var.e0) {
            return (i10 == cp0Var.k0 - 1 || i10 == cp0Var.j0) ? 4 : 2;
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
        cp0 cp0Var = this.e;
        HashMap hashMap = cp0Var.M;
        ArrayList arrayList = cp0Var.l0;
        ArrayList arrayList2 = cp0Var.L;
        ip0 ip0Var = cp0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                ((fp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 != cp0Var.R) {
                    if (i10 != cp0Var.W) {
                        if (i10 == cp0Var.g0) {
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
                        string = LocaleController.getString(ip0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(ip0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    d9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.e2(this, i12, 23)), true));
                    break;
                }
                break;
            case 3:
                bp0 bp0Var = (bp0) view;
                ip0 ip0Var2 = bp0Var.d.p0;
                bp0Var.setBackgroundColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                bp0Var.a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.v();
                q8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                q8Var.v();
                if (i10 == cp0Var.V) {
                    q8Var.i(LocaleController.getString(ip0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == cp0Var.a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 8:
                qo0 qo0Var = (qo0) view;
                int i14 = i10 - cp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    qo0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = cp0Var.r;
                    qo0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = cp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    qo0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                cp0Var.F = view;
                hp0 hp0Var = cp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                ArrayList arrayList3 = ai.ga.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (cp0Var.K == starGift) {
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
                uo0 uo0Var = new uo0(this, 0);
                ArrayList arrayList4 = hp0Var.f;
                boolean z11 = hp0Var.K == 0;
                hp0Var.K = 0;
                hp0Var.h = uo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                hp0Var.c.l();
                hp0Var.a(i16, z11);
                cp0Var.l(hp0Var);
                view.post(new so0(cp0Var, 3));
                break;
            case 11:
                ((ap0) view).a();
                break;
            case 12:
                yh.g1 g1Var = (yh.g1) view;
                int i17 = i10 - cp0Var.b0;
                if (cp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    g1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = cp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = cp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    g1Var.e(z10, false);
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
        cp0 cp0Var = this.e;
        ip0 ip0Var = cp0Var.p0;
        switch (i10) {
            case 1:
                Context context = cp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
                fp0 fp0Var = new fp0(this.d, i11, context, d6Var);
                cp0Var.f = fp0Var;
                fp0Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                fp0Var.a(cp0Var.h, false);
                fp0Var.setOnColorClick(new uo0(this, 1));
                view2 = fp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.d9(cp0Var.getContext(), ip0Var.getResourceProvider());
                break;
            case 3:
                bp0 bp0Var = new bp0(cp0Var, cp0Var.getContext());
                cp0Var.y = bp0Var;
                bp0Var.b(false);
                view2 = bp0Var;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(cp0Var.getContext(), 20);
                unVar.setTag(-33024);
                view = unVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(cp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(cp0Var.getContext(), ip0Var.getResourceProvider());
                q8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = q8Var;
                break;
            case 7:
                Context context2 = cp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, d6Var2);
                l4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = l4Var;
                break;
            case 8:
                Context context3 = cp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
                View qo0Var = new qo0(context3, d6Var3, false);
                qo0Var.setTag(-33024);
                view = qo0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context4, d6Var4);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(35);
                b10Var.setTag(-33024);
                view = b10Var;
                view2 = view;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(cp0Var.getContext(), 21);
                unVar2.setTag(-33024);
                view = unVar2;
                view2 = view;
                break;
            case 11:
                view2 = new ap0(cp0Var, cp0Var.getContext());
                break;
            case 12:
                Context context5 = cp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
                View g1Var = new yh.g1(context5, i12, d6Var5);
                g1Var.setTag(-33024);
                view = g1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.tl0(view2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        cp0 cp0Var = this.e;
        ArrayList arrayList = cp0Var.l0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 10) {
            cp0Var.F = view;
            view.post(new so0(cp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            qo0 qo0Var = (qo0) view;
            int b10 = b1Var.b() - cp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            qo0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = cp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = cp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            qo0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.g1 g1Var = (yh.g1) view;
            int b11 = b1Var.b() - cp0Var.b0;
            if (cp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = cp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = cp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                g1Var.e(z10, false);
            }
        }
    }
}
