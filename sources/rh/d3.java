package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import k7.d6;
import lh.ja;
import lh.s8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.dy0;
import org.telegram.ui.n20;
import org.telegram.ui.qi1;
import ph.d4;
import ph.e6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d3 extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public FrameLayout N;
    public fg.i O;
    public gn P;
    public v2 Q;

    public d3(long j10) {
        this.M = j10;
        this.J = true;
        this.I = AndroidUtilities.dp(60.0f);
    }

    public static void A0(d3 d3Var, TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var) {
        long j10 = d3Var.M;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            lh.y d = lh.b0.g(d3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.a;
            MessagesController.getInstance(i10).putUsers(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id != connectedbotstarref.bot_id) {
                        i12++;
                    } else if (connectedbotstarref.revoked) {
                        arrayList.remove(i12);
                        d.c = Math.max(d.c - 1, 0);
                    } else {
                        arrayList.set(i12, connectedbotstarref);
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.b));
            d.a();
            lh.z e = lh.b0.g(d3Var.currentAccount).e(j10);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            d3Var.Q.N(true);
        }
        d2Var.dismiss();
    }

    public static boolean B0(d3 d3Var, Context context, View view, int i10) {
        v2 v2Var = d3Var.Q;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                p70 H = p70.H(d3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new e6(16, d3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new e6(17, d3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new m71(d3Var, connectedbotstarref, user, 23), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new dy0(d3Var, context, user, connectedbotstarref, 18));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x054a  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, f6 f6Var, boolean z4) {
        long[] jArr;
        float f10;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        p9 p9Var;
        TextView textView;
        f6 f6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        f11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, b6.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var2 = new p9(context);
        p9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        z8 z8Var = new z8((f6) null);
        z8Var.r(user);
        p9Var2.e(user, z8Var);
        d6.a(p9Var2);
        frameLayout2.addView(p9Var2, b6.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(j6.b0(AndroidUtilities.dp(10.0f), j6.v0(j6.h5, f6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(j6.b0(AndroidUtilities.dp(10.0f), j6.v0(j6.uj, f6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f10 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb.append((Object) ja.K0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(ja.R0(sb.toString(), 0.75f, new lq[1]));
            frameLayout3.addView(textView2, b6.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
            f10 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int v02 = j6.v0(j6.E6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        frameLayout.addView(imageView, b6.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, b6.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        p9 p9Var3 = new p9(context);
        p9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(p9Var3, b6.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f10);
        int i11 = j6.h5;
        frameLayout5.setBackground(j6.b0(dp, j6.v0(i11, f6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(j6.b0(AndroidUtilities.dp(f10), j6.v0(j6.Oh, f6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) j.G0(starrefprogram.commission_permille)));
        lq lqVar = new lq(R.drawable.msg_link_1, 0);
        lqVar.setScale(0.65f, 0.65f);
        lqVar.spaceScaleX = 0.7f;
        lqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(lqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, b6.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f11.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i12 = j6.G6;
        org.telegram.ui.b.l(i12, f6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        f11.addView(textView4, b6.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i13 = j6.a7;
        linearLayout2.setBackground(j6.b0(dp2, j6.v0(i13, f6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(j6.v0(i12, f6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, b6.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i14 = j6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i14, f6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout2, b6.t(-2, 28, 1, 4, 0, 4, 0));
        d6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        org.telegram.ui.b.l(i12, f6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(ja.K0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(ja.X0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView i15 = ai.i(f11, textView6, b6.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        org.telegram.ui.b.l(i12, f6Var, i15, 1, 14.0f);
        i15.setGravity(17);
        NotificationCenter.listenEmojiLoading(i15);
        int i16 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String G0 = j.G0(starrefprogram.commission_permille);
        int i17 = starrefprogram.duration_months;
        if (i17 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            str = userName;
        } else {
            if (i17 < 12 || i17 % 12 != 0) {
                str = userName;
                str2 = G0;
                r14 = 0;
                formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i17, new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r14] = str;
                objArr[1] = str2;
                objArr[2] = formatPluralString;
                i15.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr)), i15.getPaint().getFontMetricsInt(), r14));
                f11.addView(i15, b6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    org.telegram.ui.b.l(i12, f6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    f11.addView(textView7, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i13, f6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int v03 = j6.v0(i13, f6Var);
                    int v = j6.v(j6.v0(i13, f6Var), j6.v0(j6.i6, f6Var));
                    linearLayout3.setBackground(j6.i0(dp3, dp3, dp3, dp3, v03, v, v));
                    p9 p9Var4 = new p9(context);
                    p9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(p9Var4, b6.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(j6.v0(i12, f6Var));
                    linearLayout3.addView(textView8, b6.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i14, f6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, b6.t(-2, -2, 16, 2, 0, 5, 0));
                    f11.addView(linearLayout3, b6.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    p9Var = p9Var4;
                } else {
                    linearLayout = null;
                    p9Var = null;
                    textView = null;
                }
                ph.d dVar = new ph.d(context, f6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                f11.addView(dVar, b6.n(-1, 48));
                f90 f90Var = new f90(context, f6Var);
                f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.f(context, 12)));
                f90Var.setGravity(17);
                f90Var.setTextSize(1, 12.0f);
                f90Var.setTextColor(j6.v0(j6.B6, f6Var));
                f90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
                f11.addView(f90Var, b6.t(-1, -2, 49, 14, 14, 14, 6));
                o10.customView = f11;
                final int i18 = 1;
                p9Var2.setOnClickListener(new View.OnClickListener() { // from class: rh.q2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.g3 g3Var = o10;
                                    g3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y2(bundle, g3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    o10.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new uz0(dVar, jArr, i10, starrefprogram, o10, j10, z4, context, f6Var, user));
                o10.setOnDismissListener(new dg.e0(6));
                dg.f3 f3Var = new dg.f3(jArr, i10, p9Var3, p9Var, textView, 25);
                f3Var.run();
                if (linearLayout == null) {
                    lh.b0.g(i10).n();
                    lh.b0.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    f6Var2 = f6Var;
                    linearLayout4.setOnClickListener(new s8(i10, o10, f6Var2, linearLayout4, jArr, f3Var));
                } else {
                    f6Var2 = f6Var;
                }
                final int i19 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: rh.q2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.g3 g3Var = o10;
                                    g3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y2(bundle, g3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    o10.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                o10.fixNavigationBar(j6.v0(i11, f6Var2));
                o10.show();
            }
            str = userName;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i17 / 12, new Object[0]);
        }
        str2 = G0;
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = str;
        objArr2[1] = str2;
        objArr2[2] = formatPluralString;
        i15.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i16, objArr2)), i15.getPaint().getFontMetricsInt(), r14));
        f11.addView(i15, b6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        ph.d dVar2 = new ph.d(context, f6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        f11.addView(dVar2, b6.n(-1, 48));
        f90 f90Var2 = new f90(context, f6Var);
        f90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.f(context, 12)));
        f90Var2.setGravity(17);
        f90Var2.setTextSize(1, 12.0f);
        f90Var2.setTextColor(j6.v0(j6.B6, f6Var));
        f90Var2.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f11.addView(f90Var2, b6.t(-1, -2, 49, 14, 14, 14, 6));
        o10.customView = f11;
        final int i182 = 1;
        p9Var2.setOnClickListener(new View.OnClickListener() { // from class: rh.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i182) {
                    case 0:
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.g3 g3Var = o10;
                            g3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y2(bundle, g3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            o10.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new uz0(dVar2, jArr, i10, starrefprogram, o10, j10, z4, context, f6Var, user));
        o10.setOnDismissListener(new dg.e0(6));
        dg.f3 f3Var2 = new dg.f3(jArr, i10, p9Var3, p9Var, textView, 25);
        f3Var2.run();
        if (linearLayout == null) {
        }
        final int i192 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: rh.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i192) {
                    case 0:
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.g3 g3Var = o10;
                            g3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y2(bundle, g3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            o10.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        o10.fixNavigationBar(j6.v0(i11, f6Var2));
        o10.show();
    }

    public static org.telegram.ui.ActionBar.g3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, f6 f6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c3;
        String formatPluralString;
        int i11;
        char c10;
        String formatPluralString2;
        int i12;
        org.telegram.ui.ActionBar.g3 g3Var;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        f6 f6Var2;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(j6.K(AndroidUtilities.dp(40.0f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.Oh, f6Var)));
        frameLayout.addView(view, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(j6.b0(AndroidUtilities.dp(50.0f), j6.v0(j6.h5, f6Var)));
            frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(j6.b0(AndroidUtilities.dp(9.5f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, f6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            lq lqVar = new lq(R.drawable.mini_reply_user, 0);
            lqVar.setScale(0.937f, 0.937f);
            lqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            lqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, b6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = j6.G6;
        org.telegram.ui.b.l(i14, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f10.addView(textView2, b6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i15 = j6.a7;
        linearLayout3.setBackground(j6.b0(dp, j6.v0(i15, f6Var)));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        z8 z8Var = new z8((f6) null);
        linearLayout3.addView(p9Var, b6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(j6.v0(i14, f6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        z8Var.r(user2);
        p9Var.e(user2, z8Var);
        linearLayout3.addView(textView3, b6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = j6.r5;
        int v02 = j6.v0(i16, f6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, b6.t(-2, 28, 1, 4, 0, 4, 0));
        d6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.l(i14, f6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.y3.q(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i17 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = j.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i18 = connectedbotstarref.duration_months;
                if (i18 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c10 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i18 < 12 || i18 % 12 != 0) {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i18, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i18 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c10] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                org.telegram.ui.b.o(i17, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i19 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = j.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i20 = connectedbotstarref.duration_months;
                if (i20 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i11 = 3;
                    c3 = 0;
                } else {
                    str = userName2;
                    if (i20 < 12 || i20 % 12 != 0) {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i20, new Object[0]);
                    } else {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i20 / 12, new Object[0]);
                    }
                    i11 = 3;
                }
                Object[] objArr2 = new Object[i11];
                objArr2[c3] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                org.telegram.ui.b.o(i19, objArr2, textView4);
            }
        }
        f10.addView(textView4, b6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i14;
            g3Var = o10;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            org.telegram.ui.b.l(i14, f6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f10.addView(textView5, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i15, f6Var)));
            p9 p9Var2 = new p9(context);
            p9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            z8 z8Var2 = new z8((f6) null);
            linearLayout4.addView(p9Var2, b6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(j6.v0(i14, f6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                z8Var2.r(user3);
                p9Var2.e(user3, z8Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i14;
                g3Var = o10;
                mode = mode2;
            } else {
                i12 = i14;
                g3Var = o10;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                z8Var2.q(chat);
                p9Var2.e(chat, z8Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, b6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i16, f6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, b6.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, b6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(j6.v0(i12, f6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = j6.v0(i15, f6Var);
        int v = j6.v(j6.v0(i15, f6Var), j6.v0(j6.i6, f6Var));
        textView7.setBackground(j6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, b6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ph.d dVar = new ph.d(context, f6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new lq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        f10.addView(dVar, b6.n(-1, 48));
        f90 f90Var = new f90(context, f6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        f90Var.setText(formatPluralString3);
        f90Var.setGravity(17);
        f90Var.setTextSize(i13, 12.0f);
        f90Var.setTextColor(j6.v0(j6.B6, f6Var));
        f90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f10.addView(f90Var, b6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
        g3Var2.customView = f10;
        dy0 dy0Var = new dy0(connectedbotstarref, g3Var2, f6Var, user, 17);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new oh.n(dy0Var, 15));
        }
        dVar.setOnClickListener(new u2(connectedbotstarref, i10, g3Var2, context, j10, f6Var, dy0Var));
        g3Var2.setOnDismissListener(new dg.e0(6));
        if (linearLayout2 != null) {
            lh.b0.g(i10).n();
            lh.b0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            f6Var2 = f6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u2(i10, g3Var2, f6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            f6Var2 = f6Var;
        }
        linearLayout.setOnClickListener(new ph.s8(3, g3Var2, connectedbotstarref2));
        g3Var2.fixNavigationBar(j6.v0(j6.h5, f6Var2));
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            g3Var2.makeAttached(U);
        }
        g3Var2.show();
        return g3Var2;
    }

    public static void x0(d3 d3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new org.telegram.ui.web.m(4, d3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(d3 d3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(d3Var.getParentActivity(), 3, null);
        d2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d3Var.currentAccount).getInputPeer(d3Var.M);
        editconnectedstarrefbot.revoked = true;
        d3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new qi1(5, d3Var, d2Var));
    }

    public static /* synthetic */ void z0(d3 d3Var, Context context, int i10) {
        v2 v2Var = d3Var.Q;
        if (v2Var == null) {
            return;
        }
        Object obj = v2Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            G0(context, d3Var.currentAccount, (TL_payments.starRefProgram) obj, d3Var.M, d3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            H0(context, d3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d3Var.M, d3Var.resourceProvider);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(ArrayList arrayList, w51 w51Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        eg.h0 h0Var = (eg.h0) r0(getParentActivity());
        i51 i51Var = new i51(-2);
        i51Var.c = h0Var;
        arrayList.add(i51Var);
        arrayList.add(h.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(h.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(h.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(i51.A(1, null));
        lh.b0 g10 = lh.b0.g(this.currentAccount);
        long j10 = this.M;
        lh.y d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            ai.q(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = z2.a;
                i51 J = i51.J(z2.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(i51.n(29));
                arrayList.add(i51.n(29));
                arrayList.add(i51.n(29));
            }
            arrayList.add(i51.A(2, null));
        }
        lh.z e = lh.b0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i12 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
            if (i12 == 1) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
            } else if (i12 == 2) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
            } else {
                if (i12 == 3) {
                    spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
                }
                int i13 = b3.a;
                i51 J2 = i51.J(b3.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = z2.a;
                    i51 J3 = i51.J(z2.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e.d || e.h) {
                    arrayList.add(i51.n(29));
                    arrayList.add(i51.n(29));
                    arrayList.add(i51.n(29));
                }
                arrayList.add(i51.A(3, null));
            }
            lq lqVar = new lq(R.drawable.arrow_more, 0);
            lqVar.useLinkPaintColor = true;
            lqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(lqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new x2(this, i12, lh.b0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = b3.a;
            i51 J22 = i51.J(b3.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i14 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.A(3, null));
        }
        arrayList.add(i51.k(this.P));
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        gn gnVar = new gn(context, 27);
        this.P = gnVar;
        gnVar.setBackgroundColor(j6.w0(null, j6.i5, false));
        super.createView(context);
        this.N = new FrameLayout(context);
        fg.i iVar = new fg.i(context, 1, 3);
        this.O = iVar;
        iVar.setImportantForAccessibility(4);
        fg.a aVar = this.O.b;
        aVar.w = j6.fk;
        aVar.x = j6.gk;
        aVar.b();
        this.O.setStarParticlesView(this.e);
        this.N.addView(this.O, b6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.N, null);
        this.c.setOnItemClickListener(new gg.v0(24, this, context));
        this.c.setOnItemLongClickListener(new org.telegram.ui.web.m(5, this, context));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnScrollListener(new mb0(this, 15));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.M;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v2Var = this.Q) != null) {
                v2Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            v2 v2Var2 = this.Q;
            if (v2Var2 != null) {
                v2Var2.N(true);
            }
            lh.b0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.n20
    public final f2.o0 n0() {
        v2 v2Var = new v2(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 12), getResourceProvider());
        this.Q = v2Var;
        return v2Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(true);
            this.O.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(false);
            this.O.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.n20
    public final eg.q2 p0() {
        eg.h hVar = new eg.h(getParentActivity(), 5);
        hVar.b();
        return hVar;
    }
}
