package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import di.dc;
import di.fc;
import di.k8;
import di.kc;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.df;
import org.telegram.ui.fo;
import org.telegram.ui.gp0;
import org.telegram.ui.hb1;
import org.telegram.ui.il0;
import org.telegram.ui.kj1;
import org.telegram.ui.ko;
import org.telegram.ui.nw0;
import org.telegram.ui.pu;
import org.telegram.ui.uw;
import org.telegram.ui.xa;
import org.telegram.ui.yo;
import org.telegram.ui.yw0;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public class r3 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int r1 = 0;
    public final TextView A0;
    public final d2 B0;
    public boolean C0;
    public TL_stars.SavedStarGift D0;
    public g5 E0;
    public MessageObject F0;
    public String G0;
    public TL_stars.TL_starGiftUnique H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public e3 N0;
    public boolean O0;
    public f2 P0;
    public final int[] Q0;
    public hg.m0 R0;
    public int S0;
    public String T0;
    public yh.e4 U0;
    public br V0;
    public boolean W0;
    public final long X;
    public z1 X0;
    public final org.telegram.ui.x5 Y;
    public Float Y0;
    public final c2 Z;
    public f4.d Z0;
    public final d10 a0;
    public ValueAnimator a1;
    public final View b0;
    public br b1;
    public yh.l2 c0;
    public boolean c1;
    public yh.l2 d0;
    public View d1;
    public final e2 e0;
    public yh.b2 e1;
    public final o3 f0;
    public boolean f1;
    public final d2 g0;
    public Boolean g1;
    public final da0 h0;
    public boolean h1;
    public final o01 i0;
    public ArrayList i1;
    public final da0 j0;
    public ArrayList j1;
    public final di.d k0;
    public ArrayList k1;
    public final FrameLayout l0;
    public boolean l1;
    public final da0 m0;
    public TLRPC.PaymentForm m1;
    public final FrameLayout n0;
    public final br[] n1;
    public final View o0;
    public final a1 o1;
    public final FrameLayout p0;
    public di.d4 p1;
    public q3 q0;
    public View q1;
    public boolean r0;
    public final d2 s0;
    public final fi.k[] t0;
    public final View u0;
    public final LinearLayout v0;
    public final aq w0;
    public final TextView x0;
    public boolean y0;
    public final d2 z0;

    public r3(Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, null, false, false, c6Var);
        this.r0 = false;
        this.Q0 = new int[2];
        this.S0 = -1;
        this.T0 = "";
        this.Z0 = new f4.d(0, 0);
        this.c1 = true;
        this.n1 = new br[1];
        this.o1 = new a1(this, 7);
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new sg.p0(this, context, 4);
        org.telegram.ui.x5 x5Var = new org.telegram.ui.x5(this, context);
        this.Y = x5Var;
        c2 c2Var = new c2(this, context);
        this.Z = c2Var;
        c2Var.setAdapter(new nw0(this, context, 5));
        v2();
        View view2 = new View(context);
        this.b0 = view2;
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.z5.e(-1, 50, 80));
        this.containerView.addView(c2Var, w7.z5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        x5Var.addView(this.d, w7.z5.e(-1, -1, 119));
        d2 d2Var = new d2(this, context, 0);
        this.g0 = d2Var;
        d2Var.setOrientation(1);
        d2Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        x5Var.addView(d2Var, w7.z5.e(-1, -1, 55));
        da0 da0Var = new da0(context, c6Var);
        this.h0 = da0Var;
        int i12 = org.telegram.ui.ActionBar.g6.q5;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        da0Var.setTextSize(1, 12.0f);
        da0Var.setGravity(17);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        da0Var.setDisablePaddingsOffsetY(true);
        d2Var.addView(da0Var, w7.z5.t(-2, -2, 1, 4, -2, 4, 16));
        da0Var.setVisibility(8);
        o01 o01Var = new o01(context, c6Var);
        this.i0 = o01Var;
        d2Var.addView(o01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        da0 da0Var2 = new da0(context, c6Var);
        this.j0 = da0Var2;
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        da0Var2.setTextSize(1, 12.0f);
        da0Var2.setGravity(17);
        da0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        da0Var2.setDisablePaddingsOffsetY(true);
        da0Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        d2Var.addView(da0Var2, w7.z5.t(-2, -2, 1, 4, 2, 4, 8));
        da0Var2.setVisibility(8);
        d2 d2Var2 = new d2(this, context, 1);
        this.s0 = d2Var2;
        d2Var2.setOrientation(1);
        d2Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        x5Var.addView(d2Var2, w7.z5.e(-1, -1, 55));
        fi.k[] kVarArr = {r9, r0, r0};
        this.t0 = kVarArr;
        fi.k kVar = new fi.k(context, c6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        d2Var2.addView(kVarArr[0], w7.z5.n(-1, -2));
        fi.k kVar2 = new fi.k(context, c6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        d2Var2.addView(kVarArr[1], w7.z5.n(-1, -2));
        fi.k kVar3 = new fi.k(context, c6Var, false);
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        d2Var2.addView(kVarArr[2], w7.z5.n(-1, -2));
        View view3 = new View(context);
        this.u0 = view3;
        int i14 = org.telegram.ui.ActionBar.g6.d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        d2Var2.addView(view3, w7.z5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 6));
        aq aqVar = new aq(context, 24, c6Var);
        this.w0 = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(aqVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.x0 = textView;
        int i15 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        d2Var2.addView(linearLayout, w7.z5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.b6.b(linearLayout, 0.025f, 1.5f);
        d2 d2Var3 = new d2(this, context, 2);
        this.z0 = d2Var3;
        d2Var3.setOrientation(1);
        d2Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        x5Var.addView(d2Var3, w7.z5.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.A0 = textView2;
        sk.o(i15, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        d2Var3.addView(textView2, w7.z5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        sk.o(i15, c6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        d2Var3.addView(textView3, w7.z5.t(-1, -2, 7, 20, 6, 20, 24));
        fi.k kVar4 = new fi.k(context, c6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        d2Var3.addView(r7[0], w7.z5.n(-1, -2));
        fi.k kVar5 = new fi.k(context, c6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        d2Var3.addView(r7[1], w7.z5.n(-1, -2));
        fi.k kVar6 = new fi.k(context, c6Var, false);
        fi.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        d2Var3.addView(kVarArr2[2], w7.z5.n(-1, -2));
        d2 d2Var4 = new d2(this, context, 3);
        this.B0 = d2Var4;
        d2Var4.setOrientation(1);
        d2Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        x5Var.addView(d2Var4, w7.z5.e(-1, -1, 55));
        fi.k kVar7 = new fi.k(context, c6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        d2Var4.addView(r9[0], w7.z5.n(-1, -2));
        fi.k kVar8 = new fi.k(context, c6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        d2Var4.addView(r9[1], w7.z5.n(-1, -2));
        fi.k kVar9 = new fi.k(context, c6Var, false);
        fi.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        d2Var4.addView(kVarArr3[2], w7.z5.n(-1, -2));
        d2Var.setAlpha(1.0f);
        d2Var2.setAlpha(0.0f);
        d2Var3.setAlpha(0.0f);
        d2Var4.setAlpha(0.0f);
        o3 o3Var = new o3(context, c6Var, new a1(this, 9), new t0(this, 13), new t0(this, 14), new t0(this, 15), new t0(this, 16), new t0(this, 17), new t0(this, 18), new t0(this, 19));
        this.f0 = o3Var;
        o3Var.L.c.setOnClickListener(new t0(this, 20));
        int i16 = this.backgroundPaddingLeft;
        o3Var.setPadding(i16, 0, i16, 0);
        x5Var.addView(o3Var, w7.z5.e(-1, -2, 55));
        hg.a0 a0Var = this.c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.o0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        di.d f7 = sk.f(24, context, c6Var, true);
        this.k0 = f7;
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f7.f(null, false);
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 119);
        a2.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        a2.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, a2);
        x5Var.addView(frameLayout, w7.z5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        da0 da0Var3 = new da0(context, null);
        this.m0 = da0Var3;
        da0Var3.setTextSize(1, 12.0f);
        da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        da0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        da0Var3.setGravity(17);
        frameLayout2.addView(da0Var3, w7.z5.a(-2.0f, 16.0f, 8.0f, 16.0f, 14.0f, -1, 17));
        x5Var.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new kc0(this, 23));
        linearLayout.setOnClickListener(new t0(this, 12));
        d10 d10Var = new d10(context);
        this.a0 = d10Var;
        x5Var.addView(d10Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        x5Var.addView(frameLayout3, w7.z5.a(200.0f, 0.0f, 0.0f, 0.0f, 60.0f, -1, 87));
        AndroidUtilities.removeFromParent(this.e);
        x5Var.addView(this.e, w7.z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
        e2 e2Var = new e2(context);
        this.e0 = e2Var;
        x5Var.addView(e2Var, w7.z5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ji.p1(e2Var, 26), 12.0f, 12, null, arrayList);
    }

    public static void A0(r3 r3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        a1 a1Var = r3Var.o1;
        r3Var.l1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            sc Y = r3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(paymentForm.users, false);
            r3Var.m1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            AndroidUtilities.runOnUIThread(a1Var);
        }
    }

    public static void B0(r3 r3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        e5 F;
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && r3Var.D0 != null && (F = n5.y(r3Var.currentAccount, false).F(r3Var.X, false)) != null) {
                    F.m(r3Var.D0, !savestargift.unsave);
                }
                r3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        r3Var.dismiss();
        long B1 = r3Var.B1();
        if (!z10) {
            n5.y(r3Var.currentAccount, false).Q(B1);
        }
        if (B1 >= 0) {
            zc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new ah.k1(B1, U))).k(true);
        } else {
            zc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public static void C0(r3 r3Var, long j10) {
        new yh.p1(r3Var.getContext(), r3Var.currentAccount, j10, null, new t1(r3Var, 2)).show();
    }

    public static void D0(r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        cVar.c(false);
        a2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new e7(r3Var.getContext(), r3Var.resourcesProvider, j10, 16, null, new m(8, r3Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    r3Var.getBulletinFactory().f0(tL_error, false);
                    return;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < tL_starGiftUnique.attributes.size()) {
            if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                tL_starGiftUnique.attributes.remove(i10);
                i10--;
            }
            i10++;
        }
        TL_stars.SavedStarGift savedStarGift = r3Var.D0;
        r3Var.m2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new m(6, r3Var, tL_starGiftUnique));
    }

    public static String E1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return org.telegram.messenger.g0.h(r3.num, ',', sb2);
    }

    public static void F0(r3 r3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, ug.m1[] m1VarArr, Long l4) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l4.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(r3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new u2(r3Var.getContext(), tL_starGiftUnique), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(r3Var.getContext());
            int i13 = org.telegram.ui.ActionBar.g6.j5;
            org.telegram.ui.Cells.c1.n(i13, r3Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(r3Var.getContext());
            sk.o(i13, r3Var.resourcesProvider, textView2, 1, 16.0f);
            sk.r(R.string.Gift2ExportTONFragmentText, new Object[]{r3Var.D1()}, textView2);
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.web.o0(25, r3Var, m1VarArr));
            i2.d.r(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        pi.g gVar = new pi.g(r3Var, l4, m1VarArr, 21);
        if (l4.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(r3Var.currentAccount).getChatFull(-l4.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(r3Var.currentAccount).getInputChannel(-l4.longValue());
                ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(tL_channels_getFullChannel, new kj1(7, r3Var, gVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder3.a;
                a2Var2.R = string2;
                a2Var2.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l4.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(r3Var.currentAccount).getUser(l4);
            TLRPC.UserFull userFull = MessagesController.getInstance(r3Var.currentAccount).getUserFull(l4.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new zc(m1VarArr[0].container, r3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(r3Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(tL_users_getFullUser, new bi.f3(r3Var, m1VarArr, l4, gVar, 17));
                return;
            }
        }
        gVar.run();
    }

    public static void H0(r3 r3Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            sc Y = r3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(r3Var.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j12 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j12 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new e1(r3Var, j10, j11, callback, j12));
    }

    public static void I0(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        a2Var.c(400L);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                r3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                r3Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        r3Var.dismiss();
        n5.y(r3Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            hb1 hb1Var = new hb1(bundle);
            p.g(r3Var.currentAccount).h(j10, true);
            p.g(r3Var.currentAccount).l(j10);
            hb1Var.whenFullyVisible(new org.telegram.ui.web.e0(hb1Var, j12, 4));
            U.presentFragment(hb1Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(r3Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        n5.y(r3Var.currentAccount, false).P();
        n5.y(r3Var.currentAccount, false).T(true);
        if (U instanceof p7) {
            zc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        p7 p7Var = new p7();
        p7Var.whenFullyVisible(new org.telegram.ui.web.e0(p7Var, j12, 3));
        U.presentFragment(p7Var);
    }

    public static void J0(r3 r3Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        r3Var.H0 = tL_starGiftUnique;
        r3Var.m2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static /* synthetic */ void K0(long j10, long j11, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, r3 r3Var) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.n0(j10, j11, callback, tLObject, tL_error, r3Var));
    }

    public static String K1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i10 <= 0 ? "<0.1%" : fi.l.H0(i10);
    }

    public static void M0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.a2 a2Var) {
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new uw(r3Var, g10, a2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static /* synthetic */ void N0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k1(r3Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l1(r3Var, tL_error, runnable, 1));
        }
    }

    public static void O0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.a2 a2Var) {
        r3Var.getClass();
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = r3Var.F1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(updatestargiftprice, new bi.e5(r3Var, g10, tL_starGiftUnique, 22));
    }

    public static boolean O1(int i10, long j10) {
        return j10 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static /* synthetic */ void P0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = r3Var.F1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(updatestargiftprice, new z0(r3Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean P1(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static void Q(r3 r3Var, long j10) {
        new yh.p1(r3Var.getContext(), r3Var.currentAccount, j10, null, new t1(r3Var, 2)).show();
    }

    public static void Q0(r3 r3Var, long j10) {
        new yh.p1(r3Var.getContext(), r3Var.currentAccount, j10, null, new t1(r3Var, 2)).show();
    }

    public static boolean Q1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void S(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, yh.k0 k0Var, v2 v2Var, pf.c cVar) {
        cVar.d();
        n5.x(r3Var.currentAccount, v2Var.a).h(v2Var.b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new gp0(r3Var, cVar, tL_starGiftUnique, j10, k0Var, 1));
    }

    public static void S0(r3 r3Var, TLObject tLObject, pi.g gVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            sc Y = r3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(r3Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(r3Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(r3Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            gVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public static void T(long j10, long j11, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, r3 r3Var) {
        long j12;
        r3 r3Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            j12 = j10;
            r3Var2 = r3Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            r3Var2 = r3Var;
            zc.a0(U).f0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            r3Var2 = r3Var;
            sc M = zc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, r3Var2.D1(), DialogObject.getShortName(j12))), R.raw.forward);
            M.t = true;
            M.j();
        } else {
            fo W9 = fo.W9(j10);
            j12 = j10;
            r3Var2 = r3Var;
            W9.whenFullyVisible(new p1(r3Var2, W9, j12, 0));
            U.presentFragment(W9);
        }
        n5.y(r3Var2.currentAccount, false).Q(j12);
        n5.y(r3Var2.currentAccount, false).Q(j11);
    }

    public static void T0(r3 r3Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        r3Var.f1 = true;
        r3Var.k2(messageObject, null);
        r3Var.s2(0, true, null);
        d10 d10Var = r3Var.a0;
        if (d10Var != null) {
            d10Var.c(true);
        }
        n5.y(r3Var.currentAccount, false).P();
        f5 G = n5.y(r3Var.currentAccount, false).G(UserConfig.getInstance(r3Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void U(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, MessageObject messageObject) {
        a2Var.dismiss();
        r3Var.K0 = true;
        r3Var.k2(messageObject, null);
        super.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        if (r0 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U0(r3 r3Var, View view) {
        boolean z10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean P1;
        TLRPC.Message message;
        String G1 = r3Var.G1();
        TL_stars.TL_starGiftUnique L1 = r3Var.L1();
        l80 F = l80.F(r3Var.Y, r3Var.resourcesProvider, view);
        boolean z11 = (r3Var.L1() == null || !P1(r3Var.currentAccount, DialogObject.getPeerDialogId(r3Var.L1().owner_id)) || !(r3Var.E0 instanceof f5) || r3Var.D0 == null || r3Var.F1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = r3Var.D0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new a1(r3Var, 10), z11);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new a1(r3Var, 11), r3Var.u1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new a1(r3Var, 12), (r3Var.L1() == null || !P1(r3Var.currentAccount, DialogObject.getPeerDialogId(r3Var.L1().owner_id)) || r3Var.L1().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new r1(r3Var, G1, 7), G1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new a1(r3Var, 13), G1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new a1(r3Var, 14), L1 != null && L1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique L12 = r3Var.L1();
        if (L12 != null && L12.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(L12.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(L12.host_id);
            if ((peerDialogId > 0 && P1(r3Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && P1(r3Var.currentAccount, peerDialogId2))) {
                z10 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new a1(r3Var, 15), z10);
                if (r3Var.F1() != null) {
                    MessageObject messageObject = r3Var.F0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    P1 = P1(r3Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                    F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a1(r3Var, 16), P1);
                                    F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a1(r3Var, 17), (r3Var.D0 == null || r3Var.B1() == 0) ? false : true);
                                    F.t = false;
                                    F.Y = true;
                                    F.s = 0;
                                    F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                                    F.Z();
                                }
                            }
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift2 = r3Var.D0;
                    if (savedStarGift2 != null) {
                        TL_stars.StarGift starGift2 = savedStarGift2.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            P1 = P1(r3Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                            F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a1(r3Var, 16), P1);
                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a1(r3Var, 17), (r3Var.D0 == null || r3Var.B1() == 0) ? false : true);
                            F.t = false;
                            F.Y = true;
                            F.s = 0;
                            F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                            F.Z();
                        }
                    }
                    tL_starGiftUnique = r3Var.H0;
                }
                P1 = false;
                F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a1(r3Var, 16), P1);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a1(r3Var, 17), (r3Var.D0 == null || r3Var.B1() == 0) ? false : true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z10 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new a1(r3Var, 15), z10);
        if (r3Var.F1() != null) {
        }
        P1 = false;
        F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a1(r3Var, 16), P1);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a1(r3Var, 17), (r3Var.D0 == null || r3Var.B1() == 0) ? false : true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(0.0f, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static /* synthetic */ void V(r3 r3Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(r3Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new pi.g(r3Var, tLObject, messageObject, 22));
        }
    }

    public static void V0(r3 r3Var, Long l4) {
        TLRPC.Chat chat;
        String str = (l4.longValue() >= 0 || (chat = MessagesController.getInstance(r3Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
        sc Q = r3Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        Q.t = true;
        Q.j();
    }

    public static void W(final r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String D1 = r3Var.D1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: zh.f1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final r3 r3Var2 = r3.this;
                final org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = D1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3.a1(r3.this, a2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void W0(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(r3Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new m(9, r3Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new m(10, a2Var, tL_error));
    }

    public static void X(r3 r3Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        e5 F;
        TLRPC.Message message;
        di.d dVar = r3Var.k0;
        if (dVar.N) {
            return;
        }
        TL_stars.InputSavedStarGift F1 = r3Var.F1();
        MessageObject messageObject = r3Var.F0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = r3Var.D0;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = F1;
        if (r3Var.D0 == null || (F = n5.y(r3Var.currentAccount, false).F(r3Var.X, false)) == null) {
            z11 = false;
        } else {
            F.m(r3Var.D0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(savestargift, new xh.f(r3Var, z11, document2, z12, savestargift));
    }

    public static void X0(r3 r3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        if (r3Var.getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                pf.d.t(r3Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(new TL_account.getPassword(), new q1(r3Var, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            zc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(r3Var.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(r3Var.getContext());
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(r3Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(r3Var.getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        TextView textView2 = new TextView(r3Var.getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(r3Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(r3Var.getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), mode));
        TextView textView3 = new TextView(r3Var.getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new z3.a(r3Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(r3Var.getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static boolean Y(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yy yyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(r3Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.g5.m0(r3Var.getContext(), r3Var.resourcesProvider, r3Var.currentAccount, tL_starGiftUnique, giftThemeUser, new bi.b8(r3Var, j10, tL_starGiftUnique, yyVar, 21));
            return true;
        }
        ChatThemeController.getInstance(r3Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        yyVar.presentFragment(fo.W9(j10), true);
        return true;
    }

    public static void Z(final r3 r3Var) {
        int i10;
        long peerDialogId;
        long j10;
        long j11;
        final long clientUserId = UserConfig.getInstance(r3Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift F1 = r3Var.F1();
        if (F1 == null) {
            return;
        }
        MessageObject messageObject = r3Var.F0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = r3Var.F0;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j11 = peer != null ? DialogObject.getPeerDialogId(peer) : isOutOwner ? messageObject2.getDialogId() : clientUserId;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : r3Var.F0.getDialogId();
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = r3Var.D0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = r3Var.D0.convert_stars;
            j11 = r3Var.X;
        }
        int max = Math.max(1, (MessagesController.getInstance(r3Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(r3Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.z1() { // from class: zh.x1
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                r3.l0(r3.this, F1, j13, clientUserId, j12);
            }
        });
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void Z0(r3 r3Var, String str, long j10) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        yh.g4 g4Var = new yh.g4(r3Var.X, str, j10, r3Var.resourcesProvider);
        g4Var.e = new t1(r3Var, 0);
        R.showAsSheet(g4Var, k2Var);
    }

    public static /* synthetic */ void a0(r3 r3Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, bd[] bdVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift C1 = r3Var.C1();
        GiftAuctionController.getInstance(r3Var.currentAccount).requestAuctionUpgrades(C1.gift_id, new xa(r3Var, C1, starGiftAttribute, bdVarArr, zArr, 5));
    }

    public static void a1(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        o01 o01Var;
        LinearLayout linearLayout;
        float f7;
        float f10;
        a2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                r3Var.getBulletinFactory().f0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        org.telegram.ui.ActionBar.e3 i10 = sk.i(1, r3Var.getContext(), r3Var.resourcesProvider, false);
        LinearLayout linearLayout2 = new LinearLayout(r3Var.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        z9 z9Var = new z9(r3Var.getContext());
        p7.a1(z9Var.getImageReceiver(), document, 160);
        linearLayout2.addView(z9Var, w7.z5.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(r3Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, r3Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, r3Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout2.addView(textView, w7.z5.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(r3Var.getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, r3Var.resourcesProvider));
        textView2.setGravity(17);
        linearLayout2.addView(textView2, w7.z5.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            sk.r(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            sk.r(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            sk.r(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(r3Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        org.telegram.tgnet.e eVar = new org.telegram.tgnet.e(r3Var, new di.d4[1], frameLayout, 8);
        o01 o01Var2 = new o01(r3Var.getContext(), r3Var.resourcesProvider);
        frameLayout.addView(o01Var2, w7.z5.e(-1, -1, 119));
        o01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        o01Var2.c(string, p7.Y0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            o01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                o01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
            } else {
                o01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            o1 o1Var = new o1(eVar, new bd[]{(bd) ((l01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            o01Var = o01Var2;
            TableRow e = o01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", o1Var, null);
            e.setOnClickListener(new ji.o4(o1Var, 23));
        } else {
            o01Var = o01Var2;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            o1 o1Var2 = new o1(eVar, new bd[]{(bd) ((l01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e7 = o01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", o1Var2, null);
            e7.setOnClickListener(new ji.o4(o1Var2, 24));
        }
        linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            di.d dVar = new di.d(r3Var.getContext(), r3Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            f10 = 1.0f;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            linearLayout = linearLayout2;
            f7 = 2.0f;
            dVar.setOnClickListener(new ko(r3Var, str2, j10, 6));
            linearLayout.addView(dVar, w7.z5.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            linearLayout = linearLayout2;
            f7 = 2.0f;
            f10 = 1.0f;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            di.d dVar2 = new di.d(r3Var.getContext(), r3Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f7), AndroidUtilities.dp(f10)), false, true);
            dVar2.setOnClickListener(new yh.a(10, r3Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, w7.z5.t(-1, 42, 7, 0, 0, 0, 0));
        }
        i10.customView = linearLayout;
        i10.show();
    }

    public static void b0(r3 r3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        r3Var.l1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            sc Y = r3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(paymentForm.users, false);
            r3Var.m1 = paymentForm;
            r3Var.c2();
        }
    }

    public static void b1(final r3 r3Var, final yh.k0 k0Var, ag.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        r3Var.k0.setLoading(false);
        if (k0Var != null && k0Var.L) {
            k0Var.L = false;
            k0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new x2(r3Var.getContext(), r3Var.resourcesProvider, tL_starGiftUnique, new v2(bVar, tL_payments_paymentFormStarGift), r3Var.currentAccount, j10, r3Var.D1(), false, new Utilities.Callback2() { // from class: zh.n1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                r3.S(r3.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, k0Var, (v2) obj, (pf.c) obj2);
            }
        }).b();
    }

    public static void c0(r3 r3Var) {
        Bundle bundle = new Bundle();
        long j10 = r3Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(r3Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        e2(new ProfileActivity(bundle, null));
    }

    public static void c1(r3 r3Var) {
        di.d dVar = r3Var.k0;
        if (UserConfig.getInstance(r3Var.currentAccount).isPremium() && (Q1(r3Var.currentAccount, r3Var.L1()) || r3Var.W0)) {
            r3Var.t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique L1 = r3Var.L1();
        if (L1 == null) {
            return;
        }
        TLRPC.Peer peer = L1.owner_id;
        if (peer == null) {
            peer = L1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L1.title);
        sb2.append(" #");
        r3Var.A0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.g0.h(L1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(r3Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (r3Var.V0 == null) {
                r3Var.V0 = new br(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(r3Var.V0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new t0(r3Var, 26));
        r3Var.f0.setWearPreview(MessagesController.getInstance(r3Var.currentAccount).getUserOrChat(peerDialogId));
        r3Var.s2(2, true, null);
    }

    public static void d0(r3 r3Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    messageObject = null;
                    break;
                }
                Object obj = findUpdates.get(i11);
                i11++;
                TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    messageObject = new MessageObject(r3Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(r3Var.currentAccount).lambda$processUpdates$377(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new j1(r3Var, messageObject, arrayList, starGift, 0));
                return;
            }
            callback2.run(null, null);
            n5.y(r3Var.currentAccount, false).P();
            f5 G = n5.y(r3Var.currentAccount, false).G(UserConfig.getInstance(r3Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, new bi.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    r3Var.getBulletinFactory().f0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(r3Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, new bi.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                a2Var2.R = string2;
                a2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            org.telegram.messenger.g0.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void d1(r3 r3Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                r3Var.getBulletinFactory().f0(tL_error, false);
                return;
            }
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
        }
        LinearLayout linearLayout = new LinearLayout(r3Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView b10 = w7.d6.b(r3Var.getContext(), 16.0f, org.telegram.ui.ActionBar.g6.j5, false, null);
        b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(b10, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        o01 o01Var = new o01(r3Var.getContext(), r3Var.resourcesProvider);
        m01 a2 = o01Var.a(charSequence);
        a2.setFilled(true);
        wh.n nVar = (wh.n) a2.getChildAt(0);
        nVar.setTextSize(1, 12.0f);
        nVar.setGravity(17);
        linearLayout.addView(o01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r3Var.getContext(), 0, r3Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(p7.R0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new f31(r3Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.o();
    }

    public static void e0(r3 r3Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, yy yyVar) {
        ChatThemeController.getInstance(r3Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        yyVar.presentFragment(fo.W9(j10), true);
    }

    public static /* synthetic */ void e1(r3 r3Var, long j10) {
        e7 e7Var = new e7(r3Var.getContext(), r3Var.resourcesProvider, j10, 10, null, new m(5, r3Var, new boolean[]{false}), 0L);
        e7Var.setOnDismissListener(new u1(r3Var, 0));
        e7Var.show();
    }

    public static void e2(org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        U.showAsSheet(m2Var, k2Var);
    }

    public static /* synthetic */ void f0(r3 r3Var, long j10, long j11, Utilities.Callback callback) {
        e7 e7Var = new e7(r3Var.getContext(), r3Var.resourcesProvider, j10, 11, null, new bi.b8(r3Var, new boolean[]{false}, j11, callback, 22), 0L);
        e7Var.setOnDismissListener(new u1(r3Var, 1));
        e7Var.show();
    }

    public static /* synthetic */ void f1(r3 r3Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(r3Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(r3Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new pi.g(r3Var, a2Var, messageObject, 26));
        } else {
            AndroidUtilities.runOnUIThread(new fi.e3(a2Var, 1));
        }
    }

    public static void g0(r3 r3Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                r3Var.getBulletinFactory().f0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(r3Var.currentAccount).starsPurchaseAvailable()) {
                    r3Var.k0.setLoading(false);
                    n5.e0(r3Var.getContext(), r3Var.resourcesProvider);
                    return;
                }
                n5 y3 = n5.y(r3Var.currentAccount, false);
                a3.h0 h0Var = new a3.h0(r3Var, j12, j10, callback, 16);
                y3.e = false;
                y3.q(false, true, h0Var);
                y3.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(r3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(r3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        n5.y(r3Var.currentAccount, false).T(false);
        n5.y(r3Var.currentAccount, false).Q(j10);
        n5.y(r3Var.currentAccount, false).Q(j11);
        n5.y(r3Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            if (j10 < 0 || j11 < 0) {
                sc M = zc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, r3Var.D1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
            } else {
                fo W9 = fo.W9(j10);
                W9.whenFullyVisible(new p1(r3Var, W9, j10, 1));
                U.presentFragment(W9);
            }
        }
        Utilities.stageQueue.postRunnable(new s1(r3Var, tL_payments_paymentResult, i10));
    }

    public static /* synthetic */ void g1(r3 r3Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(r3Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new j1(r3Var, tL_error, tLObject, inputSavedStarGift, 1));
    }

    public static void h0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (r3Var.U0 == null) {
            yh.e4 e4Var = new yh.e4(r3Var.currentAccount, tL_starGiftUnique.gift_id);
            r3Var.U0 = e4Var;
            e4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            q2[] q2VarArr = r3Var.f0.L.n;
            if (i10 >= q2VarArr.length) {
                yh.f4 f4Var = new yh.f4(r3Var.getContext(), tL_starGiftUnique.title, r3Var.U0);
                f4Var.g0.addAll(hashSet);
                f4Var.i0.N(true);
                f4Var.h0 = bool.booleanValue();
                f4Var.e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                f4Var.f0 = new v0(0, callback);
                f4Var.show();
                return;
            }
            TL_stars.StarGift starGift = q2VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void h1(final r3 r3Var) {
        TL_stars.SavedStarGift savedStarGift = r3Var.D0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            e5 F = n5.y(r3Var.currentAccount, false).F(r3Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = r3Var.D0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = r3Var.F1();
            savestargift.unsave = r3Var.D0.unsaved;
            ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = r3Var.D0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((f5) r3Var.E0).m(savedStarGift3, !z10, false)) {
            new yh.p2(r3Var.getContext(), r3Var.X, r3Var.D0, r3Var.resourcesProvider, new Utilities.Callback0Return() { // from class: zh.y0
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return r3.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            org.telegram.messenger.g0.q(R.string.Gift2Unpinned, r3Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            r3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static SpannableStringBuilder h2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new yo(1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void i0(r3 r3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(r3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(r3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            n5.y(r3Var.currentAccount, false).T(false);
            n5.y(r3Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = r3Var.D0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            r3Var.r0 = true;
            r3Var.m1 = null;
            r3Var.s1(inputSavedStarGift, tL_payments_paymentResult.updates, new r1(r3Var, str, 0));
            Utilities.stageQueue.postRunnable(new s1(r3Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            r3Var.getBulletinFactory().f0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(r3Var.currentAccount).starsPurchaseAvailable()) {
            r3Var.k0.setLoading(false);
            n5.e0(r3Var.getContext(), r3Var.resourcesProvider);
            return;
        }
        n5 y3 = n5.y(r3Var.currentAccount, false);
        b1 b1Var = new b1(r3Var, j10, 3);
        y3.e = false;
        y3.q(false, true, b1Var);
        y3.e = true;
    }

    public static SpannableStringBuilder i2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new br(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new br(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static /* synthetic */ void j0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        r3Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = r3Var.F1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(updatestargiftprice, new z0(r3Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void j1(r3 r3Var, String str) {
        long j10 = r3Var.X;
        r3Var.k0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            r3Var.s2(0, true, null);
            return;
        }
        r3Var.dismiss();
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof fo) {
            fo foVar = (fo) R;
            if (foVar.a() == j10) {
                zc.a0(foVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(r3Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(r3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        fo W9 = fo.W9(j10);
        W9.whenFullyVisible(new m(7, r3Var, W9));
        R.presentFragment(W9);
    }

    public static void k0(r3 r3Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(r3Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(r3Var.currentAccount).putChats(messages_messages.chats, false);
        r3Var.K0 = true;
        r3Var.J0 = false;
        Boolean bool = r3Var.g1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        r3Var.k2(messageObject, null);
    }

    public static void k1(r3 r3Var, boolean z10) {
        int H1 = r3Var.H1();
        if (H1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + H1;
        int i11 = r3Var.S0;
        if (i11 >= 0 && (!z10 ? i11 < H1 : i11 > H1)) {
            i10 = i11;
        }
        g5 g5Var = r3Var.E0;
        Object obj = (g5Var == null || i10 < 0 || i10 >= g5Var.e()) ? null : r3Var.E0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? r3Var.d0 : r3Var.c0) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (y1((z10 ? r3Var.d0 : r3Var.c0).D0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (z1((z10 ? r3Var.d0 : r3Var.c0).H0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        yh.l2 l2Var = new yh.l2(r3Var, r3Var.getContext(), r3Var.currentAccount, r3Var.X, r3Var.resourcesProvider, r3Var.Y.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            l2Var.l2((TL_stars.SavedStarGift) obj, r3Var.E0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            l2Var.j2(tL_starGiftUnique.slug, tL_starGiftUnique, r3Var.E0);
        }
        AndroidUtilities.removeFromParent(l2Var.containerView);
        if (z10) {
            r3Var.d0 = l2Var;
        } else {
            r3Var.c0 = l2Var;
        }
    }

    public static void l0(r3 r3Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(convertstargift, new e1(r3Var, a2Var, j10, j11, j12));
    }

    public static void l1(final r3 r3Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        dc b10 = view instanceof org.telegram.ui.Cells.f7 ? fc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = r3Var.F0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(r3Var.C1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(r3Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) r3Var.C1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(r3Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(r3Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(r3Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(r3Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final kc D = kc.D(launchActivity, r3Var.currentAccount);
        D.R = new Utilities.Callback4() { // from class: zh.u0
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                kc kcVar = D;
                dc dcVar = null;
                if (booleanValue) {
                    r3 r3Var2 = r3.this;
                    AndroidUtilities.runOnUIThread(new m(1, r3Var2, l4));
                    kcVar.X(null);
                    z1 z1Var = r3Var2.X0;
                    if (z1Var != null) {
                        z1Var.dismiss();
                        r3Var2.X0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        dcVar = fc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    kcVar.X(dcVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, k8.y(arrayList));
    }

    public static void m0(r3 r3Var, long j10) {
        new yh.p1(r3Var.getContext(), r3Var.currentAccount, j10, null, new t1(r3Var, 2)).show();
    }

    public static void n0(r3 r3Var, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            a2Var.dismiss();
            r3Var.M0 = true;
            r3Var.l2(savedStarGift, null);
            super.show();
            return;
        }
        a2Var.dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            sc Q = zc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.t = true;
            Q.j();
        }
    }

    public static void o0(r3 r3Var) {
        TL_stars.TL_starGiftUnique L1 = r3Var.L1();
        new z(r3Var.getContext(), r3Var.currentAccount, DialogObject.getPeerDialogId(L1.owner_id), L1, r3Var.resourcesProvider, new a1(r3Var, 2)).show();
    }

    public static /* synthetic */ void p0(r3 r3Var, String str) {
        r3Var.dismiss();
        pf.d.r(r3Var.getContext(), "https://" + MessagesController.getInstance(r3Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void q0(r3 r3Var) {
        if (r3Var.m1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < r3Var.m1.invoice.prices.size(); i10++) {
            j10 += r3Var.m1.invoice.prices.get(i10).amount;
        }
        q3 q3Var = new q3(r3Var.getContext(), j10, r3Var.j1, r3Var.resourcesProvider);
        r3Var.q0 = q3Var;
        q3Var.show();
    }

    public static /* synthetic */ void r0(r3 r3Var, pf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new pi.g(r3Var, cVar, tL_starGiftUnique, 23));
            return;
        }
        r3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new qi.e(r3Var, cVar, Long.parseLong(tL_error.text.substring(26)), 4));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new pi.g(r3Var, cVar, tL_error, 24));
        }
    }

    public static void r1(o01 o01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        o01Var.e(str, starGiftAttribute.name, K1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static /* synthetic */ void s0(r3 r3Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, bd[] bdVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new r0(r3Var.getContext(), r3Var.resourcesProvider, r3Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            r3Var.q2(bdVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, fi.l.H0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void t0(r3 r3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        r3Var.k0.setLoading(false);
        bi.o3 o3Var = new bi.o3(r3Var, 12);
        sg.j0 j0Var = new sg.j0(26, r3Var.currentAccount, r3Var.getContext(), o3Var, r3Var.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(tL_premium_boostsStatus, true);
        j0Var.I1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new ug.d(r3Var, chat);
        }
        j0Var.show();
    }

    public static /* synthetic */ void u0(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k1(r3Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        r3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new qi.e(r3Var, Long.parseLong(tL_error.text.substring(26)), runnable, 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l1(r3Var, tL_error, runnable, 0));
        }
    }

    public static /* synthetic */ void w0(r3 r3Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        yh.e4 e4Var = r3Var.U0;
        if (e4Var != null) {
            e4Var.b();
            r3Var.U0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(r3Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new il0(r3Var, callback2, arrayList, runnable, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x0(r3 r3Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        br[] brVarArr = r3Var.n1;
        di.d dVar = r3Var.k0;
        int i11 = 1;
        if (r3Var.Z0.b == 1 && !r3Var.isDismissed()) {
            TL_stars.InputSavedStarGift F1 = r3Var.F1();
            MessageObject messageObject = r3Var.F0;
            long j10 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j11 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j11 <= 0) {
                }
                z10 = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = r3Var.D0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 <= 0) {
                }
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(r3Var.currentAccount).getCurrentTime();
            if (r3Var.k1 != null) {
                i10 = 0;
                while (i10 < r3Var.k1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) r3Var.k1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (r3Var.m1 != null) {
                int i12 = 0;
                while (i12 < r3Var.m1.invoice.prices.size()) {
                    j10 += r3Var.m1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !r3Var.l1) {
                r3Var.l1 = true;
                if (r3Var.k1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        r3Var.k1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = r3Var.w0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = F1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(r3Var.currentAccount).getInputPeer(r3Var.X);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject q6 = fi.k3.q(r3Var.resourcesProvider, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(r3Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new y1(r3Var, i11));
            }
            if (z10) {
                dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, brVarArr), true, true);
            } else {
                dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, brVarArr), true, true);
            }
            q3 q3Var = r3Var.q0;
            if (q3Var != null) {
                q3Var.Q(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            org.telegram.ui.Components.r6 r6Var = dVar.e;
            r6Var.D = false;
            r6Var.E = true;
            r6Var.F = true;
            r6Var.G = false;
            r6Var.H = false;
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(r3Var.o1, 1000L);
        }
    }

    public static boolean y1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
    }

    public static void z0(r3 r3Var, TLObject tLObject, ug.m1[] m1VarArr, Long l4, pi.g gVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            sc Y = r3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(r3Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(r3Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            gVar.run();
        } else {
            new zc(m1VarArr[0].container, r3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
        }
    }

    public static boolean z1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public final int A1() {
        if (this.Z0.d(1)) {
            return this.s0.getMeasuredHeight();
        }
        if (this.Z0.d(2)) {
            return this.z0.getMeasuredHeight();
        }
        if (this.Z0.d(3)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.Z0.d(4)) {
            return 0;
        }
        return this.g0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return this.T0;
    }

    public final long B1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.F0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.X;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.F0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return DialogObject.getPeerDialogId(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return DialogObject.getPeerDialogId(peer3);
        }
        return 0L;
    }

    public final TL_stars.StarGift C1() {
        MessageObject messageObject = this.F0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String D1() {
        TL_stars.StarGift C1 = C1();
        if (!(C1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) C1).title);
        sb2.append(" #");
        return org.telegram.messenger.g0.h(r0.num, ',', sb2);
    }

    public final TL_stars.InputSavedStarGift F1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.X;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.F0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.H0 == null || TextUtils.isEmpty(this.G0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.G0;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & 4096) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        MessageObject messageObject2 = this.F0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.F0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.F0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.F0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.F0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.F0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.F0;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.D0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.H0 == null || TextUtils.isEmpty(this.G0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.G0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String G1() {
        TL_stars.StarGift C1 = C1();
        if (!(C1 instanceof TL_stars.TL_starGiftUnique) || C1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + C1.slug;
    }

    public final int H1() {
        int indexOf;
        g5 g5Var = this.E0;
        if (g5Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift != null) {
            indexOf = g5Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = g5Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift C1 = C1();
        for (int i10 = 0; i10 < this.E0.e(); i10++) {
            Object obj = this.E0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.D0;
                if (savedStarGift2 != null) {
                    if (y1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (C1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (C1 != starGift) {
                        if ((C1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && C1.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && z1(this.H0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift I1(boolean z10) {
        int H1 = H1();
        if (H1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + H1;
        int i11 = this.S0;
        if (i11 >= 0 && (!z10 ? i11 < H1 : i11 > H1)) {
            i10 = i11;
        }
        g5 g5Var = this.E0;
        Object obj = (g5Var == null || i10 < 0 || i10 >= g5Var.e()) ? null : this.E0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique J1(boolean z10) {
        int H1 = H1();
        if (H1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + H1;
        int i11 = this.S0;
        if (i11 >= 0 && (!z10 ? i11 < H1 : i11 > H1)) {
            i10 = i11;
        }
        g5 g5Var = this.E0;
        Object obj = (g5Var == null || i10 < 0 || i10 >= g5Var.e()) ? null : this.E0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique L1() {
        TL_stars.StarGift C1 = C1();
        if (C1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) C1;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.db
    public final boolean M() {
        return false;
    }

    public final boolean M1(boolean z10) {
        return (I1(z10) == null && J1(z10) == null) ? false : true;
    }

    public final void N1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift F1 = F1();
        getstargiftwithdrawalurl.stargift = F1;
        if (F1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new q1(this, twoStepVerificationActivity, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
        long clientUserId;
        TL_stars.TL_starGiftUnique L1 = L1();
        if (this.k0.N || L1 == null) {
            return;
        }
        if (this.H0 != null && this.I0) {
            clientUserId = this.X;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        ag.b bVar = L1.resale_ton_only ? ag.b.b : ag.b.a;
        if (this.H0 == null || !this.I0) {
            d2(L1, clientUserId, bVar, null, true, null);
            return;
        }
        yh.k0 k0Var = new yh.k0(getContext(), this.resourcesProvider, L1, clientUserId);
        k0Var.K = new df(this, k0Var, L1, clientUserId, bVar, 3);
        k0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(View view) {
        int i10;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            v1();
            return;
        }
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        int i11 = 0;
        if (L1.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String formatString = LocaleController.formatString(R.string.Gift2UnlistTitle, D1());
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.R = formatString;
            a2Var.T = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new v1(this, L1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z3.a(4));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.F0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    p7.g1(getContext(), this.currentAccount, null, new w1(this, L1, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.F0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        r2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                r2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.D0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void T1() {
        z1 z1Var = this.X0;
        if (z1Var != null && z1Var.isShown()) {
            this.X0.dismiss();
        }
        String G1 = G1();
        z1 z1Var2 = new z1(this, getContext(), G1, G1, this.resourcesProvider);
        this.X0 = z1Var2;
        z1Var2.s0 = new m.l(this);
        z1Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r4.can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1() {
        TL_stars.TL_starGiftUnique L1;
        this.g0.setAlpha(this.Z0.a(0));
        this.s0.setAlpha(this.Z0.a(1));
        this.z0.setAlpha(this.Z0.a(2));
        this.B0.setAlpha(this.Z0.a(3));
        float a2 = 1.0f - this.Z0.a(4);
        FrameLayout frameLayout = this.l0;
        frameLayout.setAlpha(a2);
        f4.d dVar = this.Z0;
        o3 o3Var = this.f0;
        o3Var.d(dVar);
        ImageView imageView = o3Var.P;
        if (this.Z0.c(0) && (L1 = L1()) != null && !L1.crafted && P1(this.currentAccount, DialogObject.getPeerDialogId(L1.owner_id))) {
            MessageObject messageObject = this.F0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            org.telegram.ui.x5 x5Var = this.Y;
            float d = x5Var.d();
            this.e0.setAlpha(this.Z0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            x5Var.e();
            x5Var.invalidate();
            frameLayout.setVisibility(this.Z0.c(4) ? 8 : 0);
            u2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        org.telegram.ui.x5 x5Var2 = this.Y;
        float d10 = x5Var2.d();
        this.e0.setAlpha(this.Z0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        x5Var2.e();
        x5Var2.invalidate();
        frameLayout.setVisibility(this.Z0.c(4) ? 8 : 0);
        u2();
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        p7.g1(getContext(), this.currentAccount, L1, new w1(this, L1, 2), this.resourcesProvider);
    }

    public final void W1(long j10, String str) {
        this.h1 = true;
        n5.y(this.currentAccount, false).K(j10, new org.telegram.ui.Wallet.z6(12, this, str));
    }

    public final void X1(boolean z10) {
        int i10;
        MessageObject messageObject = this.F0;
        int i11 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(L1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
            a2Var2.R = string2;
            a2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        o3 o3Var = this.f0;
        if (z10) {
            o3Var.L.a(this.currentAccount, L1.gift_id, L1.getDocument(), L1.title);
            if (u1()) {
                s2 s2Var = o3Var.L;
                TL_stars.TL_starGiftUnique L12 = L1();
                if (L12 == null) {
                    s2Var.getClass();
                } else {
                    while (true) {
                        q2[] q2VarArr = s2Var.n;
                        if (i11 >= q2VarArr.length) {
                            break;
                        }
                        q2 q2Var = q2VarArr[i11];
                        TL_stars.StarGift starGift = q2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            q2Var.a(L12, true);
                            break;
                        }
                        i11++;
                    }
                    s2Var.d(true);
                }
            }
        }
        s2 s2Var2 = o3Var.L;
        s2 s2Var3 = o3Var.L;
        s2Var2.setOnCraft(new w0(this, i12));
        if (this.U0 == null) {
            yh.e4 e4Var = new yh.e4(this.currentAccount, L1.gift_id);
            this.U0 = e4Var;
            e4Var.a();
        }
        s2Var3.setOnAddGift(new w1(this, L1, i12));
        s2Var3.setOnClose(new a1(this, 18));
        s2(4, true, null);
    }

    public final void Y1(long j10) {
        di.d4 d4Var = this.p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.p1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null || UserObject.isService(j10)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
            if (j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putBoolean("open_gifts", true);
        U.presentFragment(new ProfileActivity(bundle, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z1() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        za zaVar;
        ug.g1 g1Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        di.d4 d4Var = this.p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.p1 = null;
        }
        MessageObject messageObject = this.F0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.F0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            r2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.D0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    r2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.D0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        ug.m1[] m1VarArr = {new ug.m1(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        ug.m1 m1Var = m1VarArr[0];
                        m1Var.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        zaVar = m1Var.e;
                        if (zaVar != null) {
                            zaVar.setTitle(m1Var.B());
                        }
                        g1Var = m1Var.b0;
                        if (g1Var != null) {
                            g1Var.setText(m1Var.B());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        ug.m1 m1Var2 = m1VarArr[0];
                        m1Var2.E0 = true;
                        m1Var2.F0 = max;
                        m1Var2.i0(false, true);
                        ug.m1 m1Var3 = m1VarArr[0];
                        m1Var3.B0 = new org.telegram.ui.Components.j2(this, currentTime, i11, max, tL_starGiftUnique2, m1VarArr);
                        m1Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.F0;
                if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i11 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context22 = getContext();
                        int i132 = this.currentAccount;
                        ug.m1[] m1VarArr2 = {new ug.m1(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        ug.m1 m1Var4 = m1VarArr2[0];
                        m1Var4.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        zaVar = m1Var4.e;
                        if (zaVar != null) {
                        }
                        g1Var = m1Var4.b0;
                        if (g1Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        ug.m1 m1Var22 = m1VarArr2[0];
                        m1Var22.E0 = true;
                        m1Var22.F0 = max;
                        m1Var22.i0(false, true);
                        ug.m1 m1Var32 = m1VarArr2[0];
                        m1Var32.B0 = new org.telegram.ui.Components.j2(this, currentTime2, i11, max, tL_starGiftUnique22, m1VarArr2);
                        m1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.D0;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a2(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String str;
        TLRPC.Chat chat;
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.F0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new u2(getContext(), L1, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        sk.o(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, D1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, D1(), str)));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        o01 o01Var = new o01(getContext(), this.resourcesProvider);
        r1(o01Var, n5.l(L1.attributes, TL_stars.starGiftAttributeModel.class));
        r1(o01Var, n5.l(L1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        r1(o01Var, n5.l(L1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(L1.slug) && (L1.flags & 256) != 0) {
            o01Var.c(LocaleController.getString(R.string.GiftValue2), t8.b.h("~", BillingController.getInstance().formatCurrency(L1.value_amount, L1.value_currency, BillingController.getInstance().getCurrencyExp(L1.value_currency), true)), null, null);
        }
        linearLayout.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? p7.R0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new rg.b0(callback, 26));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.X0 = true;
        a2Var.show();
    }

    public final void b2() {
        TL_stars.InputSavedStarGift F1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        di.d4 d4Var = this.p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.p1 = null;
        }
        if (this.a1 == null && (F1 = F1()) != null) {
            MessageObject messageObject = this.F0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j10 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.F0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.D0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.x0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            aq aqVar = this.w0;
            aqVar.a(z14, false);
            ArrayList arrayList = this.i1;
            if (arrayList != null && (j12 > j10 || this.m1 != null)) {
                c2();
                return;
            }
            if (arrayList == null) {
                n5.y(this.currentAccount, false).K(j11, new t1(this, 1));
            }
            if (j12 > j10 || this.m1 != null) {
                return;
            }
            this.l1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = aqVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = F1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject q6 = fi.k3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new y1(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c2() {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        int i11;
        String string;
        String string2;
        MessageObject messageObject = this.F0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.i1 != null) {
            if (j10 > 0 || this.m1 != null) {
                long j11 = 0;
                if (this.m1 != null) {
                    for (int i12 = 0; i12 < this.m1.invoice.prices.size(); i12++) {
                        j11 += this.m1.invoice.prices.get(i12).amount;
                    }
                }
                e3 e3Var = this.N0;
                o3 o3Var = this.f0;
                if (e3Var == null) {
                    this.N0 = new e3(o3Var);
                }
                e3 e3Var2 = this.N0;
                ArrayList arrayList = this.i1;
                o3 o3Var2 = e3Var2.a;
                ArrayList arrayList2 = e3Var2.g;
                ArrayList arrayList3 = e3Var2.f;
                ArrayList arrayList4 = e3Var2.e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((c3) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = n5.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = m10.get(i14);
                    i14++;
                    c3 c3Var = new c3(o3Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (o3Var2.isAttachedToWindow() && c3Var.c) {
                        c3Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(c3Var);
                }
                int i15 = 0;
                ArrayList m11 = n5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = m11.get(i16);
                    i16++;
                    arrayList3.add(new b3((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = n5.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = m12.get(i17);
                    i17++;
                    arrayList2.add(new d3((TL_stars.starGiftAttributePattern) obj4));
                }
                o3Var.setPreviewingAttributes(this.i1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.X;
                if (z10) {
                    z11 = true;
                    o3Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z11 = true;
                    o3Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                di.d dVar = this.k0;
                dVar.setFilled(z11);
                dVar.f(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.k1 != null) {
                        int i18 = 0;
                        while (true) {
                            if (i18 >= this.k1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.k1.get(i18);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i18++;
                        }
                    }
                    ArrayList arrayList5 = this.j1;
                    FrameLayout frameLayout = this.n0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.m0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new a1(this, i15)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    u2();
                    br[] brVarArr = this.n1;
                    if (z10) {
                        i10 = 1;
                        dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, brVarArr), true, true);
                    } else {
                        i10 = 1;
                        dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, brVarArr), true, true);
                    }
                } else {
                    i10 = 1;
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new t0(this, i10));
                View view = this.u0;
                LinearLayout linearLayout = this.v0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                fi.k[] kVarArr = this.t0;
                if (z10) {
                    fi.k kVar = kVarArr[c10];
                    int i19 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
                        int i20 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i11 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c10] = DialogObject.getShortName(this.currentAccount, j12);
                        string = LocaleController.formatString(i20, objArr);
                    } else {
                        i11 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    kVar.a(string3, string, i19);
                    fi.k kVar2 = kVarArr[i11];
                    int i21 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i22 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i22, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    kVar2.a(string4, string2, i21);
                    kVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    kVarArr[c10].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    kVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    kVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new b1(this, j11, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.db, org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        if (this.Z0.c(4)) {
            boolean z10 = this.f0.L.h0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithTouchOutside() {
        if (this.Z0.c(4) && this.f0.L.h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.Z0.c(4) && this.f0.L.h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    public final void d2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final ag.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final yh.k0 k0Var) {
        this.k0.setLoading(true);
        if (k0Var != null && !k0Var.L) {
            k0Var.L = true;
            k0Var.H.h(true);
        }
        n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() { // from class: zh.x0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                r3.b1(r3.this, k0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.E0 == ((f5) objArr[1])) {
                s2 s2Var = this.f0.L;
                if (s2Var == null || !s2Var.h0) {
                    v2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        if (this.Z0.c(4) && this.f0.L.h0) {
            return;
        }
        yh.e4 e4Var = this.U0;
        if (e4Var != null) {
            e4Var.b();
            this.U0 = null;
        }
        e3 e3Var = this.N0;
        if (e3Var != null) {
            e3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder f2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, t8.b.h("@", publicUsername)), new r1(this, publicUsername, 8));
    }

    public final SpannableStringBuilder g2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return f2(starGift.released_by);
    }

    @Override // org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public zc getBulletinFactory() {
        return new zc(this.p0, this.resourcesProvider);
    }

    public final void j2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, g5 g5Var) {
        e3 e3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.G0 = str;
        this.H0 = tL_starGiftUnique;
        this.E0 = g5Var;
        this.I0 = (tL_starGiftUnique.resell_amount == null || O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.O0 && (e3Var = this.N0) != null && e3Var.o && (tL_starGiftUnique2 = e3Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            e3Var.a();
            this.N0 = null;
            o3 o3Var = this.f0;
            o3Var.b.setAlpha(1.0f);
            o3Var.c.setAlpha(0.0f);
        }
        this.e0.b(this.currentAccount, this.D0);
        m2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        da0 da0Var = this.h0;
        if (!z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            da0Var.setVisibility(8);
        } else {
            da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            da0Var.setVisibility(0);
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        }
        da0 da0Var2 = this.j0;
        if (z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            da0Var2.setVisibility(8);
        } else {
            da0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            da0Var2.setVisibility(0);
        }
        if (this.I0) {
            n2(tL_starGiftUnique);
            this.k0.setOnClickListener(new t0(this, 7));
        }
        if (this.c1) {
            s2(0, false, null);
            this.c.n0(1);
            this.c1 = false;
        }
        v2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0345, code lost:
    
        if (P1(r55.currentAccount, org.telegram.messenger.DialogObject.getPeerDialogId(r1)) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0356, code lost:
    
        if (r12 > 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0399, code lost:
    
        if (r36 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x039b, code lost:
    
        if (r29 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x039f, code lost:
    
        if (r26 <= 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03a1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2Info2OutUpgrade, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03b3, code lost:
    
        if (r23 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03b5, code lost:
    
        if (r25 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03b7, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2InfoOutPinned, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03c3, code lost:
    
        if (r25 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03c5, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03ca, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03c8, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03d7, code lost:
    
        if (r25 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03d9, code lost:
    
        if (r38 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03db, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03e8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03de, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03e1, code lost:
    
        if (r38 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03e3, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x03e6, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0397, code lost:
    
        if (r7 > 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r12 != r10.id) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x040c  */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.br[], org.telegram.ui.Components.n01[]] */
    /* JADX WARN: Type inference failed for: r7v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(MessageObject messageObject, g5 g5Var) {
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        int i10;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        TLRPC.Peer peer4;
        TLRPC.Peer peer5;
        boolean z17;
        int i11;
        String formatString;
        String string;
        TLRPC.Peer peer6;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String str2;
        char c10;
        CharSequence charSequence;
        int i12;
        CharSequence concat;
        o01 o01Var;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z18;
        int i13;
        boolean z19;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TL_stars.StarGift starGift4;
        boolean z20;
        boolean z21;
        int i14;
        ?? r72;
        CharSequence charSequence2;
        String string2;
        SpannableStringBuilder replaceTags;
        e3 e3Var;
        String string3;
        boolean z22;
        TLObject userOrChat;
        e3 e3Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift F1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z23 = false;
        this.C0 = false;
        this.D0 = null;
        this.F0 = messageObject;
        this.E0 = g5Var;
        this.e0.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z24 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i15 = 3;
        o3 o3Var = this.f0;
        di.d dVar = this.k0;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.O0 && (e3Var = this.N0) != null && e3Var.o && e3Var.l != null) {
                e3Var.a();
                this.N0 = null;
                o3Var.b.setVisibility(0);
                o3Var.c.setVisibility(4);
            }
            boolean isOutOwner = messageObject.isOutOwner();
            if (z24) {
                isOutOwner = false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            int i16 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z26 = tL_messageActionStarGift.converted;
                boolean z27 = tL_messageActionStarGift.saved;
                boolean z28 = tL_messageActionStarGift.refunded;
                boolean z29 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z30 = tL_messageActionStarGift.can_upgrade;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageActionStarGift.message;
                TLRPC.Peer peer7 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities5;
                peer2 = peer8;
                z14 = z30;
                z10 = z27;
                z12 = z29;
                peer = peer7;
                starGift = starGift5;
                j10 = j12;
                z13 = z26;
                z11 = z28;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                z10 = tL_messageActionStarGiftUnique.saved;
                z11 = tL_messageActionStarGiftUnique.refunded;
                starGift = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                peer2 = tL_messageActionStarGiftUnique.peer;
                j10 = 0;
                j11 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                str = null;
            }
            long j13 = this.X;
            String shortName = DialogObject.getShortName(j13);
            z16 = z24;
            boolean z31 = isOutOwner;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j13)));
            boolean z32 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean Q1 = Q1(this.currentAccount, L1());
            G1();
            o3Var.f(starGift, false, false, Q1);
            int i17 = 2;
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    peer4 = peer3;
                    peer5 = peer;
                    z17 = z12;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    peer4 = peer3;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    peer5 = peer;
                    z17 = z12;
                    string2 = org.telegram.messenger.g0.h(i10, ',', sb2);
                }
                this.T0 = string2;
                if (z11) {
                    replaceTags = null;
                } else if (z14) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j10 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                o3Var.i(0, string2, replaceTags, g2(starGift));
            } else {
                peer4 = peer3;
                peer5 = peer;
                z17 = z12;
                if (z32 && !this.C0) {
                    o3Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, g2(starGift));
                } else if ((z31 || z14) && j11 > 0) {
                    String string4 = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.T0 = string4;
                    if (z11) {
                        formatString = null;
                    } else if (z31) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        o3Var.i(i11, string4, formatString, g2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    o3Var.i(i11, string4, formatString, g2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        string = org.telegram.messenger.g0.h(i10, ',', sb3);
                    }
                    this.T0 = string;
                    if (z11) {
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && F1() != null) {
                            MessageObject messageObject2 = this.F0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z33 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.F0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.F0.messageOwner.date);
                                    if (z33) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            peer6 = peer5;
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        }
                                    } else {
                                        peer6 = peer5;
                                        tL_textWithEntities2 = tL_textWithEntities;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z31) {
                                        str2 = LocaleController.formatString((!z14 || j11 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z10 ? z32 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z32 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                peer6 = peer5;
                                tL_textWithEntities2 = tL_textWithEntities;
                                TL_stars.SavedStarGift savedStarGift = this.D0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (P1(this.currentAccount, j13)) {
                                        int i18 = this.D0.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i18) != 0) {
                                            if ((i18 & 16) != 0) {
                                                if ((i18 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z31) {
                                }
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str2);
                            if (isBot && t1()) {
                                c10 = 1;
                                charSequence = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a1(this, 6)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        if (z31) {
                        }
                        SpannableStringBuilder replaceTags22 = AndroidUtilities.replaceTags(str2);
                        if (isBot) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i12 = 0;
                        charSequenceArr2[0] = replaceTags22;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    o3Var.i(i12, string, concat, g2(starGift));
                    o01Var = this.i0;
                    o01Var.removeAllViews();
                    long peerDialogId = peer6 == null ? DialogObject.getPeerDialogId(peer6) : z31 ? clientUserId : j13;
                    if (peer2 == null) {
                        j13 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z31) {
                        j13 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer4 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer4);
                        starGift2 = starGift;
                        this.i0.l(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new b1(this, peerDialogId2, 4), null, z32 ? null : new b1(this, peerDialogId2, 5));
                    } else {
                        starGift2 = starGift;
                        if (peerDialogId != clientUserId || z15 || z32) {
                            this.i0.l(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new b1(this, peerDialogId, 6), (peerDialogId == clientUserId || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z32) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z32 ? null : new b1(this, peerDialogId, 7));
                        }
                        if (j13 != clientUserId || z32) {
                            this.i0.l(LocaleController.getString(R.string.Gift2To), this.currentAccount, j13, new b1(this, j13, 8), null, z32 ? null : new b1(this, j13, 9));
                        }
                    }
                    o01Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift2.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String h = org.telegram.messenger.g0.h(starGift2.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!t1() || z11) {
                            r72 = 0;
                            charSequence2 = "";
                        } else {
                            r72 = 0;
                            charSequence2 = cd.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j10), new a1(this, 4), this.resourcesProvider, null);
                        }
                        o01Var.c(string5, p7.Y0(false, TextUtils.concat(h, " ", charSequence2), 0.8f, r72), r72, r72);
                    }
                    if (starGift2.limited && !z11) {
                        p7.G0(o01Var, this.currentAccount, starGift2, this.resourcesProvider);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z11) {
                        o01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z31 && z14 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.b1 == null) {
                            i14 = 0;
                            this.b1 = new br(0, new p3(dVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder.setSpan(this.b1, i14, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j11 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.c1, true);
                        dVar.f(null, !this.c1);
                        dVar.setOnClickListener(new t0(this, 11));
                    } else if (this.r0 || this.Z == null || this.E0 == null || H1() < 0 || this.E0.b(H1()) < 0) {
                        if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z18 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                            dVar.f(null, !this.c1);
                            dVar.setOnClickListener(new t0(this, 9));
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.b1 == null) {
                                i13 = 0;
                                this.b1 = new br(0, new p3(dVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                            } else {
                                i13 = 0;
                            }
                            z18 = true;
                            spannableStringBuilder2.setSpan(this.b1, i13, 1, 33);
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder2, !this.c1, true);
                            dVar.f(null, !this.c1);
                            dVar.setOnClickListener(new t0(this, 8));
                        }
                        tL_textWithEntities4 = tL_textWithEntities3;
                        starGift4 = starGift2;
                        z20 = z11;
                        z23 = z13;
                        z21 = z31;
                    } else {
                        dVar.setFilled(false);
                        int b10 = this.E0.b(H1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.E0.get(b10);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                            z19 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            z19 = true;
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        dVar.g(spannableStringBuilder3, this.c1 ^ z19, z19);
                        dVar.f(null, this.c1 ^ z19);
                        dVar.setOnClickListener(new d1(this, b10, i17));
                    }
                    z18 = true;
                    tL_textWithEntities4 = tL_textWithEntities3;
                    starGift4 = starGift2;
                    z20 = z11;
                    z23 = z13;
                    z21 = z31;
                }
            }
            peer6 = peer5;
            tL_textWithEntities2 = tL_textWithEntities;
            o01Var = this.i0;
            o01Var.removeAllViews();
            if (peer6 == null) {
            }
            if (peer2 == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer4 == null) {
            }
            o01Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift2.stars > 0) {
            }
            if (starGift2.limited) {
                p7.G0(o01Var, this.currentAccount, starGift2, this.resourcesProvider);
            }
            tL_textWithEntities3 = tL_textWithEntities2;
            if (tL_textWithEntities2 != null) {
                o01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            if (z31) {
            }
            if (this.r0) {
            }
            if (starGift2 instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            dVar.setFilled(true);
            dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
            dVar.f(null, !this.c1);
            dVar.setOnClickListener(new t0(this, 9));
            tL_textWithEntities4 = tL_textWithEntities3;
            starGift4 = starGift2;
            z20 = z11;
            z23 = z13;
            z21 = z31;
        } else {
            if (!z22) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                userOrChat = null;
            } else {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer10 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer10 != null ? DialogObject.getPeerDialogId(peer10) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z20 = tL_messageActionStarGiftUnique2.refunded;
            m2(tL_starGiftUnique2, z20, userOrChat, tL_messageActionStarGiftUnique2.message);
            boolean z34 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            boolean z35 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z35 = false;
            }
            if (!this.L0 && !this.M0 && this.F0 != null && (F1 = F1()) != null) {
                this.L0 = true;
                n5.y(this.currentAccount, false).M(F1, new t1(this, i15));
            }
            if (this.O0 || (e3Var2 = this.N0) == null || !e3Var2.o || (tL_starGiftUnique = e3Var2.l) == null) {
                z21 = z35;
            } else {
                if (starGift4 != null) {
                    long j14 = tL_starGiftUnique.id;
                    z21 = z35;
                } else {
                    z21 = z35;
                }
                e3Var2.a();
                this.N0 = null;
                o3Var.b.setAlpha(1.0f);
                o3Var.c.setAlpha(0.0f);
            }
            z17 = false;
            peer4 = null;
            z16 = z24;
            z10 = z34;
            z18 = true;
            tL_textWithEntities4 = null;
        }
        if (this.f1) {
            dVar.setFilled(z18);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z18);
            dVar.setOnClickListener(new t0(this, 10));
        }
        String str3 = starGift4 == null ? null : starGift4.owner_address;
        String str4 = starGift4 == null ? null : starGift4.gift_address;
        boolean z36 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        da0 da0Var = this.h0;
        if (z20) {
            da0Var.setVisibility(0);
            da0Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, this.resourcesProvider));
        } else if (z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            da0Var.setVisibility(0);
            da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z17 && !z16) {
            da0Var.setVisibility(0);
            if (z21) {
                string3 = LocaleController.formatString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            da0Var.setText(string3);
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else {
            da0Var.setVisibility(8);
        }
        da0 da0Var2 = this.j0;
        if (!z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            da0Var2.setVisibility(0);
            da0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str4, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z23 || z20 || starGift4 == null || !O1(this.currentAccount, B1()) || peer4 != null) {
            da0Var2.setVisibility(8);
        } else {
            da0Var2.setVisibility(0);
            if (B1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z10) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new br(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z10 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new a1(this, 3)));
                da0Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                da0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z10 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new a1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.c1) {
            s2(0, false, null);
            this.c.n0(1);
            this.c1 = false;
        }
        this.e.setTitle(this.T0);
        v2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.br[], org.telegram.ui.Components.n01[]] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v48 */
    public final void l2(TL_stars.SavedStarGift savedStarGift, g5 g5Var) {
        long j10;
        String string;
        int i10;
        CharSequence charSequence;
        String formatString;
        int i11;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r12;
        int i12;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str;
        String str2;
        boolean z10;
        int i13;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        e3 e3Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.currentAccount;
        long j11 = this.X;
        this.C0 = O1(i14, j11);
        this.D0 = savedStarGift;
        this.E0 = g5Var;
        this.F0 = null;
        boolean z11 = this.O0;
        o3 o3Var = this.f0;
        if (!z11 && (e3Var = this.N0) != null && e3Var.o && e3Var.l != null) {
            e3Var.a();
            this.N0 = null;
            o3Var.b.setVisibility(0);
            o3Var.c.setVisibility(4);
        }
        this.e0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i15 = 2;
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z12 = j11 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z13 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z10 = starGift4.host_id != null;
            m2((TL_stars.TL_starGiftUnique) starGift4, z13, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z14 = this.C0 && clientUserId == peerDialogId && j11 >= 0;
            boolean Q1 = Q1(this.currentAccount, L1());
            G1();
            o3Var.f(starGift4, false, false, Q1);
            o01 o01Var = this.i0;
            o01Var.removeAllViews();
            CharSequence charSequence3 = "";
            if (z14) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j10 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string2 = org.telegram.messenger.g0.h(savedStarGift.gift_num, ',', sb2);
                }
                this.T0 = string2;
                if (z13) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    replaceTags = j12 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                o3Var.i(0, string2, replaceTags, g2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (!z12 || this.C0) {
                    boolean z15 = this.C0;
                    if ((!z15 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.T0 = string3;
                        o3Var.i(0, string3, (!z13 && this.C0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, g2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = org.telegram.messenger.g0.h(savedStarGift.gift_num, ',', sb3);
                        }
                        this.T0 = string;
                        if (z13 || !this.C0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !t1()) {
                                if (this.C0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z12 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z12 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.C0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z12 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z12 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (isBot || !t1()) {
                                i11 = 1;
                                charSequence2 = charSequence3;
                            } else {
                                i11 = 1;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a1(this, i11)), true);
                            }
                            int i16 = i11;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[i16] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        o3Var.i(i10, string, charSequence, g2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.T0 = string4;
                    o3Var.i(0, string4, null, f2(savedStarGift.gift.released_by));
                }
            }
            if (j10 != peerDialogId || z12) {
                this.i0.l(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new b1(this, peerDialogId, 1), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z12) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new b1(this, peerDialogId, i15));
            }
            o01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!t1() || z13) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequence3 = cd.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new a1(this, 4), this.resourcesProvider, null);
            }
            o01Var.c(string5, p7.Y0(false, TextUtils.concat(h, " ", charSequence3), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z13) {
                p7.G0(o01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z13) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                o01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z16 = this.C0;
            di.d dVar = this.k0;
            if (z16 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.b1 == null) {
                    i13 = 0;
                    this.b1 = new br(0, new p3(dVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i13 = 0;
                }
                spannableStringBuilder.setSpan(this.b1, i13, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.c1, true);
                dVar.f(null, !this.c1);
                dVar.setOnClickListener(new t0(this, 3));
            } else if (this.r0 && z16 && this.Z != null && this.E0 != null && H1() >= 0 && this.E0.b(H1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.E0.b(H1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.E0.get(b10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.c1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.c1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new d1(this, b10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                dVar.f(null, !this.c1);
                dVar.setOnClickListener(new t0(this, 6));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.b1 == null) {
                    i12 = 0;
                    this.b1 = new br(0, new p3(dVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder3.setSpan(this.b1, i12, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.c1, true);
                dVar.f(null, !this.c1);
                dVar.setOnClickListener(new t0(this, 5));
            }
            str = null;
            str2 = null;
            z10 = false;
        }
        boolean z17 = savedStarGift.refunded;
        da0 da0Var = this.h0;
        if (z17) {
            da0Var.setVisibility(0);
            da0Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, this.resourcesProvider));
        } else if (z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            da0Var.setVisibility(0);
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.C0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            da0Var.setVisibility(0);
            da0Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else {
            da0Var.setVisibility(8);
        }
        da0 da0Var2 = this.j0;
        if (!z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            da0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new r1(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            da0Var2.setVisibility(0);
        } else if (this.C0 && O1(this.currentAccount, j11)) {
            if (j11 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new br(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new a1(this, 3)));
                da0Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                da0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new a1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            da0Var2.setVisibility(0);
        } else {
            r13 = 0;
            da0Var2.setVisibility(8);
        }
        if (this.c1) {
            s2(r13, r13, null);
            this.c.n0(1);
            this.c1 = r13;
        }
        this.e.setTitle(this.T0);
        v2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x04dc, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06b5  */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.n01[]] */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        o3 o3Var;
        long j10;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        boolean z11;
        o01 o01Var;
        boolean z12;
        Class cls;
        ?? r13;
        o01 o01Var2;
        ?? r11;
        int i10;
        int i11;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        e3 e3Var;
        di.d dVar;
        boolean z13;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        e3 e3Var2;
        a1 a1Var;
        a1 a1Var2;
        boolean z14;
        Object obj;
        Object obj2;
        Spannable spannable2;
        CharSequence formatSpannable;
        CharSequence formatSpannable2;
        TLRPC.Message message;
        MessageObject messageObject;
        boolean z15;
        e3 e3Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.T0 = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        boolean z16 = this.O0;
        o3 o3Var2 = this.f0;
        if (z16 || (e3Var3 = this.N0) == null || !e3Var3.o || (tL_starGiftUnique2 = e3Var3.l) == null) {
            o3Var = o3Var2;
            j10 = peerDialogId;
        } else {
            j10 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                e3Var3.a();
                this.N0 = null;
                o3Var = o3Var2;
                o3Var.b.setAlpha(1.0f);
                o3Var.c.setAlpha(0.0f);
                long j11 = j10;
                boolean P1 = P1(this.currentAccount, j11);
                boolean P12 = P1(this.currentAccount, peerDialogId2);
                boolean Q1 = Q1(this.currentAccount, L1());
                G1();
                o3Var.f(tL_starGiftUnique, P1, P12, Q1);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new xu(190, 0), length, spannableStringBuilder.length(), 33);
                if (tLObject == null) {
                    charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                    if (tL_textWithEntities != null) {
                        TextPaint textPaint = o3Var.G;
                        TextPaint textPaint2 = o3Var.G;
                        if (textPaint != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                            spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                            o3 o3Var3 = o3Var;
                            o3Var3.h(0, spannableStringBuilder, charSequence, f2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            boolean z17 = false;
                            z17 = false;
                            ?? r32 = 0;
                            this.d1 = null;
                            o01 o01Var3 = this.i0;
                            o01Var3.removeAllViews();
                            int i12 = 11;
                            int i13 = 19;
                            if (z10) {
                                if (tL_starGiftUnique.host_id != null) {
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        o01Var3.o(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new a1(this, i13));
                                    }
                                    if (peerDialogId2 != 0) {
                                        cls = TL_stars.starGiftAttributeModel.class;
                                        z17 = false;
                                        this.d1 = ((l01) this.i0.n(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new b1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                                        o01Var = o01Var3;
                                        z12 = true;
                                        z11 = false;
                                    } else {
                                        cls = TL_stars.starGiftAttributeModel.class;
                                        z15 = false;
                                    }
                                } else {
                                    z15 = false;
                                    cls = TL_stars.starGiftAttributeModel.class;
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        o01Var3.o(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new a1(this, 22));
                                    } else if (j11 == 0 && tL_starGiftUnique.owner_name != null) {
                                        o01Var3.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                    } else if (j11 != 0) {
                                        r13 = 1;
                                        o01Var2 = o01Var3;
                                        this.d1 = ((l01) this.i0.n(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new b1(this, j11, i12)).getChildAt(1)).getChildAt(0);
                                        r11 = z15;
                                        q1(n5.l(tL_starGiftUnique.attributes, cls));
                                        q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                        q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        if (z10) {
                                            i10 = r13;
                                            i11 = 33;
                                        } else {
                                            if (this.F0 == null) {
                                                i11 = 33;
                                                o01Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                            } else if (this.K0) {
                                                i11 = 33;
                                                o01Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                            } else {
                                                TextView textView = (TextView) ((l01) o01Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", r32, r32).getChildAt(r13)).getChildAt(r11);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                                ia0 ia0Var = new ia0(textView, AndroidUtilities.dp(90.0f), r11, this.resourcesProvider);
                                                int i14 = org.telegram.ui.ActionBar.g6.G6;
                                                ia0Var.a(org.telegram.ui.ActionBar.g6.m1(0.21f, org.telegram.ui.ActionBar.g6.w0(i14, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.m1(0.08f, org.telegram.ui.ActionBar.g6.w0(i14, this.resourcesProvider)));
                                                i11 = 33;
                                                spannableStringBuilder3.setSpan(ia0Var, r11, r13, 33);
                                                textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                                if (!this.J0 && !this.K0 && (messageObject = this.F0) != null) {
                                                    this.J0 = r13;
                                                    int id2 = messageObject.getId();
                                                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                    tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new bi.u7(this, id2, 8));
                                                }
                                            }
                                            if (TextUtils.isEmpty(tL_starGiftUnique.slug) || (tL_starGiftUnique.flags & 256) == 0) {
                                                i10 = r13;
                                            } else {
                                                i10 = r13;
                                                this.i0.e(LocaleController.getString(R.string.GiftValue2), t8.b.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new pi.g(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 27), null);
                                            }
                                        }
                                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                        if (stargiftattributeoriginaldetails != null) {
                                            if ((stargiftattributeoriginaldetails.flags & i10) != 0) {
                                                long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                                SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                                spannableString.setSpan(new a2(this, peerDialogId3), r11, spannableString.length(), i11);
                                                obj = spannableString;
                                            } else {
                                                obj = null;
                                            }
                                            long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                            SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                            spannableString2.setSpan(new b2(this, peerDialogId4), r11, spannableString2.length(), i11);
                                            if (stargiftattributeoriginaldetails.message != null) {
                                                TextPaint textPaint3 = new TextPaint(1);
                                                obj2 = spannableString2;
                                                textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                                MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                                spannable2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r11), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                                            } else {
                                                obj2 = spannableString2;
                                                spannable2 = null;
                                            }
                                            Spannable spannable3 = spannable2;
                                            String replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                                if (spannable3 == null) {
                                                    int i15 = R.string.Gift2AttributeOriginalDetailsSelf;
                                                    Object[] objArr = new Object[2];
                                                    objArr[r11] = obj;
                                                    objArr[1] = replaceAll;
                                                    formatSpannable = LocaleController.formatSpannable(i15, objArr);
                                                } else {
                                                    int i16 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                                    Object[] objArr2 = new Object[3];
                                                    objArr2[r11] = obj;
                                                    objArr2[1] = replaceAll;
                                                    objArr2[2] = spannable3;
                                                    formatSpannable = LocaleController.formatSpannable(i16, objArr2);
                                                }
                                            } else if (obj != null) {
                                                if (spannable3 == null) {
                                                    int i17 = R.string.Gift2AttributeOriginalDetails;
                                                    Object[] objArr3 = new Object[3];
                                                    objArr3[r11] = obj;
                                                    objArr3[1] = obj2;
                                                    objArr3[2] = replaceAll;
                                                    formatSpannable = LocaleController.formatSpannable(i17, objArr3);
                                                } else {
                                                    int i18 = R.string.Gift2AttributeOriginalDetailsComment;
                                                    Object[] objArr4 = new Object[4];
                                                    objArr4[r11] = obj;
                                                    objArr4[1] = obj2;
                                                    objArr4[2] = replaceAll;
                                                    objArr4[3] = spannable3;
                                                    formatSpannable2 = LocaleController.formatSpannable(i18, objArr4);
                                                    formatSpannable = formatSpannable2;
                                                }
                                            } else if (spannable3 == null) {
                                                int i19 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                                Object[] objArr5 = new Object[2];
                                                objArr5[r11] = obj2;
                                                objArr5[1] = replaceAll;
                                                formatSpannable2 = LocaleController.formatSpannable(i19, objArr5);
                                                formatSpannable = formatSpannable2;
                                            } else {
                                                int i20 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                                Object[] objArr6 = new Object[3];
                                                objArr6[r11] = obj2;
                                                objArr6[1] = replaceAll;
                                                objArr6[2] = spannable3;
                                                formatSpannable = LocaleController.formatSpannable(i20, objArr6);
                                            }
                                            if (O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                                TL_stars.SavedStarGift savedStarGift = this.D0;
                                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                    MessageObject messageObject2 = this.F0;
                                                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        }
                                                    }
                                                }
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                                linearLayout.setOrientation(r11);
                                                wh.n nVar = new wh.n(getContext());
                                                nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.resourcesProvider));
                                                nVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, this.resourcesProvider));
                                                nVar.setTextSize(1, 12.0f);
                                                nVar.setGravity(3);
                                                nVar.setText(formatSpannable);
                                                linearLayout.addView(nVar, w7.z5.o(-1, -2, 1.0f, 19));
                                                ImageView imageView = new ImageView(getContext());
                                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                                int i21 = org.telegram.ui.ActionBar.g6.Oh;
                                                imageView.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i21, this.resourcesProvider)), 6, 6));
                                                imageView.setImageResource(R.drawable.menu_delete_old);
                                                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i21, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                                w7.b6.a(imageView);
                                                imageView.setOnClickListener(new yh.a(11, this, formatSpannable));
                                                linearLayout.addView(imageView, w7.z5.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                                TableRow tableRow = new TableRow(getContext());
                                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                                layoutParams.span = 2;
                                                tableRow.addView(new m01(o01Var2, linearLayout, true), layoutParams);
                                                o01Var2.addView(tableRow);
                                            }
                                            m01 a2 = o01Var2.a(formatSpannable);
                                            a2.setFilled(true);
                                            wh.n nVar2 = (wh.n) a2.getChildAt(0);
                                            nVar2.setTextSize(1, 12.0f);
                                            nVar2.setGravity(17);
                                        }
                                        e3Var = this.N0;
                                        dVar = this.k0;
                                        if (e3Var != null || !e3Var.o) {
                                            if (!O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                                if (this.r0 || this.Z == null || this.E0 == null || H1() < 0 || this.E0.b(H1()) < 0) {
                                                    dVar.setFilled(true);
                                                    dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                                                    dVar.f(null, !this.c1);
                                                    dVar.setOnClickListener(new t0(this, 25));
                                                } else {
                                                    dVar.setFilled(false);
                                                    int b10 = this.E0.b(H1());
                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                                    Object obj3 = this.E0.get(b10);
                                                    if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                        z13 = true;
                                                    } else {
                                                        spannableStringBuilder5.append((CharSequence) " e");
                                                        z13 = true;
                                                        spannableStringBuilder5.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                    }
                                                    dVar.g(spannableStringBuilder5, this.c1 ^ z13, z13);
                                                    dVar.f(null, this.c1 ^ z13);
                                                    dVar.setOnClickListener(new d1(this, b10, 3));
                                                }
                                                this.e.setTitle(this.T0);
                                                e3Var2 = this.N0;
                                                if (e3Var2 != null) {
                                                    return;
                                                }
                                                boolean z18 = this.O0;
                                                a1 a1Var3 = new a1(this, 23);
                                                a1 a1Var4 = new a1(this, 20);
                                                ArrayList arrayList = e3Var2.f;
                                                o3 o3Var4 = e3Var2.a;
                                                TL_stars.TL_starGiftUnique tL_starGiftUnique3 = e3Var2.l;
                                                if (tL_starGiftUnique3 != null) {
                                                    a1Var2 = a1Var4;
                                                    a1Var = a1Var3;
                                                    if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                        z14 = e3Var2.o;
                                                        if (z14) {
                                                            return;
                                                        }
                                                        o3Var3.b.setAlpha(0.0f);
                                                        o3Var3.c.setAlpha(1.0f);
                                                        dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                        dVar.setFilled(true);
                                                        dVar.setOnClickListener(new t0(this, 23));
                                                        int length2 = ((r3) this.R0.d).Q0.length - 1;
                                                        mm0 mm0Var = this.d;
                                                        mm0Var.u0(length2);
                                                        mm0Var.post(new a1(this, 21));
                                                        return;
                                                    }
                                                } else {
                                                    a1Var = a1Var3;
                                                    a1Var2 = a1Var4;
                                                }
                                                if (z18) {
                                                    z9 upgradeImageView = o3Var4.getUpgradeImageView();
                                                    h3 h3Var = o3Var4.c;
                                                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute = o3Var4.getUpgradeImageViewAttribute();
                                                    TL_stars.starGiftAttributePattern upgradePatternAttribute = o3Var4.getUpgradePatternAttribute();
                                                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = o3Var4.getUpgradeBackdropAttribute();
                                                    TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) n5.l(tL_starGiftUnique.attributes, cls);
                                                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                    e3Var2.o = true;
                                                    e3Var2.l = tL_starGiftUnique;
                                                    e3Var2.r = a1Var;
                                                    e3Var2.s = a1Var2;
                                                    e3Var2.t = (float) Math.random();
                                                    e3Var2.m = System.currentTimeMillis();
                                                    e3Var2.n = 0.0f;
                                                    e3Var2.p = false;
                                                    e3Var2.q = false;
                                                    e3Var2.o = true;
                                                    a3 a3Var = e3Var2.h;
                                                    if (a3Var != null) {
                                                        a3Var.a();
                                                    }
                                                    c3 c3Var = new c3(h3Var, stargiftattributemodel2);
                                                    if (h3Var.isAttachedToWindow() && c3Var.c) {
                                                        c3Var.d.onAttachedToWindow();
                                                    }
                                                    e3Var2.h = new a3(new y2(e3Var2, 0), e3Var2.e, new c3(upgradeImageView, upgradeImageViewAttribute), c3Var, 0.9f, e3Var2.t > 0.5f ? 3 : 2);
                                                    a3 a3Var2 = e3Var2.i;
                                                    if (a3Var2 != null) {
                                                        a3Var2.a();
                                                    }
                                                    e3Var2.i = new a3(new y2(e3Var2, 0), e3Var2.g, new d3(upgradePatternAttribute), new d3(stargiftattributepattern), 1.0f, e3Var2.t > 0.5f ? 2 : 1);
                                                    a3 a3Var3 = e3Var2.j;
                                                    if (a3Var3 != null) {
                                                        a3Var3.a();
                                                    }
                                                    e3Var2.j = new a3(new y2(e3Var2, 0), arrayList, new b3(upgradeBackdropAttribute), new b3(stargiftattributebackdrop), 0.5f, e3Var2.t > 0.5f ? 2 : 1);
                                                    a3 a3Var4 = e3Var2.k;
                                                    if (a3Var4 != null) {
                                                        a3Var4.a();
                                                    }
                                                    e3Var2.k = new a3(new y2(e3Var2, 0), arrayList, new b3(upgradeBackdropAttribute), new b3(stargiftattributebackdrop), 1.25f, e3Var2.t > 0.5f ? 2 : 1);
                                                    e3Var2.b();
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                }
                                            } else {
                                                dVar.setFilled(true);
                                                n2(tL_starGiftUnique);
                                                dVar.setOnClickListener(new t0(this, 24));
                                            }
                                        }
                                        this.e.setTitle(this.T0);
                                        e3Var2 = this.N0;
                                        if (e3Var2 != null) {
                                        }
                                    }
                                }
                                o01Var = o01Var3;
                                z12 = true;
                                z11 = z15;
                            } else {
                                z11 = false;
                                o01Var = o01Var3;
                                z12 = true;
                                cls = TL_stars.starGiftAttributeModel.class;
                            }
                            r32 = z17;
                            r11 = z11;
                            o01Var2 = o01Var;
                            r13 = z12;
                            q1(n5.l(tL_starGiftUnique.attributes, cls));
                            q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (z10) {
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails != null) {
                            }
                            e3Var = this.N0;
                            dVar = this.k0;
                            if (e3Var != null) {
                            }
                            if (O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            }
                            if (this.r0) {
                            }
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                            dVar.f(null, !this.c1);
                            dVar.setOnClickListener(new t0(this, 25));
                            this.e.setTitle(this.T0);
                            e3Var2 = this.N0;
                            if (e3Var2 != null) {
                            }
                        }
                    }
                    spannable = null;
                    o3 o3Var32 = o3Var;
                    o3Var32.h(0, spannableStringBuilder, charSequence, f2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                    boolean z172 = false;
                    z172 = false;
                    ?? r322 = 0;
                    this.d1 = null;
                    o01 o01Var32 = this.i0;
                    o01Var32.removeAllViews();
                    int i122 = 11;
                    int i132 = 19;
                    if (z10) {
                    }
                    r322 = z172;
                    r11 = z11;
                    o01Var2 = o01Var;
                    r13 = z12;
                    q1(n5.l(tL_starGiftUnique.attributes, cls));
                    q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (z10) {
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                    }
                    e3Var = this.N0;
                    dVar = this.k0;
                    if (e3Var != null) {
                    }
                    if (O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    }
                    if (this.r0) {
                    }
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                    dVar.f(null, !this.c1);
                    dVar.setOnClickListener(new t0(this, 25));
                    this.e.setTitle(this.T0);
                    e3Var2 = this.N0;
                    if (e3Var2 != null) {
                    }
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                o3 o3Var322 = o3Var;
                o3Var322.h(0, spannableStringBuilder, charSequence, f2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                boolean z1722 = false;
                z1722 = false;
                ?? r3222 = 0;
                this.d1 = null;
                o01 o01Var322 = this.i0;
                o01Var322.removeAllViews();
                int i1222 = 11;
                int i1322 = 19;
                if (z10) {
                }
                r3222 = z1722;
                r11 = z11;
                o01Var2 = o01Var;
                r13 = z12;
                q1(n5.l(tL_starGiftUnique.attributes, cls));
                q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                e3Var = this.N0;
                dVar = this.k0;
                if (e3Var != null) {
                }
                if (O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.r0) {
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
                dVar.f(null, !this.c1);
                dVar.setOnClickListener(new t0(this, 25));
                this.e.setTitle(this.T0);
                e3Var2 = this.N0;
                if (e3Var2 != null) {
                }
            } else {
                o3Var = o3Var2;
            }
        }
        if (z16 && this.N0 == null) {
            this.N0 = new e3(o3Var);
        }
        long j112 = j10;
        boolean P13 = P1(this.currentAccount, j112);
        boolean P122 = P1(this.currentAccount, peerDialogId2);
        boolean Q12 = Q1(this.currentAccount, L1());
        G1();
        o3Var.f(tL_starGiftUnique, P13, P122, Q12);
        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder6.append((CharSequence) " ");
        int length3 = spannableStringBuilder6.length();
        spannableStringBuilder6.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
        spannableStringBuilder6.setSpan(new xu(190, 0), length3, spannableStringBuilder6.length(), 33);
        if (tLObject == null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        o3 o3Var3222 = o3Var;
        o3Var3222.h(0, spannableStringBuilder6, charSequence, f2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        boolean z17222 = false;
        z17222 = false;
        ?? r32222 = 0;
        this.d1 = null;
        o01 o01Var3222 = this.i0;
        o01Var3222.removeAllViews();
        int i12222 = 11;
        int i13222 = 19;
        if (z10) {
        }
        r32222 = z17222;
        r11 = z11;
        o01Var2 = o01Var;
        r13 = z12;
        q1(n5.l(tL_starGiftUnique.attributes, cls));
        q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        q1(n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        e3Var = this.N0;
        dVar = this.k0;
        if (e3Var != null) {
        }
        if (O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
        }
        if (this.r0) {
        }
        dVar.setFilled(true);
        dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
        dVar.f(null, !this.c1);
        dVar.setOnClickListener(new t0(this, 25));
        this.e.setTitle(this.T0);
        e3Var2 = this.N0;
        if (e3Var2 != null) {
        }
    }

    public final void n2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        di.d dVar = this.k0;
        if (!z10) {
            dVar.g(p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.c1, true);
            dVar.f(null, !this.c1);
        } else {
            dVar.g(p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.b).d()), true), !this.c1, true);
            dVar.f(p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.c1);
        }
    }

    public final void o2() {
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        TLRPC.Peer peer = L1.owner_id;
        if (peer == null) {
            peer = L1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L1.title);
        sb2.append(" #");
        this.A0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.g0.h(L1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.V0 == null) {
                this.V0 = new br(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.V0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        di.d dVar = this.k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new t0(this, 21));
        this.f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        s2(2, false, null);
        this.y0 = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        o3 o3Var;
        s2 s2Var;
        if (this.Z0.c(4) && (o3Var = this.f0) != null && (s2Var = o3Var.L) != null) {
            if (s2Var.h0) {
                return;
            }
            if (s2Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.y0 || this.Z0.b <= 0 || this.k0.N || this.h1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.F0;
        if (messageObject != null) {
            k2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                l2(savedStarGift, this.E0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
                if (tL_starGiftUnique != null) {
                    j2(this.G0, tL_starGiftUnique, this.E0);
                }
            }
        }
        s2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onSwipeStarts() {
        di.d4 d4Var = this.p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.p1 = null;
        }
    }

    public final void p2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique L1 = L1();
        TL_stars.InputSavedStarGift F1 = F1();
        if (F1 == null || L1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = F1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject q6 = fi.k3.q(this.resourcesProvider, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new bi.f3(this, charSequence, L1, tL_inputInvoiceStarGiftDropOriginalDetails, 16));
    }

    public final void q1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        e3 e3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        r3 r3Var;
        yw0 yw0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        }
        if (!this.O0 && ((e3Var = this.N0) == null || !e3Var.o)) {
            boolean[] zArr = new boolean[1];
            bd[] bdVarArr = new bd[1];
            Integer[] numArr = new Integer[1];
            String K1 = K1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                yw0Var = new yw0(this, zArr, starGiftAttribute2, bdVarArr, 28);
                r3Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                r3Var = this;
                yw0Var = null;
            }
            bdVarArr[0] = (bd) ((l01) r3Var.i0.e(string, starGiftAttribute2.name, K1, yw0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        j3 j3Var = new j3(getContext(), this.resourcesProvider, new w0(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        o01 o01Var = this.i0;
        tableRow.addView(new n01(o01Var, string), layoutParams);
        tableRow.addView(new l01(o01Var, j3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        o01Var.addView(tableRow);
        e3 e3Var2 = this.N0;
        if (e3Var2 != null) {
            if (c10 == 0) {
                e3Var2.d = j3Var;
            }
            if (c10 == 1) {
                e3Var2.c = j3Var;
            }
            if (c10 == 2) {
                e3Var2.b = j3Var;
            }
        }
    }

    public final void q2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        di.d4 d4Var = this.p1;
        if ((d4Var != null && d4Var.V && this.q1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.h5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            cd[] cdVarArr = (cd[]) spanned.getSpans(0, spanned.length(), cd.class);
            if (cdVarArr == null || cdVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(cdVarArr[cdVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            primaryHorizontal = (h5Var.getRightDrawableWidth() / 2.0f) + h5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        org.telegram.ui.x5 x5Var = this.Y;
        x5Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        di.d4 d4Var2 = this.p1;
        if (d4Var2 != null) {
            d4Var2.e(true);
            this.p1 = null;
        }
        di.d4 d4Var3 = new di.d4(getContext(), 3);
        d4Var3.p(!z10);
        d4Var3.s(charSequence);
        d4Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        d4Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        d4Var3.d = 3000L;
        d4Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        d4Var3.l0 = new di.b4(d4Var3, 2);
        d4Var3.u();
        x5Var.addView(d4Var3, w7.z5.d(100.0f, -1));
        this.p1 = d4Var3;
        this.q1 = view;
    }

    public final void r2(int i10, Context context, boolean z10) {
        LinearLayout e = sk.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        e.addView(frameLayout, w7.z5.t(64, 64, 49, 0, 6, 0, 0));
        bk0 bk0Var = new bk0(context);
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(bk0Var, w7.z5.q(64, 64, 17));
        bk0Var.d();
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.G6, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        e.addView(b10, w7.z5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.F6, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        e.addView(b11, w7.z5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(e);
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void s1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            n5.y(this.currentAccount, false).Q(B1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            n5.y(this.currentAccount, false).Q(B1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.O0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.D0;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i11 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i11 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                l2(savedStarGift2, this.E0);
                this.i1 = null;
                this.O0 = false;
                g5 g5Var = this.E0;
                if (g5Var != null) {
                    g5Var.d();
                } else {
                    n5.y(this.currentAccount, false).Q(this.X);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.E0 == null) {
            n5.y(this.currentAccount, false).Q(B1());
        }
        this.O0 = true;
        this.D0 = null;
        this.C0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        k2(messageObject, this.E0);
        this.i1 = null;
        this.O0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s2(int i10, boolean z10, zr0 zr0Var) {
        int i11;
        di.d4 d4Var;
        e3 e3Var;
        ValueAnimator valueAnimator = this.a1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a1 = null;
        }
        o3 o3Var = this.f0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(o3Var.i0);
        }
        if (!this.c1) {
            this.Y0 = Float.valueOf(this.Y.d());
        }
        f4.d dVar = this.Z0;
        this.Z0 = new f4.d(dVar == null ? 0 : dVar.b, i10);
        hg.m0 m0Var = this.R0;
        int finalHeight = o3Var.getFinalHeight();
        int A1 = A1();
        if (this.Z0.d(1)) {
            FrameLayout frameLayout = this.n0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                m0Var.F(finalHeight, A1 + i11);
                if (this.Z0.b == 0 && (e3Var = this.N0) != null) {
                    e3Var.c();
                }
                d2 d2Var = this.B0;
                int i12 = 2;
                d2 d2Var2 = this.z0;
                d2 d2Var3 = this.s0;
                d2 d2Var4 = this.g0;
                if (z10) {
                    this.Z0.c = 1.0f;
                    U1();
                    d2Var4.setVisibility(i10 == 0 ? 0 : 8);
                    d2Var3.setVisibility(i10 == 1 ? 0 : 8);
                    d2Var2.setVisibility(i10 == 2 ? 0 : 8);
                    d2Var.setVisibility(i10 != 3 ? 8 : 0);
                    u2();
                    if (zr0Var != null) {
                        zr0Var.run();
                    }
                } else {
                    d2Var4.setVisibility(this.Z0.b(0) ? 0 : 8);
                    d2Var3.setVisibility(this.Z0.b(1) ? 0 : 8);
                    d2Var2.setVisibility(this.Z0.b(2) ? 0 : 8);
                    d2Var.setVisibility(this.Z0.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.a1 = ofFloat;
                    ofFloat.addUpdateListener(new ki.a(this, 21));
                    this.a1.addListener(new gi(this, i10, zr0Var, i12));
                    this.a1.setInterpolator(es.h);
                    this.a1.setDuration(320L);
                    this.a1.start();
                    f4.d dVar2 = this.Z0;
                    z9[] z9VarArr = o3Var.d;
                    int i13 = dVar2.a;
                    int i14 = dVar2.b;
                    if (i13 != i14) {
                        yj0 lottieAnimation = z9VarArr[i13].getImageReceiver().getLottieAnimation();
                        yj0 lottieAnimation2 = z9VarArr[i14].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                    }
                }
                d4Var = this.p1;
                if (d4Var == null) {
                    d4Var.e(true);
                    this.p1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        m0Var.F(finalHeight, A1 + i11);
        if (this.Z0.b == 0) {
            e3Var.c();
        }
        d2 d2Var5 = this.B0;
        int i122 = 2;
        d2 d2Var22 = this.z0;
        d2 d2Var32 = this.s0;
        d2 d2Var42 = this.g0;
        if (z10) {
        }
        d4Var = this.p1;
        if (d4Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.G0 != null && this.H0 == null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
            a2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.G0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new kj1(9, this, a2Var));
        } else if (this.D0 == null && (messageObject = this.F0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
                        a2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new bi.e5(this, tL_messageActionStarGift, a2Var2, 23));
                        return;
                    }
                    if (F1() != null) {
                        org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
                        a2Var3.q(500L);
                        n5.y(this.currentAccount, false).M(F1(), new org.telegram.ui.Wallet.z6(13, this, a2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        TLRPC.Peer peer;
        if (F1() == null) {
            return false;
        }
        MessageObject messageObject = this.F0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.F0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.F0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && P1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.F0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.X;
                if (P1(i10, j10)) {
                    int i11 = this.D0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void t2(boolean z10) {
        boolean z11;
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean Q1 = Q1(this.currentAccount, L1());
        boolean z12 = !Q1;
        boolean Q12 = Q1(this.currentAccount, L1());
        di.d dVar = this.k0;
        if (Q12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(B1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long B1 = B1();
            if (B1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    sc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new a1(this, 24)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(B1, new pu(this, messagesController, B1, 3));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = L1.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(B1(), tL_inputEmojiStatusCollectible, L1);
        }
        this.f0.I[1].a(!Q1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!Q1 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.y0) {
            dismiss();
            return;
        }
        zr0 zr0Var = new zr0(19, this, z11);
        if (this.Z0.c(0)) {
            zr0Var.run();
        } else {
            s2(0, true, zr0Var);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.c1, true);
        dVar.f(null, !this.c1);
        dVar.setOnClickListener(new t0(this, 0));
    }

    public final boolean u1() {
        int i10;
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null || L1.crafted || !P1(this.currentAccount, DialogObject.getPeerDialogId(L1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.F0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i10 > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i10;
    }

    public final void u2() {
        FrameLayout frameLayout = this.n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.p0;
        FrameLayout frameLayout3 = this.l0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.Z0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.Z0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.Z0.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void v1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 != null && !TextUtils.isEmpty(L1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new v1(this, L1, 1));
        }
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void v2() {
        boolean M1 = M1(false);
        c2 c2Var = this.Z;
        c2Var.setPosition(M1 ? 1 : 0);
        c2Var.C(false);
        if (this.E0 == null || M1(true) || this.E0.e() >= this.E0.c()) {
            return;
        }
        this.E0.a();
    }

    public final void w1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift F1 = F1();
        if (F1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.F0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            peerDialogId = this.X;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = F1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new org.telegram.messenger.f8(this, callback, j10, peerDialogId, 4));
            return;
        }
        final long j12 = peerDialogId;
        n5 y3 = n5.y(this.currentAccount, false);
        if (!y3.e) {
            y3.r(new bi.b8(this, y3, j10, callback, 20));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = F1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject q6 = fi.k3.q(this.resourcesProvider, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: zh.g1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final r3 r3Var = r3.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3.H0(r3.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        hg.m0 m0Var = new hg.m0(this, 6);
        this.R0 = m0Var;
        return m0Var;
    }

    public final void x1() {
        TL_stars.InputSavedStarGift F1;
        long j10;
        di.d dVar = this.k0;
        if (dVar.N || (F1 = F1()) == null) {
            return;
        }
        MessageObject messageObject = this.F0;
        String str = null;
        long j11 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.m1 != null) {
            dVar.setLoading(true);
            aq aqVar = this.w0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = aqVar.a.q;
                upgradestargift.stargift = F1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new kj1(8, this, F1));
                return;
            }
            int i10 = 0;
            n5 y3 = n5.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new m(2, this, y3));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.m1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = aqVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = F1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.m1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new o80(this, str, F1, j11, 3));
        }
    }

    @Override // org.telegram.ui.Components.db
    public final int z() {
        return AndroidUtilities.dp(12.0f);
    }
}
