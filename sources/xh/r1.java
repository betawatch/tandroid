package xh;

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb;
import org.telegram.ui.eg;
import org.telegram.ui.pj0;
import org.telegram.ui.u21;
import w7.a6;
import w7.y5;
import yh.b6;
import yh.k7;
import yh.l5;
import yh.u5;
import yh.w7;
import yh.y6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class r1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int v0 = 0;
    public final int X;
    public m61 Y;
    public List Z;
    public final Utilities.Callback a0;
    public TLRPC.DisallowedGiftsSettings b0;
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final k7 f0;
    public final v0 g0;
    public final FrameLayout h0;
    public final LinearLayout i0;
    public final nz j0;
    public final a1 k0;
    public final w0 l0;
    public final x0 m0;
    public final ArrayList n0;
    public final l5 o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    public r1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void P(final r1 r1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, o0 o0Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            o0Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new xc(r1Var.container, r1Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r1Var.getContext(), 0, r1Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        final ku kuVar = o9.n;
        if (kuVar != null) {
            kuVar.setOnLinkPressListener(new m90() { // from class: xh.r0
                @Override // org.telegram.ui.Components.m90
                public final void a(ClickableSpan clickableSpan) {
                    r1 r1Var2 = r1.this;
                    r1Var2.getClass();
                    o9.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    r1Var2.dismiss();
                    clickableSpan.onClick(kuVar);
                }
            });
        }
    }

    public static void Q(r1 r1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        y51 G = r1Var.Y.G(i11 - 1);
        if (G != null && G.G(i1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof rg.k) {
                new b1(r1Var, context, i10, (rg.k) obj, r1Var.c0, new m0(r1Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                l5 l5Var = r1Var.o0;
                if (l5Var != null && r1Var.s0 == r1Var.q0) {
                    ArrayList arrayList = l5Var.l;
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
                    c1 c1Var = new c1(r1Var, r1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), r1Var.resourcesProvider);
                    c1Var.j2(savedStarGift, null);
                    c1Var.Z1(j3, new org.telegram.messenger.f2(r1Var, c1Var, j3, callback, 5));
                    return;
                }
                if (G.q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    l2Var.e = true;
                    d1 d1Var = new d1(j3, starGift.title, starGift.id, r1Var.resourcesProvider, r1Var.container.getViewTreeObserver(), new n0());
                    d1Var.e = new pj0(13, r1Var, callback);
                    U.showAsSheet(d1Var, l2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.id, new org.telegram.ui.Components.y2(context, r1Var.resourcesProvider, i10, j3, new m0(r1Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new xc(r1Var.container, r1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    o0 o0Var = new o0(r1Var, context, i10, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(r1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.p3(r1Var, b2Var, o0Var, callback, 15));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        o0Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 == null) {
                        return;
                    }
                    rg.k1 k1Var = new rg.k1(U2, i10, null, null, starGift, r1Var.resourcesProvider);
                    v9 v9Var = new v9(r1Var.getContext());
                    n5 n5Var = new n5(AndroidUtilities.dp(160.0f), 4, v9Var, false);
                    v9Var.setImageDrawable(n5Var);
                    v9Var.addOnAttachStateChangeListener(new u0(n5Var));
                    n5Var.i(starGift.getDocument(), false);
                    k1Var.B0 = v9Var;
                    k1Var.show();
                    n5Var.f();
                    return;
                }
                f6 f6Var = r1Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.f3 j10 = rk.j(1, context, f6Var, false);
                LinearLayout f7 = rk.f(context, 1);
                f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                f7.setClipChildren(false);
                f7.setClipToPadding(false);
                v9 v9Var2 = new v9(context);
                w7.a1(v9Var2.getImageReceiver(), starGift, 160);
                f7.addView(v9Var2, y5.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                org.telegram.ui.Cells.c1.q(j6.j5, f6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, y5.t(-1, -2, 17, 20, 0, 20, 4), context);
                h.setTextSize(1, 14.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(j6.v0(j6.q7, f6Var));
                h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                f7.addView(h, y5.t(-1, -2, 17, 20, 0, 20, 4));
                c01 c01Var = new c01(context, f6Var);
                if (starGift.first_sale_date != 0) {
                    c01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    c01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                c01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), w7.X0(false, hg.k0.j(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    w7.F0(c01Var, i10, starGift, f6Var);
                }
                f7.addView(c01Var, y5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                ci.d dVar = new ci.d(context, f6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                f7.addView(dVar, y5.n(-1, 48));
                j10.customView = f7;
                org.telegram.ui.ActionBar.f3[] f3VarArr = {j10};
                f3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new b6(f3VarArr, 2));
                f3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U3)) {
                    f3VarArr[0].makeAttached(U3);
                }
                f3VarArr[0].show();
            }
        }
    }

    public final void U(ArrayList arrayList, m61 m61Var) {
        long j3;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 3;
        int i11 = 2;
        v0 v0Var = this.g0;
        long j10 = this.c0;
        long j11 = 0;
        int i12 = 0;
        boolean z12 = this.d0;
        if (z12 || j10 < 0 || ((disallowedGiftsSettings4 = this.b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(y51.k(v0Var));
            arrayList.add(y51.k(this.h0));
            ArrayList arrayList2 = this.n0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j3 = 0;
                y51 o9 = y51.o(1, 34);
                o9.u = 1;
                arrayList.add(o9);
                y51 o10 = y51.o(2, 34);
                o10.u = 1;
                arrayList.add(o10);
                y51 o11 = y51.o(3, 34);
                o11.u = 1;
                arrayList.add(o11);
            } else {
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    int i14 = i1.a;
                    y51 J = y51.J(i1.class);
                    J.u = 1;
                    J.G = (rg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            }
            z10 = true;
        }
        int i15 = this.X;
        u5 y3 = u5.y(i15, false);
        ArrayList arrayList3 = this.t0 ? y3.J : y3.I;
        if (this.b0 != null) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new ei.q1(this, i11)).collect(Collectors.toCollection(new eg()));
        }
        if (j10 < j3) {
            arrayList3 = (ArrayList) Collection.-EL.stream(arrayList3).filter(new bb(i10)).collect(Collectors.toCollection(new eg()));
        }
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        l5 l5Var = this.o0;
        if (j10 != clientUserId && l5Var != null) {
            ArrayList arrayList4 = l5Var.l;
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
        if (MessagesController.getInstance(i15).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.b0) == null || disallowedGiftsSettings3.disallow_unique_stargifts || l5Var == null || l5Var.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.b0;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(y51.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(y51.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(y51.k(v0Var));
        }
        arrayList.add(y51.k(this.i0));
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
        q0 q0Var = new q0(this, i12);
        int i19 = p1.a;
        y51 J2 = y51.J(p1.class);
        J2.d = 1;
        J2.G = arrayList5;
        J2.z = i18;
        J2.H = q0Var;
        arrayList.add(J2);
        boolean z13 = this.s0 == this.r0 && !z12 && j10 >= j3;
        if (z13 != this.u0) {
            this.u0 = z13;
            ViewPropertyAnimator duration = this.l0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).start();
            this.m0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(qrVar).start();
        }
        if (l5Var != null && this.s0 == this.q0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = l5Var.l;
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
            if (i23 == this.p0 || i23 == this.q0 || (i23 == this.r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j3 || i23 == this.r0) {
                    starGift = starGift3;
                } else {
                    y51 a2 = i1.a(i23, starGift3, i23 == this.q0, starGift3.limited && (disallowedGiftsSettings2 = this.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(a2);
                    i21++;
                }
                int i24 = this.s0;
                arrayList.add(i1.a(i24, starGift, i24 == this.q0, starGift.limited && (disallowedGiftsSettings = this.b0) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i21++;
            }
        }
        int i25 = this.s0;
        int i26 = this.q0;
        if (i25 == i26 && l5Var != null && !l5Var.j) {
            l5Var.a();
            y51 o12 = y51.o(4, 34);
            o12.u = 1;
            arrayList.add(o12);
            y51 o13 = y51.o(5, 34);
            o13.u = 1;
            arrayList.add(o13);
            y51 o14 = y51.o(6, 34);
            o14.u = 1;
            arrayList.add(o14);
        } else if (i25 != i26 && y3.C) {
            y51 o15 = y51.o(4, 34);
            o15.u = 1;
            arrayList.add(o15);
            y51 o16 = y51.o(5, 34);
            o16.u = 1;
            arrayList.add(o16);
            y51 o17 = y51.o(6, 34);
            o17.u = 1;
            arrayList.add(o17);
        }
        arrayList.add(y51.C(AndroidUtilities.dp(i21 < 9 ? 300.0f : 40.0f)));
    }

    public final void V(boolean z10) {
        this.t0 = z10;
        this.Y.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
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
                    rg.k kVar = new rg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        c5.a aVar = new c5.a();
                        aVar.c = "inapp";
                        aVar.b = kVar.h();
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
                    ((rg.k) obj).g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new r5.d(this, 17));
            }
        }
        if (arrayList.isEmpty()) {
            tg.s.j(this.X, null, new q0(this, 1));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m61 m61Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            m61 m61Var2 = this.Y;
            if (m61Var2 != null) {
                m61Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.o0 && (m61Var = this.Y) != null) {
                    m61Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new xc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                m61 m61Var3 = this.Y;
                if (m61Var3 != null) {
                    m61Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.c0;
            if (longValue == j3 && j3 > 0) {
                int i12 = this.X;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j3 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.b0 = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                        return;
                    }
                    return;
                }
                m61 m61Var4 = this.Y;
                if (m61Var4 != null) {
                    m61Var4.N(true);
                }
            }
            ArrayList arrayList = this.n0;
            if (arrayList == null || arrayList.isEmpty()) {
                W();
                m61 m61Var5 = this.Y;
                if (m61Var5 != null) {
                    m61Var5.N(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        int i10 = this.X;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.c0)))).j();
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(this.d, getContext(), this.X, 0, true, new hi.a(this, 16), this.resourcesProvider);
        this.Y = m61Var;
        m61Var.r = false;
        return m61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.d0 ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.e0), null, false);
    }

    public r1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        this.n0 = new ArrayList();
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        new ArrayList();
        this.X = i10;
        this.c0 = j3;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j3;
        this.d0 = z10;
        this.Z = list;
        this.a0 = callback;
        int i11 = j6.b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(j6.w0(null, i11, false));
        fixNavigationBar(j6.w0(null, i11, false));
        this.o0 = u5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        u5.y(i10, false).V();
        v9 v9Var = new v9(context);
        v9Var.setImportantForAccessibility(2);
        g9 g9Var = new g9((f6) null);
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e0 = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            v9Var.e(user, g9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (j3 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.e0 = chat == null ? "" : chat.title;
            g9Var.q(chat);
            v9Var.e(chat, g9Var);
        }
        this.v = 0.1f;
        k7 k7Var = new k7(context, i10, this.resourcesProvider);
        this.f0 = k7Var;
        a6.a(k7Var);
        k7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        v0 v0Var = new v0(context);
        this.g0 = v0Var;
        v0Var.setClipChildren(false);
        v0Var.setClipToPadding(false);
        v0Var.addView(new y6(context, 70, 0), y5.c(-1.0f, -1));
        v9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        v0Var.addView(v9Var, y5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        a6.a(v9Var);
        v9Var.setOnClickListener(new ai.a3(this, j3, 5));
        v0Var.addView(k7Var, y5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, y5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i12 = j6.j5;
        f7.setTextColor(j6.v0(i12, this.resourcesProvider));
        f7.setGravity(17);
        linearLayout.addView(f7, y5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ci.f4.a(f7.getText(), f7.getPaint()));
        n90 n90Var = new n90(context, this.resourcesProvider);
        int i13 = j6.gc;
        n90Var.setLinkTextColor(j6.v0(i13, this.resourcesProvider));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(j6.v0(i12, this.resourcesProvider));
        n90Var.setGravity(17);
        n90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(n90Var, y5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        n90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new u21(17)), true)));
        n90Var.setMaxWidth(ci.f4.a(n90Var.getText(), n90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(j6.v0(i12, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, y5.t(-1, -2, 1, 4, 0, 4, 0));
        w0 w0Var = new w0(context, this.resourcesProvider);
        this.l0 = w0Var;
        w0Var.setLinkTextColor(j6.v0(i13, this.resourcesProvider));
        w0Var.setTextSize(1, 14.0f);
        w0Var.setTextColor(j6.v0(i12, this.resourcesProvider));
        w0Var.setGravity(17);
        x0 x0Var = new x0(context, this.resourcesProvider);
        this.m0 = x0Var;
        x0Var.setLinkTextColor(j6.v0(i13, this.resourcesProvider));
        x0Var.setTextSize(1, 14.0f);
        x0Var.setTextColor(j6.v0(i12, this.resourcesProvider));
        x0Var.setGravity(17);
        x0Var.setAlpha(0.0f);
        x0Var.setScaleX(0.85f);
        x0Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(w0Var, y5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(x0Var, y5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j3 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (z10) {
            linearLayout2.addView(frameLayout2, y5.t(-2, -2, 1, 0, 9, 0, 4));
            n90 n90Var2 = new n90(context, this.resourcesProvider);
            n90Var2.setLinkTextColor(j6.v0(i13, this.resourcesProvider));
            n90Var2.setTextSize(1, 14.0f);
            n90Var2.setTextColor(j6.v0(i12, this.resourcesProvider));
            n90Var2.setGravity(17);
            linearLayout2.addView(n90Var2, y5.t(-2, -2, 1, 26, 4, 26, 6));
            w0Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            n90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (j3 < 0) {
            linearLayout2.addView(frameLayout2, y5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(w0Var);
            w0Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.e0)), w0Var.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout2, y5.t(-1, -2, 1, 0, 9, 0, 6));
            l5 G = u5.y(i10, false).G(j3, true);
            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j3, callback, context, 8);
            fVar.run();
            w0Var.addOnAttachStateChangeListener(new y0(fVar));
            if (G.l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(w0Var, NotificationCenter.starUserGiftsLoaded, new pj0(14, G, fVar));
        }
        nz nzVar = new nz(3, false);
        this.j0 = nzVar;
        nzVar.O = new z0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        a1 a1Var = new a1();
        this.k0 = a1Var;
        a1Var.C = false;
        a1Var.m = false;
        a1Var.n(350L);
        a1Var.o(qr.h);
        a1Var.D = 40L;
        this.d.setItemAnimator(a1Var);
        this.d.setOnItemClickListener(new ml0() { // from class: xh.s0
            @Override // org.telegram.ui.Components.ml0
            public final void d(int i14, View view) {
                r1.Q(r1.this, context, i10, callback, j3, i14);
            }
        });
        W();
        this.Y.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j3)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
