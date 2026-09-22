package yh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.x70;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new q7());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x074a  */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        SpannableString spannableString;
        int dp;
        char c10;
        boolean z11;
        boolean z12;
        String str;
        long j3;
        boolean z13;
        r7 r7Var = (r7) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) i51Var.G;
        boolean z14 = i51Var.q;
        u9 u9Var = r7Var.d;
        SpannableString spannableString2 = r7Var.v;
        SpannableString spannableString3 = r7Var.w;
        f9 f9Var = r7Var.b;
        int i10 = r7Var.a;
        TextView textView = r7Var.r;
        TextView textView2 = r7Var.s;
        u9 u9Var2 = r7Var.c;
        TextView textView3 = r7Var.f;
        Integer num = 0;
        c90 c90Var = r7Var.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z15 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i11 = starsTransaction.flags;
        boolean z16 = (i11 & 131072) == 0 && (i11 & 65536) != 0;
        boolean z17 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        r7Var.x = z17;
        boolean z18 = z17;
        LinearLayout.LayoutParams layoutParams = r7Var.h;
        if (z18) {
            spannableString = spannableString2;
            dp = 0;
        } else {
            spannableString = spannableString2;
            dp = AndroidUtilities.dp(4.33f);
        }
        layoutParams.bottomMargin = dp;
        c90Var.setVisibility(r7Var.x ? 0 : 8);
        textView.setTextSize(1, r7Var.x ? 13.0f : 14.0f);
        textView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
        if (starsTransaction.refund) {
            c10 = 2;
            textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
        } else {
            c10 = 2;
            if (starsTransaction.failed) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
        }
        u9Var2.setTranslationX(0.0f);
        u9Var2.setTranslationY(0.0f);
        u9Var.setVisibility(8);
        u9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            u9Var2.setImageDrawable(new n3(u9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            c90Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            u9Var2.setImageDrawable(new n3(u9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            c90Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        u9Var2.setImageDrawable(r7.a(44, "fragment"));
                        z12 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        z12 = user == null;
                        f9Var.r(user);
                        u9Var2.e(user, f9Var);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat == null;
                        f9Var.q(chat);
                        u9Var2.e(chat, f9Var);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        x70 x70Var = new x70(c90Var, 16.0f, i10);
                        x70Var.a(4.0f);
                        x70Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(x70Var, 0, 1, 33);
                        x7.a1(x70Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starsTransaction.stargift.getDocument(), c90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            c90Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(starsTransaction.stargift.getDocument(), c90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            c90Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[c10] = string;
                            c90Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            c90Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            String string2 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[c10] = string2;
                            c90Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            String string3 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[c10] = string3;
                            c90Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i12 = starsTransaction.subscription_period;
                        if (i12 == 2592000) {
                            c90Var.setVisibility(0);
                            c90Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i12 == 300 ? "5 minutes" : "Minute";
                            c90Var.setVisibility(0);
                            Locale locale = Locale.US;
                            c90Var.setText(str2.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z16) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, ei.l.G0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        c90Var.setVisibility(z12 ? 8 : 0);
                        c90Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z11 = z15;
                        if (starsTransaction.photo != null) {
                            x70 x70Var2 = new x70(c90Var, 14.0f, i10);
                            x70Var2.a(4.0f);
                            x70Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(x70Var2, 0, 1, 33);
                            x70Var2.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            c90Var.setVisibility(z12 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            c90Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str3 != null ? str3 : ""), c90Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(str);
                            c90Var.setVisibility(z12 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            c90Var.setText(Emoji.replaceEmoji(str4 != null ? str4 : "", c90Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z14) {
                            textView3.setText(str);
                            c90Var.setVisibility(0);
                            c90Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            c90Var.setVisibility(z12 ? 8 : 0);
                            c90Var.setText(str);
                        }
                        r7Var.e = 0;
                        int i13 = 0;
                        while (i13 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i13);
                            u9 u9Var3 = i13 == 0 ? u9Var2 : u9Var;
                            u9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            ImageLocation forPhoto = messageMedia instanceof TLRPC.TL_messageMediaPhoto ? ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo) : messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            u9Var3.setVisibility(0);
                            Integer num2 = num;
                            u9Var3.l(forPhoto, "46_46", null, null, null, num2);
                            r7Var.e++;
                            i13++;
                            num = num2;
                            z15 = z15;
                        }
                        z11 = z15;
                        int i14 = 0;
                        while (i14 < r7Var.e) {
                            u9 u9Var4 = i14 == 0 ? u9Var2 : u9Var;
                            float f7 = i14;
                            u9Var4.setTranslationX(((f7 - (r7Var.e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            u9Var4.setTranslationY((f7 - (r7Var.e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i14++;
                        }
                    }
                } else {
                    z11 = z15;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        c90Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        u9Var2.setImageDrawable(r7.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            u9Var2.setImageDrawable(r7.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            u9Var2.setImageDrawable(r7.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                c90Var.setText(LocaleController.getString(z11 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                c90Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z14 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            u9Var2.setImageDrawable(r7.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            u9Var2.setImageDrawable(r7.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            u9Var2.setImageDrawable(r7.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            u9Var2.setImageDrawable(r7.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            u9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j3 = starsAmount.amount;
                if (j3 <= 0 || (j3 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.uj, false));
                    textView2.setText(TextUtils.concat("+", x7.I0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z13 = z10;
                } else {
                    if (j3 < 0 || (j3 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.wj, false));
                        textView2.setText(TextUtils.concat(x7.I0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z13 = z10;
                }
                r7Var.y = z13;
                r7Var.setWillNotDraw(!z13);
            }
            u9Var2.setImageDrawable(r7.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            c90Var.setVisibility(8);
        }
        z11 = z15;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j3 = starsAmount2.amount;
        if (j3 <= 0) {
        }
        textView2.setVisibility(0);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.uj, false));
        textView2.setText(TextUtils.concat("+", x7.I0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z13 = z10;
        r7Var.y = z13;
        r7Var.setWillNotDraw(!z13);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        r7 r7Var = (r7) getCached();
        return r7Var != null ? r7Var : new r7(context, i10, e6Var);
    }
}
