package wh;

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
import bi.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.h7;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ww0;
import w7.a6;
import w7.c6;
import xh.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w extends ab implements GiftAuctionController.OnAuctionUpdateListener {
    public static final yc[] p0 = new yc[1];
    public static final a01[] q0 = new a01[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final yc c0;
    public final yc d0;
    public final yc e0;
    public final yc f0;
    public final a01 g0;
    public final org.telegram.tgnet.g h0;
    public final TableRow i0;
    public final bi.d j0;
    public final m90 k0;
    public final m90 l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence n0;
    public j61 o0;

    public w(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, f6Var);
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.X = starGift;
        long j10 = starGift.id;
        this.Y = j10;
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
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var);
        lVar.C(-1, false);
        lVar.setOccupyStatusBar(false);
        S(lVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(lVar, a6.n(-1, -2));
        linearLayout.addView(frameLayout);
        s sVar = new s(context, this.currentAccount, f6Var);
        sVar.a0 = true;
        sVar.g(starGift, false, false, false, false, false);
        sVar.setImageSize(AndroidUtilities.dp(100.0f));
        sVar.setImageLayer(7);
        sVar.J.setVisibility(8);
        frameLayout.addView(sVar, a6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        linearLayout.addView(textView, a6.t(-1, -2, 17, 20, 0, 20, 6));
        m90 m90Var = new m90(context, null);
        this.k0 = m90Var;
        m90Var.setGravity(17);
        m90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, f6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(j6.v0(i12, f6Var));
        int i13 = j6.J6;
        m90Var.setLinkTextColor(j6.v0(i13, f6Var));
        linearLayout.addView(m90Var, a6.t(-1, -2, 17, 20, 0, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        yc[] ycVarArr = p0;
        b01Var.c(string, "", null, ycVarArr);
        this.c0 = ycVarArr[0];
        b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, ycVarArr);
        this.d0 = ycVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(b01Var, a6.e(-1, -2, 119));
        this.h0 = new org.telegram.tgnet.g(this, new bi.x4[1], frameLayout2, 5);
        TableRow c10 = b01Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, ycVarArr);
        this.i0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: wh.q
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new qg.a1(this.b.getContext(), 40, (f6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.e0 = ycVarArr[0];
        a01[] a01VarArr = q0;
        b01Var.c("", "", a01VarArr, ycVarArr);
        this.f0 = ycVarArr[0];
        this.g0 = a01VarArr[0];
        linearLayout.addView(frameLayout2, a6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        m90 m90Var2 = new m90(context, f6Var);
        this.l0 = m90Var2;
        m90Var2.setGravity(17);
        m90Var2.setTextSize(1, 16.0f);
        m90Var2.setTextColor(j6.v0(i13, f6Var));
        m90Var2.setLinkTextColor(j6.v0(i13, f6Var));
        m90Var2.setOnClickListener(new r(this, new boolean[1], f6Var, 0));
        c6.b(m90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new y5(starGift.sticker, m90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.n0 = spannableStringBuilder;
        } else {
            this.n0 = "";
        }
        bi.d dVar = new bi.d(context, f6Var, true);
        this.j0 = dVar;
        dVar.e();
        final int i15 = 0;
        dVar.setOnClickListener(new n(this, j3, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(dVar, d);
        vl0 vl0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(64.0f));
        this.o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                b01Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.m0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.m0.auctionStateActive.rounds.get(i19);
                if (i19 < size - 1) {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.rounds.get(i19 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.m0.auctionStateActive.total_rounds;
                }
                int i20 = starGiftAuctionRound.num;
                if (i20 == i11) {
                    int i21 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i20);
                    formatString = LocaleController.formatString(i21, objArr);
                } else {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i20);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i22, objArr2);
                }
                b01Var.c(formatString, starGiftAuctionRound.num == i11 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i23 = 24;
            u uVar = new u(this, context, f6Var, new o(this, i15), new d5(i23), new d5(i23), new d5(i23), new d5(i23), new d5(i23), new d5(i23));
            uVar.d(new f4.d(1, 1));
            uVar.setPreviewingAttributes(this.m0.previewAttributes);
            uVar.removeView(uVar.O);
            this.a0.addView(uVar, 0, a6.e(-1, 288, 48));
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
            textView2.setBackground(j6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView f7 = r6.f(this.a0, textView2, a6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextSize(1, 21.0f);
            f7.setText(str2);
            f7.setGravity(17);
            f7.setTextColor(-1);
            TextView f10 = r6.f(this.a0, f7, a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            f10.setTextSize(1, 13.0f);
            f10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            f10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            f10.setGravity(17);
            f10.setTextColor(-1342177281);
            f10.setOnClickListener(new View.OnClickListener(this) { // from class: wh.q
                public final /* synthetic */ w b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new qg.a1(this.b.getContext(), 40, (f6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            c6.b(f10, 0.02f, 1.5f);
            this.a0.addView(f10, a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            sVar.setVisibility(8);
            textView.setVisibility(8);
            this.k0.setVisibility(8);
            m90 m90Var3 = new m90(context, f6Var);
            m90Var3.setGravity(17);
            m90Var3.setTextSize(1, 16.0f);
            int i24 = j6.J6;
            m90Var3.setTextColor(j6.v0(i24, f6Var));
            m90Var3.setLinkTextColor(j6.v0(i24, f6Var));
            m90Var3.setOnClickListener(new bi.q(this, context, f6Var, 29));
            c6.b(m90Var3, 0.02f, 1.5f);
            this.Z.addView(m90Var3, a6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(yf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = 0; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new y5(stargiftattributemodel.document, m90Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            m90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.l0, a6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static /* synthetic */ void P(w wVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(wVar.currentAccount).getOrRequestAcquiredGifts(wVar.Y, new h7(wVar, zArr, f6Var, 6));
    }

    public static void Q(w wVar, long j3, Context context, f6 f6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = wVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(wVar.currentAccount).getClientUserId()) && (arrayList = (auction = wVar.m0).previewAttributes) != null) {
                new d0(context, f6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new t(context, wVar.currentAccount, wVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        wVar.dismiss();
    }

    public static /* synthetic */ void R(w wVar, Context context, f6 f6Var) {
        int i10 = wVar.currentAccount;
        GiftAuctionController.Auction auction = wVar.m0;
        new xh.s0(context, f6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        wVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.l lVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new v(context, starGift, f6Var));
        org.telegram.ui.ActionBar.w0 a2 = lVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, null, false);
        runnable = i10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(j6.v0(j6.Oh, f6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, a6.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(textView, a6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(textView2, a6.t(-1, -2, 17, 20, 0, 20, 16));
        ww0 ww0Var = new ww0(context, f6Var);
        int i12 = starGift.gifts_per_round;
        ww0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i12, Integer.valueOf(i12)), false);
        int i13 = starGift.gifts_per_round;
        ww0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i13, Integer.valueOf(i13)));
        ww0Var.d.setVisibility(8);
        int i14 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = ww0Var.c;
        imageView2.setImageResource(i14);
        imageView2.setColorFilter(j6.v0(i11, f6Var));
        linearLayout.addView(ww0Var, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ww0 ww0Var2 = new ww0(context, f6Var);
        ww0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        ww0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        ww0Var2.d.setVisibility(8);
        int i15 = R.drawable.menu_carryover_24;
        ImageView imageView3 = ww0Var2.c;
        imageView3.setImageResource(i15);
        imageView3.setColorFilter(j6.v0(i11, f6Var));
        linearLayout.addView(ww0Var2, a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        ww0 ww0Var3 = new ww0(context, f6Var);
        ww0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        ww0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        ww0Var3.d.setVisibility(8);
        int i16 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = ww0Var3.c;
        imageView4.setImageResource(i16);
        imageView4.setColorFilter(j6.v0(i11, f6Var));
        linearLayout.addView(ww0Var3, a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.setOnClickListener(new ai.v(5, runnable));
        dVar.g(xh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        i10.customView = linearLayout;
        i10.show();
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.m0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.h0.run(this.e0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.m0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.m0;
        yc ycVar = this.d0;
        yc ycVar2 = this.c0;
        bi.d dVar = this.j0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            ycVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            ycVar.setText(LocaleController.formatDateTime(this.m0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z7.X0(false, hc.b.l(this.m0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b("?", new o(this, i13), this.resourcesProvider, null));
            this.e0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            ycVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            ycVar.setText(LocaleController.formatDateTime(this.m0.auctionStateActive.end_date, true));
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
            yc ycVar3 = this.f0;
            a01 a01Var = this.g0;
            if (i10 != i11) {
                a01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                ycVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                a01Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                ycVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.m0.auctionUserState.acquired_count;
            m90 m90Var = this.l0;
            if (i12 <= 0) {
                m90Var.setVisibility(0);
                m90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.n0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                m90Var.setVisibility(8);
            }
            auction = this.m0;
            tableRow = this.i0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            m90 m90Var2 = this.k0;
            m90Var2.setText(string);
            m90Var2.setTextColor(j6.v0(j6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        yc ycVar32 = this.f0;
        a01 a01Var2 = this.g0;
        if (i10 != i11) {
        }
        i12 = this.m0.auctionUserState.acquired_count;
        m90 m90Var3 = this.l0;
        if (i12 <= 0) {
        }
        auction = this.m0;
        tableRow = this.i0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.Y, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.m0 = auction;
        V(true);
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 14), this.resourcesProvider);
        this.o0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return "";
    }
}
