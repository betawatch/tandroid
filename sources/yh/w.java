package yh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.ax0;
import w7.b6;
import w7.z5;
import zh.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w extends db implements GiftAuctionController.OnAuctionUpdateListener {
    public static final bd[] p0 = new bd[1];
    public static final n01[] q0 = new n01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final bd c0;
    public final bd d0;
    public final bd e0;
    public final bd f0;
    public final n01 g0;
    public final org.telegram.tgnet.e h0;
    public final TableRow i0;
    public final di.d j0;
    public final da0 k0;
    public final da0 l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence n0;
    public a71 o0;

    public w(Context context, c6 c6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, c6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j11 = starGift.id;
        this.Y = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        T(kVar, context, c6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(kVar, z5.n(-1, -2));
        linearLayout.addView(frameLayout);
        s sVar = new s(context, this.currentAccount, c6Var);
        sVar.a0 = true;
        sVar.g(starGift, false, false, false, false, false);
        sVar.setImageSize(AndroidUtilities.dp(100.0f));
        sVar.setImageLayer(7);
        sVar.J.setVisibility(8);
        frameLayout.addView(sVar, z5.a(130.0f, 0.0f, 18.0f, 0.0f, 14.0f, 130, 17));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = g6.G6;
        textView.setTextColor(g6.w0(i12, c6Var));
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        da0 da0Var = new da0(context, null);
        this.k0 = da0Var;
        da0Var.setGravity(17);
        da0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new q(context, c6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(g6.w0(i12, c6Var));
        int i13 = g6.J6;
        da0Var.setLinkTextColor(g6.w0(i13, c6Var));
        linearLayout.addView(da0Var, z5.t(-1, -2, 17, 20, 0, 20, 4));
        o01 o01Var = new o01(context, c6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        bd[] bdVarArr = p0;
        o01Var.c(string, "", null, bdVarArr);
        this.c0 = bdVarArr[0];
        o01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, bdVarArr);
        this.d0 = bdVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(o01Var, z5.e(-1, -2, 119));
        this.h0 = new org.telegram.tgnet.e(this, new di.d4[1], frameLayout2, 5);
        TableRow c10 = o01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, bdVarArr);
        this.i0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: yh.r
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new sg.y0(this.b.getContext(), 40, (c6) null).show();
                        break;
                    default:
                        this.b.U();
                        break;
                }
            }
        });
        this.e0 = bdVarArr[0];
        n01[] n01VarArr = q0;
        o01Var.c("", "", n01VarArr, bdVarArr);
        this.f0 = bdVarArr[0];
        this.g0 = n01VarArr[0];
        linearLayout.addView(frameLayout2, z5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        da0 da0Var2 = new da0(context, c6Var);
        this.l0 = da0Var2;
        da0Var2.setGravity(17);
        da0Var2.setTextSize(1, 16.0f);
        da0Var2.setTextColor(g6.w0(i13, c6Var));
        da0Var2.setLinkTextColor(g6.w0(i13, c6Var));
        da0Var2.setOnClickListener(new yg.e(this, new boolean[1], c6Var, 4));
        b6.b(da0Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(starGift.sticker, da0Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.n0 = spannableStringBuilder;
        } else {
            z10 = false;
            this.n0 = "";
        }
        di.d dVar = new di.d(context, c6Var, true);
        this.j0 = dVar;
        dVar.e();
        final int i15 = z10;
        dVar.setOnClickListener(new o(this, j10, context, c6Var, runnable, 0));
        FrameLayout.LayoutParams a2 = z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i16 = a2.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        a2.leftMargin = i16 + i17;
        a2.rightMargin += i17;
        this.containerView.addView(dVar, a2);
        mm0 mm0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i18, i15, i18, AndroidUtilities.dp(64.0f));
        this.o0.N(i15);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                o01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                String string2 = LocaleController.getString(R.string.Gift2AuctionTableCurrentRound);
                int i19 = R.string.OfS;
                String formatNumber = LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ',');
                String formatNumber2 = LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i15] = formatNumber;
                objArr[1] = formatNumber2;
                o01Var.c(string2, LocaleController.formatString(i19, objArr), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i20 = i15; i20 < size; i20++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i20);
                if (i20 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i20 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i21 = starGiftAuctionRound.num;
                if (i21 == i11) {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr2 = new Object[i10];
                    objArr2[i15] = Integer.valueOf(i21);
                    formatString = LocaleController.formatString(i22, objArr2);
                } else {
                    int i23 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i21);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr3 = new Object[2];
                    objArr3[i15] = valueOf;
                    objArr3[i10] = valueOf2;
                    formatString = LocaleController.formatString(i23, objArr3);
                }
                if (starGiftAuctionRound.num == i11) {
                    int i24 = R.string.Gift2AuctionTableCurrentRoundsOneDuration;
                    String formatTTLString = LocaleController.formatTTLString(starGiftAuctionRound.duration);
                    String formatTTLString2 = LocaleController.formatTTLString(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i15] = formatTTLString;
                    objArr4[1] = formatTTLString2;
                    objArr4[2] = valueOf3;
                    formatPluralString = LocaleController.formatString(i24, objArr4);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[i15]);
                }
                o01Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i25 = 26;
            u uVar = new u(this, context, c6Var, new p(this, i15), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25), new ah.f(i25));
            uVar.d(new f4.d(1, 1));
            uVar.setPreviewingAttributes(this.m0.previewAttributes);
            uVar.removeView(uVar.O);
            this.a0.addView(uVar, i15, z5.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.b0 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.m0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(g6.a0(i15, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), i15, AndroidUtilities.dp(12.0f), i15);
            TextView g10 = org.telegram.ui.Cells.c1.g(this.a0, textView2, z5.a(26.0f, 16.0f, 0.0f, 16.0f, 77.0f, -2, 81), context);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextSize(1, 21.0f);
            g10.setText(str2);
            g10.setGravity(17);
            g10.setTextColor(-1);
            TextView g11 = org.telegram.ui.Cells.c1.g(this.a0, g10, z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 40.0f, -1, 87), context);
            g11.setTextSize(1, 13.0f);
            g11.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), i15, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            g11.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            g11.setGravity(17);
            g11.setTextColor(-1342177281);
            g11.setOnClickListener(new View.OnClickListener(this) { // from class: yh.r
                public final /* synthetic */ w b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new sg.y0(this.b.getContext(), 40, (c6) null).show();
                            break;
                        default:
                            this.b.U();
                            break;
                    }
                }
            });
            b6.b(g11, 0.02f, 1.5f);
            this.a0.addView(g11, z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
            sVar.setVisibility(8);
            textView.setVisibility(8);
            this.k0.setVisibility(8);
            da0 da0Var3 = new da0(context, c6Var);
            da0Var3.setGravity(17);
            da0Var3.setTextSize(1, 16.0f);
            int i26 = g6.J6;
            da0Var3.setTextColor(g6.w0(i26, c6Var));
            da0Var3.setLinkTextColor(g6.w0(i26, c6Var));
            da0Var3.setOnClickListener(new yg.e(this, context, c6Var, 3));
            b6.b(da0Var3, 0.02f, 1.5f);
            this.Z.addView(da0Var3, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(ag.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i27 = i15; i27 < 3; i27++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b6(stargiftattributemodel.document, da0Var3.getPaint().getFontMetricsInt()), i27, i27 + 1, 33);
                }
            }
            int i28 = R.string.Gift2AuctionVariants;
            String formatNumber3 = LocaleController.formatNumber(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i15] = spannableStringBuilder2;
            objArr5[1] = formatNumber3;
            da0Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(i28, objArr5), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.l0, z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        W(i15);
    }

    public static /* synthetic */ void Q(w wVar, boolean[] zArr, c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(wVar.currentAccount).getOrRequestAcquiredGifts(wVar.Y, new bi.q4(wVar, zArr, c6Var, 12));
    }

    public static void R(w wVar, long j10, Context context, c6 c6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = wVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(wVar.currentAccount).getClientUserId()) && (arrayList = (auction = wVar.m0).previewAttributes) != null) {
                new d0(context, c6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new t(context, wVar.currentAccount, wVar.m0.gift, null, j10, runnable, false, false).show();
            }
        }
        wVar.dismiss();
    }

    public static /* synthetic */ void S(w wVar, Context context, c6 c6Var) {
        int i10 = wVar.currentAccount;
        GiftAuctionController.Auction auction = wVar.m0;
        new zh.r0(context, c6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        wVar.dismiss();
    }

    public static void T(org.telegram.ui.ActionBar.k kVar, Context context, c6 c6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new v(context, starGift, c6Var));
        org.telegram.ui.ActionBar.u0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void V(Context context, TL_stars.StarGift starGift, c6 c6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 i10 = sk.i(1, context, null, false);
        runnable = i10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(g6.w0(g6.Oh, c6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, z5.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        sk.j(20.0f, R.string.GiftAuctionInfoHeader, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.w0(i11, c6Var));
        linearLayout.addView(textView, z5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        sk.j(14.0f, R.string.GiftAuctionInfoText, 1, textView2);
        textView2.setTextColor(g6.w0(i11, c6Var));
        linearLayout.addView(textView2, z5.t(-1, -2, 17, 20, 0, 20, 16));
        ax0 ax0Var = new ax0(context, c6Var);
        int i12 = starGift.gifts_per_round;
        ax0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
        int i13 = starGift.gifts_per_round;
        ax0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
        ax0Var.d.setVisibility(8);
        int i14 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = ax0Var.c;
        imageView2.setImageResource(i14);
        imageView2.setColorFilter(g6.w0(i11, c6Var));
        linearLayout.addView(ax0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ax0 ax0Var2 = new ax0(context, c6Var);
        ax0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        ax0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        ax0Var2.d.setVisibility(8);
        int i15 = R.drawable.menu_carryover_24;
        ImageView imageView3 = ax0Var2.c;
        imageView3.setImageResource(i15);
        imageView3.setColorFilter(g6.w0(i11, c6Var));
        linearLayout.addView(ax0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ax0 ax0Var3 = new ax0(context, c6Var);
        ax0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        ax0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        ax0Var3.d.setVisibility(8);
        int i16 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = ax0Var3.c;
        imageView4.setImageResource(i16);
        imageView4.setColorFilter(g6.w0(i11, c6Var));
        linearLayout.addView(ax0Var3, z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        di.d dVar = new di.d(context, c6Var, true);
        dVar.setOnClickListener(new ci.o(5, runnable));
        dVar.g(zh.r3.i2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        i10.customView = linearLayout;
        i10.show();
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return "";
    }

    public final void U() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.h0.run(this.e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.m0;
        bd bdVar = this.d0;
        bd bdVar2 = this.c0;
        di.d dVar = this.j0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            bdVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            bdVar.setText(LocaleController.formatDateTime(this.m0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p7.Y0(false, org.telegram.messenger.g0.h(this.m0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.b("?", new p(this, i13), this.resourcesProvider, null));
            this.e0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            bdVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            bdVar.setText(LocaleController.formatDateTime(this.m0.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.m0.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.m0.auctionStateActive.start_date - currentTime)), z10);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.m0.auctionStateActive.end_date - currentTime)), z10);
            }
        }
        GiftAuctionController.Auction auction3 = this.m0;
        TL_stars.StarGift starGift = this.X;
        if (auction3 != null) {
            if (auction3.isFinished()) {
                i10 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.m0.auctionStateActive;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i11 = starGift.availability_total;
            bd bdVar3 = this.f0;
            n01 n01Var = this.g0;
            if (i10 != i11) {
                n01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                bdVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                n01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                bdVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.m0.auctionUserState.acquired_count;
            da0 da0Var = this.l0;
            if (i12 <= 0) {
                da0Var.setVisibility(0);
                da0Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.n0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                da0Var.setVisibility(8);
            }
            auction = this.m0;
            tableRow = this.i0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            da0 da0Var2 = this.k0;
            da0Var2.setText(string);
            da0Var2.setTextColor(g6.w0(g6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        bd bdVar32 = this.f0;
        n01 n01Var2 = this.g0;
        if (i10 != i11) {
        }
        i12 = this.m0.auctionUserState.acquired_count;
        da0 da0Var3 = this.l0;
        if (i12 <= 0) {
        }
        auction = this.m0;
        tableRow = this.i0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        W(true);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 14), this.resourcesProvider);
        this.o0 = a71Var;
        a71Var.r = false;
        return a71Var;
    }
}
