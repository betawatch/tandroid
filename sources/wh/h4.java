package wh;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b91;
import org.telegram.ui.w71;
import org.telegram.ui.w8;
import w7.a6;
import w7.c6;
import xh.n7;
import xh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class h4 extends org.telegram.ui.ActionBar.p2 implements le.d {
    public LinearLayout E;
    public k3 F;
    public k3 G;
    public k3 H;
    public k3 I;
    public y00 J;
    public boolean K;
    public eh.c L;
    public zg.a M;
    public final le.b a;
    public final long b;
    public final String c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.i2 f;
    public View h;
    public c3 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public l3 w;
    public boolean x;
    public HorizontalScrollView y;

    public h4(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.a = new le.b(0, this, wr.h, 380L, false);
        this.K = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = f6Var;
        u3 u3Var = new u3(j10, this.currentAccount, new org.telegram.ui.web.y1(this, 14));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                wc a02 = wc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                pc O = a02.O(document, string, LocaleController.formatString(i10, hc.b.l(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                pc O2 = wc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            h4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        b3 b3Var = new b3(bundle, tL_starGiftUnique, j3);
        f5 f5Var = h4Var.parentLayout;
        if (f5Var == null || !((ActionBarLayout) f5Var).b) {
            h4Var.presentFragment(b3Var, true, z10);
        } else {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.h3) && z10) {
                ((org.telegram.ui.ActionBar.h3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(b3Var, false, z10);
            }
        }
        Utilities.Callback callback = h4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.h.isEmpty()) {
            w70 w70Var = new w70(h4Var, h4Var.I, false, false);
            w70Var.t = false;
            w70Var.Y = true;
            w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            w70Var.R = true;
            w70Var.p = new hi.i(w70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.h);
            Collections.sort(arrayList, new s2(h4Var, 0));
            f3 f3Var = new f3(h4Var, new t2(h4Var, strArr, arrayList, 0), new u2(h4Var, w70Var, 0), null);
            f3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            fu fuVar = new fu(context, h4Var.resourceProvider);
            fuVar.setTextSize(1, 16.0f);
            fuVar.setInputType(573441);
            fuVar.setRawInputType(573441);
            fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
            fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
            fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            fuVar.setCursorWidth(1.5f);
            fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
            fuVar.setBackground(null);
            frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            fuVar.addTextChangedListener(new og.x(strArr, f3Var, false, 8));
            if (arrayList.size() > 8) {
                w70Var.r(frameLayout, a6.n(-1, 44));
                w70Var.k();
            }
            if (!u3Var.l.isEmpty()) {
                w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 0), false);
            }
            w70Var.q(f3Var);
            w70Var.Z();
        }
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.f.isEmpty()) {
            w70 w70Var = new w70(h4Var, h4Var.G, false, false);
            w70Var.t = false;
            w70Var.Y = true;
            w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            w70Var.R = true;
            w70Var.p = new hi.i(w70Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.f);
            Collections.sort(arrayList, new s2(h4Var, 2));
            d3 d3Var = new d3(h4Var, new t2(h4Var, strArr, arrayList, 2), new u2(h4Var, w70Var, 2), null);
            d3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            fu fuVar = new fu(context, h4Var.resourceProvider);
            fuVar.setTextSize(1, 16.0f);
            fuVar.setInputType(573441);
            fuVar.setRawInputType(573441);
            fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
            fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
            fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            fuVar.setCursorWidth(1.5f);
            fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
            fuVar.setBackground(null);
            frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            fuVar.addTextChangedListener(new og.x(strArr, d3Var, false, 9));
            if (arrayList.size() > 8) {
                w70Var.r(frameLayout, a6.n(-1, 44));
                w70Var.k();
            }
            if (!u3Var.j.isEmpty()) {
                w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 2), false);
            }
            w70Var.q(d3Var);
            w70Var.Z();
        }
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.g.isEmpty()) {
            w70 w70Var = new w70(h4Var, h4Var.H, false, false);
            w70Var.t = false;
            w70Var.Y = true;
            w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            w70Var.R = true;
            w70Var.p = new hi.i(w70Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.g);
            Collections.sort(arrayList, new s2(h4Var, 1));
            e3 e3Var = new e3(h4Var, new t2(h4Var, strArr, arrayList, 1), new u2(h4Var, w70Var, 1), null);
            e3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            fu fuVar = new fu(context, h4Var.resourceProvider);
            fuVar.setTextSize(1, 16.0f);
            fuVar.setInputType(573441);
            fuVar.setRawInputType(573441);
            fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
            fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
            fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            fuVar.setCursorWidth(1.5f);
            fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
            fuVar.setBackground(null);
            frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            fuVar.addTextChangedListener(new og.x(strArr, e3Var, false, 10));
            if (arrayList.size() > 8) {
                w70Var.r(frameLayout, a6.n(-1, 44));
                w70Var.k();
            }
            if (!u3Var.k.isEmpty()) {
                w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 1), false);
            }
            w70Var.q(e3Var);
            w70Var.Z();
        }
    }

    public static void Y(h4 h4Var, v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            xh.x3 x3Var = new xh.x3(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.b, h4Var.resourceProvider, null);
            x3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            x3Var.O0 = new x2(h4Var);
            h4Var.showDialog(x3Var);
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            h20.d(this.r, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(final Context context) {
        eh.c cVar = new eh.c();
        this.L = cVar;
        int i10 = j6.d6;
        cVar.a(getThemedColor(i10));
        this.M = new zg.a(this.L);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f = i2Var;
        lVar.setBackButtonDrawable(i2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 11));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = j6.G6;
        lVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(j6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(j6.z6));
        w8 w8Var = new w8(this, context, 9);
        int v = j6.v(j6.v0(i10, this.resourceProvider), j6.l1(0.04f, j6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        n7 n7Var = new n7(context, this.currentAccount, this.resourceProvider);
        n7Var.d = true;
        c6.a(n7Var);
        n7Var.setOnClickListener(new w71(21, this, n7Var));
        this.actionBar.addView(n7Var, a6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        c3 c3Var = new c3(this, new gi.a(this, 18), new x2(this), new x2(this));
        this.n = c3Var;
        c3Var.Y2.r = false;
        c3Var.setSpanCount(3);
        this.n.j(new al0(this, 13));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        w8Var.addView(this.n, a6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: wh.y2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        u3 u3Var = this.b.d;
                        u3Var.k.clear();
                        u3Var.j.clear();
                        u3Var.l.clear();
                        u3Var.h();
                        break;
                    default:
                        u3 u3Var2 = this.b.d;
                        u3Var2.k.clear();
                        u3Var2.j.clear();
                        u3Var2.l.clear();
                        u3Var2.h();
                        break;
                }
            }
        };
        f6 f6Var = this.resourceProvider;
        l3 l3Var = new l3(context);
        LinearLayout f7 = em.f(context, 1);
        l3Var.addView(f7, a6.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(w9Var, a6.q(130, 130, 17));
        TextView textView = new TextView(context);
        em.n(j6.G6, f6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, a6.t(-2, -2, 17, 32, 12, 32, 9));
        m90 m90Var = new m90(context, null);
        m90Var.setTextColor(j6.v0(j6.A6, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(17);
        m90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        m90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(m90Var, a6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = j6.Oh;
        textView2.setTextColor(j6.v0(i13, f6Var));
        textView2.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i13, f6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(r6.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        c6.a(textView2);
        f7.addView(textView2, a6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = l3Var;
        this.x = false;
        l3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        w8Var.addView(this.w, a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        w8Var.addView(this.y, a6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, a6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final tp tpVar = new tp(context, 24, this.resourceProvider);
        tpVar.b(j6.h7, j6.j7, j6.k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(false, false);
        tpVar.setDrawBackgroundAsArc(10);
        tpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        tpVar.setScaleX(0.8f);
        tpVar.setScaleY(0.8f);
        linearLayout2.addView(tpVar, a6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        em.n(j6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, a6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = j6.Oh;
        int v9 = j6.v(themedColor, j6.l1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(j6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        bh.d c10 = this.M.c(view2, null, false);
        c10.n(dh.c.l(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(18.0f));
        view2.setBackground(c10);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: wh.z2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        u3 u3Var = this.b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.r;
                            u3Var.r = z10;
                            tpVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            w70 H = w70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new v2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final tp tpVar2 = tpVar;
                            H.i(new Runnable() { // from class: wh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: wh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.r);
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
        this.s.addView(linearLayout2, a6.c(-1.0f, -2));
        c6.b(this.s, 0.04f, 1.5f);
        w8Var.addView(this.s, a6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        v5 y3 = v5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        bh.d c11 = this.M.c(view3, null, false);
        c11.n(dh.c.l(this.resourceProvider));
        c11.o(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        w8Var.addView(this.r, a6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new uq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = j6.v(getThemedColor(i10), j6.l1(0.1f, getThemedColor(i14)));
        textView4.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: wh.y2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        u3 u3Var = this.b.d;
                        u3Var.k.clear();
                        u3Var.j.clear();
                        u3Var.l.clear();
                        u3Var.h();
                        break;
                    default:
                        u3 u3Var2 = this.b.d;
                        u3Var2.k.clear();
                        u3Var2.j.clear();
                        u3Var2.l.clear();
                        u3Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.v, a6.c(-1.0f, -2));
        this.r.setVisibility(8);
        c6.b(this.r, 0.05f, 1.5f);
        k3 k3Var = new k3(context, this.resourceProvider);
        this.F = k3Var;
        k3Var.setSorting(this.d.p);
        this.E.addView(this.F, a6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: wh.z2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i17) {
                    case 0:
                        u3 u3Var = this.b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.r;
                            u3Var.r = z10;
                            tpVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            w70 H = w70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new v2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final tp tpVar2 = tpVar;
                            H.i(new Runnable() { // from class: wh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: wh.w2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.r);
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
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: wh.r2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        h4.W(this.b, context);
                        break;
                    case 1:
                        h4.X(this.b, context);
                        break;
                    default:
                        h4.V(this.b, context);
                        break;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourceProvider);
        this.H = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, a6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: wh.r2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        h4.W(this.b, context);
                        break;
                    case 1:
                        h4.X(this.b, context);
                        break;
                    default:
                        h4.V(this.b, context);
                        break;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourceProvider);
        this.I = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, a6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: wh.r2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        h4.W(this.b, context);
                        break;
                    case 1:
                        h4.X(this.b, context);
                        break;
                    default:
                        h4.V(this.b, context);
                        break;
                }
            }
        });
        y00 y00Var = new y00(getParentActivity());
        this.J = y00Var;
        w8Var.addView(y00Var, a6.c(-1.0f, -1));
        d0(false, false);
        return w8Var;
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
        wr wrVar = wr.h;
        alpha.setInterpolator(wrVar).setDuration(420L).setListener(new a3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(wrVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(wrVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        j61 j61Var;
        u3 u3Var = this.d;
        int i10 = u3Var.e;
        HashSet hashSet = u3Var.l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.k;
        ArrayList arrayList2 = u3Var.g;
        HashSet hashSet3 = u3Var.j;
        ArrayList arrayList3 = u3Var.f;
        if (i10 > 12) {
            d0(true, true);
        }
        c3 c3Var = this.n;
        boolean z11 = false;
        if (c3Var != null && (j61Var = c3Var.Y2) != null) {
            j61Var.N(true);
            if (z10) {
                this.n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = u3Var.e;
            lVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        k3 k3Var = this.F;
        if (k3Var != null) {
            k3Var.setSorting(u3Var.p);
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
            if (this.n.getChildAt(i12) instanceof a10) {
                u3Var.g(false);
                break;
            }
            i12++;
        }
        if ((u3Var.t || u3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
