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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f81;
import org.telegram.ui.ny0;
import org.telegram.ui.w8;
import w7.a6;
import w7.y5;
import yh.k7;
import yh.t5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public class i4 extends org.telegram.ui.ActionBar.m2 implements le.e {
    public LinearLayout E;
    public m3 F;
    public m3 G;
    public m3 H;
    public m3 I;
    public s00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.c a;
    public final long b;
    public final String c;
    public final v3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.f2 f;
    public View h;
    public e3 n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView v;
    public n3 w;
    public boolean x;
    public HorizontalScrollView y;

    public i4(long j3, String str, long j10, d6 d6Var) {
        super(null);
        this.a = new le.c(0, this, rr.h, 380L, false);
        this.K = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = d6Var;
        v3 v3Var = new v3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = v3Var;
        v3Var.g(false);
    }

    public static void U(i4 i4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
            i4Var.d.d.remove(tL_starGiftUnique);
            i4Var.e0(false);
            if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
                yc a02 = yc.a0(i4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                qc O2 = yc.a0(i4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i4Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            i4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        d3 d3Var = new d3(bundle, tL_starGiftUnique, j3);
        b5 b5Var = i4Var.parentLayout;
        if (b5Var == null || !((ActionBarLayout) b5Var).b) {
            i4Var.presentFragment(d3Var, true, z10);
        } else {
            Dialog dialog = i4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.e3) && z10) {
                ((org.telegram.ui.ActionBar.e3) dialog).skipDismissAnimation();
            }
            i4Var.finishFragment();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(d3Var, false, z10);
            }
        }
        Utilities.Callback callback = i4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.h.isEmpty()) {
            y70 y70Var = new y70(i4Var, i4Var.I, false, false);
            y70Var.t = false;
            y70Var.Y = true;
            y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            y70Var.R = true;
            y70Var.p = new ii.h(y70Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.h);
            Collections.sort(arrayList, new u2(i4Var, 0));
            h3 h3Var = new h3(i4Var, new v2(i4Var, strArr, arrayList, 0), new w2(i4Var, y70Var, 0), null);
            h3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            cu cuVar = new cu(context, i4Var.resourceProvider);
            cuVar.setTextSize(1, 16.0f);
            cuVar.setInputType(573441);
            cuVar.setRawInputType(573441);
            cuVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
            cuVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
            cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            cuVar.setCursorWidth(1.5f);
            cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            cuVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
            cuVar.setBackground(null);
            frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            cuVar.addTextChangedListener(new rn(strArr, h3Var, false, 8));
            if (arrayList.size() > 8) {
                y70Var.r(frameLayout, y5.n(-1, 44));
                y70Var.k();
            }
            if (!v3Var.l.isEmpty()) {
                y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 0), false);
            }
            y70Var.q(h3Var);
            y70Var.Z();
        }
    }

    public static void W(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.f.isEmpty()) {
            y70 y70Var = new y70(i4Var, i4Var.G, false, false);
            y70Var.t = false;
            y70Var.Y = true;
            y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            y70Var.R = true;
            y70Var.p = new ii.h(y70Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.f);
            Collections.sort(arrayList, new u2(i4Var, 2));
            f3 f3Var = new f3(i4Var, new v2(i4Var, strArr, arrayList, 2), new w2(i4Var, y70Var, 2), null);
            f3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            cu cuVar = new cu(context, i4Var.resourceProvider);
            cuVar.setTextSize(1, 16.0f);
            cuVar.setInputType(573441);
            cuVar.setRawInputType(573441);
            cuVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
            cuVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
            cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            cuVar.setCursorWidth(1.5f);
            cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            cuVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
            cuVar.setBackground(null);
            frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            cuVar.addTextChangedListener(new rn(strArr, f3Var, false, 9));
            if (arrayList.size() > 8) {
                y70Var.r(frameLayout, y5.n(-1, 44));
                y70Var.k();
            }
            if (!v3Var.j.isEmpty()) {
                y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 2), false);
            }
            y70Var.q(f3Var);
            y70Var.Z();
        }
    }

    public static void X(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.g.isEmpty()) {
            y70 y70Var = new y70(i4Var, i4Var.H, false, false);
            y70Var.t = false;
            y70Var.Y = true;
            y70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            y70Var.R = true;
            y70Var.p = new ii.h(y70Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.g);
            Collections.sort(arrayList, new u2(i4Var, 1));
            g3 g3Var = new g3(i4Var, new v2(i4Var, strArr, arrayList, 1), new w2(i4Var, y70Var, 1), null);
            g3Var.Y2.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            cu cuVar = new cu(context, i4Var.resourceProvider);
            cuVar.setTextSize(1, 16.0f);
            cuVar.setInputType(573441);
            cuVar.setRawInputType(573441);
            cuVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
            cuVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
            cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
            cuVar.setCursorWidth(1.5f);
            cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            cuVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
            cuVar.setBackground(null);
            frameLayout.addView(cuVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            cuVar.addTextChangedListener(new rn(strArr, g3Var, false, 10));
            if (arrayList.size() > 8) {
                y70Var.r(frameLayout, y5.n(-1, 44));
                y70Var.k();
            }
            if (!v3Var.k.isEmpty()) {
                y70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 1), false);
            }
            y70Var.q(g3Var);
            y70Var.Z();
        }
    }

    public static void Y(i4 i4Var, v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.x3 x3Var = new yh.x3(i4Var.getParentActivity(), i4Var.currentAccount, i4Var.b, i4Var.resourceProvider, null);
            x3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i4Var.d);
            x3Var.O0 = new z2(i4Var);
            i4Var.showDialog(x3Var);
        }
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            z10.d(this.r, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = h6.d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new f81(this, 11));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(h6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(h6.z6));
        w8 w8Var = new w8(this, context, 9);
        int v = h6.v(h6.v0(i10, this.resourceProvider), h6.l1(0.04f, h6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        k7 k7Var = new k7(context, this.currentAccount, this.resourceProvider);
        k7Var.d = true;
        a6.a(k7Var);
        k7Var.setOnClickListener(new ny0(25, this, k7Var));
        this.actionBar.addView(k7Var, y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        e3 e3Var = new e3(this, new hi.a(this, 18), new z2(this), new z2(this));
        this.n = e3Var;
        e3Var.Y2.r = false;
        e3Var.setSpanCount(3);
        this.n.j(new ug0(this, 15));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        w8Var.addView(this.n, y5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: xh.a3
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        v3 v3Var = this.b.d;
                        v3Var.k.clear();
                        v3Var.j.clear();
                        v3Var.l.clear();
                        v3Var.h();
                        break;
                    default:
                        v3 v3Var2 = this.b.d;
                        v3Var2.k.clear();
                        v3Var2.j.clear();
                        v3Var2.l.clear();
                        v3Var2.h();
                        break;
                }
            }
        };
        d6 d6Var = this.resourceProvider;
        n3 n3Var = new n3(context);
        LinearLayout f7 = ok.f(context, 1);
        n3Var.addView(f7, y5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(w9Var, y5.q(130, 130, 17));
        TextView textView = new TextView(context);
        ok.n(h6.G6, d6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, y5.t(-2, -2, 17, 32, 12, 32, 9));
        n90 n90Var = new n90(context, null);
        n90Var.setTextColor(h6.v0(h6.A6, d6Var));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setGravity(17);
        n90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        n90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(n90Var, y5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = h6.Oh;
        textView2.setTextColor(h6.v0(i13, d6Var));
        textView2.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i13, d6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        a6.a(textView2);
        f7.addView(textView2, y5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = n3Var;
        this.x = false;
        n3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        w8Var.addView(this.w, y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        w8Var.addView(this.y, y5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, y5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final op opVar = new op(context, 24, this.resourceProvider);
        opVar.b(h6.h7, h6.j7, h6.k7);
        opVar.setDrawUnchecked(true);
        opVar.a(false, false);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setTranslationX(AndroidUtilities.dp(4.0f));
        opVar.setScaleX(0.8f);
        opVar.setScaleY(0.8f);
        linearLayout2.addView(opVar, y5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        ok.n(h6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, y5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i14 = h6.Oh;
        int v9 = h6.v(themedColor, h6.l1(0.1f, getThemedColor(i14)));
        linearLayout2.setBackground(h6.i0(dp, dp, dp, dp, 0, v9, v9));
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
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: xh.b3
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        v3 v3Var = this.b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.r;
                            v3Var.r = z10;
                            opVar.a(z10, true);
                            v3Var.h();
                            break;
                        }
                        break;
                    default:
                        final i4 i4Var = this.b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            y70 H = y70.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new x2(i4Var, 5), false);
                            H.k();
                            boolean z11 = !v3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final op opVar2 = opVar;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                opVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                opVar2.a(true, true);
                                                v3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i17 = 1;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                opVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                opVar2.a(true, true);
                                                v3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.r);
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
        this.s.addView(linearLayout2, y5.c(-1.0f, -2));
        a6.b(this.s, 0.04f, 1.5f);
        w8Var.addView(this.s, y5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        t5 y3 = t5.y(this.currentAccount, true);
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
        w8Var.addView(this.r, y5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new pq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i14));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = h6.v(getThemedColor(i10), h6.l1(0.1f, getThemedColor(i14)));
        textView4.setBackground(h6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a3
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        v3 v3Var = this.b.d;
                        v3Var.k.clear();
                        v3Var.j.clear();
                        v3Var.l.clear();
                        v3Var.h();
                        break;
                    default:
                        v3 v3Var2 = this.b.d;
                        v3Var2.k.clear();
                        v3Var2.j.clear();
                        v3Var2.l.clear();
                        v3Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.v, y5.c(-1.0f, -2));
        this.r.setVisibility(8);
        a6.b(this.r, 0.05f, 1.5f);
        m3 m3Var = new m3(context, this.resourceProvider);
        this.F = m3Var;
        m3Var.setSorting(this.d.p);
        this.E.addView(this.F, y5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i17 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: xh.b3
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i17) {
                    case 0:
                        v3 v3Var = this.b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.r;
                            v3Var.r = z10;
                            opVar.a(z10, true);
                            v3Var.h();
                            break;
                        }
                        break;
                    default:
                        final i4 i4Var = this.b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            y70 H = y70.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new x2(i4Var, 5), false);
                            H.k();
                            boolean z11 = !v3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final op opVar2 = opVar;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                opVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                opVar2.a(true, true);
                                                v3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, string, z11);
                            final int i172 = 1;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                opVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                opVar2.a(true, true);
                                                v3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.r);
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
        m3 m3Var2 = new m3(context, this.resourceProvider);
        this.G = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, y5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i18 = 0;
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: xh.t2
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i18) {
                    case 0:
                        i4.W(this.b, context);
                        break;
                    case 1:
                        i4.X(this.b, context);
                        break;
                    default:
                        i4.V(this.b, context);
                        break;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourceProvider);
        this.H = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, y5.t(-2, -2, 16, 0, 0, 6, 0));
        final int i19 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: xh.t2
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i19) {
                    case 0:
                        i4.W(this.b, context);
                        break;
                    case 1:
                        i4.X(this.b, context);
                        break;
                    default:
                        i4.V(this.b, context);
                        break;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourceProvider);
        this.I = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, y5.t(-2, -2, 16, 0, 0, 0, 0));
        final int i20 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: xh.t2
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i20) {
                    case 0:
                        i4.W(this.b, context);
                        break;
                    case 1:
                        i4.X(this.b, context);
                        break;
                    default:
                        i4.V(this.b, context);
                        break;
                }
            }
        });
        s00 s00Var = new s00(getParentActivity());
        this.J = s00Var;
        w8Var.addView(s00Var, y5.c(-1.0f, -1));
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
        rr rrVar = rr.h;
        alpha.setInterpolator(rrVar).setDuration(420L).setListener(new c3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(rrVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(rrVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        j61 j61Var;
        v3 v3Var = this.d;
        int i10 = v3Var.e;
        HashSet hashSet = v3Var.l;
        ArrayList arrayList = v3Var.h;
        HashSet hashSet2 = v3Var.k;
        ArrayList arrayList2 = v3Var.g;
        HashSet hashSet3 = v3Var.j;
        ArrayList arrayList3 = v3Var.f;
        if (i10 > 12) {
            d0(true, true);
        }
        e3 e3Var = this.n;
        boolean z11 = false;
        if (e3Var != null && (j61Var = e3Var.Y2) != null) {
            j61Var.N(true);
            if (z10) {
                this.n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = v3Var.e;
            kVar2.setSubtitle(i11 <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i11));
        }
        m3 m3Var = this.F;
        if (m3Var != null) {
            m3Var.setSorting(v3Var.p);
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
            if (this.n.getChildAt(i12) instanceof u00) {
                v3Var.g(false);
                break;
            }
            i12++;
        }
        if ((v3Var.t || v3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = h6.w0(null, h6.d6, false);
            if (this.actionBar.s()) {
                w02 = h6.w0(null, h6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
