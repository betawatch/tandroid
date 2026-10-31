package ph;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.ny;
import org.telegram.ui.rv0;
import org.telegram.ui.w8;
import org.telegram.ui.y01;
import rh.w7;
import w7.b6;
import w7.b9;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class r3 extends org.telegram.ui.ActionBar.k2 implements fe.e {
    public HorizontalScrollView D;
    public LinearLayout E;
    public z2 F;
    public z2 G;
    public z2 H;
    public z2 I;
    public xz J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public hi.c O;
    public tg.b P;
    public final fe.b a;
    public final long b;
    public final String c;
    public final h3 d;
    public q20 e;
    public org.telegram.ui.ActionBar.c2 f;
    public View h;
    public ny n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView w;
    public dg0 x;
    public boolean y;

    public r3(long j10, String str, long j11, p6 p6Var) {
        super(null);
        this.a = new fe.b(0, this, gr.h, 380L, false);
        this.K = true;
        this.b = j10;
        this.c = str;
        this.resourceProvider = p6Var;
        h3 h3Var = new h3(this.currentAccount, j11, new h1(this, 1));
        this.d = h3Var;
        h3Var.g(false);
    }

    public static void Y(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == d20.i(r3Var.currentAccount).e()) {
            r3Var.d.d.remove(tL_starGiftUnique);
            r3Var.i0(false);
            if (j10 == d20.i(r3Var.currentAccount).e()) {
                cc a02 = cc.a0(r3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String L0 = cd.L0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                wb O = a02.O(document, L0, cd.a0(null, null, 2131752888, i0.a.k(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                wb O2 = cc.a0(r3Var).O(tL_starGiftUnique.getDocument(), cd.L0(2131752885, null), cd.a0(null, null, 2131752886, o5.s(r3Var.currentAccount, j10)));
                O2.r = false;
                O2.j();
            }
            r3Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        u2 u2Var = new u2(bundle, tL_starGiftUnique, j10);
        z4 z4Var = r3Var.parentLayout;
        if (z4Var == null || !((ActionBarLayout) z4Var).b) {
            r3Var.presentFragment(u2Var, true, z10);
        } else {
            Dialog dialog = r3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.z2) && z10) {
                ((org.telegram.ui.ActionBar.z2) dialog).N0 = true;
            }
            r3Var.finishFragment();
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(u2Var, false, z10);
            }
        }
        q20 q20Var = r3Var.e;
        if (q20Var != null) {
            q20Var.a(Boolean.valueOf(z10));
        }
    }

    public static void Z(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (r3Var.K && !h3Var.h.isEmpty()) {
            int i10 = 0;
            z60 z60Var = new z60(r3Var, r3Var.I, false, false);
            z60Var.t = false;
            z60Var.Y = true;
            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
            z60Var.R = true;
            z60Var.p = new bi.j(z60Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(h3Var.h);
            Collections.sort(arrayList, new l2(r3Var, i10));
            ny nyVar = new ny(r3Var, new m2(r3Var, strArr, arrayList, i10), new n2(r3Var, z60Var, i10), null, 5);
            nyVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, r3Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            a7.E(mtVar, t6.A6, r3Var.resourceProvider);
            a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(cd.L0(2131750018, null));
            a7.V(mtVar, t6.E8, r3Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new ag.u2(11, strArr, nyVar));
            if (arrayList.size() > 8) {
                z60Var.r(frameLayout, b6.o(-1, 44));
                z60Var.k();
            }
            if (!h3Var.l.isEmpty()) {
                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new o2(r3Var, 0), false);
            }
            z60Var.q(nyVar);
            z60Var.Z();
        }
    }

    public static void a0(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (r3Var.K && !h3Var.f.isEmpty()) {
            z60 z60Var = new z60(r3Var, r3Var.G, false, false);
            z60Var.t = false;
            z60Var.Y = true;
            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
            z60Var.R = true;
            z60Var.p = new bi.j(z60Var, 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(h3Var.f);
            int i10 = 2;
            Collections.sort(arrayList, new l2(r3Var, i10));
            ny nyVar = new ny(r3Var, new m2(r3Var, strArr, arrayList, i10), new n2(r3Var, z60Var, i10), null, 3);
            nyVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, r3Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            a7.E(mtVar, t6.A6, r3Var.resourceProvider);
            a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(cd.L0(2131750018, null));
            a7.V(mtVar, t6.E8, r3Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new ag.u2(12, strArr, nyVar));
            if (arrayList.size() > 8) {
                z60Var.r(frameLayout, b6.o(-1, 44));
                z60Var.k();
            }
            if (!h3Var.j.isEmpty()) {
                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new o2(r3Var, 2), false);
            }
            z60Var.q(nyVar);
            z60Var.Z();
        }
    }

    public static void b0(r3 r3Var, Context context) {
        h3 h3Var = r3Var.d;
        if (r3Var.K && !h3Var.g.isEmpty()) {
            z60 z60Var = new z60(r3Var, r3Var.H, false, false);
            z60Var.t = false;
            int i10 = 1;
            z60Var.Y = true;
            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
            z60Var.R = true;
            z60Var.p = new bi.j(z60Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(h3Var.g);
            Collections.sort(arrayList, new l2(r3Var, i10));
            ny nyVar = new ny(r3Var, new m2(r3Var, strArr, arrayList, i10), new n2(r3Var, z60Var, i10), null, 4);
            nyVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            a7.t(imageView, t6.F8, r3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            mt mtVar = new mt(context, r3Var.resourceProvider);
            mtVar.setTextSize(1, 16.0f);
            mtVar.setInputType(573441);
            mtVar.setRawInputType(573441);
            a7.E(mtVar, t6.A6, r3Var.resourceProvider);
            a7.m(mtVar, 30, t6.G6, r3Var.resourceProvider);
            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
            mtVar.setCursorWidth(1.5f);
            mtVar.setHint(cd.L0(2131750018, null));
            a7.V(mtVar, t6.E8, r3Var.resourceProvider);
            mtVar.setBackground(null);
            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            mtVar.addTextChangedListener(new ag.u2(13, strArr, nyVar));
            if (arrayList.size() > 8) {
                z60Var.r(frameLayout, b6.o(-1, 44));
                z60Var.k();
            }
            if (!h3Var.k.isEmpty()) {
                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new o2(r3Var, 1), false);
            }
            z60Var.q(nyVar);
            z60Var.Z();
        }
    }

    public static void c0(r3 r3Var, a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            rh.e4 e4Var = new rh.e4(r3Var.getParentActivity(), r3Var.currentAccount, r3Var.b, r3Var.resourceProvider, null);
            e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, r3Var.d);
            e4Var.J2 = new q2(r3Var);
            r3Var.showDialog(e4Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [ph.r2] */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(final Context context) {
        hi.c cVar = new hi.c();
        this.O = cVar;
        int i10 = t6.d6;
        cVar.a(getThemedColor(i10));
        this.P = new tg.b(this.O);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        final int i11 = 0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.f = c2Var;
        lVar.setBackButtonDrawable(c2Var);
        this.f.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 14));
        this.actionBar.setTitle(this.c);
        a7.i(i10, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = t6.G6;
        a7.m(lVar2, 1, i12, getResourceProvider());
        a7.b(this.actionBar, i12, getResourceProvider(), true);
        a7.m(this.actionBar, 3, t6.z8, getResourceProvider());
        a7.m(this.actionBar, 5, i12, getResourceProvider());
        a7.c(this.actionBar, t6.z6, getResourceProvider());
        w8 w8Var = new w8(this, context, 10);
        int w9 = t6.w(t6.w0(i10, this.resourceProvider), t6.r1(0.04f, t6.w0(i12, this.resourceProvider)));
        w8Var.setBackgroundColor(w9);
        this.L = w9;
        this.fragmentView = w8Var;
        w7 w7Var = new w7(this.currentAccount, context, this.resourceProvider);
        w7Var.d = true;
        e6.a(w7Var);
        w7Var.setOnClickListener(new rv0(20, this, w7Var));
        this.actionBar.addView(w7Var, b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ny nyVar = new ny(this, new ag.a(this, 27), new q2(this), new org.telegram.utils.twidget.t(this, 8), 2);
        this.n = nyVar;
        nyVar.f3.r = false;
        nyVar.setSpanCount(3);
        this.n.j(new bu0(this, 11));
        this.n.setPadding(0, org.telegram.messenger.i0.L(45.0f), 0, org.telegram.messenger.i0.L(101.0f));
        this.n.setClipToPadding(false);
        w8Var.addView(this.n, b6.d(-1, -1.0f, zs.E1, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        dg0 dg0Var = new dg0(context, (r2) new View.OnClickListener(this) { // from class: ph.r2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h3 h3Var = this.b.d;
                        h3Var.k.clear();
                        h3Var.j.clear();
                        h3Var.l.clear();
                        h3Var.h();
                        break;
                    default:
                        h3 h3Var2 = this.b.d;
                        h3Var2.k.clear();
                        h3Var2.j.clear();
                        h3Var2.l.clear();
                        h3Var2.h();
                        break;
                }
            }
        }, this.resourceProvider);
        this.x = dg0Var;
        this.y = false;
        dg0Var.setAlpha(0.0f);
        this.x.setScaleX(0.95f);
        this.x.setScaleY(0.95f);
        this.x.setVisibility(8);
        w8Var.addView(this.x, b6.d(-1, -1.0f, zs.E1, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.D = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.D.addView(this.E);
        this.D.setBackgroundColor(w9);
        this.D.setClipChildren(false);
        w8Var.addView(this.D, b6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        a7.i(t6.d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, b6.a(-1.0f, 2.0f / org.telegram.messenger.i0.p, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final ep epVar = new ep(24, context, this.resourceProvider);
        epVar.b(t6.h7, t6.j7, t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        epVar.setTranslationX(org.telegram.messenger.i0.L(4.0f));
        epVar.setScaleX(0.8f);
        epVar.setScaleY(0.8f);
        linearLayout2.addView(epVar, b6.r(26, 26, 16));
        TextView textView = new TextView(context);
        a7.V(textView, t6.j5, this.resourceProvider);
        sc.e.u(textView, 1, 14.0f, null, 2131749622);
        linearLayout2.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.i0.L(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = t6.Ci;
        int w10 = t6.w(themedColor, t6.r1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(t6.k0(L, L, L, L, 0, w10, w10));
        this.N = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        View view2 = this.s;
        vg.f c10 = this.P.c(view2, null, false);
        c10.o(b9.l(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        view2.setBackground(c10);
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ph.s2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i14 = i11;
                final ep epVar2 = epVar;
                final r3 r3Var = this.b;
                final int i15 = 1;
                switch (i14) {
                    case 0:
                        h3 h3Var = r3Var.d;
                        if (h3Var != null) {
                            boolean z10 = !h3Var.r;
                            h3Var.r = z10;
                            epVar2.a(z10, true);
                            h3Var.h();
                            break;
                        }
                        break;
                    default:
                        h3 h3Var2 = r3Var.d;
                        if (r3Var.K) {
                            z60 H = z60.H(r3Var, r3Var.F);
                            final int i16 = 0;
                            H.c(R.drawable.menu_sort_value, cd.L0(2131746156, null), new o2(r3Var, 3), false);
                            H.c(R.drawable.menu_sort_date, cd.L0(2131746160, null), new o2(r3Var, 4), false);
                            H.c(R.drawable.menu_sort_number, cd.L0(2131746158, null), new o2(r3Var, 5), false);
                            H.k();
                            H.i(new Runnable() { // from class: ph.p2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.r) {
                                                h3Var3.r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.r) {
                                                h3Var4.r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, cd.L0(2131749624, null), !h3Var2.r);
                            H.i(new Runnable() { // from class: ph.p2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.r) {
                                                h3Var3.r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.r) {
                                                h3Var4.r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, cd.L0(2131749623, null), h3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(linearLayout2, b6.c(-1.0f, -2));
        e6.b(this.s, 0.04f, 1.5f);
        w8Var.addView(this.s, b6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.n / org.telegram.messenger.i0.p));
        rh.e6 y3 = rh.e6.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        View view3 = this.r;
        vg.f c11 = this.P.c(view3, null, false);
        c11.o(b9.l(this.resourceProvider));
        c11.p(org.telegram.messenger.i0.L(8.0f));
        c11.q(org.telegram.messenger.i0.L(22.0f));
        view3.setBackground(c11);
        w8Var.addView(this.r, b6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.n / org.telegram.messenger.i0.p));
        this.w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new dq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131750023, null));
        this.w.setText(spannableStringBuilder);
        a7.V(this.w, i13, getResourceProvider());
        this.w.setTypeface(org.telegram.messenger.i0.o());
        this.w.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        TextView textView2 = this.w;
        int L2 = org.telegram.messenger.i0.L(22.0f);
        int w11 = t6.w(getThemedColor(i10), t6.r1(0.1f, getThemedColor(i13)));
        textView2.setBackground(t6.k0(L2, L2, L2, L2, 0, w11, w11));
        this.w.setGravity(17);
        final int i14 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: ph.r2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i14) {
                    case 0:
                        h3 h3Var = this.b.d;
                        h3Var.k.clear();
                        h3Var.j.clear();
                        h3Var.l.clear();
                        h3Var.h();
                        break;
                    default:
                        h3 h3Var2 = this.b.d;
                        h3Var2.k.clear();
                        h3Var2.j.clear();
                        h3Var2.l.clear();
                        h3Var2.h();
                        break;
                }
            }
        });
        this.r.addView(this.w, b6.c(-1.0f, -2));
        this.r.setVisibility(8);
        e6.b(this.r, 0.05f, 1.5f);
        z2 z2Var = new z2(context, this.resourceProvider);
        this.F = z2Var;
        z2Var.setSorting(this.d.p);
        this.E.addView(this.F, b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i15 = 1;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: ph.s2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                int i142 = i15;
                final ep epVar2 = epVar;
                final r3 r3Var = this.b;
                final int i152 = 1;
                switch (i142) {
                    case 0:
                        h3 h3Var = r3Var.d;
                        if (h3Var != null) {
                            boolean z10 = !h3Var.r;
                            h3Var.r = z10;
                            epVar2.a(z10, true);
                            h3Var.h();
                            break;
                        }
                        break;
                    default:
                        h3 h3Var2 = r3Var.d;
                        if (r3Var.K) {
                            z60 H = z60.H(r3Var, r3Var.F);
                            final int i16 = 0;
                            H.c(R.drawable.menu_sort_value, cd.L0(2131746156, null), new o2(r3Var, 3), false);
                            H.c(R.drawable.menu_sort_date, cd.L0(2131746160, null), new o2(r3Var, 4), false);
                            H.c(R.drawable.menu_sort_number, cd.L0(2131746158, null), new o2(r3Var, 5), false);
                            H.k();
                            H.i(new Runnable() { // from class: ph.p2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.r) {
                                                h3Var3.r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.r) {
                                                h3Var4.r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, cd.L0(2131749624, null), !h3Var2.r);
                            H.i(new Runnable() { // from class: ph.p2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i152) {
                                        case 0:
                                            h3 h3Var3 = r3Var.d;
                                            if (h3Var3.r) {
                                                h3Var3.r = false;
                                                epVar2.a(false, true);
                                                h3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            h3 h3Var4 = r3Var.d;
                                            if (!h3Var4.r) {
                                                h3Var4.r = true;
                                                epVar2.a(true, true);
                                                h3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, cd.L0(2131749623, null), h3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            H.Z();
                            break;
                        }
                        break;
                }
            }
        });
        z2 z2Var2 = new z2(context, this.resourceProvider);
        this.G = z2Var2;
        z2Var2.setValue(cd.L0(2131750396, null));
        this.E.addView(this.G, b6.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: ph.k2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i11) {
                    case 0:
                        r3.a0(this.b, context);
                        break;
                    case 1:
                        r3.b0(this.b, context);
                        break;
                    default:
                        r3.Z(this.b, context);
                        break;
                }
            }
        });
        z2 z2Var3 = new z2(context, this.resourceProvider);
        this.H = z2Var3;
        z2Var3.setValue(cd.L0(2131750397, null));
        this.E.addView(this.H, b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i16 = 1;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: ph.k2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i16) {
                    case 0:
                        r3.a0(this.b, context);
                        break;
                    case 1:
                        r3.b0(this.b, context);
                        break;
                    default:
                        r3.Z(this.b, context);
                        break;
                }
            }
        });
        z2 z2Var4 = new z2(context, this.resourceProvider);
        this.I = z2Var4;
        z2Var4.setValue(cd.L0(2131750389, null));
        this.E.addView(this.I, b6.t(-2, -2, 16, 0, 0, 0, 0));
        final int i17 = 2;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: ph.k2
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i17) {
                    case 0:
                        r3.a0(this.b, context);
                        break;
                    case 1:
                        r3.b0(this.b, context);
                        break;
                    default:
                        r3.Z(this.b, context);
                        break;
                }
            }
        });
        xz xzVar = new xz(getParentActivity());
        this.J = xzVar;
        w8Var.addView(xzVar, b6.c(-1.0f, -1));
        h0(false, false);
        return w8Var;
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.K == z10) {
            return;
        }
        this.K = z10;
        if (!z11) {
            this.D.setVisibility(z10 ? 0 : 8);
            this.D.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(45.0f));
            this.D.setAlpha(z10 ? 1.0f : 0.0f);
            this.h.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(45.0f));
            this.n.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(39.0f));
            return;
        }
        this.D.setVisibility(0);
        ViewPropertyAnimator alpha = this.D.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(45.0f)).alpha(z10 ? 1.0f : 0.0f);
        gr grVar = gr.h;
        alpha.setInterpolator(grVar).setDuration(420L).setListener(new t2(this, z10, 0)).start();
        this.h.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(45.0f)).setInterpolator(grVar).setDuration(420L).start();
        this.n.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(39.0f)).setInterpolator(grVar).setDuration(420L).start();
    }

    public final void i0(boolean z10) {
        p51 p51Var;
        h3 h3Var = this.d;
        int i10 = h3Var.e;
        HashSet hashSet = h3Var.l;
        ArrayList arrayList = h3Var.h;
        HashSet hashSet2 = h3Var.k;
        ArrayList arrayList2 = h3Var.g;
        HashSet hashSet3 = h3Var.j;
        ArrayList arrayList3 = h3Var.f;
        if (i10 > 12) {
            h0(true, true);
        }
        ny nyVar = this.n;
        boolean z11 = false;
        if (nyVar != null && (p51Var = nyVar.f3) != null) {
            p51Var.O(true);
            if (z10) {
                this.n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = h3Var.e;
            lVar2.setSubtitle(i11 <= 0 ? cd.L0(2131750016, null) : cd.H(',', "Gift2ListingsCount", i11));
        }
        z2 z2Var = this.F;
        if (z2Var != null) {
            z2Var.setSorting(h3Var.p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.G.setValue((size <= 0 || size == arrayList3.size()) ? cd.L0(2131750032, null) : cd.H(',', "Gift2ResaleFilterModels", size));
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? cd.L0(2131750036, null) : cd.H(',', "Gift2ResaleFilterBackdrops", size2));
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? cd.L0(2131750028, null) : cd.H(',', "Gift2ResaleFilterSymbols", size3));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.n.getChildCount()) {
                break;
            }
            if (this.n.getChildAt(i12) instanceof zz) {
                h3Var.g(false);
                break;
            }
            i12++;
        }
        if ((h3Var.t || h3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.a.a(z11, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = t6.x0(null, t6.d6, false);
            if (this.actionBar.u()) {
                x02 = t6.x0(null, t6.w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            hi.c cVar = this.O;
            int i10 = t6.d6;
            cVar.a(getThemedColor(i10));
            int w9 = t6.w(getThemedColor(i10), t6.r1(0.1f, getThemedColor(t6.Ci)));
            if (w9 != this.M) {
                this.M = w9;
                TextView textView = this.w;
                if (textView != null) {
                    t6.H1(textView.getBackground(), w9, true);
                }
                LinearLayout linearLayout = this.N;
                if (linearLayout != null) {
                    t6.H1(linearLayout.getBackground(), w9, true);
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            int w10 = t6.w(t6.w0(t6.d6, this.resourceProvider), t6.r1(0.04f, t6.w0(t6.G6, this.resourceProvider)));
            int i11 = this.L;
            if (w10 != i11) {
                HorizontalScrollView horizontalScrollView = this.D;
                boolean z10 = false;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i11) {
                    this.D.setBackgroundColor(w10);
                }
                View view = this.fragmentView;
                int i12 = this.L;
                if (view != null && (view.getBackground() instanceof ColorDrawable) && ((ColorDrawable) view.getBackground()).getColor() == i12) {
                    z10 = true;
                }
                if (z10) {
                    this.fragmentView.setBackgroundColor(w10);
                }
                this.L = w10;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            this.s.setTranslationY((-org.telegram.messenger.i0.L(52.0f)) * f7);
            f10.d(this.r, f7);
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
