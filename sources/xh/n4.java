package xh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import yh.t5;
import yh.w7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ n4(z4 z4Var, int i10) {
        this.a = i10;
        this.b = z4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        char c10;
        String formatString;
        int i11;
        boolean z10;
        String formatString2;
        CharSequence replaceArrows;
        int i12 = this.a;
        z4 z4Var = this.b;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                rg.k kVar = z4Var.e0;
                FrameLayout frameLayout = z4Var.o0;
                boolean z11 = z4Var.a0;
                boolean z12 = z4Var.b0;
                TL_stars.StarGift starGift = z4Var.c0;
                String str = z4Var.f0;
                boolean z13 = z4Var.X;
                int i13 = z4Var.Y;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j3 = z4Var.Z;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j3);
                arrayList.add(v51.j(-1, z4Var.h0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(v51.j(-2, z4Var.s0));
                    arrayList.add(v51.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z13) {
                        arrayList.add(v51.A(-5, null));
                    } else {
                        arrayList.add(v51.A(-3, null));
                        v51 i14 = v51.i(2, w7.X0(false, LocaleController.formatString(z13 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i14.K(z4Var.q0);
                        arrayList.add(i14);
                        if (z12) {
                            replaceArrows = LocaleController.formatString(j3 < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, str);
                        } else if (z11) {
                            replaceArrows = LocaleController.formatString(j3 < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, str);
                        } else {
                            if (z13) {
                                formatString2 = LocaleController.getString(R.string.Gift2UpgradeSelfInfo);
                                z10 = true;
                            } else {
                                z10 = true;
                                formatString2 = LocaleController.formatString(j3 >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, str);
                            }
                            replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new p4(z4Var, 2)), z10);
                        }
                        v51 A = v51.A(-5, replaceArrows);
                        A.g = (z11 || z12) ? false : true;
                        arrayList.add(A);
                    }
                    v51 i15 = v51.i(1, LocaleController.getString(z13 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    i15.K(z4Var.p0);
                    arrayList.add(i15);
                    if (z13) {
                        i11 = R.string.Gift2HideSelfInfo;
                    } else if (j3 < 0) {
                        i11 = R.string.Gift2HideChannelInfo;
                    } else {
                        i10 = 1;
                        c10 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        arrayList.add(v51.A(-6, formatString));
                        if (frameLayout != null) {
                            int i16 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i10];
                            objArr[c10] = Integer.valueOf(i16);
                            CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i16, objArr), new p4(z4Var, 3)), i10);
                            arrayList.add(v51.j(-43, frameLayout));
                            arrayList.add(v51.A(-44, replaceArrows2));
                        }
                    }
                    formatString = LocaleController.getString(i11);
                    i10 = 1;
                    c10 = 0;
                    arrayList.add(v51.A(-6, formatString));
                    if (frameLayout != null) {
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(v51.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (kVar != null && (kVar.c != null || kVar.d != null)) {
                        v51 i17 = v51.i(3, w7.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) kVar.g())), 0.78f, null));
                        i17.K(z4Var.r0);
                        arrayList.add(i17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(t5.y(i13, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(v51.A(-7, TextUtils.concat(w7.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new p4(z4Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (z4Var.P) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = z4Var.c0;
                u4 u4Var = z4Var.s0;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            AndroidUtilities.hideKeyboard(u4Var);
                            z4Var.dismiss();
                            yc X = z4Var.X();
                            if (X != null && starGift2 != null && starGift2.limited_per_user) {
                                X.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(u4Var);
                        z4Var.dismiss();
                        t5 y3 = t5.y(z4Var.Y, false);
                        if (starGift2 != null && y3.D) {
                            starGift2.availability_remains = 0;
                            y3.c0(y3.F, y3.G, y3.H);
                            NotificationCenter.getInstance(y3.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = z4Var.g0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(u4Var);
                    z4Var.dismiss();
                }
                z4Var.n0.setLoading(false);
                break;
        }
    }
}
