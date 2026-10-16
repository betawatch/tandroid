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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yp0 e;

    public rp0(yp0 yp0Var, Context context, int i10) {
        this.e = yp0Var;
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
        yp0 yp0Var = this.e;
        if (i10 == yp0Var.R || i10 == yp0Var.g0 || i10 == yp0Var.T || i10 == yp0Var.W) {
            return 2;
        }
        if (i10 == yp0Var.Q) {
            return 1;
        }
        if (i10 == yp0Var.S) {
            return 3;
        }
        if (i10 == yp0Var.U) {
            return 5;
        }
        if (i10 == yp0Var.V) {
            return 6;
        }
        if (i10 == yp0Var.h0) {
            return 10;
        }
        if (i10 == yp0Var.i0) {
            return 11;
        }
        if (i10 == yp0Var.a0) {
            return 7;
        }
        if (i10 >= yp0Var.b0 && i10 < yp0Var.c0) {
            return yp0Var.K == null ? 8 : 12;
        }
        if (i10 < yp0Var.d0 || i10 >= yp0Var.e0) {
            return (i10 == yp0Var.k0 - 1 || i10 == yp0Var.j0) ? 4 : 2;
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
        yp0 yp0Var = this.e;
        HashMap hashMap = yp0Var.M;
        ArrayList arrayList = yp0Var.l0;
        ArrayList arrayList2 = yp0Var.L;
        eq0 eq0Var = yp0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                ((bq0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != yp0Var.R) {
                    if (i10 != yp0Var.W) {
                        if (i10 == yp0Var.g0) {
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
                        string = LocaleController.getString(eq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(eq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o8(this, i12, 22)), true));
                    break;
                }
                break;
            case 3:
                xp0 xp0Var = (xp0) view;
                eq0 eq0Var2 = xp0Var.d.p0;
                xp0Var.setBackgroundColor(eq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                xp0Var.a.setTextColor(eq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                r8Var.v();
                if (i10 == yp0Var.V) {
                    r8Var.i(LocaleController.getString(eq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == yp0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 8:
                mp0 mp0Var = (mp0) view;
                int i14 = i10 - yp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    mp0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = yp0Var.r;
                    mp0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = yp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    mp0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                yp0Var.F = view;
                dq0 dq0Var = yp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                ArrayList arrayList3 = zh.n5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (yp0Var.K == starGift) {
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
                qp0 qp0Var = new qp0(this, 0);
                ArrayList arrayList4 = dq0Var.f;
                boolean z11 = dq0Var.K == 0;
                dq0Var.K = 0;
                dq0Var.h = qp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                dq0Var.c.l();
                dq0Var.a(i16, z11);
                yp0Var.l(dq0Var);
                view.post(new op0(yp0Var, 3));
                break;
            case 11:
                ((wp0) view).a();
                break;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i17 = i10 - yp0Var.b0;
                if (yp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = yp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = yp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        yp0 yp0Var = this.e;
        eq0 eq0Var = yp0Var.p0;
        switch (i10) {
            case 1:
                Context context = yp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                bq0 bq0Var = new bq0(this.d, i11, context, c6Var);
                yp0Var.f = bq0Var;
                bq0Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                bq0Var.a(yp0Var.h, false);
                bq0Var.setOnColorClick(new qp0(this, 1));
                view2 = bq0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(yp0Var.getContext(), eq0Var.getResourceProvider());
                break;
            case 3:
                xp0 xp0Var = new xp0(yp0Var, yp0Var.getContext());
                yp0Var.y = xp0Var;
                xp0Var.b(false);
                view2 = xp0Var;
                break;
            case 4:
                View xnVar = new org.telegram.ui.Components.xn(yp0Var.getContext(), 20);
                xnVar.setTag(-33024);
                view = xnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(yp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(yp0Var.getContext(), eq0Var.getResourceProvider());
                r8Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = yp0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, c6Var2);
                m4Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = yp0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                View mp0Var = new mp0(context3, c6Var3, false);
                mp0Var.setTag(-33024);
                view = mp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context4, c6Var4);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(35);
                f10Var.setTag(-33024);
                view = f10Var;
                view2 = view;
                break;
            case 10:
                View xnVar2 = new org.telegram.ui.Components.xn(yp0Var.getContext(), 21);
                xnVar2.setTag(-33024);
                view = xnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new wp0(yp0Var, yp0Var.getContext());
                break;
            case 12:
                Context context5 = yp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
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
        yp0 yp0Var = this.e;
        ArrayList arrayList = yp0Var.l0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 10) {
            yp0Var.F = view;
            view.post(new op0(yp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            mp0 mp0Var = (mp0) view;
            int b10 = b1Var.b() - yp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            mp0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = yp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = yp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            mp0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - yp0Var.b0;
            if (yp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = yp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = yp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
