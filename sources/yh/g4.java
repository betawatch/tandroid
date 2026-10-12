package yh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w41;
import org.telegram.ui.z8;
import w7.a6;
import zh.d7;
import zh.n5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public class g4 extends org.telegram.ui.ActionBar.m2 implements ne.d {
    public LinearLayout E;
    public k3 F;
    public k3 G;
    public k3 H;
    public k3 I;
    public d10 J;
    public boolean K;
    public gh.c L;
    public bh.b M;
    public final ne.b a;
    public final long b;
    public final String c;
    public final t3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.f2 f;
    public View h;
    public c3 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public l3 w;
    public boolean x;
    public HorizontalScrollView y;

    public g4(long j10, String str, long j11, c6 c6Var) {
        super(null);
        this.a = new ne.b(0, this, es.h, 380L, false);
        this.K = true;
        this.b = j10;
        this.c = str;
        this.resourceProvider = c6Var;
        t3 t3Var = new t3(j11, this.currentAccount, new ji.p1(this, 21));
        this.d = t3Var;
        t3Var.g(false);
    }

    public static void U(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(g4Var.currentAccount).getClientUserId()) {
            g4Var.d.d.remove(tL_starGiftUnique);
            g4Var.e0(false);
            if (j10 == UserConfig.getInstance(g4Var.currentAccount).getClientUserId()) {
                zc a02 = zc.a0(g4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                sc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.q.i(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                sc O2 = zc.a0(g4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(g4Var.currentAccount, j10)));
                O2.r = false;
                O2.j();
            }
            g4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        b3 b3Var = new b3(bundle, tL_starGiftUnique, j10);
        b5 b5Var = g4Var.parentLayout;
        if (b5Var == null || !((ActionBarLayout) b5Var).b) {
            g4Var.presentFragment(b3Var, true, z10);
        } else {
            Dialog dialog = g4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.e3) && z10) {
                ((org.telegram.ui.ActionBar.e3) dialog).skipDismissAnimation();
            }
            g4Var.finishFragment();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(b3Var, false, z10);
            }
        }
        Utilities.Callback callback = g4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (g4Var.K && !t3Var.h.isEmpty()) {
            m80 m80Var = new m80(g4Var, g4Var.I, false, false);
            m80Var.t = false;
            m80Var.Y = true;
            m80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            m80Var.R = true;
            m80Var.p = new ji.h(m80Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(t3Var.h);
            Collections.sort(arrayList, new s2(g4Var, 0));
            f3 f3Var = new f3(g4Var, new t2(g4Var, strArr, arrayList, 0), new u2(g4Var, m80Var, 0), null);
            f3Var.W2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
            nu nuVar = new nu(context, g4Var.resourceProvider);
            nuVar.setTextSize(1, 16.0f);
            nuVar.setInputType(573441);
            nuVar.setRawInputType(573441);
            nuVar.setHintTextColor(g6.w0(g6.A6, g4Var.resourceProvider));
            nuVar.setCursorColor(g6.w0(g6.G6, g4Var.resourceProvider));
            nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            nuVar.setCursorWidth(1.5f);
            nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            nuVar.setTextColor(g6.w0(g6.E8, g4Var.resourceProvider));
            nuVar.setBackground(null);
            frameLayout.addView(nuVar, a6.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
            nuVar.addTextChangedListener(new eo(strArr, f3Var, false, 8));
            if (arrayList.size() > 8) {
                m80Var.r(frameLayout, a6.n(-1, 44));
                m80Var.k();
            }
            if (!t3Var.l.isEmpty()) {
                m80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 0), false);
            }
            m80Var.q(f3Var);
            m80Var.Z();
        }
    }

    public static void W(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (g4Var.K && !t3Var.f.isEmpty()) {
            m80 m80Var = new m80(g4Var, g4Var.G, false, false);
            m80Var.t = false;
            m80Var.Y = true;
            m80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            m80Var.R = true;
            m80Var.p = new ji.h(m80Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(t3Var.f);
            Collections.sort(arrayList, new s2(g4Var, 2));
            d3 d3Var = new d3(g4Var, new t2(g4Var, strArr, arrayList, 2), new u2(g4Var, m80Var, 2), null);
            d3Var.W2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
            nu nuVar = new nu(context, g4Var.resourceProvider);
            nuVar.setTextSize(1, 16.0f);
            nuVar.setInputType(573441);
            nuVar.setRawInputType(573441);
            nuVar.setHintTextColor(g6.w0(g6.A6, g4Var.resourceProvider));
            nuVar.setCursorColor(g6.w0(g6.G6, g4Var.resourceProvider));
            nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            nuVar.setCursorWidth(1.5f);
            nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            nuVar.setTextColor(g6.w0(g6.E8, g4Var.resourceProvider));
            nuVar.setBackground(null);
            frameLayout.addView(nuVar, a6.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
            nuVar.addTextChangedListener(new eo(strArr, d3Var, false, 9));
            if (arrayList.size() > 8) {
                m80Var.r(frameLayout, a6.n(-1, 44));
                m80Var.k();
            }
            if (!t3Var.j.isEmpty()) {
                m80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 2), false);
            }
            m80Var.q(d3Var);
            m80Var.Z();
        }
    }

    public static void X(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (g4Var.K && !t3Var.g.isEmpty()) {
            m80 m80Var = new m80(g4Var, g4Var.H, false, false);
            m80Var.t = false;
            m80Var.Y = true;
            m80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            m80Var.R = true;
            m80Var.p = new ji.h(m80Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(t3Var.g);
            Collections.sort(arrayList, new s2(g4Var, 1));
            e3 e3Var = new e3(g4Var, new t2(g4Var, strArr, arrayList, 1), new u2(g4Var, m80Var, 1), null);
            e3Var.W2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
            nu nuVar = new nu(context, g4Var.resourceProvider);
            nuVar.setTextSize(1, 16.0f);
            nuVar.setInputType(573441);
            nuVar.setRawInputType(573441);
            nuVar.setHintTextColor(g6.w0(g6.A6, g4Var.resourceProvider));
            nuVar.setCursorColor(g6.w0(g6.G6, g4Var.resourceProvider));
            nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            nuVar.setCursorWidth(1.5f);
            nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            nuVar.setTextColor(g6.w0(g6.E8, g4Var.resourceProvider));
            nuVar.setBackground(null);
            frameLayout.addView(nuVar, a6.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
            nuVar.addTextChangedListener(new eo(strArr, e3Var, false, 10));
            if (arrayList.size() > 8) {
                m80Var.r(frameLayout, a6.n(-1, 44));
                m80Var.k();
            }
            if (!t3Var.k.isEmpty()) {
                m80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 1), false);
            }
            m80Var.q(e3Var);
            m80Var.Z();
        }
    }

    public static void Y(g4 g4Var, l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            zh.r3 r3Var = new zh.r3(g4Var.getParentActivity(), g4Var.currentAccount, g4Var.b, g4Var.resourceProvider, null);
            r3Var.j2(tL_starGiftUnique.slug, tL_starGiftUnique, g4Var.d);
            r3Var.P0 = new x2(g4Var);
            g4Var.showDialog(r3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(final Context context) {
        gh.c cVar = new gh.c();
        this.L = cVar;
        int i10 = g6.d6;
        cVar.a(getThemedColor(i10));
        this.M = new bh.b(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 14));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = g6.G6;
        kVar2.D(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(g6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(g6.z6));
        z8 z8Var = new z8(this, context, 9);
        int v = g6.v(g6.w0(i10, this.resourceProvider), g6.m1(0.04f, g6.w0(i11, this.resourceProvider)));
        z8Var.setBackgroundColor(v);
        this.fragmentView = z8Var;
        d7 d7Var = new d7(context, this.currentAccount, this.resourceProvider);
        d7Var.d = true;
        w7.c6.a(d7Var);
        d7Var.setOnClickListener(new a(1, this, d7Var));
        this.actionBar.addView(d7Var, a6.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 85));
        c3 c3Var = new c3(this, new ii.a(this, 18), new x2(this), new x2(this));
        this.n = c3Var;
        c3Var.W2.r = false;
        c3Var.setSpanCount(3);
        this.n.j(new kc0(this, 19));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        z8Var.addView(this.n, a6.a(-1.0f, 7.33f, 0.0f, 7.33f, -45.0f, -1, 119));
        z8Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: yh.y2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t3 t3Var = this.b.d;
                        t3Var.k.clear();
                        t3Var.j.clear();
                        t3Var.l.clear();
                        t3Var.h();
                        break;
                    default:
                        t3 t3Var2 = this.b.d;
                        t3Var2.k.clear();
                        t3Var2.j.clear();
                        t3Var2.l.clear();
                        t3Var2.h();
                        break;
                }
            }
        };
        c6 c6Var = this.resourceProvider;
        l3 l3Var = new l3(context);
        LinearLayout e = yh.e(context, 1);
        l3Var.addView(e, a6.e(-1, -2, 23));
        z9 z9Var = new z9(context);
        z9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        e.addView(z9Var, a6.q(130, 130, 17));
        TextView textView = new TextView(context);
        yh.n(g6.G6, c6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        e.addView(textView, a6.t(-2, -2, 17, 32, 12, 32, 9));
        da0 da0Var = new da0(context, null);
        da0Var.setTextColor(g6.w0(g6.A6, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(17);
        da0Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        da0Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        e.addView(da0Var, a6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = g6.Oh;
        textView2.setTextColor(g6.w0(i13, c6Var));
        textView2.setBackground(g6.Z(g6.m1(0.1f, g6.w0(i13, c6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.d0.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        w7.c6.a(textView2);
        e.addView(textView2, a6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = l3Var;
        this.x = false;
        l3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        z8Var.addView(this.w, a6.a(-1.0f, 0.0f, 0.0f, 0.0f, -45.0f, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.addView(this.E);
        this.y.setBackgroundColor(v);
        this.y.setClipChildren(false);
        z8Var.addView(this.y, a6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.d7));
        this.h.setAlpha(0.0f);
        z8Var.addView(this.h, a6.b(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final aq aqVar = new aq(context, 24, this.resourceProvider);
        aqVar.b(g6.h7, g6.j7, g6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        aqVar.setTranslationX(AndroidUtilities.dp(4.0f));
        aqVar.setScaleX(0.8f);
        aqVar.setScaleY(0.8f);
        linearLayout2.addView(aqVar, a6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        yh.n(g6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, a6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = g6.Oh;
        int v10 = g6.v(themedColor, g6.m1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(g6.j0(dp, dp, dp, dp, 0, v10, v10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        dh.d c10 = this.M.c(view2, null, false);
        c10.o(fh.b.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        view2.setBackground(c10);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: yh.z2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        t3 t3Var = this.b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.r;
                            t3Var.r = z10;
                            aqVar.a(z10, true);
                            t3Var.h();
                            break;
                        }
                        break;
                    default:
                        final g4 g4Var = this.b;
                        t3 t3Var2 = g4Var.d;
                        if (g4Var.K) {
                            m80 H = m80.H(g4Var, g4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.b.a), new v2(g4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.c.a), new v2(g4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.d.a), new v2(g4Var, 5), false);
                            H.k();
                            boolean z11 = !t3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final aq aqVar2 = aqVar;
                            H.i(new Runnable() { // from class: yh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.r) {
                                                t3Var3.r = false;
                                                aqVar2.a(false, true);
                                                t3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.r) {
                                                t3Var4.r = true;
                                                aqVar2.a(true, true);
                                                t3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: yh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.r) {
                                                t3Var3.r = false;
                                                aqVar2.a(false, true);
                                                t3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.r) {
                                                t3Var4.r = true;
                                                aqVar2.a(true, true);
                                                t3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(linearLayout2, a6.d(-1.0f, -2));
        w7.c6.b(this.s, 0.04f, 1.5f);
        z8Var.addView(this.s, a6.a(52.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        n5 y3 = n5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        dh.d c11 = this.M.c(view3, null, false);
        c11.o(fh.b.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        z8Var.addView(this.r, a6.a(60.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new br(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = g6.v(getThemedColor(i10), g6.m1(0.1f, getThemedColor(i14)));
        textView4.setBackground(g6.j0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: yh.y2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        t3 t3Var = this.b.d;
                        t3Var.k.clear();
                        t3Var.j.clear();
                        t3Var.l.clear();
                        t3Var.h();
                        break;
                    default:
                        t3 t3Var2 = this.b.d;
                        t3Var2.k.clear();
                        t3Var2.j.clear();
                        t3Var2.l.clear();
                        t3Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.v, a6.d(-1.0f, -2));
        this.r.setVisibility(8);
        w7.c6.b(this.r, 0.05f, 1.5f);
        k3 k3Var = new k3(context, this.resourceProvider);
        this.F = k3Var;
        k3Var.setSorting(this.d.p);
        this.E.addView(this.F, a6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: yh.z2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i17) {
                    case 0:
                        t3 t3Var = this.b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.r;
                            t3Var.r = z10;
                            aqVar.a(z10, true);
                            t3Var.h();
                            break;
                        }
                        break;
                    default:
                        final g4 g4Var = this.b;
                        t3 t3Var2 = g4Var.d;
                        if (g4Var.K) {
                            m80 H = m80.H(g4Var, g4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.b.a), new v2(g4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.c.a), new v2(g4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.d.a), new v2(g4Var, 5), false);
                            H.k();
                            boolean z11 = !t3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final aq aqVar2 = aqVar;
                            H.i(new Runnable() { // from class: yh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.r) {
                                                t3Var3.r = false;
                                                aqVar2.a(false, true);
                                                t3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.r) {
                                                t3Var4.r = true;
                                                aqVar2.a(true, true);
                                                t3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: yh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.r) {
                                                t3Var3.r = false;
                                                aqVar2.a(false, true);
                                                t3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.r) {
                                                t3Var4.r = true;
                                                aqVar2.a(true, true);
                                                t3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        k3 k3Var2 = new k3(context, this.resourceProvider);
        this.G = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, a6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: yh.r2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        g4.W(this.b, context);
                        break;
                    case 1:
                        g4.X(this.b, context);
                        break;
                    default:
                        g4.V(this.b, context);
                        break;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourceProvider);
        this.H = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, a6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: yh.r2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        g4.W(this.b, context);
                        break;
                    case 1:
                        g4.X(this.b, context);
                        break;
                    default:
                        g4.V(this.b, context);
                        break;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourceProvider);
        this.I = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, a6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: yh.r2
            public final /* synthetic */ g4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        g4.W(this.b, context);
                        break;
                    case 1:
                        g4.X(this.b, context);
                        break;
                    default:
                        g4.V(this.b, context);
                        break;
                }
            }
        });
        d10 d10Var = new d10(getParentActivity());
        this.J = d10Var;
        z8Var.addView(d10Var, a6.d(-1.0f, -1));
        d0(false, false);
        return z8Var;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.K == z10) {
            return;
        }
        this.K = z10;
        if (!z11) {
            this.y.setVisibility(z10 ? 0 : 8);
            this.y.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.y.setAlpha(z10 ? 1.0f : 0.0f);
            this.h.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.n.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f));
            return;
        }
        this.y.setVisibility(0);
        ViewPropertyAnimator alpha = this.y.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z10 ? 1.0f : 0.0f);
        es esVar = es.h;
        alpha.setInterpolator(esVar).setDuration(420L).setListener(new a3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(esVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(esVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        z61 z61Var;
        t3 t3Var = this.d;
        int i10 = t3Var.e;
        HashSet hashSet = t3Var.l;
        ArrayList arrayList = t3Var.h;
        HashSet hashSet2 = t3Var.k;
        ArrayList arrayList2 = t3Var.g;
        HashSet hashSet3 = t3Var.j;
        ArrayList arrayList3 = t3Var.f;
        if (i10 > 12) {
            d0(true, true);
        }
        c3 c3Var = this.n;
        boolean z11 = false;
        if (c3Var != null && (z61Var = c3Var.W2) != null) {
            z61Var.N(true);
            if (z10) {
                this.n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = t3Var.e;
            kVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        k3 k3Var = this.F;
        if (k3Var != null) {
            k3Var.setSorting(t3Var.p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.G.setValue((size <= 0 || size == arrayList3.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterModel) : LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size));
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterBackdrop) : LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2));
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterSymbol) : LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.n.getChildCount()) {
                break;
            }
            if (this.n.getChildAt(i12) instanceof f10) {
                t3Var.g(false);
                break;
            }
            i12++;
        }
        if ((t3Var.t || t3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = g6.x0(null, g6.d6, false);
            if (this.actionBar.t()) {
                x02 = g6.x0(null, g6.w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            l20.d(this.r, f7);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
