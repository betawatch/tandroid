package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.l5;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ji.p1;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z9;
import s4.b1;
import ug.u;
import wg.d0;
import wg.i;
import wg.l;
import wg.r;
import wg.v;
import wg.w;
import wg.x;
import wg.y;
import zh.y6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b extends pg.b {
    public final c6 d;
    public mm0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(c6 c6Var) {
        this.d = c6Var;
        p1 p1Var = new p1(this, 16);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.b(13, messagesStorage, p1Var));
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
            z9 z9Var = dVar.c;
            c6 c6Var = dVar.a;
            l5 l5Var = dVar.d;
            h5 h5Var = dVar.e;
            k9 k9Var = dVar.b;
            boolean z11 = dVar.s == i12;
            dVar.s = i12;
            if (i12 == 0) {
                l5Var.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.w0(g6.r5, c6Var));
                k9Var.g(16);
                k9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_bottom, g6.b7));
            } else if (i12 == 1) {
                l5Var.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var.setTextColor(g6.w0(g6.n5, c6Var));
                k9Var.g(6);
                k9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_top, g6.b7));
            } else if (i12 == 2) {
                l5Var.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var.setTextColor(g6.w0(g6.n5, c6Var));
                k9Var.g(25);
                k9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_bottom, g6.b7));
            } else if (i12 == 3) {
                l5Var.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.w0(g6.r5, c6Var));
                k9Var.g(26);
                k9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_top, g6.b7));
            }
            dVar.f.a(z10, z11);
            z9Var.setImageDrawable(k9Var);
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
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
            ((m4) view).setText(aVar.c);
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
                wg.u uVar = (wg.u) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                l5 l5Var2 = uVar.d;
                uVar.s = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    l5Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    l5Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                uVar.e.setTextColor(g6.w0(g6.n5, uVar.a));
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
                l5 l5Var3 = iVar.d;
                iVar.v = tLObject;
                if (i17 >= 12) {
                    l5Var3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    l5Var3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                iVar.setSubtitle(sb2.toString());
                h5 h5Var2 = iVar.s;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                h5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                s6 s6Var = xVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                s6Var.a();
                s6Var.c(formatPluralString, true, true);
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
                s6 s6Var2 = wVar.d;
                s6 s6Var3 = wVar.e;
                boolean z19 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z18, z19);
                wVar.r = tL_starsGiveawayOption;
                if (z19) {
                    s6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    s6Var2.c(wVar.h, false, true);
                    s6Var3.c(wVar.n, z19, true);
                    textView.setText("");
                } else {
                    s6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    s6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z19, true);
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
        c6 c6Var = this.d;
        switch (i10) {
            case 2:
                view = new wg.d(context, c6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new a7(context, g6.w0(g6.a7, c6Var), 0);
                break;
            case 5:
                view = new v(context, c6Var);
                break;
            case 6:
                View m4Var = new m4(context, g6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(g6.w0(g6.h5, c6Var));
                view = m4Var;
                break;
            case 7:
                view = new d0(context, c6Var);
                break;
            case 8:
                view = new wg.b(context, c6Var);
                break;
            case 9:
                view = new wg.g(context, c6Var);
                break;
            case 10:
                view = new wg.h(context, c6Var);
                break;
            case 11:
                wg.u uVar = new wg.u(context, c6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, c6Var);
                break;
            case 13:
                View xVar = new x(context, c6Var);
                xVar.setBackgroundColor(g6.w0(g6.h5, c6Var));
                view = xVar;
                break;
            case 14:
                view = new wg.e(context, c6Var);
                break;
            case 15:
                y yVar = new y(context, c6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, c6Var);
                break;
            case 17:
                view = new w(context, c6Var);
                break;
            case 18:
                y6 y6Var = new y6(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = y6Var.c == -1;
                y6Var.c = -1;
                s6 s6Var = y6Var.a;
                s6Var.c(string, z10, true);
                int x02 = g6.x0(null, g6.o6, false);
                s6Var.setTextColor(x02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = y6Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(es.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                y6Var.d = false;
                y6Var.setWillNotDraw(true);
                view = y6Var;
                break;
            default:
                view = new r(context, c6Var);
                break;
        }
        return k3.l(view, view, -1, -2);
    }
}
