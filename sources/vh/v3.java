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
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v3(w3 w3Var, int i10, int i11) {
        this.a = i11;
        this.b = w3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j5 Q2;
        m5 o10;
        switch (this.a) {
            case 0:
                this.b.a.a.r.X3(this.c);
                break;
            default:
                final q qVar = this.b.a.a;
                f6 f6Var = qVar.a;
                s3 s3Var = qVar.r;
                a P2 = s3Var.P2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = qVar.n;
                    p70 p70Var = qVar.E;
                    if (p70Var != null) {
                        p70Var.u();
                    }
                    p70 G = p70.G(qVar, f6Var, view, true);
                    G.Q = true;
                    p70 J = G.J();
                    boolean z4 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kh.f3(G, 7), false);
                    J.k();
                    qVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    qVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z10 = P2 != null && s3.B3(P2.b);
                    w1 w1Var = new w1(qVar.getContext(), R.drawable.iv_h1);
                    w1Var.a(z4);
                    G.j(z10, 0, w1Var, LocaleController.getString(R.string.ArticleHeading), new kh.y2(G, J, 10));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(qVar, P2, 5));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(qVar, P2, 6));
                    boolean z11 = P2 != null && (P2.b instanceof TL_iv.pageBlockPullquote);
                    w1 w1Var2 = new w1(qVar.getContext(), R.drawable.iv_pullquote);
                    w1Var2.a(z4);
                    G.j(z11, 0, w1Var2, LocaleController.getString(R.string.ArticlePullquote), new g(qVar, P2, 7));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(qVar, P2, 8));
                    boolean z12 = P2 != null && (P2.b instanceof TL_iv.pageBlockFooter);
                    w1 w1Var3 = new w1(qVar.getContext(), R.drawable.iv_footer);
                    w1Var3.a(z4);
                    G.j(z12, 0, w1Var3, LocaleController.getString(R.string.ArticleFooter), new g(qVar, P2, 9));
                    G.Z();
                    qVar.E = G;
                    break;
                } else if (i10 == 2) {
                    p70 p70Var2 = qVar.E;
                    if (p70Var2 != null) {
                        p70Var2.u();
                    }
                    final p70 F = p70.F(qVar, f6Var, view);
                    F.Q = true;
                    F.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(qVar, P2, 1));
                    F.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(qVar, P2, 2));
                    F.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(qVar, P2, 3));
                    F.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(qVar, P2, 4));
                    F.j(P2 != null && (P2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(s3Var, 1));
                    boolean l22 = s3Var.l2();
                    boolean o22 = s3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: vh.h
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
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: vh.h
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
                        j5 j5Var = s3Var.f4;
                        if (j5Var == null && (Q2 = s3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = s3Var.findFocus();
                            if ((findFocus instanceof e1) && (o10 = Q2.o((e1) findFocus)) != null) {
                                pagetablecell = o10.b;
                            }
                            if (pagetablecell != null) {
                                s3Var.f2(Q2);
                                if (Q2.E.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                j5Var = Q2;
                            }
                        }
                        if (j5Var != null && j5Var.getModel() != null && !j5Var.E.isEmpty()) {
                            s3Var.E4(j5Var);
                            break;
                        } else {
                            s3Var.Q1(w5.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (P2 != null) {
                            TL_iv.PageBlock pageBlock = P2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        q.U(qVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ph.s1(18, qVar, pageblockmath), f6Var);
                        break;
                    } else if (i10 == 9) {
                        s3Var.s3();
                        break;
                    }
                }
                break;
        }
    }
}
