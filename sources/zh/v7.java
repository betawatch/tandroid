package zh;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.eb;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.gj;
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.cc1;
import org.telegram.ui.co;
import org.telegram.ui.fu;
import org.telegram.ui.oj0;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import org.telegram.ui.t50;
import org.telegram.ui.x70;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class v7 extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat h0;
    public static DecimalFormat i0;
    public FrameLayout P;
    public tg.e Q;
    public u7 R;
    public t50 S;
    public r00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.q6 W;
    public TextView X;
    public di.d Y;
    public sg.l1 Z;
    public di.d a0;
    public cc1 b0;
    public di.d c0;
    public di.d d0;
    public boolean e0;
    public boolean f0;
    public y6 g0;

    public v7() {
        this.M = true;
    }

    public static void A0(v7 v7Var) {
        s5.y(v7Var.currentAccount, false).u();
        ug.n1.e0(1, BirthdayController.getInstance(v7Var.currentAccount).getState());
    }

    public static /* synthetic */ void B0(v7 v7Var, Context context) {
        if (MessagesController.getInstance(v7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(v7Var.currentAccount);
        } else {
            new l7(context, v7Var.resourceProvider).show();
        }
    }

    public static void F0(oz0 oz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((lz0) oz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        i90 i90Var = new i90(textView, AndroidUtilities.dp(90.0f), 0, f6Var);
        i90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(i90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i11 = starGift.availability_remains;
                textView.setText(i11 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i11, LocaleController.formatNumber(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final s5 y3 = s5.y(i10, false);
        final long j3 = starGift.id;
        final org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(textView, 26);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: zh.b5
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                s5 s5Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (s5Var = s5.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(s5Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                b1Var.run(J);
            }
        };
        int i12 = y3.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift J = y3.J(j3);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            b1Var.run(J);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new v6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (i0 == null) {
            i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = i0.format(j3 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j10 > 0) {
                d = 1.0E9d;
                i10 = -1;
            } else if (i11 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j11 = i10 + j10;
            if (j10 != 0 ? j10 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(LocaleController.formatNumber(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j11), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = i0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (i0 == null) {
            i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j3 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            if (i11 < 0 && j3 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 <= 0 || j3 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j10 = i10 + j3;
            boolean z10 = j3 != 0 ? j3 < 0 : i11 < 0;
            if (Math.abs(j10) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(LocaleController.formatNumber(Math.abs(j10), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j10), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = i0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (i0 == null) {
                i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z10 = false;
        if (i11 < 0 && j3 > 0) {
            i10 = -1;
            d = 1.0E9d;
        } else if (i11 <= 0 || j3 >= 0) {
            d = 1.0E9d;
            i10 = 0;
        } else {
            d = 1.0E9d;
            i10 = 1;
        }
        long j10 = i10 + j3;
        if (j3 != 0 ? j3 < 0 : i11 < 0) {
            z10 = true;
        }
        if (i11 == 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j3));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j10), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (i0 == null) {
            i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = i0;
        int i12 = starsAmount.nanos;
        double d10 = i12;
        if (i12 < 0) {
            d10 += d;
        }
        String format2 = decimalFormat.format(d10 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
        return spannableStringBuilder;
    }

    public static String M0(long j3) {
        if (h0 == null) {
            h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return h0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j3 < 0 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        r5 = org.telegram.messenger.R.string.StarsTransactionFragment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String N0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return LocaleController.getString(R.string.StarsTransactionRemovedDescription);
        }
        if (starsTransaction.posts_search) {
            return LocaleController.getString(R.string.StarsTransactionPostsSearch);
        }
        if (starsTransaction.premium_gift) {
            return LocaleController.getString(R.string.StarsTransactionPremiumGift);
        }
        if (starsTransaction.phonegroup_message) {
            return LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee);
        }
        if (starsTransaction.paid_message) {
            return LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return LocaleController.getString(R.string.StarsTransactionFloodskip);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return LocaleController.getString(R.string.StarMediaPurchase);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i11 = starsTransaction.flags;
        if ((131072 & i11) == 0 && (65536 & i11) != 0) {
            return LocaleController.formatString(R.string.StarTransactionCommission, fi.m.G0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
            }
            if (starsTransaction.refund) {
                return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
            }
            return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsAmount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
        }
        if (starsTransaction.subscription) {
            int i12 = starsTransaction.subscription_period;
            if (i12 == 2592000) {
                return LocaleController.getString(R.string.StarSubscriptionPurchase);
            }
            if (i12 == 300) {
                return "5-minute subscription fee";
            }
            if (i12 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i11 & 8192) != 0) {
            return LocaleController.getString(R.string.StarsGiveawayPrizeReceived);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return LocaleController.getString(UserObject.isUserSelf(MessagesController.getInstance(i10).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.sent_by)))) ? R.string.StarsGiftSent : R.string.StarsGiftReceived);
            }
            return LocaleController.getString(R.string.StarsGiftReceived);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        if (peerDialogId != 0) {
            if (peerDialogId >= 0) {
                return UserObject.getUserName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(peerDialogId)));
            }
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-peerDialogId));
            return chat == null ? "" : chat.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? LocaleController.getString(R.string.StarsTransactionBot) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? LocaleController.getString(R.string.StarsTransactionAds) : LocaleController.getString(R.string.StarsTransactionUnsupported);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return LocaleController.getString(r5);
        }
        int i13 = R.string.StarsTransactionWithdrawFragment;
        return LocaleController.getString(i13);
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f7) {
        return P0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        nq nqVar = new nq(R.drawable.diamond, 0);
        nqVar.recolorDrawable = false;
        nqVar.translate(0.0f, f10);
        nqVar.spaceScaleX = f11;
        nqVar.setScale(f7, f7);
        spannableString.setSpan(nqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence) {
        return R0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7, nq[] nqVarArr) {
        return U0(false, charSequence, f7, nqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f7, nq[] nqVarArr, float f10, float f11) {
        nq nqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (nqVarArr == null || (nqVar = nqVarArr[0]) == null) {
            nqVar = new nq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (nqVarArr != null) {
                nqVarArr[0] = nqVar;
            }
        }
        nqVar.translate(0.0f, f10);
        nqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f7 * 0.2f;
            nqVar.setScale(f12, f12);
        } else {
            nqVar.setScale(f7, f7);
        }
        spannableString.setSpan(nqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, nq[] nqVarArr) {
        nq nqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (nqVarArr == null || (nqVar = nqVarArr[0]) == null) {
            nqVar = new nq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            nqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (nqVarArr != null) {
            nqVarArr[0] = nqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(nqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, nq[] nqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, nqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f7, nq[] nqVarArr) {
        nq nqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (nqVarArr == null || (nqVar = nqVarArr[0]) == null) {
            if (nqVarArr == null || nqVarArr.length <= 0) {
                nqVar = new nq(i10, 0);
            } else {
                nqVar = new nq(i10, 0);
                nqVarArr[0] = nqVar;
            }
        }
        if (z10) {
            f7 *= 0.33f;
        } else {
            nqVar.recolorDrawable = false;
        }
        nqVar.setScale(f7, f7);
        spannableString.setSpan(nqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static s01 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final m4.e0 e0Var = new m4.e0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        e0Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new s01(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: zh.f6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        e0Var.run();
                        break;
                    default:
                        e0Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: zh.f6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        e0Var.run();
                        break;
                    default:
                        e0Var.run();
                        break;
                }
            }
        }), 1);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a4.a.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void b1(x9 x9Var, ImageReceiver imageReceiver, long j3) {
        Y0(x9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static s01 c1(x9 x9Var, ImageReceiver imageReceiver, int i10) {
        return Y0(x9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(x9 x9Var, ImageReceiver imageReceiver, long j3) {
        Y0(x9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = vl.i(1, context, f6Var, false);
        LinearLayout f7 = vl.f(context, 1);
        f7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.x5.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        x6 x6Var = new x6(context, 70, 0);
        frameLayout.addView(x6Var, w7.x5.c(-1.0f, -1));
        int i12 = 2;
        tg.e eVar = new tg.e(context, 1, 2);
        tg.a aVar = eVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        eVar.setStarParticlesView(x6Var);
        frameLayout.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        TextView textView = new TextView(context);
        vl.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), -6915073));
        h.setTextColor(-1);
        h.setTextSize(1, 11.33f);
        h.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        h.setGravity(17);
        h.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i13 = boost.multiplier;
        if (i13 == 0) {
            i13 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        nq nqVar = new nq(R.drawable.mini_boost_badge, 2);
        nqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        f7.addView(h, w7.x5.t(-2, 20, 17, 20, 4, 20, 4));
        oz0 oz0Var = new oz0(context, f6Var);
        oz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j3, new u5(f3VarArr, j3, i12));
        oz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            yh.o0 o0Var = new yh.o0(f3VarArr, j3, boost, 3);
            f3VarArr = f3VarArr;
            oz0Var.g(string, string2, o0Var);
        }
        oz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        oz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f7.addView(oz0Var, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        d90 d90Var = new d90(context, f6Var);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ei.a(context, 9)));
        d90Var.setGravity(17);
        f7.addView(d90Var, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        di.d dVar = new di.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new z5(f3VarArr, 1));
        f7.addView(dVar, w7.x5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = f7;
        f3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        eVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new m2(eVar, 5));
    }

    public static i0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        zf.b bVar = zf.b.a;
        i0 i0Var = new i0(context, f6Var, i10, tL_starGiftUnique == null ? zf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(zf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new oj0(21, callback2, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void g1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        org.telegram.ui.ActionBar.f3 i10 = vl.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        linearLayout.addView(textView, w7.x5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        zc0 zc0Var = new zc0(context, f6Var);
        zc0Var.setForceForceUseCenter(true);
        zc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        zc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        di.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        int i12 = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new fi.w1(zc0Var, editTextBoldCursor, i12));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.x5.o(-1, -2, 1.0f, 119));
        zc0Var.e(editTextBoldCursor);
        zc0Var.addView(linearLayout2, w7.x5.e(-1, -2, 48));
        linearLayout.addView(zc0Var, w7.x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        zc0Var.addView(textView2, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        d90 d90Var = new d90(context, null);
        d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ei.a(context, 10)), true));
        d90Var.setTextSize(1, 12.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        linearLayout.addView(d90Var, w7.x5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final di.d g10 = vl.g(24, context, f6Var, true);
        g10.g(LocaleController.getString(j3 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(g10, w7.x5.n(-1, 48));
        if (j3 > 0 && z10) {
            dVar = vl.g(24, context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i10.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {i10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new w6(editTextBoldCursor, zc0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zh.h6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                if (i13 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new j6(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new i6(zArr, callback2, editTextBoldCursor, g10, f3VarArr2));
        if (dVar != null) {
            di.d dVar2 = dVar;
            i6 i6Var = new i6(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(i6Var);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new bi.r4(editTextBoldCursor, 13));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new j6(f3VarArr, editTextBoldCursor), R instanceof co ? ((co) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0601, code lost:
    
        if (org.telegram.messenger.ChatObject.canUserDoAction(org.telegram.messenger.MessagesController.getInstance(r2).getChat(java.lang.Long.valueOf(-r6)), 2) != false) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x103f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x109c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x10d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10f2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x108a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e7d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0eb4 A[LOOP:0: B:66:0x0e28->B:75:0x0eb4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ec0 A[EDGE_INSN: B:76:0x0ec0->B:77:0x0ec0 BREAK  A[LOOP:0: B:66:0x0e28->B:75:0x0eb4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f3a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f4f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f5e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0fc1  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f3 h1(final Context context, final boolean z10, final long j3, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Peer peer;
        String str2;
        long j11;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.f3[] f3VarArr2;
        float f7;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.f3[] f3VarArr3;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.f3[] f3VarArr4;
        Context context3;
        int i14;
        oz0 oz0Var;
        final org.telegram.ui.ActionBar.f3[] f3VarArr5;
        oz0 oz0Var2;
        oz0 oz0Var3;
        oz0 oz0Var4;
        oz0 oz0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.n2 U;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        oz0 oz0Var6;
        final int i16;
        oz0 oz0Var7;
        final org.telegram.ui.ActionBar.f3[] f3VarArr6;
        long j12;
        oz0 oz0Var8;
        long j13;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup2;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i17 = starsTransaction.flags;
        boolean z16 = (i17 & 8192) != 0;
        boolean z17 = ((131072 & i17) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i17 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context, f6Var, false, false);
        f3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.f3[] f3VarArr7 = new org.telegram.ui.ActionBar.f3[1];
        final LinearLayout f10 = vl.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                f3VarArr = f3VarArr7;
                f3Var = f3Var2;
                b7 b7Var = new b7(context, matrix, radialGradient, paint, o5Var);
                o5Var.l(b7Var);
                o5Var.i(stargiftattributepattern.document, false);
                b7Var.setOrientation(1);
                x9 x9Var = new x9(context);
                a1(x9Var.getImageReceiver(), starsTransaction.stargift, 160);
                b7Var.addView(x9Var, w7.x5.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    w7.z5.a(x9Var);
                    x9Var.setOnClickListener(new ua(context, i10, tL_starGiftUnique, 21));
                }
                TextView b10 = w7.b6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                b7Var.addView(b10, w7.x5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.b6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                b7Var.addView(b11, w7.x5.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.b6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(T0(starsAmount3, TextUtils.concat(positive ? "+" : "", I0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                b7Var.addView(b12, w7.x5.t(-2, -2, 17, 0, 11, 0, 17));
                f10.addView(b7Var, w7.x5.n(-1, -2));
                f6Var2 = f6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f10;
                str = "";
                z12 = z18;
                f3VarArr2 = f3VarArr;
                f7 = 16.0f;
                oz0 oz0Var9 = new oz0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            ad adVar = (ad) ((lz0) oz0Var9.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            s5.w(i10).M(tL_inputSavedStarGiftUser, new gi.m0(adVar, i10, context5, f6Var2, 4));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable u5Var = new u5(f3VarArr2, peerDialogId, 1);
                            i14 = i10;
                            oz0 oz0Var10 = oz0Var9;
                            org.telegram.ui.ActionBar.f3[] f3VarArr8 = f3VarArr2;
                            f6Var3 = f6Var;
                            oz0Var10.k(string2, i14, peerDialogId, u5Var);
                            context3 = context;
                            viewGroup = viewGroup2;
                            f3VarArr4 = f3VarArr8;
                            oz0Var5 = oz0Var10;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction4.flags & 256) == 0) {
                                z14 = z15;
                            } else {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j3;
                                }
                                TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat != null) {
                                    d90 d90Var = new d90(context3, f6Var3);
                                    d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    d90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i18 = org.telegram.ui.ActionBar.j6.gc;
                                    d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var3));
                                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var3));
                                    d90Var.setTextSize(1, 14.0f);
                                    d90Var.setDisablePaddingsOffsetY(true);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                                    if (starsTransaction4.extended_media.isEmpty()) {
                                        z14 = z15;
                                    } else {
                                        ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                                        int size = arrayList.size();
                                        z14 = z15;
                                        int i19 = 0;
                                        int i20 = 0;
                                        while (i19 < size) {
                                            TLRPC.MessageMedia messageMedia = arrayList.get(i19);
                                            int i21 = i19 + 1;
                                            TLRPC.MessageMedia messageMedia2 = messageMedia;
                                            ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                            int i22 = size;
                                            x70 x70Var = new x70(d90Var, 24.0f, i14);
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                i15 = i20;
                                                forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                            } else {
                                                i15 = i20;
                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                                    forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                                } else {
                                                    imageLocation2 = null;
                                                    if (imageLocation2 == null) {
                                                        x70Var.a(6.0f);
                                                        x70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                                        SpannableString spannableString = new SpannableString("x");
                                                        spannableString.setSpan(x70Var, 0, spannableString.length(), 33);
                                                        spannableStringBuilder2.append((CharSequence) spannableString);
                                                        spannableStringBuilder2.append((CharSequence) " ");
                                                        i20 = i15 + 1;
                                                    } else {
                                                        i20 = i15;
                                                    }
                                                    if (i20 < 3) {
                                                        break;
                                                    }
                                                    i19 = i21;
                                                    size = i22;
                                                    arrayList = arrayList2;
                                                }
                                            }
                                            imageLocation2 = forDocument2;
                                            if (imageLocation2 == null) {
                                            }
                                            if (i20 < 3) {
                                            }
                                        }
                                    }
                                    spannableStringBuilder2.append((CharSequence) " ");
                                    int length = spannableStringBuilder2.length();
                                    String publicUsername = ChatObject.getPublicUsername(chat);
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        a4.a.z(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                                        sb2.append(starsTransaction4.msg_id);
                                        spannableStringBuilder2.append((CharSequence) sb2.toString());
                                    }
                                    v5 v5Var = new v5(f3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new r6(v5Var), length, spannableStringBuilder2.length(), 33);
                                    d90Var.setSingleLine(true);
                                    d90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    d90Var.setText(spannableStringBuilder2);
                                    d90Var.setOnClickListener(new ji.m4(v5Var, 27));
                                    oz0Var5.i(d90Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                } else {
                                    z14 = z15;
                                }
                            }
                            if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                String str3 = starsTransaction4.id;
                                oz0Var5.h(string3, str3, str3.length() <= 25 ? 9 : 10, new q5(1, f3VarArr4, f6Var3));
                            }
                            if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                oz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                                if (starGift2.limited) {
                                    F0(oz0Var5, i14, starGift2, f6Var3);
                                }
                                if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                    oz0Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                }
                            }
                            ViewGroup viewGroup3 = viewGroup;
                            viewGroup3.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                                oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                            }
                            if (z14) {
                                context4 = context;
                            } else {
                                context4 = context;
                                d90 d90Var2 = new d90(context4, f6Var3);
                                d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var3));
                                d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var3));
                                d90Var2.setTextSize(1, 14.0f);
                                d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ei.a(context4, 6)));
                                d90Var2.setGravity(17);
                                viewGroup3.addView(d90Var2, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                            }
                            di.d dVar = new di.d(context4, f6Var3);
                            dVar.e();
                            if ((starsTransaction4.flags & 32) != 0) {
                                dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                            } else {
                                dVar.h(LocaleController.getString(R.string.OK));
                            }
                            viewGroup3.addView(dVar, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                            f3Var3.customView = viewGroup3;
                            int i23 = 0;
                            f3VarArr4[0] = f3Var3;
                            f3Var3.useBackgroundTopPadding = false;
                            if ((starsTransaction4.flags & 32) != 0) {
                                dVar.setOnClickListener(new w(context4, starsTransaction4));
                            } else {
                                dVar.setOnClickListener(new z5(f3VarArr4, i23));
                            }
                            f3VarArr4[0].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr4[0].makeAttached(U);
                            }
                            f3VarArr4[0].show();
                            return f3VarArr4[0];
                        }
                        org.telegram.ui.ActionBar.f3[] f3VarArr9 = f3VarArr2;
                        i14 = i10;
                        f6Var3 = f6Var;
                        oz0Var6 = oz0Var9;
                        viewGroup = viewGroup2;
                        f3VarArr4 = f3VarArr9;
                    } else {
                        f3VarArr5 = f3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        f6Var3 = f6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                oz0Var9.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new ai0(context6, i10, str4, 19));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        oz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        oz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j12 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    oz0Var9.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j12 = peerDialogId3;
                                } else {
                                    oz0Var9.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j12 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                oz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j12 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                oz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j12 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j14 = peerDialogId3;
                                final int i24 = 0;
                                oz0Var8 = oz0Var9;
                                viewGroup = linearLayout;
                                j13 = clientUserId;
                                oz0Var8.k(LocaleController.getString(R.string.Gift2From), i10, j14, new Runnable() { // from class: zh.a6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j15 = j14;
                                                    Bundle e7 = w.f.e(j15, "user_id");
                                                    if (j15 == clientUserId) {
                                                        e7.putBoolean("my_profile", true);
                                                    }
                                                    e7.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(e7, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j16 = j14;
                                                    Bundle e10 = w.f.e(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        e10.putBoolean("my_profile", true);
                                                    }
                                                    e10.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(e10, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                oz0Var8 = oz0Var9;
                                j13 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j12 != j13) {
                                final long j15 = j13;
                                final int i25 = 1;
                                final long j16 = j12;
                                oz0Var8.k(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() { // from class: zh.a6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j152 = j16;
                                                    Bundle e7 = w.f.e(j152, "user_id");
                                                    if (j152 == j15) {
                                                        e7.putBoolean("my_profile", true);
                                                    }
                                                    e7.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(e7, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j162 = j16;
                                                    Bundle e10 = w.f.e(j162, "user_id");
                                                    if (j162 == j15) {
                                                        e10.putBoolean("my_profile", true);
                                                    }
                                                    e10.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(e10, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            oz0 oz0Var11 = oz0Var8;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    nq[] nqVarArr = new nq[1];
                                    oz0Var11.d(W0(starsTransaction4.amount, "⭐️ " + ((Object) I0(tL_starsTonAmount)), nqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    nq nqVar = nqVarArr[0];
                                    if (nqVar != null) {
                                        nqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var3));
                                    }
                                } else {
                                    oz0Var11.d(X0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, i2.g.k(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            oz0Var4 = oz0Var11;
                            context3 = context6;
                            f3VarArr4 = f3VarArr5;
                            oz0Var = oz0Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                oz0Var6 = oz0Var9;
                                f3VarArr4 = f3VarArr5;
                            } else {
                                long clientUserId2 = j3 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j3;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable v5Var2 = new v5(f3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i26 = 0;
                                        i16 = i10;
                                        Runnable runnable = new Runnable() { // from class: zh.y5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i26) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var4);
                                                        new yh.p1(context6, i16, peerDialogId4, null, new org.telegram.ui.web.b1(f3Var4, 25)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var5);
                                                        new yh.p1(context6, i16, peerDialogId4, null, new org.telegram.ui.web.b1(f3Var5, 25)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        oz0 oz0Var12 = oz0Var9;
                                        f3VarArr6 = f3VarArr5;
                                        oz0Var12.j(string4, i16, peerDialogId4, v5Var2, string5, runnable);
                                        oz0Var7 = oz0Var12;
                                    } else {
                                        i16 = i10;
                                        oz0Var7 = oz0Var9;
                                        f3VarArr6 = f3VarArr5;
                                    }
                                    final int i27 = 1;
                                    oz0Var7.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: zh.w5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        U3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle3.putBoolean("my_profile", true);
                                                        bundle3.putBoolean("open_gifts", true);
                                                        U4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    f3VarArr3 = f3VarArr6;
                                    oz0Var3 = oz0Var7;
                                } else {
                                    long j17 = clientUserId2;
                                    if (peerDialogId4 != j17) {
                                        final int i28 = 2;
                                        oz0Var9.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() { // from class: zh.w5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i28) {
                                                    case 0:
                                                        f3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            Bundle bundle = new Bundle();
                                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                            bundle.putBoolean("my_profile", true);
                                                            U2.presentFragment(new ProfileActivity(bundle, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        f3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                            bundle2.putBoolean("my_profile", true);
                                                            bundle2.putBoolean("open_gifts", true);
                                                            U3.presentFragment(new ProfileActivity(bundle2, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                            bundle3.putBoolean("my_profile", true);
                                                            bundle3.putBoolean("open_gifts", true);
                                                            U4.presentFragment(new ProfileActivity(bundle3, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    CharSequence string6 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                    Runnable v5Var3 = new v5(f3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i29 = 1;
                                    oz0 oz0Var13 = oz0Var9;
                                    f3VarArr3 = f3VarArr5;
                                    oz0Var13.j(string6, i10, peerDialogId4, v5Var3, string7, new Runnable() { // from class: zh.y5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var4);
                                                    new yh.p1(context, i10, peerDialogId4, null, new org.telegram.ui.web.b1(f3Var4, 25)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var5);
                                                    new yh.p1(context, i10, peerDialogId4, null, new org.telegram.ui.web.b1(f3Var5, 25)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    oz0Var3 = oz0Var13;
                                }
                                org.telegram.ui.ActionBar.f3[] f3VarArr10 = f3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                f3VarArr4 = f3VarArr10;
                                context3 = context;
                                i14 = i10;
                                oz0Var = oz0Var3;
                            }
                        }
                    }
                    context3 = context;
                    oz0Var5 = oz0Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                        String string32 = LocaleController.getString(R.string.StarsTransactionID);
                        String str32 = starsTransaction4.id;
                        oz0Var5.h(string32, str32, str32.length() <= 25 ? 9 : 10, new q5(1, f3VarArr4, f6Var3));
                    }
                    if (starsTransaction4.floodskip) {
                        oz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                    }
                    oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32 = viewGroup;
                    viewGroup32.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    di.d dVar2 = new di.d(context4, f6Var3);
                    dVar2.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup32.addView(dVar2, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var32 = f3Var;
                    f3Var32.customView = viewGroup32;
                    int i232 = 0;
                    f3VarArr4[0] = f3Var32;
                    f3Var32.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr4[0].makeAttached(U);
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                oz0 oz0Var14 = oz0Var9;
                f3VarArr3 = f3VarArr2;
                f6Var3 = f6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    starsTransaction4 = starsTransaction3;
                    f3VarArr4 = f3VarArr3;
                    context3 = context;
                    i14 = i10;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            d90 d90Var3 = new d90(context3, f6Var3);
                            d90Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            d90Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i30 = org.telegram.ui.ActionBar.j6.gc;
                            d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i30, f6Var3));
                            d90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i30, f6Var3));
                            d90Var3.setTextSize(1, 14.0f);
                            d90Var3.setSingleLine(true);
                            d90Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(d90Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            oq a2 = p7.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f7);
                            int dp2 = AndroidUtilities.dp(f7);
                            a2.e = dp;
                            a2.f = dp2;
                            g5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(g5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new q6(f3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            d90Var3.setText(spannableStringBuilder3);
                            oz0Var14.i(d90Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            oz0Var5 = oz0Var14;
                        } else {
                            oz0Var14.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            oz0Var5 = oz0Var14;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        oz0Var14.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        oz0Var5 = oz0Var14;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        oz0Var14.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        oz0Var5 = oz0Var14;
                    } else {
                        oz0Var5 = oz0Var14;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            oz0Var14.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            oz0Var5 = oz0Var14;
                        }
                    }
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    di.d dVar22 = new di.d(context4, f6Var3);
                    dVar22.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup322.addView(dVar22, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var322 = f3Var;
                    f3Var322.customView = viewGroup322;
                    int i2322 = 0;
                    f3VarArr4[0] = f3Var322;
                    f3Var322.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                if (starsTransaction3.paid_message) {
                    oz0Var14.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new u5(f3VarArr3, peerDialogId5, 3));
                    oz0Var3 = oz0Var14;
                    if (starsTransaction3.starref_amount != null) {
                        oz0Var3 = oz0Var14;
                        if (starsTransaction3.starref_commission_permille > 0) {
                            oz0Var14.d(X0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, i2.g.k(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            oz0Var3 = oz0Var14;
                        }
                    }
                } else {
                    if (z11) {
                        long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                        oz0Var14.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new u5(f3VarArr3, j3, 4));
                        oz0Var14.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId6, new u5(f3VarArr3, peerDialogId6, 5));
                        i14 = i10;
                        oz0Var14.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new u5(f3VarArr3, peerDialogId5, 6));
                        oz0Var2 = oz0Var14;
                        oz0Var2.d(fi.m.G0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                        starsTransaction4 = starsTransaction3;
                        f3VarArr4 = f3VarArr3;
                        context3 = context;
                    } else if (z12) {
                        oz0Var14.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new bi.i0(i10, context, j3, peerDialogId5, f3VarArr3, f6Var3));
                        oz0 oz0Var15 = oz0Var14;
                        oz0Var15.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i10, peerDialogId5, new u5(f3VarArr3, peerDialogId5, 0));
                        oz0Var3 = oz0Var15;
                    } else if (z19) {
                        oz0Var14.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new v5(f3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i31 = 0;
                        oz0Var14.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: zh.w5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i31) {
                                    case 0:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                        if (U2 != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle.putBoolean("my_profile", true);
                                            U2.presentFragment(new ProfileActivity(bundle, null));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                        if (U3 != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle2.putBoolean("my_profile", true);
                                            bundle2.putBoolean("open_gifts", true);
                                            U3.presentFragment(new ProfileActivity(bundle2, null));
                                            break;
                                        }
                                        break;
                                    default:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle3.putBoolean("my_profile", true);
                                            bundle3.putBoolean("open_gifts", true);
                                            U4.presentFragment(new ProfileActivity(bundle3, null));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        oz0Var2 = oz0Var14;
                        String string9 = LocaleController.getString(R.string.StarGiveawayReason);
                        String string10 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                        Runnable v5Var4 = new v5(f3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        oz0Var2.g(string9, string10, v5Var4);
                        oz0Var2.d(L0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        context3 = context;
                        i14 = i10;
                        f3VarArr4 = f3VarArr3;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i32 = 1;
                                oz0Var14.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: zh.x5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j18 = peerDialogId5;
                                                if (!UserObject.isService(j18)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(co.R9(j18));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(co.R9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(co.R9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                oz0Var14.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i33 = 2;
                                f3VarArr4 = f3VarArr3;
                                oz0 oz0Var16 = oz0Var14;
                                context3 = context;
                                i14 = i10;
                                oz0Var16.k(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: zh.x5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i33) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j18 = peerDialogId5;
                                                if (!UserObject.isService(j18)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(co.R9(j18));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(co.R9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(co.R9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                oz0Var = oz0Var16;
                            }
                            i14 = i10;
                            oz0Var = oz0Var14;
                            f3VarArr4 = f3VarArr3;
                            context3 = context;
                        } else {
                            final int i34 = 0;
                            f3VarArr5 = f3VarArr3;
                            oz0 oz0Var17 = oz0Var14;
                            i14 = i10;
                            oz0Var17.k(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: zh.x5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i34) {
                                        case 0:
                                            f3VarArr3[0].dismiss();
                                            long j18 = peerDialogId5;
                                            if (!UserObject.isService(j18)) {
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(co.R9(j18));
                                                    break;
                                                }
                                            } else {
                                                of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            f3VarArr3[0].dismiss();
                                            long j19 = peerDialogId5;
                                            if (!UserObject.isService(j19)) {
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    U3.presentFragment(co.R9(j19));
                                                    break;
                                                }
                                            } else {
                                                of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        default:
                                            f3VarArr3[0].dismiss();
                                            long j20 = peerDialogId5;
                                            if (!UserObject.isService(j20)) {
                                                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    U4.presentFragment(co.R9(j20));
                                                    break;
                                                }
                                            } else {
                                                of.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            context3 = context;
                            oz0Var4 = oz0Var17;
                            f3VarArr4 = f3VarArr5;
                            oz0Var = oz0Var4;
                        }
                    }
                    oz0Var = oz0Var2;
                }
                org.telegram.ui.ActionBar.f3[] f3VarArr102 = f3VarArr3;
                starsTransaction4 = starsTransaction3;
                f3VarArr4 = f3VarArr102;
                context3 = context;
                i14 = i10;
                oz0Var = oz0Var3;
                oz0Var5 = oz0Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222 = viewGroup;
                viewGroup3222.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                di.d dVar222 = new di.d(context4, f6Var3);
                dVar222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup3222.addView(dVar222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var3222 = f3Var;
                f3Var3222.customView = viewGroup3222;
                int i23222 = 0;
                f3VarArr4[0] = f3Var3222;
                f3Var3222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
        }
        f3Var = f3Var2;
        f3VarArr = f3VarArr7;
        z11 = z17;
        final x9 x9Var2 = new x9(context);
        if (starsTransaction.premium_gift) {
            c1(x9Var2, x9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f10.addView(x9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            oq a10 = org.telegram.ui.Cells.u6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            x9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f10;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j10 = j3;
                    f6Var2 = f6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(x9Var2, x9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(x9Var2, x9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(x9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f10;
                    z13 = z10;
                    j10 = j3;
                    f6Var2 = f6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            x9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            x9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            x9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j11 = j10;
                                i9 i9Var = new i9();
                                if (j11 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                                    i9Var.r(user2);
                                    x9Var2.e(user2, i9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                                    i9Var.q(chat2);
                                    x9Var2.e(chat2, i9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j11 = DialogObject.getPeerDialogId(peer);
                            i9 i9Var2 = new i9();
                            if (j11 < 0) {
                            }
                        }
                        linearLayout.addView(x9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        oq a11 = org.telegram.ui.Cells.u6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        x9Var2.setImageDrawable(a11);
                    }
                } else {
                    x9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        x9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        f10.addView(x9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zh.t5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction5.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j18 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j18;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j18;
                                    tL_message.date = starsTransaction5.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new c7(x9Var2, f10, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        f6Var2 = f6Var;
                        i11 = i10;
                        linearLayout = f10;
                        j10 = j3;
                        x9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    x9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    f10.addView(x9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: zh.t5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction5.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j18 = -peerDialogId7;
                                tL_peerChannel.channel_id = j18;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j18;
                                tL_message.date = starsTransaction5.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new c7(x9Var2, f10, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    f6Var2 = f6Var;
                    i11 = i10;
                    linearLayout = f10;
                    j10 = j3;
                    x9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.j6.j5;
                vl.x(i12, f6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i11, z13, starsTransaction2));
                TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                h.setTextSize(1, 18.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                h.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(h.getText());
                if (!starsTransaction2.refund) {
                    G0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var2));
                    G0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yj, f6Var2));
                    G0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsPending));
                }
                h.setText(spannableStringBuilder4);
                linearLayout.addView(h, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    d90 d90Var4 = new d90(context2);
                    d90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    d90Var4.setTextSize(1, 14.0f);
                    d90Var4.setGravity(17);
                    d90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    d90Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, fi.m.G0(1000 - starsTransaction2.starref_commission_permille))));
                    int i35 = j10 != UserConfig.getInstance(i11).getClientUserId() ? 2 : 2;
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new fi.b2(j10, i11, i35)), true));
                    d90Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(d90Var4, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    oz0 oz0Var92 = new oz0(context2, f6Var2);
                    starGift = starsTransaction2.stargift;
                    if (starGift == null) {
                    }
                    oz0Var5 = oz0Var;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32222 = viewGroup;
                    viewGroup32222.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    di.d dVar2222 = new di.d(context4, f6Var3);
                    dVar2222.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup32222.addView(dVar2222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var32222 = f3Var;
                    f3Var32222.customView = viewGroup32222;
                    int i232222 = 0;
                    f3VarArr4[0] = f3Var32222;
                    f3Var32222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        h.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    d90 d90Var5 = new d90(context2);
                    d90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    f7 = 16.0f;
                    d90Var5.setTextSize(i13, 16.0f);
                    d90Var5.setGravity(17);
                    d90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    d90Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i36 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i36, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    f3VarArr2 = f3VarArr;
                    d90Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new g41(context2, f3VarArr2)), true)));
                    linearLayout.addView(d90Var5, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        vl.n(i12, f6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                oz0 oz0Var922 = new oz0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                }
                oz0Var5 = oz0Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322222 = viewGroup;
                viewGroup322222.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                di.d dVar22222 = new di.d(context4, f6Var3);
                dVar22222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup322222.addView(dVar22222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var322222 = f3Var;
                f3Var322222.customView = viewGroup322222;
                int i2322222 = 0;
                f3VarArr4[0] = f3Var322222;
                f3Var322222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                x9Var2.setImageDrawable(new l3(x9Var2, starsTransaction.stargift, 94, 0.44f));
                f10.addView(x9Var2, w7.x5.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(x9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                f10.addView(x9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        f6Var2 = f6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = f10;
        str = "";
        z12 = z18;
        z13 = z10;
        j10 = j3;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.j6.j5;
        vl.x(i12, f6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i11, z13, starsTransaction2));
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout, textView3, w7.x5.t(-1, -2, 17, 36, 0, 36, 4), context2);
        h10.setTextSize(1, 18.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        h10.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(h10.getText());
        if (!starsTransaction2.refund) {
        }
        h10.setText(spannableStringBuilder42);
        linearLayout.addView(h10, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        f3VarArr2 = f3VarArr;
        f7 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            vl.n(i12, f6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
        }
        oz0 oz0Var9222 = new oz0(context2, f6Var2);
        starGift = starsTransaction2.stargift;
        if (starGift == null) {
        }
        oz0Var5 = oz0Var;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        oz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222222 = viewGroup;
        viewGroup3222222.addView(oz0Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        di.d dVar222222 = new di.d(context4, f6Var3);
        dVar222222.e();
        if ((starsTransaction4.flags & 32) != 0) {
        }
        viewGroup3222222.addView(dVar222222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.f3 f3Var3222222 = f3Var;
        f3Var3222222.customView = viewGroup3222222;
        int i23222222 = 0;
        f3VarArr4[0] = f3Var3222222;
        f3Var3222222.useBackgroundTopPadding = false;
        if ((starsTransaction4.flags & 32) != 0) {
        }
        f3VarArr4[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        f3VarArr4[0].show();
        return f3VarArr4[0];
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, f6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0510  */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x0(v7 v7Var, int i10) {
        h51 G;
        char c10;
        String str;
        x9 x9Var;
        final boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        int i12;
        TL_stars.StarsSubscription starsSubscription;
        oz0 oz0Var;
        int i13;
        boolean z12;
        String str2;
        boolean z13;
        final TL_stars.StarsSubscription starsSubscription2;
        long currentTime;
        s6 s6Var;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2;
        ?? r72;
        int i14;
        org.telegram.ui.ActionBar.n2 U;
        y6 y6Var = v7Var.g0;
        if (y6Var == null || (G = y6Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            v7Var.g0.N(true);
            return;
        }
        if (i15 == -2) {
            s5.y(v7Var.currentAccount, false).u();
            ug.n1.e0(1, BirthdayController.getInstance(v7Var.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            s5.y(v7Var.currentAccount, false).W();
            v7Var.g0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(v7Var.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(v7Var.currentAccount);
                return;
            } else {
                v7Var.presentFragment(new fi.e4(v7Var.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 24;
        if (G.G(h7.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                s5.y(v7Var.currentAccount, false).f(v7Var.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new bi.f0(i16, v7Var, G), null);
                return;
            }
            return;
        }
        if (G.G(m7.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = v7Var.getParentActivity();
            int i17 = v7Var.currentAccount;
            TL_stars.StarsSubscription starsSubscription3 = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.f6 resourceProvider = v7Var.getResourceProvider();
            if (starsSubscription3 == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, resourceProvider, false);
            f3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.f3[] f3VarArr3 = new org.telegram.ui.ActionBar.f3[1];
            LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
            f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f7.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            s6 s6Var2 = new s6(zArr, f3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(s6Var2, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription3.peer);
            x9 x9Var2 = new x9(parentActivity);
            if (peerDialogId >= 0) {
                c10 = 0;
                TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                String userName = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                x9Var = x9Var2;
                z11 = isBot;
                str = userName;
                chat = user;
            } else {
                c10 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                x9Var = x9Var2;
                z10 = false;
                z11 = false;
                chat = chat3;
            }
            if (starsSubscription3.photo != null) {
                x9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                x9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription3.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                x9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    f3VarArr = f3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    i9Var.q(chat4);
                    x9Var.e(chat4, i9Var);
                    frameLayout.addView(x9Var, w7.x5.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription3.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, w7.x5.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, w7.x5.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    vl.x(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription3.title)) {
                        textView.setText(starsSubscription3.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f7.addView(textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription3.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        int i18 = R.string.StarsSubscriptionPrice;
                        Object[] objArr = new Object[1];
                        objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        textView2.setText(X0(false, LocaleController.formatString(i18, objArr), 0.8f, null));
                        starsSubscription = starsSubscription3;
                    } else {
                        starsSubscription = starsSubscription3;
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f7.addView(textView2, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
                    oz0Var = new oz0(parentActivity, resourceProvider);
                    d90 d90Var = new d90(parentActivity, resourceProvider);
                    d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    d90Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.j6.gc;
                    d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                    d90Var.setTextSize(1, 14.0f);
                    d90Var.setSingleLine(true);
                    d90Var.setDisablePaddingsOffsetY(true);
                    int i20 = i11;
                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(d90Var, 24.0f, i20);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i20).getUser(Long.valueOf(peerDialogId));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        str2 = UserObject.getUserName(user2);
                        g5Var.e(user2);
                        i13 = i20;
                        z12 = z14;
                    } else {
                        i13 = i20;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i20).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat5 == null;
                        str2 = chat5 != null ? chat5.title : "";
                        g5Var.b(chat5);
                    }
                    z13 = z12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.f3[] f3VarArr4 = f3VarArr;
                    spannableStringBuilder.setSpan(new t6(f3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    d90Var.setText(spannableStringBuilder);
                    if (!z13) {
                        oz0Var.i(d90Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    starsSubscription2 = starsSubscription;
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription2.title)) {
                        oz0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription2.title, null, null);
                    }
                    oz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription2.until_date - starsSubscription2.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription2.until_date - starsSubscription2.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                    oz0Var.c(LocaleController.getString((!starsSubscription2.canceled || starsSubscription2.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription2.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription2.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription2.until_date * 1000))), null, null);
                    f7.addView(oz0Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    d90 d90Var2 = new d90(parentActivity, resourceProvider);
                    int i21 = org.telegram.ui.ActionBar.j6.z6;
                    d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                    d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                    final int i22 = 1;
                    d90Var2.setTextSize(1, 14.0f);
                    d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i23 = i22;
                            Activity activity = parentActivity;
                            switch (i23) {
                                case 0:
                                    if (activity.isFinishing()) {
                                        return;
                                    }
                                    Handler handler = g.g;
                                    Method method = g.f;
                                    int i24 = Build.VERSION.SDK_INT;
                                    if (i24 >= 28) {
                                        activity.recreate();
                                        return;
                                    }
                                    if (((i24 != 26 && i24 != 27) || method != null) && (g.e != null || g.d != null)) {
                                        try {
                                            Object obj2 = g.c.get(activity);
                                            if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                f fVar = new f(activity);
                                                application.registerActivityLifecycleCallbacks(fVar);
                                                handler.post(new i9.s(10, fVar, obj2));
                                                try {
                                                    if (i24 == 26 || i24 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new i9.s(11, application, fVar));
                                                    return;
                                                } finally {
                                                    handler.post(new i9.s(11, application, fVar));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity.recreate();
                                    return;
                                default:
                                    of.f.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    return;
                            }
                        }
                    }));
                    d90Var2.setGravity(17);
                    f7.addView(d90Var2, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime >= starsSubscription2.until_date) {
                        if (starsSubscription2.can_refulfill) {
                            d90 d90Var3 = new d90(parentActivity, resourceProvider);
                            d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                            d90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                            d90Var3.setTextSize(1, 14.0f);
                            d90Var3.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription2.until_date)));
                            d90Var3.setSingleLine(false);
                            d90Var3.setMaxLines(4);
                            d90Var3.setGravity(17);
                            f7.addView(d90Var3, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            di.d dVar = new di.d(parentActivity, resourceProvider, true);
                            dVar.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                            f7.addView(dVar, w7.x5.n(-1, 48));
                            f3VarArr2 = f3VarArr4;
                            dVar.setOnClickListener(new k6(dVar, i13, starsSubscription2, f3VarArr2, peerDialogId, parentActivity, resourceProvider, z10, str));
                        } else {
                            String str3 = str;
                            f3VarArr2 = f3VarArr4;
                            if (starsSubscription2.bot_canceled) {
                                d90 d90Var4 = new d90(parentActivity, resourceProvider);
                                d90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                                d90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                                d90Var4.setTextSize(1, 14.0f);
                                d90Var4.setText(LocaleController.getString(z10 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                                d90Var4.setSingleLine(false);
                                d90Var4.setMaxLines(4);
                                d90Var4.setGravity(17);
                                f7.addView(d90Var4, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            } else if (starsSubscription2.canceled) {
                                d90 d90Var5 = new d90(parentActivity, resourceProvider);
                                d90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                                d90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                                d90Var5.setTextSize(1, 14.0f);
                                d90Var5.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                                d90Var5.setSingleLine(false);
                                d90Var5.setMaxLines(4);
                                d90Var5.setGravity(17);
                                f7.addView(d90Var5, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                                if (starsSubscription2.chat_invite_hash != null || starsSubscription2.invoice_slug != null) {
                                    di.d dVar2 = new di.d(parentActivity, resourceProvider, true);
                                    dVar2.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                    f7.addView(dVar2, w7.x5.n(-1, 48));
                                    i14 = i13;
                                    dVar2.setOnClickListener(new fi.m3(dVar2, starsSubscription2, i14, f3VarArr2, chat2, str3));
                                    s6Var = s6Var2;
                                    r72 = 0;
                                    f3Var.customView = f7;
                                    f3VarArr2[r72] = f3Var;
                                    f3Var.useBackgroundTopPadding = r72;
                                    f3Var.setOnDismissListener(new rg.t(i14, s6Var));
                                    f3VarArr2[r72].fixNavigationBar();
                                    U = LaunchActivity.U();
                                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                        f3VarArr2[r72].makeAttached(U);
                                    }
                                    f3VarArr2[r72].show();
                                }
                            } else {
                                final TLRPC.Chat chat6 = chat2;
                                d90 d90Var6 = new d90(parentActivity, resourceProvider);
                                d90Var6.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                                d90Var6.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                                d90Var6.setTextSize(1, 14.0f);
                                s6Var = s6Var2;
                                d90Var6.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription2.until_date)));
                                d90Var6.setSingleLine(false);
                                d90Var6.setMaxLines(4);
                                d90Var6.setGravity(17);
                                f7.addView(d90Var6, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                                final di.d dVar3 = new di.d(parentActivity, resourceProvider, false);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                                dVar3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                                f7.addView(dVar3, w7.x5.n(-1, 48));
                                final int i23 = i13;
                                dVar3.setOnClickListener(new View.OnClickListener() { // from class: zh.l6
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final di.d dVar4 = dVar3;
                                        if (dVar4.N) {
                                            return;
                                        }
                                        dVar4.setLoading(true);
                                        TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                        tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                        tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                        final TL_stars.StarsSubscription starsSubscription4 = starsSubscription2;
                                        tL_changeStarsSubscription.subscription_id = starsSubscription4.id;
                                        final int i24 = i23;
                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i24);
                                        final TLObject tLObject = chat6;
                                        final boolean z15 = z10;
                                        final boolean z16 = z11;
                                        final org.telegram.ui.ActionBar.f3[] f3VarArr5 = f3VarArr2;
                                        connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: zh.n6
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                                AndroidUtilities.runOnUIThread(new gj(i24, dVar4, tLObject, starsSubscription4, z15, z16, f3VarArr5));
                                            }
                                        });
                                    }
                                });
                            }
                        }
                        s6Var = s6Var2;
                    } else {
                        s6Var = s6Var2;
                        f3VarArr2 = f3VarArr4;
                        d90 d90Var7 = new d90(parentActivity, resourceProvider);
                        d90Var7.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                        d90Var7.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                        d90Var7.setTextSize(1, 14.0f);
                        d90Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription2.until_date)));
                        d90Var7.setSingleLine(false);
                        d90Var7.setMaxLines(4);
                        d90Var7.setGravity(17);
                        f7.addView(d90Var7, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription2.chat_invite_hash != null || starsSubscription2.invoice_slug != null) {
                            di.d dVar4 = new di.d(parentActivity, resourceProvider, true);
                            dVar4.setRoundRadius(24);
                            r72 = 0;
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f7.addView(dVar4, w7.x5.n(-1, 48));
                            i14 = i13;
                            dVar4.setOnClickListener(new fu(dVar4, starsSubscription2, i14, f3VarArr2, resourceProvider, zArr, parentActivity));
                            f3Var.customView = f7;
                            f3VarArr2[r72] = f3Var;
                            f3Var.useBackgroundTopPadding = r72;
                            f3Var.setOnDismissListener(new rg.t(i14, s6Var));
                            f3VarArr2[r72].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet()) {
                                f3VarArr2[r72].makeAttached(U);
                            }
                            f3VarArr2[r72].show();
                        }
                    }
                    i14 = i13;
                    r72 = 0;
                    f3Var.customView = f7;
                    f3VarArr2[r72] = f3Var;
                    f3Var.useBackgroundTopPadding = r72;
                    f3Var.setOnDismissListener(new rg.t(i14, s6Var));
                    f3VarArr2[r72].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr2[r72].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                i9Var.r(user3);
                x9Var.e(user3, i9Var);
            }
            i11 = i17;
            f3VarArr = f3VarArr3;
            frameLayout.addView(x9Var, w7.x5.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription3.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            vl.x(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription3.title)) {
            }
            f7.addView(textView3, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription3.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f7.addView(textView22, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
            oz0Var = new oz0(parentActivity, resourceProvider);
            d90 d90Var8 = new d90(parentActivity, resourceProvider);
            d90Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            d90Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.j6.gc;
            d90Var8.setTextColor(org.telegram.ui.ActionBar.j6.v0(i192, resourceProvider));
            d90Var8.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i192, resourceProvider));
            d90Var8.setTextSize(1, 14.0f);
            d90Var8.setSingleLine(true);
            d90Var8.setDisablePaddingsOffsetY(true);
            int i202 = i11;
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(d90Var8, 24.0f, i202);
            if (peerDialogId < 0) {
            }
            z13 = z12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(g5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.f3[] f3VarArr42 = f3VarArr;
            spannableStringBuilder2.setSpan(new t6(f3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            d90Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            starsSubscription2 = starsSubscription;
            if (peerDialogId >= 0) {
                oz0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription2.title, null, null);
            }
            oz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription2.until_date - starsSubscription2.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription2.until_date - starsSubscription2.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
            oz0Var.c(LocaleController.getString((!starsSubscription2.canceled || starsSubscription2.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription2.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription2.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription2.until_date * 1000))), null, null);
            f7.addView(oz0Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            d90 d90Var22 = new d90(parentActivity, resourceProvider);
            int i212 = org.telegram.ui.ActionBar.j6.z6;
            d90Var22.setTextColor(org.telegram.ui.ActionBar.j6.v0(i212, resourceProvider));
            d90Var22.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i192, resourceProvider));
            final int i222 = 1;
            d90Var22.setTextSize(1, 14.0f);
            d90Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i232 = i222;
                    Activity activity = parentActivity;
                    switch (i232) {
                        case 0:
                            if (activity.isFinishing()) {
                                return;
                            }
                            Handler handler = g.g;
                            Method method = g.f;
                            int i24 = Build.VERSION.SDK_INT;
                            if (i24 >= 28) {
                                activity.recreate();
                                return;
                            }
                            if (((i24 != 26 && i24 != 27) || method != null) && (g.e != null || g.d != null)) {
                                try {
                                    Object obj2 = g.c.get(activity);
                                    if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                        Application application = activity.getApplication();
                                        f fVar = new f(activity);
                                        application.registerActivityLifecycleCallbacks(fVar);
                                        handler.post(new i9.s(10, fVar, obj2));
                                        try {
                                            if (i24 == 26 || i24 == 27) {
                                                Boolean bool = Boolean.FALSE;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } else {
                                                activity.recreate();
                                            }
                                            handler.post(new i9.s(11, application, fVar));
                                            return;
                                        } finally {
                                            handler.post(new i9.s(11, application, fVar));
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity.recreate();
                            return;
                        default:
                            of.f.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            return;
                    }
                }
            }));
            d90Var22.setGravity(17);
            f7.addView(d90Var22, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime >= starsSubscription2.until_date) {
            }
            i14 = i13;
            r72 = 0;
            f3Var.customView = f7;
            f3VarArr2[r72] = f3Var;
            f3Var.useBackgroundTopPadding = r72;
            f3Var.setOnDismissListener(new rg.t(i14, s6Var));
            f3VarArr2[r72].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            f3VarArr2[r72].show();
        }
    }

    public static void z0(v7 v7Var, h51 h51Var, Boolean bool, String str) {
        if (v7Var.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            yc.a0(v7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h51Var.B, new Object[0])), R.raw.stars_topup).j();
            v7Var.T.c(true);
            s5.y(v7Var.currentAccount, false).T(true);
        } else if (str != null) {
            i2.g.s(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(v7Var), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, v51 v51Var) {
        if (getParentActivity() == null) {
            return;
        }
        s5 y3 = s5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        eb ebVar = (eb) super.r0(getParentActivity());
        h51 h51Var = new h51(-2);
        h51Var.c = ebVar;
        arrayList.add(h51Var);
        arrayList.add(h51.k(this.U));
        di.d dVar = this.d0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(h51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(fi.i.a(-4, getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_earn_stars, xo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(h51.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.g.p(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = m7.a;
                h51 J = h51.J(m7.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(h51.o(arrayList.size(), 33));
            } else if (!y3.y) {
                h51 c10 = h51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(h51.B(null));
        }
        boolean O = y3.O(0);
        this.e0 = O;
        if (O) {
            arrayList.add(h51.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(h51.l(this.S));
        }
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new u7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new t50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        tg.e eVar = new tg.e(context, 1, 2);
        this.Q = eVar;
        tg.a aVar = eVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.x5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ei.a(context, 7)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new bi.d(this, 21));
        r00 r00Var = new r00(getParentActivity());
        this.T = r00Var;
        this.s.addView(r00Var, w7.x5.c(-1.0f, -1));
        s5 y3 = s5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        x70 x70Var = new x70(this.W, 42.0f, this.currentAccount);
        xi0 xi0Var = new xi0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = x70Var.b;
        imageReceiver.setImageBitmap(xi0Var);
        imageReceiver.setAutoRepeat(2);
        x70Var.f = false;
        x70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(x70Var, 0, 1, 33);
        this.U.addView(this.W, w7.x5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.resourceProvider));
        this.U.addView(this.X, w7.x5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        sg.l1 l1Var = new sg.l1(this, getParentActivity(), 3);
        this.Z = l1Var;
        frameLayout2.addView(l1Var);
        di.d dVar = new di.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar;
        dVar.e();
        this.a0.g("", false, true);
        final int i10 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.b6
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        v7.B0(this.b, context);
                        break;
                    default:
                        new l7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.Z.addView(this.a0, w7.x5.e(-1, 48, 119));
        cc1 cc1Var = new cc1(this, getParentActivity(), 20);
        this.b0 = cc1Var;
        frameLayout2.addView(cc1Var);
        di.d dVar2 = new di.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new nq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.c0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.b6
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        v7.B0(this.b, context);
                        break;
                    default:
                        new l7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.b0.addView(this.c0, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        di.d dVar3 = new di.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new nq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: zh.c6
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        v7 v7Var = this.b;
                        v7Var.presentFragment(new g(0, v7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        v7.A0(this.b);
                        break;
                }
            }
        });
        this.b0.addView(this.Y, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.x5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        di.d dVar4 = new di.d(getParentActivity(), this.resourceProvider, false);
        this.d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new nq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.d0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.c6
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        v7 v7Var = this.b;
                        v7Var.presentFragment(new g(0, v7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        v7.A0(this.b);
                        break;
                }
            }
        });
        this.U.addView(this.d0, w7.x5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        y6 y6Var = this.g0;
        if (y6Var != null) {
            y6Var.N(false);
        }
        o.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            y6 y6Var = this.g0;
            if (y6Var != null) {
                y6Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            s5 y3 = s5.y(this.currentAccount, false);
            if (this.e0 != y3.O(0)) {
                this.e0 = y3.O(0);
                s0();
                y6 y6Var2 = this.g0;
                if (y6Var2 != null) {
                    y6Var2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            y6 y6Var3 = this.g0;
            if (y6Var3 != null) {
                y6Var3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        s5 y3 = s5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) J0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        this.a0.g(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        this.f0 = z10;
        if (z11) {
            this.Z.setVisibility(0);
            this.b0.setVisibility(0);
            final int i10 = 0;
            this.Z.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: zh.d6
                public final /* synthetic */ v7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.Z.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.b0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: zh.d6
                public final /* synthetic */ v7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.b.Z.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.b0.animate().cancel();
        this.b0.setAlpha(z10 ? 1.0f : 0.0f);
        this.Z.setAlpha(z10 ? 0.0f : 1.0f);
        this.b0.setVisibility(z10 ? 0 : 8);
        this.Z.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.r20
    public final s4.h0 n0() {
        y6 y6Var = new y6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ii.a(this, 26), getResourceProvider());
        this.g0 = y6Var;
        y6Var.r = false;
        return y6Var;
    }

    @Override // org.telegram.ui.r20
    public final q20 o0() {
        return new ei.f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        s5.y(this.currentAccount, false).T(true);
        s5.y(this.currentAccount, false).S();
        s5.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        tg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        tg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.r20
    public final sg.z1 p0() {
        return new x6(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.r20
    public final boolean q0() {
        u7 u7Var = this.R;
        boolean z10 = false;
        if (u7Var != null && (u7Var.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.r20
    public final View r0(Context context) {
        throw null;
    }
}
