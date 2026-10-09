package yh;

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
import ci.bb;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.dc1;
import org.telegram.ui.du;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import org.telegram.ui.q50;
import org.telegram.ui.uo;
import org.telegram.ui.w70;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p7 extends p20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat h0;
    public static DecimalFormat i0;
    public FrameLayout P;
    public sg.n Q;
    public o7 R;
    public q50 S;
    public h10 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.r6 W;
    public TextView X;
    public ci.d Y;
    public rg.t0 Z;
    public ci.d a0;
    public dc1 b0;
    public ci.d c0;
    public ci.d d0;
    public boolean e0;
    public boolean f0;
    public s6 g0;

    public p7() {
        this.M = true;
    }

    public static void A0(p7 p7Var, p61 p61Var, Boolean bool, String str) {
        if (p7Var.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            ad.a0(p7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) p61Var.B, new Object[0])), R.raw.stars_topup).j();
            p7Var.T.c(true);
            m5.y(p7Var.currentAccount, false).T(true);
        } else if (str != null) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, ad.a0(p7Var), R.raw.error, 36);
        }
    }

    public static void B0(p7 p7Var) {
        m5.y(p7Var.currentAccount, false).u();
        tg.m1.f0(1, BirthdayController.getInstance(p7Var.currentAccount).getState());
    }

    public static /* synthetic */ void C0(p7 p7Var, Context context) {
        if (MessagesController.getInstance(p7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(p7Var.currentAccount);
        } else {
            new f7(context, p7Var.resourceProvider).show();
        }
    }

    public static void G0(r01 r01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((o01) r01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ja0 ja0Var = new ja0(textView, AndroidUtilities.dp(90.0f), 0, e6Var);
        ja0Var.a(org.telegram.ui.ActionBar.i6.m1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.i6.m1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ja0Var, 0, 1, 33);
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
        final m5 y3 = m5.y(i10, false);
        final long j3 = starGift.id;
        final ii.q1 q1Var = new ii.q1(textView, 29);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: yh.w4
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                m5 m5Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (m5Var = m5.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(m5Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                q1Var.run(J);
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
            q1Var.run(J);
        }
    }

    public static void H0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new p6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (i0 == null) {
            i0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
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
                i10 = -1;
                d = 1.0E9d;
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

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
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

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount) {
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

    public static String N0(long j3) {
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
    public static String O0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
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
            return LocaleController.formatString(R.string.StarTransactionCommission, ei.l.H0(starsTransaction.starref_commission_permille));
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

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7) {
        return Q0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        er erVar = new er(R.drawable.diamond, 0);
        erVar.recolorDrawable = false;
        erVar.translate(0.0f, f10);
        erVar.spaceScaleX = f11;
        erVar.setScale(f7, f7);
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder R0(CharSequence charSequence) {
        return S0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, er[] erVarArr) {
        return V0(false, charSequence, f7, erVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, er[] erVarArr, float f10, float f11) {
        er erVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            erVar = new er(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (erVarArr != null) {
                erVarArr[0] = erVar;
            }
        }
        erVar.translate(0.0f, f10);
        erVar.spaceScaleX = f11;
        if (z10) {
            erVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            erVar.setScale(f12, f12);
        } else {
            erVar.setScale(f7, f7);
        }
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, er[] erVarArr) {
        er erVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            erVar = new er(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            erVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (z10) {
            erVar.recolorDrawable = false;
        }
        if (erVarArr != null) {
            erVarArr[0] = erVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, er[] erVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, erVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, er[] erVarArr) {
        er erVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            if (erVarArr == null || erVarArr.length <= 0) {
                erVar = new er(i10, 0);
            } else {
                erVar = new er(i10, 0);
                erVarArr[0] = erVar;
            }
        }
        erVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        erVar.setScale(f7, f7);
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static y11 Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final m4.f0 f0Var = new m4.f0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        f0Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new y11(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: yh.a6
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
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: yh.a6
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

    public static void a1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.l(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        a1(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void c1(y9 y9Var, ImageReceiver imageReceiver, long j3) {
        Z0(y9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static y11 d1(y9 y9Var, ImageReceiver imageReceiver, int i10) {
        return Z0(y9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void e1(y9 y9Var, ImageReceiver imageReceiver, long j3) {
        Z0(y9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void f1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = bi.i(1, context, e6Var, false);
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.x5.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        r6 r6Var = new r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.x5.d(-1.0f, -1));
        int i12 = 2;
        sg.n nVar = new sg.n(context, 1, 2);
        sg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.i6.fk;
        gVar.A = org.telegram.ui.ActionBar.i6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(20.0f), -6915073));
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
        er erVar = new er(R.drawable.mini_boost_badge, 2);
        erVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        e7.addView(h, w7.x5.t(-2, 20, 17, 20, 4, 20, 4));
        r01 r01Var = new r01(context, e6Var);
        r01Var.m(LocaleController.getString(R.string.BoostFrom), i10, j3, new o5(f3VarArr, j3, i12));
        r01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            xh.q0 q0Var = new xh.q0(f3VarArr, j3, boost, 3);
            f3VarArr = f3VarArr;
            r01Var.h(string, string2, q0Var);
        }
        r01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        r01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e7.addView(r01Var, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        ea0 ea0Var = new ea0(context, e6Var);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new di.a(context, 9)));
        ea0Var.setGravity(17);
        e7.addView(ea0Var, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ci.d dVar = new ci.d(context, e6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new u5(f3VarArr, 1));
        e7.addView(dVar, w7.x5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e7;
        f3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new f0(nVar, 7));
    }

    public static h0 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.e6 e6Var) {
        zf.b bVar = zf.b.a;
        h0 h0Var = new h0(context, e6Var, i10, tL_starGiftUnique == null ? zf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(zf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new org.telegram.ui.Wallet.z6(16, callback2, r8));
        h0[] h0VarArr = {h0Var};
        h0Var.show();
        return h0VarArr[0];
    }

    public static void h1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        org.telegram.ui.ActionBar.f3 i10 = bi.i(1, context, e6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        bi.j(20.0f, R.string.PaidContentTitle, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        linearLayout.addView(textView, w7.x5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        zd0 zd0Var = new zd0(context, e6Var);
        zd0Var.setForceForceUseCenter(true);
        zd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        zd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ci.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        int i12 = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uf, e6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.vf, e6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new ei.w1(zd0Var, editTextBoldCursor, i12));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.x5.o(-1, -2, 1.0f, 119));
        zd0Var.e(editTextBoldCursor);
        zd0Var.addView(linearLayout2, w7.x5.e(-1, -2, 48));
        linearLayout.addView(zd0Var, w7.x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A6, false));
        zd0Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        ea0 ea0Var = new ea0(context, null);
        ea0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new di.a(context, 10)), true));
        ea0Var.setTextSize(1, 12.0f);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        linearLayout.addView(ea0Var, w7.x5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ci.d f7 = bi.f(24, context, e6Var, true);
        f7.g(LocaleController.getString(j3 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(f7, w7.x5.n(-1, 48));
        if (j3 > 0 && z10) {
            dVar = bi.f(24, context, e6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i10.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {i10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new q6(editTextBoldCursor, zd0Var, j3, z10, f7, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yh.c6
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
                f7.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new e6(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        f7.setOnClickListener(new d6(zArr, callback2, editTextBoldCursor, f7, f3VarArr2));
        if (dVar != null) {
            ci.d dVar2 = dVar;
            d6 d6Var = new d6(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(d6Var);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new ai.g5(editTextBoldCursor, 13));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new e6(f3VarArr, editTextBoldCursor), R instanceof zn ? ((zn) R).U9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x102e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1095  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1079  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0f2a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f3c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0fb0  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f3 i1(final Context context, final boolean z10, final long j3, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.e6 e6Var) {
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
        org.telegram.ui.ActionBar.e6 e6Var2;
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
        org.telegram.ui.ActionBar.e6 e6Var3;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.f3[] f3VarArr4;
        Context context3;
        int i14;
        r01 r01Var;
        final org.telegram.ui.ActionBar.f3[] f3VarArr5;
        r01 r01Var2;
        r01 r01Var3;
        r01 r01Var4;
        r01 r01Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.n2 U;
        TLRPC.Chat chat;
        int i15;
        ImageLocation forDocument2;
        r01 r01Var6;
        final int i16;
        r01 r01Var7;
        final org.telegram.ui.ActionBar.f3[] f3VarArr6;
        long j12;
        r01 r01Var8;
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
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context, e6Var, false, false);
        f3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.f3[] f3VarArr7 = new org.telegram.ui.ActionBar.f3[1];
        final LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                f3VarArr = f3VarArr7;
                f3Var = f3Var2;
                v6 v6Var = new v6(context, matrix, radialGradient, paint, q5Var);
                q5Var.l(v6Var);
                q5Var.i(stargiftattributepattern.document, false);
                v6Var.setOrientation(1);
                y9 y9Var = new y9(context);
                b1(y9Var.getImageReceiver(), starsTransaction.stargift, 160);
                v6Var.addView(y9Var, w7.x5.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    w7.z5.a(y9Var);
                    y9Var.setOnClickListener(new sa(context, i10, tL_starGiftUnique, 23));
                }
                TextView b10 = w7.b6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                v6Var.addView(b10, w7.x5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.b6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                v6Var.addView(b11, w7.x5.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.b6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(U0(starsAmount3, TextUtils.concat(positive ? "+" : "", J0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                v6Var.addView(b12, w7.x5.t(-2, -2, 17, 0, 11, 0, 17));
                e7.addView(v6Var, w7.x5.n(-1, -2));
                e6Var2 = e6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = e7;
                str = "";
                z12 = z18;
                f3VarArr2 = f3VarArr;
                f7 = 16.0f;
                r01 r01Var9 = new r01(context2, e6Var2);
                starGift = starsTransaction2.stargift;
                int i18 = 24;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            cd cdVar = (cd) ((o01) r01Var9.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            m5.w(i10).M(tL_inputSavedStarGiftUser, new fi.m0(cdVar, i10, context5, e6Var2, 5));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable o5Var = new o5(f3VarArr2, peerDialogId, 1);
                            i14 = i10;
                            r01 r01Var10 = r01Var9;
                            org.telegram.ui.ActionBar.f3[] f3VarArr8 = f3VarArr2;
                            e6Var3 = e6Var;
                            r01Var10.m(string2, i14, peerDialogId, o5Var);
                            context3 = context;
                            viewGroup = viewGroup2;
                            f3VarArr4 = f3VarArr8;
                            r01Var5 = r01Var10;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j3;
                                }
                                chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat != null) {
                                    ea0 ea0Var = new ea0(context3, e6Var3);
                                    ea0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i19 = org.telegram.ui.ActionBar.i6.gc;
                                    ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i19, e6Var3));
                                    ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, e6Var3));
                                    ea0Var.setTextSize(1, 14.0f);
                                    ea0Var.setDisablePaddingsOffsetY(true);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                                    if (starsTransaction4.extended_media.isEmpty()) {
                                        z14 = z15;
                                    } else {
                                        ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                                        int size = arrayList.size();
                                        z14 = z15;
                                        int i20 = 0;
                                        int i21 = 0;
                                        while (i20 < size) {
                                            TLRPC.MessageMedia messageMedia = arrayList.get(i20);
                                            int i22 = i20 + 1;
                                            TLRPC.MessageMedia messageMedia2 = messageMedia;
                                            ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                            int i23 = size;
                                            w70 w70Var = new w70(ea0Var, 24.0f, i14);
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                i15 = i21;
                                                forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                            } else {
                                                i15 = i21;
                                                forDocument2 = messageMedia2 instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document) : null;
                                            }
                                            if (forDocument2 != null) {
                                                w70Var.a(6.0f);
                                                w70Var.b.setImage(forDocument2, "24_24", null, null, null, 0);
                                                SpannableString spannableString = new SpannableString("x");
                                                spannableString.setSpan(w70Var, 0, spannableString.length(), 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString);
                                                spannableStringBuilder2.append((CharSequence) " ");
                                                i21 = i15 + 1;
                                            } else {
                                                i21 = i15;
                                            }
                                            if (i21 >= 3) {
                                                break;
                                            }
                                            i20 = i22;
                                            size = i23;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    spannableStringBuilder2.append((CharSequence) " ");
                                    int length = spannableStringBuilder2.length();
                                    String publicUsername = ChatObject.getPublicUsername(chat);
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        a1.g.A(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                                        sb2.append(starsTransaction4.msg_id);
                                        spannableStringBuilder2.append((CharSequence) sb2.toString());
                                    }
                                    p5 p5Var = new p5(f3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new l6(p5Var), length, spannableStringBuilder2.length(), 33);
                                    ea0Var.setSingleLine(true);
                                    ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                                    ea0Var.setText(spannableStringBuilder2);
                                    ea0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(p5Var, 26));
                                    r01Var5.k(ea0Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                    if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                        String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                        String str3 = starsTransaction4.id;
                                        r01Var5.j(string3, str3, str3.length() <= 25 ? 9 : 10, new t5(0, f3VarArr4, e6Var3));
                                    }
                                    if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                        r01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                                    }
                                    r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                                    starGift2 = starsTransaction4.stargift;
                                    if (starGift2 != null) {
                                        if (starGift2.limited) {
                                            G0(r01Var5, i14, starGift2, e6Var3);
                                        }
                                        if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                            r01Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                        }
                                    }
                                    ViewGroup viewGroup3 = viewGroup;
                                    viewGroup3.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                                    if ((starsTransaction4.flags & 32) != 0) {
                                        r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                                    }
                                    if (z14) {
                                        context4 = context;
                                        ea0 ea0Var2 = new ea0(context4, e6Var3);
                                        ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var3));
                                        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var3));
                                        ea0Var2.setTextSize(1, 14.0f);
                                        ea0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new di.a(context4, 6)));
                                        ea0Var2.setGravity(17);
                                        viewGroup3.addView(ea0Var2, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                                    } else {
                                        context4 = context;
                                    }
                                    ci.d dVar = new ci.d(context4, e6Var3);
                                    dVar.e();
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                                    } else {
                                        dVar.h(LocaleController.getString(R.string.OK));
                                    }
                                    viewGroup3.addView(dVar, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                                    org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                    f3Var3.customView = viewGroup3;
                                    int i24 = 0;
                                    f3VarArr4[0] = f3Var3;
                                    f3Var3.useBackgroundTopPadding = false;
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.setOnClickListener(new xh.a(13, context4, starsTransaction4));
                                    } else {
                                        dVar.setOnClickListener(new u5(f3VarArr4, i24));
                                    }
                                    f3VarArr4[0].fixNavigationBar();
                                    U = LaunchActivity.U();
                                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                        f3VarArr4[0].makeAttached(U);
                                    }
                                    f3VarArr4[0].show();
                                    return f3VarArr4[0];
                                }
                            }
                            z14 = z15;
                            if (!TextUtils.isEmpty(starsTransaction4.id)) {
                                String string32 = LocaleController.getString(R.string.StarsTransactionID);
                                String str32 = starsTransaction4.id;
                                r01Var5.j(string32, str32, str32.length() <= 25 ? 9 : 10, new t5(0, f3VarArr4, e6Var3));
                            }
                            if (starsTransaction4.floodskip) {
                                r01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                            }
                            ViewGroup viewGroup32 = viewGroup;
                            viewGroup32.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                            }
                            if (z14) {
                            }
                            ci.d dVar2 = new ci.d(context4, e6Var3);
                            dVar2.e();
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            viewGroup32.addView(dVar2, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.f3 f3Var32 = f3Var;
                            f3Var32.customView = viewGroup32;
                            int i242 = 0;
                            f3VarArr4[0] = f3Var32;
                            f3Var32.useBackgroundTopPadding = false;
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            f3VarArr4[0].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet()) {
                                f3VarArr4[0].makeAttached(U);
                            }
                            f3VarArr4[0].show();
                            return f3VarArr4[0];
                        }
                        org.telegram.ui.ActionBar.f3[] f3VarArr9 = f3VarArr2;
                        i14 = i10;
                        e6Var3 = e6Var;
                        r01Var6 = r01Var9;
                        viewGroup = viewGroup2;
                        f3VarArr4 = f3VarArr9;
                    } else {
                        f3VarArr5 = f3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        e6Var3 = e6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                r01Var9.h(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new bi0(context6, i10, str4, i18));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        r01Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        r01Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j12 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    r01Var9.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j12 = peerDialogId3;
                                } else {
                                    r01Var9.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j12 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                r01Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j12 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                r01Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j12 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j14 = peerDialogId3;
                                final int i25 = 0;
                                r01Var8 = r01Var9;
                                viewGroup = linearLayout;
                                j13 = clientUserId;
                                r01Var8.m(LocaleController.getString(R.string.Gift2From), i10, j14, new Runnable() { // from class: yh.v5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j15 = j14;
                                                    Bundle f10 = sc.v.f(j15, "user_id");
                                                    if (j15 == clientUserId) {
                                                        f10.putBoolean("my_profile", true);
                                                    }
                                                    f10.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(f10, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j16 = j14;
                                                    Bundle f11 = sc.v.f(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        f11.putBoolean("my_profile", true);
                                                    }
                                                    f11.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(f11, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                r01Var8 = r01Var9;
                                j13 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j12 != j13) {
                                final long j15 = j13;
                                final int i26 = 1;
                                final long j16 = j12;
                                r01Var8.m(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() { // from class: yh.v5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j152 = j16;
                                                    Bundle f10 = sc.v.f(j152, "user_id");
                                                    if (j152 == j15) {
                                                        f10.putBoolean("my_profile", true);
                                                    }
                                                    f10.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(f10, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j162 = j16;
                                                    Bundle f11 = sc.v.f(j162, "user_id");
                                                    if (j162 == j15) {
                                                        f11.putBoolean("my_profile", true);
                                                    }
                                                    f11.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(f11, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            r01 r01Var11 = r01Var8;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    er[] erVarArr = new er[1];
                                    r01Var11.d(X0(starsTransaction4.amount, "⭐️ " + ((Object) J0(tL_starsTonAmount)), erVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    er erVar = erVarArr[0];
                                    if (erVar != null) {
                                        erVar.setOverrideColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var3));
                                    }
                                } else {
                                    r01Var11.d(Y0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.q.h(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            r01Var4 = r01Var11;
                            context3 = context6;
                            f3VarArr4 = f3VarArr5;
                            r01Var = r01Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                r01Var6 = r01Var9;
                                f3VarArr4 = f3VarArr5;
                            } else {
                                long clientUserId2 = j3 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j3;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable p5Var2 = new p5(f3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i27 = 0;
                                        i16 = i10;
                                        Runnable runnable = new Runnable() { // from class: yh.s5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i27) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var4);
                                                        new xh.r1(context6, i16, peerDialogId4, null, new ii.q1(f3Var4, 28)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var5);
                                                        new xh.r1(context6, i16, peerDialogId4, null, new ii.q1(f3Var5, 28)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        r01 r01Var12 = r01Var9;
                                        f3VarArr6 = f3VarArr5;
                                        r01Var12.l(string4, i16, peerDialogId4, p5Var2, string5, runnable);
                                        r01Var7 = r01Var12;
                                    } else {
                                        i16 = i10;
                                        r01Var7 = r01Var9;
                                        f3VarArr6 = f3VarArr5;
                                    }
                                    final int i28 = 1;
                                    r01Var7.m(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: yh.q5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
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
                                    r01Var3 = r01Var7;
                                } else {
                                    long j17 = clientUserId2;
                                    if (peerDialogId4 != j17) {
                                        final int i29 = 2;
                                        r01Var9.m(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() { // from class: yh.q5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i29) {
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
                                    Runnable p5Var3 = new p5(f3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i30 = 1;
                                    r01 r01Var13 = r01Var9;
                                    f3VarArr3 = f3VarArr5;
                                    r01Var13.l(string6, i10, peerDialogId4, p5Var3, string7, new Runnable() { // from class: yh.s5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i30) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var4);
                                                    new xh.r1(context, i10, peerDialogId4, null, new ii.q1(f3Var4, 28)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var5);
                                                    new xh.r1(context, i10, peerDialogId4, null, new ii.q1(f3Var5, 28)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    r01Var3 = r01Var13;
                                }
                                org.telegram.ui.ActionBar.f3[] f3VarArr10 = f3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                f3VarArr4 = f3VarArr10;
                                context3 = context;
                                i14 = i10;
                                r01Var = r01Var3;
                            }
                        }
                    }
                    context3 = context;
                    r01Var5 = r01Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId22 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                        if (z10) {
                        }
                        chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId22));
                        if (chat != null) {
                        }
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ci.d dVar22 = new ci.d(context4, e6Var3);
                    dVar22.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322.addView(dVar22, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var322 = f3Var;
                    f3Var322.customView = viewGroup322;
                    int i2422 = 0;
                    f3VarArr4[0] = f3Var322;
                    f3Var322.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                r01 r01Var14 = r01Var9;
                f3VarArr3 = f3VarArr2;
                e6Var3 = e6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    starsTransaction4 = starsTransaction3;
                    f3VarArr4 = f3VarArr3;
                    context3 = context;
                    i14 = i10;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            ea0 ea0Var3 = new ea0(context3, e6Var3);
                            ea0Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            ea0Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i31 = org.telegram.ui.ActionBar.i6.gc;
                            ea0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i31, e6Var3));
                            ea0Var3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i31, e6Var3));
                            ea0Var3.setTextSize(1, 14.0f);
                            ea0Var3.setSingleLine(true);
                            ea0Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(ea0Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            fr a2 = j7.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f7);
                            int dp2 = AndroidUtilities.dp(f7);
                            a2.e = dp;
                            a2.f = dp2;
                            g5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(g5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new k6(f3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            ea0Var3.setText(spannableStringBuilder3);
                            r01Var14.k(ea0Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            r01Var5 = r01Var14;
                        } else {
                            r01Var14.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            r01Var5 = r01Var14;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        r01Var14.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        r01Var5 = r01Var14;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        r01Var14.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        r01Var5 = r01Var14;
                    } else {
                        r01Var5 = r01Var14;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            r01Var14.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            r01Var5 = r01Var14;
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
                    r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup3222 = viewGroup;
                    viewGroup3222.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ci.d dVar222 = new ci.d(context4, e6Var3);
                    dVar222.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup3222.addView(dVar222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var3222 = f3Var;
                    f3Var3222.customView = viewGroup3222;
                    int i24222 = 0;
                    f3VarArr4[0] = f3Var3222;
                    f3Var3222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
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
                    r01Var14.m(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new o5(f3VarArr3, peerDialogId5, 3));
                    r01Var3 = r01Var14;
                    if (starsTransaction3.starref_amount != null) {
                        r01Var3 = r01Var14;
                        if (starsTransaction3.starref_commission_permille > 0) {
                            r01Var14.d(Y0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.q.h(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            r01Var3 = r01Var14;
                        }
                    }
                } else {
                    if (z11) {
                        long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                        r01Var14.h(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new o5(f3VarArr3, j3, 4));
                        r01Var14.m(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId6, new o5(f3VarArr3, peerDialogId6, 5));
                        i14 = i10;
                        r01Var14.m(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new o5(f3VarArr3, peerDialogId5, 6));
                        r01Var2 = r01Var14;
                        r01Var2.d(ei.l.H0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                        starsTransaction4 = starsTransaction3;
                        f3VarArr4 = f3VarArr3;
                        context3 = context;
                    } else if (z12) {
                        r01Var14.h(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ai.p0(i10, context, j3, peerDialogId5, f3VarArr3, e6Var3));
                        r01 r01Var15 = r01Var14;
                        r01Var15.m(LocaleController.getString(R.string.StarAffiliateMiniApp), i10, peerDialogId5, new o5(f3VarArr3, peerDialogId5, 0));
                        r01Var3 = r01Var15;
                    } else if (z19) {
                        r01Var14.m(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new p5(f3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i32 = 0;
                        r01Var14.m(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: yh.q5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i32) {
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
                        r01Var2 = r01Var14;
                        String string9 = LocaleController.getString(R.string.StarGiveawayReason);
                        String string10 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                        Runnable p5Var4 = new p5(f3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        r01Var2.h(string9, string10, p5Var4);
                        r01Var2.d(M0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        context3 = context;
                        i14 = i10;
                        f3VarArr4 = f3VarArr3;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i33 = 1;
                                r01Var14.m(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: yh.r5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i33) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j18 = peerDialogId5;
                                                if (!UserObject.isService(j18)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(zn.W9(j18));
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
                                                        U3.presentFragment(zn.W9(j19));
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
                                                        U4.presentFragment(zn.W9(j20));
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
                                r01Var14.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i34 = 2;
                                f3VarArr4 = f3VarArr3;
                                r01 r01Var16 = r01Var14;
                                context3 = context;
                                i14 = i10;
                                r01Var16.m(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: yh.r5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i34) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j18 = peerDialogId5;
                                                if (!UserObject.isService(j18)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(zn.W9(j18));
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
                                                        U3.presentFragment(zn.W9(j19));
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
                                                        U4.presentFragment(zn.W9(j20));
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
                                r01Var = r01Var16;
                            }
                            i14 = i10;
                            r01Var = r01Var14;
                            f3VarArr4 = f3VarArr3;
                            context3 = context;
                        } else {
                            final int i35 = 0;
                            f3VarArr5 = f3VarArr3;
                            r01 r01Var17 = r01Var14;
                            i14 = i10;
                            r01Var17.m(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: yh.r5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i35) {
                                        case 0:
                                            f3VarArr3[0].dismiss();
                                            long j18 = peerDialogId5;
                                            if (!UserObject.isService(j18)) {
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(zn.W9(j18));
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
                                                    U3.presentFragment(zn.W9(j19));
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
                                                    U4.presentFragment(zn.W9(j20));
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
                            r01Var4 = r01Var17;
                            f3VarArr4 = f3VarArr5;
                            r01Var = r01Var4;
                        }
                    }
                    r01Var = r01Var2;
                }
                org.telegram.ui.ActionBar.f3[] f3VarArr102 = f3VarArr3;
                starsTransaction4 = starsTransaction3;
                f3VarArr4 = f3VarArr102;
                context3 = context;
                i14 = i10;
                r01Var = r01Var3;
                r01Var5 = r01Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32222 = viewGroup;
                viewGroup32222.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ci.d dVar2222 = new ci.d(context4, e6Var3);
                dVar2222.e();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup32222.addView(dVar2222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var32222 = f3Var;
                f3Var32222.customView = viewGroup32222;
                int i242222 = 0;
                f3VarArr4[0] = f3Var32222;
                f3Var32222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) == 0) {
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
        final y9 y9Var2 = new y9(context);
        if (starsTransaction.premium_gift) {
            d1(y9Var2, y9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            e7.addView(y9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            fr a10 = org.telegram.ui.Cells.v6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            y9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e7;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j10 = j3;
                    e6Var2 = e6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        e1(y9Var2, y9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        c1(y9Var2, y9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(y9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e7;
                    z13 = z10;
                    j10 = j3;
                    e6Var2 = e6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            y9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            y9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j11 = j10;
                                j9 j9Var = new j9();
                                if (j11 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                                    j9Var.r(user2);
                                    y9Var2.e(user2, j9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                                    j9Var.q(chat2);
                                    y9Var2.e(chat2, j9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j11 = DialogObject.getPeerDialogId(peer);
                            j9 j9Var2 = new j9();
                            if (j11 < 0) {
                            }
                        }
                        linearLayout.addView(y9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        fr a11 = org.telegram.ui.Cells.v6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        y9Var2.setImageDrawable(a11);
                    }
                } else {
                    y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        y9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        e7.addView(y9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: yh.n5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction5.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i36);
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
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), e6Var);
                                PhotoViewer.t1().b2(arrayList3, 0, peerDialogId7, 0L, 0L, new w6(y9Var2, e7, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        e6Var2 = e6Var;
                        i11 = i10;
                        linearLayout = e7;
                        j10 = j3;
                        y9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    y9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    e7.addView(y9Var2, w7.x5.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: yh.n5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j3 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction5.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i36);
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
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), e6Var);
                            PhotoViewer.t1().b2(arrayList3, 0, peerDialogId7, 0L, 0L, new w6(y9Var2, e7, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    e6Var2 = e6Var;
                    i11 = i10;
                    linearLayout = e7;
                    j10 = j3;
                    y9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.i6.j5;
                org.telegram.ui.Cells.c1.n(i12, e6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(O0(i11, z13, starsTransaction2));
                TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                h.setTextSize(1, 18.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(org.telegram.ui.ActionBar.i6.w0(!positive ? org.telegram.ui.ActionBar.i6.uj : org.telegram.ui.ActionBar.i6.wj, e6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                h.setText(Y0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(h.getText());
                if (!starsTransaction2.refund) {
                    H0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, e6Var2));
                    H0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.yj, e6Var2));
                    H0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsPending));
                }
                h.setText(spannableStringBuilder4);
                linearLayout.addView(h, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    ea0 ea0Var4 = new ea0(context2);
                    ea0Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2));
                    ea0Var4.setTextSize(1, 14.0f);
                    ea0Var4.setGravity(17);
                    ea0Var4.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                    ea0Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, ei.l.H0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j10 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new ei.b2(j10, i11, 3)), true));
                    }
                    ea0Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(ea0Var4, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    r01 r01Var92 = new r01(context2, e6Var2);
                    starGift = starsTransaction2.stargift;
                    int i182 = 24;
                    if (starGift == null) {
                    }
                    r01Var5 = r01Var;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322222 = viewGroup;
                    viewGroup322222.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ci.d dVar22222 = new ci.d(context4, e6Var3);
                    dVar22222.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322222.addView(dVar22222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var322222 = f3Var;
                    f3Var322222.customView = viewGroup322222;
                    int i2422222 = 0;
                    f3VarArr4[0] = f3Var322222;
                    f3Var322222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
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
                        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        h.setText(Y0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(J0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    ea0 ea0Var5 = new ea0(context2);
                    ea0Var5.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2));
                    f7 = 16.0f;
                    ea0Var5.setTextSize(i13, 16.0f);
                    ea0Var5.setGravity(17);
                    ea0Var5.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                    ea0Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i36 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i36, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    f3VarArr2 = f3VarArr;
                    ea0Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new n51(context2, f3VarArr2)), true)));
                    linearLayout.addView(ea0Var5, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        bi.o(i12, e6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                r01 r01Var922 = new r01(context2, e6Var2);
                starGift = starsTransaction2.stargift;
                int i1822 = 24;
                if (starGift == null) {
                }
                r01Var5 = r01Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222222 = viewGroup;
                viewGroup3222222.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ci.d dVar222222 = new ci.d(context4, e6Var3);
                dVar222222.e();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup3222222.addView(dVar222222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var3222222 = f3Var;
                f3Var3222222.customView = viewGroup3222222;
                int i24222222 = 0;
                f3VarArr4[0] = f3Var3222222;
                f3Var3222222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                y9Var2.setImageDrawable(new h3(y9Var2, starsTransaction.stargift, 94, 0.44f));
                e7.addView(y9Var2, w7.x5.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                b1(y9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                e7.addView(y9Var2, w7.x5.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        e6Var2 = e6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = e7;
        str = "";
        z12 = z18;
        z13 = z10;
        j10 = j3;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.Cells.c1.n(i12, e6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(O0(i11, z13, starsTransaction2));
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout, textView3, w7.x5.t(-1, -2, 17, 36, 0, 36, 4), context2);
        h10.setTextSize(1, 18.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.i6.w0(!positive ? org.telegram.ui.ActionBar.i6.uj : org.telegram.ui.ActionBar.i6.wj, e6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        h10.setText(Y0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount52), " ⭐️"), 0.8f, null));
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
            bi.o(i12, e6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.x5.t(-1, -2, 17, 36, 0, 36, 4));
        }
        r01 r01Var9222 = new r01(context2, e6Var2);
        starGift = starsTransaction2.stargift;
        int i18222 = 24;
        if (starGift == null) {
        }
        r01Var5 = r01Var;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        r01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222222 = viewGroup;
        viewGroup32222222.addView(r01Var5, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        ci.d dVar2222222 = new ci.d(context4, e6Var3);
        dVar2222222.e();
        if ((starsTransaction4.flags & 32) == 0) {
        }
        viewGroup32222222.addView(dVar2222222, w7.x5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.f3 f3Var32222222 = f3Var;
        f3Var32222222.customView = viewGroup32222222;
        int i242222222 = 0;
        f3VarArr4[0] = f3Var32222222;
        f3Var32222222.useBackgroundTopPadding = false;
        if ((starsTransaction4.flags & 32) == 0) {
        }
        f3VarArr4[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        f3VarArr4[0].show();
        return f3VarArr4[0];
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.e6 e6Var) {
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
        i1(activity, false, 0L, i10, starsTransaction, e6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.e6 e6Var) {
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
        i1(context, false, 0L, i10, starsTransaction, e6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0507  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.r01] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v36, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y0(p7 p7Var, int i10) {
        p61 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        int i12;
        ?? r01Var;
        int i13;
        String str2;
        boolean z13;
        boolean z14;
        long currentTime;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2;
        final int i14;
        ?? r62;
        org.telegram.ui.ActionBar.n2 U;
        s6 s6Var = p7Var.g0;
        if (s6Var == null || (G = s6Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            p7Var.g0.N(true);
            return;
        }
        if (i15 == -2) {
            m5.y(p7Var.currentAccount, false).u();
            tg.m1.f0(1, BirthdayController.getInstance(p7Var.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            m5.y(p7Var.currentAccount, false).W();
            p7Var.g0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(p7Var.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(p7Var.currentAccount);
                return;
            } else {
                p7Var.presentFragment(new ei.e4(p7Var.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 4;
        if (G.G(b7.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                m5.y(p7Var.currentAccount, false).f(p7Var.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new qh.r(i16, p7Var, G), null);
                return;
            }
            return;
        }
        if (G.G(g7.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = p7Var.getParentActivity();
            int i17 = p7Var.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.e6 resourceProvider = p7Var.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, resourceProvider, false);
            f3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.f3[] f3VarArr3 = new org.telegram.ui.ActionBar.f3[1];
            ?? e7 = org.telegram.messenger.q.e(parentActivity, 1);
            e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            e7.setClipChildren(false);
            e7.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            e7.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            m6 m6Var = new m6(zArr, f3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(m6Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            y9 y9Var = new y9(parentActivity);
            if (peerDialogId >= 0) {
                z10 = 0;
                ?? user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                str = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z11 = !isBot;
                z12 = isBot;
                chat = user;
            } else {
                z10 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                z11 = false;
                z12 = false;
                chat = chat3;
            }
            String str3 = str;
            if (starsSubscription.photo != null) {
                y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    f3VarArr = f3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    j9Var.q(chat4);
                    y9Var.e(chat4, j9Var);
                    frameLayout.addView(y9Var, w7.x5.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
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
                    org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    e7.addView(textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        int i18 = R.string.StarsSubscriptionPrice;
                        Long valueOf = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        Object[] objArr = new Object[1];
                        objArr[z10] = valueOf;
                        textView2.setText(Y0(z10, LocaleController.formatString(i18, objArr), 0.8f, null));
                    } else {
                        textView2.setText(Y0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    e7.addView(textView2, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
                    r01Var = new r01(parentActivity, resourceProvider);
                    ea0 ea0Var = new ea0(parentActivity, resourceProvider);
                    ea0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.i6.gc;
                    ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                    ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                    ea0Var.setTextSize(1, 14.0f);
                    ea0Var.setSingleLine(true);
                    ea0Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(ea0Var, 24.0f, i11);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        z13 = user2 == null || UserObject.isDeleted(user2);
                        String userName = UserObject.getUserName(user2);
                        g5Var.e(user2);
                        i13 = i11;
                        str2 = userName;
                    } else {
                        i13 = i11;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        boolean z15 = chat5 == null;
                        str2 = chat5 != null ? chat5.title : "";
                        g5Var.b(chat5);
                        z13 = z15;
                    }
                    z14 = z13;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.f3[] f3VarArr4 = f3VarArr;
                    spannableStringBuilder.setSpan(new n6(f3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    ea0Var.setText(spannableStringBuilder);
                    if (!z14) {
                        r01Var.k(ea0Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z11 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        r01Var.c(LocaleController.getString(!z11 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    r01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                    r01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e7.addView(r01Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    ea0 ea0Var2 = new ea0(parentActivity, resourceProvider);
                    int i20 = org.telegram.ui.ActionBar.i6.z6;
                    ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, resourceProvider));
                    ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                    final int i21 = 1;
                    ea0Var2.setTextSize(1, 14.0f);
                    ea0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i22 = i21;
                            Activity activity = parentActivity;
                            switch (i22) {
                                case 0:
                                    if (activity.isFinishing()) {
                                        return;
                                    }
                                    Handler handler = e.g;
                                    Method method = e.f;
                                    int i23 = Build.VERSION.SDK_INT;
                                    if (i23 >= 28) {
                                        activity.recreate();
                                        return;
                                    }
                                    if (((i23 != 26 && i23 != 27) || method != null) && (e.e != null || e.d != null)) {
                                        try {
                                            Object obj2 = e.c.get(activity);
                                            if (obj2 != null && (obj = e.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                d dVar = new d(activity);
                                                application.registerActivityLifecycleCallbacks(dVar);
                                                handler.post(new i9.s(11, dVar, obj2));
                                                try {
                                                    if (i23 == 26 || i23 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new i9.s(12, application, dVar));
                                                    return;
                                                } finally {
                                                    handler.post(new i9.s(12, application, dVar));
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
                    ea0Var2.setGravity(17);
                    e7.addView(ea0Var2, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        f3VarArr2 = f3VarArr4;
                        i14 = i13;
                        ea0 ea0Var3 = new ea0(parentActivity, resourceProvider);
                        ea0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, resourceProvider));
                        ea0Var3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                        ea0Var3.setTextSize(1, 14.0f);
                        ea0Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        ea0Var3.setSingleLine(false);
                        ea0Var3.setMaxLines(4);
                        ea0Var3.setGravity(17);
                        e7.addView(ea0Var3, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            ci.d dVar = new ci.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r62 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            e7.addView(dVar, w7.x5.n(-1, 48));
                            du duVar = new du(dVar, starsSubscription, i14, f3VarArr2, resourceProvider, zArr, parentActivity);
                            i14 = i14;
                            dVar.setOnClickListener(duVar);
                            f3Var.customView = e7;
                            f3VarArr2[r62] = f3Var;
                            f3Var.useBackgroundTopPadding = r62;
                            f3Var.setOnDismissListener(new qg.s(i14, m6Var));
                            f3VarArr2[r62].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr2[r62].makeAttached(U);
                            }
                            f3VarArr2[r62].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        ea0 ea0Var4 = new ea0(parentActivity, resourceProvider);
                        ea0Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, resourceProvider));
                        ea0Var4.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                        ea0Var4.setTextSize(1, 14.0f);
                        ea0Var4.setText(LocaleController.formatString(z12 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        ea0Var4.setSingleLine(false);
                        ea0Var4.setMaxLines(4);
                        ea0Var4.setGravity(17);
                        e7.addView(ea0Var4, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        ci.d dVar2 = new ci.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z12 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        e7.addView(dVar2, w7.x5.n(-1, 48));
                        f3VarArr2 = f3VarArr4;
                        int i22 = i13;
                        f6 f6Var = new f6(dVar2, i22, starsSubscription, f3VarArr2, peerDialogId, parentActivity, resourceProvider, z11, str3);
                        i14 = i22;
                        dVar2.setOnClickListener(f6Var);
                    } else {
                        final boolean z16 = z11;
                        f3VarArr2 = f3VarArr4;
                        i14 = i13;
                        if (starsSubscription.bot_canceled) {
                            ea0 ea0Var5 = new ea0(parentActivity, resourceProvider);
                            ea0Var5.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, resourceProvider));
                            ea0Var5.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                            ea0Var5.setTextSize(1, 14.0f);
                            ea0Var5.setText(LocaleController.getString(z16 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            ea0Var5.setSingleLine(false);
                            ea0Var5.setMaxLines(4);
                            ea0Var5.setGravity(17);
                            e7.addView(ea0Var5, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            ea0 ea0Var6 = new ea0(parentActivity, resourceProvider);
                            ea0Var6.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, resourceProvider));
                            ea0Var6.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                            ea0Var6.setTextSize(1, 14.0f);
                            ea0Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            ea0Var6.setSingleLine(false);
                            ea0Var6.setMaxLines(4);
                            ea0Var6.setGravity(17);
                            e7.addView(ea0Var6, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                ci.d dVar3 = new ci.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                e7.addView(dVar3, w7.x5.n(-1, 48));
                                ei.m3 m3Var = new ei.m3(dVar3, starsSubscription, i14, f3VarArr2, chat2, str3);
                                i14 = i14;
                                dVar3.setOnClickListener(m3Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            ea0 ea0Var7 = new ea0(parentActivity, resourceProvider);
                            ea0Var7.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, resourceProvider));
                            ea0Var7.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i19, resourceProvider));
                            ea0Var7.setTextSize(1, 14.0f);
                            ea0Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            ea0Var7.setSingleLine(false);
                            ea0Var7.setMaxLines(4);
                            ea0Var7.setGravity(17);
                            e7.addView(ea0Var7, w7.x5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final ci.d dVar4 = new ci.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.wj, resourceProvider));
                            e7.addView(dVar4, w7.x5.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: yh.g6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final ci.d dVar5 = dVar4;
                                    if (dVar5.N) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i23 = i14;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i23);
                                    final TLObject tLObject = chat6;
                                    final boolean z17 = z16;
                                    final boolean z18 = z12;
                                    final org.telegram.ui.ActionBar.f3[] f3VarArr5 = f3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: yh.i6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new ki.h0(i23, dVar5, tLObject, starsSubscription2, z17, z18, f3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r62 = 0;
                    f3Var.customView = e7;
                    f3VarArr2[r62] = f3Var;
                    f3Var.useBackgroundTopPadding = r62;
                    f3Var.setOnDismissListener(new qg.s(i14, m6Var));
                    f3VarArr2[r62].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr2[r62].makeAttached(U);
                    }
                    f3VarArr2[r62].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                j9Var.r(user3);
                y9Var.e(user3, j9Var);
            }
            i11 = i17;
            f3VarArr = f3VarArr3;
            frameLayout.addView(y9Var, w7.x5.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            e7.addView(textView3, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            e7.addView(textView22, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
            r01Var = new r01(parentActivity, resourceProvider);
            ea0 ea0Var8 = new ea0(parentActivity, resourceProvider);
            ea0Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            ea0Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.i6.gc;
            ea0Var8.setTextColor(org.telegram.ui.ActionBar.i6.w0(i192, resourceProvider));
            ea0Var8.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i192, resourceProvider));
            ea0Var8.setTextSize(1, 14.0f);
            ea0Var8.setSingleLine(true);
            ea0Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(ea0Var8, 24.0f, i11);
            if (peerDialogId < 0) {
            }
            z14 = z13;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(g5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.f3[] f3VarArr42 = f3VarArr;
            spannableStringBuilder2.setSpan(new n6(f3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            ea0Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (peerDialogId >= 0) {
                r01Var.c(LocaleController.getString(!z11 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            r01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
            r01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e7.addView(r01Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            ea0 ea0Var22 = new ea0(parentActivity, resourceProvider);
            int i202 = org.telegram.ui.ActionBar.i6.z6;
            ea0Var22.setTextColor(org.telegram.ui.ActionBar.i6.w0(i202, resourceProvider));
            ea0Var22.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i192, resourceProvider));
            final int i212 = 1;
            ea0Var22.setTextSize(1, 14.0f);
            ea0Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i222 = i212;
                    Activity activity = parentActivity;
                    switch (i222) {
                        case 0:
                            if (activity.isFinishing()) {
                                return;
                            }
                            Handler handler = e.g;
                            Method method = e.f;
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 28) {
                                activity.recreate();
                                return;
                            }
                            if (((i23 != 26 && i23 != 27) || method != null) && (e.e != null || e.d != null)) {
                                try {
                                    Object obj2 = e.c.get(activity);
                                    if (obj2 != null && (obj = e.b.get(activity)) != null) {
                                        Application application = activity.getApplication();
                                        d dVar5 = new d(activity);
                                        application.registerActivityLifecycleCallbacks(dVar5);
                                        handler.post(new i9.s(11, dVar5, obj2));
                                        try {
                                            if (i23 == 26 || i23 == 27) {
                                                Boolean bool = Boolean.FALSE;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } else {
                                                activity.recreate();
                                            }
                                            handler.post(new i9.s(12, application, dVar5));
                                            return;
                                        } finally {
                                            handler.post(new i9.s(12, application, dVar5));
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
            ea0Var22.setGravity(17);
            e7.addView(ea0Var22, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r62 = 0;
            f3Var.customView = e7;
            f3VarArr2[r62] = f3Var;
            f3Var.useBackgroundTopPadding = r62;
            f3Var.setOnDismissListener(new qg.s(i14, m6Var));
            f3VarArr2[r62].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            f3VarArr2[r62].show();
        }
    }

    public final void I0(ArrayList arrayList, c71 c71Var) {
        if (getParentActivity() == null) {
            return;
        }
        m5 y3 = m5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        bb bbVar = (bb) super.r0(getParentActivity());
        p61 p61Var = new p61(-2);
        p61Var.c = bbVar;
        arrayList.add(p61Var);
        arrayList.add(p61.k(this.U));
        ci.d dVar = this.d0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(p61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(ei.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.i6.uj), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(p61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = g7.a;
                p61 J = p61.J(g7.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(p61.o(arrayList.size(), 33));
            } else if (!y3.y) {
                p61 c10 = p61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(p61.B(null));
        }
        boolean O = y3.O(0);
        this.e0 = O;
        if (O) {
            arrayList.add(p61.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(p61.l(this.S));
        }
    }

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new o7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new q50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        sg.n nVar = new sg.n(context, 1, 2);
        this.Q = nVar;
        sg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.i6.fk;
        gVar.A = org.telegram.ui.ActionBar.i6.gk;
        gVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.x5.a(190.0f, 0.0f, 12.0f, 0.0f, 24.0f, 190, 17));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new di.a(context, 7)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ai.g(this, 21));
        h10 h10Var = new h10(getParentActivity());
        this.T = h10Var;
        this.s.addView(h10Var, w7.x5.d(-1.0f, -1));
        m5 y3 = m5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getParentActivity(), false, true, false);
        this.W = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        w70 w70Var = new w70(this.W, 42.0f, this.currentAccount);
        ck0 ck0Var = new ck0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = w70Var.b;
        imageReceiver.setImageBitmap(ck0Var);
        imageReceiver.setAutoRepeat(2);
        w70Var.f = false;
        w70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(w70Var, 0, 1, 33);
        this.U.addView(this.W, w7.x5.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, this.resourceProvider));
        this.U.addView(this.X, w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        rg.t0 t0Var = new rg.t0(this, getParentActivity(), 4);
        this.Z = t0Var;
        frameLayout2.addView(t0Var);
        ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar;
        dVar.e();
        this.a0.g("", false, true);
        final int i10 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: yh.w5
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        p7.C0(this.b, context);
                        break;
                    default:
                        new f7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.Z.addView(this.a0, w7.x5.e(-1, 48, 119));
        dc1 dc1Var = new dc1(this, getParentActivity(), 20);
        this.b0 = dc1Var;
        frameLayout2.addView(dc1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new er(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.c0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: yh.w5
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        p7.C0(this.b, context);
                        break;
                    default:
                        new f7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.b0.addView(this.c0, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new er(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: yh.x5
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        p7 p7Var = this.b;
                        p7Var.presentFragment(new g(0, p7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        p7.B0(this.b);
                        break;
                }
            }
        });
        this.b0.addView(this.Y, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.x5.a(48.0f, 20.0f, 17.0f, 20.0f, 0.0f, -1, 17));
        ci.d dVar4 = new ci.d(getParentActivity(), this.resourceProvider, false);
        this.d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new er(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.d0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: yh.x5
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        p7 p7Var = this.b;
                        p7Var.presentFragment(new g(0, p7Var.getUserConfig().getClientUserId()));
                        break;
                    default:
                        p7.B0(this.b);
                        break;
                }
            }
        });
        this.U.addView(this.d0, w7.x5.a(48.0f, 20.0f, 8.0f, 20.0f, 0.0f, -1, 17));
        l1();
        s6 s6Var = this.g0;
        if (s6Var != null) {
            s6Var.N(false);
        }
        o.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        m1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            s6 s6Var = this.g0;
            if (s6Var != null) {
                s6Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            m5 y3 = m5.y(this.currentAccount, false);
            if (this.e0 != y3.O(0)) {
                this.e0 = y3.O(0);
                t0();
                s6 s6Var2 = this.g0;
                if (s6Var2 != null) {
                    s6Var2.N(true);
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
            s6 s6Var3 = this.g0;
            if (s6Var3 != null) {
                s6Var3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            l1();
        }
    }

    public final void l1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        m5 y3 = m5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        this.a0.g(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        m1(z10, true);
    }

    public final void m1(final boolean z10, boolean z11) {
        this.f0 = z10;
        if (z11) {
            this.Z.setVisibility(0);
            this.b0.setVisibility(0);
            final int i10 = 0;
            this.Z.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: yh.y5
                public final /* synthetic */ p7 b;

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
            this.b0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: yh.y5
                public final /* synthetic */ p7 b;

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

    @Override // org.telegram.ui.p20
    public final s4.i0 n0() {
        s6 s6Var = new s6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new hi.a(this, 26), getResourceProvider());
        this.g0 = s6Var;
        s6Var.r = false;
        return s6Var;
    }

    @Override // org.telegram.ui.p20
    public final o20 o0() {
        return new di.f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        m5.y(this.currentAccount, false).T(true);
        m5.y(this.currentAccount, false).S();
        m5.y(this.currentAccount, false).z();
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

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        sg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        sg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.p20
    public final rg.w1 p0() {
        return new r6(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.p20
    public final boolean q0() {
        o7 o7Var = this.R;
        boolean z10 = false;
        if (o7Var != null && (o7Var.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.p20
    public final View r0(Context context) {
        throw null;
    }
}
