package yh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.b31;
import org.telegram.ui.fb;
import org.telegram.ui.jg;
import w7.b6;
import w7.z5;
import zh.d7;
import zh.f5;
import zh.n5;
import zh.p7;
import zh.r6;
import zh.u5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p1 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int v0 = 0;
    public final int X;
    public a71 Y;
    public List Z;
    public final Utilities.Callback a0;
    public TLRPC.DisallowedGiftsSettings b0;
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final d7 f0;
    public final u0 g0;
    public final FrameLayout h0;
    public final LinearLayout i0;
    public final zz j0;
    public final z0 k0;
    public final v0 l0;
    public final w0 m0;
    public final ArrayList n0;
    public final f5 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    public p1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void Q(final p1 p1Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, rg.g2 g2Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        a2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            g2Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new zc(p1Var.container, p1Var.resourcesProvider).f0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.a2 o10 = alertDialog$Builder.o();
        final wu wuVar = o10.n;
        if (wuVar != null) {
            wuVar.setOnLinkPressListener(new ca0() { // from class: yh.q0
                @Override // org.telegram.ui.Components.ca0
                public final void a(ClickableSpan clickableSpan) {
                    p1 p1Var2 = p1.this;
                    p1Var2.getClass();
                    o10.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    p1Var2.dismiss();
                    clickableSpan.onClick(wuVar);
                }
            });
        }
    }

    public static void R(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        m61 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.G(g1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new a1(p1Var, context, i10, (sg.k) obj, p1Var.c0, new n0(p1Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                f5 f5Var = p1Var.o0;
                if (f5Var != null && p1Var.s0 == p1Var.q0) {
                    ArrayList arrayList = f5Var.l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.id == starGift.id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    b1 b1Var = new b1(p1Var, p1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), p1Var.resourcesProvider);
                    b1Var.l2(savedStarGift, null);
                    b1Var.a2(j10, new bi.i(p1Var, b1Var, j10, callback, 6));
                    return;
                }
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    k2Var.e = true;
                    c1 c1Var = new c1(j10, starGift.title, starGift.id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new o0());
                    c1Var.e = new z6(8, p1Var, callback);
                    U.showAsSheet(c1Var, k2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new org.telegram.ui.Components.b3(context, p1Var.resourcesProvider, i10, j10, new n0(p1Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new zc(p1Var.container, p1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    rg.g2 g2Var = new rg.g2(p1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(p1Var.getContext(), 3, null);
                        a2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new bi.f3(p1Var, a2Var, g2Var, callback, 15));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        g2Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    sg.m1 m1Var = new sg.m1(U2, i10, null, null, starGift, p1Var.resourcesProvider);
                    z9 z9Var = new z9(p1Var.getContext());
                    q5 q5Var = new q5(AndroidUtilities.dp(160.0f), 4, z9Var, false);
                    z9Var.setImageDrawable(q5Var);
                    z9Var.addOnAttachStateChangeListener(new t0(q5Var));
                    q5Var.i(starGift.getDocument(), false);
                    m1Var.B0 = z9Var;
                    m1Var.show();
                    q5Var.f();
                    return;
                }
                c6 c6Var = p1Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.e3 i13 = sk.i(1, context, c6Var, false);
                LinearLayout e = sk.e(context, 1);
                e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                e.setClipChildren(false);
                e.setClipToPadding(false);
                z9 z9Var2 = new z9(context);
                p7.b1(z9Var2.getImageReceiver(), starGift, 160);
                e.addView(z9Var2, z5.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.Cells.c1.n(g6.j5, c6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView i14 = com.google.android.gms.internal.play_billing.k3.i(e, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                i14.setTextSize(1, 14.0f);
                i14.setTypeface(AndroidUtilities.bold());
                i14.setGravity(17);
                i14.setTextColor(g6.w0(g6.q7, c6Var));
                i14.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                e.addView(i14, z5.t(-1, -2, 17, 20, 0, 20, 4));
                o01 o01Var = new o01(context, c6Var);
                if (starGift.first_sale_date != 0) {
                    o01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    o01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                o01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), p7.Y0(false, org.telegram.messenger.g0.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    p7.G0(o01Var, i10, starGift, c6Var);
                }
                e.addView(o01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                di.d dVar = new di.d(context, c6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                e.addView(dVar, z5.n(-1, 48));
                i13.customView = e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = {i13};
                e3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new u5(e3VarArr, 2));
                e3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    e3VarArr[0].makeAttached(U3);
                }
                e3VarArr[0].show();
            }
        }
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return this.d0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.e0), null, false);
    }

    public final void V(ArrayList arrayList, a71 a71Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 3;
        int i11 = 2;
        u0 u0Var = this.g0;
        long j11 = this.c0;
        long j12 = 0;
        int i12 = 0;
        boolean z12 = this.d0;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(m61.k(u0Var));
            arrayList.add(m61.k(this.h0));
            ArrayList arrayList2 = this.n0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                m61 o10 = m61.o(1, 34);
                o10.u = 1;
                arrayList.add(o10);
                m61 o11 = m61.o(2, 34);
                o11.u = 1;
                arrayList.add(o11);
                m61 o12 = m61.o(3, 34);
                o12.u = 1;
                arrayList.add(o12);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = g1.a;
                    m61 J = m61.J(g1.class);
                    J.u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j12 = j12;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i15 = this.X;
        n5 y3 = n5.y(i15, false);
        ArrayList arrayList3 = this.t0 ? y3.J : y3.I;
        if (this.b0 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new fi.p1(this, i11)).collect(Collectors.toCollection(new jg()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new fb(i10)).collect(Collectors.toCollection(new jg()));
        }
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        f5 f5Var = this.o0;
        if (j11 != clientUserId && f5Var != null) {
            ArrayList arrayList4 = f5Var.l;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList4.get(i16);
                i16++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (MessagesController.getInstance(i15).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.b0) == null || disallowedGiftsSettings3.disallow_unique_stargifts || f5Var == null || f5Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.b0;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(m61.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(m61.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(m61.k(u0Var));
        }
        arrayList.add(m61.k(this.i0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.b0;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i17)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.q0 = -1;
        this.p0 = -1;
        if (!arrayList3.isEmpty()) {
            this.p0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.b0;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.q0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
        }
        this.r0 = arrayList5.size();
        arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
        int i18 = this.s0;
        p0 p0Var = new p0(this, i12);
        int i19 = n1.a;
        m61 J2 = m61.J(n1.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i18;
        J2.H = p0Var;
        arrayList.add(J2);
        boolean z13 = this.s0 == this.r0 && !z12 && j11 >= j10;
        if (z13 != this.u0) {
            this.u0 = z13;
            ViewPropertyAnimator duration = this.l0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            es esVar = es.h;
            duration.setInterpolator(esVar).start();
            this.m0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(esVar).start();
        }
        if (f5Var != null && this.s0 == this.q0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = f5Var.l;
            int size3 = arrayList6.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj3 = arrayList6.get(i20);
                i20++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i22);
            int i23 = this.s0;
            if (i23 == this.p0 || i23 == this.q0 || (i23 == this.r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i23 == this.r0) {
                    starGift = starGift3;
                } else {
                    m61 a2 = g1.a(i23, starGift3, i23 == this.q0, starGift3.limited && (disallowedGiftsSettings2 = this.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i21++;
                }
                int i24 = this.s0;
                arrayList.add(g1.a(i24, starGift, i24 == this.q0, starGift.limited && (disallowedGiftsSettings = this.b0) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i25 = this.s0;
        int i26 = this.q0;
        if (i25 == i26 && f5Var != null && !f5Var.j) {
            f5Var.a();
            m61 o13 = m61.o(4, 34);
            o13.u = 1;
            arrayList.add(o13);
            m61 o14 = m61.o(5, 34);
            o14.u = 1;
            arrayList.add(o14);
            m61 o15 = m61.o(6, 34);
            o15.u = 1;
            arrayList.add(o15);
        } else if (i25 != i26 && y3.C) {
            m61 o16 = m61.o(4, 34);
            o16.u = 1;
            arrayList.add(o16);
            m61 o17 = m61.o(5, 34);
            o17.u = 1;
            arrayList.add(o17);
            m61 o18 = m61.o(6, 34);
            o18.u = 1;
            arrayList.add(o18);
        }
        arrayList.add(m61.C(AndroidUtilities.dp(i21 < 9 ? 300.0f : 40.0f)));
    }

    public final void W(boolean z10) {
        this.t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.Z.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.Z.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.Z.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    sg.k kVar = new sg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        c5.a aVar = new c5.a();
                        aVar.b = "inapp";
                        aVar.a = kVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((sg.k) obj).g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new rg.b0(this, 21));
            }
        }
        if (arrayList.isEmpty()) {
            ug.s.j(this.X, null, new p0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            a71 a71Var2 = this.Y;
            if (a71Var2 != null) {
                a71Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.o0 && (a71Var = this.Y) != null) {
                    a71Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new zc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                a71 a71Var3 = this.Y;
                if (a71Var3 != null) {
                    a71Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.c0;
            if (longValue == j10 && j10 > 0) {
                int i12 = this.X;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.b0 = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        zc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                a71 a71Var4 = this.Y;
                if (a71Var4 != null) {
                    a71Var4.N(true);
                }
            }
            ArrayList arrayList = this.n0;
            if (arrayList == null || arrayList.isEmpty()) {
                X();
                a71 a71Var5 = this.Y;
                if (a71Var5 != null) {
                    a71Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.X;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        int i10 = this.X;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.b0;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            zc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.c0)))).j();
        }
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.X, 0, true, new ii.a(this, 16), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.r = false;
        return a71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.n0 = new ArrayList();
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        new ArrayList();
        this.X = i10;
        this.c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.d0 = z10;
        this.Z = list;
        this.a0 = callback;
        int i12 = g6.b6;
        setBackgroundColor(g6.x0(null, i12, false));
        fixNavigationBar(g6.x0(null, i12, false));
        this.o0 = n5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        n5.y(i10, false).V();
        z9 z9Var = new z9(context);
        z9Var.setImportantForAccessibility(2);
        k9 k9Var = new k9((c6) null);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e0 = UserObject.getForcedFirstName(user);
            k9Var.r(user);
            z9Var.e(user, k9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            this.b0 = (j10 == UserConfig.getInstance(i10).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.e0 = chat == null ? "" : chat.title;
            k9Var.q(chat);
            z9Var.e(chat, k9Var);
        }
        this.v = 0.1f;
        d7 d7Var = new d7(context, i10, this.resourcesProvider);
        this.f0 = d7Var;
        b6.a(d7Var);
        d7Var.setOnClickListener(new ji.o4(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        u0 u0Var = new u0(context);
        this.g0 = u0Var;
        u0Var.setClipChildren(false);
        u0Var.setClipToPadding(false);
        u0Var.addView(new r6(context, 70, 0), z5.d(-1.0f, -1));
        z9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        u0Var.addView(z9Var, z5.a(84.0f, 0.0f, 15.0f, 0.0f, 17.0f, 84, 17));
        b6.a(z9Var);
        z9Var.setOnClickListener(new bi.p2(this, j10, 5));
        u0Var.addView(d7Var, z5.a(-2.0f, 0.0f, -3.0f, -10.0f, 0.0f, -2, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, z5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i13 = g6.j5;
        f7.setTextColor(g6.w0(i13, this.resourcesProvider));
        f7.setGravity(17);
        linearLayout.addView(f7, z5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(di.d4.a(f7.getText(), f7.getPaint()));
        da0 da0Var = new da0(context, this.resourcesProvider);
        int i14 = g6.gc;
        da0Var.setLinkTextColor(g6.w0(i14, this.resourcesProvider));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(g6.w0(i13, this.resourcesProvider));
        da0Var.setGravity(17);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(da0Var, z5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        da0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new b31(20)), true)));
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(g6.w0(i13, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, z5.t(-1, -2, 1, 4, 0, 4, 0));
        v0 v0Var = new v0(context, this.resourcesProvider);
        this.l0 = v0Var;
        v0Var.setLinkTextColor(g6.w0(i14, this.resourcesProvider));
        v0Var.setTextSize(1, 14.0f);
        v0Var.setTextColor(g6.w0(i13, this.resourcesProvider));
        v0Var.setGravity(17);
        w0 w0Var = new w0(context, this.resourcesProvider);
        this.m0 = w0Var;
        w0Var.setLinkTextColor(g6.w0(i14, this.resourcesProvider));
        w0Var.setTextSize(1, 14.0f);
        w0Var.setTextColor(g6.w0(i13, this.resourcesProvider));
        w0Var.setGravity(17);
        w0Var.setAlpha(0.0f);
        w0Var.setScaleX(0.85f);
        w0Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(v0Var, z5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
        frameLayout2.addView(w0Var, z5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        int i15 = 9;
        if (z10) {
            linearLayout2.addView(frameLayout2, z5.t(-2, -2, 1, 0, 9, 0, 4));
            da0 da0Var2 = new da0(context, this.resourcesProvider);
            da0Var2.setLinkTextColor(g6.w0(i14, this.resourcesProvider));
            da0Var2.setTextSize(1, 14.0f);
            da0Var2.setTextColor(g6.w0(i13, this.resourcesProvider));
            da0Var2.setGravity(17);
            linearLayout2.addView(da0Var2, z5.t(-2, -2, 1, 26, 4, 26, 6));
            v0Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            da0Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else {
            if (j10 >= 0) {
                linearLayout2.addView(frameLayout2, z5.t(-1, -2, 1, 0, 9, 0, 6));
                f5 G = n5.y(i10, false).G(j10, true);
                org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j10, callback, context, 8);
                fVar.run();
                v0Var.addOnAttachStateChangeListener(new x0(fVar));
                i11 = 3;
                if (G.l.size() < 3) {
                    G.a();
                }
                NotificationCenter.getInstance(i10).listen(v0Var, NotificationCenter.starUserGiftsLoaded, new z6(i15, G, fVar));
                zz zzVar = new zz(i11, false);
                this.j0 = zzVar;
                zzVar.O = new y0(this);
                this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                this.d.setClipToPadding(false);
                this.d.setClipChildren(false);
                this.d.setLayoutManager(zzVar);
                this.d.setSelectorType(9);
                this.d.setSelectorDrawableColor(0);
                z0 z0Var = new z0();
                this.k0 = z0Var;
                z0Var.C = false;
                z0Var.m = false;
                z0Var.n(350L);
                z0Var.o(es.h);
                z0Var.D = 40L;
                this.d.setItemAnimator(z0Var);
                this.d.setOnItemClickListener(new am0() { // from class: yh.r0
                    @Override // org.telegram.ui.Components.am0
                    public final void a(int i16, View view) {
                        p1.R(p1.this, context, i10, callback, j10, i16);
                    }
                });
                X();
                this.Y.N(false);
                O();
                if (BirthdayController.getInstance(i10).isToday(j10)) {
                    W(true);
                }
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
                this.e.setTitle(B());
                NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
            }
            linearLayout2.addView(frameLayout2, z5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(v0Var);
            v0Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.e0)), v0Var.getPaint().getFontMetricsInt(), false));
        }
        i11 = 3;
        zz zzVar2 = new zz(i11, false);
        this.j0 = zzVar2;
        zzVar2.O = new y0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(zzVar2);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        z0 z0Var2 = new z0();
        this.k0 = z0Var2;
        z0Var2.C = false;
        z0Var2.m = false;
        z0Var2.n(350L);
        z0Var2.o(es.h);
        z0Var2.D = 40L;
        this.d.setItemAnimator(z0Var2);
        this.d.setOnItemClickListener(new am0() { // from class: yh.r0
            @Override // org.telegram.ui.Components.am0
            public final void a(int i16, View view) {
                p1.R(p1.this, context, i10, callback, j10, i16);
            }
        });
        X();
        this.Y.N(false);
        O();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(B());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
