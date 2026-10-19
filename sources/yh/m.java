package yh;

import ai.cd;
import ai.ga;
import ai.md;
import ai.pd;
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
import ei.o8;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int A0 = 0;
    public final long X;
    public final g61 Y;
    public final ai.c Z;
    public final i a0;
    public final zf.n b0;
    public final h c0;
    public final rg.k0 d0;
    public final rg.k0 e0;
    public final rg.k0 f0;
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
    public final yq[] r0;
    public a6 s0;
    public final ne.b t0;
    public final ne.b u0;
    public final yq[] v0;
    public boolean w0;
    public t61 x0;
    public boolean y0;
    public boolean z0;

    public m(Context context, d6 d6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, d6Var);
        this.j0 = new k[3];
        this.q0 = true;
        this.r0 = new yq[1];
        f fVar = new f(this);
        bs bsVar = bs.h;
        this.t0 = new ne.b(0, fVar, bsVar, 380L, false);
        this.u0 = new ne.b(0, new f(this), bsVar, 380L, false);
        this.v0 = new yq[1];
        this.l0 = auction;
        this.m0 = lVar;
        long j10 = auction.giftId;
        this.X = j10;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.b0 = new zf.n(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.T(this.e, context, d6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = g61.j(-1, linearLayout);
        h hVar = new h(this, context, d6Var);
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
        linearLayout.addView(hVar2, z5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        rg.k0 k0Var = new rg.k0(context, d6Var);
        this.d0 = k0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i16 = h6.a7;
        int themedColor = getThemedColor(i16);
        int k10 = i0.a.k(getThemedColor(h6.i6), getThemedColor(i16));
        k0Var.setBackground(h6.j0(dp, dp, dp, dp, themedColor, k10, k10));
        k0Var.setOnClickListener(new g(this, i14));
        ((TextView) k0Var.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        rg.k0 k0Var2 = new rg.k0(context, d6Var);
        this.e0 = k0Var2;
        k0Var2.setBackground(h6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) k0Var2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        rg.k0 k0Var3 = new rg.k0(context, d6Var);
        this.f0 = k0Var3;
        k0Var3.setBackground(h6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16)));
        ((TextView) k0Var3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(k0Var, z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), z5.l(0.0f, 10, -1));
        linearLayout2.addView(k0Var2, z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), z5.l(0.0f, 10, -1));
        linearLayout2.addView(k0Var3, z5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, z5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            x90 x90Var = new x90(context, d6Var);
            x90Var.setGravity(17);
            x90Var.setTextSize(1, 16.0f);
            int i17 = h6.J6;
            x90Var.setTextColor(h6.w0(i17, d6Var));
            x90Var.setLinkTextColor(h6.w0(i17, d6Var));
            x90Var.setOnClickListener(new n41(this, new boolean[1], d6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new a6(subscribeToGiftAuction.giftDocumentId, x90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            x90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            b6.b(x90Var, 0.02f, 1.5f);
            linearLayout.addView(x90Var, z5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i18 = h6.L6;
        int i19 = 2;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i18, 21, 0, 0, false, true, d6Var);
        this.g0 = l4Var;
        linearLayout.addView(l4Var, z5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        q6 q6Var = new q6(context, false, false, false);
        this.h0 = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(12.5f));
        q6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q6Var.setSizeableBackground(h6.a0(0, 0, 9, 9));
        q6Var.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new tg.p(this, 13));
        l4Var.addView(q6Var, z5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, d6Var);
        this.i0 = kVar;
        kVar.b.setTextColor(getThemedColor(i18));
        kVar.c(user);
        linearLayout.addView(kVar, z5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i18, 21, 15, 0, false, false, d6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, z5.n(-1, -2));
        int i20 = 0;
        while (true) {
            k[] kVarArr = this.j0;
            if (i20 >= kVarArr.length) {
                break;
            }
            kVarArr[i20] = new k(context, d6Var);
            int i21 = i20 + 1;
            this.j0[i20].b(i21, true, false);
            this.j0[i20].setBackground(h6.L0(false));
            k kVar2 = this.j0[i20];
            kVar2.f = i20 < 2;
            kVar2.setOnClickListener(new ah.f(27));
            linearLayout.addView(this.j0[i20], z5.n(-1, -2));
            i20 = i21;
        }
        i iVar = new i(context, d6Var, true);
        this.a0 = iVar;
        iVar.e();
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = d.leftMargin;
        int i23 = this.backgroundPaddingLeft;
        d.leftMargin = i22 + i23;
        d.rightMargin += i23;
        this.containerView.addView(iVar, d);
        im0 im0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        im0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new n7(4));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.c0.setValue((int) j11);
        } else {
            this.c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        f0(false);
        this.d.setOverScrollMode(2);
        ai.c cVar = new ai.c(context, this.currentAccount, d6Var);
        this.Z = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        b6.a(cVar);
        cVar.setOnClickListener(new pd(context, i19, d6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        this.container.addView(frameLayout, z5.e(-1, 100, 48));
        b0();
        this.x0.N(false);
    }

    public static void Q(m mVar, long j10) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(mVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
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

    public static void R(m mVar) {
        int value = mVar.c0.getValue();
        int minimumBid = (int) mVar.l0.getMinimumBid();
        if (value >= minimumBid) {
            mVar.Y(value);
        } else {
            AndroidUtilities.shakeView(mVar.a0);
            new xc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void S(m mVar, boolean[] zArr, d6 d6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new ai.a4(mVar, zArr, d6Var, 12));
    }

    public static void T(m mVar, long j10, Boolean bool, String str) {
        FrameLayout frameLayout = mVar.k0;
        mVar.a0.setLoading(false);
        mVar.z0 = false;
        if (bool != null) {
            boolean z10 = j10 > 0;
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
            mVar.Z();
            qc.f(frameLayout, mcVar, 2750).j();
            ga.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Z();
            i2.e.s(R.string.UnknownErrorCode, new Object[]{str}, new xc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void U(m mVar, int i10) {
        mVar.c0.f(ci.u.b(mVar.currentAccount, i10, 3), ci.u.b(mVar.currentAccount, i10, 4), true);
        mVar.d0(mVar.w0);
        mVar.e0(mVar.w0);
        mVar.a0(mVar.w0);
        mVar.X();
    }

    public static void V(m mVar) {
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
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        b6Var.setTextSize(1, 18.0f);
        b6Var.setTextColor(h6.w0(h6.j5, mVar.resourcesProvider));
        b6Var.setHintColor(h6.w0(h6.Xh, mVar.resourcesProvider));
        b6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        b6Var.setFocusable(true);
        int i10 = 2;
        b6Var.setInputType(2);
        b6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        b6Var.setLineColors(h6.w0(h6.k6, mVar.resourcesProvider), h6.w0(h6.l6, mVar.resourcesProvider), h6.w0(h6.p7, mVar.resourcesProvider));
        b6Var.setImeOptions(268435462);
        b6Var.setBackgroundDrawable(null);
        b6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        b6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(b6Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new org.telegram.ui.web.m(21, mVar, b6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ya.b(1));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new gi.r0(b6Var, R, findActivity, 5));
        b2VarArr[0].setOnShowListener(new ig.r(i10, b6Var));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].h0 = false;
        b6Var.setSelection(b6Var.getText().length());
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    public final void W() {
        boolean z10 = this.w0 && !isDismissed();
        if (this.y0 != z10) {
            this.y0 = z10;
            ai.c cVar = this.Z;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                kk.s(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void X() {
        h hVar = this.c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            hVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            hVar.g(null);
            return;
        }
        hVar.g("+" + LocaleController.formatNumber(j12, ','));
    }

    public final void Y(int i10) {
        if (this.z0) {
            return;
        }
        long j10 = this.l0.auctionUserState.bid_amount;
        long j11 = j10 > 0 ? i10 - j10 : i10;
        if (ga.y(this.currentAccount, false).e && ga.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new cd(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.z0 = true;
        this.a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new hi.n0(this, j10, 3));
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
        i iVar = this.a0;
        if (value == currentMyBid) {
            iVar.g(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        yq[] yqVarArr = this.v0;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            iVar.g(md.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), yqVarArr), z10, true);
        } else {
            iVar.g(md.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), yqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, i11));
    }

    public final void b0() {
        int f7 = i0.a.f(this.t0.e, i0.a.f(this.u0.e, getThemedColor(h6.L6), getThemedColor(h6.q7)), getThemedColor(h6.uj));
        this.g0.setTextColor(f7);
        q6 q6Var = this.h0;
        q6Var.setTextColor(f7);
        this.i0.b.setTextColor(f7);
        if (h6.C1(q6Var.getSizeableBackground(), h6.m1(0.15f, f7), false)) {
            q6Var.invalidate();
        }
    }

    public final void c0(long j10, boolean z10) {
        ((q6) this.e0.b).c(j10 >= 3600 ? AndroidUtilities.formatFullDuration((int) j10) : AndroidUtilities.formatDurationNoHours((int) j10, true), z10, true);
    }

    public final void d0(boolean z10) {
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
        long j10 = this.l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.l4 l4Var = this.g0;
        boolean z12 = false;
        if (value <= j10) {
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

    public final void f0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((q6) this.d0.b).c(md.Y0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.l0.getMinimumBid(), ','), 0.78f, this.r0), z10, true);
        if (this.l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.l0.isUpcoming(currentTime);
            zf.n nVar = this.b0;
            if (isUpcoming) {
                long max = Math.max(0, this.l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                c0(max, z10);
            } else {
                long max2 = Math.max(0, this.l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                c0(max2, z10);
            }
            a6 a6Var = this.s0;
            rg.k0 k0Var = this.f0;
            if (a6Var == null && this.l0.gift.sticker != null) {
                this.s0 = new a6(this.l0.gift.sticker.id, ((q6) k0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.l0.auctionStateActive.gifts_left, ','));
            ((q6) k0Var.b).c(spannableStringBuilder, z10, true);
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
                    kVarArr[i11].setOnClickListener(new ci.b2(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.l0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        h hVar = this.c0;
        hVar.setStarsTop(approximateBidAmountFromPlace);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.l0.gift.gifts_per_round, new Object[0]));
        d0(z10);
        e0(z10);
        a0(z10);
        X();
        long peerDialogId = DialogObject.getPeerDialogId(this.l0.auctionUserState.peer);
        long j10 = this.l0.auctionUserState.acquired_count;
        if (this.p0 < j10 && !this.q0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.o0;
            if (j11 != 0) {
                qn W9 = qn.W9(j11);
                W9.whenFullyVisible(new og.b(W9, 1));
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
        this.p0 = j10;
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
        qc.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.w0 = true;
        W();
        qc.a(this.container, new o8(16));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.l0 = auction;
        f0(this.w0);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 24), this.resourcesProvider);
        this.x0 = t61Var;
        t61Var.r = false;
        return t61Var;
    }
}
