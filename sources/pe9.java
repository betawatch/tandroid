// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf9 b;

    public /* synthetic */ pe9(jf9 jf9Var, byte b) {
        this.a = b;
        this.b = jf9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kk9 N2;
        nk9 q;
        byte b = this.a;
        final byte b2 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final byte b3 = 1;
        final jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                jf9Var.v0();
                break;
            case 1:
                if (!jf9Var.Q.B2()) {
                    jf9Var.finishFragment();
                    break;
                }
                break;
            case 2:
                of9 of9Var = jf9Var.Q.R3;
                if (of9Var != null) {
                    of9Var.k();
                    break;
                }
                break;
            case 3:
                of9 of9Var2 = jf9Var.Q.R3;
                if (of9Var2 != null) {
                    of9Var2.i();
                    break;
                }
                break;
            case 4:
                jf9Var.l0();
                break;
            case 5:
                jf9 jf9Var2 = this.b;
                if (!jf9Var2.C0) {
                    if (jf9Var2.B0 == null) {
                        e34 e34Var = new e34(jf9Var2, true, false, false, jf9Var2.getParentActivity(), true, null, jf9Var2.P, true, jf9Var2.getResourceProvider(), false, false);
                        jf9Var2.B0 = e34Var;
                        e34Var.setVisibility(8);
                        e34 e34Var2 = jf9Var2.B0;
                        e34Var2.x2 = false;
                        e34Var2.setDelegate(new af9(jf9Var2));
                        int indexOfChild = jf9Var2.P.indexOfChild(jf9Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = jf9Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e = qoe.e(-1, jf9Var2.g0(), 87);
                        e.bottomMargin = jf9Var2.U0;
                        jf9Var2.P.addView(jf9Var2.B0, indexOfChild, e);
                    }
                    int g0 = jf9Var2.g0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jf9Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = qoe.e(-1, g0, 87);
                    } else {
                        layoutParams.height = g0;
                    }
                    layoutParams.bottomMargin = jf9Var2.U0;
                    jf9Var2.B0.setLayoutParams(layoutParams);
                    jf9Var2.B0.setVisibility(0);
                    jf9Var2.C0 = true;
                    jf9Var2.E0 = g0 + jf9Var2.U0;
                    ne9 L2 = jf9Var2.Q.L2();
                    if (L2 != null) {
                        gm.t1(L2);
                    }
                    jf9Var2.e0();
                    jf9Var2.c0.j(b02.d, true);
                    break;
                } else {
                    jf9Var2.h0(true);
                    ne9 L22 = jf9Var2.Q.L2();
                    if (L22 != null) {
                        L22.O();
                        gm.E3(L22);
                        break;
                    }
                }
                break;
            case 6:
                bu5 bu5Var = jf9Var.y0;
                if (bu5Var != null) {
                    bu5Var.u();
                    jf9Var.y0 = null;
                }
                final bu5 I = bu5.I(jf9Var, view);
                I.T = true;
                ll0 M2 = jf9Var.Q.M2();
                I.i(M2 == null || !M2.b(), R.drawable.field_carret_empty, null, jb6.M0(2131753964, null), new te9(jf9Var, M2, (byte) 5));
                I.i((M2 == null || !M2.b() || M2.a() || M2.c()) ? false : true, R.drawable.iv_list, null, jb6.M0(2131753970, null), new te9(jf9Var, M2, (byte) 6));
                I.i(M2 != null && M2.b() && !M2.a() && M2.c(), R.drawable.iv_ordered_list, null, jb6.M0(2131753967, null), new te9(jf9Var, M2, (byte) 7));
                I.i(M2 != null && M2.b() && M2.a() && !M2.c(), R.drawable.iv_todo, null, jb6.M0(2131753969, null), new te9(jf9Var, M2, (byte) 8));
                boolean z = M2 != null && (M2.b instanceof TL_iv.pageBlockDetails);
                String M0 = jb6.M0(2131753952, null);
                ch9 ch9Var = jf9Var.Q;
                Objects.requireNonNull(ch9Var);
                I.i(z, R.drawable.iv_details, null, M0, new b82(ch9Var, (byte) 1));
                boolean h2 = jf9Var.Q.h2();
                boolean k2 = jf9Var.Q.k2();
                if (h2 || k2) {
                    I.j();
                    if (h2) {
                        I.b(R.drawable.iv_list_tab, jb6.M0(2131753978, null), new Runnable() { // from class: we9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b2;
                                bu5 bu5Var2 = I;
                                jf9 jf9Var3 = jf9Var;
                                switch (b4) {
                                    case 0:
                                        jf9Var3.Q.n3(false);
                                        bu5Var2.u();
                                        break;
                                    default:
                                        jf9Var3.Q.n3(true);
                                        bu5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (k2) {
                        I.b(R.drawable.iv_list_untab, jb6.M0(2131753963, null), new Runnable() { // from class: we9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b3;
                                bu5 bu5Var2 = I;
                                jf9 jf9Var3 = jf9Var;
                                switch (b4) {
                                    case 0:
                                        jf9Var3.Q.n3(false);
                                        bu5Var2.u();
                                        break;
                                    default:
                                        jf9Var3.Q.n3(true);
                                        bu5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                jf9Var.y0 = I;
                break;
            case 7:
                bu5 bu5Var2 = jf9Var.y0;
                if (bu5Var2 != null) {
                    bu5Var2.u();
                    jf9Var.y0 = null;
                }
                ch9 ch9Var2 = jf9Var.Q;
                kk9 kk9Var = ch9Var2.q4;
                if (kk9Var == null && (N2 = ch9Var2.N2()) != null && N2.getModel() != null) {
                    View findFocus = jf9Var.Q.findFocus();
                    if ((findFocus instanceof ne9) && (q = N2.q((ne9) findFocus)) != null) {
                        pagetablecell = q.b;
                    }
                    if (pagetablecell != null) {
                        jf9Var.Q.b2(N2);
                        if (N2.I.add(pagetablecell)) {
                            N2.w.invalidate();
                            N2.v();
                        }
                        kk9Var = N2;
                    }
                }
                if (kk9Var != null && kk9Var.getModel() != null && !kk9Var.I.isEmpty()) {
                    jf9Var.Q.H4(kk9Var);
                    break;
                } else {
                    jf9Var.Q.N1(xk9.t(2, 2));
                    break;
                }
                break;
            case 8:
                bu5 bu5Var3 = jf9Var.y0;
                if (bu5Var3 != null) {
                    bu5Var3.u();
                    jf9Var.y0 = null;
                }
                ll0 M22 = jf9Var.Q.M2();
                if (M22 != null) {
                    TL_iv.PageBlock pageBlock = M22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p82.X(jf9Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new u35(jf9Var, pageblockmath, (byte) 27), jf9Var.getResourceProvider());
                break;
            case 9:
                jf9Var.Q.j4 = null;
                jf9Var.q0(90, 0);
                break;
            case 10:
                jf9Var.v0();
                j67 j67Var = jf9Var.P0;
                if (j67Var != null) {
                    j67Var.f(true);
                    jf9Var.P0 = null;
                    break;
                }
                break;
            case 11:
                jf9Var.Q.T4();
                jf9Var.D0();
                break;
            case 12:
                jf9Var.Q.Z3(view);
                break;
            case 13:
                jf9Var.Q.a4();
                break;
            case 14:
                jf9Var.Q.X3();
                break;
            case 15:
                jf9Var.Q.b4();
                break;
            default:
                jf9Var.o0();
                break;
        }
    }
}
