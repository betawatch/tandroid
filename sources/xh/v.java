package xh;

import ai.c5;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.lw0;
import w7.a6;
import w7.y5;
import yh.w7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class v extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final zc[] p0 = new zc[1];
    public static final yz0[] q0 = new yz0[1];
    public final TL_stars.StarGift X;
    public final long Y;
    public final LinearLayout Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final zc c0;
    public final zc d0;
    public final zc e0;
    public final zc f0;
    public final yz0 g0;
    public final org.telegram.tgnet.e h0;
    public final TableRow i0;
    public final ci.d j0;
    public final n90 k0;
    public final n90 l0;
    public GiftAuctionController.Auction m0;
    public final CharSequence n0;
    public j61 o0;

    public v(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, d6Var);
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.B(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, d6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.addView(kVar, y5.n(-1, -2));
        linearLayout.addView(frameLayout);
        r rVar = new r(context, this.currentAccount, d6Var);
        rVar.a0 = true;
        rVar.g(starGift, false, false, false, false, false);
        rVar.setImageSize(AndroidUtilities.dp(100.0f));
        rVar.setImageLayer(7);
        rVar.J.setVisibility(8);
        frameLayout.addView(rVar, y5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = h6.G6;
        textView.setTextColor(h6.v0(i12, d6Var));
        linearLayout.addView(textView, y5.t(-1, -2, 17, 20, 0, 20, 6));
        n90 n90Var = new n90(context, null);
        this.k0 = n90Var;
        n90Var.setGravity(17);
        n90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, d6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(h6.v0(i12, d6Var));
        int i13 = h6.J6;
        n90Var.setLinkTextColor(h6.v0(i13, d6Var));
        linearLayout.addView(n90Var, y5.t(-1, -2, 17, 20, 0, 20, 4));
        zz0 zz0Var = new zz0(context, d6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        zc[] zcVarArr = p0;
        zz0Var.c(string, "", null, zcVarArr);
        this.c0 = zcVarArr[0];
        zz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, zcVarArr);
        this.d0 = zcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(zz0Var, y5.e(-1, -2, 119));
        this.h0 = new org.telegram.tgnet.e(this, new ci.e4[1], frameLayout2, 5);
        TableRow c10 = zz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, zcVarArr);
        this.i0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: xh.q
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new rg.x0(this.b.getContext(), 40, (d6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.e0 = zcVarArr[0];
        yz0[] yz0VarArr = q0;
        zz0Var.c("", "", yz0VarArr, zcVarArr);
        this.f0 = zcVarArr[0];
        this.g0 = yz0VarArr[0];
        linearLayout.addView(frameLayout2, y5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        n90 n90Var2 = new n90(context, d6Var);
        this.l0 = n90Var2;
        n90Var2.setGravity(17);
        n90Var2.setTextSize(1, 16.0f);
        n90Var2.setTextColor(h6.v0(i13, d6Var));
        n90Var2.setLinkTextColor(h6.v0(i13, d6Var));
        n90Var2.setOnClickListener(new xg.e(this, new boolean[1], d6Var, 4));
        a6.b(n90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new z5(starGift.sticker, n90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.n0 = spannableStringBuilder;
        } else {
            this.n0 = "";
        }
        ci.d dVar = new ci.d(context, d6Var, true);
        this.j0 = dVar;
        dVar.e();
        final int i15 = 0;
        dVar.setOnClickListener(new n(this, j3, context, d6Var, runnable, 0));
        FrameLayout.LayoutParams d = y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(dVar, d);
        wl0 wl0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(64.0f));
        this.o0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.m0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                zz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                zz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.m0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.m0.auctionStateActive.total_rounds, ',')), null, null);
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
                zz0Var.c(formatString, starGiftAuctionRound.num == i11 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.m0;
        if (auction2 != null && auction2.previewAttributes != null) {
            int i23 = 25;
            t tVar = new t(this, context, d6Var, new o(this, i15), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23), new ai.e2(i23));
            tVar.d(new f4.d(1, 1));
            tVar.setPreviewingAttributes(this.m0.previewAttributes);
            tVar.removeView(tVar.O);
            this.a0.addView(tVar, 0, y5.e(-1, 288, 48));
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
            textView2.setBackground(h6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView h = org.telegram.ui.Cells.c1.h(this.a0, textView2, y5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextSize(1, 21.0f);
            h.setText(str2);
            h.setGravity(17);
            h.setTextColor(-1);
            TextView h10 = org.telegram.ui.Cells.c1.h(this.a0, h, y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            h10.setTextSize(1, 13.0f);
            h10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            h10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            h10.setGravity(17);
            h10.setTextColor(-1342177281);
            h10.setOnClickListener(new View.OnClickListener(this) { // from class: xh.q
                public final /* synthetic */ v b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            new rg.x0(this.b.getContext(), 40, (d6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            a6.b(h10, 0.02f, 1.5f);
            this.a0.addView(h10, y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            rVar.setVisibility(8);
            textView.setVisibility(8);
            this.k0.setVisibility(8);
            n90 n90Var3 = new n90(context, d6Var);
            n90Var3.setGravity(17);
            n90Var3.setTextSize(1, 16.0f);
            int i24 = h6.J6;
            n90Var3.setTextColor(h6.v0(i24, d6Var));
            n90Var3.setLinkTextColor(h6.v0(i24, d6Var));
            n90Var3.setOnClickListener(new xg.e(this, context, d6Var, 3));
            a6.b(n90Var3, 0.02f, 1.5f);
            this.Z.addView(n90Var3, y5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(zf.d.c(this.m0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i25 = 0; i25 < 3; i25++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar2.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new z5(stargiftattributemodel.document, n90Var3.getPaint().getFontMetricsInt()), i25, i25 + 1, 33);
                }
            }
            n90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j11, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.Z.addView(this.l0, y5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(false);
    }

    public static /* synthetic */ void P(v vVar, boolean[] zArr, d6 d6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.Y, new c5(vVar, zArr, d6Var, 12));
    }

    public static void Q(v vVar, long j3, Context context, d6 d6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = vVar.m0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j3 == 0 || j3 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) && (arrayList = (auction = vVar.m0).previewAttributes) != null) {
                new c0(context, d6Var, j3, auction.gift, arrayList, runnable, false).show();
            } else {
                new s(context, vVar.currentAccount, vVar.m0.gift, null, j3, runnable, false, false).show();
            }
        }
        vVar.dismiss();
    }

    public static /* synthetic */ void R(v vVar, Context context, d6 d6Var) {
        int i10 = vVar.currentAccount;
        GiftAuctionController.Auction auction = vVar.m0;
        new yh.s0(context, d6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        vVar.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, d6 d6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new u(context, starGift, d6Var));
        org.telegram.ui.ActionBar.u0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 j3 = ok.j(1, context, null, false);
        runnable = j3.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(h6.v0(h6.Oh, d6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, y5.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i10 = h6.G6;
        textView.setTextColor(h6.v0(i10, d6Var));
        linearLayout.addView(textView, y5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.v0(i10, d6Var));
        linearLayout.addView(textView2, y5.t(-1, -2, 17, 20, 0, 20, 16));
        lw0 lw0Var = new lw0(context, d6Var);
        int i11 = starGift.gifts_per_round;
        lw0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        lw0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
        lw0Var.d.setVisibility(8);
        int i13 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = lw0Var.c;
        imageView2.setImageResource(i13);
        imageView2.setColorFilter(h6.v0(i10, d6Var));
        linearLayout.addView(lw0Var, y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        lw0 lw0Var2 = new lw0(context, d6Var);
        lw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        lw0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        lw0Var2.d.setVisibility(8);
        int i14 = R.drawable.menu_carryover_24;
        ImageView imageView3 = lw0Var2.c;
        imageView3.setImageResource(i14);
        imageView3.setColorFilter(h6.v0(i10, d6Var));
        linearLayout.addView(lw0Var2, y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        lw0 lw0Var3 = new lw0(context, d6Var);
        lw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        lw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        lw0Var3.d.setVisibility(8);
        int i15 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = lw0Var3.c;
        imageView4.setImageResource(i15);
        imageView4.setColorFilter(h6.v0(i10, d6Var));
        linearLayout.addView(lw0Var3, y5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setOnClickListener(new bi.p(5, runnable));
        dVar.g(yh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, y5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j3.customView = linearLayout;
        j3.show();
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
        zc zcVar = this.d0;
        zc zcVar2 = this.c0;
        ci.d dVar = this.j0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            zcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            zcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w7.X0(false, org.telegram.messenger.f0.h(this.m0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b("?", new o(this, i13), this.resourcesProvider, null));
            this.e0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            zcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            zcVar.setText(LocaleController.formatDateTime(this.m0.auctionStateActive.end_date, true));
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
            zc zcVar3 = this.f0;
            yz0 yz0Var = this.g0;
            if (i10 != i11) {
                yz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                zcVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                yz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                zcVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.m0.auctionUserState.acquired_count;
            n90 n90Var = this.l0;
            if (i12 <= 0) {
                n90Var.setVisibility(0);
                n90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.n0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                n90Var.setVisibility(8);
            }
            auction = this.m0;
            tableRow = this.i0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            n90 n90Var2 = this.k0;
            n90Var2.setText(string);
            n90Var2.setTextColor(h6.v0(h6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        zc zcVar32 = this.f0;
        yz0 yz0Var2 = this.g0;
        if (i10 != i11) {
        }
        i12 = this.m0.auctionUserState.acquired_count;
        n90 n90Var3 = this.l0;
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
        V(true);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 14), this.resourcesProvider);
        this.o0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return "";
    }
}
