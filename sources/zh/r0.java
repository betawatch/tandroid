package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.bt;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class r0 extends db {
    public static final /* synthetic */ int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final bi.i7[] Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final com.google.android.gms.common.api.internal.r e0;
    public final com.google.android.gms.common.api.internal.r f0;
    public final com.google.android.gms.common.api.internal.r g0;
    public final zz h0;
    public final k0 i0;
    public final q0 j0;
    public m0 k0;
    public final FrameLayout l0;
    public final ImageView m0;
    public final ImageView n0;
    public final l0 o0;
    public final TextView p0;
    public final View q0;
    public final bh.l r0;
    public final bh.f s0;
    public final gh.d t0;
    public final bh.b u0;
    public n0 v0;
    public final boolean w0;
    public boolean x0;
    public final RectF y0;
    public final PointF z0;

    /* JADX WARN: Type inference failed for: r4v18, types: [zh.j0] */
    public r0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, c6Var);
        this.C0 = 1;
        RectF rectF = new RectF();
        this.y0 = rectF;
        this.z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.w0 = z10;
        mm0 mm0Var = this.d;
        org.telegram.ui.ActionBar.c3 c3Var = this.container;
        Objects.requireNonNull(mm0Var);
        this.r0 = new bh.l(mm0Var, c3Var, new bt(mm0Var, 0));
        ArrayList c10 = ag.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.e0 = rVar;
        rVar.b = false;
        ArrayList c11 = ag.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f0 = rVar2;
        rVar2.b = false;
        this.c0 = ag.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.d0 = arrayList3;
        if (z10) {
            int i11 = 0;
            while (i11 < this.c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.c0.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.d0.add(stargiftattributemodel);
                    this.c0.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList3.clear();
        }
        List.-EL.sort(this.a0, Comparator$-CC.comparingDouble(new l81(4)));
        List.-EL.sort(this.b0, Comparator$-CC.comparingDouble(new l81(5)));
        List.-EL.sort(this.c0, Comparator$-CC.comparingDouble(new l81(6)));
        List.-EL.sort(this.d0, Comparator$-CC.comparingDouble(new l81(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.c0);
        this.g0 = rVar3;
        rVar3.b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i12 = org.telegram.ui.ActionBar.g6.i5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.g6.h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i13)));
        fixNavigationBar();
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i12), getThemedColor(i13)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.s0 = null;
            this.t0 = null;
            this.u0 = new bh.b(cVar);
        } else {
            this.s0 = new bh.f(false);
            gh.d dVar = new gh.d(cVar);
            this.t0 = dVar;
            final int i14 = 0;
            dVar.v = new Runnable(this) { // from class: zh.j0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                r0 r0Var = this.b;
                                if (r0Var.s0 != null) {
                                    r0Var.R(2);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.b.onBackPressed();
                            break;
                    }
                }
            };
            bh.b bVar = new bh.b(dVar);
            this.u0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
        }
        ih.j jVar = new ih.j(this.container);
        bh.b bVar2 = this.u0;
        org.telegram.ui.ActionBar.c3 c3Var2 = this.container;
        bVar2.f = jVar;
        bVar2.g = c3Var2;
        zz zzVar = new zz(3, false);
        this.h0 = zzVar;
        zzVar.O = new di.w1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(zzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new kc0(this, 22));
        k0 k0Var = new k0();
        this.i0 = k0Var;
        k0Var.C = false;
        k0Var.m = false;
        k0Var.n(280L);
        k0Var.o(es.h);
        k0Var.D = 30L;
        this.d.setItemAnimator(k0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i15 = 1;
        l0 l0Var = new l0(this, context, c6Var, new Runnable(this) { // from class: zh.j0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            r0 r0Var = this.b;
                            if (r0Var.s0 != null) {
                                r0Var.R(2);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        }, new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28));
        this.o0 = l0Var;
        l0Var.d(new f4.d(1, 1));
        l0Var.setPreviewingAttributes(arrayList);
        l0Var.removeView(l0Var.O);
        int i16 = -1;
        frameLayout.addView(l0Var, w7.a6.d(-1.0f, -1));
        int i17 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i17, 0, i17, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ji.o4(this, 22));
        w7.c6.a(imageView);
        frameLayout.addView(imageView, w7.a6.a(32.0f, 12.0f, 14.0f, 0.0f, 0.0f, 32, 51));
        ImageView imageView2 = new ImageView(context);
        this.n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new yh.a(8, this, arrayList));
        w7.c6.a(imageView2);
        frameLayout.addView(imageView2, w7.a6.a(32.0f, 0.0f, 14.0f, 12.0f, 0.0f, 32, 53));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i18 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 102.0f, -1, 87), context);
        this.p0 = h;
        float f7 = 13.0f;
        h.setTextSize(1, 13.0f);
        h.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        h.setGravity(17);
        int i19 = -1879048193;
        h.setTextColor(-1879048193);
        frameLayout.addView(h, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 82.0f, -1, 87));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new bi.i7[3];
        this.j0 = new q0(context, c6Var, new ji.p1(this, 25));
        int i20 = 0;
        while (true) {
            bi.i7[] i7VarArr = this.Z;
            if (i20 >= i7VarArr.length) {
                this.l0.addView(this.Y, w7.a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 18.0f, -1, 87));
                this.containerView.addView(this.l0, w7.a6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.i5), getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                View view = new View(context);
                this.q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.a6.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.u0.c(this.j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new eh.b(org.telegram.ui.ActionBar.g6.d6, c6Var));
                this.j0.setBackground(c12);
                this.containerView.addView(this.j0, w7.a6.a(64.0f, 0.0f, 0.0f, 0.0f, 5.0f, 268, 81));
                this.v0 = new n0((TL_stars.starGiftAttributeBackdrop) ag.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) ag.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) ag.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.k0.N(false);
                U(false);
                return;
            }
            float f10 = f7;
            bi.i7 i7Var = new bi.i7(context, 12);
            i7Var.setClipChildren(false);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
            i7Var.c = s6Var;
            s6Var.setTypeface(AndroidUtilities.bold());
            s6Var.setTextSize(AndroidUtilities.dp(f10));
            s6Var.setTextColor(i16);
            s6Var.setGravity(i18);
            i7Var.addView(s6Var, w7.a6.a(16.0f, 4.0f, 6.0f, 4.0f, 0.0f, -1, 49));
            TextView textView2 = new TextView(context);
            i7Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i19);
            textView2.setGravity(i18);
            i7Var.addView(textView2, w7.a6.a(-2.0f, 4.0f, 20.0f, 4.0f, 0.0f, -1, 49));
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
            i7Var.d = s6Var2;
            s6Var2.setTypeface(AndroidUtilities.bold());
            s6Var2.setTextColor(i16);
            s6Var2.setGravity(5);
            s6Var2.getDrawable().T = true;
            s6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            s6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            s6Var2.setSizeableBackground(new f3(AndroidUtilities.dp(10.0f), 285212671));
            i7Var.addView(s6Var2, w7.a6.a(16.0f, 0.0f, -9.0f, -4.0f, 0.0f, -1, 53));
            i7VarArr[i20] = i7Var;
            if (i20 == 0) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i20 == 1) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i20 == 2) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            w7.c6.a(this.Z[i20]);
            this.Z[i20].setOnClickListener(new di.m4(this, i20, 27));
            this.Z[i20].setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.Y;
            bi.i7[] i7VarArr2 = this.Z;
            linearLayout2.addView(i7VarArr2[i20], w7.a6.p(0, 42, 1.0f, 7, 0, 0, i20 != i7VarArr2.length - 1 ? 11 : 0, 0));
            i20++;
            f7 = f10;
            i18 = 17;
            i16 = -1;
            i19 = -1879048193;
        }
    }

    public static double Q(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    @Override // org.telegram.ui.Components.db
    public final CharSequence A() {
        return null;
    }

    public final void R(int i10) {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.s0) == null) {
            return;
        }
        if (w7.m6.a(i10, 2)) {
            org.telegram.ui.ActionBar.c3 c3Var = this.container;
            q0 q0Var = this.j0;
            PointF pointF = this.z0;
            ih.j.b(q0Var, c3Var, pointF);
            float f7 = pointF.x;
            RectF rectF = this.y0;
            rectF.left = f7;
            rectF.top = pointF.y;
            rectF.right = f7 + q0Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + q0Var.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f10 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f10, f10);
            fVar.g(1, this.A0);
        }
        if (fVar.j == 0) {
            return;
        }
        fVar.e(this.r0, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean S(n0 n0Var) {
        if (this.C0 == 1) {
            return false;
        }
        int i10 = this.j0.r;
        n0 n0Var2 = this.v0;
        if (n0Var2 == null) {
            return false;
        }
        if (i10 == 1) {
            if (n0Var.a != n0Var2.a) {
                return false;
            }
        } else if (i10 == 2) {
            if (n0Var.b != n0Var2.b) {
                return false;
            }
        } else if (i10 != 0 || n0Var.c != n0Var2.c) {
            return false;
        }
        return true;
    }

    public final void T(int i10) {
        if (this.C0 == i10) {
            return;
        }
        this.C0 = i10;
        this.n0.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.p0.setText(LocaleController.getString(i10 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        V();
    }

    public final void U(boolean z10) {
        l0 l0Var = this.o0;
        if (l0Var.getUpgradeImageViewAttribute() == null || l0Var.getUpgradeBackdropAttribute() == null || l0Var.getUpgradePatternAttribute() == null) {
            return;
        }
        bi.i7[] i7VarArr = this.Z;
        ((org.telegram.ui.Components.s6) i7VarArr[0].c).c(l0Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.s6) i7VarArr[0].d).setText(r3.K1(l0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.s6) i7VarArr[1].c).c(l0Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.s6) i7VarArr[1].d).c(fi.l.H0(l0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.s6) i7VarArr[2].c).c(l0Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.s6) i7VarArr[2].d).c(fi.l.H0(l0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void V() {
        p0 p0Var;
        n0 n0Var;
        mm0 mm0Var = this.d;
        int childCount = mm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt instanceof p0) && (n0Var = (p0Var = (p0) childAt).v) != null) {
                boolean S = S(n0Var);
                p0Var.c.f(S, true);
                p0Var.r.a(S, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.l0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f10;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        bh.f fVar;
        gh.d dVar;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (fVar = this.s0) == null || (dVar = this.t0) == null || dVar.n || !dVar.f(width, height)) {
            return;
        }
        RecordingCanvas a2 = dVar.a(width, height);
        a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.g6.i5));
        fVar.b(a2, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.c();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.B0 != systemBottomInset) {
            this.B0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            q0 q0Var = this.j0;
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            q0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        R(2);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        m0 m0Var = new m0(this, this.d, getContext(), this.X, new ii.a(this, 24), this.resourcesProvider);
        this.k0 = m0Var;
        m0Var.r = false;
        return m0Var;
    }

    @Override // org.telegram.ui.Components.db
    public final mm0 y(Context context) {
        return new v60(this, context, this.resourcesProvider, 3);
    }
}
