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
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.r60;
import org.telegram.ui.xs;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s0 extends bb {
    public static final /* synthetic */ int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final bi.e7[] Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final com.google.android.gms.common.api.internal.r e0;
    public final com.google.android.gms.common.api.internal.r f0;
    public final com.google.android.gms.common.api.internal.r g0;
    public final nz h0;
    public final l0 i0;
    public final r0 j0;
    public n0 k0;
    public final FrameLayout l0;
    public final ImageView m0;
    public final ImageView n0;
    public final m0 o0;
    public final TextView p0;
    public final View q0;
    public final bh.l r0;
    public final bh.f s0;
    public final gh.d t0;
    public final bh.b u0;
    public o0 v0;
    public final boolean w0;
    public boolean x0;
    public final RectF y0;
    public final PointF z0;

    /* JADX WARN: Type inference failed for: r4v18, types: [zh.k0] */
    public s0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, f6Var);
        this.C0 = 1;
        RectF rectF = new RectF();
        this.y0 = rectF;
        this.z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.w0 = z10;
        ll0 ll0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(ll0Var);
        this.r0 = new bh.l(ll0Var, d3Var, new xs(ll0Var, 0));
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.e0 = rVar;
        rVar.b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f0 = rVar2;
        rVar2.b = false;
        this.c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
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
        List.-EL.sort(this.a0, Comparator$-CC.comparingDouble(new k71(4)));
        List.-EL.sort(this.b0, Comparator$-CC.comparingDouble(new k71(5)));
        List.-EL.sort(this.c0, Comparator$-CC.comparingDouble(new k71(6)));
        List.-EL.sort(this.d0, Comparator$-CC.comparingDouble(new k71(6)));
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
        int i12 = org.telegram.ui.ActionBar.j6.i5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.j6.h5;
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
            dVar.v = new Runnable(this) { // from class: zh.k0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                s0 s0Var = this.b;
                                if (s0Var.s0 != null) {
                                    s0Var.Q(2);
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
            bVar.f = LiteMode.isEnabled(262144);
        }
        ih.k kVar = new ih.k(this.container);
        bh.b bVar2 = this.u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        bVar2.d = kVar;
        bVar2.e = d3Var2;
        nz nzVar = new nz(3, false);
        this.h0 = nzVar;
        nzVar.O = new di.x1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new lb0(this, 19));
        l0 l0Var = new l0();
        this.i0 = l0Var;
        l0Var.C = false;
        l0Var.m = false;
        l0Var.n(280L);
        l0Var.o(pr.h);
        l0Var.D = 30L;
        this.d.setItemAnimator(l0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i15 = 1;
        m0 m0Var = new m0(this, context, f6Var, new Runnable(this) { // from class: zh.k0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            s0 s0Var = this.b;
                            if (s0Var.s0 != null) {
                                s0Var.Q(2);
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
        this.o0 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.O);
        int i16 = -1;
        frameLayout.addView(m0Var, w7.x5.c(-1.0f, -1));
        int i17 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i17, 0, i17, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ji.m4(this, 22));
        w7.z5.a(imageView);
        frameLayout.addView(imageView, w7.x5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new w(2, this, arrayList));
        w7.z5.a(imageView2);
        frameLayout.addView(imageView2, w7.x5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i18 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView, w7.x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.p0 = f7;
        f7.setTextSize(1, 13.0f);
        f7.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        f7.setGravity(17);
        int i19 = -1879048193;
        f7.setTextColor(-1879048193);
        frameLayout.addView(f7, w7.x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new bi.e7[3];
        this.j0 = new r0(context, f6Var, new org.telegram.ui.web.b1(this, 22));
        int i20 = 0;
        while (true) {
            bi.e7[] e7VarArr = this.Z;
            if (i20 >= e7VarArr.length) {
                this.l0.addView(this.Y, w7.x5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.l0, w7.x5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.i5), getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                View view = new View(context);
                this.q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, 0, 48);
                e7.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e7);
                this.j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.u0.c(this.j0, null, false);
                c12.o(AndroidUtilities.dp(4.0f));
                c12.p(AndroidUtilities.dp(28.0f));
                c12.n(new eh.b(org.telegram.ui.ActionBar.j6.d6, f6Var));
                this.j0.setBackground(c12);
                this.containerView.addView(this.j0, w7.x5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.v0 = new o0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.k0.N(false);
                T(false);
                return;
            }
            bi.e7 e7Var = new bi.e7(context);
            e7Var.setClipChildren(false);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
            e7Var.c = q6Var;
            q6Var.setTypeface(AndroidUtilities.bold());
            q6Var.setTextSize(AndroidUtilities.dp(13.0f));
            q6Var.setTextColor(i16);
            q6Var.setGravity(i18);
            e7Var.addView(q6Var, w7.x5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            e7Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i19);
            textView2.setGravity(i18);
            e7Var.addView(textView2, w7.x5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
            e7Var.d = q6Var2;
            q6Var2.setTypeface(AndroidUtilities.bold());
            q6Var2.setTextColor(i16);
            q6Var2.setGravity(5);
            q6Var2.getDrawable().N = true;
            q6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            q6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            q6Var2.setSizeableBackground(new k3(AndroidUtilities.dp(10.0f), 285212671));
            e7Var.addView(q6Var2, w7.x5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            e7VarArr[i20] = e7Var;
            if (i20 == 0) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i20 == 1) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i20 == 2) {
                ((TextView) this.Z[i20].b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            w7.z5.a(this.Z[i20]);
            this.Z[i20].setOnClickListener(new di.o4(this, i20, 26));
            this.Z[i20].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.Y;
            bi.e7[] e7VarArr2 = this.Z;
            linearLayout2.addView(e7VarArr2[i20], w7.x5.p(0, 42, 1.0f, 7, 0, 0, i20 != e7VarArr2.length - 1 ? 11 : 0, 0));
            i20++;
            i18 = 17;
            i16 = -1;
            i19 = -1879048193;
        }
    }

    public static double P(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void Q(int i10) {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.s0) == null) {
            return;
        }
        if (w7.b0.a(i10, 2)) {
            org.telegram.ui.ActionBar.d3 d3Var = this.container;
            r0 r0Var = this.j0;
            PointF pointF = this.z0;
            ih.k.b(r0Var, d3Var, pointF);
            float f7 = pointF.x;
            RectF rectF = this.y0;
            rectF.left = f7;
            rectF.top = pointF.y;
            rectF.right = f7 + r0Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + r0Var.getMeasuredHeight(), this.container.getMeasuredHeight());
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

    public final boolean R(o0 o0Var) {
        if (this.C0 == 1) {
            return false;
        }
        int i10 = this.j0.r;
        o0 o0Var2 = this.v0;
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

    public final void S(int i10) {
        if (this.C0 == i10) {
            return;
        }
        this.C0 = i10;
        this.n0.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.p0.setText(LocaleController.getString(i10 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        U();
    }

    public final void T(boolean z10) {
        m0 m0Var = this.o0;
        if (m0Var.getUpgradeImageViewAttribute() == null || m0Var.getUpgradeBackdropAttribute() == null || m0Var.getUpgradePatternAttribute() == null) {
            return;
        }
        bi.e7[] e7VarArr = this.Z;
        ((org.telegram.ui.Components.q6) e7VarArr[0].c).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) e7VarArr[0].d).setText(w3.J1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.q6) e7VarArr[1].c).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) e7VarArr[1].d).c(fi.m.G0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.q6) e7VarArr[2].c).c(m0Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) e7VarArr[2].d).c(fi.m.G0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void U() {
        q0 q0Var;
        o0 o0Var;
        ll0 ll0Var = this.d;
        int childCount = ll0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ll0Var.getChildAt(i10);
            if ((childAt instanceof q0) && (o0Var = (q0Var = (q0) childAt).v) != null) {
                boolean R = R(o0Var);
                q0Var.c.f(R, true);
                q0Var.r.a(R, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.l0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f10;
    }

    @Override // org.telegram.ui.ActionBar.f3
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
        a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.j6.i5));
        fVar.b(a2, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.b();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.B0 != systemBottomInset) {
            this.B0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            r0 r0Var = this.j0;
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            r0Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        n0 n0Var = new n0(this, this.d, getContext(), this.X, new ii.a(this, 24), this.resourcesProvider);
        this.k0 = n0Var;
        n0Var.r = false;
        return n0Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final ll0 w(Context context) {
        return new r60(this, context, this.resourcesProvider, 3);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return null;
    }
}
