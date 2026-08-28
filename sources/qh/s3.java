package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s3 extends FrameLayout {
    public final ImageView A;
    public final wo0 B;
    public final ta1 C;
    public final FrameLayout D;
    public final pi0 E;
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
    public final b6 b;
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
    public final qg x;
    public final LinearLayout y;

    public s3(Context context, final k kVar) {
        super(context);
        this.G = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.T = -1;
        this.U = 0;
        this.a = kVar;
        b6 b6Var = kVar.a.a;
        this.b = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i9 = f6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{f6.v0(i9, b6Var), f6.l1(0.0f, f6.v0(i9, b6Var))}));
        addView(view, e6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{f6.l1(0.0f, f6.v0(i9, b6Var)), f6.v0(i9, b6Var)}));
        addView(view2, e6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, e6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = f6.Yk;
        int v02 = f6.v0(i10, b6Var);
        int v03 = f6.v0(i10, b6Var);
        int i11 = f6.i6;
        imageView.setBackground(new w1(f6.Z(v02, f6.v(v03, f6.v0(i11, b6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i12 = f6.G6;
        int v04 = f6.v0(i12, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        g6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new fh.n(kVar, 25));
        frameLayout.addView(imageView, e6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        frameLayout.addView(linearLayout, e6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(f6.f0(f6.v0(i11, b6Var), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        g6.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i13 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, e6.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(f6.f0(f6.v0(i11, b6Var), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        g6.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i14 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, e6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, e6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, e6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, e6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        imageView4.setBackground(new w1(f6.Z(f6.v0(i10, b6Var), f6.v(f6.v0(i10, b6Var), f6.v0(i11, b6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, e6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        g6.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i15 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i9, b6Var))));
        frameLayout4.addView(frameLayout5, e6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 1);
        r1Var.setClipToOutline(true);
        r1Var.setOutlineProvider(new bg.q1(21));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        r1Var.addView(linearLayout3);
        frameLayout5.addView(r1Var, e6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.x = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        qgVar.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        qgVar.setBackground(f6.Z(f6.v0(i9, b6Var), f6.v0(i11, b6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        qgVar.j(og.e, false);
        linearLayout3.addView(qgVar, e6.q(38, 38, 16));
        g6.a(qgVar);
        qgVar.setContentDescription("Emoji");
        final int i16 = 10;
        qgVar.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
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
        imageView5.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        imageView5.setBackground(f6.Z(f6.v0(i9, b6Var), f6.v0(i11, b6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, e6.t(38, 38, 16, 2, 0, 0, 0));
        g6.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i17 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, e6.l(1.0f, 0, 44));
        ta1 ta1Var = new ta1(this, context, 19);
        this.C = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setClipToPadding(false);
        ta1Var.setClipChildren(false);
        ta1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(ta1Var, e6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.D = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, e6.e(80, 60, 81));
        pi0 pi0Var = new pi0(context);
        this.E = pi0Var;
        pi0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        pi0Var.setScaleType(scaleType);
        pi0Var.setColorFilter(new PorterDuffColorFilter(f6.v0(i12, b6Var), mode));
        pi0Var.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        frameLayout6.addView(pi0Var, e6.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(frameLayout7, e6.c(44.0f, -2));
        org.telegram.ui.h2 h2Var = new org.telegram.ui.h2(this, context, 1);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setClipToOutline(true);
        h2Var.setOutlineProvider(new bg.q1(22));
        frameLayout7.addView(h2Var, e6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        h2Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, b6Var);
        this.O = t1Var;
        t1Var.c(i10);
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        final int i18 = 0;
        t1Var.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(t1Var, e6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, b6Var);
        this.L = t1Var2;
        t1Var2.c(i10);
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        final int i19 = 1;
        t1Var2.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(t1Var2, e6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.I = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout5, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, b6Var);
        this.K = t1Var3;
        t1Var3.c(i10);
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        final int i20 = 2;
        t1Var3.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(t1Var3, e6.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, b6Var);
        this.M = t1Var4;
        t1Var4.c(i10);
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        final int i21 = 3;
        t1Var4.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(t1Var4, e6.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.J = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout6, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, b6Var);
        this.N = t1Var5;
        t1Var5.c(i10);
        t1Var5.e();
        arrayList.add(t1Var5);
        t1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        final int i22 = 4;
        t1Var5.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(t1Var5, e6.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.H = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(i10, b6Var))));
        ta1Var.addView(linearLayout7, 0, e6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, R.drawable.input_ai, b6Var);
        t1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        t1Var6.c(i10);
        t1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        final int i23 = 5;
        t1Var6.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(t1Var6, e6.q(38, 38, 16));
        wo0 wo0Var = new wo0(this, context, R.drawable.send_plane_24, b6Var, 4);
        this.B = wo0Var;
        wo0Var.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), f6.v0(f6.Yd, b6Var))));
        g6.a(wo0Var);
        linearLayout2.addView(wo0Var, e6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        wo0Var.setContentDescription("Send");
        final int i24 = 6;
        wo0Var.setOnClickListener(new View.OnClickListener() { // from class: qh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i24) {
                    case 0:
                        p pVar = kVar.a;
                        pVar.r.Q4();
                        pVar.V();
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
                        f3 h22 = pVar2.r.h2();
                        if (h22 != null) {
                            TL_iv.RichMessage a2 = h22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.m0(a2);
                                e0Var.g0 = new i9(h22, 16);
                                e0Var.show();
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
                        new v(pVar3.n, context2, new i9(kVar2, 17), pVar3.a).show();
                        break;
                    case 10:
                        p.K(kVar.a);
                        break;
                    default:
                        p pVar4 = kVar.a;
                        pVar4.r.X3 = null;
                        p.N(pVar4, 90, 0);
                        break;
                }
            }
        });
        wo0Var.setOnLongClickListener(new kh.d5(kVar, 4));
        f(0, false);
    }

    public final void a(int i9, int i10, boolean z10) {
        LinearLayout linearLayout = this.y;
        t1 t1Var = new t1(linearLayout.getContext(), i9, this.b);
        t1Var.c(f6.d6);
        if (z10) {
            t1Var.e();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(x1.f0(i10));
        t1Var.setOnClickListener(new r3(this, i10, 1));
        this.P.add(t1Var);
        linearLayout.addView(t1Var, e6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i9, int i10, boolean z10) {
        t1 t1Var = new t1(getContext(), i9, this.b);
        t1Var.c(f6.Yk);
        if (z10) {
            t1Var.e();
            this.R.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(x1.h0(i10));
        t1Var.setOnClickListener(new r3(this, i10, 0));
        this.Q.add(t1Var);
        LinearLayout linearLayout = this.F;
        linearLayout.addView(t1Var, e6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t1 t1Var = (t1) obj;
            int intValue = ((Integer) t1Var.getTag()).intValue();
            t1Var.setSelected((i9 & intValue) != 0);
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

    public final void d(int i9, int i10) {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t1 t1Var = (t1) obj;
            boolean z10 = i9 == ((Integer) t1Var.getTag()).intValue();
            t1Var.setSelected(z10);
            if (!z10 || i10 == 0) {
                t1Var.a();
            } else {
                t1Var.f(i10);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.V == z10 && z11) {
            return;
        }
        this.V = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        pi0 pi0Var = this.E;
        if (z11) {
            pi0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(gr.h).start();
        } else {
            pi0Var.animate().cancel();
            pi0Var.setScaleX(f10);
            pi0Var.setScaleY(f10);
        }
        pi0Var.setColorFilter(new PorterDuffColorFilter(f6.v0(z10 ? f6.q7 : f6.G6, this.b), PorterDuff.Mode.SRC_IN));
        mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
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

    public final void f(int i9, boolean z10) {
        if (this.T == i9) {
            return;
        }
        this.T = i9;
        FrameLayout frameLayout = this.D;
        ta1 ta1Var = this.C;
        LinearLayout linearLayout = this.w;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i9 == 0 ? 1.0f : 0.0f).scaleX(i9 == 0 ? 1.0f : 0.8f).scaleY(i9 == 0 ? 1.0f : 0.8f).translationY(i9 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            gr grVar = gr.h;
            final int i10 = 0;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: qh.q3
                public final /* synthetic */ s3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            s3 s3Var = this.b;
                            if (s3Var.T != 0) {
                                s3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            s3 s3Var2 = this.b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            s3 s3Var3 = this.b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            ta1Var.setVisibility(0);
            final int i11 = 1;
            ta1Var.animate().alpha(i9 == 1 ? 1.0f : 0.0f).scaleX(i9 == 1 ? 1.0f : 0.8f).scaleY(i9 == 1 ? 1.0f : 0.8f).translationY(i9 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: qh.q3
                public final /* synthetic */ s3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            s3 s3Var = this.b;
                            if (s3Var.T != 0) {
                                s3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            s3 s3Var2 = this.b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            s3 s3Var3 = this.b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i9 == 2 ? 1.0f : 0.0f).scaleX(i9 == 2 ? 1.0f : 0.8f);
            final int i12 = 2;
            scaleX.scaleY(i9 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: qh.q3
                public final /* synthetic */ s3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            s3 s3Var = this.b;
                            if (s3Var.T != 0) {
                                s3Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            s3 s3Var2 = this.b;
                            if (s3Var2.T != 1) {
                                s3Var2.C.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            s3 s3Var3 = this.b;
                            if (s3Var3.T != 2) {
                                s3Var3.D.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i9 == 0 ? 0 : 8);
        linearLayout.setAlpha(i9 == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i9 == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i9 == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i9 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        ta1Var.setVisibility(i9 == 1 ? 0 : 8);
        ta1Var.setAlpha(i9 == 1 ? 1.0f : 0.0f);
        ta1Var.setScaleX(i9 == 1 ? 1.0f : 0.8f);
        ta1Var.setScaleY(i9 == 1 ? 1.0f : 0.8f);
        ta1Var.setTranslationY(i9 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        frameLayout.setVisibility(i9 != 2 ? 8 : 0);
        frameLayout.setAlpha(i9 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i9 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i9 == 2 ? 1.0f : 0.8f);
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

    public lg getSendButton() {
        return this.B;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        og ogVar = z10 ? og.d : og.e;
        qg qgVar = this.x;
        qgVar.j(ogVar, true);
        qgVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.O.setSelected(z10);
    }

    public void setSelectedBlockType(int i9) {
        d(i9, 0);
    }

    public void setSendEditing(boolean z10) {
        this.B.setResourceId(z10 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z10) {
        wo0 wo0Var = this.B;
        if (wo0Var.isEnabled() == z10) {
            return;
        }
        wo0Var.setEnabled(z10);
        wo0Var.animate().alpha(z10 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public void setSendLoading(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        this.B.invalidate();
    }

    public void setTopButtonsOffset(int i9) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i9) {
            layoutParams.topMargin = i9;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i9) {
            layoutParams2.topMargin = i9;
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
