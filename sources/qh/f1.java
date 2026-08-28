package qh;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.eb0;
import org.telegram.ui.li0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ f1(x1 x1Var, int i9) {
        this.a = i9;
        this.b = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f5 R2;
        i5 o6;
        switch (this.a) {
            case 0:
                this.b.q0();
                break;
            case 1:
                x1 x1Var = this.b;
                if (!x1Var.L.F2()) {
                    x1Var.finishFragment();
                    break;
                }
                break;
            case 2:
                b2 b2Var = this.b.L.F3;
                if (b2Var != null) {
                    b2Var.k();
                    break;
                }
                break;
            case 3:
                b2 b2Var2 = this.b.L.F3;
                if (b2Var2 != null) {
                    b2Var2.i();
                    break;
                }
                break;
            case 4:
                x1.T(this.b);
                break;
            case 5:
                x1 x1Var2 = this.b;
                if (!x1Var2.x0) {
                    if (x1Var2.w0 == null) {
                        wy wyVar = new wy(x1Var2, true, false, false, x1Var2.getParentActivity(), true, null, x1Var2.K, true, x1Var2.getResourceProvider(), false, false);
                        x1Var2.w0 = wyVar;
                        wyVar.setVisibility(8);
                        wy wyVar2 = x1Var2.w0;
                        wyVar2.t2 = false;
                        wyVar2.setDelegate(new p1(x1Var2));
                        int indexOfChild = x1Var2.K.indexOfChild(x1Var2.W);
                        if (indexOfChild < 0) {
                            indexOfChild = x1Var2.K.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = e6.e(-1, x1Var2.i0(), 87);
                        e10.bottomMargin = x1Var2.P0;
                        x1Var2.K.addView(x1Var2.w0, indexOfChild, e10);
                    }
                    int i02 = x1Var2.i0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.w0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = e6.e(-1, i02, 87);
                    } else {
                        layoutParams.height = i02;
                    }
                    layoutParams.bottomMargin = x1Var2.P0;
                    x1Var2.w0.setLayoutParams(layoutParams);
                    x1Var2.w0.setVisibility(0);
                    x1Var2.x0 = true;
                    x1Var2.z0 = i02 + x1Var2.P0;
                    d1 P2 = x1Var2.L.P2();
                    if (P2 != null) {
                        AndroidUtilities.hideKeyboard(P2);
                    }
                    x1Var2.g0();
                    x1Var2.X.j(og.d, true);
                    break;
                } else {
                    x1Var2.j0(true);
                    d1 P22 = x1Var2.L.P2();
                    if (P22 != null) {
                        P22.r();
                        AndroidUtilities.showKeyboard(P22);
                        break;
                    }
                }
                break;
            case 6:
                final x1 x1Var3 = this.b;
                x60 x60Var = x1Var3.t0;
                if (x60Var != null) {
                    x60Var.u();
                    x1Var3.t0 = null;
                }
                final x60 H = x60.H(x1Var3, view);
                H.Q = true;
                a Q2 = x1Var3.L.Q2();
                H.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new i1(x1Var3, Q2, 5));
                H.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new i1(x1Var3, Q2, 6));
                H.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new i1(x1Var3, Q2, 7));
                H.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new i1(x1Var3, Q2, 8));
                boolean z10 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails);
                int i9 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                o3 o3Var = x1Var3.L;
                Objects.requireNonNull(o3Var);
                H.j(z10, i9, null, string, new b(o3Var, 1));
                boolean m22 = x1Var3.L.m2();
                boolean p22 = x1Var3.L.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        final int i10 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: qh.l1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        x1Var3.L.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        x1Var3.L.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (p22) {
                        final int i11 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: qh.l1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        x1Var3.L.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        x1Var3.L.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                x1Var3.t0 = H;
                break;
            case 7:
                x1 x1Var4 = this.b;
                x60 x60Var2 = x1Var4.t0;
                TL_iv.pageTableCell pagetablecell = null;
                if (x60Var2 != null) {
                    x60Var2.u();
                    x1Var4.t0 = null;
                }
                o3 o3Var2 = x1Var4.L;
                f5 f5Var = o3Var2.e4;
                if (f5Var == null && (R2 = o3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = x1Var4.L.findFocus();
                    if ((findFocus instanceof d1) && (o6 = R2.o((d1) findFocus)) != null) {
                        pagetablecell = o6.b;
                    }
                    if (pagetablecell != null) {
                        x1Var4.L.g2(R2);
                        if (R2.D.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        f5Var = R2;
                    }
                }
                if (f5Var != null && f5Var.getModel() != null && !f5Var.D.isEmpty()) {
                    x1Var4.L.F4(f5Var);
                    break;
                } else {
                    x1Var4.L.R1(s5.u(2, 2));
                    break;
                }
                break;
            case 8:
                x1 x1Var5 = this.b;
                x60 x60Var3 = x1Var5.t0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (x60Var3 != null) {
                    x60Var3.u();
                    x1Var5.t0 = null;
                }
                a Q22 = x1Var5.L.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p.T(x1Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new eb0(22, x1Var5, pageblockmath), x1Var5.getResourceProvider());
                break;
            case 9:
                x1 x1Var6 = this.b;
                x1Var6.L.X3 = null;
                x1Var6.n0(90, 0);
                break;
            case 10:
                x1 x1Var7 = this.b;
                x1Var7.q0();
                li0 li0Var = x1Var7.K0;
                if (li0Var != null) {
                    li0Var.h(true);
                    x1Var7.K0 = null;
                    break;
                }
                break;
            case 11:
                x1 x1Var8 = this.b;
                x1Var8.L.Q4();
                x1Var8.x0();
                break;
            case 12:
                this.b.L.Z3(view);
                break;
            case 13:
                this.b.L.a4();
                break;
            case 14:
                this.b.L.X3();
                break;
            case 15:
                this.b.L.b4();
                break;
            default:
                this.b.m0();
                break;
        }
    }
}
