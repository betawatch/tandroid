package wh;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q70;
import org.telegram.ui.ti0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ g1(z1 z1Var, int i10) {
        this.a = i10;
        this.b = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i5 Q2;
        l5 o10;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                z1 z1Var = this.b;
                if (!z1Var.M.E2()) {
                    z1Var.finishFragment();
                    break;
                }
                break;
            case 2:
                d2 d2Var = this.b.M.G3;
                if (d2Var != null) {
                    d2Var.k();
                    break;
                }
                break;
            case 3:
                d2 d2Var2 = this.b.M.G3;
                if (d2Var2 != null) {
                    d2Var2.i();
                    break;
                }
                break;
            case 4:
                z1.U(this.b);
                break;
            case 5:
                z1 z1Var2 = this.b;
                if (!z1Var2.y0) {
                    if (z1Var2.x0 == null) {
                        mz mzVar = new mz(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.L, true, z1Var2.getResourceProvider(), false, false);
                        z1Var2.x0 = mzVar;
                        mzVar.setVisibility(8);
                        mz mzVar2 = z1Var2.x0;
                        mzVar2.u2 = false;
                        mzVar2.setDelegate(new q1(z1Var2));
                        int indexOfChild = z1Var2.L.indexOfChild(z1Var2.X);
                        if (indexOfChild < 0) {
                            indexOfChild = z1Var2.L.getChildCount();
                        }
                        FrameLayout.LayoutParams e6 = c6.e(-1, z1Var2.j0(), 87);
                        e6.bottomMargin = z1Var2.Q0;
                        z1Var2.L.addView(z1Var2.x0, indexOfChild, e6);
                    }
                    int j02 = z1Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.x0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = c6.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = z1Var2.Q0;
                    z1Var2.x0.setLayoutParams(layoutParams);
                    z1Var2.x0.setVisibility(0);
                    z1Var2.y0 = true;
                    z1Var2.A0 = j02 + z1Var2.Q0;
                    e1 O2 = z1Var2.M.O2();
                    if (O2 != null) {
                        AndroidUtilities.hideKeyboard(O2);
                    }
                    z1Var2.h0();
                    z1Var2.Y.j(og.d, true);
                    break;
                } else {
                    z1Var2.k0(true);
                    e1 O22 = z1Var2.M.O2();
                    if (O22 != null) {
                        O22.r();
                        AndroidUtilities.showKeyboard(O22);
                        break;
                    }
                }
                break;
            case 6:
                final z1 z1Var3 = this.b;
                q70 q70Var = z1Var3.u0;
                if (q70Var != null) {
                    q70Var.u();
                    z1Var3.u0 = null;
                }
                final q70 H = q70.H(z1Var3, view);
                H.Q = true;
                a P2 = z1Var3.M.P2();
                H.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new j1(z1Var3, P2, 5));
                H.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new j1(z1Var3, P2, 6));
                H.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new j1(z1Var3, P2, 7));
                H.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new j1(z1Var3, P2, 8));
                boolean z4 = P2 != null && (P2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                r3 r3Var = z1Var3.M;
                Objects.requireNonNull(r3Var);
                H.j(z4, i10, null, string, new b(r3Var, 1));
                boolean l22 = z1Var3.M.l2();
                boolean o22 = z1Var3.M.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: wh.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        z1Var3.M.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        z1Var3.M.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (o22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: wh.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        z1Var3.M.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        z1Var3.M.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                z1Var3.u0 = H;
                break;
            case 7:
                z1 z1Var4 = this.b;
                q70 q70Var2 = z1Var4.u0;
                TL_iv.pageTableCell pagetablecell = null;
                if (q70Var2 != null) {
                    q70Var2.u();
                    z1Var4.u0 = null;
                }
                r3 r3Var2 = z1Var4.M;
                i5 i5Var = r3Var2.f4;
                if (i5Var == null && (Q2 = r3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = z1Var4.M.findFocus();
                    if ((findFocus instanceof e1) && (o10 = Q2.o((e1) findFocus)) != null) {
                        pagetablecell = o10.b;
                    }
                    if (pagetablecell != null) {
                        z1Var4.M.f2(Q2);
                        if (Q2.E.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        i5Var = Q2;
                    }
                }
                if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                    z1Var4.M.E4(i5Var);
                    break;
                } else {
                    z1Var4.M.Q1(v5.u(2, 2));
                    break;
                }
                break;
            case 8:
                z1 z1Var5 = this.b;
                q70 q70Var3 = z1Var5.u0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (q70Var3 != null) {
                    q70Var3.u();
                    z1Var5.u0 = null;
                }
                a P22 = z1Var5.M.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                q.U(z1Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new org.telegram.ui.web.a2(21, z1Var5, pageblockmath), z1Var5.getResourceProvider());
                break;
            case 9:
                z1 z1Var6 = this.b;
                z1Var6.M.Y3 = null;
                z1Var6.o0(90, 0);
                break;
            case 10:
                z1 z1Var7 = this.b;
                z1Var7.r0();
                ti0 ti0Var = z1Var7.L0;
                if (ti0Var != null) {
                    ti0Var.h(true);
                    z1Var7.L0 = null;
                    break;
                }
                break;
            case 11:
                z1 z1Var8 = this.b;
                z1Var8.M.P4();
                z1Var8.y0();
                break;
            case 12:
                this.b.M.Y3(view);
                break;
            case 13:
                this.b.M.Z3();
                break;
            case 14:
                this.b.M.W3();
                break;
            case 15:
                this.b.M.a4();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
