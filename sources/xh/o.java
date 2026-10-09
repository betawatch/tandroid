package xh;

import ai.d5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.a9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o91;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
import yh.e7;
import yh.m5;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o extends eb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int A0 = 0;
    public final long X;
    public final p61 Y;
    public final yh.a Z;
    public final j a0;
    public final yf.n b0;
    public final i c0;
    public final m d0;
    public final m e0;
    public final m f0;
    public final org.telegram.ui.Cells.m4 g0;
    public final r6 h0;
    public final l i0;
    public final l[] j0;
    public final FrameLayout k0;
    public GiftAuctionController.Auction l0;
    public final n m0;
    public Runnable n0;
    public long o0;
    public long p0;
    public boolean q0;
    public final er[] r0;
    public b6 s0;
    public final me.b t0;
    public final me.b u0;
    public final er[] v0;
    public boolean w0;
    public c71 x0;
    public boolean y0;
    public boolean z0;

    public o(Context context, e6 e6Var, n nVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, e6Var);
        this.j0 = new l[3];
        this.q0 = true;
        this.r0 = new er[1];
        g gVar = new g(this);
        hs hsVar = hs.h;
        this.t0 = new me.b(0, gVar, hsVar, 380L, false);
        this.u0 = new me.b(0, new g(this), hsVar, 380L, false);
        this.v0 = new er[1];
        this.l0 = auction;
        this.m0 = nVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.b0 = new yf.n(new g(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        x.T(this.e, context, e6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = p61.j(-1, linearLayout);
        i iVar = new i(this, context, e6Var);
        this.c0 = iVar;
        iVar.O = true;
        this.l0.getMinimumBid();
        this.l0.getCurrentMyBid();
        long currentTopBid = this.l0.getCurrentTopBid();
        int i10 = currentTopBid > 100000 ? ((((int) currentTopBid) * 3) / 2000) * MediaDataController.MAX_STYLE_RUNS_COUNT : currentTopBid > 30000 ? 100000 : 50000;
        int i11 = 15;
        int[] iArr = {50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, MediaController.VIDEO_BITRATE_480, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 >= 50) {
                z10 = i13 == 50 ? false : z10;
                if (i13 <= i10) {
                    arrayList.add(Integer.valueOf(i13));
                    if (iArr[i12] == i10) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i10));
                    break;
                }
            } else {
                z10 = true;
            }
            i12++;
            i11 = 15;
        }
        if (z10) {
            arrayList.add(0, 50);
        }
        int i14 = 2;
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            iArr2[i15] = ((Integer) arrayList.get(i15)).intValue();
        }
        i iVar2 = this.c0;
        iVar2.e0 = iArr2;
        linearLayout.addView(iVar2, x5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        m mVar = new m(context, e6Var);
        this.d0 = mVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i16 = i6.a7;
        int themedColor = getThemedColor(i16);
        int h = i0.a.h(getThemedColor(i6.i6), getThemedColor(i16));
        mVar.setBackground(i6.j0(dp, dp, dp, dp, themedColor, h, h));
        mVar.setOnClickListener(new h(this, i14));
        ((TextView) mVar.b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        m mVar2 = new m(context, e6Var);
        this.e0 = mVar2;
        mVar2.setBackground(i6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) mVar2.b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        m mVar3 = new m(context, e6Var);
        this.f0 = mVar3;
        mVar3.setBackground(i6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) mVar3.b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(mVar, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(mVar2, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(mVar3, x5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, x5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            ea0 ea0Var = new ea0(context, e6Var);
            ea0Var.setGravity(17);
            ea0Var.setTextSize(1, 16.0f);
            int i17 = i6.J6;
            ea0Var.setTextColor(i6.w0(i17, e6Var));
            ea0Var.setLinkTextColor(i6.w0(i17, e6Var));
            ea0Var.setOnClickListener(new xg.e(this, new boolean[1], e6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new b6(subscribeToGiftAuction.giftDocumentId, ea0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            ea0Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            z5.b(ea0Var, 0.02f, 1.5f);
            linearLayout.addView(ea0Var, x5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i18 = i6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i18, 21, 0, 0, false, true, e6Var);
        this.g0 = m4Var;
        linearLayout.addView(m4Var, x5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        r6 r6Var = new r6(context, false, false, false);
        this.h0 = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(12.5f));
        r6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        r6Var.setSizeableBackground(i6.a0(0, 0, 9, 9));
        r6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new rg.x1(this, 16));
        m4Var.addView(r6Var, x5.a(17.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 51));
        l lVar = new l(context, e6Var);
        this.i0 = lVar;
        lVar.b.setTextColor(getThemedColor(i18));
        lVar.c(user);
        linearLayout.addView(lVar, x5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i18, 21, 15, 0, false, false, e6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, x5.n(-1, -2));
        int i19 = 0;
        while (true) {
            l[] lVarArr = this.j0;
            if (i19 >= lVarArr.length) {
                break;
            }
            lVarArr[i19] = new l(context, e6Var);
            int i20 = i19 + 1;
            this.j0[i19].b(i20, true, false);
            this.j0[i19].setBackground(i6.L0(false));
            l lVar2 = this.j0[i19];
            lVar2.f = i19 < 2;
            lVar2.setOnClickListener(new ai.e2(24));
            linearLayout.addView(this.j0[i19], x5.n(-1, -2));
            i19 = i20;
        }
        j jVar = new j(context, e6Var, true);
        this.a0 = jVar;
        jVar.e();
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i21 = a2.leftMargin;
        int i22 = this.backgroundPaddingLeft;
        a2.leftMargin = i21 + i22;
        a2.rightMargin += i22;
        this.containerView.addView(jVar, a2);
        qm0 qm0Var = this.d;
        int i23 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i23, 0, i23, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.c0.setValue((int) j10);
        } else {
            this.c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        f0(false);
        this.d.setOverScrollMode(2);
        yh.a aVar = new yh.a(context, this.currentAccount, e6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        z5.a(aVar);
        aVar.setOnClickListener(new o91(context, 1, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        this.container.addView(frameLayout, x5.e(-1, 100, 48));
        b0();
        this.x0.N(false);
    }

    public static void Q(o oVar, long j3) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j3)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == UserConfig.getInstance(oVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = oVar.n0;
        if (runnable != null) {
            runnable.run();
        }
        oVar.dismiss();
    }

    public static void R(o oVar) {
        int value = oVar.c0.getValue();
        int minimumBid = (int) oVar.l0.getMinimumBid();
        if (value >= minimumBid) {
            oVar.Y(value);
        } else {
            AndroidUtilities.shakeView(oVar.a0);
            new ad(oVar.container, oVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void S(o oVar, boolean[] zArr, e6 e6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(oVar.currentAccount).getOrRequestAcquiredGifts(oVar.X, new d5(oVar, zArr, e6Var, 11));
    }

    public static void T(o oVar, long j3, Boolean bool, String str) {
        FrameLayout frameLayout = oVar.k0;
        oVar.a0.setLoading(false);
        oVar.z0 = false;
        if (bool != null) {
            boolean z10 = j3 > 0;
            pc pcVar = new pc(oVar.getContext(), oVar.resourcesProvider);
            pcVar.a.setImageResource(R.drawable.filled_gift_sell_24);
            String string = LocaleController.getString(z10 ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced);
            TextView textView = pcVar.b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(oVar.l0.gift.gifts_per_round));
            TextView textView2 = pcVar.c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            oVar.Z();
            tc.f(frameLayout, pcVar, 2750).j();
            m5.y(oVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            oVar.Z();
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad(frameLayout, oVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void U(o oVar, int i10) {
        oVar.c0.f(ai.g0.b(oVar.currentAccount, i10, 3), ai.g0.b(oVar.currentAccount, i10, 4), true);
        oVar.d0(oVar.w0);
        oVar.e0(oVar.w0);
        oVar.a0(oVar.w0);
        oVar.X();
    }

    public static void V(o oVar) {
        Context context = oVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, oVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(oVar.l0.gift.gifts_per_round));
        c6 c6Var = new c6(context, oVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        c6Var.setTextSize(1, 18.0f);
        c6Var.setTextColor(i6.w0(i6.j5, oVar.resourcesProvider));
        c6Var.setHintColor(i6.w0(i6.Xh, oVar.resourcesProvider));
        c6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        c6Var.setFocusable(true);
        int i10 = 2;
        c6Var.setInputType(2);
        c6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c6Var.setLineColors(i6.w0(i6.k6, oVar.resourcesProvider), i6.w0(i6.l6, oVar.resourcesProvider), i6.w0(i6.p7, oVar.resourcesProvider));
        c6Var.setImeOptions(268435462);
        c6Var.setBackgroundDrawable(null);
        c6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        c6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        c6Var.addTextChangedListener(new k(oVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(c6Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new qg.x1(15, oVar, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xa.b(1));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new ei.t0(c6Var, R, findActivity, 5));
        b2VarArr[0].setOnShowListener(new hg.s(i10, c6Var));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].h0 = false;
        c6Var.setSelection(c6Var.getText().length());
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    public final void W() {
        boolean z10 = this.w0 && !isDismissed();
        if (this.y0 != z10) {
            this.y0 = z10;
            yh.a aVar = this.Z;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                bi.s(aVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void X() {
        i iVar = this.c0;
        int value = iVar.getValue();
        if (iVar.getProgress() > 0.99f) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j3 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        if (j3 == j10) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j10 <= 0 || tL_StarGiftAuctionUserState.returned) {
            iVar.g(null);
            return;
        }
        long j11 = j3 - j10;
        if (j11 <= 0) {
            iVar.g(null);
            return;
        }
        iVar.g("+" + LocaleController.formatNumber(j11, ','));
    }

    public final void Y(int i10) {
        if (this.z0) {
            return;
        }
        long j3 = this.l0.auctionUserState.bid_amount;
        long j10 = j3 > 0 ? i10 - j3 : i10;
        if (m5.y(this.currentAccount, false).e && m5.y(this.currentAccount, false).q(false, false, null).amount < j10) {
            new e7(getContext(), this.resourcesProvider, j10, 14, null, null, 0L).show();
            return;
        }
        this.z0 = true;
        this.a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new fi.o0(this, j3, 3));
    }

    public final void Z() {
        FrameLayout frameLayout;
        if (this.shadowDrawable == null || this.containerView == null || (frameLayout = this.k0) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
    }

    public final void a0(boolean z10) {
        long value = this.c0.getValue();
        long currentMyBid = this.l0.getCurrentMyBid();
        int i10 = 0;
        int i11 = 1;
        j jVar = this.a0;
        if (value == currentMyBid) {
            jVar.g(LocaleController.getString(R.string.OK), z10, true);
            jVar.setOnClickListener(new h(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        er[] erVarArr = this.v0;
        if (j3 >= value || tL_StarGiftAuctionUserState.returned) {
            jVar.g(p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), erVarArr), z10, true);
        } else {
            jVar.g(p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), erVarArr), z10, true);
        }
        jVar.setOnClickListener(new h(this, i11));
    }

    public final void b0() {
        int d = i0.a.d(this.t0.e, i0.a.d(this.u0.e, getThemedColor(i6.L6), getThemedColor(i6.q7)), getThemedColor(i6.uj));
        this.g0.setTextColor(d);
        r6 r6Var = this.h0;
        r6Var.setTextColor(d);
        this.i0.b.setTextColor(d);
        if (i6.C1(r6Var.getSizeableBackground(), i6.m1(0.15f, d), false)) {
            r6Var.invalidate();
        }
    }

    public final void c0(long j3, boolean z10) {
        ((r6) this.e0.c).c(j3 >= 3600 ? AndroidUtilities.formatFullDuration((int) j3) : AndroidUtilities.formatDurationNoHours((int) j3, true), z10, true);
    }

    public final void d0(boolean z10) {
        long value = this.c0.getValue();
        int approximatedMyPlace = this.l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.l0.getCurrentMyBid());
        l lVar = this.i0;
        lVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        lVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        r6 r6Var = this.h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.l0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                r6Var.setText(this.l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        r6Var.setText(null);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.l0.getBidStatus();
        long value = this.c0.getValue();
        long j3 = this.l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.m4 m4Var = this.g0;
        boolean z12 = false;
        if (value <= j3) {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.t0.a(z12, z10);
            this.u0.a(z11, z10);
        }
        m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        z11 = false;
        this.t0.a(z12, z10);
        this.u0.a(z11, z10);
    }

    public final void f0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((r6) this.d0.c).c(p7.Y0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.l0.getMinimumBid(), ','), 0.78f, this.r0), z10, true);
        if (this.l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.l0.isUpcoming(currentTime);
            yf.n nVar = this.b0;
            if (isUpcoming) {
                long max = Math.max(0, this.l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                c0(max, z10);
            } else {
                long max2 = Math.max(0, this.l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                c0(max2, z10);
            }
            b6 b6Var = this.s0;
            m mVar = this.f0;
            if (b6Var == null && this.l0.gift.sticker != null) {
                this.s0 = new b6(this.l0.gift.sticker.id, ((r6) mVar.c).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.l0.auctionStateActive.gifts_left, ','));
            ((r6) mVar.c).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.e0.b;
            if (this.l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.l0.auctionStateActive;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i10));
            l[] lVarArr = this.j0;
            int min = Math.min(lVarArr.length, this.l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        lVarArr[i11].c(user);
                    }
                    lVarArr[i11].a(this.l0.approximateBidAmountFromPlace(i12), z10);
                    lVarArr[i11].setOnClickListener(new ai.b3(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.l0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        i iVar = this.c0;
        iVar.setStarsTop(approximateBidAmountFromPlace);
        iVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.l0.gift.gifts_per_round, new Object[0]));
        d0(z10);
        e0(z10);
        a0(z10);
        X();
        long peerDialogId = DialogObject.getPeerDialogId(this.l0.auctionUserState.peer);
        long j3 = this.l0.auctionUserState.acquired_count;
        if (this.p0 < j3 && !this.q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.o0;
            if (j10 != 0) {
                zn W9 = zn.W9(j10);
                W9.whenFullyVisible(new ng.b(W9, 1));
                R.presentFragment(W9);
                Runnable runnable = this.n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.o0 = peerDialogId;
        }
        this.p0 = j3;
        this.q0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        W();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.w0 = false;
        W();
        tc.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.w0 = true;
        W();
        tc.a(this.container, new a9(16));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.l0 = auction;
        f0(this.w0);
    }

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 13), this.resourcesProvider);
        this.x0 = c71Var;
        c71Var.r = false;
        return c71Var;
    }
}
