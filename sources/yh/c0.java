package yh;

import ai.h6;
import ai.l7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y90;
import org.telegram.ui.cw0;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class c0 extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int g0 = 0;
    public final long X;
    public final w Y;
    public final LinearLayout Z;
    public final x a0;
    public final TextView b0;
    public final z c0;
    public GiftAuctionController.Auction d0;
    public b71 e0;
    public int f0;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, g6Var);
        h9 h9Var;
        TLRPC.Chat chat;
        Context context2;
        g6 g6Var2;
        y90 y90Var;
        long j11 = starGift.id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.f(0.1f, getThemedColor(k6.i5), getThemedColor(k6.h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        w wVar = new w(this, context);
        this.Y = wVar;
        linearLayout.addView(wVar);
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(dVar, d);
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.e0.N(false);
        int i13 = z10 ? 220 : 208;
        this.d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        int i14 = 29;
        x xVar = new x(this, context, g6Var, new tg.p(this, 14), new ah.f(i14), new ah.f(i14), new ah.f(i14), new ah.f(i14), new ah.f(i14), new ah.f(i14), i13);
        this.a0 = xVar;
        xVar.d(new h6(1, 1));
        xVar.setPreviewingAttributes(arrayList);
        xVar.removeView(xVar.P);
        wVar.addView(xVar, 0, z5.e(-1, i13, 48));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        wVar.addView(w9Var, z5.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j10 == 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            h9Var = new h9(0, user);
            chat = user;
        } else if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            h9Var = new h9(0, user2);
            chat = user2;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            h9Var = new h9(chat2);
            chat = chat2;
        }
        w9Var.e(chat, h9Var);
        TextView textView = new TextView(context);
        this.b0 = textView;
        sl.k(21.0f, 1, textView);
        textView.setText(DialogObject.getShortName(j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        wVar.addView(textView, z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            g6Var2 = g6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            g6Var2 = g6Var;
            textView2.setOnClickListener(new n(context, g6Var, j10, starGift, arrayList));
            b6.b(textView2, 0.02f, 1.5f);
        }
        wVar.addView(textView2, z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        y yVar = new y(context2, this.currentAccount, g6Var2);
        yVar.c0 = true;
        g6 g6Var3 = g6Var2;
        yVar.h(starGift, true, false, false, false, false);
        yVar.setImageSize(AndroidUtilities.dp(84.0f));
        yVar.setImageLayer(7);
        yVar.J.setVisibility(8);
        yVar.e.g(null);
        yVar.setRibbonTextOneOf(this.d0.gift.availability_total);
        linearLayout2.addView(yVar, z5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        r6.t(imageView, k6.m6, g6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, z5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        z zVar = new z(this, context, this.currentAccount, g6Var3);
        this.c0 = zVar;
        zVar.d.removeView(zVar.y);
        zVar.c0 = true;
        zVar.h(starGift, true, false, false, false, false);
        zVar.setImageSize(AndroidUtilities.dp(100.0f));
        zVar.setImageLayer(7);
        zVar.J.setVisibility(8);
        zVar.e.g(null);
        zVar.setRibbonTextOneOf(this.d0.gift.availability_total);
        zVar.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(zVar, z5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = k6.y6;
        r6.W(textView3, i15, g6Var3);
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int i16 = k6.d6;
        int w02 = k6.w0(i16, g6Var3);
        int i17 = k6.G6;
        Drawable c02 = k6.c0(dp, i0.a.f(0.2f, w02, k6.w0(i17, g6Var3)));
        frameLayout.setBackground(c02);
        m6 p5 = r6.p(frameLayout, true);
        p5.d = c02;
        p5.e = null;
        p5.f = null;
        l6 l6Var = new l6();
        p5.e = l6Var;
        l6Var.c(i16, i17, 3, 0.2f, g6Var3);
        l6Var.g = r6.v(c02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        r6.W(textView4, i17, g6Var3);
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView j12 = org.telegram.ui.Cells.b1.j(frameLayout, textView4, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        j12.setTextSize(1, 13.0f);
        j12.setGravity(21);
        j12.setTypeface(AndroidUtilities.bold());
        r6.W(j12, i17, g6Var3);
        j12.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(j12, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View a0Var = new a0(context, clamp);
        int dp2 = AndroidUtilities.dp(14.0f);
        int i18 = k6.Oh;
        Drawable c03 = k6.c0(dp2, k6.w0(i18, g6Var3));
        n6 O = r6.O(i18);
        a0Var.setBackground(c03);
        r6.k(a0Var, c03, O, null, g6Var3);
        frameLayout.addView(a0Var, z5.e(-1, -1, 119));
        b0 b0Var = new b0(context, clamp);
        b0Var.setWillNotDraw(false);
        frameLayout.addView(b0Var, z5.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        b0Var.addView(textView5, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        b0Var.addView(textView6, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.d0;
        if (auction == null || auction.auctionStateActive == null) {
            y90Var = null;
        } else {
            y90Var = new y90(context, null);
            y90Var.setTextSize(1, 13.0f);
            y90Var.setGravity(17);
            r6.W(y90Var, i15, g6Var3);
            y90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, g6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            r6.I(y90Var, k6.J6, g6Var3);
        }
        if (!z10) {
            linearLayout.addView(linearLayout2, z5.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
            linearLayout.addView(textView3, z5.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
            linearLayout.addView(frameLayout, z5.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
            if (y90Var != null) {
                linearLayout.addView(y90Var, z5.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            GiftAuctionController.Auction auction2 = this.d0;
            if (auction2 == null || !auction2.isUpcoming(currentTime)) {
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
            } else {
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
            }
            GiftAuctionController.Auction auction3 = this.d0;
            if (auction3 != null && auction3.auctionStateActive != null) {
                if (auction3.isUpcoming(currentTime)) {
                    dVar.g(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.d0.auctionStateActive.start_date - currentTime)), false);
                } else {
                    dVar.g(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.d0.auctionStateActive.end_date - currentTime)), false);
                }
            }
            dVar.setOnClickListener(new n(this, j10, context, g6Var3, runnable, 1));
            return;
        }
        if (context != null) {
            TextView textView7 = new TextView(context);
            textView7.setTypeface(AndroidUtilities.bold());
            textView7.setGravity(17);
            textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
            textView7.setTextSize(1, 20.0f);
            r6.W(textView7, i17, g6Var3);
            linearLayout.addView(textView7, z5.t(-1, -2, 17, 20, 14, 20, 6));
            TextView textView8 = new TextView(context);
            textView8.setGravity(17);
            sl.n(R.string.GiftAuctionWearInfoText, textView8, 1, 14.0f);
            r6.W(textView8, i17, g6Var3);
            linearLayout.addView(textView8, z5.t(-1, -2, 17, 20, 0, 20, 16));
            cw0 cw0Var = new cw0(context, g6Var3);
            cw0Var.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
            cw0Var.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
            cw0Var.d.setVisibility(8);
            int i19 = R.drawable.msg_emoji_gem;
            ImageView imageView2 = cw0Var.c;
            imageView2.setImageResource(i19);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            r6.t(imageView2, i17, g6Var3, mode);
            linearLayout.addView(cw0Var, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var2 = new cw0(context, g6Var3);
            cw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
            cw0Var2.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
            cw0Var2.d.setVisibility(8);
            int i20 = R.drawable.menu_feature_cover_24;
            ImageView imageView3 = cw0Var2.c;
            imageView3.setImageResource(i20);
            r6.t(imageView3, i17, g6Var3, mode);
            linearLayout.addView(cw0Var2, z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var3 = new cw0(context, g6Var3);
            cw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
            cw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
            cw0Var3.d.setVisibility(8);
            int i21 = R.drawable.menu_verification;
            ImageView imageView4 = cw0Var3.c;
            imageView4.setImageResource(i21);
            r6.t(imageView4, i17, g6Var3, mode);
            linearLayout.addView(cw0Var3, z5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
        }
        dVar.i(l7.H2(LocaleController.getString(R.string.Understood)), false, true);
        dVar.setOnClickListener(new hg.r0(this, 27));
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int f7 = i0.a.f(0.1f, getThemedColor(k6.i5), getThemedColor(k6.h5));
            if (f7 != this.f0) {
                this.f0 = f7;
                setBackgroundColor(f7);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.d0 = auction;
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 26), this.resourcesProvider);
        this.e0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return "";
    }
}
