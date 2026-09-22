package xh;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w8;
import org.telegram.ui.w81;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;
import yh.l7;
import yh.u5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class h4 extends org.telegram.ui.ActionBar.n2 implements le.d {
    public LinearLayout E;
    public l3 F;
    public l3 G;
    public l3 H;
    public l3 I;
    public r00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.b a;
    public final long b;
    public final String c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.g2 f;
    public View h;
    public d3 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public m3 w;
    public boolean x;
    public HorizontalScrollView y;

    public h4(long j3, String str, long j10, e6 e6Var) {
        super(null);
        this.a = new le.b(0, this, qr.h, 380L, false);
        this.K = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = e6Var;
        u3 u3Var = new u3(j10, this.currentAccount, new org.telegram.ui.web.b1(this, 18));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                vc a02 = vc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                oc O = a02.O(document, string, LocaleController.formatString(i10, hg.c.k(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                oc O2 = vc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j3)));
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
        c3 c3Var = new c3(bundle, tL_starGiftUnique, j3);
        d5 d5Var = h4Var.parentLayout;
        if (d5Var == null || !((ActionBarLayout) d5Var).b) {
            h4Var.presentFragment(c3Var, true, z10);
        } else {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(c3Var, false, z10);
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
            n70 n70Var = new n70(h4Var, h4Var.I, false, false);
            n70Var.t = false;
            n70Var.Y = true;
            n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            n70Var.R = true;
            n70Var.p = new ii.h(n70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.h);
            Collections.sort(arrayList, new t2(h4Var, 0));
            g3 g3Var = new g3(h4Var, new u2(h4Var, strArr, arrayList, 0), new v2(h4Var, n70Var, 0), null);
            g3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            bu buVar = new bu(context, h4Var.resourceProvider);
            buVar.setTextSize(1, 16.0f);
            buVar.setInputType(573441);
            buVar.setRawInputType(573441);
            buVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourceProvider));
            buVar.setCursorColor(i6.v0(i6.G6, h4Var.resourceProvider));
            buVar.setCursorSize(AndroidUtilities.dp(19.0f));
            buVar.setCursorWidth(1.5f);
            buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            buVar.setTextColor(i6.v0(i6.E8, h4Var.resourceProvider));
            buVar.setBackground(null);
            frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            buVar.addTextChangedListener(new qn(strArr, g3Var, false, 8));
            if (arrayList.size() > 8) {
                n70Var.r(frameLayout, x5.n(-1, 44));
                n70Var.k();
            }
            if (!u3Var.l.isEmpty()) {
                n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 0), false);
            }
            n70Var.q(g3Var);
            n70Var.Z();
        }
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.f.isEmpty()) {
            n70 n70Var = new n70(h4Var, h4Var.G, false, false);
            n70Var.t = false;
            n70Var.Y = true;
            n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            n70Var.R = true;
            n70Var.p = new ii.h(n70Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.f);
            Collections.sort(arrayList, new t2(h4Var, 2));
            e3 e3Var = new e3(h4Var, new u2(h4Var, strArr, arrayList, 2), new v2(h4Var, n70Var, 2), null);
            e3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            bu buVar = new bu(context, h4Var.resourceProvider);
            buVar.setTextSize(1, 16.0f);
            buVar.setInputType(573441);
            buVar.setRawInputType(573441);
            buVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourceProvider));
            buVar.setCursorColor(i6.v0(i6.G6, h4Var.resourceProvider));
            buVar.setCursorSize(AndroidUtilities.dp(19.0f));
            buVar.setCursorWidth(1.5f);
            buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            buVar.setTextColor(i6.v0(i6.E8, h4Var.resourceProvider));
            buVar.setBackground(null);
            frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            buVar.addTextChangedListener(new qn(strArr, e3Var, false, 9));
            if (arrayList.size() > 8) {
                n70Var.r(frameLayout, x5.n(-1, 44));
                n70Var.k();
            }
            if (!u3Var.j.isEmpty()) {
                n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 2), false);
            }
            n70Var.q(e3Var);
            n70Var.Z();
        }
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (h4Var.K && !u3Var.g.isEmpty()) {
            n70 n70Var = new n70(h4Var, h4Var.H, false, false);
            n70Var.t = false;
            n70Var.Y = true;
            n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            n70Var.R = true;
            n70Var.p = new ii.h(n70Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(u3Var.g);
            Collections.sort(arrayList, new t2(h4Var, 1));
            f3 f3Var = new f3(h4Var, new u2(h4Var, strArr, arrayList, 1), new v2(h4Var, n70Var, 1), null);
            f3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            bu buVar = new bu(context, h4Var.resourceProvider);
            buVar.setTextSize(1, 16.0f);
            buVar.setInputType(573441);
            buVar.setRawInputType(573441);
            buVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourceProvider));
            buVar.setCursorColor(i6.v0(i6.G6, h4Var.resourceProvider));
            buVar.setCursorSize(AndroidUtilities.dp(19.0f));
            buVar.setCursorWidth(1.5f);
            buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            buVar.setTextColor(i6.v0(i6.E8, h4Var.resourceProvider));
            buVar.setBackground(null);
            frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            buVar.addTextChangedListener(new qn(strArr, f3Var, false, 10));
            if (arrayList.size() > 8) {
                n70Var.r(frameLayout, x5.n(-1, 44));
                n70Var.k();
            }
            if (!u3Var.k.isEmpty()) {
                n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 1), false);
            }
            n70Var.q(f3Var);
            n70Var.Z();
        }
    }

    public static void Y(h4 h4Var, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.z3 z3Var = new yh.z3(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.b, h4Var.resourceProvider, null);
            z3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            z3Var.O0 = new y2(h4Var);
            h4Var.showDialog(z3Var);
        }
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            y10.d(this.r, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = i6.d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new w81(this, 11));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = i6.G6;
        kVar2.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(i6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(i6.z6));
        w8 w8Var = new w8(this, context, 9);
        int v = i6.v(i6.v0(i10, this.resourceProvider), i6.l1(0.04f, i6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        l7 l7Var = new l7(context, this.currentAccount, this.resourceProvider);
        l7Var.d = true;
        z5.a(l7Var);
        l7Var.setOnClickListener(new wy0(25, this, l7Var));
        this.actionBar.addView(l7Var, x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        d3 d3Var = new d3(this, new hi.a(this, 18), new y2(this), new y2(this));
        this.n = d3Var;
        d3Var.Y2.r = false;
        d3Var.setSpanCount(3);
        this.n.j(new kb0(this, 16));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        w8Var.addView(this.n, x5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: xh.z2
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
        e6 e6Var = this.resourceProvider;
        m3 m3Var = new m3(context);
        LinearLayout f7 = vl.f(context, 1);
        m3Var.addView(f7, x5.e(-1, -2, 23));
        u9 u9Var = new u9(context);
        u9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(u9Var, x5.q(130, 130, 17));
        TextView textView = new TextView(context);
        vl.o(i6.G6, e6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, x5.t(-2, -2, 17, 32, 12, 32, 9));
        c90 c90Var = new c90(context, null);
        c90Var.setTextColor(i6.v0(i6.A6, e6Var));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setGravity(17);
        c90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        c90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(c90Var, x5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = i6.Oh;
        textView2.setTextColor(i6.v0(i13, e6Var));
        textView2.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i13, e6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.q3.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        z5.a(textView2);
        f7.addView(textView2, x5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = m3Var;
        this.x = false;
        m3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        w8Var.addView(this.w, x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        w8Var.addView(this.y, x5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(i6.d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, x5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final np npVar = new np(context, 24, this.resourceProvider);
        npVar.b(i6.h7, i6.j7, i6.k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        npVar.setTranslationX(AndroidUtilities.dp(4.0f));
        npVar.setScaleX(0.8f);
        npVar.setScaleY(0.8f);
        linearLayout2.addView(npVar, x5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        vl.o(i6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, x5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = i6.Oh;
        int v9 = i6.v(themedColor, i6.l1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(i6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.s;
        ch.d c10 = this.M.c(view2, null, false);
        c10.o(eh.b.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        view2.setBackground(c10);
        final int i15 = 0;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a3
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
                            npVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            n70 H = n70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new w2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final np npVar2 = npVar;
                            H.i(new Runnable() { // from class: xh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: xh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                npVar2.a(true, true);
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
        this.s.addView(linearLayout2, x5.c(-1.0f, -2));
        z5.b(this.s, 0.04f, 1.5f);
        w8Var.addView(this.s, x5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        u5 y3 = u5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        ch.d c11 = this.M.c(view3, null, false);
        c11.o(eh.b.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        w8Var.addView(this.r, x5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new oq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = i6.v(getThemedColor(i10), i6.l1(0.1f, getThemedColor(i14)));
        textView4.setBackground(i6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: xh.z2
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
        this.r.addView(this.v, x5.c(-1.0f, -2));
        this.r.setVisibility(8);
        z5.b(this.r, 0.05f, 1.5f);
        l3 l3Var = new l3(context, this.resourceProvider);
        this.F = l3Var;
        l3Var.setSorting(this.d.p);
        this.E.addView(this.F, x5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a3
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
                            npVar.a(z10, true);
                            u3Var.h();
                            break;
                        }
                        break;
                    default:
                        final h4 h4Var = this.b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            n70 H = n70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.b.a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.c.a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.d.a), new w2(h4Var, 5), false);
                            H.k();
                            boolean z11 = !u3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final np npVar2 = npVar;
                            H.i(new Runnable() { // from class: xh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: xh.x2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.r) {
                                                u3Var3.r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.r) {
                                                u3Var4.r = true;
                                                npVar2.a(true, true);
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
        this.E.addView(this.G, x5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: xh.s2
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
        l3 l3Var3 = new l3(context, this.resourceProvider);
        this.H = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, x5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: xh.s2
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
        l3 l3Var4 = new l3(context, this.resourceProvider);
        this.I = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, x5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: xh.s2
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
        r00 r00Var = new r00(getParentActivity());
        this.J = r00Var;
        w8Var.addView(r00Var, x5.c(-1.0f, -1));
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
        qr qrVar = qr.h;
        alpha.setInterpolator(qrVar).setDuration(420L).setListener(new b3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(qrVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(qrVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        w51 w51Var;
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
        d3 d3Var = this.n;
        boolean z11 = false;
        if (d3Var != null && (w51Var = d3Var.Y2) != null) {
            w51Var.N(true);
            if (z10) {
                this.n.u0(0);
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
            if (this.n.getChildAt(i12) instanceof t00) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
