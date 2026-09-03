package wh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        i5 Q2;
        l5 o10;
        switch (this.a) {
            case 0:
                this.b.a.a.r.X3(this.c);
                break;
            default:
                final q qVar = this.b.a.a;
                g6 g6Var = qVar.a;
                r3 r3Var = qVar.r;
                a P2 = r3Var.P2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = qVar.n;
                    q70 q70Var = qVar.E;
                    if (q70Var != null) {
                        q70Var.u();
                    }
                    q70 G = q70.G(qVar, g6Var, view, true);
                    G.Q = true;
                    q70 J = G.J();
                    boolean z4 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lh.g3(G, 7), false);
                    J.k();
                    qVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z10 = P2 != null && r3.B3(P2.b);
                    x1 x1Var = new x1(qVar.getContext(), R.drawable.iv_h1);
                    x1Var.a(z4);
                    G.j(z10, 0, x1Var, LocaleController.getString(R.string.ArticleHeading), new lh.y2(G, J, 10));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(qVar, P2, 5));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(qVar, P2, 6));
                    boolean z11 = P2 != null && (P2.b instanceof TL_iv.pageBlockPullquote);
                    x1 x1Var2 = new x1(qVar.getContext(), R.drawable.iv_pullquote);
                    x1Var2.a(z4);
                    G.j(z11, 0, x1Var2, LocaleController.getString(R.string.ArticlePullquote), new g(qVar, P2, 7));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(qVar, P2, 8));
                    boolean z12 = P2 != null && (P2.b instanceof TL_iv.pageBlockFooter);
                    x1 x1Var3 = new x1(qVar.getContext(), R.drawable.iv_footer);
                    x1Var3.a(z4);
                    G.j(z12, 0, x1Var3, LocaleController.getString(R.string.ArticleFooter), new g(qVar, P2, 9));
                    G.Z();
                    qVar.E = G;
                    break;
                } else if (i10 == 2) {
                    q70 q70Var2 = qVar.E;
                    if (q70Var2 != null) {
                        q70Var2.u();
                    }
                    final q70 F = q70.F(qVar, g6Var, view);
                    F.Q = true;
                    F.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(qVar, P2, 1));
                    F.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(qVar, P2, 2));
                    F.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(qVar, P2, 3));
                    F.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(qVar, P2, 4));
                    F.j(P2 != null && (P2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(r3Var, 1));
                    boolean l22 = r3Var.l2();
                    boolean o22 = r3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: wh.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            qVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            qVar.r.q3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (o22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: wh.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            qVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            qVar.r.q3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    qVar.E = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        i5 i5Var = r3Var.f4;
                        if (i5Var == null && (Q2 = r3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = r3Var.findFocus();
                            if ((findFocus instanceof e1) && (o10 = Q2.o((e1) findFocus)) != null) {
                                pagetablecell = o10.b;
                            }
                            if (pagetablecell != null) {
                                r3Var.f2(Q2);
                                if (Q2.E.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                i5Var = Q2;
                            }
                        }
                        if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                            r3Var.E4(i5Var);
                            break;
                        } else {
                            r3Var.Q1(v5.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (P2 != null) {
                            TL_iv.PageBlock pageBlock = P2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        q.U(qVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new org.telegram.ui.web.a2(19, qVar, pageblockmath), g6Var);
                        break;
                    } else if (i10 == 9) {
                        r3Var.s3();
                        break;
                    }
                }
                break;
        }
    }
}
