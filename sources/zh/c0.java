package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.c6;
import bi.h7;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z90;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public j71 e0;
    public int f0;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Context context, u6 u6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, u6Var);
        j9 j9Var;
        TLRPC.Chat chat;
        Context context2;
        u6 u6Var2;
        z90 z90Var;
        long j11 = starGift.id;
        this.X = j11;
        this.K = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.f(0.1f, getThemedColor(y6.i5), getThemedColor(y6.h5)));
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
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.f();
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = h.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        h.leftMargin = i10 + i11;
        h.rightMargin += i11;
        this.containerView.addView(dVar, h);
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.e0.O(false);
        int i13 = z10 ? 220 : 208;
        this.d0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        int i14 = 29;
        x xVar = new x(this, context, u6Var, new ti.g(this, 18), new bh.f(i14), new bh.f(i14), new bh.f(i14), new bh.f(i14), new bh.f(i14), new bh.f(i14), i13);
        this.a0 = xVar;
        xVar.d(new c6(1, 1));
        xVar.setPreviewingAttributes(arrayList);
        xVar.removeView(xVar.P);
        wVar.addView(xVar, 0, gb1.i(-1, i13, 48));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        wVar.addView(y9Var, gb1.h(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j10 == 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            j9Var = new j9(0, user);
            chat = user;
        } else if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            j9Var = new j9(0, user2);
            chat = user2;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            j9Var = new j9(chat2);
            chat = chat2;
        }
        y9Var.f(chat, j9Var);
        TextView textView = new TextView(context);
        this.b0 = textView;
        vh.j(21.0f, 1, textView);
        textView.setText(DialogObject.getShortName(j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        wVar.addView(textView, gb1.h(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            u6Var2 = u6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            u6Var2 = u6Var;
            textView2.setOnClickListener(new n(context, u6Var, j10, starGift, arrayList));
            gb1.c(textView2, 0.02f, 1.5f);
        }
        wVar.addView(textView2, gb1.h(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        y yVar = new y(context2, this.currentAccount, u6Var2);
        yVar.c0 = true;
        u6 u6Var3 = u6Var2;
        yVar.h(starGift, true, false, false, false, false);
        yVar.setImageSize(AndroidUtilities.dp(84.0f));
        yVar.setImageLayer(7);
        yVar.J.setVisibility(8);
        yVar.e.g(null);
        yVar.setRibbonTextOneOf(this.d0.gift.availability_total);
        linearLayout2.addView(yVar, gb1.p(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        f7.t(imageView, y6.m6, u6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, gb1.t(24, 24, 0.0f, 16, 12, 0, 12, 0));
        z zVar = new z(this, context, this.currentAccount, u6Var3);
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
        linearLayout2.addView(zVar, gb1.p(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = y6.y6;
        f7.V(textView3, i15, u6Var3);
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int i16 = y6.d6;
        int w02 = y6.w0(i16, u6Var3);
        int i17 = y6.G6;
        Drawable c02 = y6.c0(dp, i0.a.f(0.2f, w02, y6.w0(i17, u6Var3)));
        frameLayout.setBackground(c02);
        a7 p10 = f7.p(frameLayout, true);
        p10.d = c02;
        p10.e = null;
        p10.f = null;
        z6 z6Var = new z6();
        p10.e = z6Var;
        z6Var.c(i16, i17, 3, 0.2f, u6Var3);
        z6Var.g = f7.u(c02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        f7.V(textView4, i17, u6Var3);
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView4, gb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        k10.setTextSize(1, 13.0f);
        k10.setGravity(21);
        k10.setTypeface(AndroidUtilities.bold());
        f7.V(k10, i17, u6Var3);
        k10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(k10, gb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View a0Var = new a0(context, clamp);
        int dp2 = AndroidUtilities.dp(14.0f);
        int i18 = y6.Oh;
        Drawable c03 = y6.c0(dp2, y6.w0(i18, u6Var3));
        b7 N = f7.N(i18);
        a0Var.setBackground(c03);
        f7.k(a0Var, c03, N, null, u6Var3);
        frameLayout.addView(a0Var, gb1.i(-1, -1, 119));
        b0 b0Var = new b0(context, clamp);
        b0Var.setWillNotDraw(false);
        frameLayout.addView(b0Var, gb1.i(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        b0Var.addView(textView5, gb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        b0Var.addView(textView6, gb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.d0;
        if (auction == null || auction.auctionStateActive == null) {
            z90Var = null;
        } else {
            z90Var = new z90(context, null);
            z90Var.setTextSize(1, 13.0f);
            z90Var.setGravity(17);
            f7.V(z90Var, i15, u6Var3);
            z90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.d0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new p(context, u6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            f7.H(z90Var, y6.J6, u6Var3);
        }
        if (!z10) {
            linearLayout.addView(linearLayout2, gb1.o(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
            linearLayout.addView(textView3, gb1.o(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
            linearLayout.addView(frameLayout, gb1.o(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
            if (z90Var != null) {
                linearLayout.addView(z90Var, gb1.o(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
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
            dVar.setOnClickListener(new n(this, j10, context, u6Var3, runnable, 1));
            return;
        }
        if (context != null) {
            TextView textView7 = new TextView(context);
            textView7.setTypeface(AndroidUtilities.bold());
            textView7.setGravity(17);
            textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
            textView7.setTextSize(1, 20.0f);
            f7.V(textView7, i17, u6Var3);
            linearLayout.addView(textView7, gb1.x(-1, -2, 17, 20, 14, 20, 6));
            TextView textView8 = new TextView(context);
            textView8.setGravity(17);
            org.telegram.ui.d3.o(R.string.GiftAuctionWearInfoText, textView8, 1, 14.0f);
            f7.V(textView8, i17, u6Var3);
            linearLayout.addView(textView8, gb1.x(-1, -2, 17, 20, 0, 20, 16));
            gw0 gw0Var = new gw0(context, u6Var3);
            gw0Var.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
            gw0Var.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
            gw0Var.d.setVisibility(8);
            int i19 = R.drawable.msg_emoji_gem;
            ImageView imageView2 = gw0Var.c;
            imageView2.setImageResource(i19);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            f7.t(imageView2, i17, u6Var3, mode);
            linearLayout.addView(gw0Var, gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var2 = new gw0(context, u6Var3);
            gw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
            gw0Var2.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
            gw0Var2.d.setVisibility(8);
            int i20 = R.drawable.menu_feature_cover_24;
            ImageView imageView3 = gw0Var2.c;
            imageView3.setImageResource(i20);
            f7.t(imageView3, i17, u6Var3, mode);
            linearLayout.addView(gw0Var2, gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var3 = new gw0(context, u6Var3);
            gw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
            gw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
            gw0Var3.d.setVisibility(8);
            int i21 = R.drawable.menu_verification;
            ImageView imageView4 = gw0Var3.c;
            imageView4.setImageResource(i21);
            f7.t(imageView4, i17, u6Var3, mode);
            linearLayout.addView(gw0Var3, gb1.o(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
        }
        dVar.i(h7.H2(LocaleController.getString(R.string.Understood)), false, true);
        dVar.setOnClickListener(new ig.d0(this, 28));
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int f7 = i0.a.f(0.1f, getThemedColor(y6.i5), getThemedColor(y6.h5));
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
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 29), this.resourcesProvider);
        this.e0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return "";
    }
}
