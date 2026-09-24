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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ny0;
import org.telegram.ui.to0;
import w7.y5;
import yh.k5;
import yh.t5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class h4 extends bb {
    public static final /* synthetic */ int k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 a0;
    public final m3 b0;
    public final m3 c0;
    public final m3 d0;
    public final yh.i2 e0;
    public yh.w0 f0;
    public final HashSet g0;
    public boolean h0;
    public f4 i0;
    public boolean j0;

    public h4(final Context context, String str, final g4 g4Var) {
        super(2, context, (d6) null, false);
        this.g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = g4Var;
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
        m3 m3Var = new m3(context, this.resourcesProvider);
        this.a0 = m3Var;
        m3Var.setSorting(g4Var.c.p);
        linearLayout.addView(m3Var, y5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new ny0(26, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, y5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i10 = 0;
        m3Var2.setOnClickListener(new View.OnClickListener(this) { // from class: xh.b4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        h4.R(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.W(this.b, g4Var, context);
                        break;
                    default:
                        h4.S(this.b, g4Var, context);
                        break;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, y5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i11 = 1;
        m3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: xh.b4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h4.R(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.W(this.b, g4Var, context);
                        break;
                    default:
                        h4.S(this.b, g4Var, context);
                        break;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, y5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i12 = 2;
        m3Var4.setOnClickListener(new View.OnClickListener(this) { // from class: xh.b4
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h4.R(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.W(this.b, g4Var, context);
                        break;
                    default:
                        h4.S(this.b, g4Var, context);
                        break;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new s5.e(15, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new ug0(this, 16));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new u2.o1(17));
        yh.i2 i2Var = new yh.i2(context);
        this.e0 = i2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        i2Var.h = dp;
        i2Var.n = dp2;
        i2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        i2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(i2Var, 26), 12.0f, 12, null, new ArrayList());
        i2Var.setPivotY(0.0f);
        this.container.addView(i2Var, y5.e(-1, -2, 55));
        this.i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void P(h4 h4Var, g4 g4Var) {
        y70 F = y70.F(h4Var.container, h4Var.resourcesProvider, h4Var.a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new y3(g4Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        v51 G = h4Var.i0.G(i10 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z10 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && h4Var.h0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h4Var.getContext(), 0, h4Var.resourcesProvider);
                String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(h4Var.getContext(), 3, null);
                a2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                zf.b bVar = tL_starGiftUnique.resale_ton_only ? zf.b.b : zf.b.a;
                t5.x(h4Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new to0(h4Var, a2Var2, bVar, tL_starGiftUnique, clientUserId));
                return;
            }
            if (!z10) {
                ArrayList arrayList = g4Var.b.l;
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
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h4Var.getContext());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.a;
                    a2Var3.R = string2;
                    a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            h4Var.f0.run(starGift);
            h4Var.dismiss();
        }
    }

    public static void R(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.f.isEmpty()) {
            return;
        }
        y70 y70Var = new y70(h4Var.container, h4Var.resourcesProvider, h4Var.b0, false, true, false);
        y70Var.t = false;
        y70Var.Y = true;
        y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        y70Var.R = true;
        y70Var.p = new ii.h(y70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        int i10 = 0;
        c4 c4Var = new c4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, y70Var, i10), null, h4Var.resourcesProvider);
        c4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, c4Var, false, 11));
        if (arrayList.size() > 8) {
            y70Var.r(frameLayout, y5.n(-1, 44));
            y70Var.k();
        }
        if (!v3Var.j.isEmpty()) {
            y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        y70Var.q(c4Var);
        y70Var.Z();
    }

    public static void S(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        y70 y70Var = new y70(h4Var.container, h4Var.resourcesProvider, h4Var.d0, false, true, false);
        y70Var.t = false;
        y70Var.Y = true;
        y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        y70Var.R = true;
        y70Var.p = new ii.h(y70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        int i10 = 2;
        e4 e4Var = new e4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, y70Var, i10), null, h4Var.resourcesProvider);
        e4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, e4Var, false, 13));
        if (arrayList.size() > 8) {
            y70Var.r(frameLayout, y5.n(-1, 44));
            y70Var.k();
        }
        if (!v3Var.l.isEmpty()) {
            y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        y70Var.q(e4Var);
        y70Var.Z();
    }

    public static void T(h4 h4Var, ArrayList arrayList) {
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            k5 k5Var = g4Var.b;
            v3 v3Var = g4Var.c;
            if (k5Var == null || v3Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
            arrayList.add(v51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = k5Var.l;
            int size = arrayList2.size();
            int i10 = 0;
            boolean z10 = true;
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!h4Var.g0.contains(Long.valueOf(savedStarGift.gift.id))) {
                    boolean z11 = savedStarGift.can_craft_at <= currentTime;
                    v51 a2 = i1.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i11++;
                    z10 = false;
                }
            }
            if (k5Var.i || !k5Var.j) {
                int i13 = i11 % 3;
                int i14 = 6 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    v51 o9 = v51.o((i15 - i13) + 1, 35);
                    o9.u = 1;
                    arrayList.add(o9);
                }
            } else if (z10) {
                arrayList.add(v51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (v3Var.e > 0 || h4Var.j0) {
                h4Var.j0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                v51 v51Var = new v51(42);
                v51Var.d = -2;
                v51Var.o = string;
                arrayList.add(v51Var);
                HorizontalScrollView horizontalScrollView = h4Var.Z;
                if (horizontalScrollView != null) {
                    arrayList.add(v51.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = v3Var.d;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    arrayList.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (v3Var.t || !v3Var.u) {
                    v51 o10 = v51.o(10, 35);
                    o10.u = 1;
                    arrayList.add(o10);
                    v51 o11 = v51.o(11, 35);
                    o11.u = 1;
                    arrayList.add(o11);
                    v51 o12 = v51.o(12, 35);
                    o12.u = 1;
                    arrayList.add(o12);
                    v51 o13 = v51.o(13, 35);
                    o13.u = 1;
                    arrayList.add(o13);
                    v51 o14 = v51.o(14, 35);
                    o14.u = 1;
                    arrayList.add(o14);
                    v51 o15 = v51.o(15, 35);
                    o15.u = 1;
                    arrayList.add(o15);
                }
            }
        }
    }

    public static /* synthetic */ void U(h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        a2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.a3 a3Var = new yh.a3(bVar, tL_payments_paymentFormStarGift);
        Context context = h4Var.getContext();
        d6 d6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.c3(context, d6Var, tL_starGiftUnique, a3Var, i10, j3, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), true, new o80(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.a3 a3Var, nf.e eVar) {
        eVar.d();
        t5.x(h4Var.currentAccount, a3Var.a).h(a3Var.b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.g.isEmpty()) {
            return;
        }
        y70 y70Var = new y70(h4Var.container, h4Var.resourcesProvider, h4Var.c0, false, true, false);
        y70Var.t = false;
        y70Var.Y = true;
        y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        y70Var.R = true;
        y70Var.p = new ii.h(y70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        int i10 = 1;
        d4 d4Var = new d4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, y70Var, i10), null, h4Var.resourcesProvider);
        d4Var.Y2.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, d4Var, false, 12));
        if (arrayList.size() > 8) {
            y70Var.r(frameLayout, y5.n(-1, 44));
            y70Var.k();
        }
        if (!v3Var.k.isEmpty()) {
            y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        y70Var.q(d4Var);
        y70Var.Z();
    }

    @Override // org.telegram.ui.Components.bb
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.i2 i2Var = this.e0;
        float measuredHeight = y3 - i2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / i2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        i2Var.setScaleX(clamp01);
        i2Var.setScaleY(clamp01);
        i2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        i2Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int R;
        v51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            wl0 wl0Var = this.d;
            if (i10 >= wl0Var.getChildCount()) {
                break;
            }
            View childAt = wl0Var.getChildAt(i10);
            if ((childAt instanceof u00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.i0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        g4 g4Var = this.Y;
        if (z10) {
            g4Var.b.a();
        }
        if (z11) {
            g4Var.c.g(false);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        f4 f4Var = new f4(this, wl0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.i0 = f4Var;
        return f4Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        String str = this.X;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
