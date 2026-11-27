// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ui9 extends FrameLayout implements snb {
    public final LinearLayout E;
    public final ImageView F;
    public final di3 G;
    public final oob H;
    public final FrameLayout I;
    public final e29 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final ug9 P;
    public final ug9 Q;
    public final ug9 R;
    public final ug9 S;
    public final ug9 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final r72 a;
    public boolean a0;
    public final vnb b;
    public int b0;
    public final View c;
    public int c0;
    public final View d;
    public boolean d0;
    public final FrameLayout e;
    public final GradientDrawable e0;
    public final ImageView f;
    public final GradientDrawable f0;
    public final ArrayList g0;
    public final LinearLayout h;
    public final ArrayList h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public int l0;
    public boolean m0;
    public final ImageView n;
    public int n0;
    public boolean o0;
    public final ImageView r;
    public final FrameLayout s;
    public final FrameLayout w;
    public final LinearLayout x;
    public final iz1 y;

    public ui9(Context context, final r72 r72Var) {
        super(context);
        this.L = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.b0 = -1;
        this.c0 = 0;
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.a = r72Var;
        vnb vnbVar = r72Var.a.a;
        this.b = vnbVar;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = aob.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{aob.v0(i, vnbVar), aob.p1(0.0f, aob.v0(i, vnbVar))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, tre.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{aob.p1(0.0f, aob.v0(i, vnbVar)), aob.v0(i, vnbVar)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, tre.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, tre.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = aob.Pl;
        int v0 = aob.v0(i2, vnbVar);
        int v02 = aob.v0(i2, vnbVar);
        int i3 = aob.i6;
        Drawable Z = aob.Z(v0, aob.v(v02, aob.v0(i3, vnbVar)), hl.L(22.0f), hl.L(22.0f));
        f(imageView, i2, Z);
        imageView.setBackground(new xg9(Z));
        int i4 = aob.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i4, vnbVar, mode);
        iye.a(imageView);
        imageView.setContentDescription(ob6.M0(2131754874, null));
        imageView.setOnClickListener(new y00(r72Var, (byte) 14));
        frameLayout.addView(imageView, tre.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable b0 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(linearLayout, i2, b0);
        linearLayout.setBackground(new xg9(b0));
        frameLayout.addView(linearLayout, tre.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M = yob.M(i3);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M, vnbVar);
        yob.s(imageView2, i4, vnbVar, mode);
        iye.a(imageView2);
        imageView2.setContentDescription("Undo");
        final byte b = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                r72 r72Var2 = r72Var;
                switch (b2) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, tre.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        hf0 f02 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M2 = yob.M(i3);
        imageView3.setBackground(f02);
        yob.j(imageView3, f02, null, M2, vnbVar);
        yob.s(imageView3, i4, vnbVar, mode);
        iye.a(imageView3);
        imageView3.setContentDescription("Redo");
        final byte b2 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b2;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, tre.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, tre.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, tre.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout3.addView(linearLayout2, tre.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new hc(context));
        imageView4.setScaleType(scaleType);
        yob.s(imageView4, i4, vnbVar, mode);
        Drawable Z2 = aob.Z(aob.v0(i2, vnbVar), aob.v(aob.v0(i2, vnbVar), aob.v0(i3, vnbVar)), hl.L(22.0f), hl.L(22.0f));
        f(imageView4, i2, Z2);
        imageView4.setBackground(new xg9(Z2));
        linearLayout2.addView(imageView4, tre.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        iye.a(imageView4);
        imageView4.setContentDescription("AI");
        final byte b3 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b3;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable b02 = aob.b0(hl.L(22.0f), aob.v0(i, vnbVar));
        f(frameLayout5, i, b02);
        frameLayout5.setBackground(new xg9(b02));
        frameLayout4.addView(frameLayout5, tre.e(-2, 44, 81));
        sg9 sg9Var = new sg9(context, (byte) 1);
        sg9Var.setClipToOutline(true);
        sg9Var.setOutlineProvider(new yi((byte) 15));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        sg9Var.addView(linearLayout3);
        frameLayout5.addView(sg9Var, tre.c(-1.0f, -1));
        iz1 iz1Var = new iz1(context, 24);
        this.y = iz1Var;
        iz1Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        yob.s(iz1Var, i4, vnbVar, mode);
        hf0 Z3 = aob.Z(aob.v0(i, vnbVar), aob.v0(i3, vnbVar), hl.L(20.0f), hl.L(20.0f));
        uob M3 = yob.M(i);
        uob M4 = yob.M(i3);
        iz1Var.setBackground(Z3);
        yob.j(iz1Var, Z3, M3, M4, vnbVar);
        iz1Var.j(gz1.e, false);
        linearLayout3.addView(iz1Var, tre.r(38, 38, 16));
        iye.a(iz1Var);
        iz1Var.setContentDescription("Emoji");
        final byte b4 = 10;
        iz1Var.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b4;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        yob.s(imageView5, i4, vnbVar, mode);
        hf0 Z4 = aob.Z(aob.v0(i, vnbVar), aob.v0(i3, vnbVar), hl.L(20.0f), hl.L(20.0f));
        uob M5 = yob.M(i);
        uob M6 = yob.M(i3);
        imageView5.setBackground(Z4);
        yob.j(imageView5, Z4, M5, M6, vnbVar);
        linearLayout3.addView(imageView5, tre.t(38, 38, 16, 2, 0, 0, 0));
        iye.a(imageView5);
        imageView5.setContentDescription("Attach");
        final byte b5 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b5;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, tre.l(1.0f, 0, 44));
        oob oobVar = new oob((byte) 14, context, this);
        this.H = oobVar;
        oobVar.setOrientation(0);
        oobVar.setClipToPadding(false);
        oobVar.setClipChildren(false);
        oobVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout2.addView(oobVar, tre.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        frameLayout2.addView(frameLayout6, tre.e(80, 60, 81));
        e29 e29Var = new e29(context);
        this.J = e29Var;
        e29Var.f(R.raw.group_pip_delete_icon, hl.L(16.0f), hl.L(16.0f), null);
        b29 animatedDrawable = e29Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        e29Var.setScaleType(scaleType);
        e29Var.setColorFilter(new PorterDuffColorFilter(aob.v0(i4, vnbVar), mode));
        Drawable b03 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(e29Var, i2, b03);
        e29Var.setBackground(new xg9(b03));
        frameLayout6.addView(e29Var, tre.e(-1, -1, jn7.D1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable b04 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(frameLayout7, i2, b04);
        frameLayout7.setBackground(new xg9(b04));
        oobVar.addView(frameLayout7, tre.c(44.0f, -2));
        ti9 ti9Var = new ti9(this, context, (byte) 0);
        ti9Var.setHorizontalScrollBarEnabled(false);
        ti9Var.setClipToOutline(true);
        ti9Var.setOutlineProvider(new yi((byte) 16));
        frameLayout7.addView(ti9Var, tre.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        ti9Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, TLObject.FLAG_14, true);
        b(R.drawable.iv_super, 32768, true);
        ug9 ug9Var = new ug9(R.drawable.iv_quote, vnbVar, context);
        this.T = ug9Var;
        ug9Var.c(i2);
        ug9Var.setContentDescription(ob6.M0(2131746167, null));
        final byte b6 = 0;
        ug9Var.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b6;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(ug9Var, tre.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        ug9 ug9Var2 = new ug9(R.drawable.iv_button, vnbVar, context);
        this.Q = ug9Var2;
        ug9Var2.c(i2);
        ug9Var2.setContentDescription(ob6.M0(2131745738, null));
        final byte b7 = 1;
        ug9Var2.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b7;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(ug9Var2, tre.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        Drawable b05 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(linearLayout5, i2, b05);
        linearLayout5.setBackground(new xg9(b05));
        oobVar.addView(linearLayout5, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var3 = new ug9(R.drawable.media_link_24, vnbVar, context);
        this.P = ug9Var3;
        ug9Var3.c(i2);
        ug9Var3.setContentDescription(ob6.M0(2131751709, null));
        final byte b8 = 2;
        ug9Var3.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b8;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(ug9Var3, tre.r(38, 38, 16));
        ug9 ug9Var4 = new ug9(R.drawable.msg_calendar2, vnbVar, context);
        this.R = ug9Var4;
        ug9Var4.c(i2);
        ug9Var4.setContentDescription(ob6.M0(2131754857, null));
        final byte b9 = 3;
        ug9Var4.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b9;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(ug9Var4, tre.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        Drawable b06 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(linearLayout6, i2, b06);
        linearLayout6.setBackground(new xg9(b06));
        oobVar.addView(linearLayout6, tre.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ug9 ug9Var5 = new ug9(R.drawable.iv_math, vnbVar, context);
        this.S = ug9Var5;
        ug9Var5.c(i2);
        ug9Var5.d();
        arrayList.add(ug9Var5);
        ug9Var5.setContentDescription(ob6.M0(2131754859, null));
        final byte b10 = 4;
        ug9Var5.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b10;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(ug9Var5, tre.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        Drawable b07 = aob.b0(hl.L(22.0f), aob.v0(i2, vnbVar));
        f(linearLayout7, i2, b07);
        linearLayout7.setBackground(new xg9(b07));
        oobVar.addView(linearLayout7, 0, tre.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ug9 ug9Var6 = new ug9(R.drawable.input_ai, vnbVar, context);
        ug9Var6.setImageDrawable(new hc(context));
        ug9Var6.c(i2);
        ug9Var6.setContentDescription(ob6.M0(2131755003, null));
        final byte b11 = 5;
        ug9Var6.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b11;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(ug9Var6, tre.r(38, 38, 16));
        di3 di3Var = new di3(this, context, vnbVar);
        this.G = di3Var;
        int i5 = aob.Pe;
        Drawable b08 = aob.b0(hl.L(22.0f), aob.v0(i5, vnbVar));
        f(di3Var, i5, b08);
        di3Var.setBackground(new xg9(b08));
        iye.a(di3Var);
        linearLayout2.addView(di3Var, tre.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        di3Var.setContentDescription("Send");
        final byte b12 = 6;
        di3Var.setOnClickListener(new View.OnClickListener() { // from class: qi9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b12;
                r72 r72Var2 = r72Var;
                switch (b22) {
                    case 0:
                        v72 v72Var = r72Var2.a;
                        v72Var.r.U4();
                        v72Var.a0();
                        break;
                    case 1:
                        r72Var2.a.r.a4(view3);
                        break;
                    case 2:
                        r72Var2.a.r.b4();
                        break;
                    case 3:
                        r72Var2.a.r.Y3();
                        break;
                    case 4:
                        r72Var2.a.r.c4();
                        break;
                    case 5:
                        v72 v72Var2 = r72Var2.a;
                        gi9 d2 = v72Var2.r.d2();
                        if (d2 != null) {
                            TL_iv.RichMessage a = d2.a();
                            if (!a.blocks.isEmpty()) {
                                b1 b1Var = new b1(v72Var2.getContext(), v72Var2.a);
                                b1Var.p1(a);
                                b1Var.f2 = new te2(d2, (byte) 20);
                                b1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        r72Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        ch9 ch9Var = r72Var2.a.r.R3;
                        if (ch9Var != null) {
                            ch9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        ch9 ch9Var2 = r72Var2.a.r.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        v72 v72Var3 = r72Var2.a;
                        new ue9(v72Var3.n, v72Var3.a, new te2(r72Var2, (byte) 21), v72Var3.getContext()).show();
                        break;
                    case 10:
                        r72Var2.a.X();
                        break;
                    default:
                        v72 v72Var4 = r72Var2.a;
                        v72Var4.r.j4 = null;
                        v72Var4.S(90, 0);
                        break;
                }
            }
        });
        di3Var.setOnLongClickListener(new zs(r72Var, (byte) 14));
        g(0, false);
    }

    public final void a(int i, int i2, boolean z) {
        LinearLayout linearLayout = this.E;
        ug9 ug9Var = new ug9(i, this.b, linearLayout.getContext());
        ug9Var.c(aob.d6);
        if (z) {
            ug9Var.d();
            this.W.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(yg9.c0(i2));
        ug9Var.setOnClickListener(new ib(this, i2, (byte) 6));
        this.U.add(ug9Var);
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i, final int i2, boolean z) {
        ug9 ug9Var = new ug9(i, this.b, getContext());
        ug9Var.c(aob.Pl);
        if (z) {
            ug9Var.d();
            this.W.add(ug9Var);
        }
        ug9Var.setTag(Integer.valueOf(i2));
        ug9Var.setContentDescription(yg9.e0(i2));
        ug9Var.setOnClickListener(new View.OnClickListener() { // from class: ri9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ui9.this.a.a.r.Z3(i2);
            }
        });
        this.V.add(ug9Var);
        LinearLayout linearLayout = this.K;
        linearLayout.addView(ug9Var, tre.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ug9 ug9Var = (ug9) obj;
            int intValue = ((Integer) ug9Var.getTag()).intValue();
            ug9Var.setSelected((i & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                ug9Var.setEnabled(z5);
            }
        }
        ug9 ug9Var2 = this.P;
        ug9Var2.setSelected(z);
        ug9 ug9Var3 = this.R;
        ug9Var3.setSelected(z2);
        ug9Var2.setEnabled(z3);
        this.Q.setEnabled(z4);
        ug9Var3.setEnabled(z3);
        this.S.setEnabled(z3);
    }

    public final void d(int i, int i2) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ug9 ug9Var = (ug9) obj;
            boolean z = i == ((Integer) ug9Var.getTag()).intValue();
            ug9Var.setSelected(z);
            if (!z || i2 == 0) {
                ug9Var.a();
            } else {
                ug9Var.e(i2);
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        if (this.d0 == z && z2) {
            return;
        }
        this.d0 = z;
        float f = z ? 1.15f : 1.0f;
        e29 e29Var = this.J;
        if (z2) {
            e29Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(k43.h).start();
        } else {
            e29Var.animate().cancel();
            e29Var.setScaleX(f);
            e29Var.setScaleY(f);
        }
        e29Var.setColorFilter(new PorterDuffColorFilter(aob.v0(z ? aob.q7 : aob.G6, this.b), PorterDuff.Mode.SRC_IN));
        b29 animatedDrawable = e29Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.I(0, false, false);
                }
                animatedDrawable.K(33);
            } else {
                animatedDrawable.K(0);
            }
            animatedDrawable.start();
        }
    }

    public final void f(View view, int i, Drawable drawable) {
        this.g0.add(view);
        this.h0.add(drawable);
        this.i0.add(Integer.valueOf(i));
        vnb vnbVar = this.b;
        this.j0.add(Integer.valueOf(aob.v0(i, vnbVar)));
        this.k0.add(Integer.valueOf(drawable instanceof RippleDrawable ? aob.v(aob.v0(i, vnbVar), aob.v0(aob.i6, vnbVar)) : 0));
    }

    public final void g(int i, boolean z) {
        if (this.b0 == i) {
            return;
        }
        this.b0 = i;
        FrameLayout frameLayout = this.I;
        LinearLayout linearLayout = this.x;
        final byte b = 2;
        oob oobVar = this.H;
        final byte b2 = 1;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i == 0 ? 1.0f : 0.0f).scaleX(i == 0 ? 1.0f : 0.8f).scaleY(i == 0 ? 1.0f : 0.8f).translationY(i == 0 ? 0.0f : hl.L(30.0f)).setDuration(420L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new Runnable(this) { // from class: si9
                public final /* synthetic */ ui9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = r2;
                    ui9 ui9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            oobVar.setVisibility(0);
            oobVar.animate().alpha(i == 1 ? 1.0f : 0.0f).scaleX(i == 1 ? 1.0f : 0.8f).scaleY(i == 1 ? 1.0f : 0.8f).translationY(i == 1 ? 0.0f : hl.L(30.0f)).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) { // from class: si9
                public final /* synthetic */ ui9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    ui9 ui9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(i == 2 ? 1.0f : 0.0f).scaleX(i == 2 ? 1.0f : 0.8f).scaleY(i == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) { // from class: si9
                public final /* synthetic */ ui9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    ui9 ui9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (ui9Var.b0 != 0) {
                                ui9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (ui9Var.b0 != 1) {
                                ui9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (ui9Var.b0 != 2) {
                                ui9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i == 0 ? 0 : 8);
        linearLayout.setAlpha(i == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i == 0 ? 0.0f : hl.L(30.0f));
        oobVar.setVisibility(i == 1 ? 0 : 8);
        oobVar.setAlpha(i == 1 ? 1.0f : 0.0f);
        oobVar.setScaleX(i == 1 ? 1.0f : 0.8f);
        oobVar.setScaleY(i == 1 ? 1.0f : 0.8f);
        oobVar.setTranslationY(i == 1 ? 0.0f : hl.L(30.0f));
        frameLayout.setVisibility(i != 2 ? (byte) 8 : (byte) 0);
        frameLayout.setAlpha(i == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public ImageView getAddButton() {
        return this.F;
    }

    public FrameLayout getBottomContainer() {
        return this.s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.w;
    }

    public LinearLayout getBottomPanel() {
        return this.x;
    }

    public View getEmojiButton() {
        return this.y;
    }

    public bz1 getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f) {
        this.d.setTranslationY(f);
    }

    public void setEmojiOpened(boolean z) {
        gz1 gz1Var = z ? gz1.d : gz1.e;
        iz1 iz1Var = this.y;
        iz1Var.j(gz1Var, true);
        iz1Var.setContentDescription(z ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ug9) obj).setPremiumLocked(z);
        }
    }

    public void setQuoteState(boolean z) {
        this.T.setSelected(z);
    }

    public void setSelectedBlockType(int i) {
        d(i, 0);
    }

    public void setSendEditing(boolean z) {
        this.G.setResourceId(z ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z) {
        di3 di3Var = this.G;
        if (di3Var.isEnabled() == z) {
            return;
        }
        di3Var.setEnabled(z);
        ik8.s(di3Var.animate(), z ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i) {
            layoutParams2.topMargin = i;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0007, B:5:0x0011, B:8:0x003a, B:10:0x0040, B:13:0x005c, B:15:0x0072, B:16:0x0078, B:18:0x0084, B:20:0x00a1, B:22:0x00aa, B:24:0x00b4, B:30:0x008f, B:32:0x009b, B:37:0x00be, B:39:0x00c2, B:40:0x00c7, B:42:0x00cf, B:46:0x00d3, B:49:0x00c5, B:51:0x0015, B:53:0x001e, B:54:0x0029, B:56:0x002d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // snb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        boolean z;
        View view;
        ArrayList arrayList = this.k0;
        ArrayList arrayList2 = this.h0;
        vnb vnbVar = this.b;
        try {
            int v0 = aob.v0(aob.d6, vnbVar);
            if (!this.m0 || v0 != this.l0) {
                this.m0 = true;
                this.l0 = v0;
                GradientDrawable gradientDrawable = this.e0;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(new int[]{v0, aob.p1(0.0f, v0)});
                }
                GradientDrawable gradientDrawable2 = this.f0;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColors(new int[]{aob.p1(0.0f, v0), v0});
                }
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                Drawable drawable = (Drawable) arrayList2.get(i);
                int v02 = aob.v0(((Integer) this.i0.get(i)).intValue(), vnbVar);
                boolean z2 = drawable instanceof RippleDrawable;
                ArrayList arrayList3 = this.j0;
                if (z2) {
                    int v = aob.v(v02, aob.v0(aob.i6, vnbVar));
                    if (v02 != ((Integer) arrayList3.get(i)).intValue()) {
                        aob.F1(drawable, v02, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (v != ((Integer) arrayList.get(i)).intValue()) {
                        arrayList.set(i, Integer.valueOf(v));
                        aob.F1(drawable, v, true);
                        z = true;
                    }
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z && (view = (View) this.g0.get(i)) != null) {
                        view.invalidate();
                    }
                } else if (v02 != ((Integer) arrayList3.get(i)).intValue()) {
                    aob.A1(v02, drawable);
                    z = true;
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z) {
                        view.invalidate();
                    }
                } else {
                    z = false;
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z) {
                    }
                }
            }
            e29 e29Var = this.J;
            if (e29Var != null) {
                int v03 = aob.v0(this.d0 ? aob.q7 : aob.G6, vnbVar);
                if (this.o0 && v03 == this.n0) {
                    return;
                }
                this.o0 = true;
                this.n0 = v03;
                e29Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
