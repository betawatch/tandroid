package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.y1;
import s4.c1;
import sg.u;
import ug.d0;
import ug.h;
import ug.i;
import ug.l;
import ug.r;
import ug.v;
import ug.w;
import ug.x;
import ug.y;
import xh.i7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b extends ng.b {
    public final f6 d;
    public vl0 f;
    public u h;
    public u n;
    public r r;
    public u s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(f6 f6Var) {
        this.d = f6Var;
        y1 y1Var = new y1(this, 9);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new x1(21, messagesStorage, y1Var));
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f;
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
    public final void v(c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            r rVar = (r) view;
            this.r = rVar;
            rVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            ug.d dVar = (ug.d) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            w9 w9Var = dVar.c;
            f6 f6Var = dVar.a;
            f4 f4Var = dVar.d;
            l5 l5Var = dVar.e;
            g9 g9Var = dVar.b;
            boolean z11 = dVar.r == i12;
            dVar.r = i12;
            if (i12 == 0) {
                f4Var.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var.setTextColor(j6.v0(j6.r5, f6Var));
                g9Var.g(16);
                g9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.b7));
            } else if (i12 == 1) {
                f4Var.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                l5Var.setTextColor(j6.v0(j6.n5, f6Var));
                g9Var.g(6);
                g9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.b7));
            } else if (i12 == 2) {
                f4Var.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                l5Var.setTextColor(j6.v0(j6.n5, f6Var));
                g9Var.g(25);
                g9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.b7));
            } else if (i12 == 3) {
                f4Var.k(s8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var.setTextColor(j6.v0(j6.r5, f6Var));
                g9Var.g(26);
                g9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.b7));
            }
            dVar.f.a(z10, z11);
            w9Var.setImageDrawable(g9Var);
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
                ug.g gVar = (ug.g) view;
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
                ((h) view).setDate(aVar.h);
                break;
            case 11:
                ug.u uVar = (ug.u) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                f4 f4Var2 = uVar.d;
                uVar.r = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    f4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    f4Var2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                uVar.f.a(z12, false);
                uVar.setDivider(z13);
                uVar.e.setTextColor(j6.v0(j6.n5, uVar.a));
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
                long j3 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                f4 f4Var3 = iVar.d;
                iVar.s = tLObject;
                if (i17 >= 12) {
                    f4Var3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    f4Var3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j3 / i18 : j3, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                iVar.setSubtitle(sb2.toString());
                l5 l5Var2 = iVar.r;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j3 = 0;
                }
                l5Var2.l(billingController.formatCurrency(j3, charSequence.toString()), false);
                iVar.setDivider(z14);
                iVar.f.a(z15, false);
                break;
            case 13:
                x xVar = (x) view;
                xVar.setText(aVar.c);
                int i19 = aVar.i;
                o6 o6Var = xVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((ug.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
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
                long j10 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = wVar.f;
                o6 o6Var2 = wVar.d;
                o6 o6Var3 = wVar.e;
                boolean z19 = wVar.r == tL_starsGiveawayOption;
                wVar.a.a(z18, z19);
                wVar.r = tL_starsGiveawayOption;
                if (z19) {
                    o6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    o6Var2.c(wVar.h, false, true);
                    o6Var3.c(wVar.n, z19, true);
                    textView.setText("");
                } else {
                    o6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    o6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j10, ','), z19, true);
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
    public final c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i10) {
            case 2:
                view = new ug.d(context, f6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new c7(context, j6.v0(j6.a7, f6Var), 0);
                break;
            case 5:
                view = new v(context, f6Var);
                break;
            case 6:
                View m4Var = new m4(context, j6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(j6.v0(j6.h5, f6Var));
                view = m4Var;
                break;
            case 7:
                view = new d0(context, f6Var);
                break;
            case 8:
                view = new ug.b(context, f6Var);
                break;
            case 9:
                view = new ug.g(context, f6Var);
                break;
            case 10:
                view = new h(context, f6Var);
                break;
            case 11:
                ug.u uVar = new ug.u(context, f6Var);
                uVar.c.setVisibility(8);
                view = uVar;
                break;
            case 12:
                view = new i(context, f6Var);
                break;
            case 13:
                View xVar = new x(context, f6Var);
                xVar.setBackgroundColor(j6.v0(j6.h5, f6Var));
                view = xVar;
                break;
            case 14:
                view = new ug.e(context, f6Var);
                break;
            case 15:
                y yVar = new y(context, f6Var);
                yVar.setHeight(50);
                view = yVar;
                break;
            case 16:
                view = new l(context, f6Var);
                break;
            case 17:
                view = new w(context, f6Var);
                break;
            case 18:
                i7 i7Var = new i7(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = i7Var.c == -1;
                i7Var.c = -1;
                o6 o6Var = i7Var.a;
                o6Var.c(string, z10, true);
                int w02 = j6.w0(null, j6.o6, false);
                o6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = i7Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(wr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                i7Var.d = false;
                i7Var.setWillNotDraw(true);
                view = i7Var;
                break;
            default:
                view = new r(context, f6Var);
                break;
        }
        return e2.j(view, view, -1, -2);
    }
}
