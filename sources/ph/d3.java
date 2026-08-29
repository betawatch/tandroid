package ph;

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
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import jh.ia;
import jh.r8;
import nh.t4;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.lx0;
import org.telegram.ui.qe1;
import org.telegram.ui.th;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d3 extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public dg.i N;
    public fn O;
    public v2 P;

    public d3(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static void A0(d3 d3Var, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10 = d3Var.L;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            jh.y d = jh.b0.g(d3Var.currentAccount).d(j10);
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
            jh.z e10 = jh.b0.g(d3Var.currentAccount).e(j10);
            e10.c = 0;
            e10.d = false;
            e10.i = false;
            e10.f = 0L;
            e10.j = null;
            e10.h = false;
            e10.a();
            d3Var.P.N(true);
        }
        c2Var.dismiss();
    }

    public static boolean B0(d3 d3Var, Context context, View view, int i10) {
        v2 v2Var = d3Var.P;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                j70 H = j70.H(d3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new org.telegram.ui.web.y(12, d3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new org.telegram.ui.web.y(13, d3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new yw0(d3Var, connectedbotstarref, user, 22), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new lx0(d3Var, context, user, connectedbotstarref, 17));
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
    public static void G0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, c6 c6Var, boolean z10) {
        long[] jArr;
        float f9;
        String str;
        String str2;
        ?? r14;
        String formatPluralString;
        LinearLayout linearLayout;
        t9 t9Var;
        TextView textView;
        c6 c6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        long[] jArr2 = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, f6.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        t9 t9Var2 = new t9(context);
        t9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        e9 e9Var = new e9((c6) null);
        e9Var.r(user);
        t9Var2.e(user, e9Var);
        h6.a(t9Var2);
        frameLayout2.addView(t9Var2, f6.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(g6.b0(AndroidUtilities.dp(10.0f), g6.v0(g6.h5, c6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(g6.b0(AndroidUtilities.dp(10.0f), g6.v0(g6.uj, c6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f9 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) ia.K0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(ia.R0(sb2.toString(), 0.75f, new iq[1]));
            frameLayout3.addView(textView2, f6.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
            f9 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int v02 = g6.v0(g6.E6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        frameLayout.addView(imageView, f6.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, f6.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        t9 t9Var3 = new t9(context);
        t9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(t9Var3, f6.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(f9);
        int i11 = g6.h5;
        frameLayout5.setBackground(g6.b0(dp, g6.v0(i11, c6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(g6.b0(AndroidUtilities.dp(f9), g6.v0(g6.Oh, c6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) j.G0(starrefprogram.commission_permille)));
        iq iqVar = new iq(R.drawable.msg_link_1, 0);
        iqVar.setScale(0.65f, 0.65f);
        iqVar.spaceScaleX = 0.7f;
        iqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(iqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, f6.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        g10.addView(frameLayout, f6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i12 = g6.G6;
        org.telegram.ui.b.m(i12, c6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        g10.addView(textView4, f6.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i13 = g6.a7;
        linearLayout2.setBackground(g6.b0(dp2, g6.v0(i13, c6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(g6.v0(i12, c6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, f6.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i14 = g6.r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i14, c6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, f6.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout2, f6.t(-2, 28, 1, 4, 0, 4, 0));
        h6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        org.telegram.ui.b.m(i12, c6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(ia.K0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(ia.X0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView i15 = th.i(g10, textView6, f6.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        org.telegram.ui.b.m(i12, c6Var, i15, 1, 14.0f);
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
                g10.addView(i15, f6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    org.telegram.ui.b.m(i12, c6Var, textView7, 1, 14.0f);
                    textView7.setGravity(17);
                    textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                    g10.addView(textView7, f6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i13, c6Var)));
                    int dp3 = AndroidUtilities.dp(28.0f);
                    int v03 = g6.v0(i13, c6Var);
                    int v = g6.v(g6.v0(i13, c6Var), g6.v0(g6.i6, c6Var));
                    linearLayout3.setBackground(g6.i0(dp3, dp3, dp3, dp3, v03, v, v));
                    t9 t9Var4 = new t9(context);
                    t9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                    linearLayout3.addView(t9Var4, f6.n(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    textView8.setTextColor(g6.v0(i12, c6Var));
                    linearLayout3.addView(textView8, f6.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setScaleType(scaleType);
                    imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i14, c6Var), mode));
                    imageView3.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView3, f6.t(-2, -2, 16, 2, 0, 5, 0));
                    g10.addView(linearLayout3, f6.t(-2, 28, 1, 0, 11, 0, 20));
                    textView = textView8;
                    linearLayout = linearLayout3;
                    t9Var = t9Var4;
                } else {
                    linearLayout = null;
                    t9Var = null;
                    textView = null;
                }
                nh.d dVar = new nh.d(context, c6Var, true);
                dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
                g10.addView(dVar, f6.n(-1, 48));
                y80 y80Var = new y80(context, c6Var);
                y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.e(context, 12)));
                y80Var.setGravity(17);
                y80Var.setTextSize(1, 12.0f);
                y80Var.setTextColor(g6.v0(g6.B6, c6Var));
                y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
                g10.addView(y80Var, f6.t(-1, -2, 49, 14, 14, 14, 6));
                q6.customView = g10;
                final int i18 = 1;
                t9Var2.setOnClickListener(new View.OnClickListener() { // from class: ph.q2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = q6;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y2(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    q6.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new jz0(dVar, jArr, i10, starrefprogram, q6, j10, z10, context, c6Var, user));
                q6.setOnDismissListener(new bg.f0(7));
                bg.j3 j3Var = new bg.j3(jArr, i10, t9Var3, t9Var, textView, 26);
                j3Var.run();
                if (linearLayout == null) {
                    jh.b0.g(i10).n();
                    jh.b0.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    c6Var2 = c6Var;
                    linearLayout4.setOnClickListener(new r8(i10, q6, c6Var2, linearLayout4, jArr, j3Var));
                } else {
                    c6Var2 = c6Var;
                }
                final int i19 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ph.q2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    org.telegram.ui.ActionBar.f3 f3Var = q6;
                                    f3Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    U.presentFragment(new y2(bundle, f3Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    q6.dismiss();
                                    U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                q6.fixNavigationBar(g6.v0(i11, c6Var2));
                q6.show();
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
        g10.addView(i15, f6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        nh.d dVar2 = new nh.d(context, c6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        g10.addView(dVar2, f6.n(-1, 48));
        y80 y80Var2 = new y80(context, c6Var);
        y80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.e(context, 12)));
        y80Var2.setGravity(17);
        y80Var2.setTextSize(1, 12.0f);
        y80Var2.setTextColor(g6.v0(g6.B6, c6Var));
        y80Var2.setLinkTextColor(g6.v0(g6.gc, c6Var));
        g10.addView(y80Var2, f6.t(-1, -2, 49, 14, 14, 14, 6));
        q6.customView = g10;
        final int i182 = 1;
        t9Var2.setOnClickListener(new View.OnClickListener() { // from class: ph.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i182) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = q6;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y2(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            q6.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new jz0(dVar2, jArr, i10, starrefprogram, q6, j10, z10, context, c6Var, user));
        q6.setOnDismissListener(new bg.f0(7));
        bg.j3 j3Var2 = new bg.j3(jArr, i10, t9Var3, t9Var, textView, 26);
        j3Var2.run();
        if (linearLayout == null) {
        }
        final int i192 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ph.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i192) {
                    case 0:
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            org.telegram.ui.ActionBar.f3 f3Var = q6;
                            f3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            U.presentFragment(new y2(bundle, f3Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            q6.dismiss();
                            U2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        q6.fixNavigationBar(g6.v0(i11, c6Var2));
        q6.show();
    }

    public static org.telegram.ui.ActionBar.f3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, c6 c6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c3;
        String formatPluralString;
        int i11;
        char c6;
        String formatPluralString2;
        int i12;
        org.telegram.ui.ActionBar.f3 f3Var;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        c6 c6Var2;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(g6.K(AndroidUtilities.dp(40.0f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.Oh, c6Var)));
        frameLayout.addView(view, f6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, f6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(g6.b0(AndroidUtilities.dp(50.0f), g6.v0(g6.h5, c6Var)));
            frameLayout.addView(frameLayout2, f6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(g6.b0(AndroidUtilities.dp(9.5f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.uj, c6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            iq iqVar = new iq(R.drawable.mini_reply_user, 0);
            iqVar.setScale(0.937f, 0.937f);
            iqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            iqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, f6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, f6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = g6.G6;
        org.telegram.ui.b.m(i14, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        g10.addView(textView2, f6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i15 = g6.a7;
        linearLayout3.setBackground(g6.b0(dp, g6.v0(i15, c6Var)));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        e9 e9Var = new e9((c6) null);
        linearLayout3.addView(t9Var, f6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(g6.v0(i14, c6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        e9Var.r(user2);
        t9Var.e(user2, e9Var);
        linearLayout3.addView(textView3, f6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = g6.r5;
        int v02 = g6.v0(i16, c6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, f6.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, f6.t(-2, 28, 1, 4, 0, 4, 0));
        h6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.m(i14, c6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.x3.r(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
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
                    c6 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i18 < 12 || i18 % 12 != 0) {
                        c6 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i18, new Object[0]);
                    } else {
                        c6 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i18 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c6] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                org.telegram.ui.b.p(i17, objArr, textView4);
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
                org.telegram.ui.b.p(i19, objArr2, textView4);
            }
        }
        g10.addView(textView4, f6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i14;
            f3Var = q6;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            org.telegram.ui.b.m(i14, c6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            g10.addView(textView5, f6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i15, c6Var)));
            t9 t9Var2 = new t9(context);
            t9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            e9 e9Var2 = new e9((c6) null);
            linearLayout4.addView(t9Var2, f6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(g6.v0(i14, c6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                e9Var2.r(user3);
                t9Var2.e(user3, e9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i14;
                f3Var = q6;
                mode = mode2;
            } else {
                i12 = i14;
                f3Var = q6;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                e9Var2.q(chat);
                t9Var2.e(chat, e9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, f6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i16, c6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, f6.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, f6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(g6.v0(i12, c6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = g6.v0(i15, c6Var);
        int v = g6.v(g6.v0(i15, c6Var), g6.v0(g6.i6, c6Var));
        textView7.setBackground(g6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        g10.addView(textView7, f6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        nh.d dVar = new nh.d(context, c6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new iq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        g10.addView(dVar, f6.n(-1, 48));
        y80 y80Var = new y80(context, c6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        y80Var.setText(formatPluralString3);
        y80Var.setGravity(17);
        y80Var.setTextSize(i13, 12.0f);
        y80Var.setTextColor(g6.v0(g6.B6, c6Var));
        y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        g10.addView(y80Var, f6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        f3Var2.customView = g10;
        lx0 lx0Var = new lx0(connectedbotstarref, f3Var2, c6Var, user, 16);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new mh.n(lx0Var, 15));
        }
        dVar.setOnClickListener(new u2(connectedbotstarref, i10, f3Var2, context, j10, c6Var, lx0Var));
        f3Var2.setOnDismissListener(new bg.f0(7));
        if (linearLayout2 != null) {
            jh.b0.g(i10).n();
            jh.b0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            c6Var2 = c6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u2(i10, f3Var2, c6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            c6Var2 = c6Var;
        }
        linearLayout.setOnClickListener(new org.telegram.ui.web.c(3, f3Var2, connectedbotstarref2));
        f3Var2.fixNavigationBar(g6.v0(g6.h5, c6Var2));
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            f3Var2.makeAttached(U);
        }
        f3Var2.show();
        return f3Var2;
    }

    public static void x0(d3 d3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new fi1(4, d3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(d3 d3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(d3Var.getParentActivity(), 3, null);
        c2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d3Var.currentAccount).getInputPeer(d3Var.L);
        editconnectedstarrefbot.revoked = true;
        d3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new qe1(5, d3Var, c2Var));
    }

    public static /* synthetic */ void z0(d3 d3Var, Context context, int i10) {
        v2 v2Var = d3Var.P;
        if (v2Var == null) {
            return;
        }
        Object obj = v2Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            G0(context, d3Var.currentAccount, (TL_payments.starRefProgram) obj, d3Var.L, d3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            H0(context, d3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d3Var.L, d3Var.resourceProvider);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5 A[LOOP:0: B:20:0x019f->B:22:0x01a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(ArrayList arrayList, k51 k51Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        cg.h0 h0Var = (cg.h0) r0(getParentActivity());
        w41 w41Var = new w41(-2);
        w41Var.c = h0Var;
        arrayList.add(w41Var);
        arrayList.add(h.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(h.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(h.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(w41.A(1, null));
        jh.b0 g10 = jh.b0.g(this.currentAccount);
        long j10 = this.L;
        jh.y d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            th.p(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = z2.a;
                w41 J = w41.J(z2.class);
                J.G = connectedbotstarref;
                J.r = true;
                arrayList.add(J);
            }
            if (!d.d || d.g) {
                arrayList.add(w41.n(29));
                arrayList.add(w41.n(29));
                arrayList.add(w41.n(29));
            }
            arrayList.add(w41.A(2, null));
        }
        jh.z e10 = jh.b0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e10.e;
        if (!arrayList3.isEmpty() || e10.c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i12 = e10.g;
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
                w41 J2 = w41.J(b3.class);
                J2.l = string;
                J2.m = spannableStringBuilder;
                arrayList.add(J2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = z2.a;
                    w41 J3 = w41.J(z2.class);
                    J3.G = obj;
                    J3.r = true;
                    arrayList.add(J3);
                }
                if (e10.d || e10.h) {
                    arrayList.add(w41.n(29));
                    arrayList.add(w41.n(29));
                    arrayList.add(w41.n(29));
                }
                arrayList.add(w41.A(3, null));
            }
            iq iqVar = new iq(R.drawable.arrow_more, 0);
            iqVar.useLinkPaintColor = true;
            iqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(iqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new x2(this, i12, jh.b0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i132 = b3.a;
            w41 J22 = w41.J(b3.class);
            J22.l = string;
            J22.m = spannableStringBuilder;
            arrayList.add(J22);
            while (i14 < arrayList3.size()) {
            }
            if (e10.d) {
            }
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
            arrayList.add(w41.A(3, null));
        }
        arrayList.add(w41.k(this.O));
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        fn fnVar = new fn(context, 27);
        this.O = fnVar;
        fnVar.setBackgroundColor(g6.w0(null, g6.i5, false));
        super.createView(context);
        this.M = new FrameLayout(context);
        dg.i iVar = new dg.i(context, 1, 3);
        this.N = iVar;
        iVar.setImportantForAccessibility(4);
        dg.a aVar = this.N.b;
        aVar.w = g6.fk;
        aVar.x = g6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, f6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.M, null);
        this.c.setOnItemClickListener(new eg.w0(24, this, context));
        this.c.setOnItemLongClickListener(new fi1(5, this, context));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnScrollListener(new h00(this, 15));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.L;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v2Var = this.P) != null) {
                v2Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            v2 v2Var2 = this.P;
            if (v2Var2 != null) {
                v2Var2.N(true);
            }
            jh.b0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.z10
    public final f2.p0 n0() {
        v2 v2Var = new v2(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new t4(this, 12), getResourceProvider());
        this.P = v2Var;
        return v2Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.z10
    public final cg.s2 p0() {
        cg.h hVar = new cg.h(getParentActivity(), 5);
        hVar.b();
        return hVar;
    }
}
