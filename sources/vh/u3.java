package vh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u3(v3 v3Var, int i10, int i11) {
        this.a = i11;
        this.b = v3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i5 R2;
        l5 o10;
        switch (this.a) {
            case 0:
                this.b.a.a.r.Y3(this.c);
                break;
            default:
                final p pVar = this.b.a.a;
                f6 f6Var = pVar.a;
                r3 r3Var = pVar.r;
                a Q2 = r3Var.Q2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = pVar.n;
                    o70 o70Var = pVar.E;
                    if (o70Var != null) {
                        o70Var.u();
                    }
                    o70 G = o70.G(pVar, f6Var, view, true);
                    G.Q = true;
                    o70 J = G.J();
                    boolean z4 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kh.g3(G, 7), false);
                    J.k();
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z10 = Q2 != null && r3.C3(Q2.b);
                    w1 w1Var = new w1(pVar.getContext(), R.drawable.iv_h1);
                    w1Var.a(z4);
                    G.j(z10, 0, w1Var, LocaleController.getString(R.string.ArticleHeading), new kh.z2(G, J, 10));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(pVar, Q2, 5));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(pVar, Q2, 6));
                    boolean z11 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockPullquote);
                    w1 w1Var2 = new w1(pVar.getContext(), R.drawable.iv_pullquote);
                    w1Var2.a(z4);
                    G.j(z11, 0, w1Var2, LocaleController.getString(R.string.ArticlePullquote), new f(pVar, Q2, 7));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(pVar, Q2, 8));
                    boolean z12 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockFooter);
                    w1 w1Var3 = new w1(pVar.getContext(), R.drawable.iv_footer);
                    w1Var3.a(z4);
                    G.j(z12, 0, w1Var3, LocaleController.getString(R.string.ArticleFooter), new f(pVar, Q2, 9));
                    G.Z();
                    pVar.E = G;
                    break;
                } else if (i10 == 2) {
                    o70 o70Var2 = pVar.E;
                    if (o70Var2 != null) {
                        o70Var2.u();
                    }
                    final o70 F = o70.F(pVar, f6Var, view);
                    F.Q = true;
                    F.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(pVar, Q2, 1));
                    F.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(pVar, Q2, 2));
                    F.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(pVar, Q2, 3));
                    F.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(pVar, Q2, 4));
                    F.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(r3Var, 1));
                    boolean m22 = r3Var.m2();
                    boolean p22 = r3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: vh.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            pVar.r.r3(false);
                                            F.u();
                                            break;
                                        default:
                                            pVar.r.r3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (p22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: vh.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            pVar.r.r3(false);
                                            F.u();
                                            break;
                                        default:
                                            pVar.r.r3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    pVar.E = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        i5 i5Var = r3Var.f4;
                        if (i5Var == null && (R2 = r3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = r3Var.findFocus();
                            if ((findFocus instanceof d1) && (o10 = R2.o((d1) findFocus)) != null) {
                                pagetablecell = o10.b;
                            }
                            if (pagetablecell != null) {
                                r3Var.g2(R2);
                                if (R2.E.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                i5Var = R2;
                            }
                        }
                        if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                            r3Var.F4(i5Var);
                            break;
                        } else {
                            r3Var.R1(v5.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (Q2 != null) {
                            TL_iv.PageBlock pageBlock = Q2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        p.U(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new org.telegram.ui.web.u1(20, pVar, pageblockmath), f6Var);
                        break;
                    } else if (i10 == 9) {
                        r3Var.t3();
                        break;
                    }
                }
                break;
        }
    }
}
