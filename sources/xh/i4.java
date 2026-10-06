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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p81;
import org.telegram.ui.py0;
import org.telegram.ui.y8;
import w7.b6;
import w7.z5;
import yh.m7;
import yh.u5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class i4 extends org.telegram.ui.ActionBar.n2 implements le.d {
    public LinearLayout E;
    public m3 F;
    public m3 G;
    public m3 H;
    public m3 I;
    public u00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.b a;
    public final long b;
    public final String c;
    public final v3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.g2 f;
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
        this.a = new le.b(0, this, tr.h, 380L, false);
        this.K = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = d6Var;
        v3 v3Var = new v3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = v3Var;
        v3Var.g(false);
    }

    public static void S(i4 i4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
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
                rc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                rc O2 = yc.a0(i4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i4Var.currentAccount, j3)));
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
        c5 c5Var = i4Var.parentLayout;
        if (c5Var == null || !((ActionBarLayout) c5Var).b) {
            i4Var.presentFragment(d3Var, true, z10);
        } else {
            Dialog dialog = i4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            i4Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(d3Var, false, z10);
            }
        }
        Utilities.Callback callback = i4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void T(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.h.isEmpty()) {
            b80 b80Var = new b80(i4Var, i4Var.I, false, false);
            b80Var.t = false;
            b80Var.Y = true;
            b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b80Var.R = true;
            b80Var.p = new ii.h(b80Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.h);
            Collections.sort(arrayList, new u2(i4Var, 0));
            h3 h3Var = new h3(i4Var, new v2(i4Var, strArr, arrayList, 0), new w2(i4Var, b80Var, 0), null);
            h3Var.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            eu euVar = new eu(context, i4Var.resourceProvider);
            euVar.setTextSize(1, 16.0f);
            euVar.setInputType(573441);
            euVar.setRawInputType(573441);
            euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
            euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
            euVar.setCursorSize(AndroidUtilities.dp(19.0f));
            euVar.setCursorWidth(1.5f);
            euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
            euVar.setBackground(null);
            frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            euVar.addTextChangedListener(new tn(strArr, h3Var, false, 8));
            if (arrayList.size() > 8) {
                b80Var.r(frameLayout, z5.n(-1, 44));
                b80Var.k();
            }
            if (!v3Var.l.isEmpty()) {
                b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 0), false);
            }
            b80Var.q(h3Var);
            b80Var.Z();
        }
    }

    public static void U(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.f.isEmpty()) {
            b80 b80Var = new b80(i4Var, i4Var.G, false, false);
            b80Var.t = false;
            b80Var.Y = true;
            b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b80Var.R = true;
            b80Var.p = new ii.h(b80Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.f);
            Collections.sort(arrayList, new u2(i4Var, 2));
            f3 f3Var = new f3(i4Var, new v2(i4Var, strArr, arrayList, 2), new w2(i4Var, b80Var, 2), null);
            f3Var.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            eu euVar = new eu(context, i4Var.resourceProvider);
            euVar.setTextSize(1, 16.0f);
            euVar.setInputType(573441);
            euVar.setRawInputType(573441);
            euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
            euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
            euVar.setCursorSize(AndroidUtilities.dp(19.0f));
            euVar.setCursorWidth(1.5f);
            euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
            euVar.setBackground(null);
            frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            euVar.addTextChangedListener(new tn(strArr, f3Var, false, 9));
            if (arrayList.size() > 8) {
                b80Var.r(frameLayout, z5.n(-1, 44));
                b80Var.k();
            }
            if (!v3Var.j.isEmpty()) {
                b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 2), false);
            }
            b80Var.q(f3Var);
            b80Var.Z();
        }
    }

    public static void W(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (i4Var.K && !v3Var.g.isEmpty()) {
            b80 b80Var = new b80(i4Var, i4Var.H, false, false);
            b80Var.t = false;
            b80Var.Y = true;
            b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
            b80Var.R = true;
            b80Var.p = new ii.h(b80Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(v3Var.g);
            Collections.sort(arrayList, new u2(i4Var, 1));
            g3 g3Var = new g3(i4Var, new v2(i4Var, strArr, arrayList, 1), new w2(i4Var, b80Var, 1), null);
            g3Var.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            eu euVar = new eu(context, i4Var.resourceProvider);
            euVar.setTextSize(1, 16.0f);
            euVar.setInputType(573441);
            euVar.setRawInputType(573441);
            euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
            euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
            euVar.setCursorSize(AndroidUtilities.dp(19.0f));
            euVar.setCursorWidth(1.5f);
            euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
            euVar.setBackground(null);
            frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            euVar.addTextChangedListener(new tn(strArr, g3Var, false, 10));
            if (arrayList.size() > 8) {
                b80Var.r(frameLayout, z5.n(-1, 44));
                b80Var.k();
            }
            if (!v3Var.k.isEmpty()) {
                b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 1), false);
            }
            b80Var.q(g3Var);
            b80Var.Z();
        }
    }

    public static void X(i4 i4Var, h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.y3 y3Var = new yh.y3(i4Var.getParentActivity(), i4Var.currentAccount, i4Var.b, i4Var.resourceProvider, null);
            y3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i4Var.d);
            y3Var.O0 = new z2(i4Var);
            i4Var.showDialog(y3Var);
        }
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            c20.d(this.r, f7);
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
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 10));
        this.actionBar.setTitle(this.c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = i6.G6;
        kVar2.A(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(i11), true);
        this.actionBar.z(getThemedColor(i6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(i6.z6));
        y8 y8Var = new y8(this, context, 8);
        int v = i6.v(i6.v0(i10, this.resourceProvider), i6.l1(0.04f, i6.v0(i11, this.resourceProvider)));
        y8Var.setBackgroundColor(v);
        this.fragmentView = y8Var;
        m7 m7Var = new m7(context, this.currentAccount, this.resourceProvider);
        m7Var.d = true;
        b6.a(m7Var);
        m7Var.setOnClickListener(new py0(25, this, m7Var));
        this.actionBar.addView(m7Var, z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        e3 e3Var = new e3(this, new hi.a(this, 18), new z2(this), new z2(this));
        this.n = e3Var;
        e3Var.f3.r = false;
        e3Var.setSpanCount(3);
        this.n.j(new xb0(this, 17));
        this.n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.n.setClipToPadding(false);
        y8Var.addView(this.n, z5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        y8Var.addView(this.actionBar);
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
        LinearLayout e7 = bi.e(context, 1);
        n3Var.addView(e7, z5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        e7.addView(w9Var, z5.q(130, 130, 17));
        TextView textView = new TextView(context);
        bi.m(i6.G6, d6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        e7.addView(textView, z5.t(-2, -2, 17, 32, 12, 32, 9));
        q90 q90Var = new q90(context, null);
        q90Var.setTextColor(i6.v0(i6.A6, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setGravity(17);
        q90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        q90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        e7.addView(q90Var, z5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i13 = i6.Oh;
        textView2.setTextColor(i6.v0(i13, d6Var));
        textView2.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i13, d6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.d(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        b6.a(textView2);
        e7.addView(textView2, z5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.w = n3Var;
        this.x = false;
        n3Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        y8Var.addView(this.w, z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
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
        y8Var.addView(this.y, z5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(i6.d7));
        this.h.setAlpha(0.0f);
        y8Var.addView(this.h, z5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final qp qpVar = new qp(context, 24, this.resourceProvider);
        qpVar.b(i6.h7, i6.j7, i6.k7);
        qpVar.setDrawUnchecked(true);
        qpVar.a(false, false);
        qpVar.setDrawBackgroundAsArc(10);
        qpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        qpVar.setScaleX(0.8f);
        qpVar.setScaleY(0.8f);
        linearLayout2.addView(qpVar, z5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        bi.m(i6.j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, z5.t(-2, -2, 16, 9, 0, 0, 0));
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
        c10.w(eh.b.l(this.resourceProvider));
        c10.x(AndroidUtilities.dp(8.0f));
        c10.y(AndroidUtilities.dp(18.0f));
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
                            qpVar.a(z10, true);
                            v3Var.h();
                            break;
                        }
                        break;
                    default:
                        final i4 i4Var = this.b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            b80 H = b80.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new x2(i4Var, 5), false);
                            H.k();
                            boolean z11 = !v3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i16 = 0;
                            final qp qpVar2 = qpVar;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                qpVar2.a(true, true);
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
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                qpVar2.a(true, true);
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
        this.s.addView(linearLayout2, z5.c(-1.0f, -2));
        b6.b(this.s, 0.04f, 1.5f);
        y8Var.addView(this.s, z5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        u5 y3 = u5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.r;
        ch.d c11 = this.M.c(view3, null, false);
        c11.w(eh.b.l(this.resourceProvider));
        c11.x(AndroidUtilities.dp(8.0f));
        c11.y(AndroidUtilities.dp(22.0f));
        view3.setBackground(c11);
        y8Var.addView(this.r, z5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new rq(R.drawable.msg_clearcache, 0), 0, 1, 33);
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
        this.r.addView(this.v, z5.c(-1.0f, -2));
        this.r.setVisibility(8);
        b6.b(this.r, 0.05f, 1.5f);
        m3 m3Var = new m3(context, this.resourceProvider);
        this.F = m3Var;
        m3Var.setSorting(this.d.p);
        this.E.addView(this.F, z5.t(-2, -2, 16, 0, 0, 6, 0));
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
                            qpVar.a(z10, true);
                            v3Var.h();
                            break;
                        }
                        break;
                    default:
                        final i4 i4Var = this.b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            b80 H = b80.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.b.a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.c.a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.d.a), new x2(i4Var, 5), false);
                            H.k();
                            boolean z11 = !v3Var2.r;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final int i162 = 0;
                            final qp qpVar2 = qpVar;
                            H.i(new Runnable() { // from class: xh.y2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.r) {
                                                v3Var3.r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                qpVar2.a(true, true);
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
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.r) {
                                                v3Var4.r = true;
                                                qpVar2.a(true, true);
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
        this.E.addView(this.G, z5.t(-2, -2, 16, 0, 0, 6, 0));
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
                        i4.U(this.b, context);
                        break;
                    case 1:
                        i4.W(this.b, context);
                        break;
                    default:
                        i4.T(this.b, context);
                        break;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourceProvider);
        this.H = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, z5.t(-2, -2, 16, 0, 0, 6, 0));
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
                        i4.U(this.b, context);
                        break;
                    case 1:
                        i4.W(this.b, context);
                        break;
                    default:
                        i4.T(this.b, context);
                        break;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourceProvider);
        this.I = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, z5.t(-2, -2, 16, 0, 0, 0, 0));
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
                        i4.U(this.b, context);
                        break;
                    case 1:
                        i4.W(this.b, context);
                        break;
                    default:
                        i4.T(this.b, context);
                        break;
                }
            }
        });
        u00 u00Var = new u00(getParentActivity());
        this.J = u00Var;
        y8Var.addView(u00Var, z5.c(-1.0f, -1));
        d0(false, false);
        return y8Var;
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
        tr trVar = tr.h;
        alpha.setInterpolator(trVar).setDuration(420L).setListener(new c3(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(trVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(trVar).setDuration(420L).start();
    }

    public final void e0(boolean z10) {
        w61 w61Var;
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
        if (e3Var != null && (w61Var = e3Var.f3) != null) {
            w61Var.N(true);
            if (z10) {
                this.n.v0(0);
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
            if (this.n.getChildAt(i12) instanceof w00) {
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
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
