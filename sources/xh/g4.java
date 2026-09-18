package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.za;
import org.telegram.ui.dp0;
import org.telegram.ui.xy0;
import w7.x5;
import yh.n5;
import yh.v5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class g4 extends za {
    public static final /* synthetic */ int k0 = 0;
    public final String X;
    public final f4 Y;
    public final HorizontalScrollView Z;
    public final l3 a0;
    public final l3 b0;
    public final l3 c0;
    public final l3 d0;
    public final yh.l2 e0;
    public yh.w0 f0;
    public final HashSet g0;
    public boolean h0;
    public e4 i0;
    public boolean j0;

    public g4(final Context context, String str, final f4 f4Var) {
        super(2, context, (f6) null, false);
        this.g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = f4Var;
        this.e.setTitle(y());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.Z = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        l3 l3Var = new l3(context, this.resourcesProvider);
        this.a0 = l3Var;
        l3Var.setSorting(f4Var.c.p);
        linearLayout.addView(l3Var, x5.t(-2, -2, 16, 0, 0, 6, 0));
        l3Var.setOnClickListener(new xy0(26, this, f4Var));
        l3 l3Var2 = new l3(context, this.resourcesProvider);
        this.b0 = l3Var2;
        l3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(l3Var2, x5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i10 = 0;
        l3Var2.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g4.R(this.b, f4Var, context);
                        break;
                    case 1:
                        g4.W(this.b, f4Var, context);
                        break;
                    default:
                        g4.S(this.b, f4Var, context);
                        break;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourcesProvider);
        this.c0 = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(l3Var3, x5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        l3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g4.R(this.b, f4Var, context);
                        break;
                    case 1:
                        g4.W(this.b, f4Var, context);
                        break;
                    default:
                        g4.S(this.b, f4Var, context);
                        break;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourcesProvider);
        this.d0 = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(l3Var4, x5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i12 = 2;
        l3Var4.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a4
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g4.R(this.b, f4Var, context);
                        break;
                    case 1:
                        g4.W(this.b, f4Var, context);
                        break;
                    default:
                        g4.S(this.b, f4Var, context);
                        break;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new tg.d(13, this, f4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new kb0(this, 18));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new t0.a(27));
        yh.l2 l2Var = new yh.l2(context);
        this.e0 = l2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        l2Var.h = dp;
        l2Var.n = dp2;
        l2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        l2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.b1(l2Var, 23), 12.0f, 12, null, new ArrayList());
        l2Var.setPivotY(0.0f);
        this.container.addView(l2Var, x5.e(-1, -2, 55));
        this.i0.N(false);
        f4Var.d = new y3(this, 1);
    }

    public static void P(g4 g4Var, f4 f4Var) {
        n70 F = n70.F(g4Var.container, g4Var.resourcesProvider, g4Var.a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new x3(f4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new x3(f4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new x3(f4Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(g4 g4Var, f4 f4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        j51 G = g4Var.i0.G(i10 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z10 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && g4Var.h0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g4Var.getContext(), 0, g4Var.resourcesProvider);
                String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                hg.k0.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(g4Var.getContext(), 3, null);
                c2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(g4Var.currentAccount).getClientUserId();
                zf.b bVar = tL_starGiftUnique.resale_ton_only ? zf.b.b : zf.b.a;
                v5.x(g4Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new dp0(g4Var, c2Var2, bVar, tL_starGiftUnique, clientUserId));
                return;
            }
            if (!z10) {
                ArrayList arrayList = f4Var.b.l;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        savedStarGift = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    savedStarGift = (TL_stars.SavedStarGift) obj2;
                    if (savedStarGift.gift == starGift) {
                        break;
                    }
                }
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g4Var.getContext());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
                    c2Var3.R = string2;
                    c2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    hg.k0.A(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            g4Var.f0.run(starGift);
            g4Var.dismiss();
        }
    }

    public static void R(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.c;
        if (u3Var.f.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var.container, g4Var.resourcesProvider, g4Var.b0, false, true, false);
        n70Var.t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.p = new ii.h(n70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f);
        Collections.sort(arrayList, new z3(f4Var, 2));
        int i10 = 0;
        b4 b4Var = new b4(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, i10), new w3(f4Var, n70Var, i10), null, g4Var.resourcesProvider);
        b4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, g4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, b4Var, false, 11));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.j.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 0), false);
        }
        n70Var.q(b4Var);
        n70Var.Z();
    }

    public static void S(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.c;
        if (u3Var.h.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var.container, g4Var.resourcesProvider, g4Var.d0, false, true, false);
        n70Var.t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.p = new ii.h(n70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new z3(f4Var, 1));
        int i10 = 2;
        d4 d4Var = new d4(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, i10), new w3(f4Var, n70Var, i10), null, g4Var.resourcesProvider);
        d4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, g4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, d4Var, false, 13));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.l.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 2), false);
        }
        n70Var.q(d4Var);
        n70Var.Z();
    }

    public static void T(g4 g4Var, ArrayList arrayList) {
        f4 f4Var = g4Var.Y;
        if (f4Var != null) {
            n5 n5Var = f4Var.b;
            u3 u3Var = f4Var.c;
            if (n5Var == null || u3Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime();
            arrayList.add(j51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = n5Var.l;
            int size = arrayList2.size();
            int i10 = 0;
            boolean z10 = true;
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!g4Var.g0.contains(Long.valueOf(savedStarGift.gift.id))) {
                    boolean z11 = savedStarGift.can_craft_at <= currentTime;
                    j51 a2 = h1.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i11++;
                    z10 = false;
                }
            }
            if (n5Var.i || !n5Var.j) {
                int i13 = i11 % 3;
                int i14 = 6 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    j51 o9 = j51.o((i15 - i13) + 1, 35);
                    o9.u = 1;
                    arrayList.add(o9);
                }
            } else if (z10) {
                arrayList.add(j51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (u3Var.e > 0 || g4Var.j0) {
                g4Var.j0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                j51 j51Var = new j51(42);
                j51Var.d = -2;
                j51Var.o = string;
                arrayList.add(j51Var);
                HorizontalScrollView horizontalScrollView = g4Var.Z;
                if (horizontalScrollView != null) {
                    arrayList.add(j51.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = u3Var.d;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    arrayList.add(h1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (u3Var.t || !u3Var.u) {
                    j51 o10 = j51.o(10, 35);
                    o10.u = 1;
                    arrayList.add(o10);
                    j51 o11 = j51.o(11, 35);
                    o11.u = 1;
                    arrayList.add(o11);
                    j51 o12 = j51.o(12, 35);
                    o12.u = 1;
                    arrayList.add(o12);
                    j51 o13 = j51.o(13, 35);
                    o13.u = 1;
                    arrayList.add(o13);
                    j51 o14 = j51.o(14, 35);
                    o14.u = 1;
                    arrayList.add(o14);
                    j51 o15 = j51.o(15, 35);
                    o15.u = 1;
                    arrayList.add(o15);
                }
            }
        }
    }

    public static /* synthetic */ void U(g4 g4Var, org.telegram.ui.ActionBar.c2 c2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        c2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.d3 d3Var = new yh.d3(bVar, tL_payments_paymentFormStarGift);
        Context context = g4Var.getContext();
        f6 f6Var = g4Var.resourcesProvider;
        int i10 = g4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.f3(context, f6Var, tL_starGiftUnique, d3Var, i10, j3, hg.k0.k(tL_starGiftUnique.num, ',', sb2), true, new d80(g4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.d3 d3Var, nf.e eVar) {
        eVar.d();
        v5.x(g4Var.currentAccount, d3Var.a).h(d3Var.b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(g4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.c;
        if (u3Var.g.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var.container, g4Var.resourcesProvider, g4Var.c0, false, true, false);
        n70Var.t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.p = new ii.h(n70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.g);
        Collections.sort(arrayList, new z3(f4Var, 0));
        int i10 = 1;
        c4 c4Var = new c4(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, i10), new w3(f4Var, n70Var, i10), null, g4Var.resourcesProvider);
        c4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, g4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, c4Var, false, 12));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.k.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 1), false);
        }
        n70Var.q(c4Var);
        n70Var.Z();
    }

    @Override // org.telegram.ui.Components.za
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.l2 l2Var = this.e0;
        float measuredHeight = y3 - l2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / l2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        l2Var.setScaleX(clamp01);
        l2Var.setScaleY(clamp01);
        l2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        l2Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int S;
        j51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ml0 ml0Var = this.d;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if ((childAt instanceof t00) && (S = RecyclerView.S(childAt) - 1) >= 0 && (G = this.i0.G(S)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        f4 f4Var = this.Y;
        if (z10) {
            f4Var.b.a();
        }
        if (z11) {
            f4Var.c.g(false);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        e4 e4Var = new e4(this, ml0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.i0 = e4Var;
        return e4Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        String str = this.X;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
