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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xo0 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dp0 e;

    public xo0(dp0 dp0Var, Context context, int i10) {
        this.e = dp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.b0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        dp0 dp0Var = this.e;
        if (i10 != dp0Var.J && i10 != dp0Var.V && i10 != dp0Var.L && i10 != dp0Var.O) {
            if (i10 == dp0Var.I) {
                return 1;
            }
            if (i10 == dp0Var.K) {
                return 3;
            }
            if (i10 == dp0Var.M) {
                return 5;
            }
            if (i10 == dp0Var.N) {
                return 6;
            }
            if (i10 == dp0Var.W) {
                return 10;
            }
            if (i10 == dp0Var.a0) {
                return 11;
            }
            if (i10 == dp0Var.P) {
                return 7;
            }
            if (i10 >= dp0Var.Q && i10 < dp0Var.R) {
                return dp0Var.C == null ? 8 : 12;
            }
            if (i10 >= dp0Var.S && i10 < dp0Var.T) {
                return 9;
            }
            if (i10 == dp0Var.b0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = m1Var.a;
        dp0 dp0Var = this.e;
        HashMap hashMap = dp0Var.E;
        ArrayList arrayList = dp0Var.c0;
        ArrayList arrayList2 = dp0Var.D;
        ip0 ip0Var = dp0Var.g0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z4 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                ((gp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 != dp0Var.J) {
                    if (i10 != dp0Var.O) {
                        if (i10 == dp0Var.V) {
                            a9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                            break;
                        }
                    } else {
                        a9Var.setText("");
                        a9Var.setFixedSize(12);
                        a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), dp0Var.P >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(ip0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(ip0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    a9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.jm(this, i12, 19)), true));
                    a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), dp0Var.N >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    break;
                }
                break;
            case 3:
                cp0 cp0Var = (cp0) view;
                ip0 ip0Var2 = cp0Var.d.g0;
                cp0Var.setBackgroundColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                cp0Var.a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.v();
                o8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                o8Var.v();
                if (i10 == dp0Var.N) {
                    o8Var.i(LocaleController.getString(ip0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == dp0Var.P) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                break;
            case 8:
                to0 to0Var = (to0) view;
                int i14 = i10 - dp0Var.Q;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    to0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.s;
                    to0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = dp0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    to0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                lh.f2 f2Var = (lh.f2) view;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                ArrayList arrayList3 = mh.t7.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dp0Var.C == starGift) {
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
                f2Var.a(0, arrayList2, i16, new wo0(this, 0));
                f2Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                f2Var.b();
                break;
            case 11:
                ((bp0) view).a();
                break;
            case 12:
                lh.x1 x1Var = (lh.x1) view;
                int i17 = i10 - dp0Var.Q;
                if (dp0Var.B != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = dp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z4 = false;
                    }
                    x1Var.e(z4, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        View view;
        dp0 dp0Var = this.e;
        ip0 ip0Var = dp0Var.g0;
        switch (i10) {
            case 1:
                Context context = dp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                gp0 gp0Var = new gp0(this.d, i11, context, g6Var);
                dp0Var.h = gp0Var;
                gp0Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                gp0Var.a(dp0Var.n, false);
                gp0Var.setOnColorClick(new wo0(this, 1));
                view = gp0Var;
                break;
            case 2:
            default:
                view = new org.telegram.ui.Cells.a9(dp0Var.getContext(), ip0Var.getResourceProvider());
                break;
            case 3:
                cp0 cp0Var = new cp0(dp0Var, dp0Var.getContext());
                dp0Var.x = cp0Var;
                cp0Var.b(false);
                view = cp0Var;
                break;
            case 4:
                View jnVar = new org.telegram.ui.Components.jn(dp0Var.getContext(), 18);
                jnVar.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                view = jnVar;
                break;
            case 5:
                view = new org.telegram.ui.Components.jn(dp0Var.getContext(), 17);
                break;
            case 6:
                View o8Var = new org.telegram.ui.Cells.o8(dp0Var.getContext(), ip0Var.getResourceProvider());
                o8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                view = o8Var;
                break;
            case 7:
                Context context2 = dp0Var.getContext();
                g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, g6Var2);
                m4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                view = m4Var;
                break;
            case 8:
                Context context3 = dp0Var.getContext();
                g6Var3 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                view = new to0(context3, g6Var3, false);
                break;
            case 9:
                Context context4 = this.c;
                g6Var4 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context4, g6Var4);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(35);
                view = u00Var;
                break;
            case 10:
                View f2Var = new lh.f2(dp0Var.getContext(), false);
                f2Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                view = f2Var;
                break;
            case 11:
                view = new bp0(dp0Var, dp0Var.getContext());
                break;
            case 12:
                Context context5 = dp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                g6Var5 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                view = new lh.x1(context5, i12, g6Var5);
                break;
        }
        return new org.telegram.ui.Components.fl0(view);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dp0 dp0Var = this.e;
        ArrayList arrayList = dp0Var.c0;
        int i10 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        if (i10 == 8) {
            to0 to0Var = (to0) view;
            int b10 = m1Var.b() - dp0Var.Q;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            to0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = dp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z4 = false;
            }
            to0Var.b(z4, false);
            return;
        }
        if (i10 == 12) {
            lh.x1 x1Var = (lh.x1) view;
            int b11 = m1Var.b() - dp0Var.Q;
            if (dp0Var.B != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = dp0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z4 = false;
                }
                x1Var.e(z4, false);
            }
        }
    }
}
