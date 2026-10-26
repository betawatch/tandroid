package zh;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.gd;
import bi.tc;
import fi.k8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int A0 = 0;
    public final long X;
    public final t61 Y;
    public final bi.c Z;
    public final i a0;
    public final ag.t b0;
    public final h c0;
    public final tg.t0 d0;
    public final tg.t0 e0;
    public final tg.t0 f0;
    public final org.telegram.ui.Cells.q4 g0;
    public final s6 h0;
    public final k i0;
    public final k[] j0;
    public final FrameLayout k0;
    public GiftAuctionController.Auction l0;
    public final l m0;
    public Runnable n0;
    public long o0;
    public long p0;
    public boolean q0;
    public final zq[] r0;
    public c6 s0;
    public final oe.b t0;
    public final oe.b u0;
    public final zq[] v0;
    public boolean w0;
    public j71 x0;
    public boolean y0;
    public boolean z0;

    public m(Context context, u6 u6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, u6Var);
        this.j0 = new k[3];
        this.q0 = true;
        this.r0 = new zq[1];
        f fVar = new f(this);
        ds dsVar = ds.h;
        this.t0 = new oe.b(0, fVar, dsVar, 380L, false);
        this.u0 = new oe.b(0, new f(this), dsVar, 380L, false);
        this.v0 = new zq[1];
        this.l0 = auction;
        this.m0 = lVar;
        long j10 = auction.giftId;
        this.X = j10;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.b0 = new ag.t(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, u6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = t61.j(-1, linearLayout);
        h hVar = new h(this, context, u6Var);
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
        linearLayout.addView(hVar2, gb1.x(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        tg.t0 t0Var = new tg.t0(context, u6Var);
        this.d0 = t0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i16 = y6.a7;
        int themedColor = getThemedColor(i16);
        int k10 = i0.a.k(getThemedColor(y6.i6), getThemedColor(i16));
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, themedColor, k10, k10);
        b7 N = f7.N(i16);
        t0Var.setBackground(j02);
        f7.k(t0Var, j02, N, null, u6Var);
        t0Var.setOnClickListener(new g(this, i14));
        ((TextView) t0Var.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        tg.t0 t0Var2 = new tg.t0(context, u6Var);
        this.e0 = t0Var2;
        ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16));
        b7 N2 = f7.N(i16);
        t0Var2.setBackground(c02);
        f7.k(t0Var2, c02, N2, null, u6Var);
        ((TextView) t0Var2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        tg.t0 t0Var3 = new tg.t0(context, u6Var);
        this.f0 = t0Var3;
        ShapeDrawable c03 = y6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i16));
        b7 N3 = f7.N(i16);
        t0Var3.setBackground(c03);
        f7.k(t0Var3, c03, N3, null, u6Var);
        ((TextView) t0Var3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(t0Var, gb1.p(1.0f, 0, -1));
        linearLayout2.addView(new View(context), gb1.p(0.0f, 10, -1));
        linearLayout2.addView(t0Var2, gb1.p(1.0f, 0, -1));
        linearLayout2.addView(new View(context), gb1.p(0.0f, 10, -1));
        linearLayout2.addView(t0Var3, gb1.p(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, gb1.o(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            z90 z90Var = new z90(context, u6Var);
            z90Var.setGravity(17);
            z90Var.setTextSize(1, 16.0f);
            int i17 = y6.J6;
            f7.V(z90Var, i17, u6Var);
            f7.H(z90Var, i17, u6Var);
            z90Var.setOnClickListener(new a51(this, new boolean[1], u6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new c6(subscribeToGiftAuction.giftDocumentId, z90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            z90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            gb1.c(z90Var, 0.02f, 1.5f);
            linearLayout.addView(z90Var, gb1.o(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i18 = y6.L6;
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, i18, 21, 0, 0, false, true, u6Var);
        this.g0 = q4Var;
        linearLayout.addView(q4Var, gb1.o(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        s6 s6Var = new s6(context, false, false, false);
        this.h0 = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(12.5f));
        s6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        s6Var.setSizeableBackground(y6.a0(0, 0, 9, 9));
        s6Var.setHideBackgroundIfEmpty(true);
        q4Var.setOnWidthUpdateListener(new ti.g(this, 17));
        q4Var.addView(s6Var, gb1.h(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, u6Var);
        this.i0 = kVar;
        s6 s6Var2 = kVar.b;
        f7.r(s6Var2);
        s6Var2.setTextColor(getThemedColor(i18));
        kVar.c(user);
        linearLayout.addView(kVar, gb1.o(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, i18, 21, 15, 0, false, false, u6Var);
        q4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(q4Var2, gb1.r(-1, -2));
        int i19 = 0;
        while (true) {
            k[] kVarArr = this.j0;
            if (i19 >= kVarArr.length) {
                break;
            }
            kVarArr[i19] = new k(context, u6Var);
            int i20 = i19 + 1;
            this.j0[i19].b(i20, true, false);
            this.j0[i19].setBackground(y6.M0(false));
            k kVar2 = this.j0[i19];
            kVar2.f = i19 < 2;
            kVar2.setOnClickListener(new bh.f(27));
            linearLayout.addView(this.j0[i19], gb1.r(-1, -2));
            i19 = i20;
        }
        int i21 = 2;
        i iVar = new i(context, u6Var, true);
        this.a0 = iVar;
        iVar.f();
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = h.leftMargin;
        int i23 = this.backgroundPaddingLeft;
        h.leftMargin = i22 + i23;
        h.rightMargin += i23;
        this.containerView.addView(iVar, h);
        mm0 mm0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new p7(4));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.c0.setValue((int) j11);
        } else {
            this.c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        bi.c cVar = new bi.c(context, this.currentAccount, u6Var);
        this.Z = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        gb1.b(cVar);
        cVar.setOnClickListener(new gd(context, i21, u6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        this.container.addView(frameLayout, gb1.i(-1, 100, 48));
        a0();
        this.x0.O(false);
    }

    public static void P(m mVar, long j10) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
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

    public static void Q(m mVar) {
        int value = mVar.c0.getValue();
        int minimumBid = (int) mVar.l0.getMinimumBid();
        if (value >= minimumBid) {
            mVar.X(value);
        } else {
            AndroidUtilities.shakeView(mVar.a0);
            new wc(mVar.container, mVar.resourcesProvider).R(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void R(m mVar, boolean[] zArr, u6 u6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new bi.v3(mVar, zArr, u6Var, 12));
    }

    public static void S(m mVar, long j10, Boolean bool, String str) {
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
            mVar.Y();
            qc.f(frameLayout, mcVar, 2750).j();
            ca.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.c0.f(di.u.b(mVar.currentAccount, i10, 3), di.u.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.w0);
        mVar.d0(mVar.w0);
        mVar.Z(mVar.w0);
        mVar.W();
    }

    public static void U(m mVar) {
        Context context = mVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.l0.gift.gifts_per_round));
        g6 g6Var = new g6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        g6Var.setTextSize(1, 18.0f);
        f7.V(g6Var, y6.j5, mVar.resourcesProvider);
        f7.m(g6Var, 34, y6.Xh, mVar.resourcesProvider);
        g6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        g6Var.setFocusable(true);
        int i10 = 2;
        g6Var.setInputType(2);
        g6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        f7.G(g6Var, y6.k6, y6.l6, y6.p7, mVar.resourcesProvider);
        g6Var.setImeOptions(268435462);
        g6Var.setBackgroundDrawable(null);
        g6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        g6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        g6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(g6Var, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        e2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new zg1(27, mVar, g6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vg.d(17));
        org.telegram.ui.ActionBar.e2[] e2VarArr = {e2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        e2VarArr[0].setOnDismissListener(new hi.y0(g6Var, R, findActivity, 5));
        e2VarArr[0].setOnShowListener(new jg.s(g6Var, i10));
        e2VarArr[0].show();
        View d = e2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        e2VarArr[0].j0 = false;
        g6Var.setSelection(g6Var.getText().length());
    }

    public final void V() {
        boolean z10 = this.w0 && !isDismissed();
        if (this.y0 != z10) {
            this.y0 = z10;
            bi.c cVar = this.Z;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                vh.p(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
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

    public final void X(int i10) {
        if (this.z0) {
            return;
        }
        long j10 = this.l0.auctionUserState.bid_amount;
        long j11 = j10 > 0 ? i10 - j10 : i10;
        if (ca.y(this.currentAccount, false).e && ca.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new tc(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.z0 = true;
        this.a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new ii.m0(this, j10, 3));
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
            iVar.i(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        zq[] zqVarArr = this.v0;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            iVar.i(dd.U0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), zqVarArr), z10, true);
        } else {
            iVar.i(dd.U0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), zqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, i11));
    }

    public final void a0() {
        int f7 = i0.a.f(this.t0.e, i0.a.f(this.u0.e, getThemedColor(y6.L6), getThemedColor(y6.q7)), getThemedColor(y6.uj));
        this.g0.setTextColor(f7);
        s6 s6Var = this.h0;
        s6Var.setTextColor(f7);
        this.i0.b.setTextColor(f7);
        if (y6.E1(s6Var.getSizeableBackground(), y6.o1(0.15f, f7), false)) {
            s6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        ((s6) this.e0.b).c(j10 >= 3600 ? AndroidUtilities.formatFullDuration((int) j10) : AndroidUtilities.formatDurationNoHours((int) j10, true), z10, true);
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
        s6 s6Var = this.h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.l0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                s6Var.setText(this.l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        s6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.l0.getBidStatus();
        long value = this.c0.getValue();
        long j10 = this.l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.q4 q4Var = this.g0;
        boolean z12 = false;
        if (value <= j10) {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.t0.a(z12, z10);
            this.u0.a(z11, z10);
        }
        q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        z11 = false;
        this.t0.a(z12, z10);
        this.u0.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.r2 R;
        int i10;
        ((s6) this.d0.b).c(dd.W0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.l0.getMinimumBid(), ','), 0.78f, this.r0), z10, true);
        if (this.l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.l0.isUpcoming(currentTime);
            ag.t tVar = this.b0;
            if (isUpcoming) {
                long max = Math.max(0, this.l0.auctionStateActive.start_date - currentTime);
                tVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.l0.auctionStateActive.next_round_at - currentTime);
                tVar.a(max2);
                b0(max2, z10);
            }
            c6 c6Var = this.s0;
            tg.t0 t0Var = this.f0;
            if (c6Var == null && this.l0.gift.sticker != null) {
                this.s0 = new c6(this.l0.gift.sticker.id, ((s6) t0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.l0.auctionStateActive.gifts_left, ','));
            ((s6) t0Var.b).c(spannableStringBuilder, z10, true);
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
                    kVarArr[i11].setOnClickListener(new di.a2(this, longValue, 4));
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
        long j10 = this.l0.auctionUserState.acquired_count;
        if (this.p0 < j10 && !this.q0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.o0;
            if (j11 != 0) {
                un ba2 = un.ba(j11);
                ba2.whenFullyVisible(new pg.b(ba2, 1));
                R.presentFragment(ba2);
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.w0 = false;
        V();
        qc.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.w0 = true;
        V();
        qc.a(this.container, new k8(15));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.g0 == null || this.h0 == null || this.i0 == null) {
                return;
            }
            a0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.l0 = auction;
        e0(this.w0);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 27), this.resourcesProvider);
        this.x0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
