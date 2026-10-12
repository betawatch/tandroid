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
import di.ab;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
import org.telegram.ui.c90;
import org.telegram.ui.fo;
import org.telegram.ui.ic1;
import org.telegram.ui.ju;
import org.telegram.ui.u20;
import org.telegram.ui.v20;
import org.telegram.ui.x50;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p7 extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat h0;
    public static DecimalFormat i0;
    public FrameLayout P;
    public tg.n Q;
    public o7 R;
    public x50 S;
    public d10 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.s6 W;
    public TextView X;
    public di.d Y;
    public sg.p0 Z;
    public di.d a0;
    public ic1 b0;
    public di.d c0;
    public di.d d0;
    public boolean e0;
    public boolean f0;
    public s6 g0;

    public p7() {
        this.M = true;
    }

    public static void A0(p7 p7Var, l61 l61Var, Boolean bool, String str) {
        if (p7Var.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            zc.a0(p7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l61Var.B, new Object[0])), R.raw.stars_topup).j();
            p7Var.T.c(true);
            n5.y(p7Var.currentAccount, false).T(true);
        } else if (str != null) {
            i2.d.q(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(p7Var), R.raw.error, 36);
        }
    }

    public static void B0(p7 p7Var) {
        n5.y(p7Var.currentAccount, false).u();
        ug.m1.f0(1, BirthdayController.getInstance(p7Var.currentAccount).getState());
    }

    public static /* synthetic */ void C0(p7 p7Var, Context context) {
        if (MessagesController.getInstance(p7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(p7Var.currentAccount);
        } else {
            new f7(context, p7Var.resourceProvider).show();
        }
    }

    public static void G0(n01 n01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((k01) n01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ia0 ia0Var = new ia0(textView, AndroidUtilities.dp(90.0f), 0, c6Var);
        ia0Var.a(org.telegram.ui.ActionBar.g6.m1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.g6.m1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ia0Var, 0, 1, 33);
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
        final n5 y3 = n5.y(i10, false);
        final long j10 = starGift.id;
        final ji.p1 p1Var = new ji.p1(textView, 29);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: zh.x4
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                n5 n5Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (n5Var = n5.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(n5Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                p1Var.run(J);
            }
        };
        int i12 = y3.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift J = y3.J(j10);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            p1Var.run(J);
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
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = i0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 <= 0 || j11 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j12 = i10 + j11;
            if (j11 != 0 ? j11 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j12), c10));
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
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
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
            boolean z10 = j10 != 0 ? j10 < 0 : i11 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(LocaleController.formatNumber(Math.abs(j11), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j11), 0));
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
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j10));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j11), ','));
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

    public static String N0(long j10) {
        if (h0 == null) {
            h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return h0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10 < 0 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
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
            return LocaleController.formatString(R.string.StarTransactionCommission, fi.l.H0(starsTransaction.starref_commission_permille));
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
        br brVar = new br(R.drawable.diamond, 0);
        brVar.recolorDrawable = false;
        brVar.translate(0.0f, f10);
        brVar.spaceScaleX = f11;
        brVar.setScale(f7, f7);
        spannableString.setSpan(brVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, br[] brVarArr) {
        return V0(false, charSequence, f7, brVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, br[] brVarArr, float f10, float f11) {
        br brVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (brVarArr == null || (brVar = brVarArr[0]) == null) {
            brVar = new br(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (brVarArr != null) {
                brVarArr[0] = brVar;
            }
        }
        brVar.translate(0.0f, f10);
        brVar.spaceScaleX = f11;
        if (z10) {
            brVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            brVar.setScale(f12, f12);
        } else {
            brVar.setScale(f7, f7);
        }
        spannableString.setSpan(brVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, br[] brVarArr) {
        br brVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (brVarArr == null || (brVar = brVarArr[0]) == null) {
            brVar = new br(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            brVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (z10) {
            brVar.recolorDrawable = false;
        }
        if (brVarArr != null) {
            brVarArr[0] = brVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(brVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, br[] brVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, brVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, br[] brVarArr) {
        br brVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (brVarArr == null || (brVar = brVarArr[0]) == null) {
            if (brVarArr == null || brVarArr.length <= 0) {
                brVar = new br(i10, 0);
            } else {
                brVar = new br(i10, 0);
                brVarArr[0] = brVar;
            }
        }
        brVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        brVar.setScale(f7, f7);
        spannableString.setSpan(brVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static u11 Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final m4.l0 l0Var = new m4.l0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        l0Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new u11(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: zh.a6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        l0Var.run();
                        break;
                    default:
                        l0Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: zh.a6
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        l0Var.run();
                        break;
                    default:
                        l0Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        a1(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void c1(z9 z9Var, ImageReceiver imageReceiver, long j10) {
        Z0(z9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static u11 d1(z9 z9Var, ImageReceiver imageReceiver, int i10) {
        return Z0(z9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void e1(z9 z9Var, ImageReceiver imageReceiver, long j10) {
        Z0(z9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void f1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 i11 = yh.i(1, context, c6Var, false);
        LinearLayout e = yh.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.a6.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        r6 r6Var = new r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.a6.d(-1.0f, -1));
        int i12 = 2;
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.g6.fk;
        gVar.A = org.telegram.ui.ActionBar.g6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.a6.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i13.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(20.0f), -6915073));
        i13.setTextColor(-1);
        i13.setTextSize(1, 11.33f);
        i13.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i13.setGravity(17);
        i13.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i14 = boost.multiplier;
        if (i14 == 0) {
            i14 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i14));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        br brVar = new br(R.drawable.mini_boost_badge, 2);
        brVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 33);
        i13.setText(spannableStringBuilder);
        e.addView(i13, w7.a6.t(-2, 20, 17, 20, 4, 20, 4));
        n01 n01Var = new n01(context, c6Var);
        n01Var.m(LocaleController.getString(R.string.BoostFrom), i10, j10, new p5(e3VarArr, j10, i12));
        n01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            ri.e eVar = new ri.e(e3VarArr, j10, boost, 5);
            e3VarArr = e3VarArr;
            n01Var.h(string, string2, eVar);
        }
        n01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        n01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e.addView(n01Var, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        da0 da0Var = new da0(context, c6Var);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ei.a(context, 9)));
        da0Var.setGravity(17);
        e.addView(da0Var, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        di.d dVar = new di.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new u5(e3VarArr, 1));
        e.addView(dVar, w7.a6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e;
        e3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            e3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new zf.c(nVar, 14));
    }

    public static h0 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        ag.b bVar = ag.b.a;
        h0 h0Var = new h0(context, c6Var, i10, tL_starGiftUnique == null ? ag.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(ag.b.b) : tL_starGiftUnique.getResellAmount(bVar), new org.telegram.ui.Wallet.y6(16, callback2, r8));
        h0[] h0VarArr = {h0Var};
        h0Var.show();
        return h0VarArr[0];
    }

    public static void h1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        org.telegram.ui.ActionBar.e3 i10 = yh.i(1, context, c6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        yh.j(20.0f, R.string.PaidContentTitle, 1, textView);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        linearLayout.addView(textView, w7.a6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        yd0 yd0Var = new yd0(context, c6Var);
        yd0Var.setForceForceUseCenter(true);
        yd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        yd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new fi.v1(yd0Var, editTextBoldCursor, i12));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.a6.o(-1, -2, 1.0f, 119));
        yd0Var.e(editTextBoldCursor);
        yd0Var.addView(linearLayout2, w7.a6.e(-1, -2, 48));
        linearLayout.addView(yd0Var, w7.a6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A6, false));
        yd0Var.addView(textView2, w7.a6.a(-2.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        da0 da0Var = new da0(context, null);
        da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ei.a(context, 10)), true));
        da0Var.setTextSize(1, 12.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        linearLayout.addView(da0Var, w7.a6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final di.d f7 = yh.f(24, context, c6Var, true);
        f7.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(f7, w7.a6.n(-1, 48));
        if (j10 > 0 && z10) {
            dVar = yh.f(24, context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.a6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i10.customView = linearLayout;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2 = {i10};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new q6(editTextBoldCursor, yd0Var, j10, z10, f7, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zh.c6
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new e6(editTextBoldCursor2, e3VarArr2, 2));
                return true;
            }
        });
        f7.setOnClickListener(new d6(zArr, callback2, editTextBoldCursor, f7, e3VarArr2));
        if (dVar != null) {
            di.d dVar2 = dVar;
            d6 d6Var = new d6(zArr, callback2, dVar2, editTextBoldCursor, e3VarArr2);
            e3VarArr = e3VarArr2;
            dVar2.setOnClickListener(d6Var);
        } else {
            e3VarArr = e3VarArr2;
        }
        e3VarArr[0].fixNavigationBar();
        e3VarArr[0].setOnDismissListener(new bi.t4(editTextBoldCursor, 13));
        e3VarArr[0].show();
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new e6(e3VarArr, editTextBoldCursor), R instanceof fo ? ((fo) R).U9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x10c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1096  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0ea3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ea9 A[LOOP:0: B:67:0x0e1d->B:76:0x0ea9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0eb5 A[EDGE_INSN: B:77:0x0eb5->B:78:0x0eb5 BREAK  A[LOOP:0: B:67:0x0e1d->B:76:0x0ea9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0f2f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f54  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.e3 i1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.e3[] e3VarArr2;
        float f7;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i14;
        org.telegram.ui.ActionBar.e3[] e3VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        final org.telegram.ui.ActionBar.e3[] e3VarArr4;
        n01 n01Var;
        n01 n01Var2;
        n01 n01Var3;
        n01 n01Var4;
        n01 n01Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.m2 U;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        final org.telegram.ui.ActionBar.e3[] e3VarArr5;
        final Context context5;
        n01 n01Var6;
        n01 n01Var7;
        final int i16;
        n01 n01Var8;
        final org.telegram.ui.ActionBar.e3[] e3VarArr6;
        long j13;
        n01 n01Var9;
        String str3;
        TL_stars.StarsAmount starsAmount;
        n01 n01Var10;
        n01 n01Var11;
        TL_stars.StarsTransaction starsTransaction4;
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
        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.e3[] e3VarArr7 = new org.telegram.ui.ActionBar.e3[1];
        final LinearLayout e = yh.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                e3VarArr = e3VarArr7;
                e3Var = e3Var2;
                v6 v6Var = new v6(context, matrix, radialGradient, paint, q5Var);
                q5Var.l(v6Var);
                q5Var.i(stargiftattributepattern.document, false);
                v6Var.setOrientation(1);
                z9 z9Var = new z9(context);
                b1(z9Var.getImageReceiver(), starsTransaction.stargift, 160);
                v6Var.addView(z9Var, w7.a6.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    w7.c6.a(z9Var);
                    z9Var.setOnClickListener(new sa(context, i10, tL_starGiftUnique, 23));
                }
                TextView b10 = w7.e6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                v6Var.addView(b10, w7.a6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.e6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                v6Var.addView(b11, w7.a6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.e6.b(context, 18.0f, 0, true, null);
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
                v6Var.addView(b12, w7.a6.t(-2, -2, 17, 0, 11, 0, 17));
                e.addView(v6Var, w7.a6.n(-1, -2));
                c6Var2 = c6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = e;
                str = "";
                z12 = z18;
                e3VarArr2 = e3VarArr;
                f7 = 16.0f;
                n01 n01Var12 = new n01(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                int i18 = 25;
                if (starGift != null) {
                    TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                    viewGroup = linearLayout;
                    n01 n01Var13 = n01Var12;
                    final org.telegram.ui.ActionBar.e3[] e3VarArr8 = e3VarArr2;
                    c6Var3 = c6Var2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction5.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                        if (starsTransaction5.paid_message) {
                            n01Var13.m(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId, new p5(e3VarArr8, peerDialogId, 3));
                            if (starsTransaction5.starref_amount != null && starsTransaction5.starref_commission_permille > 0) {
                                n01Var13.d(Y0(starsTransaction5.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.q.i(Math.abs(Math.round(starsTransaction5.starref_amount.toDouble() + starsTransaction5.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                            i14 = i10;
                            n01Var4 = n01Var13;
                        } else if (z11) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(starsTransaction5.starref_peer);
                            n01Var13.h(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new p5(e3VarArr8, j10, 4));
                            n01Var13.m(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId2, new p5(e3VarArr8, peerDialogId2, 5));
                            i14 = i10;
                            n01Var13.m(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId, new p5(e3VarArr8, peerDialogId, 6));
                            n01Var13.d(fi.l.H0(starsTransaction5.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                            e3VarArr3 = e3VarArr8;
                            n01Var3 = n01Var13;
                            starsTransaction3 = starsTransaction5;
                            context3 = context;
                            n01Var2 = n01Var3;
                            n01Var5 = n01Var2;
                        } else if (z12) {
                            n01Var13.h(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new bi.i0(i10, context, j10, peerDialogId, e3VarArr8, c6Var3));
                            i14 = i10;
                            n01 n01Var14 = n01Var13;
                            n01Var14.m(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId, new p5(e3VarArr8, peerDialogId, 0));
                            n01Var4 = n01Var14;
                        } else {
                            if (z19) {
                                n01Var13.m(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId, new q5(e3VarArr8, starsTransaction5, peerDialogId, 0));
                                final int i19 = 0;
                                n01Var13.m(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: zh.r5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                e3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                e3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
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
                                                e3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
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
                                String string2 = LocaleController.getString(R.string.StarGiveawayReason);
                                String string3 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                                Runnable q5Var2 = new q5(e3VarArr8, starsTransaction, peerDialogId, 1);
                                starsTransaction3 = starsTransaction;
                                n01Var13.h(string2, string3, q5Var2);
                                n01Var13.d(M0(starsTransaction3.amount), LocaleController.getString(R.string.StarGiveawayGift));
                                context3 = context;
                                i14 = i10;
                                e3VarArr3 = e3VarArr8;
                                n01Var2 = n01Var13;
                            } else {
                                starsTransaction3 = starsTransaction5;
                                if (!starsTransaction3.subscription || z10) {
                                    e3VarArr4 = e3VarArr8;
                                    if (starsTransaction3.premium_gift) {
                                        final int i20 = 1;
                                        n01Var13.m(LocaleController.getString(R.string.Gift2To), i10, peerDialogId, new Runnable() { // from class: zh.s5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        e3VarArr4[0].dismiss();
                                                        long j14 = peerDialogId;
                                                        if (!UserObject.isService(j14)) {
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(fo.W9(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        e3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(fo.W9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(fo.W9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        n01Var13.d(LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                    } else if (!starsTransaction3.posts_search) {
                                        final int i21 = 2;
                                        e3VarArr3 = e3VarArr4;
                                        context3 = context;
                                        n01 n01Var15 = n01Var13;
                                        i14 = i10;
                                        n01Var15.m(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId, new Runnable() { // from class: zh.s5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        e3VarArr4[0].dismiss();
                                                        long j14 = peerDialogId;
                                                        if (!UserObject.isService(j14)) {
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(fo.W9(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        e3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(fo.W9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(fo.W9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        n01Var2 = n01Var15;
                                    }
                                    context3 = context;
                                    i14 = i10;
                                    n01Var = n01Var13;
                                } else {
                                    final int i22 = 0;
                                    e3VarArr4 = e3VarArr8;
                                    n01 n01Var16 = n01Var13;
                                    i14 = i10;
                                    n01Var16.m(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId, new Runnable() { // from class: zh.s5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    e3VarArr8[0].dismiss();
                                                    long j14 = peerDialogId;
                                                    if (!UserObject.isService(j14)) {
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            U2.presentFragment(fo.W9(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    e3VarArr8[0].dismiss();
                                                    long j15 = peerDialogId;
                                                    if (!UserObject.isService(j15)) {
                                                        org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            U3.presentFragment(fo.W9(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    e3VarArr8[0].dismiss();
                                                    long j16 = peerDialogId;
                                                    if (!UserObject.isService(j16)) {
                                                        org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            U4.presentFragment(fo.W9(j16));
                                                            break;
                                                        }
                                                    } else {
                                                        pf.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    context3 = context;
                                    n01Var = n01Var16;
                                }
                                e3VarArr3 = e3VarArr4;
                                n01Var2 = n01Var;
                            }
                            n01Var5 = n01Var2;
                        }
                        e3VarArr3 = e3VarArr8;
                        n01Var3 = n01Var4;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        n01Var2 = n01Var3;
                        n01Var5 = n01Var2;
                    } else {
                        i14 = i10;
                        e3VarArr3 = e3VarArr8;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                da0 da0Var = new da0(context3, c6Var3);
                                da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i23 = org.telegram.ui.ActionBar.g6.gc;
                                da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var3));
                                da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i23, c6Var3));
                                da0Var.setTextSize(1, 14.0f);
                                da0Var.setSingleLine(true);
                                da0Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(da0Var, 24.0f, i14);
                                String string4 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                cr a2 = j7.a(24, "fragment");
                                int dp = AndroidUtilities.dp(f7);
                                int dp2 = AndroidUtilities.dp(f7);
                                a2.e = dp;
                                a2.f = dp2;
                                k5Var.b.setImageBitmap(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string4));
                                spannableStringBuilder2.setSpan(k5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new k6(e3VarArr3, context3, z15), 3, spannableStringBuilder2.length(), 33);
                                da0Var.setText(spannableStringBuilder2);
                                n01Var13.k(da0Var, LocaleController.getString(R.string.StarsTransactionRecipient));
                                n01Var5 = n01Var13;
                            } else {
                                n01Var13.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                                n01Var5 = n01Var13;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            n01Var13.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                            n01Var5 = n01Var13;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            n01Var13.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                            n01Var5 = n01Var13;
                        } else {
                            n01Var5 = n01Var13;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                n01Var13.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                                n01Var5 = n01Var13;
                            }
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction4 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        bd bdVar = (bd) ((k01) n01Var12.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context6 = context2;
                        starsTransaction4 = starsTransaction;
                        n5.w(i10).M(tL_inputSavedStarGiftUser, new gi.m0(bdVar, i10, context6, c6Var2, 5));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction4.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        String string5 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                        Runnable p5Var = new p5(e3VarArr2, peerDialogId3, 1);
                        context5 = context;
                        i14 = i10;
                        n01 n01Var17 = n01Var12;
                        e3VarArr5 = e3VarArr2;
                        c6Var3 = c6Var;
                        n01Var17.m(string5, i14, peerDialogId3, p5Var);
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        n01Var10 = n01Var17;
                        e3VarArr3 = e3VarArr5;
                        context3 = context5;
                        n01Var5 = n01Var10;
                    } else {
                        e3VarArr5 = e3VarArr2;
                        i14 = i10;
                        c6Var3 = c6Var;
                        n01Var11 = n01Var12;
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        e3VarArr3 = e3VarArr5;
                        context3 = context;
                        n01Var5 = n01Var11;
                    }
                } else {
                    e3VarArr5 = e3VarArr2;
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    c6Var3 = c6Var2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str4 = starGift.slug;
                        if (!TextUtils.isEmpty(str4)) {
                            n01Var12.h(LocaleController.getString(R.string.Gift2Gift), starsTransaction6.stargift.title + " #" + starsTransaction6.stargift.num, new c90(context5, i10, str4, i18));
                        }
                        final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                        long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    n01Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                } else {
                                    n01Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                    j13 = clientUserId;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                n01Var12.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                                peerDialogId4 = j13;
                            } else {
                                n01Var12.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                            }
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else if (negative) {
                            n01Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else {
                            n01Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j13 = clientUserId;
                        }
                        if (peerDialogId4 != clientUserId) {
                            String string6 = LocaleController.getString(R.string.Gift2From);
                            final int i24 = 0;
                            n01Var9 = n01Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                            final long j14 = peerDialogId4;
                            Runnable runnable = new Runnable() { // from class: zh.v5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i24) {
                                        case 0:
                                            e3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j15 = j14;
                                                Bundle e7 = t8.b.e(j15, "user_id");
                                                if (j15 == clientUserId) {
                                                    e7.putBoolean("my_profile", true);
                                                }
                                                e7.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(e7, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            e3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j16 = j14;
                                                Bundle e10 = t8.b.e(j16, "user_id");
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
                            };
                            clientUserId = clientUserId;
                            n01Var9.m(string6, i10, j14, runnable);
                        } else {
                            n01Var9 = n01Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                        }
                        if (j13 != clientUserId) {
                            final long j15 = clientUserId;
                            final int i25 = 1;
                            final long j16 = j13;
                            n01Var9.m(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() { // from class: zh.v5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            e3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j152 = j16;
                                                Bundle e7 = t8.b.e(j152, "user_id");
                                                if (j152 == j15) {
                                                    e7.putBoolean("my_profile", true);
                                                }
                                                e7.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(e7, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            e3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j162 = j16;
                                                Bundle e10 = t8.b.e(j162, "user_id");
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
                        n01 n01Var18 = n01Var9;
                        if ((peerDialogId4 == clientUserId || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                br[] brVarArr = new br[1];
                                n01Var18.d(X0(starsTransaction6.amount, str3 + ((Object) J0(tL_starsTonAmount)), brVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                br brVar = brVarArr[0];
                                if (brVar != null) {
                                    brVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var3));
                                }
                            } else {
                                n01Var18.d(Y0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.q.i(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder(str3)), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        }
                        i14 = i10;
                        n01Var10 = n01Var18;
                        starsTransaction3 = starsTransaction6;
                        e3VarArr3 = e3VarArr5;
                        context3 = context5;
                        n01Var5 = n01Var10;
                    } else {
                        viewGroup = linearLayout;
                        if (starsTransaction6.refund) {
                            i14 = i10;
                            n01Var6 = n01Var12;
                        } else {
                            long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                            final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId5));
                            if (positive) {
                                if (peerDialogId5 != clientUserId2) {
                                    CharSequence string7 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                    Runnable q5Var3 = new q5(e3VarArr5, starsTransaction6, peerDialogId5, 3);
                                    String string8 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i26 = 0;
                                    i16 = i10;
                                    Runnable runnable2 = new Runnable() { // from class: zh.t5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr5[0];
                                                    Objects.requireNonNull(e3Var3);
                                                    new yh.p1(context5, i16, peerDialogId5, null, new ji.p1(e3Var3, 28)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.e3 e3Var4 = e3VarArr5[0];
                                                    Objects.requireNonNull(e3Var4);
                                                    new yh.p1(context5, i16, peerDialogId5, null, new ji.p1(e3Var4, 28)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    n01 n01Var19 = n01Var12;
                                    e3VarArr6 = e3VarArr5;
                                    n01Var19.l(string7, i16, peerDialogId5, q5Var3, string8, runnable2);
                                    n01Var8 = n01Var19;
                                } else {
                                    i16 = i10;
                                    n01Var8 = n01Var12;
                                    e3VarArr6 = e3VarArr5;
                                }
                                final int i27 = 1;
                                n01Var8.m(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: zh.r5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
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
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
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
                                starsTransaction6 = starsTransaction;
                                e3VarArr5 = e3VarArr6;
                                n01Var7 = n01Var8;
                            } else {
                                long j17 = clientUserId2;
                                if (peerDialogId5 != j17) {
                                    final int i28 = 2;
                                    n01Var12.m(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() { // from class: zh.r5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    e3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    e3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
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
                                                    e3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
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
                                CharSequence string9 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                Runnable q5Var4 = new q5(e3VarArr5, starsTransaction, peerDialogId5, 4);
                                starsTransaction6 = starsTransaction;
                                String string10 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                final int i29 = 1;
                                Runnable runnable3 = new Runnable() { // from class: zh.t5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr5[0];
                                                Objects.requireNonNull(e3Var3);
                                                new yh.p1(context, i10, peerDialogId5, null, new ji.p1(e3Var3, 28)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.e3 e3Var4 = e3VarArr5[0];
                                                Objects.requireNonNull(e3Var4);
                                                new yh.p1(context, i10, peerDialogId5, null, new ji.p1(e3Var4, 28)).show();
                                                break;
                                        }
                                    }
                                };
                                n01 n01Var20 = n01Var12;
                                e3VarArr5 = e3VarArr5;
                                n01Var20.l(string9, i10, peerDialogId5, q5Var4, string10, runnable3);
                                n01Var7 = n01Var20;
                            }
                            i14 = i10;
                            n01Var6 = n01Var7;
                        }
                        starsTransaction3 = starsTransaction6;
                        n01Var11 = n01Var6;
                        e3VarArr3 = e3VarArr5;
                        context3 = context;
                        n01Var5 = n01Var11;
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction3.flags & 256) == 0) {
                    z14 = z15;
                } else {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                        peerDialogId6 = j10;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId6));
                    if (chat != null) {
                        da0 da0Var2 = new da0(context3, c6Var3);
                        da0Var2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        da0Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i30 = org.telegram.ui.ActionBar.g6.gc;
                        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i30, c6Var3));
                        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i30, c6Var3));
                        da0Var2.setTextSize(1, 14.0f);
                        da0Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (starsTransaction3.extended_media.isEmpty()) {
                            z14 = z15;
                        } else {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            z14 = z15;
                            int i31 = 0;
                            int i32 = 0;
                            while (i31 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i31);
                                int i33 = i31 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                int i34 = size;
                                b80 b80Var = new b80(da0Var2, 24.0f, i14);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i15 = i32;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    i15 = i32;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                    } else {
                                        imageLocation2 = null;
                                        if (imageLocation2 == null) {
                                            b80Var.a(6.0f);
                                            b80Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(b80Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i32 = i15 + 1;
                                        } else {
                                            i32 = i15;
                                        }
                                        if (i32 < 3) {
                                            break;
                                        }
                                        i31 = i33;
                                        size = i34;
                                        arrayList = arrayList2;
                                    }
                                }
                                imageLocation2 = forDocument2;
                                if (imageLocation2 == null) {
                                }
                                if (i32 < 3) {
                                }
                            }
                        }
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String publicUsername = ChatObject.getPublicUsername(chat);
                        if (TextUtils.isEmpty(publicUsername)) {
                            spannableStringBuilder3.append((CharSequence) chat.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            a1.g.A(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        q5 q5Var5 = new q5(e3VarArr3, peerDialogId6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new l6(q5Var5), length, spannableStringBuilder3.length(), 33);
                        da0Var2.setSingleLine(true);
                        da0Var2.setEllipsize(TextUtils.TruncateAt.END);
                        da0Var2.setText(spannableStringBuilder3);
                        da0Var2.setOnClickListener(new ji.o4(q5Var5, 27));
                        n01Var5.k(da0Var2, LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                    } else {
                        z14 = z15;
                    }
                }
                if (!TextUtils.isEmpty(starsTransaction3.id) && !z19) {
                    String string11 = LocaleController.getString(R.string.StarsTransactionID);
                    String str5 = starsTransaction3.id;
                    n01Var5.j(string11, str5, str5.length() <= 25 ? 9 : 10, new m(16, e3VarArr3, c6Var3));
                }
                if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                    n01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                n01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                    if (starGift2.limited) {
                        G0(n01Var5, i14, starGift2, c6Var3);
                    }
                    if (!TextUtils.isEmpty(starsTransaction3.description)) {
                        n01Var5.a(new SpannableStringBuilder(starsTransaction3.description));
                    }
                }
                ViewGroup viewGroup3 = viewGroup;
                viewGroup3.addView(n01Var5, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                    n01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                }
                if (z14) {
                    context4 = context;
                    da0 da0Var3 = new da0(context4, c6Var3);
                    da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var3));
                    da0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var3));
                    da0Var3.setTextSize(1, 14.0f);
                    da0Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ei.a(context4, 6)));
                    da0Var3.setGravity(17);
                    viewGroup3.addView(da0Var3, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                } else {
                    context4 = context;
                }
                di.d dVar = new di.d(context4, c6Var3);
                dVar.e();
                if ((starsTransaction3.flags & 32) == 0) {
                    dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                } else {
                    dVar.h(LocaleController.getString(R.string.OK));
                }
                viewGroup3.addView(dVar, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                e3Var3.customView = viewGroup3;
                int i35 = 0;
                e3VarArr3[0] = e3Var3;
                e3Var3.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) == 0) {
                    dVar.setOnClickListener(new yh.a(13, context4, starsTransaction3));
                } else {
                    dVar.setOnClickListener(new u5(e3VarArr3, i35));
                }
                e3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                    e3VarArr3[0].makeAttached(U);
                }
                e3VarArr3[0].show();
                return e3VarArr3[0];
            }
        }
        e3Var = e3Var2;
        e3VarArr = e3VarArr7;
        z11 = z17;
        final z9 z9Var2 = new z9(context);
        if (starsTransaction.premium_gift) {
            d1(z9Var2, z9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            e.addView(z9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            cr a10 = org.telegram.ui.Cells.v6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            z9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        e1(z9Var2, z9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        c1(z9Var2, z9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(z9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            z9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            z9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            z9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j12 = j11;
                                k9 k9Var = new k9();
                                if (j12 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    k9Var.r(user2);
                                    z9Var2.e(user2, k9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    k9Var.q(chat2);
                                    z9Var2.e(chat2, k9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j12 = DialogObject.getPeerDialogId(peer);
                            k9 k9Var2 = new k9();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(z9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        cr a11 = org.telegram.ui.Cells.v6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        z9Var2.setImageDrawable(a11);
                    }
                } else {
                    z9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        z9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        e.addView(z9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zh.o5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
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
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                                PhotoViewer.t1().b2(arrayList3, 0, peerDialogId7, 0L, 0L, new w6(z9Var2, e, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        c6Var2 = c6Var;
                        i11 = i10;
                        linearLayout = e;
                        j11 = j10;
                        z9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    z9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    e.addView(z9Var2, w7.a6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: zh.o5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
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
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                            PhotoViewer.t1().b2(arrayList3, 0, peerDialogId7, 0L, 0L, new w6(z9Var2, e, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    c6Var2 = c6Var;
                    i11 = i10;
                    linearLayout = e;
                    j11 = j10;
                    z9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.g6.j5;
                org.telegram.ui.Cells.d0.p(i12, c6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(O0(i11, z13, starsTransaction2));
                TextView i36 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                i36.setTextSize(1, 18.0f);
                i36.setTypeface(AndroidUtilities.bold());
                i36.setGravity(17);
                i36.setTextColor(org.telegram.ui.ActionBar.g6.w0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                i36.setText(Y0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(i36.getText());
                if (!starsTransaction2.refund) {
                    H0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    i36.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                    H0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    i36.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                    H0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsPending));
                }
                i36.setText(spannableStringBuilder4);
                linearLayout.addView(i36, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    da0 da0Var4 = new da0(context2);
                    da0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var2));
                    da0Var4.setTextSize(1, 14.0f);
                    da0Var4.setGravity(17);
                    da0Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    da0Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, fi.l.H0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new fi.a2(j11, i11, 3)), true));
                    }
                    da0Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(da0Var4, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                    e3VarArr2 = e3VarArr;
                    f7 = 16.0f;
                    n01 n01Var122 = new n01(context2, c6Var2);
                    starGift = starsTransaction2.stargift;
                    int i182 = 25;
                    if (starGift != null) {
                    }
                    starsTransactionPeer = starsTransaction3.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    }
                    if (starsTransaction3.floodskip) {
                    }
                    n01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32 = viewGroup;
                    viewGroup32.addView(n01Var5, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    di.d dVar2 = new di.d(context4, c6Var3);
                    dVar2.e();
                    if ((starsTransaction3.flags & 32) == 0) {
                    }
                    viewGroup32.addView(dVar2, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.e3 e3Var32 = e3Var;
                    e3Var32.customView = viewGroup32;
                    int i352 = 0;
                    e3VarArr3[0] = e3Var32;
                    e3Var32.useBackgroundTopPadding = false;
                    if ((starsTransaction3.flags & 32) == 0) {
                    }
                    e3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    e3VarArr3[0].show();
                    return e3VarArr3[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        i36.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        i36.setText(Y0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(J0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    da0 da0Var5 = new da0(context2);
                    da0Var5.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var2));
                    f7 = 16.0f;
                    da0Var5.setTextSize(i13, 16.0f);
                    da0Var5.setGravity(17);
                    da0Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    da0Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i37 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i37, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    e3VarArr2 = e3VarArr;
                    da0Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new j51(context2, e3VarArr2)), true)));
                    linearLayout.addView(da0Var5, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    e3VarArr2 = e3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        yh.n(i12, c6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                n01 n01Var1222 = new n01(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                int i1822 = 25;
                if (starGift != null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String string112 = LocaleController.getString(R.string.StarsTransactionID);
                    String str52 = starsTransaction3.id;
                    n01Var5.j(string112, str52, str52.length() <= 25 ? 9 : 10, new m(16, e3VarArr3, c6Var3));
                }
                if (starsTransaction3.floodskip) {
                    n01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                n01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322 = viewGroup;
                viewGroup322.addView(n01Var5, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                di.d dVar22 = new di.d(context4, c6Var3);
                dVar22.e();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup322.addView(dVar22, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.e3 e3Var322 = e3Var;
                e3Var322.customView = viewGroup322;
                int i3522 = 0;
                e3VarArr3[0] = e3Var322;
                e3Var322.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                e3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    e3VarArr3[0].makeAttached(U);
                }
                e3VarArr3[0].show();
                return e3VarArr3[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                z9Var2.setImageDrawable(new g3(z9Var2, starsTransaction.stargift, 94, 0.44f));
                e.addView(z9Var2, w7.a6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                b1(z9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                e.addView(z9Var2, w7.a6.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        c6Var2 = c6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = e;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.Cells.d0.p(i12, c6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(O0(i11, z13, starsTransaction2));
        TextView i362 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView3, w7.a6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        i362.setTextSize(1, 18.0f);
        i362.setTypeface(AndroidUtilities.bold());
        i362.setGravity(17);
        i362.setTextColor(org.telegram.ui.ActionBar.g6.w0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        i362.setText(Y0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(i362.getText());
        if (!starsTransaction2.refund) {
        }
        i362.setText(spannableStringBuilder42);
        linearLayout.addView(i362, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        e3VarArr2 = e3VarArr;
        f7 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            yh.n(i12, c6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.a6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        n01 n01Var12222 = new n01(context2, c6Var2);
        starGift = starsTransaction2.stargift;
        int i18222 = 25;
        if (starGift != null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        n01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222 = viewGroup;
        viewGroup3222.addView(n01Var5, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z14) {
        }
        di.d dVar222 = new di.d(context4, c6Var3);
        dVar222.e();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup3222.addView(dVar222, w7.a6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.e3 e3Var3222 = e3Var;
        e3Var3222.customView = viewGroup3222;
        int i35222 = 0;
        e3VarArr3[0] = e3Var3222;
        e3Var3222.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        e3VarArr3[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        e3VarArr3[0].show();
        return e3VarArr3[0];
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.c6 c6Var) {
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
        i1(activity, false, 0L, i10, starsTransaction, c6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.c6 c6Var) {
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
        i1(context, false, 0L, i10, starsTransaction, c6Var);
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
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.n01] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v36, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y0(p7 p7Var, int i10) {
        l61 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        int i12;
        ?? n01Var;
        int i13;
        String str2;
        boolean z13;
        boolean z14;
        long currentTime;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2;
        final int i14;
        ?? r62;
        org.telegram.ui.ActionBar.m2 U;
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
            n5.y(p7Var.currentAccount, false).u();
            ug.m1.f0(1, BirthdayController.getInstance(p7Var.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            n5.y(p7Var.currentAccount, false).W();
            p7Var.g0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(p7Var.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(p7Var.currentAccount);
                return;
            } else {
                p7Var.presentFragment(new fi.f4(p7Var.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 4;
        if (G.G(b7.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                n5.y(p7Var.currentAccount, false).f(p7Var.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new rh.s(i16, p7Var, G), null);
                return;
            }
            return;
        }
        if (G.G(g7.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = p7Var.getParentActivity();
            int i17 = p7Var.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.c6 resourceProvider = p7Var.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) parentActivity, resourceProvider, false);
            e3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.e3[] e3VarArr3 = new org.telegram.ui.ActionBar.e3[1];
            ?? f7 = org.telegram.messenger.q.f(parentActivity, 1);
            f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            f7.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            m6 m6Var = new m6(zArr, e3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(m6Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            z9 z9Var = new z9(parentActivity);
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
                z9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                z9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                z9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    e3VarArr = e3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    k9Var.q(chat4);
                    z9Var.e(chat4, k9Var);
                    frameLayout.addView(z9Var, w7.a6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
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
                    org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView, 1, 20.0f);
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
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
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
                    f7.addView(textView2, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
                    n01Var = new n01(parentActivity, resourceProvider);
                    da0 da0Var = new da0(parentActivity, resourceProvider);
                    da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    da0Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.g6.gc;
                    da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                    da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                    da0Var.setTextSize(1, 14.0f);
                    da0Var.setSingleLine(true);
                    da0Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(da0Var, 24.0f, i11);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        z13 = user2 == null || UserObject.isDeleted(user2);
                        String userName = UserObject.getUserName(user2);
                        k5Var.e(user2);
                        i13 = i11;
                        str2 = userName;
                    } else {
                        i13 = i11;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        boolean z15 = chat5 == null;
                        str2 = chat5 != null ? chat5.title : "";
                        k5Var.b(chat5);
                        z13 = z15;
                    }
                    z14 = z13;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.e3[] e3VarArr4 = e3VarArr;
                    spannableStringBuilder.setSpan(new n6(e3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    da0Var.setText(spannableStringBuilder);
                    if (!z14) {
                        n01Var.k(da0Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z11 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        n01Var.c(LocaleController.getString(!z11 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    n01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                    n01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f7.addView(n01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    da0 da0Var2 = new da0(parentActivity, resourceProvider);
                    int i20 = org.telegram.ui.ActionBar.g6.z6;
                    da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, resourceProvider));
                    da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                    final int i21 = 1;
                    da0Var2.setTextSize(1, 14.0f);
                    da0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                                handler.post(new j9.u(11, dVar, obj2));
                                                try {
                                                    if (i23 == 26 || i23 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new j9.u(12, application, dVar));
                                                    return;
                                                } finally {
                                                    handler.post(new j9.u(12, application, dVar));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity.recreate();
                                    return;
                                default:
                                    pf.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    return;
                            }
                        }
                    }));
                    da0Var2.setGravity(17);
                    f7.addView(da0Var2, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        e3VarArr2 = e3VarArr4;
                        i14 = i13;
                        da0 da0Var3 = new da0(parentActivity, resourceProvider);
                        da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, resourceProvider));
                        da0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                        da0Var3.setTextSize(1, 14.0f);
                        da0Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        da0Var3.setSingleLine(false);
                        da0Var3.setMaxLines(4);
                        da0Var3.setGravity(17);
                        f7.addView(da0Var3, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            di.d dVar = new di.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r62 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f7.addView(dVar, w7.a6.n(-1, 48));
                            ju juVar = new ju(dVar, starsSubscription, i14, e3VarArr2, resourceProvider, zArr, parentActivity);
                            i14 = i14;
                            dVar.setOnClickListener(juVar);
                            e3Var.customView = f7;
                            e3VarArr2[r62] = e3Var;
                            e3Var.useBackgroundTopPadding = r62;
                            e3Var.setOnDismissListener(new rg.s(i14, m6Var));
                            e3VarArr2[r62].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                e3VarArr2[r62].makeAttached(U);
                            }
                            e3VarArr2[r62].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        da0 da0Var4 = new da0(parentActivity, resourceProvider);
                        da0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, resourceProvider));
                        da0Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                        da0Var4.setTextSize(1, 14.0f);
                        da0Var4.setText(LocaleController.formatString(z12 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        da0Var4.setSingleLine(false);
                        da0Var4.setMaxLines(4);
                        da0Var4.setGravity(17);
                        f7.addView(da0Var4, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        di.d dVar2 = new di.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z12 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f7.addView(dVar2, w7.a6.n(-1, 48));
                        e3VarArr2 = e3VarArr4;
                        int i22 = i13;
                        f6 f6Var = new f6(dVar2, i22, starsSubscription, e3VarArr2, peerDialogId, parentActivity, resourceProvider, z11, str3);
                        i14 = i22;
                        dVar2.setOnClickListener(f6Var);
                    } else {
                        final boolean z16 = z11;
                        e3VarArr2 = e3VarArr4;
                        i14 = i13;
                        if (starsSubscription.bot_canceled) {
                            da0 da0Var5 = new da0(parentActivity, resourceProvider);
                            da0Var5.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            da0Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                            da0Var5.setTextSize(1, 14.0f);
                            da0Var5.setText(LocaleController.getString(z16 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            da0Var5.setSingleLine(false);
                            da0Var5.setMaxLines(4);
                            da0Var5.setGravity(17);
                            f7.addView(da0Var5, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            da0 da0Var6 = new da0(parentActivity, resourceProvider);
                            da0Var6.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            da0Var6.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                            da0Var6.setTextSize(1, 14.0f);
                            da0Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            da0Var6.setSingleLine(false);
                            da0Var6.setMaxLines(4);
                            da0Var6.setGravity(17);
                            f7.addView(da0Var6, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                di.d dVar3 = new di.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f7.addView(dVar3, w7.a6.n(-1, 48));
                                fi.m3 m3Var = new fi.m3(dVar3, starsSubscription, i14, e3VarArr2, chat2, str3);
                                i14 = i14;
                                dVar3.setOnClickListener(m3Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            da0 da0Var7 = new da0(parentActivity, resourceProvider);
                            da0Var7.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, resourceProvider));
                            da0Var7.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i19, resourceProvider));
                            da0Var7.setTextSize(1, 14.0f);
                            da0Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            da0Var7.setSingleLine(false);
                            da0Var7.setMaxLines(4);
                            da0Var7.setGravity(17);
                            f7.addView(da0Var7, w7.a6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final di.d dVar4 = new di.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            f7.addView(dVar4, w7.a6.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: zh.g6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final di.d dVar5 = dVar4;
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
                                    final org.telegram.ui.ActionBar.e3[] e3VarArr5 = e3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: zh.i6
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new li.k0(i23, dVar5, tLObject, starsSubscription2, z17, z18, e3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r62 = 0;
                    e3Var.customView = f7;
                    e3VarArr2[r62] = e3Var;
                    e3Var.useBackgroundTopPadding = r62;
                    e3Var.setOnDismissListener(new rg.s(i14, m6Var));
                    e3VarArr2[r62].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        e3VarArr2[r62].makeAttached(U);
                    }
                    e3VarArr2[r62].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                k9Var.r(user3);
                z9Var.e(user3, k9Var);
            }
            i11 = i17;
            e3VarArr = e3VarArr3;
            frameLayout.addView(z9Var, w7.a6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f7.addView(textView3, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f7.addView(textView22, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
            n01Var = new n01(parentActivity, resourceProvider);
            da0 da0Var8 = new da0(parentActivity, resourceProvider);
            da0Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            da0Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.g6.gc;
            da0Var8.setTextColor(org.telegram.ui.ActionBar.g6.w0(i192, resourceProvider));
            da0Var8.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i192, resourceProvider));
            da0Var8.setTextSize(1, 14.0f);
            da0Var8.setSingleLine(true);
            da0Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(da0Var8, 24.0f, i11);
            if (peerDialogId < 0) {
            }
            z14 = z13;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(k5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.e3[] e3VarArr42 = e3VarArr;
            spannableStringBuilder2.setSpan(new n6(e3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            da0Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (peerDialogId >= 0) {
                n01Var.c(LocaleController.getString(!z11 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            n01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
            n01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f7.addView(n01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            da0 da0Var22 = new da0(parentActivity, resourceProvider);
            int i202 = org.telegram.ui.ActionBar.g6.z6;
            da0Var22.setTextColor(org.telegram.ui.ActionBar.g6.w0(i202, resourceProvider));
            da0Var22.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i192, resourceProvider));
            final int i212 = 1;
            da0Var22.setTextSize(1, 14.0f);
            da0Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                        handler.post(new j9.u(11, dVar5, obj2));
                                        try {
                                            if (i23 == 26 || i23 == 27) {
                                                Boolean bool = Boolean.FALSE;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } else {
                                                activity.recreate();
                                            }
                                            handler.post(new j9.u(12, application, dVar5));
                                            return;
                                        } finally {
                                            handler.post(new j9.u(12, application, dVar5));
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity.recreate();
                            return;
                        default:
                            pf.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            return;
                    }
                }
            }));
            da0Var22.setGravity(17);
            f7.addView(da0Var22, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r62 = 0;
            e3Var.customView = f7;
            e3VarArr2[r62] = e3Var;
            e3Var.useBackgroundTopPadding = r62;
            e3Var.setOnDismissListener(new rg.s(i14, m6Var));
            e3VarArr2[r62].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            e3VarArr2[r62].show();
        }
    }

    public final void I0(ArrayList arrayList, z61 z61Var) {
        if (getParentActivity() == null) {
            return;
        }
        n5 y3 = n5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        ab abVar = (ab) super.r0(getParentActivity());
        l61 l61Var = new l61(-2);
        l61Var.c = abVar;
        arrayList.add(l61Var);
        arrayList.add(l61.k(this.U));
        di.d dVar = this.d0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(l61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(fi.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_earn_stars, zo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(l61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.d.o(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = g7.a;
                l61 J = l61.J(g7.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(l61.o(arrayList.size(), 33));
            } else if (!y3.y) {
                l61 c10 = l61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(l61.B(null));
        }
        boolean O = y3.O(0);
        this.e0 = O;
        if (O) {
            arrayList.add(l61.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(l61.l(this.S));
        }
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new o7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new x50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 2);
        this.Q = nVar;
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.g6.fk;
        gVar.A = org.telegram.ui.ActionBar.g6.gk;
        gVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.a6.a(190.0f, 0.0f, 12.0f, 0.0f, 24.0f, 190, 17));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ei.a(context, 7)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new bi.d(this, 21));
        d10 d10Var = new d10(getParentActivity());
        this.T = d10Var;
        this.s.addView(d10Var, w7.a6.d(-1.0f, -1));
        n5 y3 = n5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getParentActivity(), false, true, false);
        this.W = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        b80 b80Var = new b80(this.W, 42.0f, this.currentAccount);
        yj0 yj0Var = new yj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = b80Var.b;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver.setAutoRepeat(2);
        b80Var.f = false;
        b80Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(b80Var, 0, 1, 33);
        this.U.addView(this.W, w7.a6.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, this.resourceProvider));
        this.U.addView(this.X, w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        sg.p0 p0Var = new sg.p0(this, getParentActivity(), 5);
        this.Z = p0Var;
        frameLayout2.addView(p0Var);
        di.d dVar = new di.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar;
        dVar.e();
        this.a0.g("", false, true);
        final int i10 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.w5
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
        this.Z.addView(this.a0, w7.a6.e(-1, 48, 119));
        ic1 ic1Var = new ic1(this, getParentActivity(), 20);
        this.b0 = ic1Var;
        frameLayout2.addView(ic1Var);
        di.d dVar2 = new di.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new br(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.c0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.w5
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
        this.b0.addView(this.c0, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        di.d dVar3 = new di.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new br(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: zh.x5
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
        this.b0.addView(this.Y, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.a6.a(48.0f, 20.0f, 17.0f, 20.0f, 0.0f, -1, 17));
        di.d dVar4 = new di.d(getParentActivity(), this.resourceProvider, false);
        this.d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new br(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.d0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: zh.x5
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
        this.U.addView(this.d0, w7.a6.a(48.0f, 20.0f, 8.0f, 20.0f, 0.0f, -1, 17));
        l1();
        s6 s6Var2 = this.g0;
        if (s6Var2 != null) {
            s6Var2.N(false);
        }
        p.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
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
            n5 y3 = n5.y(this.currentAccount, false);
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
        n5 y3 = n5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        this.a0.g(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
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
            this.Z.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: zh.y5
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
            this.b0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: zh.y5
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

    @Override // org.telegram.ui.v20
    public final s4.g0 n0() {
        s6 s6Var = new s6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ii.a(this, 26), getResourceProvider());
        this.g0 = s6Var;
        s6Var.r = false;
        return s6Var;
    }

    @Override // org.telegram.ui.v20
    public final u20 o0() {
        return new ei.f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        n5.y(this.currentAccount, false).T(true);
        n5.y(this.currentAccount, false).S();
        n5.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.v20
    public final sg.x1 p0() {
        return new r6(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.v20
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

    @Override // org.telegram.ui.v20
    public final View r0(Context context) {
        throw null;
    }
}
