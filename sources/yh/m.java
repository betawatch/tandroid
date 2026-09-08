package yh;

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
import di.c9;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.o91;
import w7.x5;
import zh.k7;
import zh.s5;
import zh.v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int A0 = 0;
    public final long X;
    public final h51 Y;
    public final zh.a Z;
    public final i a0;
    public final yf.n b0;
    public final h c0;
    public final sg.v0 d0;
    public final sg.v0 e0;
    public final sg.v0 f0;
    public final org.telegram.ui.Cells.l4 g0;
    public final q6 h0;
    public final k i0;
    public final k[] j0;
    public final FrameLayout k0;
    public GiftAuctionController.Auction l0;
    public final l m0;
    public Runnable n0;
    public long o0;
    public long p0;
    public boolean q0;
    public final nq[] r0;
    public z5 s0;
    public final le.b t0;
    public final le.b u0;
    public final nq[] v0;
    public boolean w0;
    public v51 x0;
    public boolean y0;
    public boolean z0;

    public m(Context context, f6 f6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, f6Var);
        this.j0 = new k[3];
        this.q0 = true;
        this.r0 = new nq[1];
        f fVar = new f(this);
        pr prVar = pr.h;
        this.t0 = new le.b(0, fVar, prVar, 380L, false);
        this.u0 = new le.b(0, new f(this), prVar, 380L, false);
        this.v0 = new nq[1];
        this.l0 = auction;
        this.m0 = lVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.b0 = new yf.n(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, f6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = h51.j(-1, linearLayout);
        h hVar = new h(this, context, f6Var);
        this.c0 = hVar;
        hVar.O = true;
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
        h hVar2 = this.c0;
        hVar2.e0 = iArr2;
        linearLayout.addView(hVar2, x5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        sg.v0 v0Var = new sg.v0(context, f6Var);
        this.d0 = v0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i16 = j6.a7;
        int themedColor = getThemedColor(i16);
        int h = i0.a.h(getThemedColor(j6.i6), getThemedColor(i16));
        v0Var.setBackground(j6.i0(dp, dp, dp, dp, themedColor, h, h));
        v0Var.setOnClickListener(new g(this, i14));
        ((TextView) v0Var.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        sg.v0 v0Var2 = new sg.v0(context, f6Var);
        this.e0 = v0Var2;
        v0Var2.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) v0Var2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        sg.v0 v0Var3 = new sg.v0(context, f6Var);
        this.f0 = v0Var3;
        v0Var3.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) v0Var3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(v0Var, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(v0Var2, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(v0Var3, x5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, x5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        int i17 = 17;
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            d90 d90Var = new d90(context, f6Var);
            d90Var.setGravity(17);
            d90Var.setTextSize(1, 16.0f);
            int i18 = j6.J6;
            d90Var.setTextColor(j6.v0(i18, f6Var));
            d90Var.setLinkTextColor(j6.v0(i18, f6Var));
            d90Var.setOnClickListener(new yg.e(this, new boolean[1], f6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new z5(subscribeToGiftAuction.giftDocumentId, d90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            d90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            w7.z5.b(d90Var, 0.02f, 1.5f);
            linearLayout.addView(d90Var, x5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i19 = j6.L6;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i19, 21, 0, 0, false, true, f6Var);
        this.g0 = l4Var;
        linearLayout.addView(l4Var, x5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        q6 q6Var = new q6(context, false, false, false);
        this.h0 = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(12.5f));
        q6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q6Var.setSizeableBackground(j6.Z(0, 0, 9, 9));
        q6Var.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new sg.p0(this, i17));
        l4Var.addView(q6Var, x5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, f6Var);
        this.i0 = kVar;
        kVar.b.setTextColor(getThemedColor(i19));
        kVar.c(user);
        linearLayout.addView(kVar, x5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i19, 21, 15, 0, false, false, f6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, x5.n(-1, -2));
        int i20 = 0;
        while (true) {
            k[] kVarArr = this.j0;
            if (i20 >= kVarArr.length) {
                break;
            }
            kVarArr[i20] = new k(context, f6Var);
            int i21 = i20 + 1;
            this.j0[i20].b(i21, true, false);
            this.j0[i20].setBackground(j6.K0(false));
            k kVar2 = this.j0[i20];
            kVar2.f = i20 < 2;
            kVar2.setOnClickListener(new ah.f(25));
            linearLayout.addView(this.j0[i20], x5.n(-1, -2));
            i20 = i21;
        }
        i iVar = new i(context, f6Var, true);
        this.a0 = iVar;
        iVar.e();
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = d.leftMargin;
        int i23 = this.backgroundPaddingLeft;
        d.leftMargin = i22 + i23;
        d.rightMargin += i23;
        this.containerView.addView(iVar, d);
        ll0 ll0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new n7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.c0.setValue((int) j10);
        } else {
            this.c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        zh.a aVar = new zh.a(context, this.currentAccount, f6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new o91(context, 1, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        this.container.addView(frameLayout, x5.e(-1, 100, 48));
        a0();
        this.x0.N(false);
    }

    public static void P(m mVar, long j3) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j3)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == UserConfig.getInstance(mVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = mVar.n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.c0.getValue();
        int minimumBid = (int) mVar.l0.getMinimumBid();
        if (value >= minimumBid) {
            mVar.X(value);
        } else {
            AndroidUtilities.shakeView(mVar.a0);
            new yc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void R(m mVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new bi.o4(mVar, zArr, f6Var, 8));
    }

    public static void S(m mVar, long j3, Boolean bool, String str) {
        FrameLayout frameLayout = mVar.k0;
        mVar.a0.setLoading(false);
        mVar.z0 = false;
        if (bool != null) {
            boolean z10 = j3 > 0;
            mc mcVar = new mc(mVar.getContext(), mVar.resourcesProvider);
            mcVar.a.setImageResource(R.drawable.filled_gift_sell_24);
            String string = LocaleController.getString(z10 ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced);
            TextView textView = mcVar.b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.l0.gift.gifts_per_round));
            TextView textView2 = mcVar.c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            qc.f(frameLayout, mcVar, 2750).j();
            s5.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            i2.g.s(R.string.UnknownErrorCode, new Object[]{str}, new yc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.c0.f(bi.z.b(mVar.currentAccount, i10, 3), bi.z.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.w0);
        mVar.d0(mVar.w0);
        mVar.Z(mVar.w0);
        mVar.W();
    }

    public static void U(m mVar) {
        Context context = mVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.l0.gift.gifts_per_round));
        b6 b6Var = new b6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        b6Var.setTextSize(1, 18.0f);
        b6Var.setTextColor(j6.v0(j6.j5, mVar.resourcesProvider));
        b6Var.setHintColor(j6.v0(j6.Xh, mVar.resourcesProvider));
        b6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        b6Var.setFocusable(true);
        int i10 = 2;
        b6Var.setInputType(2);
        b6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        b6Var.setLineColors(j6.v0(j6.k6, mVar.resourcesProvider), j6.v0(j6.l6, mVar.resourcesProvider), j6.v0(j6.p7, mVar.resourcesProvider));
        b6Var.setImeOptions(268435462);
        b6Var.setBackgroundDrawable(null);
        b6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        b6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(b6Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new sg.x(10, mVar, b6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(25));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new fi.t0(b6Var, R, findActivity, 5));
        b2VarArr[0].setOnShowListener(new ig.r(i10, b6Var));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].h0 = false;
        b6Var.setSelection(b6Var.getText().length());
    }

    public final void V() {
        boolean z10 = this.w0 && !isDismissed();
        if (this.y0 != z10) {
            this.y0 = z10;
            zh.a aVar = this.Z;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                aVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        h hVar = this.c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j3 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        if (j3 == j10) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j10 <= 0 || tL_StarGiftAuctionUserState.returned) {
            hVar.g(null);
            return;
        }
        long j11 = j3 - j10;
        if (j11 <= 0) {
            hVar.g(null);
            return;
        }
        hVar.g("+" + LocaleController.formatNumber(j11, ','));
    }

    public final void X(int i10) {
        if (this.z0) {
            return;
        }
        long j3 = this.l0.auctionUserState.bid_amount;
        long j10 = i10;
        if (j3 > 0) {
            j10 -= j3;
        }
        long j11 = j10;
        if (s5.y(this.currentAccount, false).e && s5.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new k7(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.z0 = true;
        this.a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new gi.o0(this, j3, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        if (this.shadowDrawable == null || this.containerView == null || (frameLayout = this.k0) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
    }

    public final void Z(boolean z10) {
        long value = this.c0.getValue();
        long currentMyBid = this.l0.getCurrentMyBid();
        int i10 = 0;
        int i11 = 1;
        i iVar = this.a0;
        if (value == currentMyBid) {
            iVar.g(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        nq[] nqVarArr = this.v0;
        if (j3 >= value || tL_StarGiftAuctionUserState.returned) {
            iVar.g(v7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), nqVarArr), z10, true);
        } else {
            iVar.g(v7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), nqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, i11));
    }

    public final void a0() {
        int d = i0.a.d(this.t0.e, i0.a.d(this.u0.e, getThemedColor(j6.L6), getThemedColor(j6.q7)), getThemedColor(j6.uj));
        this.g0.setTextColor(d);
        q6 q6Var = this.h0;
        q6Var.setTextColor(d);
        this.i0.b.setTextColor(d);
        if (j6.B1(q6Var.getSizeableBackground(), j6.l1(0.15f, d), false)) {
            q6Var.invalidate();
        }
    }

    public final void b0(long j3, boolean z10) {
        ((q6) this.e0.b).c(j3 >= 3600 ? AndroidUtilities.formatFullDuration((int) j3) : AndroidUtilities.formatDurationNoHours((int) j3, true), z10, true);
    }

    public final void c0(boolean z10) {
        long value = this.c0.getValue();
        int approximatedMyPlace = this.l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.l0.getCurrentMyBid());
        k kVar = this.i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        q6 q6Var = this.h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.l0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                q6Var.setText(this.l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        q6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.l0.getBidStatus();
        long value = this.c0.getValue();
        long j3 = this.l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.l4 l4Var = this.g0;
        boolean z12 = false;
        if (value <= j3) {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.t0.a(z12, z10);
            this.u0.a(z11, z10);
        }
        l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        z11 = false;
        this.t0.a(z12, z10);
        this.u0.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((q6) this.d0.b).c(v7.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.l0.getMinimumBid(), ','), 0.78f, this.r0), z10, true);
        if (this.l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.l0.isUpcoming(currentTime);
            yf.n nVar = this.b0;
            if (isUpcoming) {
                long max = Math.max(0, this.l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                b0(max2, z10);
            }
            z5 z5Var = this.s0;
            sg.v0 v0Var = this.f0;
            if (z5Var == null && this.l0.gift.sticker != null) {
                this.s0 = new z5(this.l0.gift.sticker.id, ((q6) v0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.l0.auctionStateActive.gifts_left, ','));
            ((q6) v0Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.e0.c;
            if (this.l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.l0.auctionStateActive;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.j0;
            int min = Math.min(kVarArr.length, this.l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new bi.o2(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.l0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        h hVar = this.c0;
        hVar.setStarsTop(approximateBidAmountFromPlace);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.l0.auctionUserState.peer);
        long j3 = this.l0.auctionUserState.acquired_count;
        if (this.p0 < j3 && !this.q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.o0;
            if (j10 != 0) {
                co R9 = co.R9(j10);
                R9.whenFullyVisible(new og.b(R9, 1));
                R.presentFragment(R9);
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
        V();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.w0 = false;
        V();
        qc.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.w0 = true;
        V();
        qc.a(this.container, new c9(16));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.l0 = auction;
        e0(this.w0);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 13), this.resourcesProvider);
        this.x0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
