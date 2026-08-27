package rh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ s3(t3 t3Var, int i10, int i11) {
        this.a = i11;
        this.b = t3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g5 R2;
        j5 o10;
        switch (this.a) {
            case 0:
                this.b.a.a.r.Y3(this.c);
                break;
            default:
                final p pVar = this.b.a.a;
                c6 c6Var = pVar.a;
                p3 p3Var = pVar.r;
                a Q2 = p3Var.Q2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = pVar.n;
                    b70 b70Var = pVar.D;
                    if (b70Var != null) {
                        b70Var.u();
                    }
                    b70 G = b70.G(pVar, c6Var, view, true);
                    G.Q = true;
                    b70 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new gh.m3(G, 7), false);
                    J.k();
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    pVar.P(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = Q2 != null && p3.C3(Q2.b);
                    v1 v1Var = new v1(pVar.getContext(), R.drawable.iv_h1);
                    v1Var.a(z10);
                    G.j(z11, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new gh.f3(G, J, 10));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(pVar, Q2, 5));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(pVar, Q2, 6));
                    boolean z12 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockPullquote);
                    v1 v1Var2 = new v1(pVar.getContext(), R.drawable.iv_pullquote);
                    v1Var2.a(z10);
                    G.j(z12, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new f(pVar, Q2, 7));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(pVar, Q2, 8));
                    boolean z13 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockFooter);
                    v1 v1Var3 = new v1(pVar.getContext(), R.drawable.iv_footer);
                    v1Var3.a(z10);
                    G.j(z13, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new f(pVar, Q2, 9));
                    G.Z();
                    pVar.D = G;
                    break;
                } else if (i10 == 2) {
                    b70 b70Var2 = pVar.D;
                    if (b70Var2 != null) {
                        b70Var2.u();
                    }
                    final b70 F = b70.F(pVar, c6Var, view);
                    F.Q = true;
                    F.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(pVar, Q2, 1));
                    F.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(pVar, Q2, 2));
                    F.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(pVar, Q2, 3));
                    F.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(pVar, Q2, 4));
                    F.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(p3Var, 1));
                    boolean m22 = p3Var.m2();
                    boolean p22 = p3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: rh.g
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
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: rh.g
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
                    pVar.D = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        g5 g5Var = p3Var.e4;
                        if (g5Var == null && (R2 = p3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = p3Var.findFocus();
                            if ((findFocus instanceof d1) && (o10 = R2.o((d1) findFocus)) != null) {
                                pagetablecell = o10.b;
                            }
                            if (pagetablecell != null) {
                                p3Var.g2(R2);
                                if (R2.D.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                g5Var = R2;
                            }
                        }
                        if (g5Var != null && g5Var.getModel() != null && !g5Var.D.isEmpty()) {
                            p3Var.F4(g5Var);
                            break;
                        } else {
                            p3Var.R1(t5.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (Q2 != null) {
                            TL_iv.PageBlock pageBlock = Q2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        p.U(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ib0(20, pVar, pageblockmath), c6Var);
                        break;
                    } else if (i10 == 9) {
                        p3Var.t3();
                        break;
                    }
                }
                break;
        }
    }
}
