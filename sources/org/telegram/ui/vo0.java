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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bp0 e;

    public vo0(bp0 bp0Var, Context context, int i10) {
        this.e = bp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.b0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        bp0 bp0Var = this.e;
        if (i10 != bp0Var.J && i10 != bp0Var.V && i10 != bp0Var.L && i10 != bp0Var.O) {
            if (i10 == bp0Var.I) {
                return 1;
            }
            if (i10 == bp0Var.K) {
                return 3;
            }
            if (i10 == bp0Var.M) {
                return 5;
            }
            if (i10 == bp0Var.N) {
                return 6;
            }
            if (i10 == bp0Var.W) {
                return 10;
            }
            if (i10 == bp0Var.a0) {
                return 11;
            }
            if (i10 == bp0Var.P) {
                return 7;
            }
            if (i10 >= bp0Var.Q && i10 < bp0Var.R) {
                return bp0Var.C == null ? 8 : 12;
            }
            if (i10 >= bp0Var.S && i10 < bp0Var.T) {
                return 9;
            }
            if (i10 == bp0Var.b0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = l1Var.a;
        bp0 bp0Var = this.e;
        HashMap hashMap = bp0Var.E;
        ArrayList arrayList = bp0Var.c0;
        ArrayList arrayList2 = bp0Var.D;
        gp0 gp0Var = bp0Var.g0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z4 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ((ep0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 != bp0Var.J) {
                    if (i10 != bp0Var.O) {
                        if (i10 == bp0Var.V) {
                            a9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                            break;
                        }
                    } else {
                        a9Var.setText("");
                        a9Var.setFixedSize(12);
                        a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), bp0Var.P >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(gp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(gp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    a9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.hm(this, i12, 19)), true));
                    a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), bp0Var.N >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                    break;
                }
                break;
            case 3:
                ap0 ap0Var = (ap0) view;
                gp0 gp0Var2 = ap0Var.d.g0;
                ap0Var.setBackgroundColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ap0Var.a.setTextColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.v();
                o8Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                o8Var.v();
                if (i10 == bp0Var.N) {
                    o8Var.i(LocaleController.getString(gp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == bp0Var.P) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 8:
                ro0 ro0Var = (ro0) view;
                int i14 = i10 - bp0Var.Q;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ro0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bp0Var.s;
                    ro0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = bp0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ro0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                kh.g2 g2Var = (kh.g2) view;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                ArrayList arrayList3 = lh.t7.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (bp0Var.C == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        u5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(u5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                g2Var.a(0, arrayList2, i16, new uo0(this, 0));
                g2Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                g2Var.b();
                break;
            case 11:
                ((zo0) view).a();
                break;
            case 12:
                kh.x1 x1Var = (kh.x1) view;
                int i17 = i10 - bp0Var.Q;
                if (bp0Var.B != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bp0Var.s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = bp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z4 = false;
                    }
                    x1Var.e(z4, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        View view;
        bp0 bp0Var = this.e;
        gp0 gp0Var = bp0Var.g0;
        switch (i10) {
            case 1:
                Context context = bp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                ep0 ep0Var = new ep0(this.d, i11, context, f6Var);
                bp0Var.h = ep0Var;
                ep0Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ep0Var.a(bp0Var.n, false);
                ep0Var.setOnColorClick(new uo0(this, 1));
                view = ep0Var;
                break;
            case 2:
            default:
                view = new org.telegram.ui.Cells.a9(bp0Var.getContext(), gp0Var.getResourceProvider());
                break;
            case 3:
                ap0 ap0Var = new ap0(bp0Var, bp0Var.getContext());
                bp0Var.x = ap0Var;
                ap0Var.b(false);
                view = ap0Var;
                break;
            case 4:
                View hnVar = new org.telegram.ui.Components.hn(bp0Var.getContext(), 18);
                hnVar.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                view = hnVar;
                break;
            case 5:
                view = new org.telegram.ui.Components.hn(bp0Var.getContext(), 17);
                break;
            case 6:
                View o8Var = new org.telegram.ui.Cells.o8(bp0Var.getContext(), gp0Var.getResourceProvider());
                o8Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view = o8Var;
                break;
            case 7:
                Context context2 = bp0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, f6Var2);
                m4Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view = m4Var;
                break;
            case 8:
                Context context3 = bp0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                view = new ro0(context3, f6Var3, false);
                break;
            case 9:
                Context context4 = this.c;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context4, f6Var4);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(35);
                view = t00Var;
                break;
            case 10:
                View g2Var = new kh.g2(bp0Var.getContext(), false);
                g2Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view = g2Var;
                break;
            case 11:
                view = new zo0(bp0Var, bp0Var.getContext());
                break;
            case 12:
                Context context5 = bp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                view = new kh.x1(context5, i12, f6Var5);
                break;
        }
        return new org.telegram.ui.Components.el0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        bp0 bp0Var = this.e;
        ArrayList arrayList = bp0Var.c0;
        int i10 = l1Var.f;
        View view = l1Var.a;
        boolean z4 = true;
        if (i10 == 8) {
            ro0 ro0Var = (ro0) view;
            int b10 = l1Var.b() - bp0Var.Q;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ro0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bp0Var.s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = bp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z4 = false;
            }
            ro0Var.b(z4, false);
            return;
        }
        if (i10 == 12) {
            kh.x1 x1Var = (kh.x1) view;
            int b11 = l1Var.b() - bp0Var.Q;
            if (bp0Var.B != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bp0Var.s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = bp0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z4 = false;
                }
                x1Var.e(z4, false);
            }
        }
    }
}
