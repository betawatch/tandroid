package xh;

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
import bi.nc;
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
import org.telegram.messenger.em;
import org.telegram.messenger.pj;
import org.telegram.messenger.uc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fu;
import org.telegram.ui.gc1;
import org.telegram.ui.nj0;
import org.telegram.ui.r20;
import org.telegram.ui.s20;
import org.telegram.ui.t50;
import org.telegram.ui.uu0;
import org.telegram.ui.w70;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z7 extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat h0;
    public static DecimalFormat i0;
    public FrameLayout P;
    public rg.f Q;
    public y7 R;
    public t50 S;
    public y00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.o6 W;
    public TextView X;
    public bi.d Y;
    public a7 Z;
    public bi.d a0;
    public gc1 b0;
    public bi.d c0;
    public bi.d d0;
    public boolean e0;
    public boolean f0;
    public c7 g0;

    public z7() {
        this.M = true;
    }

    public static void A0(z7 z7Var) {
        v5.y(z7Var.currentAccount, false).u();
        sg.p1.e0(1, BirthdayController.getInstance(z7Var.currentAccount).getState());
    }

    public static /* synthetic */ void B0(z7 z7Var, Context context) {
        if (MessagesController.getInstance(z7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(z7Var.currentAccount);
        } else {
            new p7(context, z7Var.resourceProvider).show();
        }
    }

    public static void F0(b01 b01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((yz0) b01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        r90 r90Var = new r90(textView, AndroidUtilities.dp(90.0f), 0, f6Var);
        r90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(r90Var, 0, 1, 33);
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
        final v5 y3 = v5.y(i10, false);
        final long j3 = starGift.id;
        final org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(textView, 22);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: xh.e5
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                v5 v5Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (v5Var = v5.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(v5Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                y1Var.run(J);
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
            y1Var.run(J);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new y6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
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
            return LocaleController.formatString(R.string.StarTransactionCommission, di.m.G0(starsTransaction.starref_commission_permille));
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
        uq uqVar = new uq(R.drawable.diamond, 0);
        uqVar.recolorDrawable = false;
        uqVar.translate(0.0f, f10);
        uqVar.spaceScaleX = f11;
        uqVar.setScale(f7, f7);
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7, uq[] uqVarArr) {
        return U0(false, charSequence, f7, uqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f7, uq[] uqVarArr, float f10, float f11) {
        uq uqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            uqVar = new uq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (uqVarArr != null) {
                uqVarArr[0] = uqVar;
            }
        }
        uqVar.translate(0.0f, f10);
        uqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f7 * 0.2f;
            uqVar.setScale(f12, f12);
        } else {
            uqVar.setScale(f7, f7);
        }
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, uq[] uqVarArr) {
        uq uqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            uqVar = new uq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            uqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (uqVarArr != null) {
            uqVarArr[0] = uqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, uq[] uqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, uqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f7, uq[] uqVarArr) {
        uq uqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            if (uqVarArr == null || uqVarArr.length <= 0) {
                uqVar = new uq(i10, 0);
            } else {
                uqVar = new uq(i10, 0);
                uqVarArr[0] = uqVar;
            }
        }
        if (z10) {
            f7 *= 0.33f;
        } else {
            uqVar.recolorDrawable = false;
        }
        uqVar.setScale(f7, f7);
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static g11 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final m4.f0 f0Var = new m4.f0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        f0Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new g11(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: xh.i6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        f0Var.run();
                        break;
                    default:
                        f0Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: xh.i6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        f0Var.run();
                        break;
                    default:
                        f0Var.run();
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

    public static void b1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        Y0(w9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static g11 c1(w9 w9Var, ImageReceiver imageReceiver, int i10) {
        return Y0(w9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        Y0(w9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 i11 = em.i(1, context, f6Var, false);
        LinearLayout f7 = em.f(context, 1);
        f7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.a6.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        b7 b7Var = new b7(context, 70, 0);
        frameLayout.addView(b7Var, w7.a6.c(-1.0f, -1));
        int i12 = 2;
        rg.f fVar = new rg.f(context, 1, 2);
        rg.a aVar = fVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        fVar.setStarParticlesView(b7Var);
        frameLayout.addView(fVar, w7.a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        fVar.setPaused(false);
        TextView textView = new TextView(context);
        em.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g10.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), -6915073));
        g10.setTextColor(-1);
        g10.setTextSize(1, 11.33f);
        g10.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        g10.setGravity(17);
        g10.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i13 = boost.multiplier;
        if (i13 == 0) {
            i13 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        uq uqVar = new uq(R.drawable.mini_boost_badge, 2);
        uqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
        g10.setText(spannableStringBuilder);
        f7.addView(g10, w7.a6.t(-2, 20, 17, 20, 4, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        b01Var.k(LocaleController.getString(R.string.BoostFrom), i10, j3, new x5(h3VarArr, j3, i12));
        b01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.h0 h0Var = new a3.h0(h3VarArr, j3, boost, 27);
            h3VarArr = h3VarArr;
            b01Var.g(string, string2, h0Var);
        }
        b01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        b01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f7.addView(b01Var, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        m90 m90Var = new m90(context, f6Var);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setTextSize(1, 14.0f);
        int i14 = 9;
        m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ci.a(context, i14)));
        m90Var.setGravity(17);
        f7.addView(m90Var, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new c6(h3VarArr, 1));
        f7.addView(dVar, w7.a6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = f7;
        h3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            h3VarArr[0].makeAttached(U);
        }
        fVar.setPaused(false);
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new x(fVar, i14));
    }

    public static i0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        yf.b bVar = yf.b.a;
        i0 i0Var = new i0(context, f6Var, i10, tL_starGiftUnique == null ? yf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(yf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new nj0(21, callback2, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void g1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, f6Var, false);
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
        linearLayout.addView(textView, w7.a6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        hd0 hd0Var = new hd0(context, f6Var);
        hd0Var.setForceForceUseCenter(true);
        hd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        hd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        bi.d dVar = null;
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
        editTextBoldCursor.setOnFocusChangeListener(new di.z1(hd0Var, editTextBoldCursor, i12));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.a6.o(-1, -2, 1.0f, 119));
        hd0Var.e(editTextBoldCursor);
        hd0Var.addView(linearLayout2, w7.a6.e(-1, -2, 48));
        linearLayout.addView(hd0Var, w7.a6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        hd0Var.addView(textView2, w7.a6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        m90 m90Var = new m90(context, null);
        m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ci.a(context, 10)), true));
        m90Var.setTextSize(1, 12.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        linearLayout.addView(m90Var, w7.a6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final bi.d g10 = em.g(24, context, f6Var, true);
        g10.g(LocaleController.getString(j3 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(g10, w7.a6.n(-1, 48));
        if (j3 > 0 && z10) {
            dVar = em.g(24, context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.a6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i10.customView = linearLayout;
        final org.telegram.ui.ActionBar.h3[] h3VarArr2 = {i10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new z6(editTextBoldCursor, hd0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xh.k6
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new m6(editTextBoldCursor2, h3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new l6(zArr, callback2, editTextBoldCursor, g10, h3VarArr2));
        if (dVar != null) {
            bi.d dVar2 = dVar;
            l6 l6Var = new l6(zArr, callback2, dVar2, editTextBoldCursor, h3VarArr2);
            h3VarArr = h3VarArr2;
            dVar2.setOnClickListener(l6Var);
        } else {
            h3VarArr = h3VarArr2;
        }
        h3VarArr[0].fixNavigationBar();
        h3VarArr[0].setOnDismissListener(new gg.o(editTextBoldCursor, 11));
        h3VarArr[0].show();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new m6(h3VarArr, editTextBoldCursor), R instanceof eo ? ((eo) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x05ff, code lost:
    
        if (org.telegram.messenger.ChatObject.canUserDoAction(org.telegram.messenger.MessagesController.getInstance(r2).getChat(java.lang.Long.valueOf(-r6)), 2) != false) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0fb4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0fea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x1032  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x10c5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1099  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e9f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0daa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0ea5 A[LOOP:0: B:68:0x0e19->B:77:0x0ea5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0eb5 A[EDGE_INSN: B:78:0x0eb5->B:79:0x0eb5 BREAK  A[LOOP:0: B:68:0x0e19->B:77:0x0ea5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f2e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f40  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0f53  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.h3 h1(final Context context, final boolean z10, final long j3, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.h3[] h3VarArr;
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
        long j11;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.h3[] h3VarArr2;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        org.telegram.ui.ActionBar.f6 f6Var3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.h3[] h3VarArr3;
        int i14;
        TL_stars.StarsTransaction starsTransaction4;
        Context context3;
        final org.telegram.ui.ActionBar.h3[] h3VarArr4;
        b01 b01Var;
        b01 b01Var2;
        b01 b01Var3;
        b01 b01Var4;
        b01 b01Var5;
        b01 b01Var6;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        ViewGroup viewGroup2;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.p2 U;
        TLRPC.Chat chat;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        int i15;
        final Context context5;
        final int i16;
        b01 b01Var7;
        final org.telegram.ui.ActionBar.h3[] h3VarArr5;
        long j12;
        b01 b01Var8;
        final org.telegram.ui.ActionBar.h3[] h3VarArr6;
        int i17;
        long j13;
        TL_stars.StarsAmount starsAmount;
        b01 b01Var9;
        TL_stars.StarsTransaction starsTransaction5;
        ViewGroup viewGroup3;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i18 = starsTransaction.flags;
        boolean z16 = (i18 & 8192) != 0;
        boolean z17 = ((131072 & i18) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i18 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context, f6Var, false, false);
        h3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.h3[] h3VarArr7 = new org.telegram.ui.ActionBar.h3[1];
        final LinearLayout f7 = em.f(context, 1);
        f7.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                h3VarArr = h3VarArr7;
                h3Var = h3Var2;
                f7 f7Var = new f7(context, matrix, radialGradient, paint, n5Var);
                n5Var.l(f7Var);
                n5Var.i(stargiftattributepattern.document, false);
                f7Var.setOrientation(1);
                w9 w9Var = new w9(context);
                a1(w9Var.getImageReceiver(), starsTransaction.stargift, 160);
                f7Var.addView(w9Var, w7.a6.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    w7.c6.a(w9Var);
                    w9Var.setOnClickListener(new wa(context, i10, tL_starGiftUnique, 21));
                }
                TextView b10 = w7.e6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                f7Var.addView(b10, w7.a6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.e6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                f7Var.addView(b11, w7.a6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.e6.b(context, 18.0f, 0, true, null);
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
                f7Var.addView(b12, w7.a6.t(-2, -2, 17, 0, 11, 0, 17));
                f7.addView(f7Var, w7.a6.n(-1, -2));
                f6Var2 = f6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f7;
                str = "";
                z12 = z18;
                h3VarArr2 = h3VarArr;
                b01 b01Var10 = new b01(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift != null) {
                    starsTransaction3 = starsTransaction2;
                    f6Var3 = f6Var2;
                    viewGroup = linearLayout;
                    b01 b01Var11 = b01Var10;
                    h3VarArr3 = h3VarArr2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction3.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                        if (starsTransaction3.paid_message) {
                            b01Var11.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId, new x5(h3VarArr3, peerDialogId, 3));
                            b01Var5 = b01Var11;
                            if (starsTransaction3.starref_amount != null) {
                                b01Var5 = b01Var11;
                                if (starsTransaction3.starref_commission_permille > 0) {
                                    b01Var11.d(X0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, hc.b.l(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    b01Var5 = b01Var11;
                                }
                            }
                            i14 = i10;
                            b01Var4 = b01Var5;
                        } else if (z11) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                            b01Var11.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new x5(h3VarArr3, j3, 4));
                            b01Var11.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId2, new x5(h3VarArr3, peerDialogId2, 5));
                            i14 = i10;
                            b01Var11.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId, new x5(h3VarArr3, peerDialogId, 6));
                            b01Var11.d(di.m.G0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                            b01Var4 = b01Var11;
                        } else if (z12) {
                            b01Var11.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new uc(i10, context, j3, peerDialogId, h3VarArr3, f6Var3));
                            i14 = i10;
                            b01 b01Var12 = b01Var11;
                            b01Var12.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId, new x5(h3VarArr3, peerDialogId, 0));
                            h3VarArr3 = h3VarArr3;
                            b01Var4 = b01Var12;
                        } else if (z19) {
                            b01Var11.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId, new y5(h3VarArr3, starsTransaction3, peerDialogId, 0));
                            final int i19 = 0;
                            b01Var11.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: xh.z5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i19) {
                                        case 0:
                                            h3VarArr3[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                bundle.putBoolean("my_profile", true);
                                                U2.presentFragment(new ProfileActivity(bundle, null));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            h3VarArr3[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                            h3VarArr3[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                            starsTransaction4 = starsTransaction;
                            b01Var11.g(LocaleController.getString(R.string.StarGiveawayReason), LocaleController.getString(R.string.StarGiveawayReasonLink), new y5(h3VarArr3, starsTransaction, peerDialogId, 1));
                            b01Var11.d(L0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                            context3 = context;
                            i14 = i10;
                            h3VarArr3 = h3VarArr3;
                            b01Var3 = b01Var11;
                        } else {
                            starsTransaction4 = starsTransaction3;
                            if (!starsTransaction4.subscription || z10) {
                                h3VarArr4 = h3VarArr3;
                                if (starsTransaction4.premium_gift) {
                                    final int i20 = 1;
                                    b01Var11.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId, new Runnable() { // from class: xh.a6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    h3VarArr4[0].dismiss();
                                                    long j14 = peerDialogId;
                                                    if (!UserObject.isService(j14)) {
                                                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            U2.presentFragment(eo.R9(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    h3VarArr4[0].dismiss();
                                                    long j15 = peerDialogId;
                                                    if (!UserObject.isService(j15)) {
                                                        org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            U3.presentFragment(eo.R9(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    h3VarArr4[0].dismiss();
                                                    long j16 = peerDialogId;
                                                    if (!UserObject.isService(j16)) {
                                                        org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            U4.presentFragment(eo.R9(j16));
                                                            break;
                                                        }
                                                    } else {
                                                        nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    b01Var = b01Var11;
                                    b01Var.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                } else {
                                    b01Var = b01Var11;
                                    if (!starsTransaction4.posts_search) {
                                        final int i21 = 2;
                                        h3VarArr3 = h3VarArr4;
                                        context3 = context;
                                        b01 b01Var13 = b01Var;
                                        i14 = i10;
                                        b01Var13.k(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId, new Runnable() { // from class: xh.a6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        h3VarArr4[0].dismiss();
                                                        long j14 = peerDialogId;
                                                        if (!UserObject.isService(j14)) {
                                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(eo.R9(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        h3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(eo.R9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        h3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(eo.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        b01Var3 = b01Var13;
                                    }
                                }
                                context3 = context;
                                i14 = i10;
                                b01Var2 = b01Var;
                            } else {
                                final int i22 = 0;
                                h3VarArr4 = h3VarArr3;
                                b01 b01Var14 = b01Var11;
                                i14 = i10;
                                b01Var14.k(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId, new Runnable() { // from class: xh.a6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i22) {
                                            case 0:
                                                h3VarArr3[0].dismiss();
                                                long j14 = peerDialogId;
                                                if (!UserObject.isService(j14)) {
                                                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(eo.R9(j14));
                                                        break;
                                                    }
                                                } else {
                                                    nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                h3VarArr3[0].dismiss();
                                                long j15 = peerDialogId;
                                                if (!UserObject.isService(j15)) {
                                                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(eo.R9(j15));
                                                        break;
                                                    }
                                                } else {
                                                    nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                h3VarArr3[0].dismiss();
                                                long j16 = peerDialogId;
                                                if (!UserObject.isService(j16)) {
                                                    org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(eo.R9(j16));
                                                        break;
                                                    }
                                                } else {
                                                    nf.f.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                context3 = context;
                                b01Var2 = b01Var14;
                            }
                            h3VarArr3 = h3VarArr4;
                            b01Var3 = b01Var2;
                        }
                    } else {
                        i14 = i10;
                        starsTransaction4 = starsTransaction3;
                        context3 = context;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction4.gift) {
                                m90 m90Var = new m90(context3, f6Var3);
                                m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                m90Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i23 = org.telegram.ui.ActionBar.j6.gc;
                                m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var3));
                                m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var3));
                                m90Var.setTextSize(1, 14.0f);
                                m90Var.setSingleLine(true);
                                m90Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(m90Var, 24.0f, i14);
                                String string2 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                vq a2 = t7.a(24, "fragment");
                                int dp = AndroidUtilities.dp(16.0f);
                                int dp2 = AndroidUtilities.dp(16.0f);
                                a2.e = dp;
                                a2.f = dp2;
                                g5Var.b.setImageBitmap(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string2));
                                spannableStringBuilder2.setSpan(g5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new t6(h3VarArr3, context3, z15), 3, spannableStringBuilder2.length(), 33);
                                m90Var.setText(spannableStringBuilder2);
                                b01Var11.i(m90Var, LocaleController.getString(R.string.StarsTransactionRecipient));
                                b01Var3 = b01Var11;
                            } else {
                                b01Var11.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                                b01Var3 = b01Var11;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            b01Var11.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                            b01Var3 = b01Var11;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            b01Var11.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                            b01Var3 = b01Var11;
                        } else {
                            b01Var3 = b01Var11;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                b01Var11.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                                b01Var3 = b01Var11;
                            }
                        }
                    }
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                        if (z10) {
                        }
                        chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId3));
                        if (chat != null) {
                        }
                    }
                    z14 = z15;
                    viewGroup2 = viewGroup;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup4 = viewGroup2;
                    viewGroup4.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    bi.d dVar = new bi.d(context4, f6Var3);
                    dVar.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup4.addView(dVar, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                    h3Var3.customView = viewGroup4;
                    int i24 = 0;
                    h3VarArr3[0] = h3Var3;
                    h3Var3.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    h3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    h3VarArr3[0].show();
                    return h3VarArr3[0];
                }
                if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction5 = starsTransaction2;
                        viewGroup3 = linearLayout;
                    } else {
                        yc ycVar = (yc) ((yz0) b01Var10.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup3 = linearLayout;
                        Context context6 = context2;
                        starsTransaction5 = starsTransaction;
                        v5.w(i10).M(tL_inputSavedStarGiftUser, new ei.m0(ycVar, i10, context6, f6Var2, 4));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction5.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        context5 = context;
                        i14 = i10;
                        b01 b01Var15 = b01Var10;
                        b01Var15.k(LocaleController.getString(R.string.StarGiftUpgradeGiftFrom), i14, peerDialogId4, new x5(h3VarArr2, peerDialogId4, 1));
                        f6Var3 = f6Var;
                        h3VarArr3 = h3VarArr2;
                        starsTransaction4 = starsTransaction5;
                        viewGroup = viewGroup3;
                        b01Var9 = b01Var15;
                        context3 = context5;
                        b01Var3 = b01Var9;
                    } else {
                        i14 = i10;
                        f6Var3 = f6Var;
                        b01Var6 = b01Var10;
                        h3VarArr3 = h3VarArr2;
                        starsTransaction4 = starsTransaction5;
                        viewGroup = viewGroup3;
                        context3 = context;
                        b01Var3 = b01Var6;
                    }
                } else {
                    ViewGroup viewGroup5 = linearLayout;
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (!TextUtils.isEmpty(str2)) {
                            b01Var10.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction6.stargift.title + " #" + starsTransaction6.stargift.num, new uu0(context5, i10, str2, 15));
                        }
                        final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                        long peerDialogId5 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    b01Var10.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                } else {
                                    b01Var10.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                    j12 = clientUserId;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                b01Var10.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                peerDialogId5 = clientUserId;
                                j12 = peerDialogId5;
                            } else {
                                b01Var10.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                            }
                            j12 = peerDialogId5;
                            peerDialogId5 = clientUserId;
                        } else if (negative) {
                            b01Var10.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                            j12 = peerDialogId5;
                            peerDialogId5 = clientUserId;
                        } else {
                            b01Var10.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j12 = clientUserId;
                        }
                        int i25 = (peerDialogId5 > clientUserId ? 1 : (peerDialogId5 == clientUserId ? 0 : -1));
                        if (i25 != 0) {
                            h3VarArr6 = h3VarArr2;
                            final int i26 = 0;
                            f6Var3 = f6Var;
                            b01Var8 = b01Var10;
                            i17 = i25;
                            viewGroup = viewGroup5;
                            final long j14 = peerDialogId5;
                            j13 = clientUserId;
                            b01Var8.k(LocaleController.getString(R.string.Gift2From), i10, j14, new Runnable() { // from class: xh.d6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i26) {
                                        case 0:
                                            h3VarArr6[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j15 = j14;
                                                Bundle e = w.f.e(j15, "user_id");
                                                if (j15 == clientUserId) {
                                                    e.putBoolean("my_profile", true);
                                                }
                                                e.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(e, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            h3VarArr6[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j16 = j14;
                                                Bundle e7 = w.f.e(j16, "user_id");
                                                if (j16 == clientUserId) {
                                                    e7.putBoolean("my_profile", true);
                                                }
                                                e7.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(e7, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            f6Var3 = f6Var;
                            b01Var8 = b01Var10;
                            h3VarArr6 = h3VarArr2;
                            i17 = i25;
                            viewGroup = viewGroup5;
                            j13 = clientUserId;
                        }
                        if (j12 != j13) {
                            final long j15 = j13;
                            final int i27 = 1;
                            final long j16 = j12;
                            final org.telegram.ui.ActionBar.h3[] h3VarArr8 = h3VarArr6;
                            b01Var8.k(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() { // from class: xh.d6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            h3VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j152 = j16;
                                                Bundle e = w.f.e(j152, "user_id");
                                                if (j152 == j15) {
                                                    e.putBoolean("my_profile", true);
                                                }
                                                e.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(e, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            h3VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j162 = j16;
                                                Bundle e7 = w.f.e(j162, "user_id");
                                                if (j162 == j15) {
                                                    e7.putBoolean("my_profile", true);
                                                }
                                                e7.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(e7, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        b01 b01Var16 = b01Var8;
                        if ((i17 == 0 || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                uq[] uqVarArr = new uq[1];
                                b01Var16.d(W0(starsTransaction6.amount, "⭐️ " + ((Object) I0(tL_starsTonAmount)), uqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                uq uqVar = uqVarArr[0];
                                if (uqVar != null) {
                                    uqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var3));
                                }
                            } else {
                                b01Var16.d(X0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, hc.b.l(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        }
                        i14 = i10;
                        b01Var9 = b01Var16;
                        starsTransaction4 = starsTransaction6;
                        h3VarArr3 = h3VarArr6;
                        context3 = context5;
                        b01Var3 = b01Var9;
                    } else {
                        f6Var3 = f6Var;
                        viewGroup = viewGroup5;
                        final org.telegram.ui.ActionBar.h3[] h3VarArr9 = h3VarArr2;
                        if (starsTransaction6.refund) {
                            i14 = i10;
                            b01Var6 = b01Var10;
                            starsTransaction4 = starsTransaction6;
                            h3VarArr3 = h3VarArr9;
                            context3 = context;
                            b01Var3 = b01Var6;
                        } else {
                            long clientUserId2 = j3 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j3;
                            final long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId6));
                            if (positive) {
                                if (peerDialogId6 != clientUserId2) {
                                    CharSequence string3 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                    Runnable y5Var = new y5(h3VarArr9, starsTransaction6, peerDialogId6, 3);
                                    String string4 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId6)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i28 = 0;
                                    i16 = i10;
                                    Runnable runnable = new Runnable() { // from class: xh.b6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.h3 h3Var4 = h3VarArr9[0];
                                                    Objects.requireNonNull(h3Var4);
                                                    new wh.p1(context5, i16, peerDialogId6, null, new org.telegram.ui.web.y1(h3Var4, 21)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.h3 h3Var5 = h3VarArr9[0];
                                                    Objects.requireNonNull(h3Var5);
                                                    new wh.p1(context5, i16, peerDialogId6, null, new org.telegram.ui.web.y1(h3Var5, 21)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    b01 b01Var17 = b01Var10;
                                    h3VarArr5 = h3VarArr9;
                                    b01Var17.j(string3, i16, peerDialogId6, y5Var, string4, runnable);
                                    b01Var7 = b01Var17;
                                } else {
                                    i16 = i10;
                                    b01Var7 = b01Var10;
                                    h3VarArr5 = h3VarArr9;
                                }
                                final int i29 = 1;
                                b01Var7.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: xh.z5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                                h3VarArr3 = h3VarArr5;
                                b01Var5 = b01Var7;
                            } else {
                                long j17 = clientUserId2;
                                if (peerDialogId6 != j17) {
                                    final int i30 = 2;
                                    b01Var10.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() { // from class: xh.z5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i30) {
                                                case 0:
                                                    h3VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    h3VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                                    h3VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                                CharSequence string5 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                Runnable y5Var2 = new y5(h3VarArr9, starsTransaction, peerDialogId6, 4);
                                starsTransaction3 = starsTransaction;
                                String string6 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId6)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                final int i31 = 1;
                                h3VarArr3 = h3VarArr9;
                                b01 b01Var18 = b01Var10;
                                b01Var18.j(string5, i10, peerDialogId6, y5Var2, string6, new Runnable() { // from class: xh.b6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i31) {
                                            case 0:
                                                org.telegram.ui.ActionBar.h3 h3Var4 = h3VarArr9[0];
                                                Objects.requireNonNull(h3Var4);
                                                new wh.p1(context, i10, peerDialogId6, null, new org.telegram.ui.web.y1(h3Var4, 21)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.h3 h3Var5 = h3VarArr9[0];
                                                Objects.requireNonNull(h3Var5);
                                                new wh.p1(context, i10, peerDialogId6, null, new org.telegram.ui.web.y1(h3Var5, 21)).show();
                                                break;
                                        }
                                    }
                                });
                                b01Var5 = b01Var18;
                            }
                            i14 = i10;
                            b01Var4 = b01Var5;
                        }
                    }
                }
                starsTransactionPeer = starsTransaction4.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                    long peerDialogId32 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                        peerDialogId32 = j3;
                    }
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId32));
                    if (chat != null) {
                        m90 m90Var2 = new m90(context3, f6Var3);
                        z14 = z15;
                        m90Var2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        m90Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i32 = org.telegram.ui.ActionBar.j6.gc;
                        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i32, f6Var3));
                        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i32, f6Var3));
                        m90Var2.setTextSize(1, 14.0f);
                        m90Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (!starsTransaction4.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                            int size = arrayList.size();
                            int i33 = 0;
                            int i34 = 0;
                            while (i34 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i34);
                                int i35 = i34 + 1;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                int i36 = size;
                                w70 w70Var = new w70(m90Var2, 24.0f, i14);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    viewGroup2 = viewGroup;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    viewGroup2 = viewGroup;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                    } else {
                                        imageLocation2 = null;
                                        if (imageLocation2 == null) {
                                            w70Var.a(6.0f);
                                            w70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(w70Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i15 = i33 + 1;
                                        } else {
                                            i15 = i33;
                                        }
                                        if (i15 < 3) {
                                            break;
                                        }
                                        size = i36;
                                        i34 = i35;
                                        i33 = i15;
                                        viewGroup = viewGroup2;
                                        arrayList = arrayList2;
                                    }
                                }
                                imageLocation2 = forDocument2;
                                if (imageLocation2 == null) {
                                }
                                if (i15 < 3) {
                                }
                            }
                        }
                        viewGroup2 = viewGroup;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String publicUsername = ChatObject.getPublicUsername(chat);
                        if (TextUtils.isEmpty(publicUsername)) {
                            spannableStringBuilder3.append((CharSequence) chat.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            a4.a.z(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                            sb2.append(starsTransaction4.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        y5 y5Var3 = new y5(h3VarArr3, peerDialogId32, starsTransaction4);
                        spannableStringBuilder3.setSpan(new u6(y5Var3), length, spannableStringBuilder3.length(), 33);
                        m90Var2.setSingleLine(true);
                        m90Var2.setEllipsize(TextUtils.TruncateAt.END);
                        m90Var2.setText(spannableStringBuilder3);
                        m90Var2.setOnClickListener(new org.telegram.ui.web.c(y5Var3, 21));
                        b01Var3.i(m90Var2, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                        if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                            String string7 = LocaleController.getString(R.string.StarsTransactionID);
                            String str3 = starsTransaction4.id;
                            b01Var3.h(string7, str3, str3.length() <= 25 ? 9 : 10, new u2.k0(26, h3VarArr3, f6Var3));
                        }
                        if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                            b01Var3.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                        }
                        b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                        starGift2 = starsTransaction4.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                F0(b01Var3, i14, starGift2, f6Var3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                b01Var3.a(new SpannableStringBuilder(starsTransaction4.description));
                            }
                        }
                        ViewGroup viewGroup42 = viewGroup2;
                        viewGroup42.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction4.flags & 32) != 0) {
                            b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                        }
                        if (z14) {
                            context4 = context;
                        } else {
                            context4 = context;
                            m90 m90Var3 = new m90(context4, f6Var3);
                            m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var3));
                            m90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var3));
                            m90Var3.setTextSize(1, 14.0f);
                            m90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ci.a(context4, 6)));
                            m90Var3.setGravity(17);
                            viewGroup42.addView(m90Var3, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        }
                        bi.d dVar2 = new bi.d(context4, f6Var3);
                        dVar2.e();
                        if ((starsTransaction4.flags & 32) != 0) {
                            dVar2.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                        } else {
                            dVar2.h(LocaleController.getString(R.string.OK));
                        }
                        viewGroup42.addView(dVar2, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var32 = h3Var;
                        h3Var32.customView = viewGroup42;
                        int i242 = 0;
                        h3VarArr3[0] = h3Var32;
                        h3Var32.useBackgroundTopPadding = false;
                        if ((starsTransaction4.flags & 32) != 0) {
                            dVar2.setOnClickListener(new s1(3, context4, starsTransaction4));
                        } else {
                            dVar2.setOnClickListener(new c6(h3VarArr3, i242));
                        }
                        h3VarArr3[0].fixNavigationBar();
                        U = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                            h3VarArr3[0].makeAttached(U);
                        }
                        h3VarArr3[0].show();
                        return h3VarArr3[0];
                    }
                }
                z14 = z15;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    String string72 = LocaleController.getString(R.string.StarsTransactionID);
                    String str32 = starsTransaction4.id;
                    b01Var3.h(string72, str32, str32.length() <= 25 ? 9 : 10, new u2.k0(26, h3VarArr3, f6Var3));
                }
                if (starsTransaction4.floodskip) {
                    b01Var3.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup422 = viewGroup2;
                viewGroup422.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                bi.d dVar22 = new bi.d(context4, f6Var3);
                dVar22.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup422.addView(dVar22, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.h3 h3Var322 = h3Var;
                h3Var322.customView = viewGroup422;
                int i2422 = 0;
                h3VarArr3[0] = h3Var322;
                h3Var322.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                h3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    h3VarArr3[0].makeAttached(U);
                }
                h3VarArr3[0].show();
                return h3VarArr3[0];
                starsTransaction4 = starsTransaction3;
                b01Var6 = b01Var4;
                context3 = context;
                b01Var3 = b01Var6;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup4222 = viewGroup2;
                viewGroup4222.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                bi.d dVar222 = new bi.d(context4, f6Var3);
                dVar222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup4222.addView(dVar222, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.h3 h3Var3222 = h3Var;
                h3Var3222.customView = viewGroup4222;
                int i24222 = 0;
                h3VarArr3[0] = h3Var3222;
                h3Var3222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                h3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                h3VarArr3[0].show();
                return h3VarArr3[0];
            }
        }
        h3Var = h3Var2;
        h3VarArr = h3VarArr7;
        z11 = z17;
        final w9 w9Var2 = new w9(context);
        if (starsTransaction.premium_gift) {
            c1(w9Var2, w9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f7.addView(w9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            vq a10 = org.telegram.ui.Cells.w6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            w9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f7;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j10 = j3;
                    f6Var2 = f6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(w9Var2, w9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(w9Var2, w9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(w9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f7;
                    z13 = z10;
                    j10 = j3;
                    f6Var2 = f6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            w9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            w9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            w9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                j11 = j10;
                                g9 g9Var = new g9();
                                if (j11 < 0) {
                                    str = "";
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                                    g9Var.r(user2);
                                    w9Var2.e(user2, g9Var);
                                } else {
                                    str = "";
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                                    g9Var.q(chat2);
                                    w9Var2.e(chat2, g9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            j11 = DialogObject.getPeerDialogId(peer);
                            g9 g9Var2 = new g9();
                            if (j11 < 0) {
                            }
                        }
                        linearLayout.addView(w9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        vq a11 = org.telegram.ui.Cells.w6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        w9Var2.setImageDrawable(a11);
                    }
                } else {
                    w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        w9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        f7.addView(w9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xh.w5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i37 = 0; i37 < starsTransaction7.extended_media.size(); i37++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i37);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j18 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j18;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j18;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new g7(w9Var2, f7, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        f6Var2 = f6Var;
                        i11 = i10;
                        linearLayout = f7;
                        j10 = j3;
                        w9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    w9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    f7.addView(w9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: xh.w5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i37 = 0; i37 < starsTransaction7.extended_media.size(); i37++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i37);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j18 = -peerDialogId7;
                                tL_peerChannel.channel_id = j18;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j18;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new g7(w9Var2, f7, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    f6Var2 = f6Var;
                    i11 = i10;
                    linearLayout = f7;
                    j10 = j3;
                    w9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.j6.j5;
                em.x(i12, f6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i11, z13, starsTransaction2));
                TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                g10.setTextSize(1, 18.0f);
                g10.setTypeface(AndroidUtilities.bold());
                g10.setGravity(17);
                g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                g10.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(g10.getText());
                if (!starsTransaction2.refund) {
                    G0(spannableStringBuilder4, g10, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var2));
                    G0(spannableStringBuilder4, g10, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yj, f6Var2));
                    G0(spannableStringBuilder4, g10, LocaleController.getString(R.string.StarsPending));
                }
                g10.setText(spannableStringBuilder4);
                linearLayout.addView(g10, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    m90 m90Var4 = new m90(context2);
                    m90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    m90Var4.setTextSize(1, 14.0f);
                    m90Var4.setGravity(17);
                    m90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    m90Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, di.m.G0(1000 - starsTransaction2.starref_commission_permille))));
                    int i37 = j10 != UserConfig.getInstance(i11).getClientUserId() ? 2 : 2;
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new di.e2(j10, i11, i37)), true));
                    m90Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(m90Var4, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                    h3VarArr2 = h3VarArr;
                    b01 b01Var102 = new b01(context2, f6Var2);
                    starGift = starsTransaction2.stargift;
                    if (starGift != null) {
                    }
                    starsTransaction4 = starsTransaction3;
                    b01Var6 = b01Var4;
                    context3 = context;
                    b01Var3 = b01Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    viewGroup2 = viewGroup;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup42222 = viewGroup2;
                    viewGroup42222.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    bi.d dVar2222 = new bi.d(context4, f6Var3);
                    dVar2222.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup42222.addView(dVar2222, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.h3 h3Var32222 = h3Var;
                    h3Var32222.customView = viewGroup42222;
                    int i242222 = 0;
                    h3VarArr3[0] = h3Var32222;
                    h3Var32222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    h3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    h3VarArr3[0].show();
                    return h3VarArr3[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        g10.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    m90 m90Var5 = new m90(context2);
                    m90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    m90Var5.setTextSize(i13, 16.0f);
                    m90Var5.setGravity(17);
                    m90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    m90Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i38 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i38, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    h3VarArr2 = h3VarArr;
                    m90Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new u41(context2, h3VarArr2)), true)));
                    linearLayout.addView(m90Var5, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    h3VarArr2 = h3VarArr;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        em.n(i12, f6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                b01 b01Var1022 = new b01(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift != null) {
                }
                starsTransaction4 = starsTransaction3;
                b01Var6 = b01Var4;
                context3 = context;
                b01Var3 = b01Var6;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup422222 = viewGroup2;
                viewGroup422222.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                bi.d dVar22222 = new bi.d(context4, f6Var3);
                dVar22222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup422222.addView(dVar22222, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.h3 h3Var322222 = h3Var;
                h3Var322222.customView = viewGroup422222;
                int i2422222 = 0;
                h3VarArr3[0] = h3Var322222;
                h3Var322222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                h3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                h3VarArr3[0].show();
                return h3VarArr3[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                w9Var2.setImageDrawable(new l3(w9Var2, starsTransaction.stargift, 94, 0.44f));
                f7.addView(w9Var2, w7.a6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(w9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                f7.addView(w9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        f6Var2 = f6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = f7;
        str = "";
        z12 = z18;
        z13 = z10;
        j10 = j3;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.j6.j5;
        em.x(i12, f6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i11, z13, starsTransaction2));
        TextView g102 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView3, w7.a6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        g102.setTextSize(1, 18.0f);
        g102.setTypeface(AndroidUtilities.bold());
        g102.setGravity(17);
        g102.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        g102.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(g102.getText());
        if (!starsTransaction2.refund) {
        }
        g102.setText(spannableStringBuilder42);
        linearLayout.addView(g102, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        h3VarArr2 = h3VarArr;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            em.n(i12, f6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        b01 b01Var10222 = new b01(context2, f6Var2);
        starGift = starsTransaction2.stargift;
        if (starGift != null) {
        }
        starsTransaction4 = starsTransaction3;
        b01Var6 = b01Var4;
        context3 = context;
        b01Var3 = b01Var6;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        viewGroup2 = viewGroup;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        b01Var3.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup4222222 = viewGroup2;
        viewGroup4222222.addView(b01Var3, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        bi.d dVar222222 = new bi.d(context4, f6Var3);
        dVar222222.e();
        if ((starsTransaction4.flags & 32) != 0) {
        }
        viewGroup4222222.addView(dVar222222, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.h3 h3Var3222222 = h3Var;
        h3Var3222222.customView = viewGroup4222222;
        int i24222222 = 0;
        h3VarArr3[0] = h3Var3222222;
        h3Var3222222.useBackgroundTopPadding = false;
        if ((starsTransaction4.flags & 32) != 0) {
        }
        h3VarArr3[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        h3VarArr3[0].show();
        return h3VarArr3[0];
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
    /* JADX WARN: Removed duplicated region for block: B:101:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050c  */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x0(z7 z7Var, int i10) {
        v51 G;
        String str;
        boolean[] zArr;
        String str2;
        final boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        boolean[] zArr2;
        TLRPC.Chat chat2;
        String str3;
        int i11;
        long j3;
        b01 b01Var;
        long j10;
        TLRPC.Chat chat3;
        boolean z12;
        String str4;
        boolean z13;
        long currentTime;
        v6 v6Var;
        final org.telegram.ui.ActionBar.h3[] h3VarArr;
        final int i12;
        ?? r62;
        org.telegram.ui.ActionBar.p2 U;
        c7 c7Var = z7Var.g0;
        if (c7Var == null || (G = c7Var.G(i10)) == null) {
            return;
        }
        int i13 = G.d;
        if (i13 == -1) {
            z7Var.g0.N(true);
            return;
        }
        if (i13 == -2) {
            v5.y(z7Var.currentAccount, false).u();
            sg.p1.e0(1, BirthdayController.getInstance(z7Var.currentAccount).getState());
            return;
        }
        if (i13 == -3) {
            v5.y(z7Var.currentAccount, false).W();
            z7Var.g0.N(true);
            return;
        }
        if (i13 == -4) {
            if (MessagesController.getInstance(z7Var.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(z7Var.currentAccount);
                return;
            } else {
                z7Var.presentFragment(new di.h4(z7Var.getUserConfig().getClientUserId()));
                return;
            }
        }
        if (G.G(l7.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                v5.y(z7Var.currentAccount, false).f(z7Var.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new bi.k6(22, z7Var, G), null);
                return;
            }
            return;
        }
        if (G.G(q7.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = z7Var.getParentActivity();
            int i14 = z7Var.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.f6 resourceProvider = z7Var.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) parentActivity, resourceProvider, false);
            h3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.h3[] h3VarArr2 = new org.telegram.ui.ActionBar.h3[1];
            LinearLayout f7 = org.telegram.messenger.a2.f(parentActivity, 1);
            f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f7.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            v6 v6Var2 = new v6(zArr3, h3VarArr2);
            NotificationCenter.getInstance(i14).addObserver(v6Var2, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            w9 w9Var = new w9(parentActivity);
            if (peerDialogId >= 0) {
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                String userName = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                str2 = userName;
                zArr = zArr3;
                z11 = isBot;
                str = "";
                chat = user;
            } else {
                str = "";
                zArr = zArr3;
                TLRPC.Chat chat4 = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
                str2 = chat4 == null ? str : chat4.title;
                z10 = false;
                z11 = false;
                chat = chat4;
            }
            TLRPC.Chat chat5 = chat;
            if (starsSubscription.photo != null) {
                w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                zArr2 = zArr;
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
                if (peerDialogId < 0) {
                    chat2 = chat5;
                    str3 = str2;
                    TLRPC.Chat chat6 = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
                    g9Var.q(chat6);
                    w9Var.e(chat6, g9Var);
                    frameLayout.addView(w9Var, w7.a6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, w7.a6.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, w7.a6.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    em.x(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f7.addView(textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        j3 = peerDialogId;
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        j3 = peerDialogId;
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i11 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f7.addView(textView2, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
                    b01Var = new b01(parentActivity, resourceProvider);
                    m90 m90Var = new m90(parentActivity, resourceProvider);
                    m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    m90Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i15 = org.telegram.ui.ActionBar.j6.gc;
                    m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                    m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                    m90Var.setTextSize(1, 14.0f);
                    m90Var.setSingleLine(true);
                    m90Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(m90Var, 24.0f, i14);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j3));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        String userName2 = UserObject.getUserName(user2);
                        g5Var.e(user2);
                        z12 = z14;
                        str4 = userName2;
                        j10 = j3;
                        chat3 = chat2;
                    } else {
                        j10 = j3;
                        chat3 = chat2;
                        TLRPC.Chat chat7 = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                        z12 = chat7 == null;
                        if (chat7 != null) {
                            str = chat7.title;
                        }
                        g5Var.b(chat7);
                        str4 = str;
                    }
                    z13 = z12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str4));
                    spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new w6(h3VarArr2, j10), 3, spannableStringBuilder.length(), 33);
                    m90Var.setText(spannableStringBuilder);
                    if (!z13) {
                        b01Var.i(m90Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        b01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    b01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    b01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f7.addView(b01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    m90 m90Var2 = new m90(parentActivity, resourceProvider);
                    int i16 = org.telegram.ui.ActionBar.j6.z6;
                    m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
                    m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                    final int i17 = 1;
                    m90Var2.setTextSize(1, 14.0f);
                    m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i18 = i17;
                            Activity activity = parentActivity;
                            switch (i18) {
                                case 0:
                                    if (activity.isFinishing()) {
                                        return;
                                    }
                                    Handler handler = g.g;
                                    Method method = g.f;
                                    int i19 = Build.VERSION.SDK_INT;
                                    if (i19 >= 28) {
                                        activity.recreate();
                                        return;
                                    }
                                    if (((i19 != 26 && i19 != 27) || method != null) && (g.e != null || g.d != null)) {
                                        try {
                                            Object obj2 = g.c.get(activity);
                                            if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                f fVar = new f(activity);
                                                application.registerActivityLifecycleCallbacks(fVar);
                                                handler.post(new i9.s(10, fVar, obj2));
                                                try {
                                                    if (i19 == 26 || i19 == 27) {
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
                                    nf.f.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    return;
                            }
                        }
                    }));
                    m90Var2.setGravity(17);
                    f7.addView(m90Var2, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        v6Var = v6Var2;
                        h3VarArr = h3VarArr2;
                        i12 = i14;
                        m90 m90Var3 = new m90(parentActivity, resourceProvider);
                        m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
                        m90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                        m90Var3.setTextSize(1, 14.0f);
                        m90Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        m90Var3.setSingleLine(false);
                        m90Var3.setMaxLines(4);
                        m90Var3.setGravity(17);
                        f7.addView(m90Var3, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            bi.d dVar = new bi.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r62 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f7.addView(dVar, w7.a6.n(-1, 48));
                            dVar.setOnClickListener(new fu(dVar, starsSubscription, i12, h3VarArr, resourceProvider, zArr2, parentActivity));
                            h3Var.customView = f7;
                            h3VarArr[r62] = h3Var;
                            h3Var.useBackgroundTopPadding = r62;
                            h3Var.setOnDismissListener(new pg.s(i12, v6Var));
                            h3VarArr[r62].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                h3VarArr[r62].makeAttached(U);
                            }
                            h3VarArr[r62].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        m90 m90Var4 = new m90(parentActivity, resourceProvider);
                        m90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
                        m90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                        m90Var4.setTextSize(1, 14.0f);
                        m90Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        m90Var4.setSingleLine(false);
                        m90Var4.setMaxLines(4);
                        m90Var4.setGravity(17);
                        f7.addView(m90Var4, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        bi.d dVar2 = new bi.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f7.addView(dVar2, w7.a6.n(-1, 48));
                        v6Var = v6Var2;
                        h3VarArr = h3VarArr2;
                        n6 n6Var = new n6(dVar2, i14, starsSubscription, h3VarArr, j10, parentActivity, resourceProvider, z10, str3);
                        i12 = i14;
                        dVar2.setOnClickListener(n6Var);
                    } else {
                        v6Var = v6Var2;
                        h3VarArr = h3VarArr2;
                        i12 = i14;
                        if (starsSubscription.bot_canceled) {
                            m90 m90Var5 = new m90(parentActivity, resourceProvider);
                            m90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            m90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                            m90Var5.setTextSize(1, 14.0f);
                            m90Var5.setText(LocaleController.getString(z10 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            m90Var5.setSingleLine(false);
                            m90Var5.setMaxLines(4);
                            m90Var5.setGravity(17);
                            f7.addView(m90Var5, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            m90 m90Var6 = new m90(parentActivity, resourceProvider);
                            m90Var6.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            m90Var6.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                            m90Var6.setTextSize(1, 14.0f);
                            m90Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            m90Var6.setSingleLine(false);
                            m90Var6.setMaxLines(4);
                            m90Var6.setGravity(17);
                            f7.addView(m90Var6, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                bi.d dVar3 = new bi.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f7.addView(dVar3, w7.a6.n(-1, 48));
                                dVar3.setOnClickListener(new di.p3(dVar3, starsSubscription, i12, h3VarArr, chat3, str3));
                            }
                        } else {
                            final TLRPC.Chat chat8 = chat3;
                            m90 m90Var7 = new m90(parentActivity, resourceProvider);
                            m90Var7.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
                            m90Var7.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
                            m90Var7.setTextSize(1, 14.0f);
                            m90Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            m90Var7.setSingleLine(false);
                            m90Var7.setMaxLines(4);
                            m90Var7.setGravity(17);
                            f7.addView(m90Var7, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final bi.d dVar4 = new bi.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            f7.addView(dVar4, w7.a6.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: xh.o6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final bi.d dVar5 = dVar4;
                                    if (dVar5.N) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i18 = i12;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i18);
                                    final TLObject tLObject = chat8;
                                    final boolean z15 = z10;
                                    final boolean z16 = z11;
                                    final org.telegram.ui.ActionBar.h3[] h3VarArr3 = h3VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: xh.q6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new pj(i18, dVar5, tLObject, starsSubscription2, z15, z16, h3VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r62 = 0;
                    h3Var.customView = f7;
                    h3VarArr[r62] = h3Var;
                    h3Var.useBackgroundTopPadding = r62;
                    h3Var.setOnDismissListener(new pg.s(i12, v6Var));
                    h3VarArr[r62].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        h3VarArr[r62].makeAttached(U);
                    }
                    h3VarArr[r62].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                g9Var.r(user3);
                w9Var.e(user3, g9Var);
            }
            chat2 = chat5;
            str3 = str2;
            frameLayout.addView(w9Var, w7.a6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            em.x(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f7.addView(textView3, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            f7.addView(textView22, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
            b01Var = new b01(parentActivity, resourceProvider);
            m90 m90Var8 = new m90(parentActivity, resourceProvider);
            m90Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            m90Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i152 = org.telegram.ui.ActionBar.j6.gc;
            m90Var8.setTextColor(org.telegram.ui.ActionBar.j6.v0(i152, resourceProvider));
            m90Var8.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i152, resourceProvider));
            m90Var8.setTextSize(1, 14.0f);
            m90Var8.setSingleLine(true);
            m90Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(m90Var8, 24.0f, i14);
            if (peerDialogId < 0) {
            }
            z13 = z12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str4));
            spannableStringBuilder2.setSpan(g5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new w6(h3VarArr2, j10), 3, spannableStringBuilder2.length(), 33);
            m90Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (peerDialogId >= 0) {
                b01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            b01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
            b01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f7.addView(b01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            m90 m90Var22 = new m90(parentActivity, resourceProvider);
            int i162 = org.telegram.ui.ActionBar.j6.z6;
            m90Var22.setTextColor(org.telegram.ui.ActionBar.j6.v0(i162, resourceProvider));
            m90Var22.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i152, resourceProvider));
            final int i172 = 1;
            m90Var22.setTextSize(1, 14.0f);
            m90Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i18 = i172;
                    Activity activity = parentActivity;
                    switch (i18) {
                        case 0:
                            if (activity.isFinishing()) {
                                return;
                            }
                            Handler handler = g.g;
                            Method method = g.f;
                            int i19 = Build.VERSION.SDK_INT;
                            if (i19 >= 28) {
                                activity.recreate();
                                return;
                            }
                            if (((i19 != 26 && i19 != 27) || method != null) && (g.e != null || g.d != null)) {
                                try {
                                    Object obj2 = g.c.get(activity);
                                    if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                        Application application = activity.getApplication();
                                        f fVar = new f(activity);
                                        application.registerActivityLifecycleCallbacks(fVar);
                                        handler.post(new i9.s(10, fVar, obj2));
                                        try {
                                            if (i19 == 26 || i19 == 27) {
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
                            nf.f.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            return;
                    }
                }
            }));
            m90Var22.setGravity(17);
            f7.addView(m90Var22, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r62 = 0;
            h3Var.customView = f7;
            h3VarArr[r62] = h3Var;
            h3Var.useBackgroundTopPadding = r62;
            h3Var.setOnDismissListener(new pg.s(i12, v6Var));
            h3VarArr[r62].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            h3VarArr[r62].show();
        }
    }

    public static void z0(z7 z7Var, v51 v51Var, Boolean bool, String str) {
        if (z7Var.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            wc.a0(z7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
            z7Var.T.c(true);
            v5.y(z7Var.currentAccount, false).T(true);
        } else if (str != null) {
            com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, wc.a0(z7Var), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, j61 j61Var) {
        if (getParentActivity() == null) {
            return;
        }
        v5 y3 = v5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        nc ncVar = (nc) super.r0(getParentActivity());
        v51 v51Var = new v51(-2);
        v51Var.c = ncVar;
        arrayList.add(v51Var);
        arrayList.add(v51.k(this.U));
        bi.d dVar = this.d0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(v51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(di.i.a(-4, getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_earn_stars, yo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(v51.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.m(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = q7.a;
                v51 J = v51.J(q7.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(v51.o(arrayList.size(), 33));
            } else if (!y3.y) {
                v51 c10 = v51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(v51.B(null));
        }
        boolean O = y3.O(0);
        this.e0 = O;
        if (O) {
            arrayList.add(v51.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(v51.l(this.S));
        }
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new y7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new t50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        rg.f fVar = new rg.f(context, 1, 2);
        this.Q = fVar;
        rg.a aVar = fVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.a6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ci.a(context, 7)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ai.g(this, 20));
        y00 y00Var = new y00(getParentActivity());
        this.T = y00Var;
        this.s.addView(y00Var, w7.a6.c(-1.0f, -1));
        v5 y3 = v5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), false, true, false);
        this.W = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        w70 w70Var = new w70(this.W, 42.0f, this.currentAccount);
        hj0 hj0Var = new hj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = w70Var.b;
        imageReceiver.setImageBitmap(hj0Var);
        imageReceiver.setAutoRepeat(2);
        w70Var.f = false;
        w70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(w70Var, 0, 1, 33);
        this.U.addView(this.W, w7.a6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.resourceProvider));
        this.U.addView(this.X, w7.a6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        a7 a7Var = new a7(0, getParentActivity(), this);
        this.Z = a7Var;
        frameLayout2.addView(a7Var);
        bi.d dVar = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar;
        dVar.e();
        this.a0.g("", false, true);
        final int i10 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z7.B0(this.b, context);
                        break;
                    default:
                        new p7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.Z.addView(this.a0, w7.a6.e(-1, 48, 119));
        gc1 gc1Var = new gc1(this, getParentActivity(), 20);
        this.b0 = gc1Var;
        frameLayout2.addView(gc1Var);
        bi.d dVar2 = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new uq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.c0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: xh.e6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        z7.B0(this.b, context);
                        break;
                    default:
                        new p7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.b0.addView(this.c0, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        bi.d dVar3 = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new uq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        z7 z7Var = this.b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        z7.A0(this.b);
                        break;
                }
            }
        });
        this.b0.addView(this.Y, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.a6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        bi.d dVar4 = new bi.d(getParentActivity(), this.resourceProvider, false);
        this.d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new uq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.d0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        z7 z7Var = this.b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        z7.A0(this.b);
                        break;
                }
            }
        });
        this.U.addView(this.d0, w7.a6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        c7 c7Var = this.g0;
        if (c7Var != null) {
            c7Var.N(false);
        }
        p.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            c7 c7Var = this.g0;
            if (c7Var != null) {
                c7Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            v5 y3 = v5.y(this.currentAccount, false);
            if (this.e0 != y3.O(0)) {
                this.e0 = y3.O(0);
                s0();
                c7 c7Var2 = this.g0;
                if (c7Var2 != null) {
                    c7Var2.N(true);
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
            c7 c7Var3 = this.g0;
            if (c7Var3 != null) {
                c7Var3.N(true);
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
        v5 y3 = v5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) J0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        this.a0.g(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
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
            this.Z.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: xh.g6
                public final /* synthetic */ z7 b;

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
            this.b0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: xh.g6
                public final /* synthetic */ z7 b;

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

    @Override // org.telegram.ui.s20
    public final s4.h0 n0() {
        c7 c7Var = new c7(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new gi.a(this, 26), getResourceProvider());
        this.g0 = c7Var;
        c7Var.r = false;
        return c7Var;
    }

    @Override // org.telegram.ui.s20
    public final r20 o0() {
        return new ci.f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v5.y(this.currentAccount, false).T(true);
        v5.y(this.currentAccount, false).S();
        v5.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.s20
    public final qg.x1 p0() {
        return new b7(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.s20
    public final boolean q0() {
        y7 y7Var = this.R;
        boolean z10 = false;
        if (y7Var != null && (y7Var.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.s20
    public final View r0(Context context) {
        throw null;
    }
}
