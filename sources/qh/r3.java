package qh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.x60;
import org.telegram.ui.eb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r3(s3 s3Var, int i9, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = i9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f5 R2;
        i5 o6;
        switch (this.a) {
            case 0:
                this.b.a.a.r.Y3(this.c);
                break;
            default:
                final p pVar = this.b.a.a;
                b6 b6Var = pVar.a;
                o3 o3Var = pVar.r;
                a Q2 = o3Var.Q2();
                int i9 = this.c;
                if (i9 == 1) {
                    int i10 = pVar.n;
                    x60 x60Var = pVar.D;
                    if (x60Var != null) {
                        x60Var.u();
                    }
                    x60 G = x60.G(pVar, b6Var, view, true);
                    G.Q = true;
                    x60 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fh.r3(G, 7), false);
                    J.k();
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    pVar.O(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = Q2 != null && o3.C3(Q2.b);
                    v1 v1Var = new v1(pVar.getContext(), R.drawable.iv_h1);
                    v1Var.a(z10);
                    G.j(z11, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new fh.k3(G, J, 10));
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
                } else if (i9 == 2) {
                    x60 x60Var2 = pVar.D;
                    if (x60Var2 != null) {
                        x60Var2.u();
                    }
                    final x60 F = x60.F(pVar, b6Var, view);
                    F.Q = true;
                    F.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(pVar, Q2, 1));
                    F.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(pVar, Q2, 2));
                    F.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(pVar, Q2, 3));
                    F.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(pVar, Q2, 4));
                    F.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(o3Var, 1));
                    boolean m22 = o3Var.m2();
                    boolean p22 = o3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            final int i11 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: qh.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
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
                            final int i12 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: qh.g
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
                    if (i9 == 4) {
                        f5 f5Var = o3Var.e4;
                        if (f5Var == null && (R2 = o3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = o3Var.findFocus();
                            if ((findFocus instanceof d1) && (o6 = R2.o((d1) findFocus)) != null) {
                                pagetablecell = o6.b;
                            }
                            if (pagetablecell != null) {
                                o3Var.g2(R2);
                                if (R2.D.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                f5Var = R2;
                            }
                        }
                        if (f5Var != null && f5Var.getModel() != null && !f5Var.D.isEmpty()) {
                            o3Var.F4(f5Var);
                            break;
                        } else {
                            o3Var.R1(s5.u(2, 2));
                            break;
                        }
                    } else if (i9 == 7) {
                        if (Q2 != null) {
                            TL_iv.PageBlock pageBlock = Q2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        p.T(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new eb0(20, pVar, pageblockmath), b6Var);
                        break;
                    } else if (i9 == 9) {
                        o3Var.t3();
                        break;
                    }
                }
                break;
        }
    }
}
