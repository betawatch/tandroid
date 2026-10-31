package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.p10;
import org.telegram.ui.px0;
import org.telegram.ui.vf;
import rh.h5;
import rh.h8;
import rh.l5;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z2 extends p10 implements us {
    public final long R;
    public FrameLayout S;
    public lg.q T;
    public bn U;
    public ph.o3 V;

    public z2(long j10) {
        this.R = j10;
        this.M = true;
        this.L = org.telegram.messenger.i0.L(60.0f);
    }

    public static void A0(z2 z2Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, z2Var.getParentActivity(), null);
        x1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = vp.r1(z2Var.currentAccount).i1(z2Var.R);
        editconnectedstarrefbot.revoked = true;
        z2Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new h5(10, z2Var, x1Var));
    }

    public static /* synthetic */ void B0(z2 z2Var, Context context, int i10) {
        ph.o3 o3Var = z2Var.V;
        if (o3Var == null) {
            return;
        }
        Object obj = o3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            I0(context, z2Var.currentAccount, (TL_payments.starRefProgram) obj, z2Var.R, z2Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            J0(context, z2Var.currentAccount, (TL_payments.connectedBotStarRef) obj, z2Var.R, z2Var.resourceProvider);
        }
    }

    public static void C0(z2 z2Var, TLObject tLObject, org.telegram.ui.ActionBar.x1 x1Var) {
        long j10 = z2Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            rh.n d = rh.r.g(z2Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.a;
            vp.r1(i10).V3(connectedstarrefbots.users, false);
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
            zs.f(i10).k(zs.L3, Long.valueOf(d.b));
            d.a();
            rh.p e = rh.r.g(z2Var.currentAccount).e(j10);
            e.c = 0;
            e.d = false;
            e.i = false;
            e.f = 0L;
            e.j = null;
            e.h = false;
            e.a();
            z2Var.V.O(true);
        }
        x1Var.dismiss();
    }

    public static boolean D0(z2 z2Var, Context context, View view, int i10) {
        ph.o3 o3Var = z2Var.V;
        if (o3Var != null) {
            Object obj = o3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User Z1 = vp.r1(z2Var.currentAccount).Z1(Long.valueOf(connectedbotstarref.bot_id));
                z60 H = z60.H(z2Var, view);
                H.l(R.drawable.msg_bot, cd.L0(2131746723, null), new vh.d1(26, z2Var, Z1), Z1.bot_has_main_app);
                H.l(R.drawable.msg_bot, cd.L0(2131752912, null), new vh.d1(27, z2Var, connectedbotstarref), !Z1.bot_has_main_app);
                H.c(R.drawable.msg_link2, cd.L0(2131751762, null), new l5(z2Var, connectedbotstarref, Z1, 25), false);
                H.m(R.drawable.msg_leave, new p2(z2Var, context, Z1, connectedbotstarref, 0), cd.L0(2131749015, null), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x056d  */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, p6 p6Var, boolean z10) {
        long[] jArr;
        String str;
        ?? r15;
        String G;
        g9 g9Var;
        TextView textView;
        LinearLayout linearLayout;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, p6Var, false);
        long[] jArr2 = {j10};
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(starrefprogram.bot_id));
        LinearLayout f7 = m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, b6.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        g9 g9Var2 = new g9(context);
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
        r8 r8Var = new r8((p6) null);
        r8Var.r(Z1);
        g9Var2.e(Z1, r8Var);
        e6.a(g9Var2);
        frameLayout2.addView(g9Var2, b6.e(60, 60, zs.E1));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(10.0f);
            int i11 = t6.h5;
            ShapeDrawable d02 = t6.d0(L, t6.w0(i11, p6Var));
            w6 N = a7.N(i11);
            frameLayout3.setBackground(d02);
            a7.k(frameLayout3, d02, N, null, p6Var);
            frameLayout3.setPadding(org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f));
            TextView textView2 = new TextView(context);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int i12 = t6.ik;
            ShapeDrawable d03 = t6.d0(L2, t6.w0(i12, p6Var));
            w6 N2 = a7.N(i12);
            textView2.setBackground(d03);
            a7.k(textView2, d03, N2, null, p6Var);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(org.telegram.messenger.i0.L(5.33f), 0, org.telegram.messenger.i0.L(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb2 = new StringBuilder("⭐️ ");
            jArr = jArr2;
            sb2.append((Object) h8.M0(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(h8.T0(sb2.toString(), 0.75f, new dq[1]));
            frameLayout3.addView(textView2, b6.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView e = z20.e(context, R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e.setScaleType(scaleType);
        e.setTranslationX(-org.telegram.messenger.i0.L(2.0825f));
        int i13 = t6.E6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(e, i13, p6Var, mode);
        frameLayout.addView(e, b6.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, b6.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        g9 g9Var3 = new g9(context);
        g9Var3.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
        frameLayout4.addView(g9Var3, b6.e(60, 60, zs.E1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i14 = t6.h5;
        Drawable d04 = t6.d0(L3, t6.w0(i14, p6Var));
        w6 N3 = a7.N(i14);
        frameLayout5.setBackground(d04);
        a7.k(frameLayout5, d04, N3, null, p6Var);
        frameLayout5.setPadding(org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f));
        TextView textView3 = new TextView(context);
        int L4 = org.telegram.messenger.i0.L(10.0f);
        int i15 = t6.Ci;
        Drawable d05 = t6.d0(L4, t6.w0(i15, p6Var));
        w6 N4 = a7.N(i15);
        textView3.setBackground(d05);
        a7.k(textView3, d05, N4, null, p6Var);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(org.telegram.messenger.i0.L(5.33f), 0, org.telegram.messenger.i0.L(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) i.I0(starrefprogram.commission_permille)));
        dq dqVar = new dq(R.drawable.msg_link_1, 0);
        dqVar.H = 0.65f;
        dqVar.I = 0.65f;
        dqVar.G = 0.7f;
        float L5 = org.telegram.messenger.i0.L(-2.0f);
        float L6 = org.telegram.messenger.i0.L(0.0f);
        dqVar.r = L5;
        dqVar.s = L6;
        spannableString.setSpan(dqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, b6.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        f7.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i16 = t6.G6;
        a7.V(textView4, i16, p6Var);
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(cd.L0(2131752494, null));
        textView4.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(textView4, b6.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int L7 = org.telegram.messenger.i0.L(28.0f);
        int i17 = t6.a7;
        ShapeDrawable d06 = t6.d0(L7, t6.w0(i17, p6Var));
        w6 N5 = a7.N(i17);
        linearLayout2.setBackground(d06);
        a7.k(linearLayout2, d06, N5, null, p6Var);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        a7.V(textView5, i16, p6Var);
        textView5.setText(cd.a0(null, null, 2131752493, o5.l(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, b6.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        int i18 = t6.r5;
        a7.t(imageView, i18, p6Var, mode);
        imageView.setImageResource(R.drawable.settings_arrow);
        imageView.setScaleX(1.2f);
        imageView.setScaleY(1.2f);
        linearLayout2.addView(imageView, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f7.addView(linearLayout2, b6.t(-2, 28, 1, 4, 0, 4, 0));
        e6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        a7.V(textView6, i16, p6Var);
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        zs.i(textView6);
        SpannableString spannableString2 = new SpannableString(h8.M0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
        textView6.setText(h8.Z0(false, cd.V(null, null, 2131752503, spannableString2), 0.725f, null));
        TextView f10 = z20.f(f7, textView6, b6.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        a7.V(f10, i16, p6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        zs.i(f10);
        String p5 = h20.p(Z1);
        String I0 = i.I0(starrefprogram.commission_permille);
        int i19 = starrefprogram.duration_months;
        if (i19 <= 0) {
            G = cd.L0(2131752501, null);
        } else {
            if (i19 < 12 || i19 % 12 != 0) {
                str = p5;
                r15 = 0;
                G = cd.G(i19, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                Object[] objArr = new Object[3];
                objArr[r15] = str;
                objArr[1] = I0;
                objArr[2] = G;
                f10.setText(k6.m(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752502, objArr)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
                f7.addView(f10, b6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
                if (j10 < 0) {
                    TextView textView7 = new TextView(context);
                    a7.V(textView7, i16, p6Var);
                    textView7.setTextSize(1, 14.0f);
                    m5.l(textView7, 17, null, 2131752486);
                    f7.addView(textView7, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ShapeDrawable d07 = t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(i17, p6Var));
                    w6 N6 = a7.N(i17);
                    linearLayout3.setBackground(d07);
                    a7.k(linearLayout3, d07, N6, null, p6Var);
                    int L8 = org.telegram.messenger.i0.L(28.0f);
                    int w02 = t6.w0(i17, p6Var);
                    int w03 = t6.w0(i17, p6Var);
                    int i20 = t6.i6;
                    int w9 = t6.w(w03, t6.w0(i20, p6Var));
                    org.telegram.ui.Cells.y k02 = t6.k0(L8, L8, L8, L8, w02, w9, w9);
                    w6 N7 = a7.N(i17);
                    w6 q6 = a7.q(i17, i20);
                    linearLayout3.setBackground(k02);
                    a7.k(linearLayout3, k02, N7, q6, p6Var);
                    g9 g9Var4 = new g9(context);
                    g9Var4.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
                    linearLayout3.addView(g9Var4, b6.o(28, 28));
                    TextView textView8 = new TextView(context);
                    textView8.setTextSize(1, 13.0f);
                    a7.V(textView8, i16, p6Var);
                    linearLayout3.addView(textView8, b6.t(-2, -2, 16, 6, 0, 0, 0));
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setScaleType(scaleType);
                    a7.t(imageView2, i18, p6Var, mode);
                    imageView2.setImageResource(R.drawable.arrows_select);
                    linearLayout3.addView(imageView2, b6.t(-2, -2, 16, 2, 0, 5, 0));
                    f7.addView(linearLayout3, b6.t(-2, 28, 1, 0, 11, 0, 20));
                    linearLayout = linearLayout3;
                    g9Var = g9Var4;
                    textView = textView8;
                } else {
                    g9Var = null;
                    textView = null;
                    linearLayout = null;
                }
                vh.d dVar = new vh.d(context, p6Var, true);
                dVar.i(cd.L0(2131752508, null), false, true);
                f7.addView(dVar, b6.o(-1, 48));
                p80 p80Var = new p80(context, p6Var);
                p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131752507, null), new ph.p0(context, 12)));
                p80Var.setGravity(17);
                p80Var.setTextSize(1, 12.0f);
                a7.V(p80Var, t6.B6, p6Var);
                a7.H(p80Var, t6.Uc, p6Var);
                f7.addView(p80Var, b6.t(-1, -2, 49, 14, 14, 14, 6));
                k10.N = f7;
                final int i21 = 1;
                g9Var2.setOnClickListener(new View.OnClickListener() { // from class: xh.n2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.z2 z2Var = k10;
                                    z2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new u2(bundle, z2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    k10.dismiss();
                                    T2.presentFragment(ProfileActivity.z4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                dVar.setOnClickListener(new yy0(dVar, jArr, i10, starrefprogram, k10, j10, z10, context, p6Var, Z1));
                k10.setOnDismissListener(new jg.z(6));
                i2.g1 g1Var = new i2.g1(jArr, i10, g9Var3, g9Var, textView, 22);
                g1Var.run();
                if (linearLayout != null) {
                    rh.r.g(i10).n();
                    rh.r.g(i10).o();
                    LinearLayout linearLayout4 = linearLayout;
                    linearLayout4.setOnClickListener(new vf(i10, k10, p6Var, linearLayout4, jArr, g1Var));
                }
                final int i22 = 0;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: xh.n2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null) {
                                    org.telegram.ui.ActionBar.z2 z2Var = k10;
                                    z2Var.dismiss();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", starrefprogram.bot_id);
                                    T.presentFragment(new u2(bundle, z2Var));
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                if (T2 != null) {
                                    k10.dismiss();
                                    T2.presentFragment(ProfileActivity.z4(starrefprogram.bot_id));
                                    break;
                                }
                                break;
                        }
                    }
                });
                k10.Q(i14);
                k10.show();
            }
            G = cd.G(i19 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
        }
        str = p5;
        r15 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r15] = str;
        objArr2[1] = I0;
        objArr2[2] = G;
        f10.setText(k6.m(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752502, objArr2)), f10.getPaint().getFontMetricsInt(), r15, null, r15));
        f7.addView(f10, b6.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 < 0) {
        }
        vh.d dVar2 = new vh.d(context, p6Var, true);
        dVar2.i(cd.L0(2131752508, null), false, true);
        f7.addView(dVar2, b6.o(-1, 48));
        p80 p80Var2 = new p80(context, p6Var);
        p80Var2.setText(org.telegram.messenger.i0.T2(cd.L0(2131752507, null), new ph.p0(context, 12)));
        p80Var2.setGravity(17);
        p80Var2.setTextSize(1, 12.0f);
        a7.V(p80Var2, t6.B6, p6Var);
        a7.H(p80Var2, t6.Uc, p6Var);
        f7.addView(p80Var2, b6.t(-1, -2, 49, 14, 14, 14, 6));
        k10.N = f7;
        final int i212 = 1;
        g9Var2.setOnClickListener(new View.OnClickListener() { // from class: xh.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i212) {
                    case 0:
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.z2 z2Var = k10;
                            z2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new u2(bundle, z2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            k10.dismiss();
                            T2.presentFragment(ProfileActivity.z4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new yy0(dVar2, jArr, i10, starrefprogram, k10, j10, z10, context, p6Var, Z1));
        k10.setOnDismissListener(new jg.z(6));
        i2.g1 g1Var2 = new i2.g1(jArr, i10, g9Var3, g9Var, textView, 22);
        g1Var2.run();
        if (linearLayout != null) {
        }
        final int i222 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: xh.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i222) {
                    case 0:
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.ui.ActionBar.z2 z2Var = k10;
                            z2Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            T.presentFragment(new u2(bundle, z2Var));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                        if (T2 != null) {
                            k10.dismiss();
                            T2.presentFragment(ProfileActivity.z4(starrefprogram.bot_id));
                            break;
                        }
                        break;
                }
            }
        });
        k10.Q(i14);
        k10.show();
    }

    public static org.telegram.ui.ActionBar.z2 J0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, p6 p6Var) {
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i11;
        org.telegram.ui.ActionBar.z2 z2Var;
        char c10;
        String G;
        char c11;
        String G2;
        int i12;
        LinearLayout linearLayout2;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, p6Var, false);
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f7 = m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        Drawable L = t6.L(org.telegram.messenger.i0.L(40.0f), t6.w0(connectedbotstarref.revoked ? t6.kk : t6.Ci, p6Var));
        w6 N = a7.N(connectedbotstarref.revoked ? t6.kk : t6.Ci);
        view.setBackground(L);
        a7.k(view, L, N, null, p6Var);
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
            int L2 = org.telegram.messenger.i0.L(50.0f);
            int i13 = t6.h5;
            Drawable d02 = t6.d0(L2, t6.w0(i13, p6Var));
            w6 N2 = a7.N(i13);
            frameLayout2.setBackground(d02);
            a7.k(frameLayout2, d02, N2, null, p6Var);
            frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setTextSize(1, 12.0f);
            Drawable d03 = t6.d0(org.telegram.messenger.i0.L(9.5f), t6.w0(connectedbotstarref.revoked ? t6.kk : t6.ik, p6Var));
            w6 N3 = a7.N(connectedbotstarref.revoked ? t6.kk : t6.ik);
            textView.setBackground(d03);
            a7.k(textView, d03, N3, null, p6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.i0.L(6.66f), 0, org.telegram.messenger.i0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            dq dqVar = new dq(R.drawable.mini_reply_user, 0);
            dqVar.H = 0.937f;
            dqVar.I = 0.937f;
            float f10 = -org.telegram.messenger.i0.L(1.33f);
            float L3 = org.telegram.messenger.i0.L(1.0f);
            dqVar.r = f10;
            dqVar.s = L3;
            dqVar.G = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, b6.d(-1, 19.0f, zs.E1, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f7.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = t6.G6;
        a7.V(textView2, i14, p6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(cd.L0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(textView2, b6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L4 = org.telegram.messenger.i0.L(28.0f);
        int i15 = t6.a7;
        ShapeDrawable d04 = t6.d0(L4, t6.w0(i15, p6Var));
        w6 N4 = a7.N(i15);
        linearLayout3.setBackground(d04);
        a7.k(linearLayout3, d04, N4, null, p6Var);
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        r8 r8Var = new r8((p6) null);
        linearLayout3.addView(g9Var, b6.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        a7.V(textView3, i14, p6Var);
        textView3.setText(o5.l(i10, connectedbotstarref.bot_id));
        r8Var.r(Z1);
        g9Var.e(Z1, r8Var);
        linearLayout3.addView(textView3, b6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = t6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView2, i16, p6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f7.addView(linearLayout3, b6.t(-2, 28, 1, 4, 0, 4, 0));
        e6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        a7.V(textView4, i14, p6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.i0.W2(cd.L0(2131752484, null)));
            i11 = i16;
            z2Var = k10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                String I0 = i.I0(connectedbotstarref.commission_permille);
                String p5 = h20.p(Z1);
                int i17 = connectedbotstarref.duration_months;
                i11 = i16;
                z2Var = k10;
                if (i17 <= 0) {
                    G2 = cd.L0(2131752501, null);
                    c11 = 0;
                } else if (i17 < 12 || i17 % 12 != 0) {
                    c11 = 0;
                    G2 = cd.G(i17, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = cd.G(i17 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = I0;
                objArr[1] = p5;
                objArr[2] = G2;
                m5.q(null, null, 2131752485, objArr, textView4);
            } else {
                i11 = i16;
                z2Var = k10;
                String I02 = i.I0(connectedbotstarref.commission_permille);
                String p9 = h20.p(Z1);
                int i18 = connectedbotstarref.duration_months;
                if (i18 <= 0) {
                    G = cd.L0(2131752501, null);
                    c10 = 0;
                } else if (i18 < 12 || i18 % 12 != 0) {
                    c10 = 0;
                    G = cd.G(i18, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = cd.G(i18 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = I02;
                objArr2[1] = p9;
                objArr2[2] = G;
                m5.q(null, null, 2131752483, objArr2, textView4);
            }
        }
        f7.addView(textView4, b6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i15;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            a7.V(textView5, i14, p6Var);
            textView5.setTextSize(1, 14.0f);
            m5.l(textView5, 17, null, 2131752486);
            f7.addView(textView5, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            Drawable d05 = t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(i15, p6Var));
            w6 N5 = a7.N(i15);
            linearLayout4.setBackground(d05);
            a7.k(linearLayout4, d05, N5, null, p6Var);
            g9 g9Var2 = new g9(context);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
            r8 r8Var2 = new r8((p6) null);
            linearLayout4.addView(g9Var2, b6.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            a7.V(textView6, i14, p6Var);
            if (j10 >= 0) {
                TLRPC.User Z12 = vp.r1(i10).Z1(Long.valueOf(j10));
                r8Var2.r(Z12);
                g9Var2.e(Z12, r8Var2);
                textView6.setText(h20.p(Z12));
                i12 = i15;
            } else {
                i12 = i15;
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
                r8Var2.q(L0);
                g9Var2.e(L0, r8Var2);
                textView6.setText(L0 == null ? "" : L0.title);
            }
            linearLayout4.addView(textView6, b6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            a7.t(imageView3, i11, p6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, b6.t(-2, -2, 16, 2, 0, 5, 0));
            f7.addView(linearLayout4, b6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        a7.V(textView7, i14, p6Var);
        int L5 = org.telegram.messenger.i0.L(8.0f);
        int i19 = i12;
        int w02 = t6.w0(i19, p6Var);
        int w03 = t6.w0(i19, p6Var);
        int i20 = t6.i6;
        int w9 = t6.w(w03, t6.w0(i20, p6Var));
        org.telegram.ui.Cells.y k02 = t6.k0(L5, L5, L5, L5, w02, w9, w9);
        w6 N6 = a7.N(i19);
        w6 q6 = a7.q(i19, i20);
        textView7.setBackground(k02);
        a7.k(textView7, k02, N6, q6, p6Var);
        textView7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.66f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f7.addView(textView7, b6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.i(cd.L0(2131752487, null), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new dq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) cd.L0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        }
        f7.addView(dVar, b6.o(-1, 48));
        p80 p80Var = new p80(context, p6Var);
        long j11 = connectedbotstarref.participants;
        p80Var.setText(j11 <= 0 ? cd.a0(null, null, 2131752490, h20.p(Z1)) : cd.G((int) j11, "ChannelAffiliateProgramLinkOpened", h20.p(Z1)));
        p80Var.setGravity(17);
        p80Var.setTextSize(1, 12.0f);
        a7.V(p80Var, t6.B6, p6Var);
        a7.H(p80Var, t6.Uc, p6Var);
        f7.addView(p80Var, b6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
        z2Var2.N = f7;
        px0 px0Var = new px0(connectedbotstarref, z2Var2, p6Var, Z1, 29);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new rh.s(px0Var, 26));
        }
        s2 s2Var = new s2(connectedbotstarref, i10, z2Var2, context, j10, p6Var, px0Var);
        org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
        dVar.setOnClickListener(s2Var);
        z2Var3.setOnDismissListener(new jg.z(6));
        if (linearLayout2 != null) {
            rh.r.g(i10).n();
            rh.r.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            View.OnClickListener s2Var2 = new s2(i10, z2Var3, p6Var, linearLayout5, j10, context, connectedbotstarref);
            z2Var3 = z2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(s2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new rh.u1(13, z2Var3, connectedbotstarref2));
        z2Var3.Q(t6.h5);
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (!org.telegram.messenger.i0.Q1() && T != null && !org.telegram.messenger.i0.u1(T)) {
            z2Var3.a0(T);
        }
        z2Var3.show();
        return z2Var3;
    }

    public static void z0(z2 z2Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, z2Var.resourceProvider);
        String L0 = cd.L0(2131749017, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749016, h20.p(user)));
        alertDialog$Builder.k(cd.L0(2131749015, null), new org.telegram.ui.web.k0(27, z2Var, connectedbotstarref));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2 A[LOOP:0: B:20:0x01bc->B:22:0x01c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(ArrayList arrayList, p51 p51Var) {
        int i10;
        SpannableString spannableString;
        int i11;
        if (getParentActivity() == null) {
            return;
        }
        bi.t0 t0Var = (bi.t0) n0(getParentActivity());
        a51 a51Var = new a51(-2);
        a51Var.c = t0Var;
        arrayList.add(a51Var);
        arrayList.add(g.i(R.drawable.menu_feature_reliable, cd.L0(2131752513, null), cd.L0(2131752514, null)));
        arrayList.add(g.i(R.drawable.menu_feature_transparent, cd.L0(2131752511, null), cd.L0(2131752512, null)));
        arrayList.add(g.i(R.drawable.menu_feature_simple, cd.L0(2131752509, null), cd.L0(2131752510, null)));
        arrayList.add(a51.B(1, null));
        rh.r g10 = rh.r.g(this.currentAccount);
        long j10 = this.R;
        rh.n d = g10.d(j10);
        ArrayList arrayList2 = d.e;
        if (!arrayList2.isEmpty() || d.c > 0) {
            arrayList.add(a51.u(cd.L0(2131752481, null)));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i12);
                int i13 = v2.b;
                a51 K = a51.K(v2.class);
                K.G = connectedbotstarref;
                K.r = true;
                arrayList.add(K);
            }
            if (!d.d || d.g) {
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
                arrayList.add(a51.p(29));
            }
            arrayList.add(a51.B(2, null));
        }
        rh.p e = rh.r.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = e.e;
        if (!arrayList3.isEmpty() || e.c > 0) {
            String L0 = cd.L0(2131752480, null);
            int i14 = e.g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) cd.L0(2131752479, null)).append((CharSequence) " ");
            if (i14 == 1) {
                spannableString = new SpannableString(cd.L0(2131752477, null) + "v");
            } else if (i14 == 2) {
                spannableString = new SpannableString(cd.L0(2131752476, null) + "v");
            } else if (i14 == 3) {
                spannableString = new SpannableString(cd.L0(2131752478, null) + "v");
            } else {
                i10 = 0;
                int i15 = x2.b;
                a51 K2 = a51.K(x2.class);
                K2.l = L0;
                K2.m = spannableStringBuilder;
                arrayList.add(K2);
                for (i11 = i10; i11 < arrayList3.size(); i11++) {
                    Object obj = arrayList3.get(i11);
                    int i16 = v2.b;
                    a51 K3 = a51.K(v2.class);
                    K3.G = obj;
                    K3.r = true;
                    arrayList.add(K3);
                }
                if (e.d || e.h) {
                    arrayList.add(a51.p(29));
                    arrayList.add(a51.p(29));
                    arrayList.add(a51.p(29));
                }
                arrayList.add(a51.B(3, null));
            }
            dq dqVar = new dq(R.drawable.arrow_more, 0);
            dqVar.f = true;
            dqVar.H = 0.6f;
            dqVar.I = 0.6f;
            spannableString.setSpan(dqVar, spannableString.length() - 1, spannableString.length(), 33);
            i10 = 0;
            spannableString.setSpan(new w5(this, i14, rh.r.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i152 = x2.b;
            a51 K22 = a51.K(x2.class);
            K22.l = L0;
            K22.m = spannableStringBuilder;
            arrayList.add(K22);
            while (i11 < arrayList3.size()) {
            }
            if (e.d) {
            }
            arrayList.add(a51.p(29));
            arrayList.add(a51.p(29));
            arrayList.add(a51.p(29));
            arrayList.add(a51.B(3, null));
        }
        arrayList.add(a51.k(this.U));
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        bn bnVar = new bn(context, 27);
        this.U = bnVar;
        a7.i(t6.i5, bnVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        lg.q qVar = new lg.q(context, 1, 3);
        this.T = qVar;
        qVar.setImportantForAccessibility(4);
        lg.h hVar = this.T.b;
        hVar.z = t6.Tk;
        hVar.A = t6.Uk;
        hVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, b6.d(zs.U2, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        i0(cd.L0(2131752472, null), org.telegram.messenger.i0.W2(cd.L0(2131752473, null)), this.S, null);
        this.c.setOnItemClickListener(new mg.q0(24, this, context));
        this.c.setOnItemLongClickListener(new org.telegram.ui.web.k0(28, this, context));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnScrollListener(new bu0(this, 29));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ph.o3 o3Var;
        int i12 = zs.L3;
        long j10 = this.R;
        if (i10 != i12) {
            if (i10 == zs.K3 && ((Long) objArr[0]).longValue() == j10 && (o3Var = this.V) != null) {
                o3Var.O(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            ph.o3 o3Var2 = this.V;
            if (o3Var2 != null) {
                o3Var2.O(true);
            }
            rh.r.g(this.currentAccount).d(j10).a();
        }
    }

    @Override // org.telegram.ui.p10
    public final s4.g0 j0() {
        ph.o3 o3Var = new ph.o3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new n1(this, 1), getResourceProvider(), 5);
        this.V = o3Var;
        return o3Var;
    }

    @Override // org.telegram.ui.p10
    public final kg.g2 l0() {
        kg.g gVar = new kg.g(getParentActivity(), 5);
        gVar.c();
        return gVar;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.L3);
        zs.f(this.currentAccount).c(this, zs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        zs.f(this.currentAccount).n(this, zs.L3);
        zs.f(this.currentAccount).n(this, zs.K3);
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
