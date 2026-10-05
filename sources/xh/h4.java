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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.py0;
import org.telegram.ui.uo0;
import w7.z5;
import yh.l5;
import yh.u5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class h4 extends cb {
    public static final /* synthetic */ int k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 a0;
    public final m3 b0;
    public final m3 c0;
    public final m3 d0;
    public final yh.j2 e0;
    public yh.x0 f0;
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
        linearLayout.addView(m3Var, z5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new py0(26, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, z5.t(-2, -2, 16, 0, 0, 6, 0));
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
                        h4.P(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.U(this.b, g4Var, context);
                        break;
                    default:
                        h4.Q(this.b, g4Var, context);
                        break;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, z5.t(-2, -2, 16, 0, 0, 6, 0));
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
                        h4.P(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.U(this.b, g4Var, context);
                        break;
                    default:
                        h4.Q(this.b, g4Var, context);
                        break;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, z5.t(-2, -2, 16, 0, 0, 0, 0));
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
                        h4.P(this.b, g4Var, context);
                        break;
                    case 1:
                        h4.U(this.b, g4Var, context);
                        break;
                    default:
                        h4.Q(this.b, g4Var, context);
                        break;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new rg.x(16, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new xb0(this, 18));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new u2.l0(19));
        yh.j2 j2Var = new yh.j2(context);
        this.e0 = j2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        j2Var.h = dp;
        j2Var.n = dp2;
        j2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        j2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(j2Var, 26), 12.0f, 12, null, new ArrayList());
        j2Var.setPivotY(0.0f);
        this.container.addView(j2Var, z5.e(-1, -2, 55));
        this.i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void N(h4 h4Var, g4 g4Var) {
        b80 F = b80.F(h4Var.container, h4Var.resourcesProvider, h4Var.a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new y3(g4Var, 5), false);
        F.t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void O(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        h61 G = h4Var.i0.G(i10 - 1);
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
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(h4Var.getContext(), 3, null);
                b2Var2.q(400L);
                long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                zf.b bVar = tL_starGiftUnique.resale_ton_only ? zf.b.b : zf.b.a;
                u5.x(h4Var.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new uo0(h4Var, b2Var2, bVar, tL_starGiftUnique, clientUserId));
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
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                    b2Var3.R = string2;
                    b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                    org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder2, null);
                    return;
                }
            }
            h4Var.f0.run(starGift);
            h4Var.dismiss();
        }
    }

    public static void P(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.f.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.b0, false, true, false);
        b80Var.t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.p = new ii.h(b80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        int i10 = 0;
        c4 c4Var = new c4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, b80Var, i10), null, h4Var.resourcesProvider);
        c4Var.f3.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, c4Var, false, 11));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.j.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        b80Var.q(c4Var);
        b80Var.Z();
    }

    public static void Q(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.d0, false, true, false);
        b80Var.t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.p = new ii.h(b80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        int i10 = 2;
        e4 e4Var = new e4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, b80Var, i10), null, h4Var.resourcesProvider);
        e4Var.f3.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, e4Var, false, 13));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.l.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        b80Var.q(e4Var);
        b80Var.Z();
    }

    public static void R(h4 h4Var, ArrayList arrayList) {
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            l5 l5Var = g4Var.b;
            v3 v3Var = g4Var.c;
            if (l5Var == null || v3Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
            arrayList.add(h61.t(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = l5Var.l;
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
                    h61 a2 = h1.a(0, savedStarGift.gift, false, true, false, false, true);
                    a2.g = z11;
                    arrayList.add(a2);
                    i11++;
                    z10 = false;
                }
            }
            if (l5Var.i || !l5Var.j) {
                int i13 = i11 % 3;
                int i14 = 6 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    h61 q6 = h61.q((i15 - i13) + 1, 35);
                    q6.u = 1;
                    arrayList.add(q6);
                }
            } else if (z10) {
                arrayList.add(h61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (v3Var.e > 0 || h4Var.j0) {
                h4Var.j0 = true;
                String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                h61 h61Var = new h61(42);
                h61Var.d = -2;
                h61Var.o = string;
                arrayList.add(h61Var);
                HorizontalScrollView horizontalScrollView = h4Var.Z;
                if (horizontalScrollView != null) {
                    arrayList.add(h61.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = v3Var.d;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    arrayList.add(h1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (v3Var.t || !v3Var.u) {
                    h61 q10 = h61.q(10, 35);
                    q10.u = 1;
                    arrayList.add(q10);
                    h61 q11 = h61.q(11, 35);
                    q11.u = 1;
                    arrayList.add(q11);
                    h61 q12 = h61.q(12, 35);
                    q12.u = 1;
                    arrayList.add(q12);
                    h61 q13 = h61.q(13, 35);
                    q13.u = 1;
                    arrayList.add(q13);
                    h61 q14 = h61.q(14, 35);
                    q14.u = 1;
                    arrayList.add(q14);
                    h61 q15 = h61.q(15, 35);
                    q15.u = 1;
                    arrayList.add(q15);
                }
            }
        }
    }

    public static /* synthetic */ void S(h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        Context context = h4Var.getContext();
        d6 d6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.d3(context, d6Var, tL_starGiftUnique, b3Var, i10, j3, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), true, new r80(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void T(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.b3 b3Var, nf.e eVar) {
        eVar.d();
        u5.x(h4Var.currentAccount, b3Var.a).h(b3Var.b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void U(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.c;
        if (v3Var.g.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.c0, false, true, false);
        b80Var.t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.p = new ii.h(b80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        int i10 = 1;
        d4 d4Var = new d4(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, i10), new x3(g4Var, b80Var, i10), null, h4Var.resourcesProvider);
        d4Var.f3.r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, d4Var, false, 12));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.k.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        b80Var.q(d4Var);
        b80Var.Z();
    }

    @Override // org.telegram.ui.Components.cb
    public final void D(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.j2 j2Var = this.e0;
        float measuredHeight = y3 - j2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / j2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        j2Var.setScaleX(clamp01);
        j2Var.setScaleY(clamp01);
        j2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        j2Var.setTranslationY(measuredHeight);
    }

    public final void Y() {
        int R;
        h61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof w00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.i0.G(R)) != null) {
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

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        f4 f4Var = new f4(this, zl0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.i0 = f4Var;
        return f4Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        String str = this.X;
        return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
