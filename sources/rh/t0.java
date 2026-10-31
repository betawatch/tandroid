package rh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yy;
import org.telegram.ui.m50;
import org.telegram.ui.nb0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t0 extends ha {
    public static final /* synthetic */ int s2 = 0;
    public final int P1;
    public final LinearLayout Q1;
    public final jg.a3[] R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final com.google.android.gms.common.api.internal.r W1;
    public final com.google.android.gms.common.api.internal.r X1;
    public final com.google.android.gms.common.api.internal.r Y1;
    public final yy Z1;
    public final l0 a2;
    public final s0 b2;
    public n0 c2;
    public final FrameLayout d2;
    public final ImageView e2;
    public final ImageView f2;
    public final m0 g2;
    public final TextView h2;
    public final View i2;
    public final tg.f j2;
    public final tg.b k2;
    public o0 l2;
    public final boolean m2;
    public boolean n2;
    public final tg.j o2;
    public int p2;
    public int q2;
    public int r2;

    public t0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, p6Var);
        this.r2 = 1;
        this.P1 = i10;
        this.m2 = z10;
        ArrayList c10 = sf.d.c(TL_stars.starGiftAttributeBackdrop.class, arrayList);
        this.S1 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.W1 = rVar;
        rVar.b = false;
        ArrayList c11 = sf.d.c(TL_stars.starGiftAttributePattern.class, arrayList);
        this.T1 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.X1 = rVar2;
        rVar2.b = false;
        this.U1 = sf.d.c(TL_stars.starGiftAttributeModel.class, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.V1 = arrayList2;
        if (z10) {
            int i11 = 0;
            while (i11 < this.U1.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.U1.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.V1.add(stargiftattributemodel);
                    this.U1.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList2.clear();
        }
        List.-EL.sort(this.S1, Comparator$-CC.comparingDouble(new y61(4)));
        List.-EL.sort(this.T1, Comparator$-CC.comparingDouble(new y61(5)));
        List.-EL.sort(this.U1, Comparator$-CC.comparingDouble(new y61(6)));
        List.-EL.sort(this.V1, Comparator$-CC.comparingDouble(new y61(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.U1);
        this.Y1 = rVar3;
        rVar3.b = false;
        ViewParent parent = this.l1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.l1);
        }
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(6.0f);
        this.x = true;
        int d12 = d1();
        this.q2 = d12;
        v0(d12);
        O();
        hi.c d = this.X0.d(new k0(this));
        if (Build.VERSION.SDK_INT < 31 || !tz.f()) {
            this.j2 = null;
            this.k2 = new tg.b(d);
        } else {
            tg.f fVar = new tg.f(false);
            this.j2 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(d);
            fVar2.f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            tg.b bVar = new tg.b(fVar2);
            this.k2 = bVar;
            bVar.i = true;
            int L = sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.b = L;
            bVar.c = L;
        }
        this.k2.h = this.X0;
        yy yyVar = new yy(3, false);
        this.Z1 = yyVar;
        yyVar.O = new jg.h1(this, 15);
        this.k1.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(74.0f));
        this.k1.setClipToPadding(false);
        this.k1.setLayoutManager(yyVar);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.j(new bu0(this, 17));
        this.X0.b(this.k1);
        l0 l0Var = new l0();
        this.a2 = l0Var;
        l0Var.C = false;
        l0Var.m = false;
        l0Var.n(280L);
        l0Var.o(gr.h);
        l0Var.D = 30L;
        this.k1.setItemAnimator(l0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        frameLayout.setClipChildren(false);
        m0 m0Var = new m0(this, context, p6Var, new ph.x1(this, 13), new bh.c(23), new bh.c(23), new bh.c(23), new bh.c(23), new bh.c(23), new bh.c(23));
        this.g2 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.P);
        int i12 = -1;
        frameLayout.addView(m0Var, w7.b6.c(-1.0f, -1));
        int i13 = this.t0;
        frameLayout.setPadding(i13, 0, i13, 0);
        ImageView imageView = new ImageView(context);
        this.e2 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new s(this, 3));
        w7.e6.a(imageView);
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f2 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new rv0(27, this, arrayList));
        w7.e6.a(imageView2);
        frameLayout.addView(imageView2, w7.b6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i14 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.h2 = l4;
        sc.e.u(l4, 1, 13.0f, null, 2131750070);
        l4.setGravity(17);
        int i15 = -1879048193;
        l4.setTextColor(-1879048193);
        frameLayout.addView(l4, w7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.R1 = new jg.a3[3];
        this.b2 = new s0(context, p6Var, new ph.h1(this, 9));
        int i16 = 0;
        while (true) {
            jg.a3[] a3VarArr = this.R1;
            if (i16 >= a3VarArr.length) {
                this.d2.addView(this.Q1, w7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.b.addView(this.d2, w7.b6.e(-1, zs.m5, 55));
                int d13 = d1();
                View view = new View(context);
                this.i2 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.o(d13, zs.q2), d13 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.b6.e(-1, 0, 48);
                e.height = org.telegram.messenger.i0.m;
                this.b.addView(view, e);
                this.b2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                vg.f c12 = this.k2.c(this.b2, null, false);
                c12.p(org.telegram.messenger.i0.L(4.0f));
                c12.q(org.telegram.messenger.i0.L(28.0f));
                c12.o(new wg.b(org.telegram.ui.ActionBar.t6.d6, p6Var));
                this.b2.setBackground(c12);
                this.b.addView(this.b2, w7.b6.d(zs.r4, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.l2 = new o0((TL_stars.starGiftAttributeBackdrop) sf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) sf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) sf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.c2.O(false);
                h1(false);
                tk0 tk0Var = this.k1;
                ViewGroup viewGroup = this.b;
                Objects.requireNonNull(tk0Var);
                this.o2 = new tg.j(tk0Var, viewGroup, new m50(tk0Var, 0));
                this.X0.i(this.b);
                ei.r rVar4 = this.X0;
                rVar4.a = new k0(this);
                rVar4.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
                return;
            }
            jg.a3 a3Var = new jg.a3(context);
            a3Var.setClipChildren(false);
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, false, false);
            a3Var.d = f6Var;
            f6Var.setTypeface(org.telegram.messenger.i0.o());
            f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
            f6Var.setTextColor(i12);
            f6Var.setGravity(i14);
            a3Var.addView(f6Var, w7.b6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            a3Var.c = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i15);
            textView2.setGravity(i14);
            a3Var.addView(textView2, w7.b6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
            a3Var.b = f6Var2;
            f6Var2.setTypeface(org.telegram.messenger.i0.o());
            f6Var2.setTextColor(i12);
            f6Var2.setGravity(5);
            f6Var2.getDrawable().T = true;
            f6Var2.setTextSize(org.telegram.messenger.i0.L(11.0f));
            f6Var2.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.0f));
            f6Var2.setSizeableBackground(new o3(org.telegram.messenger.i0.L(10.0f), 285212671));
            a3Var.addView(f6Var2, w7.b6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            a3VarArr[i16] = a3Var;
            if (i16 == 0) {
                ((TextView) this.R1[i16].c).setText(cd.L0(2131749635, null));
            } else if (i16 == 1) {
                ((TextView) this.R1[i16].c).setText(cd.L0(2131749652, null));
            } else if (i16 == 2) {
                ((TextView) this.R1[i16].c).setText(cd.L0(2131749633, null));
            }
            w7.e6.a(this.R1[i16]);
            this.R1[i16].setOnClickListener(new bh.f(this, i16, 29));
            this.R1[i16].setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.Q1;
            jg.a3[] a3VarArr2 = this.R1;
            linearLayout2.addView(a3VarArr2[i16], w7.b6.q(0, 42, 1.0f, 7, 0, 0, i16 != a3VarArr2.length - 1 ? 11 : 0, 0));
            i16++;
            i12 = -1;
            i14 = 17;
            i15 = -1879048193;
        }
    }

    public static double e1(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        return starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon ? 0.04d : 0.0d;
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        n0 n0Var = new n0(this, this.k1, getContext(), this.P1, new qh.d(this, 5), this.I0);
        this.c2 = n0Var;
        n0Var.r = false;
        return n0Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 M0(Context context) {
        return new nb0(this, context, this.I0, 3);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean Y(float f7, float f10) {
        FrameLayout frameLayout = this.d2;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f10;
    }

    public final int d1() {
        return i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, this.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0));
    }

    public final boolean f1(o0 o0Var) {
        if (this.r2 == 1) {
            return false;
        }
        int i10 = this.b2.s;
        o0 o0Var2 = this.l2;
        if (o0Var2 == null) {
            return false;
        }
        if (i10 == 1) {
            if (o0Var.a != o0Var2.a) {
                return false;
            }
        } else if (i10 == 2) {
            if (o0Var.b != o0Var2.b) {
                return false;
            }
        } else if (i10 != 0 || o0Var.c != o0Var2.c) {
            return false;
        }
        return true;
    }

    public final void g1(int i10) {
        if (this.r2 == i10) {
            return;
        }
        this.r2 = i10;
        this.f2.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.h2.setText(cd.L0(i10 == 2 ? 2131750069 : 2131750070, null));
        i1();
    }

    public final void h1(boolean z10) {
        m0 m0Var = this.g2;
        if (m0Var.getUpgradeImageViewAttribute() == null || m0Var.getUpgradeBackdropAttribute() == null || m0Var.getUpgradePatternAttribute() == null) {
            return;
        }
        jg.a3[] a3VarArr = this.R1;
        ((org.telegram.ui.Components.f6) a3VarArr[0].d).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.f6) a3VarArr[0].b).setText(e4.G1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.f6) a3VarArr[1].d).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.f6) a3VarArr[1].b).c(xh.i.I0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.f6) a3VarArr[2].d).c(m0Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.f6) a3VarArr[2].b).c(xh.i.I0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void i1() {
        q0 q0Var;
        o0 o0Var;
        tk0 tk0Var = this.k1;
        int childCount = tk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tk0Var.getChildAt(i10);
            if ((childAt instanceof q0) && (o0Var = (q0Var = (q0) childAt).w) != null) {
                boolean f12 = f1(o0Var);
                q0Var.c.f(f12, true);
                q0Var.r.a(f12, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void p0() {
        WindowInsets windowInsets = this.h;
        int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
        if (this.p2 != systemWindowInsetBottom) {
            this.p2 = systemWindowInsetBottom;
            this.k1.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(74.0f) + systemWindowInsetBottom);
            s0 s0Var = this.b2;
            ((ViewGroup.MarginLayoutParams) s0Var.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(5.0f) + this.p2;
            s0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int d12 = d1();
            if (d12 != this.q2) {
                this.q2 = d12;
                v0(d12);
                View view = this.i2;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.b.o(d12, zs.q2), d12 & 16777215});
                }
            }
            s0 s0Var = this.b2;
            if (s0Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Kl;
                org.telegram.ui.ActionBar.p6 p6Var = s0Var.r;
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.09411765f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
                org.telegram.ui.ActionBar.t6.r1(0.1254902f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
                s0Var.e.setColor(r12);
                s0Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.X0.g();
    }
}
