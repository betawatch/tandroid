package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ig.d0;
import ig.o;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y9;
import s4.e1;
import vi.k0;
import xg.c0;
import xg.r;
import xg.t;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class e extends mm0 {
    public final u6 c;
    public boolean d;
    public r2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public FrameLayout n;

    public e(u6 u6Var) {
        this.c = u6Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(e1 e1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // s4.h0
    public final int h() {
        return 5;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i11;
    }

    @Override // s4.h0
    public final void v(e1 e1Var, int i10) {
        int i11;
        char c10;
        String formatPluralString;
        c0 c0Var;
        int i12 = e1Var.f;
        View view = e1Var.a;
        int i13 = 27;
        final int i14 = 0;
        if (i12 == 0) {
            r rVar = (r) view;
            if (this.d) {
                rVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
            } else {
                rVar.c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
                rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final o oVar = new o(this, i13);
                rVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i15 = 0;
                rVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", y6.gc, 2, new Runnable() { // from class: xg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                oVar.run(user);
                                break;
                            default:
                                oVar.run(user);
                                break;
                        }
                    }
                }, rVar.e)));
            }
            if (this.f.to_id == -1) {
                rVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
                return;
            }
            return;
        }
        int i16 = 1;
        if (i12 == 1) {
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                tVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                tVar.a(new c(this, 0));
                return;
            }
            return;
        }
        int i17 = 8;
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                xg.a aVar = (xg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new org.telegram.ui.web.c(i17, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    fi.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.i(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new d0(this, 25));
                    return;
                }
                return;
            }
            xg.d0 d0Var = (xg.d0) view;
            d0Var.setTextGravity(17);
            f7.V(d0Var.getTextView(), y6.G6, null);
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), y6.gc, 0, new c(this, i16), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    d0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                d0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                d0Var.setFixedSize(14);
                d0Var.setText(null);
                return;
            }
        }
        c0 c0Var2 = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final o oVar2 = new o(this, i13);
        y9 y9Var = c0Var2.h;
        FrameLayout frameLayout = c0Var2.w;
        y9 y9Var2 = c0Var2.f;
        TextView textView = c0Var2.a;
        TextView textView2 = c0Var2.b;
        u6 u6Var = c0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var2.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = c0Var2.d;
        f7.V(textView3, tL_payments_checkedGiftCode4.via_giveaway ? y6.m5 : y6.j5, u6Var);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), y6.gc, 0, new Runnable() { // from class: xg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            oVar2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            oVar2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, u6Var));
            textView3.setOnClickListener(new org.telegram.ui.web.c(10, oVar2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView3.setOnClickListener(null);
        }
        int i18 = tL_payments_checkedGiftCode4.months;
        if (i18 == 12) {
            i11 = 1;
            formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
            c10 = 0;
        } else {
            i11 = 1;
            c10 = 0;
            formatPluralString = LocaleController.formatPluralString("Months", i18, new Object[0]);
        }
        TextView textView4 = c0Var2.c;
        int i19 = R.string.BoostingTelegramPremiumFor;
        String str3 = formatPluralString;
        Object[] objArr = new Object[i11];
        objArr[c10] = str3;
        textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i19, objArr));
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), y6.gc, 0, new k0(6, oVar2, chat), u6Var), textView.getPaint().getFontMetricsInt(), false));
            y9Var2.f(chat, new j9(chat));
            frameLayout.setOnClickListener(new org.telegram.ui.web.c(11, oVar2, chat));
            c0Var = c0Var2;
        } else {
            c0Var = c0Var2;
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i20 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            y9Var2.f(user2, new j9(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: xg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i20) {
                        case 0:
                            oVar2.run(user2);
                            break;
                        default:
                            oVar2.run(user2);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i21 = 1;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), y6.gc, 0, new Runnable() { // from class: xg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            oVar2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            oVar2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, u6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            f7.V(textView2, y6.j5, u6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            y9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i22 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), y6.gc, 0, new Runnable() { // from class: xg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i22) {
                            case 0:
                                oVar2.run(user3);
                                break;
                            default:
                                oVar2.run(user3);
                                break;
                        }
                    }
                }, u6Var), textView2.getPaint().getFontMetricsInt(), false));
                y9Var.f(user3, new j9(0, user3));
                c0Var.x.setOnClickListener(new View.OnClickListener() { // from class: xg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i22) {
                            case 0:
                                oVar2.run(user3);
                                break;
                            default:
                                oVar2.run(user3);
                                break;
                        }
                    }
                });
            }
        }
        if (tL_payments_checkedGiftCode4.boost != null) {
            c0Var.y.setVisibility(8);
        }
    }

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        View tVar;
        Context context = viewGroup.getContext();
        u6 u6Var = this.c;
        if (i10 == 1) {
            tVar = new t(context, u6Var);
        } else if (i10 == 2) {
            tVar = new c0(context, u6Var);
        } else if (i10 == 3) {
            tVar = new xg.d0(context, u6Var);
        } else if (i10 != 4) {
            tVar = i10 != 5 ? new r(context, u6Var) : new View(context);
        } else {
            tVar = new xg.a(context, u6Var);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return ic.a.n(tVar, tVar, -1, -2);
    }
}
