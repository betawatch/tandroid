package zh;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k7;
import c8.ha;
import c8.ka;
import fi.h7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nx;
import org.telegram.ui.qt0;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class m3 extends org.telegram.ui.ActionBar.f2 implements te.b {
    public LinearLayout D;
    public u2 E;
    public u2 F;
    public u2 G;
    public u2 H;
    public jz I;
    public int J;
    public int K;
    public float L;
    public gh.e M;
    public final yb.b N;
    public boolean O;
    public ValueAnimator P;
    public int Q;
    public LinearLayout R;
    public final te.a a;
    public final long b;
    public final String c;
    public final c3 d;
    public c20 e;
    public nx f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public vq0 w;
    public boolean x;
    public HorizontalScrollView y;

    public m3(long j3, String str, long j10, h6 h6Var) {
        super(null);
        this.a = new te.a(0, this, wq.h, 380L, false);
        yb.b bVar = new yb.b();
        bVar.e = this;
        this.N = bVar;
        this.O = true;
        this.b = j3;
        this.c = str;
        this.resourceProvider = h6Var;
        c3 c3Var = new c3(this.currentAccount, j10, new e2(this, 0));
        this.d = c3Var;
        c3Var.g(false);
    }

    public static void Z(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (m3Var.O && !c3Var.g.isEmpty()) {
            k60 k60Var = new k60(m3Var, m3Var.G, false, false);
            k60Var.t = false;
            int i7 = 1;
            k60Var.Y = true;
            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            k60Var.R = true;
            k60Var.p = new li.h(k60Var, 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(c3Var.g);
            Collections.sort(arrayList, new i2(m3Var, i7));
            nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, i7), new k2(m3Var, k60Var, i7), null, 4);
            nxVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ys ysVar = new ys(context, m3Var.resourceProvider);
            ysVar.setTextSize(1, 16.0f);
            ysVar.setInputType(573441);
            ysVar.setRawInputType(573441);
            t6.D(ysVar, m6.A6, m3Var.resourceProvider);
            t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ysVar.setCursorWidth(1.5f);
            ysVar.setHint(id.M0(2131750009, null));
            t6.U(ysVar, m6.E8, m3Var.resourceProvider);
            ysVar.setBackground(null);
            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 13));
            if (arrayList.size() > 8) {
                k60Var.r(frameLayout, ha.o(-1, 44));
                k60Var.k();
            }
            if (!c3Var.k.isEmpty()) {
                k60Var.c(R.drawable.msg_select, id.M0(2131745670, null), new l2(m3Var, i7), false);
            }
            k60Var.q(nxVar);
            m3Var.i0(m3Var.G, k60Var);
        }
    }

    public static void a0(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (m3Var.O && !c3Var.h.isEmpty()) {
            k60 k60Var = new k60(m3Var, m3Var.H, false, false);
            k60Var.t = false;
            k60Var.Y = true;
            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            k60Var.R = true;
            int i7 = 5;
            k60Var.p = new li.h(k60Var, i7);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(c3Var.h);
            int i10 = 2;
            Collections.sort(arrayList, new i2(m3Var, i10));
            nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, i10), new k2(m3Var, k60Var, i10), null, 5);
            nxVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ys ysVar = new ys(context, m3Var.resourceProvider);
            ysVar.setTextSize(1, 16.0f);
            ysVar.setInputType(573441);
            ysVar.setRawInputType(573441);
            t6.D(ysVar, m6.A6, m3Var.resourceProvider);
            t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ysVar.setCursorWidth(1.5f);
            ysVar.setHint(id.M0(2131750009, null));
            t6.U(ysVar, m6.E8, m3Var.resourceProvider);
            ysVar.setBackground(null);
            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 14));
            if (arrayList.size() > 8) {
                k60Var.r(frameLayout, ha.o(-1, 44));
                k60Var.k();
            }
            if (!c3Var.l.isEmpty()) {
                k60Var.c(R.drawable.msg_select, id.M0(2131745670, null), new l2(m3Var, i7), false);
            }
            k60Var.q(nxVar);
            m3Var.i0(m3Var.H, k60Var);
        }
    }

    public static void b0(m3 m3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        if (j3 == p10.i(m3Var.currentAccount).e()) {
            m3Var.d.d.remove(tL_starGiftUnique);
            m3Var.k0(false);
            if (j3 == p10.i(m3Var.currentAccount).e()) {
                gc a02 = gc.a0(m3Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = id.M0(2131752887, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                bc O = a02.O(document, M0, id.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
                O.r = false;
                O.j();
            } else {
                bc O2 = gc.a0(m3Var).O(tL_starGiftUnique.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(m3Var.currentAccount, j3)));
                O2.r = false;
                O2.j();
            }
            m3Var.I.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        o2 o2Var = new o2(bundle, tL_starGiftUnique, j3);
        r4 r4Var = m3Var.parentLayout;
        if (r4Var == null || !((ActionBarLayout) r4Var).b) {
            m3Var.presentFragment(o2Var, true, z9);
        } else {
            Dialog dialog = m3Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z9) {
                ((org.telegram.ui.ActionBar.w2) dialog).N0 = true;
            }
            m3Var.finishFragment();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(o2Var, false, z9);
            }
        }
        c20 c20Var = m3Var.e;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(z9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(m3 m3Var, Context context) {
        c3 c3Var = m3Var.d;
        if (m3Var.O && !c3Var.f.isEmpty()) {
            Object[] objArr = 0;
            k60 k60Var = new k60(m3Var, m3Var.F, false, false);
            k60Var.t = false;
            k60Var.Y = true;
            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
            k60Var.R = true;
            k60Var.p = new li.h(k60Var, 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(c3Var.f);
            Collections.sort(arrayList, new i2(m3Var, 0));
            nx nxVar = new nx(m3Var, new j2(m3Var, strArr, arrayList, 0 == true ? 1 : 0), new k2(m3Var, k60Var, 0 == true ? 1 : 0), null, 3);
            nxVar.f3.r = false;
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            t6.s(imageView, m6.F8, m3Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            ys ysVar = new ys(context, m3Var.resourceProvider);
            ysVar.setTextSize(1, 16.0f);
            ysVar.setInputType(573441);
            ysVar.setRawInputType(573441);
            t6.D(ysVar, m6.A6, m3Var.resourceProvider);
            t6.l(ysVar, 30, m6.G6, m3Var.resourceProvider);
            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
            ysVar.setCursorWidth(1.5f);
            ysVar.setHint(id.M0(2131750009, null));
            t6.U(ysVar, m6.E8, m3Var.resourceProvider);
            ysVar.setBackground(null);
            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            ysVar.addTextChangedListener(new h7(strArr, nxVar, 0 == true ? 1 : 0, 12));
            if (arrayList.size() > 8) {
                k60Var.r(frameLayout, ha.o(-1, 44));
                k60Var.k();
            }
            if (!c3Var.j.isEmpty()) {
                k60Var.c(R.drawable.msg_select, id.M0(2131745670, null), new l2(m3Var, objArr == true ? 1 : 0), false);
            }
            k60Var.q(nxVar);
            m3Var.i0(m3Var.F, k60Var);
        }
    }

    public static void e0(m3 m3Var, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k7 k7Var = new k7(m3Var.getParentActivity(), m3Var.currentAccount, m3Var.b, m3Var.resourceProvider, null);
            k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, m3Var.d);
            k7Var.M2 = new n2(m3Var);
            m3Var.showDialog(k7Var);
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            p00.d(this.n, f10);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [zh.f2] */
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 24));
        this.simpleActionBar.setTitle(this.c);
        z4 z4Var = this.simpleActionBar;
        c3 c3Var = this.d;
        if (z4Var != null) {
            int i7 = c3Var.e;
            z4Var.setSubtitle(i7 <= 0 ? id.M0(2131750007, null) : id.H(',', "Gift2ListingsCount", i7));
        }
        st0 st0Var = new st0(context, null);
        t6.h(m6.a7, st0Var, getResourceProvider());
        this.fragmentView = st0Var;
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        nx nxVar = new nx(this, new p0(this, 2), new n2(this), new z3.j(this), 2);
        this.f = nxVar;
        final int i10 = 0;
        nxVar.f3.r = false;
        nxVar.setSpanCount(3);
        final int i11 = 1;
        this.f.j(new yh.f(this, i11));
        st0Var.addView(this.f, ha.e(-1, -1, qs.E1));
        vq0 vq0Var = new vq0(context, new View.OnClickListener(this) { // from class: zh.f2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c3 c3Var2 = this.b.d;
                        c3Var2.k.clear();
                        c3Var2.j.clear();
                        c3Var2.l.clear();
                        c3Var2.h();
                        break;
                    default:
                        c3 c3Var3 = this.b.d;
                        c3Var3.k.clear();
                        c3Var3.j.clear();
                        c3Var3.l.clear();
                        c3Var3.h();
                        break;
                }
            }
        }, this.resourceProvider);
        this.w = vq0Var;
        this.x = false;
        vq0Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        st0Var.addView(this.w, ha.e(-1, -1, qs.E1));
        View view = new View(context);
        this.h = view;
        st0Var.addView(view, ha.e(-1, 0, 48));
        baseSimpleGlass.f(st0Var, this.f, this.simpleActionBar, this.resourceProvider);
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        r2 r2Var = new r2(this.currentAccount, context, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.c;
        fh.g c10 = cVar.c(r2Var, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        r2Var.setBackground(c10);
        ka.a(r2Var);
        r2Var.setOnClickListener(new wg.a1(6, this, r2Var));
        r2Var.setOnWidthChanged(new e2(this, i11));
        this.simpleActionBar.addView(r2Var, ha.e(-2, 58, 5));
        this.M = c8.g0.l(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(0);
        this.D.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.setOverScrollMode(2);
        this.y.addView(this.D);
        this.y.setClipChildren(false);
        st0Var.addView(this.y, ha.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wo woVar = new wo(24, context, this.resourceProvider);
        woVar.b(m6.h7, m6.j7, m6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        woVar.setScaleX(0.8f);
        woVar.setScaleY(0.8f);
        linearLayout2.addView(woVar, ha.r(26, 26, 16));
        TextView textView = new TextView(context);
        t6.U(textView, m6.G6, this.resourceProvider);
        jg.g.v(textView, 1, 14.0f, null, 2131749613);
        linearLayout2.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = m6.Ci;
        int r12 = m6.r1(0.1f, getThemedColor(i12));
        linearLayout2.setBackground(m6.k0(L, L, L, L, 0, r12, r12));
        this.R = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.g0.l(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: zh.g2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i13 = i11;
                final wo woVar2 = woVar;
                final m3 m3Var = this.b;
                final int i14 = 1;
                switch (i13) {
                    case 0:
                        c3 c3Var2 = m3Var.d;
                        if (m3Var.O) {
                            k60 H = k60.H(m3Var, m3Var.E);
                            final int i15 = 0;
                            H.c(R.drawable.menu_sort_value, id.M0(2131746139, null), new l2(m3Var, 2), false);
                            H.c(R.drawable.menu_sort_date, id.M0(2131746143, null), new l2(m3Var, 3), false);
                            H.c(R.drawable.menu_sort_number, id.M0(2131746141, null), new l2(m3Var, 4), false);
                            H.k();
                            H.i(new Runnable() { // from class: zh.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.r) {
                                                c3Var3.r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.r) {
                                                c3Var4.r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, id.M0(2131749615, null), !c3Var2.r);
                            H.i(new Runnable() { // from class: zh.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.r) {
                                                c3Var3.r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.r) {
                                                c3Var4.r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, id.M0(2131749614, null), c3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m3Var.i0(m3Var.E, H);
                            break;
                        }
                        break;
                    default:
                        c3 c3Var3 = m3Var.d;
                        if (c3Var3 != null) {
                            boolean z9 = !c3Var3.r;
                            c3Var3.r = z9;
                            woVar2.a(z9, true);
                            c3Var3.h();
                            break;
                        }
                        break;
                }
            }
        });
        this.r.addView(linearLayout2, ha.c(-1.0f, -2));
        ka.b(this.r, 0.04f, 1.5f);
        st0Var.addView(this.r, ha.e(-2, 56, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.g0.l(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        st0Var.addView(this.n, ha.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wp(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131750014, null));
        this.s.setText(spannableStringBuilder);
        t6.U(this.s, i12, getResourceProvider());
        this.s.setTypeface(org.telegram.messenger.g0.o());
        this.s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = m6.r1(0.1f, getThemedColor(i12));
        textView2.setBackground(m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: zh.f2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i10) {
                    case 0:
                        c3 c3Var2 = this.b.d;
                        c3Var2.k.clear();
                        c3Var2.j.clear();
                        c3Var2.l.clear();
                        c3Var2.h();
                        break;
                    default:
                        c3 c3Var3 = this.b.d;
                        c3Var3.k.clear();
                        c3Var3.j.clear();
                        c3Var3.l.clear();
                        c3Var3.h();
                        break;
                }
            }
        });
        this.n.addView(this.s, ha.c(-1.0f, -2));
        this.n.setVisibility(8);
        ka.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        u2 u2Var = new u2(context, this.resourceProvider, true);
        this.E = u2Var;
        u2Var.setSorting(c3Var.p);
        g0(this.E, false);
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: zh.g2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view42) {
                int i13 = i10;
                final wo woVar2 = woVar;
                final m3 m3Var = this.b;
                final int i14 = 1;
                switch (i13) {
                    case 0:
                        c3 c3Var2 = m3Var.d;
                        if (m3Var.O) {
                            k60 H = k60.H(m3Var, m3Var.E);
                            final int i15 = 0;
                            H.c(R.drawable.menu_sort_value, id.M0(2131746139, null), new l2(m3Var, 2), false);
                            H.c(R.drawable.menu_sort_date, id.M0(2131746143, null), new l2(m3Var, 3), false);
                            H.c(R.drawable.menu_sort_number, id.M0(2131746141, null), new l2(m3Var, 4), false);
                            H.k();
                            H.i(new Runnable() { // from class: zh.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.r) {
                                                c3Var3.r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.r) {
                                                c3Var4.r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, id.M0(2131749615, null), !c3Var2.r);
                            H.i(new Runnable() { // from class: zh.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            c3 c3Var3 = m3Var.d;
                                            if (c3Var3.r) {
                                                c3Var3.r = false;
                                                woVar2.a(false, true);
                                                c3Var3.h();
                                                break;
                                            }
                                            break;
                                        default:
                                            c3 c3Var4 = m3Var.d;
                                            if (!c3Var4.r) {
                                                c3Var4.r = true;
                                                woVar2.a(true, true);
                                                c3Var4.h();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, id.M0(2131749614, null), c3Var2.r);
                            H.t = false;
                            H.Y = true;
                            H.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m3Var.i0(m3Var.E, H);
                            break;
                        }
                        break;
                    default:
                        c3 c3Var3 = m3Var.d;
                        if (c3Var3 != null) {
                            boolean z9 = !c3Var3.r;
                            c3Var3.r = z9;
                            woVar2.a(z9, true);
                            c3Var3.h();
                            break;
                        }
                        break;
                }
            }
        });
        u2 u2Var2 = new u2(context, this.resourceProvider, true);
        this.F = u2Var2;
        u2Var2.setValue(id.M0(2131750387, null));
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i10) {
                    case 0:
                        m3.d0(this.b, context);
                        break;
                    case 1:
                        m3.Z(this.b, context);
                        break;
                    default:
                        m3.a0(this.b, context);
                        break;
                }
            }
        });
        u2 u2Var3 = new u2(context, this.resourceProvider, true);
        this.G = u2Var3;
        u2Var3.setValue(id.M0(2131750388, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i11) {
                    case 0:
                        m3.d0(this.b, context);
                        break;
                    case 1:
                        m3.Z(this.b, context);
                        break;
                    default:
                        m3.a0(this.b, context);
                        break;
                }
            }
        });
        u2 u2Var4 = new u2(context, this.resourceProvider, true);
        this.H = u2Var4;
        u2Var4.setValue(id.M0(2131750380, null));
        g0(this.H, true);
        final int i13 = 2;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: zh.h2
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                switch (i13) {
                    case 0:
                        m3.d0(this.b, context);
                        break;
                    case 1:
                        m3.Z(this.b, context);
                        break;
                    default:
                        m3.a0(this.b, context);
                        break;
                }
            }
        });
        jz jzVar = new jz(getParentActivity());
        this.I = jzVar;
        st0Var.addView(jzVar, ha.c(-1.0f, -1));
        h0(false, false);
        return st0Var;
    }

    public final void g0(u2 u2Var, boolean z9) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        fh.g c10 = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c10.p(this.M);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(u2Var, ha.c(40.0f, -2));
        frameLayout.setOnClickListener(new a(u2Var, 3));
        ka.a(frameLayout);
        this.D.addView(frameLayout, ha.t(-2, -2, 16, 0, 0, z9 ? 0 : -4, 0));
    }

    public final void h0(boolean z9, boolean z10) {
        if (this.O == z9) {
            return;
        }
        this.O = z9;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        float f10 = z9 ? 0.0f : 1.0f;
        if (!z10) {
            this.L = f10;
            j0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f10);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new ti.d(this, 6));
        this.P.setInterpolator(wq.h);
        this.P.setDuration(420L);
        this.P.start();
    }

    public final void i0(u2 u2Var, k60 k60Var) {
        FrameLayout frameLayout;
        j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay == null || !(k60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) || !(u2Var.getParent() instanceof FrameLayout)) {
            k60Var.Z();
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) k60Var.A;
        FrameLayout frameLayout2 = (FrameLayout) u2Var.getParent();
        yb.b bVar = this.N;
        if (bVar.a && (frameLayout = (FrameLayout) bVar.b) != null && frameLayout != frameLayout2) {
            frameLayout.setVisibility(0);
        }
        bVar.b = frameLayout2;
        bVar.c = u2Var;
        bVar.d = simpleMenuOverlay;
        k60Var.p = new org.telegram.ui.ActionBar.k2(simpleMenuOverlay, 2);
        simpleMenuOverlay.setOnClosed(new di.u3(actionBarPopupWindow$ActionBarPopupWindowLayout, 1));
        simpleMenuOverlay.d(bVar, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return (getLastStoryViewer() == null || getLastStoryViewer().G0) && i0.a.h(getThemedColor(m6.a7)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.y == null) {
            return;
        }
        float f10 = this.L;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.y.setTranslationY((oi.a.d(this.J) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.y.setAlpha(1.0f - f10);
        this.y.setVisibility(f10 >= 1.0f ? 8 : 0);
        float f11 = -L;
        this.f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void k0(boolean z9) {
        m41 m41Var;
        c3 c3Var = this.d;
        int i7 = c3Var.e;
        HashSet hashSet = c3Var.l;
        ArrayList arrayList = c3Var.h;
        HashSet hashSet2 = c3Var.k;
        ArrayList arrayList2 = c3Var.g;
        HashSet hashSet3 = c3Var.j;
        ArrayList arrayList3 = c3Var.f;
        if (i7 > 12) {
            h0(true, true);
        }
        nx nxVar = this.f;
        boolean z10 = false;
        if (nxVar != null && (m41Var = nxVar.f3) != null) {
            m41Var.O(true);
            if (z9) {
                this.f.v0(0);
            }
        }
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            int i10 = c3Var.e;
            z4Var.setSubtitle(i10 <= 0 ? id.M0(2131750007, null) : id.H(',', "Gift2ListingsCount", i10));
        }
        u2 u2Var = this.E;
        if (u2Var != null) {
            u2Var.setSorting(c3Var.p);
        }
        if (this.F != null) {
            int size = arrayList3.size() - hashSet3.size();
            this.F.setValue((size <= 0 || size == arrayList3.size()) ? id.M0(2131750023, null) : id.H(',', "Gift2ResaleFilterModels", size));
        }
        if (this.G != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            this.G.setValue((size2 <= 0 || size2 == arrayList2.size()) ? id.M0(2131750027, null) : id.H(',', "Gift2ResaleFilterBackdrops", size2));
        }
        if (this.H != null) {
            int size3 = arrayList.size() - hashSet.size();
            this.H.setValue((size3 <= 0 || size3 == arrayList.size()) ? id.M0(2131750019, null) : id.H(',', "Gift2ResaleFilterSymbols", size3));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f.getChildCount()) {
                break;
            }
            if (this.f.getChildAt(i11) instanceof lz) {
                c3Var.g(false);
                break;
            }
            i11++;
        }
        if ((c3Var.t || c3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.a.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.m);
        }
        this.J = i10;
        this.K = Math.max(i12, org.telegram.messenger.g0.n);
        if (this.f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + oi.a.d(this.J);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -oi.a.c(this.J);
        int i14 = (-oi.a.c(this.K)) - L2;
        org.telegram.messenger.g0.B3(this.f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.K) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.B3(this.w, 0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.J, 0, 0);
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.K;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = this.K;
        this.r.requestLayout();
        this.n.requestLayout();
        j0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = m6.r1(0.1f, getThemedColor(m6.Ci));
            if (r12 != this.Q) {
                this.Q = r12;
                TextView textView = this.s;
                if (textView != null) {
                    m6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.R;
                if (linearLayout != null) {
                    m6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
