package zh;

import android.animation.ValueAnimator;
import android.app.Dialog;
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
import di.ic;
import di.kc;
import di.pc;
import java.io.Serializable;
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
import org.telegram.messenger.ja;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.cj1;
import org.telegram.ui.co;
import org.telegram.ui.dp0;
import org.telegram.ui.es0;
import org.telegram.ui.gl0;
import org.telegram.ui.hw0;
import org.telegram.ui.io;
import org.telegram.ui.oj0;
import org.telegram.ui.qw;
import org.telegram.ui.ta;
import org.telegram.ui.uy;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class w3 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int q1 = 0;
    public final h2 A0;
    public boolean B0;
    public TL_stars.SavedStarGift C0;
    public k5 D0;
    public MessageObject E0;
    public String F0;
    public TL_stars.TL_starGiftUnique G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public j3 M0;
    public boolean N0;
    public j2 O0;
    public final int[] P0;
    public hg.n0 Q0;
    public int R0;
    public String S0;
    public yh.e4 T0;
    public nq U0;
    public boolean V0;
    public d2 W0;
    public final long X;
    public Float X0;
    public final org.telegram.ui.t5 Y;
    public f4.d Y0;
    public final g2 Z;
    public ValueAnimator Z0;
    public final r00 a0;
    public nq a1;
    public yh.l2 b0;
    public boolean b1;
    public yh.l2 c0;
    public View c1;
    public final i2 d0;
    public yh.b2 d1;
    public final t3 e0;
    public boolean e1;
    public final h2 f0;
    public Boolean f1;
    public final d90 g0;
    public boolean g1;
    public final oz0 h0;
    public ArrayList h1;
    public final d90 i0;
    public ArrayList i1;
    public final di.d j0;
    public ArrayList j1;
    public final FrameLayout k0;
    public boolean k1;
    public final d90 l0;
    public TLRPC.PaymentForm l1;
    public final FrameLayout m0;
    public final nq[] m1;
    public final View n0;
    public final b1 n1;
    public final FrameLayout o0;
    public di.f4 o1;
    public v3 p0;
    public View p1;
    public boolean q0;
    public final h2 r0;
    public final fi.l[] s0;
    public final View t0;
    public final LinearLayout u0;
    public final mp v0;
    public final TextView w0;
    public boolean x0;
    public final h2 y0;
    public final TextView z0;

    public w3(Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, null, false, false, f6Var);
        this.q0 = false;
        this.P0 = new int[2];
        this.R0 = -1;
        this.S0 = "";
        this.Y0 = new f4.d(0, 0);
        this.b1 = true;
        this.m1 = new nq[1];
        this.n1 = new b1(this, 7);
        this.currentAccount = i10;
        this.X = j3;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new sg.l1(this, context, 2);
        org.telegram.ui.t5 t5Var = new org.telegram.ui.t5(this, context);
        this.Y = t5Var;
        g2 g2Var = new g2(this, context);
        this.Z = g2Var;
        g2Var.setAdapter(new hw0(this, context, 5));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.x5.e(-1, 50, 80));
        this.containerView.addView(g2Var, w7.x5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        t5Var.addView(this.d, w7.x5.e(-1, -1, 119));
        h2 h2Var = new h2(this, context, 0);
        this.f0 = h2Var;
        h2Var.setOrientation(1);
        h2Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        t5Var.addView(h2Var, w7.x5.e(-1, -1, 55));
        d90 d90Var = new d90(context, f6Var);
        this.g0 = d90Var;
        int i12 = org.telegram.ui.ActionBar.j6.q5;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var.setTextSize(1, 12.0f);
        d90Var.setGravity(17);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setDisablePaddingsOffsetY(true);
        h2Var.addView(d90Var, w7.x5.t(-2, -2, 1, 4, -2, 4, 16));
        d90Var.setVisibility(8);
        oz0 oz0Var = new oz0(context, f6Var);
        this.h0 = oz0Var;
        h2Var.addView(oz0Var, w7.x5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        d90 d90Var2 = new d90(context, f6Var);
        this.i0 = d90Var2;
        d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var2.setTextSize(1, 12.0f);
        d90Var2.setGravity(17);
        d90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        d90Var2.setDisablePaddingsOffsetY(true);
        d90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        h2Var.addView(d90Var2, w7.x5.t(-2, -2, 1, 4, 2, 4, 8));
        d90Var2.setVisibility(8);
        h2 h2Var2 = new h2(this, context, 1);
        this.r0 = h2Var2;
        h2Var2.setOrientation(1);
        h2Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        t5Var.addView(h2Var2, w7.x5.e(-1, -1, 55));
        fi.l[] lVarArr = {r9, r0, r0};
        this.s0 = lVarArr;
        fi.l lVar = new fi.l(context, f6Var, false);
        lVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        h2Var2.addView(lVarArr[0], w7.x5.n(-1, -2));
        fi.l lVar2 = new fi.l(context, f6Var, false);
        lVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        h2Var2.addView(lVarArr[1], w7.x5.n(-1, -2));
        fi.l lVar3 = new fi.l(context, f6Var, false);
        lVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        h2Var2.addView(lVarArr[2], w7.x5.n(-1, -2));
        View view3 = new View(context);
        this.t0 = view3;
        int i14 = org.telegram.ui.ActionBar.j6.d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        h2Var2.addView(view3, w7.x5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.u0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 6));
        mp mpVar = new mp(context, 24, f6Var);
        this.v0 = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.w0 = textView;
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
        h2Var2.addView(linearLayout, w7.x5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.z5.b(linearLayout, 0.025f, 1.5f);
        h2 h2Var3 = new h2(this, context, 2);
        this.y0 = h2Var3;
        h2Var3.setOrientation(1);
        h2Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        t5Var.addView(h2Var3, w7.x5.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.z0 = textView2;
        wl.n(i15, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        h2Var3.addView(textView2, w7.x5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        wl.n(i15, f6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        h2Var3.addView(textView3, w7.x5.t(-1, -2, 7, 20, 6, 20, 24));
        fi.l lVar4 = new fi.l(context, f6Var, false);
        lVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        h2Var3.addView(r7[0], w7.x5.n(-1, -2));
        fi.l lVar5 = new fi.l(context, f6Var, false);
        lVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        h2Var3.addView(r7[1], w7.x5.n(-1, -2));
        fi.l lVar6 = new fi.l(context, f6Var, false);
        fi.l[] lVarArr2 = {lVar4, lVar5, lVar6};
        lVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        h2Var3.addView(lVarArr2[2], w7.x5.n(-1, -2));
        h2 h2Var4 = new h2(this, context, 3);
        this.A0 = h2Var4;
        h2Var4.setOrientation(1);
        h2Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        t5Var.addView(h2Var4, w7.x5.e(-1, -1, 55));
        fi.l lVar7 = new fi.l(context, f6Var, false);
        lVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        h2Var4.addView(r9[0], w7.x5.n(-1, -2));
        fi.l lVar8 = new fi.l(context, f6Var, false);
        lVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        h2Var4.addView(r9[1], w7.x5.n(-1, -2));
        fi.l lVar9 = new fi.l(context, f6Var, false);
        fi.l[] lVarArr3 = {lVar7, lVar8, lVar9};
        lVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        h2Var4.addView(lVarArr3[2], w7.x5.n(-1, -2));
        h2Var.setAlpha(1.0f);
        h2Var2.setAlpha(0.0f);
        h2Var3.setAlpha(0.0f);
        h2Var4.setAlpha(0.0f);
        t3 t3Var = new t3(context, f6Var, new b1(this, 9), new u0(this, 13), new u0(this, 14), new u0(this, 15), new u0(this, 16), new u0(this, 17), new u0(this, 18), new u0(this, 19));
        this.e0 = t3Var;
        t3Var.L.c.setOnClickListener(new u0(this, 20));
        int i16 = this.backgroundPaddingLeft;
        t3Var.setPadding(i16, 0, i16, 0);
        t5Var.addView(t3Var, w7.x5.e(-1, -2, 55));
        hg.b0 b0Var = this.c;
        this.P = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.n0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        di.d g10 = wl.g(24, context, f6Var, true);
        this.j0 = g10;
        g10.g(LocaleController.getString(R.string.OK), false, true);
        g10.f(null, false);
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(g10, d);
        t5Var.addView(frameLayout, w7.x5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.m0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        d90 d90Var3 = new d90(context, null);
        this.l0 = d90Var3;
        d90Var3.setTextSize(1, 12.0f);
        d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        d90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        d90Var3.setGravity(17);
        frameLayout2.addView(d90Var3, w7.x5.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        t5Var.addView(frameLayout2, w7.x5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new lb0(this, 20));
        linearLayout.setOnClickListener(new u0(this, 12));
        r00 r00Var = new r00(context);
        this.a0 = r00Var;
        t5Var.addView(r00Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.o0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        t5Var.addView(frameLayout3, w7.x5.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        t5Var.addView(this.e, w7.x5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        i2 i2Var = new i2(context);
        this.d0 = i2Var;
        t5Var.addView(i2Var, w7.x5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.b1(i2Var, 23), 12.0f, 12, null, arrayList);
    }

    public static void A0(w3 w3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        i5 F;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && w3Var.C0 != null && (F = s5.y(w3Var.currentAccount, false).F(w3Var.X, false)) != null) {
                    F.m(w3Var.C0, !savestargift.unsave);
                }
                w3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        w3Var.dismiss();
        long A1 = w3Var.A1();
        if (!z10) {
            s5.y(w3Var.currentAccount, false).Q(A1);
        }
        if (A1 >= 0) {
            yc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new ah.l1(A1, U))).k(true);
        } else {
            yc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public static void B0(w3 w3Var, long j3) {
        new yh.p1(w3Var.getContext(), w3Var.currentAccount, j3, null, new w1(w3Var, 2)).show();
    }

    public static void C0(w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        eVar.c(false);
        b2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new k7(w3Var.getContext(), w3Var.resourcesProvider, j3, 16, null, new ug.r(23, w3Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    w3Var.getBulletinFactory().d0(tL_error, false);
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
        TL_stars.SavedStarGift savedStarGift = w3Var.C0;
        w3Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new ug.r(21, w3Var, tL_starGiftUnique));
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return i2.g.k(r3.num, ',', sb2);
    }

    public static void E0(w3 w3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, ug.n1[] n1VarArr, Long l4) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l4.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                i2.g.B(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(w3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new z2(w3Var.getContext(), tL_starGiftUnique), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(w3Var.getContext());
            int i13 = org.telegram.ui.ActionBar.j6.j5;
            wl.x(i13, w3Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(w3Var.getContext());
            wl.n(i13, w3Var.resourcesProvider, textView2, 1, 16.0f);
            wl.p(R.string.Gift2ExportTONFragmentText, new Object[]{w3Var.C1()}, textView2);
            linearLayout.addView(textView2, w7.x5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new sg.x(16, w3Var, n1VarArr));
            i2.g.r(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        int i14 = 7;
        wh.n nVar = new wh.n(w3Var, l4, n1VarArr, i14);
        if (l4.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(w3Var.currentAccount).getChatFull(-l4.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(w3Var.currentAccount).getInputChannel(-l4.longValue());
                ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(tL_channels_getFullChannel, new cj1(i14, w3Var, nVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.a;
                b2Var2.R = string2;
                b2Var2.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                i2.g.B(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l4.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(w3Var.currentAccount).getUser(l4);
            TLRPC.UserFull userFull = MessagesController.getInstance(w3Var.currentAccount).getUserFull(l4.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new yc(n1VarArr[0].container, w3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(w3Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(tL_users_getFullUser, new bi.c3(w3Var, n1VarArr, l4, nVar, 17));
                return;
            }
        }
        nVar.run();
    }

    public static void G0(w3 w3Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            qc Y = w3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(w3Var.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j11 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j11 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new f1(w3Var, j3, j10, callback, j11));
    }

    public static void H0(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j3, long j10, final long j11, TLRPC.TL_error tL_error) {
        b2Var.c(400L);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        final int i10 = 1;
        final int i11 = 0;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                w3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                w3Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        w3Var.dismiss();
        s5.y(w3Var.currentAccount, false).Q(j3);
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            bundle.putBoolean("start_from_monetization", true);
            final bb1 bb1Var = new bb1(bundle);
            o.g(w3Var.currentAccount).h(j3, true);
            o.g(w3Var.currentAccount).l(j3);
            bb1Var.whenFullyVisible(new Runnable() { // from class: zh.s1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            yc.a0((v7) bb1Var).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j11), R.raw.stars_topup).k(true);
                            break;
                        default:
                            yc.a0((bb1) bb1Var).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j11), R.raw.stars_topup).k(true);
                            break;
                    }
                }
            });
            U.presentFragment(bb1Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(w3Var.currentAccount).getUserFull(j10);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        s5.y(w3Var.currentAccount, false).P();
        s5.y(w3Var.currentAccount, false).T(true);
        if (U instanceof v7) {
            yc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j11), R.raw.stars_topup).k(true);
            return;
        }
        final v7 v7Var = new v7();
        v7Var.whenFullyVisible(new Runnable() { // from class: zh.s1
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        yc.a0((v7) v7Var).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j11), R.raw.stars_topup).k(true);
                        break;
                    default:
                        yc.a0((bb1) v7Var).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j11), R.raw.stars_topup).k(true);
                        break;
                }
            }
        });
        U.presentFragment(v7Var);
    }

    public static void I0(w3 w3Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        w3Var.G0 = tL_starGiftUnique;
        w3Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static /* synthetic */ void J0(final long j3, final long j10, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error, final w3 w3Var) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(w3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.n1
            @Override // java.lang.Runnable
            public final void run() {
                w3.S(j3, j10, callback, tLObject, tL_error, w3Var);
            }
        });
    }

    public static String J1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
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
        return i10 <= 0 ? "<0.1%" : fi.m.G0(i10);
    }

    public static void L0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence, org.telegram.ui.ActionBar.b2 b2Var) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new qw(w3Var, g10, b2Var, tL_starGiftUnique, j3, charSequence));
    }

    public static /* synthetic */ void M0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(w3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(w3Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(w3Var, tL_error, runnable, 1));
        }
    }

    public static void N0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.b2 b2Var) {
        w3Var.getClass();
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = w3Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(updatestargiftprice, new bi.c5(w3Var, g10, tL_starGiftUnique, 22));
    }

    public static boolean N1(int i10, long j3) {
        return j3 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j3 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public static /* synthetic */ void O0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = w3Var.E1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(updatestargiftprice, new a1(w3Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j3) {
        if (j3 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j3;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        return chat != null && chat.creator;
    }

    public static void P(w3 w3Var, long j3) {
        new yh.p1(w3Var.getContext(), w3Var.currentAccount, j3, null, new w1(w3Var, 2)).show();
    }

    public static void P0(w3 w3Var, long j3) {
        new yh.p1(w3Var.getContext(), w3Var.currentAccount, j3, null, new w1(w3Var, 2)).show();
    }

    public static boolean P1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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

    public static /* synthetic */ void R(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, yh.j0 j0Var, a3 a3Var, of.e eVar) {
        eVar.d();
        s5.x(w3Var.currentAccount, a3Var.a).h(a3Var.b, tL_starGiftUnique, j3, tL_textWithEntities, z10, new dp0(w3Var, eVar, tL_starGiftUnique, j3, j0Var, 1));
    }

    public static void R0(w3 w3Var, TLObject tLObject, wh.n nVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            qc Y = w3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(w3Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(w3Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(w3Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            nVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        i2.g.B(R.string.OK, alertDialog$Builder, null);
    }

    public static void S(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, w3 w3Var) {
        long j11;
        w3 w3Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            j11 = j3;
            w3Var2 = w3Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j11 = j3;
            w3Var2 = w3Var;
            yc.a0(U).d0(tL_error, false);
        } else if (j3 < 0 || j10 < 0) {
            j11 = j3;
            w3Var2 = w3Var;
            qc M = yc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var2.C1(), DialogObject.getShortName(j11))), R.raw.forward);
            M.t = true;
            M.j();
        } else {
            co R9 = co.R9(j3);
            j11 = j3;
            w3Var2 = w3Var;
            R9.whenFullyVisible(new r1(w3Var2, R9, j11, 0));
            U.presentFragment(R9);
        }
        s5.y(w3Var2.currentAccount, false).Q(j11);
        s5.y(w3Var2.currentAccount, false).Q(j10);
    }

    public static void S0(w3 w3Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        w3Var.e1 = true;
        w3Var.i2(messageObject, null);
        w3Var.q2(0, true, null);
        r00 r00Var = w3Var.a0;
        if (r00Var != null) {
            r00Var.c(true);
        }
        s5.y(w3Var.currentAccount, false).P();
        j5 G = s5.y(w3Var.currentAccount, false).G(UserConfig.getInstance(w3Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, MessageObject messageObject) {
        b2Var.dismiss();
        w3Var.J0 = true;
        w3Var.i2(messageObject, null);
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
    public static void T0(w3 w3Var, View view) {
        boolean z10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean O1;
        TLRPC.Message message;
        String F1 = w3Var.F1();
        TL_stars.TL_starGiftUnique K1 = w3Var.K1();
        n70 F = n70.F(w3Var.Y, w3Var.resourcesProvider, view);
        boolean z11 = (w3Var.K1() == null || !O1(w3Var.currentAccount, DialogObject.getPeerDialogId(w3Var.K1().owner_id)) || !(w3Var.D0 instanceof j5) || w3Var.C0 == null || w3Var.E1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = w3Var.C0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new b1(w3Var, 10), z11);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new b1(w3Var, 11), w3Var.t1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new b1(w3Var, 12), (w3Var.K1() == null || !O1(w3Var.currentAccount, DialogObject.getPeerDialogId(w3Var.K1().owner_id)) || w3Var.K1().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new u1(w3Var, F1, 7), F1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new b1(w3Var, 13), F1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new b1(w3Var, 14), K1 != null && K1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique K12 = w3Var.K1();
        if (K12 != null && K12.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(K12.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(K12.host_id);
            if ((peerDialogId > 0 && O1(w3Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && O1(w3Var.currentAccount, peerDialogId2))) {
                z10 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new b1(w3Var, 15), z10);
                if (w3Var.E1() != null) {
                    MessageObject messageObject = w3Var.E0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    O1 = O1(w3Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                    F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b1(w3Var, 16), O1);
                                    F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b1(w3Var, 17), (w3Var.C0 == null || w3Var.A1() == 0) ? false : true);
                                    F.t = false;
                                    F.Y = true;
                                    F.s = 0;
                                    F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                                    F.Z();
                                }
                            }
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift2 = w3Var.C0;
                    if (savedStarGift2 != null) {
                        TL_stars.StarGift starGift2 = savedStarGift2.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            O1 = O1(w3Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                            F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b1(w3Var, 16), O1);
                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b1(w3Var, 17), (w3Var.C0 == null || w3Var.A1() == 0) ? false : true);
                            F.t = false;
                            F.Y = true;
                            F.s = 0;
                            F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                            F.Z();
                        }
                    }
                    tL_starGiftUnique = w3Var.G0;
                }
                O1 = false;
                F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b1(w3Var, 16), O1);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b1(w3Var, 17), (w3Var.C0 == null || w3Var.A1() == 0) ? false : true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z10 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new b1(w3Var, 15), z10);
        if (w3Var.E1() != null) {
        }
        O1 = false;
        F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b1(w3Var, 16), O1);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b1(w3Var, 17), (w3Var.C0 == null || w3Var.A1() == 0) ? false : true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(0.0f, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static /* synthetic */ void U(w3 w3Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(w3Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new wh.n(w3Var, tLObject, messageObject, 8));
        }
    }

    public static void U0(w3 w3Var, Long l4) {
        TLRPC.Chat chat;
        String str = (l4.longValue() >= 0 || (chat = MessagesController.getInstance(w3Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
        qc Q = w3Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        Q.t = true;
        Q.j();
    }

    public static void V(final w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j3 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = w3Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: zh.g1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final w3 w3Var2 = w3.this;
                final org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j10 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        w3.Z0(w3.this, b2Var2, tLObject, document2, str4, str5, str6, j10, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void V0(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(w3Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new ug.r(24, w3Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new ug.r(25, b2Var, tL_error));
    }

    public static void W(w3 w3Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        i5 F;
        TLRPC.Message message;
        di.d dVar = w3Var.j0;
        if (dVar.N) {
            return;
        }
        TL_stars.InputSavedStarGift E1 = w3Var.E1();
        MessageObject messageObject = w3Var.E0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = w3Var.C0;
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
        savestargift.stargift = E1;
        if (w3Var.C0 == null || (F = s5.y(w3Var.currentAccount, false).F(w3Var.X, false)) == null) {
            z11 = false;
        } else {
            F.m(w3Var.C0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(savestargift, new xh.f(w3Var, z11, document2, z12, savestargift));
    }

    public static void W0(w3 w3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        if (w3Var.getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                of.f.u(w3Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(new TL_account.getPassword(), new t1(w3Var, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            yc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(w3Var.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(w3Var.getContext());
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(w3Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(w3Var.getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(w3Var.getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.w1.n(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
            linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.x5.n(-2, -2));
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(w3Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(w3Var.getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(w3Var.getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.w1.n(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.x5.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.x5.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.x5.n(-2, -2));
            linearLayout3.addView(textView3, w7.x5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new z9.a(w3Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(w3Var.getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static boolean X(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, uy uyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(w3Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j3) {
            org.telegram.ui.Components.e5.n0(w3Var.getContext(), w3Var.resourcesProvider, w3Var.currentAccount, tL_starGiftUnique, giftThemeUser, new i21(w3Var, j3, tL_starGiftUnique, uyVar, 7));
            return true;
        }
        ChatThemeController.getInstance(w3Var.currentAccount).setDialogTheme(j3, new gg.b(null, tL_starGiftUnique.slug));
        uyVar.presentFragment(co.R9(j3), true);
        return true;
    }

    public static void Y(final w3 w3Var) {
        int i10;
        long peerDialogId;
        long j3;
        long j10;
        final long clientUserId = UserConfig.getInstance(w3Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = w3Var.E1();
        if (E1 == null) {
            return;
        }
        MessageObject messageObject = w3Var.E0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = w3Var.E0;
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
            j10 = peer != null ? DialogObject.getPeerDialogId(peer) : isOutOwner ? messageObject2.getDialogId() : clientUserId;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : w3Var.E0.getDialogId();
            j3 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = w3Var.C0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j3 = w3Var.C0.convert_stars;
            j10 = w3Var.X;
        }
        int max = Math.max(1, (MessagesController.getInstance(w3Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(w3Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j3)));
        final long j11 = j3;
        final long j12 = j10;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.a2() { // from class: zh.a2
            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                w3.l0(w3.this, E1, j12, clientUserId, j11);
            }
        });
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void Y0(w3 w3Var, String str, long j3) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        yh.g4 g4Var = new yh.g4(w3Var.X, str, j3, w3Var.resourcesProvider);
        g4Var.e = new w1(w3Var, 0);
        R.showAsSheet(g4Var, l2Var);
    }

    public static /* synthetic */ void Z(w3 w3Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, ad[] adVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = w3Var.B1();
        GiftAuctionController.getInstance(w3Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new ta(w3Var, B1, starGiftAttribute, adVarArr, zArr, 5));
    }

    public static void Z0(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j3, TLRPC.TL_error tL_error) {
        oz0 oz0Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                w3Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        org.telegram.ui.ActionBar.f3 i10 = wl.i(1, w3Var.getContext(), w3Var.resourcesProvider, false);
        LinearLayout linearLayout2 = new LinearLayout(w3Var.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        x9 x9Var = new x9(w3Var.getContext());
        v7.Z0(x9Var.getImageReceiver(), document, 160);
        linearLayout2.addView(x9Var, w7.x5.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(w3Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, w3Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, w3Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout2.addView(textView, w7.x5.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(w3Var.getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, w3Var.resourcesProvider));
        textView2.setGravity(17);
        linearLayout2.addView(textView2, w7.x5.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            wl.p(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            wl.p(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            wl.p(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(w3Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        org.telegram.tgnet.e eVar = new org.telegram.tgnet.e(w3Var, new di.f4[1], frameLayout, 8);
        oz0 oz0Var2 = new oz0(w3Var.getContext(), w3Var.resourcesProvider);
        frameLayout.addView(oz0Var2, w7.x5.e(-1, -1, 119));
        oz0Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        oz0Var2.c(string, v7.X0(false, a4.a.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            oz0Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                oz0Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
            } else {
                oz0Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            q1 q1Var = new q1(eVar, new ad[]{(ad) ((lz0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            oz0Var = oz0Var2;
            TableRow e7 = oz0Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", q1Var, null);
            e7.setOnClickListener(new ji.m4(q1Var, 23));
        } else {
            oz0Var = oz0Var2;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            q1 q1Var2 = new q1(eVar, new ad[]{(ad) ((lz0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e10 = oz0Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", q1Var2, null);
            e10.setOnClickListener(new ji.m4(q1Var2, 24));
        }
        linearLayout2.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            di.d dVar = new di.d(w3Var.getContext(), w3Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            f7 = 1.0f;
            f10 = 2.0f;
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            charSequence = " ";
            linearLayout = linearLayout2;
            dVar.setOnClickListener(new io(w3Var, str2, j3, 6));
            linearLayout.addView(dVar, w7.x5.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            linearLayout = linearLayout2;
            charSequence = " ";
            f7 = 1.0f;
            f10 = 2.0f;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            di.d dVar2 = new di.d(w3Var.getContext(), w3Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.z5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append(charSequence);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
            dVar2.setOnClickListener(new w(4, w3Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, w7.x5.t(-1, 42, 7, 0, 0, 0, 0));
        }
        i10.customView = linearLayout;
        i10.show();
    }

    public static void a0(w3 w3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        w3Var.k1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            qc Y = w3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(paymentForm.users, false);
            w3Var.l1 = paymentForm;
            w3Var.b2();
        }
    }

    public static void a1(final w3 w3Var, final yh.j0 j0Var, zf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        w3Var.j0.setLoading(false);
        if (j0Var != null && j0Var.L) {
            j0Var.L = false;
            j0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new c3(w3Var.getContext(), w3Var.resourcesProvider, tL_starGiftUnique, new a3(bVar, tL_payments_paymentFormStarGift), w3Var.currentAccount, j3, w3Var.C1(), false, new Utilities.Callback2() { // from class: zh.p1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                w3.R(w3.this, tL_starGiftUnique, j3, tL_textWithEntities, z10, j0Var, (a3) obj, (of.e) obj2);
            }
        }).b();
    }

    public static void b0(w3 w3Var) {
        Bundle bundle = new Bundle();
        long j3 = w3Var.X;
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (j3 == UserConfig.getInstance(w3Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(w3 w3Var) {
        di.d dVar = w3Var.j0;
        if (UserConfig.getInstance(w3Var.currentAccount).isPremium() && (P1(w3Var.currentAccount, w3Var.K1()) || w3Var.V0)) {
            w3Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = w3Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        w3Var.z0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i2.g.k(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(w3Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (w3Var.U0 == null) {
                w3Var.U0 = new nq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(w3Var.U0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new u0(w3Var, 26));
        w3Var.e0.setWearPreview(MessagesController.getInstance(w3Var.currentAccount).getUserOrChat(peerDialogId));
        w3Var.q2(2, true, null);
    }

    public static void c0(w3 w3Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                    messageObject = new MessageObject(w3Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(w3Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new k1(w3Var, messageObject, arrayList, starGift, 0));
                return;
            }
            callback2.run(null, null);
            s5.y(w3Var.currentAccount, false).P();
            j5 G = s5.y(w3Var.currentAccount, false).G(UserConfig.getInstance(w3Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, new bi.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    w3Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(w3Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, new bi.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string2;
                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            i2.g.B(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(w3 w3Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                w3Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j3 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j3 += tL_labeledPrice.amount;
        }
        LinearLayout linearLayout = new LinearLayout(w3Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView b10 = w7.b6.b(w3Var.getContext(), 16.0f, org.telegram.ui.ActionBar.j6.j5, false, null);
        b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(b10, w7.x5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        oz0 oz0Var = new oz0(w3Var.getContext(), w3Var.resourcesProvider);
        mz0 a2 = oz0Var.a(charSequence);
        a2.setFilled(true);
        wh.p pVar = (wh.p) a2.getChildAt(0);
        pVar.setTextSize(1, 12.0f);
        pVar.setGravity(17);
        linearLayout.addView(oz0Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w3Var.getContext(), 0, w3Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(v7.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j3))), new c21(w3Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j3, charSequence));
        alertDialog$Builder.o();
    }

    public static void d0(w3 w3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        w3Var.j0.setLoading(false);
        bi.l3 l3Var = new bi.l3(w3Var, 12);
        sg.k0 k0Var = new sg.k0(26, w3Var.currentAccount, w3Var.getContext(), l3Var, w3Var.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(tL_premium_boostsStatus, true);
        k0Var.H1(j3);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        if (chat != null) {
            k0Var.Q0 = new ug.d(w3Var, chat);
        }
        k0Var.show();
    }

    public static /* synthetic */ void d1(w3 w3Var, long j3) {
        k7 k7Var = new k7(w3Var.getContext(), w3Var.resourcesProvider, j3, 10, null, new ug.r(20, w3Var, new boolean[]{false}), 0L);
        k7Var.setOnDismissListener(new x1(w3Var, 0));
        k7Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        U.showAsSheet(n2Var, l2Var);
    }

    public static void e0(w3 w3Var, long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, uy uyVar) {
        ChatThemeController.getInstance(w3Var.currentAccount).setDialogTheme(j3, new gg.b(null, tL_starGiftUnique.slug));
        uyVar.presentFragment(co.R9(j3), true);
    }

    public static /* synthetic */ void e1(w3 w3Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(w3Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(w3Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new wh.n(w3Var, b2Var, messageObject, 12));
        } else {
            AndroidUtilities.runOnUIThread(new fi.e3(b2Var, 1));
        }
    }

    public static /* synthetic */ void f0(w3 w3Var, long j3, long j10, Utilities.Callback callback) {
        k7 k7Var = new k7(w3Var.getContext(), w3Var.resourcesProvider, j3, 11, null, new i21(w3Var, new boolean[]{false}, j10, callback, 8), 0L);
        k7Var.setOnDismissListener(new x1(w3Var, 1));
        k7Var.show();
    }

    public static /* synthetic */ void f1(w3 w3Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(w3Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new k1(w3Var, tL_error, tLObject, inputSavedStarGift, 1));
    }

    public static void g0(w3 w3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                w3Var.getBulletinFactory().d0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(w3Var.currentAccount).starsPurchaseAvailable()) {
                    w3Var.j0.setLoading(false);
                    s5.e0(w3Var.getContext(), w3Var.resourcesProvider);
                    return;
                }
                s5 y3 = s5.y(w3Var.currentAccount, false);
                a3.g0 g0Var = new a3.g0(w3Var, j11, j3, callback, 14);
                y3.e = false;
                y3.q(false, true, g0Var);
                y3.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(w3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(w3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        s5.y(w3Var.currentAccount, false).T(false);
        s5.y(w3Var.currentAccount, false).Q(j3);
        s5.y(w3Var.currentAccount, false).Q(j10);
        s5.y(w3Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (j3 < 0 || j10 < 0) {
                qc M = yc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
            } else {
                co R9 = co.R9(j3);
                R9.whenFullyVisible(new r1(w3Var, R9, j3, 1));
                U.presentFragment(R9);
            }
        }
        Utilities.stageQueue.postRunnable(new v1(w3Var, tL_payments_paymentResult, i10));
    }

    public static void g1(final w3 w3Var) {
        TL_stars.SavedStarGift savedStarGift = w3Var.C0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            i5 F = s5.y(w3Var.currentAccount, false).F(w3Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = w3Var.C0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = w3Var.E1();
            savestargift.unsave = w3Var.C0.unsaved;
            ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = w3Var.C0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((j5) w3Var.D0).m(savedStarGift3, !z10, false)) {
            new yh.p2(w3Var.getContext(), w3Var.X, w3Var.C0, w3Var.resourcesProvider, new Utilities.Callback0Return() { // from class: zh.z0
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return w3.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            org.telegram.messenger.w1.o(R.string.Gift2Unpinned, w3Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            w3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new nq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new nq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (w3Var.T0 == null) {
            yh.e4 e4Var = new yh.e4(w3Var.currentAccount, tL_starGiftUnique.gift_id);
            w3Var.T0 = e4Var;
            e4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            v2[] v2VarArr = w3Var.e0.L.n;
            if (i10 >= v2VarArr.length) {
                yh.f4 f4Var = new yh.f4(w3Var.getContext(), tL_starGiftUnique.title, w3Var.T0);
                f4Var.g0.addAll(hashSet);
                f4Var.i0.N(true);
                f4Var.h0 = bool.booleanValue();
                f4Var.e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                f4Var.f0 = new w0(0, callback);
                f4Var.show();
                return;
            }
            TL_stars.StarGift starGift = v2VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void i0(w3 w3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(w3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            s5.y(w3Var.currentAccount, false).T(false);
            s5.y(w3Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = w3Var.C0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            w3Var.q0 = true;
            w3Var.l1 = null;
            w3Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new u1(w3Var, str, 0));
            Utilities.stageQueue.postRunnable(new v1(w3Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            w3Var.getBulletinFactory().d0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(w3Var.currentAccount).starsPurchaseAvailable()) {
            w3Var.j0.setLoading(false);
            s5.e0(w3Var.getContext(), w3Var.resourcesProvider);
            return;
        }
        s5 y3 = s5.y(w3Var.currentAccount, false);
        c1 c1Var = new c1(w3Var, j3, 3);
        y3.e = false;
        y3.q(false, true, c1Var);
        y3.e = true;
    }

    public static void i1(w3 w3Var, String str) {
        long j3 = w3Var.X;
        w3Var.j0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            w3Var.q2(0, true, null);
            return;
        }
        w3Var.dismiss();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof co) {
            co coVar = (co) R;
            if (coVar.a() == j3) {
                yc.a0(coVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j3))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(w3Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(w3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j3), bool);
        co R9 = co.R9(j3);
        R9.whenFullyVisible(new ug.r(22, w3Var, R9));
        R.presentFragment(R9);
    }

    public static /* synthetic */ void j0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable) {
        w3Var.getClass();
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = w3Var.E1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(updatestargiftprice, new a1(w3Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void j1(w3 w3Var, boolean z10) {
        int G1 = w3Var.G1();
        if (G1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = w3Var.R0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        k5 k5Var = w3Var.D0;
        Object obj = (k5Var == null || i10 < 0 || i10 >= k5Var.e()) ? null : w3Var.D0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? w3Var.c0 : w3Var.b0) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (x1((z10 ? w3Var.c0 : w3Var.b0).C0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (y1((z10 ? w3Var.c0 : w3Var.b0).G0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        yh.l2 l2Var = new yh.l2(w3Var, w3Var.getContext(), w3Var.currentAccount, w3Var.X, w3Var.resourcesProvider, w3Var.Y.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            l2Var.j2((TL_stars.SavedStarGift) obj, w3Var.D0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            l2Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, w3Var.D0);
        }
        AndroidUtilities.removeFromParent(l2Var.containerView);
        if (z10) {
            w3Var.c0 = l2Var;
        } else {
            w3Var.b0 = l2Var;
        }
    }

    public static void k0(w3 w3Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(w3Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(w3Var.currentAccount).putChats(messages_messages.chats, false);
        w3Var.J0 = true;
        w3Var.I0 = false;
        Boolean bool = w3Var.f1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        w3Var.i2(messageObject, null);
    }

    public static void k1(final w3 w3Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        ic b10 = view instanceof org.telegram.ui.Cells.f7 ? kc.b((org.telegram.ui.Cells.f7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = w3Var.E0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(w3Var.B1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(w3Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) w3Var.B1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(w3Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(w3Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(w3Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(w3Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final pc E = pc.E(launchActivity, w3Var.currentAccount);
        E.R = new Utilities.Callback4() { // from class: zh.v0
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                pc pcVar = E;
                ic icVar = null;
                if (booleanValue) {
                    w3 w3Var2 = w3.this;
                    AndroidUtilities.runOnUIThread(new ug.r(16, w3Var2, l4));
                    pcVar.Y(null);
                    d2 d2Var = w3Var2.W0;
                    if (d2Var != null) {
                        d2Var.dismiss();
                        w3Var2.W0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.f7) && view2.isAttachedToWindow()) {
                        icVar = kc.b((org.telegram.ui.Cells.f7) view2);
                    }
                    pcVar.Y(icVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, di.o8.y(arrayList));
    }

    public static void l0(w3 w3Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j3, long j10, long j11) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(convertstargift, new f1(w3Var, b2Var, j3, j10, j11));
    }

    public static void m0(w3 w3Var, long j3) {
        new yh.p1(w3Var.getContext(), w3Var.currentAccount, j3, null, new w1(w3Var, 2)).show();
    }

    public static void n0(w3 w3Var, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            b2Var.dismiss();
            w3Var.L0 = true;
            w3Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        b2Var.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            qc Q = yc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.t = true;
            Q.j();
        }
    }

    public static void o0(w3 w3Var) {
        TL_stars.TL_starGiftUnique K1 = w3Var.K1();
        new a0(w3Var.getContext(), w3Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, w3Var.resourcesProvider, new b1(w3Var, 2)).show();
    }

    public static /* synthetic */ void p0(w3 w3Var, String str) {
        w3Var.dismiss();
        of.f.s(w3Var.getContext(), "https://" + MessagesController.getInstance(w3Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void q0(w3 w3Var) {
        if (w3Var.l1 == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < w3Var.l1.invoice.prices.size(); i10++) {
            j3 += w3Var.l1.invoice.prices.get(i10).amount;
        }
        v3 v3Var = new v3(w3Var.getContext(), j3, w3Var.i1, w3Var.resourcesProvider);
        w3Var.p0 = v3Var;
        v3Var.show();
    }

    public static void q1(oz0 oz0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        oz0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static /* synthetic */ void r0(w3 w3Var, of.e eVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(w3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new wh.n(w3Var, eVar, tL_starGiftUnique, 9));
            return;
        }
        w3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new yh.o0(w3Var, eVar, Long.parseLong(tL_error.text.substring(26)), 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new wh.n(w3Var, eVar, tL_error, 10));
        }
    }

    public static /* synthetic */ void s0(w3 w3Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, ad[] adVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new s0(w3Var.getContext(), w3Var.resourcesProvider, w3Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            w3Var.o2(adVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, fi.m.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static /* synthetic */ void t0(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(w3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(w3Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        w3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new yh.o0(w3Var, Long.parseLong(tL_error.text.substring(26)), runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(w3Var, tL_error, runnable, 0));
        }
    }

    public static /* synthetic */ void v0(w3 w3Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        yh.e4 e4Var = w3Var.T0;
        if (e4Var != null) {
            e4Var.b();
            w3Var.T0 = null;
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
        ConnectionsManager.getInstance(w3Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new gl0(w3Var, callback2, arrayList, runnable, 2));
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
    public static void w0(w3 w3Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        nq[] nqVarArr = w3Var.m1;
        di.d dVar = w3Var.j0;
        int i11 = 1;
        if (w3Var.Y0.b == 1 && !w3Var.isDismissed()) {
            TL_stars.InputSavedStarGift E1 = w3Var.E1();
            MessageObject messageObject = w3Var.E0;
            long j3 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j10 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j10 <= 0) {
                }
                z10 = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = w3Var.C0;
                if (savedStarGift == null) {
                    return;
                }
                long j11 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j11 <= 0) {
                }
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(w3Var.currentAccount).getCurrentTime();
            if (w3Var.j1 != null) {
                i10 = 0;
                while (i10 < w3Var.j1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) w3Var.j1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (w3Var.l1 != null) {
                int i12 = 0;
                while (i12 < w3Var.l1.invoice.prices.size()) {
                    j3 += w3Var.l1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !w3Var.k1) {
                w3Var.k1 = true;
                if (w3Var.j1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        w3Var.j1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = w3Var.v0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(w3Var.currentAccount).getInputPeer(w3Var.X);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject p5 = fi.k3.p(w3Var.resourcesProvider, false);
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(w3Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new b2(w3Var, i11));
            }
            if (z10) {
                dVar.g(v7.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j3)), 1.13f, nqVarArr), true, true);
            } else {
                dVar.g(v7.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j3)), 1.13f, nqVarArr), true, true);
            }
            v3 v3Var = w3Var.p0;
            if (v3Var != null) {
                v3Var.P(j3);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            dVar.e.o(false, true, false);
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(w3Var.n1, 1000L);
        }
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static void y0(w3 w3Var, TLObject tLObject, ug.n1[] n1VarArr, Long l4, wh.n nVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            qc Y = w3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(w3Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(w3Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            nVar.run();
        } else {
            new yc(n1VarArr[0].container, w3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
        }
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static void z0(w3 w3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        b1 b1Var = w3Var.n1;
        w3Var.k1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            qc Y = w3Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(w3Var.currentAccount).putUsers(paymentForm.users, false);
            w3Var.l1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(b1Var);
            AndroidUtilities.runOnUIThread(b1Var);
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.E0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.X;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
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
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.E0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
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

    public final TL_stars.StarGift B1() {
        MessageObject messageObject = this.E0;
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
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String C1() {
        TL_stars.StarGift B1 = B1();
        if (!(B1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) B1).title);
        sb2.append(" #");
        return i2.g.k(r0.num, ',', sb2);
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.X;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            MessageObject messageObject = this.E0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.G0 == null || TextUtils.isEmpty(this.F0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.F0;
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
        MessageObject messageObject2 = this.E0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.E0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.E0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.E0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.E0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.E0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.E0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.C0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.G0 == null || TextUtils.isEmpty(this.F0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.F0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String F1() {
        TL_stars.StarGift B1 = B1();
        if (!(B1 instanceof TL_stars.TL_starGiftUnique) || B1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + B1.slug;
    }

    public final int G1() {
        int indexOf;
        k5 k5Var = this.D0;
        if (k5Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift != null) {
            indexOf = k5Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = k5Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift B1 = B1();
        for (int i10 = 0; i10 < this.D0.e(); i10++) {
            Object obj = this.D0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.C0;
                if (savedStarGift2 != null) {
                    if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (B1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (B1 != starGift) {
                        if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.G0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = this.R0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        k5 k5Var = this.D0;
        Object obj = (k5Var == null || i10 < 0 || i10 >= k5Var.e()) ? null : this.D0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = this.R0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        k5 k5Var = this.D0;
        Object obj = (k5Var == null || i10 < 0 || i10 >= k5Var.e()) ? null : this.D0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique K1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) B1;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean L() {
        return false;
    }

    public final boolean L1(boolean z10) {
        return (H1(z10) == null && I1(z10) == null) ? false : true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift E1 = E1();
        getstargiftwithdrawalurl.stargift = E1;
        if (E1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new t1(this, twoStepVerificationActivity, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1() {
        long clientUserId;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (this.j0.N || K1 == null) {
            return;
        }
        if (this.G0 != null && this.H0) {
            clientUserId = this.X;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        zf.b bVar = K1.resale_ton_only ? zf.b.b : zf.b.a;
        if (this.G0 == null || !this.H0) {
            c2(K1, clientUserId, bVar, null, true, null);
            return;
        }
        yh.j0 j0Var = new yh.j0(getContext(), this.resourcesProvider, K1, clientUserId);
        j0Var.K = new xe(this, j0Var, K1, clientUserId, bVar, 3);
        j0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(View view) {
        int i10;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            u1();
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        int i11 = 0;
        if (K1.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String formatString = LocaleController.formatString(R.string.Gift2UnlistTitle, C1());
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = formatString;
            b2Var.T = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new y1(this, K1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z9.a(14));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    v7.f1(getContext(), this.currentAccount, null, new z1(this, K1, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.E0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.C0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void S1() {
        d2 d2Var = this.W0;
        if (d2Var != null && d2Var.isShown()) {
            this.W0.dismiss();
        }
        String F1 = F1();
        d2 d2Var2 = new d2(this, getContext(), F1, F1, this.resourcesProvider);
        this.W0 = d2Var2;
        d2Var2.s0 = new k2.g0(this, 27);
        d2Var2.show();
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        TL_stars.TL_starGiftUnique K1;
        this.f0.setAlpha(this.Y0.a(0));
        this.r0.setAlpha(this.Y0.a(1));
        this.y0.setAlpha(this.Y0.a(2));
        this.A0.setAlpha(this.Y0.a(3));
        float a2 = 1.0f - this.Y0.a(4);
        FrameLayout frameLayout = this.k0;
        frameLayout.setAlpha(a2);
        f4.d dVar = this.Y0;
        t3 t3Var = this.e0;
        t3Var.d(dVar);
        ImageView imageView = t3Var.P;
        if (this.Y0.c(0) && (K1 = K1()) != null && !K1.crafted && O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            MessageObject messageObject = this.E0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            org.telegram.ui.t5 t5Var = this.Y;
            float d = t5Var.d();
            this.d0.setAlpha(this.Y0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            t5Var.e();
            t5Var.invalidate();
            frameLayout.setVisibility(this.Y0.c(4) ? 8 : 0);
            s2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        org.telegram.ui.t5 t5Var2 = this.Y;
        float d10 = t5Var2.d();
        this.d0.setAlpha(this.Y0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        t5Var2.e();
        t5Var2.invalidate();
        frameLayout.setVisibility(this.Y0.c(4) ? 8 : 0);
        s2();
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        v7.f1(getContext(), this.currentAccount, K1, new z1(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j3, String str) {
        this.g1 = true;
        s5.y(this.currentAccount, false).K(j3, new oj0(17, this, str));
    }

    public final void W1(boolean z10) {
        int i10;
        MessageObject messageObject = this.E0;
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
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            i2.g.B(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            b2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            i2.g.B(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        t3 t3Var = this.e0;
        if (z10) {
            t3Var.L.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                x2 x2Var = t3Var.L;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    x2Var.getClass();
                } else {
                    while (true) {
                        v2[] v2VarArr = x2Var.n;
                        if (i11 >= v2VarArr.length) {
                            break;
                        }
                        v2 v2Var = v2VarArr[i11];
                        TL_stars.StarGift starGift = v2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            v2Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    x2Var.d(true);
                }
            }
        }
        x2 x2Var2 = t3Var.L;
        x2 x2Var3 = t3Var.L;
        x2Var2.setOnCraft(new x0(this, i12));
        if (this.T0 == null) {
            yh.e4 e4Var = new yh.e4(this.currentAccount, K1.gift_id);
            this.T0 = e4Var;
            e4Var.a();
        }
        x2Var3.setOnAddGift(new z1(this, K1, i12));
        x2Var3.setOnClose(new b1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j3) {
        di.f4 f4Var = this.o1;
        if (f4Var != null) {
            f4Var.e(true);
            this.o1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null || UserObject.isService(j3)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
            if (j3 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j3);
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
    public final void Y1() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        xa xaVar;
        ug.h1 h1Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        di.f4 f4Var = this.o1;
        if (f4Var != null) {
            f4Var.e(true);
            this.o1 = null;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.E0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.C0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.C0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        ug.n1[] n1VarArr = {new ug.n1(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        ug.n1 n1Var = n1VarArr[0];
                        n1Var.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = n1Var.e;
                        if (xaVar != null) {
                            xaVar.setTitle(n1Var.y());
                        }
                        h1Var = n1Var.b0;
                        if (h1Var != null) {
                            h1Var.setText(n1Var.y());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        ug.n1 n1Var2 = n1VarArr[0];
                        n1Var2.E0 = true;
                        n1Var2.F0 = max;
                        n1Var2.h0(false, true);
                        ug.n1 n1Var3 = n1VarArr[0];
                        n1Var3.B0 = new org.telegram.ui.Components.i2(this, currentTime, i11, max, tL_starGiftUnique2, n1VarArr);
                        n1Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.E0;
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
                        ug.n1[] n1VarArr2 = {new ug.n1(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        ug.n1 n1Var4 = n1VarArr2[0];
                        n1Var4.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = n1Var4.e;
                        if (xaVar != null) {
                        }
                        h1Var = n1Var4.b0;
                        if (h1Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        ug.n1 n1Var22 = n1VarArr2[0];
                        n1Var22.E0 = true;
                        n1Var22.F0 = max;
                        n1Var22.h0(false, true);
                        ug.n1 n1Var32 = n1VarArr2[0];
                        n1Var32.B0 = new org.telegram.ui.Components.i2(this, currentTime2, i11, max, tL_starGiftUnique22, n1VarArr2);
                        n1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.C0;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(long j3, Utilities.Callback callback) {
        TLRPC.Message message;
        long j10;
        String str;
        TLRPC.Chat chat;
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.E0;
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
                j10 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j10 = savedStarGift.transfer_stars;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
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
        linearLayout.addView(new z2(getContext(), K1, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        wl.n(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j10 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j10, C1(), DialogObject.getShortName(j3)) : LocaleController.formatString(R.string.Gift2TransferText, C1(), str)));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        oz0 oz0Var = new oz0(getContext(), this.resourcesProvider);
        q1(oz0Var, s5.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
        q1(oz0Var, s5.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        q1(oz0Var, s5.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
            oz0Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.p6.i("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
        }
        linearLayout.addView(oz0Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j10 > 0 ? v7.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j10))) : LocaleController.getString(R.string.Gift2TransferDo), new rg.p2(callback, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.X0 = true;
        b2Var.show();
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        di.f4 f4Var = this.o1;
        if (f4Var != null) {
            f4Var.e(true);
            this.o1 = null;
        }
        if (this.Z0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.E0;
            long j12 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j10 = tL_messageActionStarGift.gift.id;
                j11 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j3 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.E0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j10 = starGift.id;
                j11 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j12 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.C0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.w0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j11 <= j3 || z13) ? false : true;
            mp mpVar = this.v0;
            mpVar.a(z14, false);
            ArrayList arrayList = this.h1;
            if (arrayList != null && (j11 > j3 || this.l1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                s5.y(this.currentAccount, false).K(j10, new w1(this, 1));
            }
            if (j11 > j3 || this.l1 != null) {
                return;
            }
            this.k1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = mpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j12);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject p5 = fi.k3.p(this.resourcesProvider, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new b2(this, 0));
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
    public final void b2() {
        long j3;
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        int i11;
        String string;
        String string2;
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z10 = false;
        }
        if (this.h1 != null) {
            if (j3 > 0 || this.l1 != null) {
                long j10 = 0;
                if (this.l1 != null) {
                    for (int i12 = 0; i12 < this.l1.invoice.prices.size(); i12++) {
                        j10 += this.l1.invoice.prices.get(i12).amount;
                    }
                }
                j3 j3Var = this.M0;
                t3 t3Var = this.e0;
                if (j3Var == null) {
                    this.M0 = new j3(t3Var);
                }
                j3 j3Var2 = this.M0;
                ArrayList arrayList = this.h1;
                t3 t3Var2 = j3Var2.a;
                ArrayList arrayList2 = j3Var2.g;
                ArrayList arrayList3 = j3Var2.f;
                ArrayList arrayList4 = j3Var2.e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((h3) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = s5.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = m10.get(i14);
                    i14++;
                    h3 h3Var = new h3(t3Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (t3Var2.isAttachedToWindow() && h3Var.c) {
                        h3Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(h3Var);
                }
                ArrayList m11 = s5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = m11.get(i15);
                    i15++;
                    arrayList3.add(new g3((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = s5.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = m12.get(i16);
                    i16++;
                    arrayList2.add(new i3((TL_stars.starGiftAttributePattern) obj4));
                }
                t3Var.setPreviewingAttributes(this.h1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j11 = this.X;
                if (z10) {
                    z11 = true;
                    t3Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j11)), null);
                } else {
                    z11 = true;
                    t3Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                di.d dVar = this.j0;
                dVar.setFilled(z11);
                dVar.f(null, z11);
                if (j10 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.j1 != null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= this.j1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.j1.get(i17);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i17++;
                        }
                    }
                    ArrayList arrayList5 = this.i1;
                    FrameLayout frameLayout = this.m0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.l0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new b1(this, 0)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    s2();
                    nq[] nqVarArr = this.m1;
                    if (z10) {
                        i10 = 1;
                        dVar.g(v7.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, nqVarArr), true, true);
                    } else {
                        i10 = 1;
                        dVar.g(v7.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, nqVarArr), true, true);
                    }
                } else {
                    i10 = 1;
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new u0(this, i10));
                View view = this.t0;
                LinearLayout linearLayout = this.u0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                fi.l[] lVarArr = this.s0;
                if (z10) {
                    fi.l lVar = lVarArr[c10];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
                        int i19 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i11 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c10] = DialogObject.getShortName(this.currentAccount, j11);
                        string = LocaleController.formatString(i19, objArr);
                    } else {
                        i11 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    lVar.a(string3, string, i18);
                    fi.l lVar2 = lVarArr[i11];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j11);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    lVar2.a(string4, string2, i20);
                    lVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j11)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    lVarArr[0].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    lVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    lVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new c1(this, j10, 0));
            }
        }
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final zf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final yh.j0 j0Var) {
        this.j0.setLoading(true);
        if (j0Var != null && !j0Var.L) {
            j0Var.L = true;
            j0Var.H.h(true);
        }
        s5.x(this.currentAccount, bVar).H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new Utilities.Callback() { // from class: zh.y0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                w3.a1(w3.this, j0Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.Y0.c(4)) {
            boolean z10 = this.e0.L.h0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        if (this.Y0.c(4) && this.e0.L.h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.Y0.c(4) && this.e0.L.h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.D0 == ((j5) objArr[1])) {
                x2 x2Var = this.e0.L;
                if (x2Var == null || !x2Var.h0) {
                    t2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        if (this.Y0.c(4) && this.e0.L.h0) {
            return;
        }
        yh.e4 e4Var = this.T0;
        if (e4Var != null) {
            e4Var.b();
            this.T0 = null;
        }
        j3 j3Var = this.M0;
        if (j3Var != null) {
            j3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, org.telegram.ui.Cells.p6.i("@", publicUsername)), new u1(this, publicUsername, 8));
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return e2(starGift.released_by);
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public yc getBulletinFactory() {
        return new yc(this.o0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, k5 k5Var) {
        j3 j3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.F0 = str;
        this.G0 = tL_starGiftUnique;
        this.D0 = k5Var;
        this.H0 = (tL_starGiftUnique.resell_amount == null || N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.N0 && (j3Var = this.M0) != null && j3Var.o && (tL_starGiftUnique2 = j3Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            j3Var.a();
            this.M0 = null;
            t3 t3Var = this.e0;
            t3Var.b.setAlpha(1.0f);
            t3Var.c.setAlpha(0.0f);
        }
        this.d0.b(this.currentAccount, this.C0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        d90 d90Var = this.g0;
        if (!z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            d90Var.setVisibility(8);
        } else {
            d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            d90Var.setVisibility(0);
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        }
        d90 d90Var2 = this.i0;
        if (z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            d90Var2.setVisibility(8);
        } else {
            d90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            d90Var2.setVisibility(0);
        }
        if (this.H0) {
            l2(tL_starGiftUnique);
            this.j0.setOnClickListener(new u0(this, 7));
        }
        if (this.b1) {
            q2(0, false, null);
            this.c.n0(1);
            this.b1 = false;
        }
        t2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0345, code lost:
    
        if (O1(r55.currentAccount, org.telegram.messenger.DialogObject.getPeerDialogId(r1)) != false) goto L165;
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
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r5.id != r10.id) goto L62;
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
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [org.telegram.ui.Components.ad[], org.telegram.ui.Components.nq[], org.telegram.ui.Components.nz0[]] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(MessageObject messageObject, k5 k5Var) {
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j3;
        long j10;
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
        oz0 oz0Var;
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
        boolean z22;
        int i14;
        ?? r72;
        CharSequence charSequence2;
        String string2;
        SpannableStringBuilder replaceTags;
        j3 j3Var;
        String string3;
        boolean z23;
        TLObject userOrChat;
        j3 j3Var2;
        TL_stars.InputSavedStarGift E1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z24 = false;
        this.B0 = false;
        this.C0 = null;
        this.E0 = messageObject;
        this.D0 = k5Var;
        this.d0.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z25 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i15 = 3;
        t3 t3Var = this.e0;
        di.d dVar = this.j0;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.N0 && (j3Var = this.M0) != null && j3Var.o && j3Var.l != null) {
                j3Var.a();
                this.M0 = null;
                t3Var.b.setVisibility(0);
                t3Var.c.setVisibility(4);
            }
            boolean isOutOwner = messageObject.isOutOwner();
            if (z25) {
                isOutOwner = false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            int i16 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z27 = tL_messageActionStarGift.converted;
                boolean z28 = tL_messageActionStarGift.saved;
                boolean z29 = tL_messageActionStarGift.refunded;
                boolean z30 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z31 = tL_messageActionStarGift.can_upgrade;
                long j11 = tL_messageActionStarGift.convert_stars;
                j10 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageActionStarGift.message;
                TLRPC.Peer peer7 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities5;
                peer2 = peer8;
                z14 = z31;
                z10 = z28;
                z12 = z30;
                peer = peer7;
                starGift = starGift5;
                j3 = j11;
                z13 = z27;
                z11 = z29;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                z10 = tL_messageActionStarGiftUnique.saved;
                z11 = tL_messageActionStarGiftUnique.refunded;
                starGift = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                peer2 = tL_messageActionStarGiftUnique.peer;
                j3 = 0;
                j10 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                str = null;
            }
            long j12 = this.X;
            String shortName = DialogObject.getShortName(j12);
            z16 = z25;
            boolean z32 = isOutOwner;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j12)));
            boolean z33 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            t3Var.f(starGift, false, false, P1);
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
                    string2 = i2.g.k(i10, ',', sb2);
                }
                this.S0 = string2;
                if (z11) {
                    replaceTags = null;
                } else if (z14) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j3 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j3));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                t3Var.i(0, string2, replaceTags, f2(starGift));
            } else {
                peer4 = peer3;
                peer5 = peer;
                z17 = z12;
                if (z33 && !this.B0) {
                    t3Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, f2(starGift));
                } else if ((z32 || z14) && j10 > 0) {
                    String string4 = LocaleController.getString(z32 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.S0 = string4;
                    if (z11) {
                        formatString = null;
                    } else if (z32) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        t3Var.i(i11, string4, formatString, f2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    t3Var.i(i11, string4, formatString, f2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z32 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        string = i2.g.k(i10, ',', sb3);
                    }
                    this.S0 = string;
                    if (z11) {
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && E1() != null) {
                            MessageObject messageObject2 = this.E0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z34 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.E0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.E0.messageOwner.date);
                                    if (z34) {
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
                                    if (z32) {
                                        str2 = LocaleController.formatString((!z14 || j10 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z10 ? z33 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z33 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                peer6 = peer5;
                                tL_textWithEntities2 = tL_textWithEntities;
                                TL_stars.SavedStarGift savedStarGift = this.C0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (O1(this.currentAccount, j12)) {
                                        int i17 = this.C0.flags;
                                        if (((j12 < 0 ? 2048 : 8) & i17) != 0) {
                                            if ((i17 & 16) != 0) {
                                                if ((i17 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z32) {
                                }
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str2);
                            if (isBot && s1()) {
                                c10 = 1;
                                charSequence = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b1(this, 6)), true);
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
                        if (z32) {
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
                    t3Var.i(i12, string, concat, f2(starGift));
                    oz0Var = this.h0;
                    oz0Var.removeAllViews();
                    long peerDialogId = peer6 == null ? DialogObject.getPeerDialogId(peer6) : z32 ? clientUserId : j12;
                    if (peer2 == null) {
                        j12 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z32) {
                        j12 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer4 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer4);
                        starGift2 = starGift;
                        this.h0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new c1(this, peerDialogId2, 4), null, z33 ? null : new c1(this, peerDialogId2, 5));
                    } else {
                        starGift2 = starGift;
                        if (peerDialogId != clientUserId || z15 || z33) {
                            this.h0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new c1(this, peerDialogId, 6), (peerDialogId == clientUserId || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z33) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z33 ? null : new c1(this, peerDialogId, 7));
                        }
                        if (j12 != clientUserId || z33) {
                            this.h0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, j12, new c1(this, j12, 8), null, z33 ? null : new c1(this, j12, 9));
                        }
                    }
                    oz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift2.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String k10 = i2.g.k(starGift2.stars + j10, ',', new StringBuilder("⭐️ "));
                        if (!s1() || z11) {
                            r72 = 0;
                            charSequence2 = "";
                        } else {
                            r72 = 0;
                            charSequence2 = bd.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j3), new b1(this, 4), this.resourcesProvider, null);
                        }
                        oz0Var.c(string5, v7.X0(false, TextUtils.concat(k10, " ", charSequence2), 0.8f, r72), r72, r72);
                    }
                    if (starGift2.limited && !z11) {
                        v7.F0(oz0Var, this.currentAccount, starGift2, this.resourcesProvider);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z11) {
                        oz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z32 && z14 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.a1 == null) {
                            i14 = 0;
                            this.a1 = new nq(0, new u3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder.setSpan(this.a1, i14, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j10 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.b1, true);
                        dVar.f(null, !this.b1);
                        dVar.setOnClickListener(new u0(this, 11));
                    } else if (this.q0 || this.Z == null || this.D0 == null || G1() < 0 || this.D0.b(G1()) < 0) {
                        if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z18 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                            dVar.f(null, !this.b1);
                            dVar.setOnClickListener(new u0(this, 9));
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.a1 == null) {
                                i13 = 0;
                                this.a1 = new nq(0, new u3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                            } else {
                                i13 = 0;
                            }
                            z18 = true;
                            spannableStringBuilder2.setSpan(this.a1, i13, 1, 33);
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder2, !this.b1, true);
                            dVar.f(null, !this.b1);
                            dVar.setOnClickListener(new u0(this, 8));
                        }
                        tL_textWithEntities4 = tL_textWithEntities3;
                        starGift4 = starGift2;
                        z20 = z10;
                        z21 = z11;
                        z24 = z13;
                        z22 = z32;
                    } else {
                        dVar.setFilled(false);
                        int b10 = this.D0.b(G1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.D0.get(b10);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                            z19 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            z19 = true;
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        dVar.g(spannableStringBuilder3, this.b1 ^ z19, z19);
                        dVar.f(null, this.b1 ^ z19);
                        dVar.setOnClickListener(new e1(this, b10, 2));
                    }
                    z18 = true;
                    tL_textWithEntities4 = tL_textWithEntities3;
                    starGift4 = starGift2;
                    z20 = z10;
                    z21 = z11;
                    z24 = z13;
                    z22 = z32;
                }
            }
            peer6 = peer5;
            tL_textWithEntities2 = tL_textWithEntities;
            oz0Var = this.h0;
            oz0Var.removeAllViews();
            if (peer6 == null) {
            }
            if (peer2 == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer4 == null) {
            }
            oz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift2.stars > 0) {
            }
            if (starGift2.limited) {
                v7.F0(oz0Var, this.currentAccount, starGift2, this.resourcesProvider);
            }
            tL_textWithEntities3 = tL_textWithEntities2;
            if (tL_textWithEntities2 != null) {
                oz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            if (z32) {
            }
            if (this.q0) {
            }
            if (starGift2 instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            dVar.setFilled(true);
            dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
            dVar.f(null, !this.b1);
            dVar.setOnClickListener(new u0(this, 9));
            tL_textWithEntities4 = tL_textWithEntities3;
            starGift4 = starGift2;
            z20 = z10;
            z21 = z11;
            z24 = z13;
            z22 = z32;
        } else {
            if (!z23) {
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
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z21 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique, z21, userOrChat, tL_messageActionStarGiftUnique2.message);
            boolean z35 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            z22 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z22 = false;
            }
            if (!this.K0 && !this.L0 && this.E0 != null && (E1 = E1()) != null) {
                this.K0 = true;
                s5.y(this.currentAccount, false).M(E1, new w1(this, i15));
            }
            if (this.N0 || (j3Var2 = this.M0) == null || !j3Var2.o || (r5 = j3Var2.l) == null) {
                z20 = z35;
            } else {
                if (starGift4 != null) {
                    z20 = z35;
                } else {
                    z20 = z35;
                }
                j3Var2.a();
                this.M0 = null;
                t3Var.b.setAlpha(1.0f);
                t3Var.c.setAlpha(0.0f);
            }
            tL_textWithEntities4 = null;
            peer4 = null;
            z16 = z25;
            z18 = true;
            z17 = false;
        }
        if (this.e1) {
            dVar.setFilled(z18);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z18);
            dVar.setOnClickListener(new u0(this, 10));
        }
        String str3 = starGift4 == null ? null : starGift4.owner_address;
        String str4 = starGift4 == null ? null : starGift4.gift_address;
        boolean z36 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        d90 d90Var = this.g0;
        if (z21) {
            d90Var.setVisibility(0);
            d90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.resourcesProvider));
        } else if (z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            d90Var.setVisibility(0);
            d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z17 && !z16) {
            d90Var.setVisibility(0);
            if (z22) {
                string3 = LocaleController.formatString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            d90Var.setText(string3);
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else {
            d90Var.setVisibility(8);
        }
        d90 d90Var2 = this.i0;
        if (!z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            d90Var2.setVisibility(0);
            d90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str4, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z24 || z21 || starGift4 == null || !N1(this.currentAccount, A1()) || peer4 != null) {
            d90Var2.setVisibility(8);
        } else {
            d90Var2.setVisibility(0);
            if (A1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z20) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new nq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z20 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new b1(this, 3)));
                d90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                d90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z20 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new b1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.b1) {
            q2(0, false, null);
            this.c.n0(1);
            this.b1 = false;
        }
        this.e.setTitle(this.S0);
        t2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [org.telegram.ui.Components.ad[], org.telegram.ui.Components.nq[], org.telegram.ui.Components.nz0[]] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v49 */
    public final void j2(TL_stars.SavedStarGift savedStarGift, k5 k5Var) {
        long j3;
        String string;
        int i10;
        CharSequence charSequence;
        String formatString;
        TL_stars.StarGift starGift;
        ?? r12;
        int i11;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str;
        String str2;
        boolean z10;
        int i12;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        j3 j3Var;
        if (savedStarGift == null) {
            return;
        }
        int i13 = this.currentAccount;
        long j10 = this.X;
        this.B0 = N1(i13, j10);
        this.C0 = savedStarGift;
        this.D0 = k5Var;
        this.E0 = null;
        boolean z11 = this.N0;
        t3 t3Var = this.e0;
        if (!z11 && (j3Var = this.M0) != null && j3Var.o && j3Var.l != null) {
            j3Var.a();
            this.M0 = null;
            t3Var.b.setVisibility(0);
            t3Var.c.setVisibility(4);
        }
        this.d0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j10);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z12 = j10 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z13 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z10 = starGift4.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift4, z13, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z14 = this.B0 && clientUserId == peerDialogId && j10 >= 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            t3Var.f(starGift4, false, false, P1);
            oz0 oz0Var = this.h0;
            oz0Var.removeAllViews();
            CharSequence charSequence2 = "";
            if (z14) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j3 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = clientUserId;
                    string2 = i2.g.k(savedStarGift.gift_num, ',', sb2);
                }
                this.S0 = string2;
                if (z13) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j11 = savedStarGift.convert_stars;
                    replaceTags = j11 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j11)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                t3Var.i(0, string2, replaceTags, f2(savedStarGift.gift));
            } else {
                j3 = clientUserId;
                if (!z12 || this.B0) {
                    boolean z15 = this.B0;
                    if ((!z15 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.S0 = string3;
                        t3Var.i(0, string3, (!z13 && this.B0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = i2.g.k(savedStarGift.gift_num, ',', sb3);
                        }
                        this.S0 = string;
                        if (z13 || !this.B0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !s1()) {
                                if (this.B0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z12 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z12 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.B0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z12 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z12 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            i10 = 0;
                            charSequence = TextUtils.concat(AndroidUtilities.replaceTags(formatString), " ", (isBot || !s1()) ? charSequence2 : AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b1(this, 1)), true));
                        }
                        t3Var.i(i10, string, charSequence, f2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.S0 = string4;
                    t3Var.i(0, string4, null, e2(savedStarGift.gift.released_by));
                }
            }
            if (j3 != peerDialogId || z12) {
                this.h0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new c1(this, peerDialogId, 1), (peerDialogId == j3 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z12) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new c1(this, peerDialogId, 2));
            }
            oz0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String k10 = i2.g.k(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!s1() || z13) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequence2 = bd.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new b1(this, 4), this.resourcesProvider, null);
            }
            oz0Var.c(string5, v7.X0(false, TextUtils.concat(k10, " ", charSequence2), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z13) {
                v7.F0(oz0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z13) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                oz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z16 = this.B0;
            di.d dVar = this.j0;
            if (z16 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.a1 == null) {
                    i12 = 0;
                    this.a1 = new nq(0, new u3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.setSpan(this.a1, i12, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.b1, true);
                dVar.f(null, !this.b1);
                dVar.setOnClickListener(new u0(this, 3));
            } else if (this.q0 && z16 && this.Z != null && this.D0 != null && G1() >= 0 && this.D0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.D0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.D0.get(b10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.b1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.b1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new e1(this, b10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                dVar.f(null, !this.b1);
                dVar.setOnClickListener(new u0(this, 6));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.a1 == null) {
                    i11 = 0;
                    this.a1 = new nq(0, new u3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i11 = 0;
                }
                spannableStringBuilder3.setSpan(this.a1, i11, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.b1, true);
                dVar.f(null, !this.b1);
                dVar.setOnClickListener(new u0(this, 5));
            }
            str = null;
            str2 = null;
            z10 = false;
        }
        boolean z17 = savedStarGift.refunded;
        d90 d90Var = this.g0;
        if (z17) {
            d90Var.setVisibility(0);
            d90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.resourcesProvider));
        } else if (z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            d90Var.setVisibility(0);
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.B0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            d90Var.setVisibility(0);
            d90Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else {
            d90Var.setVisibility(8);
        }
        d90 d90Var2 = this.i0;
        if (!z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            d90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u1(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            d90Var2.setVisibility(0);
        } else if (this.B0 && N1(this.currentAccount, j10)) {
            if (j10 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new nq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new b1(this, 3)));
                d90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                d90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new b1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            d90Var2.setVisibility(0);
        } else {
            r13 = 0;
            d90Var2.setVisibility(8);
        }
        if (this.b1) {
            q2(r13, r13, null);
            this.c.n0(1);
            this.b1 = r13;
        }
        this.e.setTitle(this.S0);
        t2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x04ba, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0694  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        t3 t3Var;
        long j3;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        oz0 oz0Var;
        Class cls;
        int i10;
        boolean z11;
        ?? r14;
        oz0 oz0Var2;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        j3 j3Var;
        di.d dVar;
        boolean z12;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        j3 j3Var2;
        boolean z13;
        Object obj;
        Object obj2;
        CharSequence formatSpannable;
        TLRPC.Message message;
        MessageObject messageObject;
        j3 j3Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.S0 = i2.g.k(tL_starGiftUnique.num, ',', sb2);
        boolean z14 = this.N0;
        t3 t3Var2 = this.e0;
        if (z14 || (j3Var3 = this.M0) == null || !j3Var3.o || (tL_starGiftUnique2 = j3Var3.l) == null) {
            t3Var = t3Var2;
            j3 = peerDialogId;
        } else {
            j3 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                j3Var3.a();
                this.M0 = null;
                t3Var = t3Var2;
                t3Var.b.setAlpha(1.0f);
                t3Var.c.setAlpha(0.0f);
                long j10 = j3;
                boolean O1 = O1(this.currentAccount, j10);
                boolean O12 = O1(this.currentAccount, peerDialogId2);
                boolean P1 = P1(this.currentAccount, K1());
                F1();
                t3Var.f(tL_starGiftUnique, O1, O12, P1);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new ju(190, 0), length, spannableStringBuilder.length(), 33);
                if (tLObject == null) {
                    charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                    if (tL_textWithEntities != null) {
                        TextPaint textPaint = t3Var.G;
                        TextPaint textPaint2 = t3Var.G;
                        if (textPaint != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                            spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                            t3 t3Var3 = t3Var;
                            t3Var3.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            this.c1 = null;
                            oz0 oz0Var3 = this.h0;
                            oz0Var3.removeAllViews();
                            int i11 = 19;
                            if (!z10) {
                                if (tL_starGiftUnique.host_id != null) {
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        oz0Var3.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new b1(this, i11));
                                    }
                                    if (peerDialogId2 != 0) {
                                        this.c1 = ((lz0) this.h0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new c1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                                    }
                                } else {
                                    cls = TL_stars.starGiftAttributeModel.class;
                                    i10 = 33;
                                    ?? r12 = 0;
                                    z11 = false;
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        oz0Var3.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new b1(this, 22));
                                    } else if (j10 == 0 && tL_starGiftUnique.owner_name != null) {
                                        oz0Var3.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                    } else if (j10 != 0) {
                                        r14 = 1;
                                        oz0Var2 = oz0Var3;
                                        this.c1 = ((lz0) this.h0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j10, new c1(this, j10, 11)).getChildAt(1)).getChildAt(0);
                                        p1(s5.l(tL_starGiftUnique.attributes, cls));
                                        p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                        p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        if (!z10) {
                                            if (this.E0 == null) {
                                                oz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                            } else if (this.J0) {
                                                oz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                            } else {
                                                TextView textView = (TextView) ((lz0) oz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(r14)).getChildAt(r12);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                                i90 i90Var = new i90(textView, AndroidUtilities.dp(90.0f), r12, this.resourcesProvider);
                                                int i12 = org.telegram.ui.ActionBar.j6.G6;
                                                i90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, org.telegram.ui.ActionBar.j6.v0(i12, this.resourcesProvider)), org.telegram.ui.ActionBar.j6.l1(0.08f, org.telegram.ui.ActionBar.j6.v0(i12, this.resourcesProvider)));
                                                spannableStringBuilder3.setSpan(i90Var, r12, r14, i10);
                                                textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                                if (!this.I0 && !this.J0 && (messageObject = this.E0) != null) {
                                                    this.I0 = r14;
                                                    int id2 = messageObject.getId();
                                                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                    tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new bi.p7(this, id2, 8));
                                                }
                                            }
                                            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                                this.h0.e(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.p6.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new wh.n(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 13), null);
                                            }
                                        }
                                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                        if (stargiftattributeoriginaldetails != null) {
                                            if ((stargiftattributeoriginaldetails.flags & r14) != 0) {
                                                long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                                SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                                spannableString.setSpan(new e2(this, peerDialogId3), r12, spannableString.length(), i10);
                                                obj = spannableString;
                                            } else {
                                                obj = null;
                                            }
                                            long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                            SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                            spannableString2.setSpan(new f2(this, peerDialogId4), r12, spannableString2.length(), i10);
                                            if (stargiftattributeoriginaldetails.message != null) {
                                                TextPaint textPaint3 = new TextPaint((int) r14);
                                                textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                                MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                                obj2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r12), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                                            } else {
                                                obj2 = null;
                                            }
                                            Object replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                                if (obj2 == null) {
                                                    int i13 = R.string.Gift2AttributeOriginalDetailsSelf;
                                                    Object[] objArr = new Object[2];
                                                    objArr[r12] = obj;
                                                    objArr[1] = replaceAll;
                                                    formatSpannable = LocaleController.formatSpannable(i13, objArr);
                                                } else {
                                                    int i14 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                                    Object[] objArr2 = new Object[3];
                                                    objArr2[r12] = obj;
                                                    objArr2[1] = replaceAll;
                                                    objArr2[2] = obj2;
                                                    formatSpannable = LocaleController.formatSpannable(i14, objArr2);
                                                }
                                            } else if (obj != null) {
                                                if (obj2 == null) {
                                                    int i15 = R.string.Gift2AttributeOriginalDetails;
                                                    Object[] objArr3 = new Object[3];
                                                    objArr3[r12] = obj;
                                                    objArr3[1] = spannableString2;
                                                    objArr3[2] = replaceAll;
                                                    formatSpannable = LocaleController.formatSpannable(i15, objArr3);
                                                } else {
                                                    int i16 = R.string.Gift2AttributeOriginalDetailsComment;
                                                    Object[] objArr4 = new Object[4];
                                                    objArr4[r12] = obj;
                                                    objArr4[1] = spannableString2;
                                                    objArr4[2] = replaceAll;
                                                    objArr4[3] = obj2;
                                                    formatSpannable = LocaleController.formatSpannable(i16, objArr4);
                                                }
                                            } else if (obj2 == null) {
                                                int i17 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                                Object[] objArr5 = new Object[2];
                                                objArr5[r12] = spannableString2;
                                                objArr5[1] = replaceAll;
                                                formatSpannable = LocaleController.formatSpannable(i17, objArr5);
                                            } else {
                                                int i18 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                                Object[] objArr6 = new Object[3];
                                                objArr6[r12] = spannableString2;
                                                objArr6[1] = replaceAll;
                                                objArr6[2] = obj2;
                                                formatSpannable = LocaleController.formatSpannable(i18, objArr6);
                                            }
                                            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                                TL_stars.SavedStarGift savedStarGift = this.C0;
                                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                    MessageObject messageObject2 = this.E0;
                                                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        }
                                                    }
                                                }
                                                LinearLayout linearLayout = new LinearLayout(getContext());
                                                linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                                linearLayout.setOrientation(r12);
                                                wh.p pVar = new wh.p(getContext());
                                                pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourcesProvider));
                                                pVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.resourcesProvider));
                                                pVar.setTextSize(1, 12.0f);
                                                pVar.setGravity(3);
                                                pVar.setText(formatSpannable);
                                                linearLayout.addView(pVar, w7.x5.o(-1, -2, 1.0f, 19));
                                                ImageView imageView = new ImageView(getContext());
                                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                                int i19 = org.telegram.ui.ActionBar.j6.Oh;
                                                imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i19, this.resourcesProvider)), 6, 6));
                                                imageView.setImageResource(R.drawable.menu_delete_old);
                                                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i19, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                                w7.z5.a(imageView);
                                                imageView.setOnClickListener(new w(5, this, formatSpannable));
                                                linearLayout.addView(imageView, w7.x5.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                                TableRow tableRow = new TableRow(getContext());
                                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                                layoutParams.span = 2;
                                                tableRow.addView(new mz0(oz0Var2, linearLayout, true), layoutParams);
                                                oz0Var2.addView(tableRow);
                                            }
                                            mz0 a2 = oz0Var2.a(formatSpannable);
                                            a2.setFilled(true);
                                            wh.p pVar2 = (wh.p) a2.getChildAt(r12);
                                            pVar2.setTextSize(1, 12.0f);
                                            pVar2.setGravity(17);
                                        }
                                        j3Var = this.M0;
                                        dVar = this.j0;
                                        if (j3Var != null || !j3Var.o) {
                                            if (!N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                                if (this.q0 || this.Z == null || this.D0 == null || G1() < 0 || this.D0.b(G1()) < 0) {
                                                    dVar.setFilled(true);
                                                    dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                                                    dVar.f(null, !this.b1);
                                                    dVar.setOnClickListener(new u0(this, 25));
                                                } else {
                                                    dVar.setFilled(r12);
                                                    int b10 = this.D0.b(G1());
                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                                    Object obj3 = this.D0.get(b10);
                                                    if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                        z12 = true;
                                                    } else {
                                                        spannableStringBuilder5.append((CharSequence) " e");
                                                        z12 = true;
                                                        spannableStringBuilder5.setSpan(new org.telegram.ui.Components.z5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                    }
                                                    dVar.g(spannableStringBuilder5, this.b1 ^ z12, z12);
                                                    dVar.f(null, this.b1 ^ z12);
                                                    dVar.setOnClickListener(new e1(this, b10, 3));
                                                }
                                                this.e.setTitle(this.S0);
                                                j3Var2 = this.M0;
                                                if (j3Var2 != null) {
                                                    boolean z15 = this.N0;
                                                    b1 b1Var = new b1(this, 23);
                                                    b1 b1Var2 = new b1(this, 20);
                                                    ArrayList arrayList = j3Var2.f;
                                                    t3 t3Var4 = j3Var2.a;
                                                    TL_stars.TL_starGiftUnique tL_starGiftUnique3 = j3Var2.l;
                                                    if (tL_starGiftUnique3 != null && tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                        z13 = j3Var2.o;
                                                    } else if (z15) {
                                                        x9 upgradeImageView = t3Var4.getUpgradeImageView();
                                                        m3 m3Var = t3Var4.c;
                                                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = t3Var4.getUpgradeImageViewAttribute();
                                                        TL_stars.starGiftAttributePattern upgradePatternAttribute = t3Var4.getUpgradePatternAttribute();
                                                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = t3Var4.getUpgradeBackdropAttribute();
                                                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, cls);
                                                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                        j3Var2.o = true;
                                                        j3Var2.l = tL_starGiftUnique;
                                                        j3Var2.r = b1Var;
                                                        j3Var2.s = b1Var2;
                                                        j3Var2.t = (float) Math.random();
                                                        j3Var2.m = System.currentTimeMillis();
                                                        j3Var2.n = 0.0f;
                                                        j3Var2.p = false;
                                                        j3Var2.q = false;
                                                        j3Var2.o = true;
                                                        f3 f3Var = j3Var2.h;
                                                        if (f3Var != null) {
                                                            f3Var.a();
                                                        }
                                                        h3 h3Var = new h3(m3Var, stargiftattributemodel2);
                                                        if (m3Var.isAttachedToWindow() && h3Var.c) {
                                                            h3Var.d.onAttachedToWindow();
                                                        }
                                                        j3Var2.h = new f3(new d3(j3Var2, 0), j3Var2.e, new h3(upgradeImageView, upgradeImageViewAttribute), h3Var, 0.9f, j3Var2.t > 0.5f ? 3 : 2);
                                                        f3 f3Var2 = j3Var2.i;
                                                        if (f3Var2 != null) {
                                                            f3Var2.a();
                                                        }
                                                        j3Var2.i = new f3(new d3(j3Var2, 0), j3Var2.g, new i3(upgradePatternAttribute), new i3(stargiftattributepattern), 1.0f, j3Var2.t > 0.5f ? 2 : 1);
                                                        f3 f3Var3 = j3Var2.j;
                                                        if (f3Var3 != null) {
                                                            f3Var3.a();
                                                        }
                                                        j3Var2.j = new f3(new d3(j3Var2, 0), arrayList, new g3(upgradeBackdropAttribute), new g3(stargiftattributebackdrop), 0.5f, j3Var2.t > 0.5f ? 2 : 1);
                                                        f3 f3Var4 = j3Var2.k;
                                                        if (f3Var4 != null) {
                                                            f3Var4.a();
                                                        }
                                                        j3Var2.k = new f3(new d3(j3Var2, 0), arrayList, new g3(upgradeBackdropAttribute), new g3(stargiftattributebackdrop), 1.25f, j3Var2.t > 0.5f ? 2 : 1);
                                                        j3Var2.b();
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (z13) {
                                                        t3Var3.b.setAlpha(0.0f);
                                                        t3Var3.c.setAlpha(1.0f);
                                                        dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                        dVar.setFilled(true);
                                                        dVar.setOnClickListener(new u0(this, 23));
                                                        int length2 = ((w3) this.Q0.d).P0.length - 1;
                                                        ll0 ll0Var = this.d;
                                                        ll0Var.u0(length2);
                                                        ll0Var.post(new b1(this, 21));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            dVar.setFilled(true);
                                            l2(tL_starGiftUnique);
                                            dVar.setOnClickListener(new u0(this, 24));
                                        }
                                        this.e.setTitle(this.S0);
                                        j3Var2 = this.M0;
                                        if (j3Var2 != null) {
                                        }
                                    }
                                    oz0Var = oz0Var3;
                                    r14 = 1;
                                    r12 = z11;
                                    oz0Var2 = oz0Var;
                                    p1(s5.l(tL_starGiftUnique.attributes, cls));
                                    p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z10) {
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                    }
                                    j3Var = this.M0;
                                    dVar = this.j0;
                                    if (j3Var != null) {
                                    }
                                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                    }
                                    if (this.q0) {
                                    }
                                    dVar.setFilled(true);
                                    dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                                    dVar.f(null, !this.b1);
                                    dVar.setOnClickListener(new u0(this, 25));
                                    this.e.setTitle(this.S0);
                                    j3Var2 = this.M0;
                                    if (j3Var2 != null) {
                                    }
                                }
                            }
                            oz0Var = oz0Var3;
                            cls = TL_stars.starGiftAttributeModel.class;
                            i10 = 33;
                            z11 = false;
                            r14 = 1;
                            r12 = z11;
                            oz0Var2 = oz0Var;
                            p1(s5.l(tL_starGiftUnique.attributes, cls));
                            p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (!z10) {
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails != null) {
                            }
                            j3Var = this.M0;
                            dVar = this.j0;
                            if (j3Var != null) {
                            }
                            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            }
                            if (this.q0) {
                            }
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                            dVar.f(null, !this.b1);
                            dVar.setOnClickListener(new u0(this, 25));
                            this.e.setTitle(this.S0);
                            j3Var2 = this.M0;
                            if (j3Var2 != null) {
                            }
                        }
                    }
                    spannable = null;
                    t3 t3Var32 = t3Var;
                    t3Var32.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                    this.c1 = null;
                    oz0 oz0Var32 = this.h0;
                    oz0Var32.removeAllViews();
                    int i112 = 19;
                    if (!z10) {
                    }
                    oz0Var = oz0Var32;
                    cls = TL_stars.starGiftAttributeModel.class;
                    i10 = 33;
                    z11 = false;
                    r14 = 1;
                    r12 = z11;
                    oz0Var2 = oz0Var;
                    p1(s5.l(tL_starGiftUnique.attributes, cls));
                    p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z10) {
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                    }
                    j3Var = this.M0;
                    dVar = this.j0;
                    if (j3Var != null) {
                    }
                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    }
                    if (this.q0) {
                    }
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                    dVar.f(null, !this.b1);
                    dVar.setOnClickListener(new u0(this, 25));
                    this.e.setTitle(this.S0);
                    j3Var2 = this.M0;
                    if (j3Var2 != null) {
                    }
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                t3 t3Var322 = t3Var;
                t3Var322.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.c1 = null;
                oz0 oz0Var322 = this.h0;
                oz0Var322.removeAllViews();
                int i1122 = 19;
                if (!z10) {
                }
                oz0Var = oz0Var322;
                cls = TL_stars.starGiftAttributeModel.class;
                i10 = 33;
                z11 = false;
                r14 = 1;
                r12 = z11;
                oz0Var2 = oz0Var;
                p1(s5.l(tL_starGiftUnique.attributes, cls));
                p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                j3Var = this.M0;
                dVar = this.j0;
                if (j3Var != null) {
                }
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.q0) {
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
                dVar.f(null, !this.b1);
                dVar.setOnClickListener(new u0(this, 25));
                this.e.setTitle(this.S0);
                j3Var2 = this.M0;
                if (j3Var2 != null) {
                }
            } else {
                t3Var = t3Var2;
            }
        }
        if (z14 && this.M0 == null) {
            this.M0 = new j3(t3Var);
        }
        long j102 = j3;
        boolean O13 = O1(this.currentAccount, j102);
        boolean O122 = O1(this.currentAccount, peerDialogId2);
        boolean P12 = P1(this.currentAccount, K1());
        F1();
        t3Var.f(tL_starGiftUnique, O13, O122, P12);
        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder6.append((CharSequence) " ");
        int length3 = spannableStringBuilder6.length();
        spannableStringBuilder6.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
        spannableStringBuilder6.setSpan(new ju(190, 0), length3, spannableStringBuilder6.length(), 33);
        if (tLObject == null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        t3 t3Var3222 = t3Var;
        t3Var3222.h(0, spannableStringBuilder6, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.c1 = null;
        oz0 oz0Var3222 = this.h0;
        oz0Var3222.removeAllViews();
        int i11222 = 19;
        if (!z10) {
        }
        oz0Var = oz0Var3222;
        cls = TL_stars.starGiftAttributeModel.class;
        i10 = 33;
        z11 = false;
        r14 = 1;
        r12 = z11;
        oz0Var2 = oz0Var;
        p1(s5.l(tL_starGiftUnique.attributes, cls));
        p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        p1(s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        j3Var = this.M0;
        dVar = this.j0;
        if (j3Var != null) {
        }
        if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
        }
        if (this.q0) {
        }
        dVar.setFilled(true);
        dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
        dVar.f(null, !this.b1);
        dVar.setOnClickListener(new u0(this, 25));
        this.e.setTitle(this.S0);
        j3Var2 = this.M0;
        if (j3Var2 != null) {
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        di.d dVar = this.j0;
        if (!z10) {
            dVar.g(v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.b1, true);
            dVar.f(null, !this.b1);
        } else {
            dVar.g(v7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.b).d()), true), !this.b1, true);
            dVar.f(v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.b1);
        }
    }

    public final void m2() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        this.z0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i2.g.k(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.U0 == null) {
                this.U0 = new nq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.U0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        di.d dVar = this.j0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new u0(this, 21));
        this.e0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.x0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 == null || K1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject p5 = fi.k3.p(this.resourcesProvider, false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new bi.c3(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 16));
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        di.f4 f4Var = this.o1;
        if ((f4Var != null && f4Var.V && this.p1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.j5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            bd[] bdVarArr = (bd[]) spanned.getSpans(0, spanned.length(), bd.class);
            if (bdVarArr == null || bdVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(bdVarArr[bdVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            }
            org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
            primaryHorizontal = (j5Var.getRightDrawableWidth() / 2.0f) + j5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        org.telegram.ui.t5 t5Var = this.Y;
        t5Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        di.f4 f4Var2 = this.o1;
        if (f4Var2 != null) {
            f4Var2.e(true);
            this.o1 = null;
        }
        di.f4 f4Var3 = new di.f4(getContext(), 3);
        f4Var3.p(!z10);
        f4Var3.s(charSequence);
        f4Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        f4Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        f4Var3.d = 3000L;
        f4Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        f4Var3.l0 = new di.d4(f4Var3, 2);
        f4Var3.u();
        t5Var.addView(f4Var3, w7.x5.c(100.0f, -1));
        this.o1 = f4Var3;
        this.p1 = view;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        t3 t3Var;
        x2 x2Var;
        if (this.Y0.c(4) && (t3Var = this.e0) != null && (x2Var = t3Var.L) != null) {
            if (x2Var.h0) {
                return;
            }
            if (x2Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.x0 || this.Y0.b <= 0 || this.j0.N || this.g1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            i2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                j2(savedStarGift, this.D0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
                if (tL_starGiftUnique != null) {
                    h2(this.F0, tL_starGiftUnique, this.D0);
                }
            }
        }
        q2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSwipeStarts() {
        di.f4 f4Var = this.o1;
        if (f4Var != null) {
            f4Var.e(true);
            this.o1 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Serializable, org.telegram.ui.Components.ad[]] */
    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        j3 j3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        w3 w3Var;
        es0 es0Var;
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
        if (!this.N0 && ((j3Var = this.M0) == null || !j3Var.o)) {
            boolean[] zArr = new boolean[1];
            ?? r10 = new ad[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                es0Var = new es0((Dialog) this, zArr, (Object) starGiftAttribute2, (Serializable) r10, 28);
                w3Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                w3Var = this;
                es0Var = null;
            }
            r10[0] = (ad) ((lz0) w3Var.h0.e(string, starGiftAttribute2.name, J1, es0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        o3 o3Var = new o3(getContext(), this.resourcesProvider, new x0(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        oz0 oz0Var = this.h0;
        tableRow.addView(new nz0(oz0Var, string), layoutParams);
        tableRow.addView(new lz0(oz0Var, o3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        oz0Var.addView(tableRow);
        j3 j3Var2 = this.M0;
        if (j3Var2 != null) {
            if (c10 == 0) {
                j3Var2.d = o3Var;
            }
            if (c10 == 1) {
                j3Var2.c = o3Var;
            }
            if (c10 == 2) {
                j3Var2.b = o3Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z10) {
        LinearLayout f7 = wl.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
        f7.addView(frameLayout, w7.x5.t(64, 64, 49, 0, 6, 0, 0));
        aj0 aj0Var = new aj0(context);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(aj0Var, w7.x5.q(64, 64, 17));
        aj0Var.d();
        TextView b10 = w7.b6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        f7.addView(b10, w7.x5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.F6, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        f7.addView(b11, w7.x5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(f7);
        i2.g.B(R.string.OK, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2(int i10, boolean z10, mr0 mr0Var) {
        int i11;
        di.f4 f4Var;
        j3 j3Var;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z0 = null;
        }
        t3 t3Var = this.e0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(t3Var.i0);
        }
        if (!this.b1) {
            this.X0 = Float.valueOf(this.Y.d());
        }
        f4.d dVar = this.Y0;
        this.Y0 = new f4.d(dVar == null ? 0 : dVar.b, i10);
        hg.n0 n0Var = this.Q0;
        int finalHeight = t3Var.getFinalHeight();
        int z12 = z1();
        if (this.Y0.d(1)) {
            FrameLayout frameLayout = this.m0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                n0Var.F(finalHeight, z12 + i11);
                if (this.Y0.b == 0 && (j3Var = this.M0) != null) {
                    j3Var.c();
                }
                h2 h2Var = this.A0;
                int i12 = 2;
                h2 h2Var2 = this.y0;
                h2 h2Var3 = this.r0;
                h2 h2Var4 = this.f0;
                if (z10) {
                    this.Y0.c = 1.0f;
                    T1();
                    h2Var4.setVisibility(i10 == 0 ? 0 : 8);
                    h2Var3.setVisibility(i10 == 1 ? 0 : 8);
                    h2Var2.setVisibility(i10 == 2 ? 0 : 8);
                    h2Var.setVisibility(i10 != 3 ? 8 : 0);
                    s2();
                    if (mr0Var != null) {
                        mr0Var.run();
                    }
                } else {
                    h2Var4.setVisibility(this.Y0.b(0) ? 0 : 8);
                    h2Var3.setVisibility(this.Y0.b(1) ? 0 : 8);
                    h2Var2.setVisibility(this.Y0.b(2) ? 0 : 8);
                    h2Var.setVisibility(this.Y0.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.Z0 = ofFloat;
                    ofFloat.addUpdateListener(new ki.a(this, 21));
                    this.Z0.addListener(new gi(this, i10, mr0Var, i12));
                    this.Z0.setInterpolator(pr.h);
                    this.Z0.setDuration(320L);
                    this.Z0.start();
                    f4.d dVar2 = this.Y0;
                    x9[] x9VarArr = t3Var.d;
                    int i13 = dVar2.a;
                    int i14 = dVar2.b;
                    if (i13 != i14) {
                        xi0 lottieAnimation = x9VarArr[i13].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = x9VarArr[i14].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                    }
                }
                f4Var = this.o1;
                if (f4Var == null) {
                    f4Var.e(true);
                    this.o1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        n0Var.F(finalHeight, z12 + i11);
        if (this.Y0.b == 0) {
            j3Var.c();
        }
        h2 h2Var5 = this.A0;
        int i122 = 2;
        h2 h2Var22 = this.y0;
        h2 h2Var32 = this.r0;
        h2 h2Var42 = this.f0;
        if (z10) {
        }
        f4Var = this.o1;
        if (f4Var == null) {
        }
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            s5.y(this.currentAccount, false).Q(A1());
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
            s5.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.N0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.C0;
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
                j2(savedStarGift2, this.D0);
                this.h1 = null;
                this.N0 = false;
                k5 k5Var = this.D0;
                if (k5Var != null) {
                    k5Var.d();
                } else {
                    s5.y(this.currentAccount, false).Q(this.X);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.D0 == null) {
            s5.y(this.currentAccount, false).Q(A1());
        }
        this.N0 = true;
        this.C0 = null;
        this.B0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        i2(messageObject, this.D0);
        this.h1 = null;
        this.N0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final void r2(boolean z10) {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z11 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        di.d dVar = this.j0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    qc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new b1(this, 24)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new e2.h() { // from class: zh.c2
                    @Override // e2.h
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        w3 w3Var = w3.this;
                        if (tL_premium_boostsStatus != null) {
                            int i10 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i10 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j3 = A1;
                                boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new bi.i(w3Var, tL_premium_boostsStatus, j3, messagesController2, 4));
                                return;
                            }
                        }
                        w3Var.j0.setLoading(false);
                        w3Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        this.e0.I[1].a(!P1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!P1 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.x0) {
            dismiss();
            return;
        }
        mr0 mr0Var = new mr0(15, this, z11);
        if (this.Y0.c(0)) {
            mr0Var.run();
        } else {
            q2(0, true, mr0Var);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.b1, true);
        dVar.f(null, !this.b1);
        dVar.setOnClickListener(new u0(this, 0));
    }

    public final boolean s1() {
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.E0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.E0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.E0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j3 = this.X;
                if (O1(i10, j3)) {
                    int i11 = this.C0.flags;
                    if (((j3 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.m0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.o0;
        FrameLayout frameLayout3 = this.k0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.Y0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.Y0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.Y0.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.F0 != null && this.G0 == null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.F0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new cj1(9, this, b2Var));
        } else if (this.C0 == null && (messageObject = this.E0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new bi.c5(this, tL_messageActionStarGift, b2Var2, 23));
                        return;
                    }
                    if (E1() != null) {
                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var3.q(500L);
                        s5.y(this.currentAccount, false).M(E1(), new oj0(18, this, b2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null || K1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.E0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.C0;
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

    public final void t2() {
        boolean L1 = L1(false);
        g2 g2Var = this.Z;
        g2Var.setPosition(L1 ? 1 : 0);
        g2Var.C(false);
        if (this.D0 == null || L1(true) || this.D0.e() >= this.D0.c()) {
            return;
        }
        this.D0.a();
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new y1(this, K1, 1));
        }
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        hg.n0 n0Var = new hg.n0(this, 6);
        this.Q0 = n0Var;
        return n0Var;
    }

    public final void v1(final long j3, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j10;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.E0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j10 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j10 = savedStarGift.transfer_stars;
            peerDialogId = this.X;
        }
        if (j10 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = E1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new org.telegram.messenger.z6(this, callback, j3, peerDialogId, 4));
            return;
        }
        final long j11 = peerDialogId;
        s5 y3 = s5.y(this.currentAccount, false);
        if (!y3.e) {
            y3.r(new i21(this, y3, j3, callback, 6));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = E1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject p5 = fi.k3.p(this.resourcesProvider, false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: zh.h1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final w3 w3Var = w3.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j12 = j3;
                final long j13 = j11;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        w3.G0(w3.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j12, j13, callback2, tL_error);
                    }
                });
            }
        });
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j3;
        di.d dVar = this.j0;
        if (dVar.N || (E1 = E1()) == null) {
            return;
        }
        MessageObject messageObject = this.E0;
        String str = null;
        long j10 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j3 > 0 || this.l1 != null) {
            dVar.setLoading(true);
            mp mpVar = this.v0;
            if (j3 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = mpVar.a.q;
                upgradestargift.stargift = E1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new cj1(8, this, E1));
                return;
            }
            int i10 = 0;
            s5 y3 = s5.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new ug.r(17, this, y3));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.l1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = mpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.l1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new ja(this, str, E1, j10, 7));
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return this.S0;
    }

    public final int z1() {
        if (this.Y0.d(1)) {
            return this.r0.getMeasuredHeight();
        }
        if (this.Y0.d(2)) {
            return this.y0.getMeasuredHeight();
        }
        if (this.Y0.d(3)) {
            return this.A0.getMeasuredHeight();
        }
        if (this.Y0.d(4)) {
            return 0;
        }
        return this.f0.getMeasuredHeight();
    }
}
