package vg;

import ai.sc;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ci.k4;
import com.google.android.gms.internal.play_billing.k3;
import ig.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import s4.b1;
import ug.s;
import wg.d0;
import wg.i;
import wg.l;
import wg.r;
import wg.u;
import wg.v;
import wg.w;
import wg.x;
import wg.y;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b extends pg.b {
    public final g6 d;
    public mm0 f;
    public s h;
    public s n;
    public r r;
    public s s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(g6 g6Var) {
        this.d = g6Var;
        k0 k0Var = new k0(this, 22);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new u2.k0(6, messagesStorage, k0Var));
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 2 || i10 == 11 || i10 == 8 || i10 == 10 || i10 == 15 || i10 == 12 || i10 == 17 || i10 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.w;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).a == 7) {
                m(i10);
            }
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            wg.d dVar = (wg.d) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            w9 w9Var = dVar.c;
            g6 g6Var = dVar.a;
            k4 k4Var = dVar.d;
            n5 n5Var = dVar.e;
            h9 h9Var = dVar.b;
            boolean z11 = dVar.s == i12;
            dVar.s = i12;
            if (i12 == 0) {
                k4Var.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                r6.Z(n5Var, k6.r5, g6Var);
                h9Var.g(16);
                h9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.b0(R.drawable.greydivider_bottom, k6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 1) {
                k4Var.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                r6.Z(n5Var, k6.n5, g6Var);
                h9Var.g(6);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.b0(R.drawable.greydivider_top, k6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 2) {
                k4Var.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                r6.Z(n5Var, k6.n5, g6Var);
                h9Var.g(25);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.b0(R.drawable.greydivider_bottom, k6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 3) {
                k4Var.k(r8.b(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                r6.Z(n5Var, k6.r5, g6Var);
                h9Var.g(26);
                h9Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.b0(R.drawable.greydivider_top, k6.b7, dVar.getContext(), dVar, null);
            }
            dVar.f.a(z10, z11);
            w9Var.setImageDrawable(h9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        if (i11 == 5) {
            v vVar = (v) view;
            List list = aVar.k;
            int i14 = aVar.i;
            vVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i15 = 0; i15 < list.size(); i15++) {
                strArr[i15] = String.valueOf((Integer) list.get(i15));
            }
            vVar.a.b(i14, null, strArr);
            vVar.setCallBack(this.h);
            return;
        }
        if (i11 == 6) {
            ((l4) view).setText(aVar.c);
            return;
        }
        if (i11 == 7) {
            d0 d0Var = (d0) view;
            d0Var.setText(aVar.c);
            d0Var.setBackground(aVar.g);
            return;
        }
        switch (i11) {
            case 9:
                wg.g gVar = (wg.g) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    gVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                    gVar.f(chat2, aVar.i, aVar.g, F(chat2));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                    gVar.f(chat3, aVar.i, aVar.g, F(chat3));
                }
                gVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((wg.h) view).setDate(aVar.h);
                break;
            case 11:
                u uVar = (u) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                k4 k4Var2 = uVar.d;
                uVar.s = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    k4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    k4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                r6.Z(uVar.e, k6.n5, uVar.a);
                if (list2.size() == 0) {
                    uVar.setSubtitle(uVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    uVar.setSubtitle(uVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list2.size(), new Object[0])));
                    break;
                }
            case 12:
                i iVar = (i) view;
                TLObject tLObject = aVar.m;
                int i17 = aVar.i;
                int i18 = aVar.j;
                long j10 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                k4 k4Var3 = iVar.d;
                iVar.v = tLObject;
                if (i17 >= 12) {
                    k4Var3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    k4Var3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                iVar.setSubtitle(sb2.toString());
                n5 n5Var2 = iVar.s;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                n5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                q6 q6Var = xVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                q6Var.a();
                q6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((wg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                y yVar = (y) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                yVar.K = aVar.l;
                yVar.f(charSequence2, z16, z17);
                break;
            case 16:
                l lVar = (l) view;
                lVar.setCount(aVar.i);
                lVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                w wVar = (w) view;
                TLObject tLObject2 = aVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i20 = aVar.i;
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = wVar.f;
                q6 q6Var2 = wVar.d;
                q6 q6Var3 = wVar.e;
                boolean z19 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z18, z19);
                wVar.r = tL_starsGiveawayOption;
                if (z19) {
                    q6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    q6Var2.c(wVar.h, false, true);
                    q6Var3.c(wVar.n, z19, true);
                    textView.setText("");
                } else {
                    q6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    q6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z19, true);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                wVar.s = i21;
                if (!z19) {
                    wVar.v.d(i21, true);
                }
                wVar.invalidate();
                break;
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        g6 g6Var = this.d;
        switch (i10) {
            case 2:
                view = new wg.d(context, g6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i11 = k6.a7;
                View b7Var = new b7(context, k6.w0(i11, g6Var), 0);
                r6.i(i11, b7Var, g6Var);
                view = b7Var;
                break;
            case 5:
                view = new v(context, g6Var);
                break;
            case 6:
                View l4Var = new l4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.h5, l4Var, g6Var);
                view = l4Var;
                break;
            case 7:
                view = new d0(context, g6Var);
                break;
            case 8:
                view = new wg.b(context, g6Var);
                break;
            case 9:
                view = new wg.g(context, g6Var);
                break;
            case 10:
                view = new wg.h(context, g6Var);
                break;
            case 11:
                u uVar = new u(context, g6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, g6Var);
                break;
            case 13:
                View xVar = new x(context, g6Var);
                r6.i(k6.h5, xVar, g6Var);
                view = xVar;
                break;
            case 14:
                view = new wg.e(context, g6Var);
                break;
            case 15:
                y yVar = new y(context, g6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, g6Var);
                break;
            case 17:
                view = new w(context, g6Var);
                break;
            case 18:
                sc scVar = new sc(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = scVar.c == -1;
                scVar.c = -1;
                q6 q6Var = scVar.a;
                q6Var.c(string, z10, true);
                int i12 = k6.o6;
                k6.v0(i12);
                r6.a0(q6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = scVar.b;
                r6.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(bs.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                scVar.d = false;
                scVar.setWillNotDraw(true);
                view = scVar;
                break;
            default:
                view = new r(context, g6Var);
                break;
        }
        return k3.l(view, view, -1, -2);
    }
}
