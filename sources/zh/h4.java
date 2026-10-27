package zh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.h7;
import bi.rc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a9;
import org.telegram.ui.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class h4 extends org.telegram.ui.ActionBar.r2 implements oe.d {
    public LinearLayout E;
    public l3 F;
    public l3 G;
    public l3 H;
    public l3 I;
    public z00 J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public hh.c O;
    public ch.b P;
    public final oe.b a;
    public final long b;
    public final String c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.j2 f;
    public View h;
    public d3 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public m3 w;
    public boolean x;
    public HorizontalScrollView y;

    public h4(long j10, String str, long j11, u6 u6Var) {
        super(null);
        this.a = new oe.b(0, this, ds.h, 380L, false);
        this.K = true;
        this.b = j10;
        this.c = str;
        this.resourceProvider = u6Var;
        u3 u3Var = new u3(j11, this.currentAccount, new l1(this, 1));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void V(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.f0(false);
            if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                wc b02 = wc.b0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = b02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2)));
                O.s = false;
                O.j();
            } else {
                qc O2 = wc.b0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j10)));
                O2.s = false;
                O2.j();
            }
            h4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        c3 c3Var = new c3(bundle, tL_starGiftUnique, j10);
        j5 j5Var = h4Var.parentLayout;
        if (j5Var == null || !((ActionBarLayout) j5Var).b) {
            h4Var.presentFragment(c3Var, true, z10);
        } else {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.k3) && z10) {
                ((org.telegram.ui.ActionBar.k3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(c3Var, false, z10);
            }
        }
        Utilities.Callback callback = h4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.h.isEmpty()) {
            l80 l80Var = new l80(h4Var, h4Var.I, false, false);
            l80Var.t = false;
            l80Var.Y = true;
            l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            l80Var.R = true;
            l80Var.p = new li.h(l80Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.h);
            Collections.sort(arrayList, new t2(h4Var, 0));
            g3 g3Var = new g3(h4Var, new u2(h4Var, strArr, arrayList, 0), new v2(h4Var, l80Var, 0), null);
            g3Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, kb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ju juVar = new ju(context, h4Var.resourceProvider);
            juVar.setTextSize(1, 16.0f);
            juVar.setInputType(573441);
            juVar.setRawInputType(573441);
            f7.E(juVar, y6.A6, h4Var.resourceProvider);
            f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
            juVar.setCursorSize(AndroidUtilities.dp(19.0f));
            juVar.setCursorWidth(1.5f);
            juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            f7.V(juVar, y6.E8, h4Var.resourceProvider);
            juVar.setBackground(null);
            frameLayout.addView(juVar, kb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            juVar.addTextChangedListener(new bo(strArr, g3Var, false, 8));
            if (arrayList.size() > 8) {
                l80Var.r(frameLayout, kb1.r(-1, 44));
                l80Var.k();
            }
            if (!u3Var.l.isEmpty()) {
                l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 0), false);
            }
            l80Var.q(g3Var);
            l80Var.Z();
        }
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.f.isEmpty()) {
            l80 l80Var = new l80(h4Var, h4Var.G, false, false);
            l80Var.t = false;
            l80Var.Y = true;
            l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            l80Var.R = true;
            l80Var.p = new li.h(l80Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.f);
            Collections.sort(arrayList, new t2(h4Var, 2));
            e3 e3Var = new e3(h4Var, new u2(h4Var, strArr, arrayList, 2), new v2(h4Var, l80Var, 2), null);
            e3Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, kb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ju juVar = new ju(context, h4Var.resourceProvider);
            juVar.setTextSize(1, 16.0f);
            juVar.setInputType(573441);
            juVar.setRawInputType(573441);
            f7.E(juVar, y6.A6, h4Var.resourceProvider);
            f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
            juVar.setCursorSize(AndroidUtilities.dp(19.0f));
            juVar.setCursorWidth(1.5f);
            juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            f7.V(juVar, y6.E8, h4Var.resourceProvider);
            juVar.setBackground(null);
            frameLayout.addView(juVar, kb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            juVar.addTextChangedListener(new bo(strArr, e3Var, false, 9));
            if (arrayList.size() > 8) {
                l80Var.r(frameLayout, kb1.r(-1, 44));
                l80Var.k();
            }
            if (!u3Var.j.isEmpty()) {
                l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 2), false);
            }
            l80Var.q(e3Var);
            l80Var.Z();
        }
    }

    public static void Y(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.g.isEmpty()) {
            l80 l80Var = new l80(h4Var, h4Var.H, false, false);
            l80Var.t = false;
            l80Var.Y = true;
            l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            l80Var.R = true;
            l80Var.p = new li.h(l80Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.g);
            Collections.sort(arrayList, new t2(h4Var, 1));
            f3 f3Var = new f3(h4Var, new u2(h4Var, strArr, arrayList, 1), new v2(h4Var, l80Var, 1), null);
            f3Var.g3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, kb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ju juVar = new ju(context, h4Var.resourceProvider);
            juVar.setTextSize(1, 16.0f);
            juVar.setInputType(573441);
            juVar.setRawInputType(573441);
            f7.E(juVar, y6.A6, h4Var.resourceProvider);
            f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
            juVar.setCursorSize(AndroidUtilities.dp(19.0f));
            juVar.setCursorWidth(1.5f);
            juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            f7.V(juVar, y6.E8, h4Var.resourceProvider);
            juVar.setBackground(null);
            frameLayout.addView(juVar, kb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            juVar.addTextChangedListener(new bo(strArr, f3Var, false, 10));
            if (arrayList.size() > 8) {
                l80Var.r(frameLayout, kb1.r(-1, 44));
                l80Var.k();
            }
            if (!u3Var.k.isEmpty()) {
                l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 1), false);
            }
            l80Var.q(f3Var);
            l80Var.Z();
        }
    }

    public static void Z(h4 h4Var, u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            h7 h7Var = new h7(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.b, h4Var.resourceProvider, null);
            h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            h7Var.R0 = new y2(h4Var);
            h4Var.showDialog(h7Var);
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            j20.d(this.r, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(final Context context) {
        hh.c cVar = new hh.c();
        this.O = cVar;
        int i10 = y6.d6;
        cVar.a(getThemedColor(i10));
        this.P = new ch.b(this.O);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.f = j2Var;
        kVar.setBackButtonDrawable(j2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 18));
        this.actionBar.setTitle(this.c);
        f7.i(i10, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = y6.G6;
        f7.m(kVar2, 1, i11, getResourceProvider());
        f7.b(this.actionBar, i11, getResourceProvider(), true);
        f7.m(this.actionBar, 3, y6.z8, getResourceProvider());
        f7.m(this.actionBar, 5, i11, getResourceProvider());
        f7.c(this.actionBar, y6.z6, getResourceProvider());
        a9 a9Var = new a9(this, context, 8);
        int v = y6.v(y6.w0(i10, this.resourceProvider), y6.o1(0.04f, y6.w0(i11, this.resourceProvider)));
        a9Var.setBackgroundColor(v);
        this.L = v;
        this.fragmentView = a9Var;
        rc rcVar = new rc(context, this.currentAccount, this.resourceProvider);
        rcVar.d = true;
        kb1.b(rcVar);
        rcVar.setOnClickListener(new org.telegram.ui.web.c(13, this, rcVar));
        this.actionBar.addView(rcVar, kb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        d3 d3Var = new d3(this, new q0(this, 2), new y2(this), new y2(this));
        this.n = d3Var;
        d3Var.g3.r = false;
        d3Var.setSpanCount(3);
        this.n.j(new ml(this, 28));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        a9Var.addView(this.n, kb1.h(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        a9Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: zh.z2
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
        u6 u6Var = this.resourceProvider;
        m3 m3Var = new m3(context);
        LinearLayout d = wh.d(context, 1);
        m3Var.addView(d, kb1.i(-1, -2, 23));
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        d.addView(y9Var, kb1.u(130, 130, 17));
        TextView textView = new TextView(context);
        f7.V(textView, y6.G6, u6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        d.addView(textView, kb1.x(-2, -2, 17, 32, 12, 32, 9));
        aa0 aa0Var = new aa0(context, null);
        f7.V(aa0Var, y6.A6, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setGravity(17);
        aa0Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        aa0Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        d.addView(aa0Var, kb1.x(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = y6.Oh;
        f7.V(textView2, i13, u6Var);
        org.telegram.ui.Cells.y Z = y6.Z(y6.o1(0.1f, y6.w0(i13, u6Var)), 6, 6);
        b7 L = f7.L(0.1f, i13);
        textView2.setBackground(Z);
        f7.k(textView2, Z, null, L, u6Var);
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.d3.h(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        kb1.b(textView2);
        d.addView(textView2, kb1.x(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = m3Var;
        this.x = false;
        m3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        a9Var.addView(this.w, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        a9Var.addView(this.y, kb1.i(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        f7.i(y6.d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        a9Var.addView(this.h, kb1.e(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final aq aqVar = new aq(context, 24, this.resourceProvider);
        aqVar.b(y6.h7, y6.j7, y6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        aqVar.setTranslationX(AndroidUtilities.dp(4.0f));
        aqVar.setScaleX(0.8f);
        aqVar.setScaleY(0.8f);
        linearLayout2.addView(aqVar, kb1.u(26, 26, 16));
        TextView textView3 = new TextView(context);
        f7.V(textView3, y6.j5, this.resourceProvider);
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, kb1.x(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = y6.Oh;
        int v10 = y6.v(themedColor, y6.o1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(y6.j0(dp, dp, dp, dp, 0, v10, v10));
        this.N = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        eh.d c10 = this.P.c(view2, null, false);
        c10.v(gh.c.l(this.resourceProvider));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(18.0f));
        view2.setBackground(c10);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a3
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
                            aqVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            l80 H = l80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new w2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final aq aqVar2 = aqVar;
                            H.i(new Runnable() { // from class: zh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                aqVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                aqVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: zh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                aqVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                aqVar2.a(true, true);
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
        this.s.addView(linearLayout2, kb1.g(-1.0f, -2));
        kb1.c(this.s, 0.04f, 1.5f);
        a9Var.addView(this.s, kb1.h(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        ca y3 = ca.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        eh.d c11 = this.P.c(view3, null, false);
        c11.v(gh.c.l(this.resourceProvider));
        c11.w(AndroidUtilities.dp(8.0f));
        c11.x(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        a9Var.addView(this.r, kb1.h(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new zq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        f7.V(this.v, i14, getResourceProvider());
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = y6.v(getThemedColor(i10), y6.o1(0.1f, getThemedColor(i14)));
        textView4.setBackground(y6.j0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: zh.z2
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
        this.r.addView(this.v, kb1.g(-1.0f, -2));
        this.r.setVisibility(8);
        kb1.c(this.r, 0.05f, 1.5f);
        l3 l3Var = new l3(context, this.resourceProvider);
        this.F = l3Var;
        l3Var.setSorting(this.d.p);
        this.E.addView(this.F, kb1.x(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a3
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
                            aqVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            l80 H = l80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new w2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final aq aqVar2 = aqVar;
                            H.i(new Runnable() { // from class: zh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                aqVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                aqVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: zh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                aqVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                aqVar2.a(true, true);
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
        l3 l3Var2 = new l3(context, this.resourceProvider);
        this.G = l3Var2;
        l3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, kb1.x(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: zh.s2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        h4.X(this.b, context);
                        break;
                    case 1:
                        h4.Y(this.b, context);
                        break;
                    default:
                        h4.W(this.b, context);
                        break;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourceProvider);
        this.H = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, kb1.x(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: zh.s2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        h4.X(this.b, context);
                        break;
                    case 1:
                        h4.Y(this.b, context);
                        break;
                    default:
                        h4.W(this.b, context);
                        break;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourceProvider);
        this.I = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, kb1.x(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: zh.s2
            public final /* synthetic */ h4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        h4.X(this.b, context);
                        break;
                    case 1:
                        h4.Y(this.b, context);
                        break;
                    default:
                        h4.W(this.b, context);
                        break;
                }
            }
        });
        z00 z00Var = new z00(getParentActivity());
        this.J = z00Var;
        a9Var.addView(z00Var, kb1.g(-1.0f, -1));
        e0(false, false);
        return a9Var;
    }

    public final void e0(boolean z10, boolean z11) {
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
        ds dsVar = ds.h;
        alpha.setInterpolator(dsVar).setDuration(420L).setListener(new b3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(dsVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(dsVar).setDuration(420L).start();
    }

    public final void f0(boolean z10) {
        k71 k71Var;
        u3 u3Var = this.d;
        int i10 = u3Var.e;
        HashSet hashSet = u3Var.l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.k;
        ArrayList arrayList2 = u3Var.g;
        HashSet hashSet3 = u3Var.j;
        ArrayList arrayList3 = u3Var.f;
        if (i10 > 12) {
            e0(true, true);
        }
        d3 d3Var = this.n;
        boolean z11 = false;
        if (d3Var != null && (k71Var = d3Var.g3) != null) {
            k71Var.O(true);
            if (z10) {
                this.n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = u3Var.e;
            kVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        l3 l3Var = this.F;
        if (l3Var != null) {
            l3Var.setSorting(u3Var.p);
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
            if (this.n.getChildAt(i12) instanceof c10) {
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = y6.x0(null, y6.d6, false);
            if (this.actionBar.q()) {
                x02 = y6.x0(null, y6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        boolean z10 = true;
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.O;
            int i10 = y6.d6;
            cVar.a(getThemedColor(i10));
            int v = y6.v(getThemedColor(i10), y6.o1(0.1f, getThemedColor(y6.Oh)));
            if (v != this.M) {
                this.M = v;
                TextView textView = this.v;
                if (textView != null) {
                    y6.E1(textView.getBackground(), v, true);
                }
                LinearLayout linearLayout = this.N;
                if (linearLayout != null) {
                    y6.E1(linearLayout.getBackground(), v, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int v10 = y6.v(y6.w0(y6.d6, this.resourceProvider), y6.o1(0.04f, y6.w0(y6.G6, this.resourceProvider)));
            int i11 = this.L;
            if (v10 != i11) {
                HorizontalScrollView horizontalScrollView = this.y;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i11) {
                    this.y.setBackgroundColor(v10);
                }
                View view = this.fragmentView;
                int i12 = this.L;
                if (view == null || !(view.getBackground() instanceof ColorDrawable) || ((ColorDrawable) view.getBackground()).getColor() != i12) {
                    z10 = false;
                }
                if (z10) {
                    this.fragmentView.setBackgroundColor(v10);
                }
                this.L = v10;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
