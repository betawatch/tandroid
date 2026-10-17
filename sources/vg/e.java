package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.a6;
import hg.r0;
import ig.l0;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.w9;
import qg.n;
import s4.b1;
import wg.c0;
import wg.d0;
import wg.r;
import wg.t;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class e extends hm0 {
    public final d6 c;
    public boolean d;
    public n2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public FrameLayout n;

    public e(d6 d6Var) {
        this.c = d6Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(b1 b1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // s4.g0
    public final int h() {
        return 5;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        int i11;
        char c10;
        String formatPluralString;
        int i12 = b1Var.f;
        View view = b1Var.a;
        int i13 = 23;
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
                final l0 l0Var = new l0(this, i13);
                rVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i15 = 0;
                rVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", h6.gc, 2, new Runnable() { // from class: wg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                l0Var.run(user);
                                break;
                            default:
                                l0Var.run(user);
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
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                wg.a aVar = (wg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new n(7, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    ei.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new r0(this, 24));
                    return;
                }
                return;
            }
            d0 d0Var = (d0) view;
            d0Var.setTextGravity(17);
            d0Var.setTextColor(h6.x0(null, h6.G6, false));
            d0Var.setTopPadding(14);
            d0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    d0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), h6.gc, 0, new c(this, i16), this.c));
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
        c0 c0Var = (c0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final l0 l0Var2 = new l0(this, i13);
        w9 w9Var = c0Var.h;
        FrameLayout frameLayout = c0Var.w;
        w9 w9Var2 = c0Var.f;
        TextView textView = c0Var.a;
        TextView textView2 = c0Var.b;
        d6 d6Var = c0Var.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        c0Var.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = c0Var.d;
        textView3.setTextColor(h6.w0(tL_payments_checkedGiftCode4.via_giveaway ? h6.m5 : h6.j5, d6Var));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), h6.gc, 0, new Runnable() { // from class: wg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            l0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            l0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, d6Var));
            textView3.setOnClickListener(new n(9, l0Var2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView3.setOnClickListener(null);
        }
        int i17 = tL_payments_checkedGiftCode4.months;
        if (i17 == 12) {
            i11 = 1;
            formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
            c10 = 0;
        } else {
            i11 = 1;
            c10 = 0;
            formatPluralString = LocaleController.formatPluralString("Months", i17, new Object[0]);
        }
        TextView textView4 = c0Var.c;
        int i18 = R.string.BoostingTelegramPremiumFor;
        String str3 = formatPluralString;
        Object[] objArr = new Object[i11];
        objArr[c10] = str3;
        textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i18, objArr));
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), h6.gc, 0, new uf.c(13, l0Var2, chat), d6Var), textView.getPaint().getFontMetricsInt(), false));
            w9Var2.e(chat, new h9(chat));
            frameLayout.setOnClickListener(new n(10, l0Var2, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i19 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            w9Var2.e(user2, new h9(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: wg.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            l0Var2.run(user2);
                            break;
                        default:
                            l0Var2.run(user2);
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
            final int i20 = 1;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), h6.gc, 0, new Runnable() { // from class: wg.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            l0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            l0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, d6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView2.setTextColor(h6.w0(h6.j5, d6Var));
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            w9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i21 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), h6.gc, 0, new Runnable() { // from class: wg.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i21) {
                            case 0:
                                l0Var2.run(user3);
                                break;
                            default:
                                l0Var2.run(user3);
                                break;
                        }
                    }
                }, d6Var), textView2.getPaint().getFontMetricsInt(), false));
                w9Var.e(user3, new h9(0, user3));
                c0Var.x.setOnClickListener(new View.OnClickListener() { // from class: wg.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i21) {
                            case 0:
                                l0Var2.run(user3);
                                break;
                            default:
                                l0Var2.run(user3);
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

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View tVar;
        Context context = viewGroup.getContext();
        d6 d6Var = this.c;
        if (i10 == 1) {
            tVar = new t(context, d6Var);
        } else if (i10 == 2) {
            tVar = new c0(context, d6Var);
        } else if (i10 == 3) {
            tVar = new d0(context, d6Var);
        } else if (i10 != 4) {
            tVar = i10 != 5 ? new r(context, d6Var) : new View(context);
        } else {
            tVar = new wg.a(context, d6Var);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return a6.l(tVar, tVar, -1, -2);
    }
}
