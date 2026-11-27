// default package

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zk6 extends zpd {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public zk6(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // zpd
    public final void a(jk0 jk0Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(jk0Var);
        } finally {
            this.a--;
        }
    }

    @Override // zpd
    public final void b(g11 g11Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(g11Var);
        } finally {
            this.a--;
        }
    }

    @Override // zpd
    public final void c(yj2 yj2Var) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = cl6.l(yj2Var.h);
        w(textfixed);
    }

    @Override // zpd
    public final void d(g53 g53Var) {
        if (g53Var instanceof vcb) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(g53Var);
            w(textstrike);
        } else if (g53Var instanceof wu5) {
            w(cl6.h(((wu5) g53Var).g));
        } else {
            v(g53Var);
        }
    }

    @Override // zpd
    public final void e(p24 p24Var) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(p24Var);
        w(textitalic);
    }

    @Override // zpd
    public final void i(em5 em5Var) {
        w(y(em5Var));
    }

    @Override // zpd
    public final void k(c76 c76Var) {
        if (!(c76Var instanceof tu5)) {
            v(c76Var);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(cl6.l("\n"));
        }
        w(cl6.h(((tu5) c76Var).g));
        w(cl6.l("\n"));
    }

    @Override // zpd
    public final void l(j76 j76Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(j76Var);
        } finally {
            this.a--;
        }
    }

    @Override // zpd
    public final void m(du7 du7Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(du7Var);
        } finally {
            this.a--;
        }
    }

    @Override // zpd
    public final void n(ay7 ay7Var) {
        if (!this.c.texts.isEmpty()) {
            w(cl6.l("\n\n"));
        }
        v(ay7Var);
    }

    @Override // zpd
    public final void o(qkb qkbVar) {
        w(cl6.l(qkbVar.g));
    }

    @Override // zpd
    public final void q(yj2 yj2Var) {
        w(cl6.l(yj2Var.h));
    }

    @Override // zpd
    public final void r(p24 p24Var) {
        w(cl6.l("\n"));
    }

    @Override // zpd
    public final void s(em5 em5Var) {
        String str = em5Var.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(em5Var);
            textemail.email = trim.substring(7);
            w(textemail);
            return;
        }
        if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(em5Var);
            textphone.phone = trim.substring(4);
            w(textphone);
            return;
        }
        TL_iv.RichText texturl = new TL_iv.textUrl();
        texturl.text = y(em5Var);
        texturl.url = trim;
        w(texturl);
    }

    @Override // zpd
    public final void t(p24 p24Var) {
        w(cl6.l(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // zpd
    public final void u(p24 p24Var) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(p24Var);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(yi6 yi6Var) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(yi6Var);
        TL_iv.RichText x = x(this.c);
        this.c = textconcat;
        return x;
    }
}
