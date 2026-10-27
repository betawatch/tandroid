package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.jc;
import di.l4;
import ig.o;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.y9;
import s4.e1;
import vg.u;
import xg.d0;
import xg.i;
import xg.l;
import xg.r;
import xg.v;
import xg.w;
import xg.x;
import xg.y;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends qg.b {
    public final u6 d;
    public nm0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(u6 u6Var) {
        this.d = u6Var;
        o oVar = new o(this, 26);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.g(23, messagesStorage, oVar));
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(e1 e1Var) {
        int i10 = e1Var.f;
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

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            xg.d dVar = (xg.d) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            y9 y9Var = dVar.c;
            u6 u6Var = dVar.a;
            l4 l4Var = dVar.d;
            b6 b6Var = dVar.e;
            j9 j9Var = dVar.b;
            boolean z11 = dVar.s == i12;
            dVar.s = i12;
            if (i12 == 0) {
                l4Var.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                f7.Y(b6Var, y6.r5, u6Var);
                j9Var.g(16);
                j9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                f7.a0(R.drawable.greydivider_bottom, y6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 1) {
                l4Var.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                f7.Y(b6Var, y6.n5, u6Var);
                j9Var.g(6);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                f7.a0(R.drawable.greydivider_top, y6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 2) {
                l4Var.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                f7.Y(b6Var, y6.n5, u6Var);
                j9Var.g(25);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                f7.a0(R.drawable.greydivider_bottom, y6.b7, dVar.getContext(), dVar, null);
            } else if (i12 == 3) {
                l4Var.k(v8.b(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                f7.Y(b6Var, y6.r5, u6Var);
                j9Var.g(26);
                j9Var.i(-146917, -625593);
                dVar.setDivider(false);
                f7.a0(R.drawable.greydivider_top, y6.b7, dVar.getContext(), dVar, null);
            }
            dVar.f.a(z10, z11);
            y9Var.setImageDrawable(j9Var);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
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
            ((q4) view).setText(aVar.c);
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
                xg.g gVar = (xg.g) view;
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
                ((xg.h) view).setDate(aVar.h);
                break;
            case 11:
                xg.u uVar = (xg.u) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                l4 l4Var2 = uVar.d;
                uVar.s = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    l4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    l4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                f7.Y(uVar.e, y6.n5, uVar.a);
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
                l4 l4Var3 = iVar.d;
                iVar.v = tLObject;
                if (i17 >= 12) {
                    l4Var3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    l4Var3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                iVar.setSubtitle(sb2.toString());
                b6 b6Var2 = iVar.s;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                b6Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
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
                ((xg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
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

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        u6 u6Var = this.d;
        switch (i10) {
            case 2:
                view = new xg.d(context, u6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i11 = y6.a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, y6.w0(i11, u6Var), 0);
                f7.i(i11, f7Var, u6Var);
                view = f7Var;
                break;
            case 5:
                view = new v(context, u6Var);
                break;
            case 6:
                View q4Var = new q4(context, y6.L6, 21, 15, 3, false, false, this.d);
                f7.i(y6.h5, q4Var, u6Var);
                view = q4Var;
                break;
            case 7:
                view = new d0(context, u6Var);
                break;
            case 8:
                view = new xg.b(context, u6Var);
                break;
            case 9:
                view = new xg.g(context, u6Var);
                break;
            case 10:
                view = new xg.h(context, u6Var);
                break;
            case 11:
                xg.u uVar = new xg.u(context, u6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, u6Var);
                break;
            case 13:
                View xVar = new x(context, u6Var);
                f7.i(y6.h5, xVar, u6Var);
                view = xVar;
                break;
            case 14:
                view = new xg.e(context, u6Var);
                break;
            case 15:
                y yVar = new y(context, u6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, u6Var);
                break;
            case 17:
                view = new w(context, u6Var);
                break;
            case 18:
                jc jcVar = new jc(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = jcVar.c == -1;
                jcVar.c = -1;
                s6 s6Var = jcVar.a;
                s6Var.c(string, z10, true);
                int i12 = y6.o6;
                y6.v0(i12);
                f7.Z(s6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = jcVar.b;
                f7.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(ds.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                jcVar.d = false;
                jcVar.setWillNotDraw(true);
                view = jcVar;
                break;
            default:
                view = new r(context, u6Var);
                break;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
