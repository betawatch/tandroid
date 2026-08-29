package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t3 extends FrameLayout {
    public final ImageView A;
    public final hp0 B;
    public final ua1 C;
    public final FrameLayout D;
    public final aj0 E;
    public final LinearLayout F;
    public int G;
    public final LinearLayout H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final t1 K;
    public final t1 L;
    public final t1 M;
    public final t1 N;
    public final t1 O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public final k a;
    public final c6 b;
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final ImageView f;
    public final LinearLayout h;
    public final ImageView n;
    public final ImageView r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final LinearLayout w;
    public final tg x;
    public final LinearLayout y;

    public t3(Context context, final k kVar) {
        super(context);
        this.G = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.T = -1;
        this.U = 0;
        this.a = kVar;
        c6 c6Var = kVar.a.a;
        this.b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = g6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{g6.v0(i10, c6Var), g6.l1(0.0f, g6.v0(i10, c6Var))}));
        addView(view, f6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{g6.l1(0.0f, g6.v0(i10, c6Var)), g6.v0(i10, c6Var)}));
        addView(view2, f6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, f6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = g6.Yk;
        int v02 = g6.v0(i11, c6Var);
        int v03 = g6.v0(i11, c6Var);
        int i12 = g6.i6;
        imageView.setBackground(new w1(g6.Z(v02, g6.v(v03, g6.v0(i12, c6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i13 = g6.G6;
        int v04 = g6.v0(i13, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        h6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new bg.n(kVar, 27));
        frameLayout.addView(imageView, f6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        frameLayout.addView(linearLayout, f6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(g6.f0(g6.v0(i12, c6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        h6.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i14 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, f6.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(g6.f0(g6.v0(i12, c6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        h6.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i15 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, f6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, f6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, f6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, f6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.k0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        imageView4.setBackground(new w1(g6.Z(g6.v0(i11, c6Var), g6.v(g6.v0(i11, c6Var), g6.v0(i12, c6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, f6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        h6.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i16 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i10, c6Var))));
        frameLayout4.addView(frameLayout5, f6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 1);
        r1Var.setClipToOutline(true);
        r1Var.setOutlineProvider(new eg.k1(21));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        r1Var.addView(linearLayout3);
        frameLayout5.addView(r1Var, f6.c(-1.0f, -1));
        tg tgVar = new tg(context, 24);
        this.x = tgVar;
        tgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        tgVar.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        tgVar.setBackground(g6.Z(g6.v0(i10, c6Var), g6.v0(i12, c6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        tgVar.j(rg.e, false);
        linearLayout3.addView(tgVar, f6.q(38, 38, 16));
        h6.a(tgVar);
        tgVar.setContentDescription("Emoji");
        final int i17 = 10;
        tgVar.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.A = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        imageView5.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        imageView5.setBackground(g6.Z(g6.v0(i10, c6Var), g6.v0(i12, c6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, f6.t(38, 38, 16, 2, 0, 0, 0));
        h6.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i18 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, f6.l(1.0f, 0, 44));
        ua1 ua1Var = new ua1(this, context, 20);
        this.C = ua1Var;
        ua1Var.setOrientation(0);
        ua1Var.setClipToPadding(false);
        ua1Var.setClipChildren(false);
        ua1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(ua1Var, f6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.D = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, f6.e(80, 60, 81));
        aj0 aj0Var = new aj0(context);
        this.E = aj0Var;
        aj0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        aj0Var.setScaleType(scaleType);
        aj0Var.setColorFilter(new PorterDuffColorFilter(g6.v0(i13, c6Var), mode));
        aj0Var.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        frameLayout6.addView(aj0Var, f6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        ua1Var.addView(frameLayout7, f6.c(44.0f, -2));
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 1);
        i2Var.setHorizontalScrollBarEnabled(false);
        i2Var.setClipToOutline(true);
        i2Var.setOutlineProvider(new eg.k1(22));
        frameLayout7.addView(i2Var, f6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        i2Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, c6Var);
        this.O = t1Var;
        t1Var.c(i11);
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        final int i19 = 0;
        t1Var.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(t1Var, f6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, c6Var);
        this.L = t1Var2;
        t1Var2.c(i11);
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        final int i20 = 1;
        t1Var2.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(t1Var2, f6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.I = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        ua1Var.addView(linearLayout5, f6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, c6Var);
        this.K = t1Var3;
        t1Var3.c(i11);
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        final int i21 = 2;
        t1Var3.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(t1Var3, f6.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, c6Var);
        this.M = t1Var4;
        t1Var4.c(i11);
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        final int i22 = 3;
        t1Var4.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(t1Var4, f6.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.J = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        ua1Var.addView(linearLayout6, f6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, c6Var);
        this.N = t1Var5;
        t1Var5.c(i11);
        t1Var5.d();
        arrayList.add(t1Var5);
        t1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        final int i23 = 4;
        t1Var5.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(t1Var5, f6.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.H = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(i11, c6Var))));
        ua1Var.addView(linearLayout7, 0, f6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, R.drawable.input_ai, c6Var);
        t1Var6.setImageDrawable(new org.telegram.ui.Components.k0(context));
        t1Var6.c(i11);
        t1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        final int i24 = 5;
        t1Var6.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i24) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(t1Var6, f6.q(38, 38, 16));
        hp0 hp0Var = new hp0(this, context, R.drawable.send_plane_24, c6Var, 4);
        this.B = hp0Var;
        hp0Var.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(g6.Yd, c6Var))));
        h6.a(hp0Var);
        linearLayout2.addView(hp0Var, f6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        hp0Var.setContentDescription("Send");
        final int i25 = 6;
        hp0Var.setOnClickListener(new View.OnClickListener() { // from class: th.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i25) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.W();
                        break;
                    case 1:
                        kVar.a.r.Z3(view3);
                        break;
                    case 2:
                        kVar.a.r.a4();
                        break;
                    case 3:
                        kVar.a.r.X3();
                        break;
                    case 4:
                        kVar.a.r.b4();
                        break;
                    case 5:
                        p pVar2 = kVar.a;
                        g3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.n0(a2);
                                g0Var.g0 = new nh.b0(h22, 23);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.H(0, true, 0, false, 0L);
                        break;
                    case 7:
                        b2 b2Var = kVar.a.r.F3;
                        if (b2Var != null) {
                            b2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        b2 b2Var2 = kVar.a.r.F3;
                        if (b2Var2 != null) {
                            b2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        p pVar3 = kVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new nh.b0(kVar2, 24), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.O(pVar4, 90, 0);
                        break;
                }
            }
        });
        hp0Var.setOnLongClickListener(new bg.g0(kVar, 5));
        f(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        LinearLayout linearLayout = this.y;
        t1 t1Var = new t1(linearLayout.getContext(), i10, this.b);
        t1Var.c(g6.d6);
        if (z10) {
            t1Var.d();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(x1.g0(i11));
        t1Var.setOnClickListener(new s3(this, i11, 1));
        this.P.add(t1Var);
        linearLayout.addView(t1Var, f6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        t1 t1Var = new t1(getContext(), i10, this.b);
        t1Var.c(g6.Yk);
        if (z10) {
            t1Var.d();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(x1.i0(i11));
        t1Var.setOnClickListener(new s3(this, i11, 0));
        this.Q.add(t1Var);
        LinearLayout linearLayout = this.F;
        linearLayout.addView(t1Var, f6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t1 t1Var = (t1) obj;
            int intValue = ((Integer) t1Var.getTag()).intValue();
            t1Var.setSelected((i10 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                t1Var.setEnabled(z14);
            }
        }
        t1 t1Var2 = this.K;
        t1Var2.setSelected(z10);
        t1 t1Var3 = this.M;
        t1Var3.setSelected(z11);
        t1Var2.setEnabled(z12);
        this.L.setEnabled(z13);
        t1Var3.setEnabled(z12);
        this.N.setEnabled(z12);
    }

    public final void d(int i10, int i11) {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            t1 t1Var = (t1) obj;
            boolean z10 = i10 == ((Integer) t1Var.getTag()).intValue();
            t1Var.setSelected(z10);
            if (!z10 || i11 == 0) {
                t1Var.a();
            } else {
                t1Var.f(i11);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.V == z10 && z11) {
            return;
        }
        this.V = z10;
        float f9 = z10 ? 1.15f : 1.0f;
        aj0 aj0Var = this.E;
        if (z11) {
            aj0Var.animate().scaleX(f9).scaleY(f9).setDuration(180L).setInterpolator(jr.h).start();
        } else {
            aj0Var.animate().cancel();
            aj0Var.setScaleX(f9);
            aj0Var.setScaleY(f9);
        }
        aj0Var.setColorFilter(new PorterDuffColorFilter(g6.v0(z10 ? g6.q7 : g6.G6, this.b), PorterDuff.Mode.SRC_IN));
        xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.X > 34) {
                    animatedDrawable.L(0, false, false);
                }
                animatedDrawable.N(33);
            } else {
                animatedDrawable.N(0);
            }
            animatedDrawable.start();
        }
    }

    public final void f(int i10, boolean z10) {
        if (this.T == i10) {
            return;
        }
        this.T = i10;
        FrameLayout frameLayout = this.D;
        ua1 ua1Var = this.C;
        LinearLayout linearLayout = this.w;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i10 == 0 ? 1.0f : 0.0f).scaleX(i10 == 0 ? 1.0f : 0.8f).scaleY(i10 == 0 ? 1.0f : 0.8f).translationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            jr jrVar = jr.h;
            final int i11 = 0;
            duration.setInterpolator(jrVar).withEndAction(new Runnable(this) { // from class: th.r3
                public final /* synthetic */ t3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            t3 t3Var = this.b;
                            if (t3Var.T != 0) {
                                t3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            t3 t3Var2 = this.b;
                            if (t3Var2.T != 1) {
                                t3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            t3 t3Var3 = this.b;
                            if (t3Var3.T != 2) {
                                t3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            ua1Var.setVisibility(0);
            final int i12 = 1;
            ua1Var.animate().alpha(i10 == 1 ? 1.0f : 0.0f).scaleX(i10 == 1 ? 1.0f : 0.8f).scaleY(i10 == 1 ? 1.0f : 0.8f).translationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(jrVar).withEndAction(new Runnable(this) { // from class: th.r3
                public final /* synthetic */ t3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            t3 t3Var = this.b;
                            if (t3Var.T != 0) {
                                t3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            t3 t3Var2 = this.b;
                            if (t3Var2.T != 1) {
                                t3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            t3 t3Var3 = this.b;
                            if (t3Var3.T != 2) {
                                t3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i10 == 2 ? 1.0f : 0.0f).scaleX(i10 == 2 ? 1.0f : 0.8f);
            final int i13 = 2;
            scaleX.scaleY(i10 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(jrVar).withEndAction(new Runnable(this) { // from class: th.r3
                public final /* synthetic */ t3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            t3 t3Var = this.b;
                            if (t3Var.T != 0) {
                                t3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            t3 t3Var2 = this.b;
                            if (t3Var2.T != 1) {
                                t3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            t3 t3Var3 = this.b;
                            if (t3Var3.T != 2) {
                                t3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i10 == 0 ? 0 : 8);
        linearLayout.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        ua1Var.setVisibility(i10 == 1 ? 0 : 8);
        ua1Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        ua1Var.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        ua1Var.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        ua1Var.setTranslationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        frameLayout.setVisibility(i10 != 2 ? 8 : 0);
        frameLayout.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i10 == 2 ? 1.0f : 0.8f);
    }

    public ImageView getAddButton() {
        return this.A;
    }

    public FrameLayout getBottomContainer() {
        return this.s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.w;
    }

    public View getEmojiButton() {
        return this.x;
    }

    public og getSendButton() {
        return this.B;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f9) {
        this.d.setTranslationY(f9);
    }

    public void setEmojiOpened(boolean z10) {
        rg rgVar = z10 ? rg.d : rg.e;
        tg tgVar = this.x;
        tgVar.j(rgVar, true);
        tgVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.O.setSelected(z10);
    }

    public void setSelectedBlockType(int i10) {
        d(i10, 0);
    }

    public void setSendEditing(boolean z10) {
        this.B.setResourceId(z10 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z10) {
        hp0 hp0Var = this.B;
        if (hp0Var.isEnabled() == z10) {
            return;
        }
        hp0Var.setEnabled(z10);
        hp0Var.animate().alpha(z10 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public void setSendLoading(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        this.B.invalidate();
    }

    public void setTopButtonsOffset(int i10) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i10) {
            layoutParams2.topMargin = i10;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z10) {
        this.e.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
    }
}
