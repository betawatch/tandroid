// default package

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ui6 extends ild {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public ui6(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // ild
    public final void a(ik0 ik0Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(ik0Var);
        } finally {
            this.a--;
        }
    }

    @Override // ild
    public final void b(x01 x01Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(x01Var);
        } finally {
            this.a--;
        }
    }

    @Override // ild
    public final void c(cj2 cj2Var) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = xi6.l(cj2Var.h);
        w(textfixed);
    }

    @Override // ild
    public final void d(o43 o43Var) {
        if (o43Var instanceof x8b) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(o43Var);
            w(textstrike);
        } else if (o43Var instanceof ts5) {
            w(xi6.h(((ts5) o43Var).g));
        } else {
            v(o43Var);
        }
    }

    @Override // ild
    public final void e(u14 u14Var) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(u14Var);
        w(textitalic);
    }

    @Override // ild
    public final void i(bk5 bk5Var) {
        w(y(bk5Var));
    }

    @Override // ild
    public final void k(y46 y46Var) {
        if (!(y46Var instanceof qs5)) {
            v(y46Var);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(xi6.l("\n"));
        }
        w(xi6.h(((qs5) y46Var).g));
        w(xi6.l("\n"));
    }

    @Override // ild
    public final void l(f56 f56Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(f56Var);
        } finally {
            this.a--;
        }
    }

    @Override // ild
    public final void m(xq7 xq7Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(xq7Var);
        } finally {
            this.a--;
        }
    }

    @Override // ild
    public final void n(tu7 tu7Var) {
        if (!this.c.texts.isEmpty()) {
            w(xi6.l("\n\n"));
        }
        v(tu7Var);
    }

    @Override // ild
    public final void o(ugb ugbVar) {
        w(xi6.l(ugbVar.g));
    }

    @Override // ild
    public final void q(cj2 cj2Var) {
        w(xi6.l(cj2Var.h));
    }

    @Override // ild
    public final void r(u14 u14Var) {
        w(xi6.l("\n"));
    }

    @Override // ild
    public final void s(bk5 bk5Var) {
        String str = bk5Var.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(bk5Var);
            textemail.email = trim.substring(7);
            w(textemail);
            return;
        }
        if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(bk5Var);
            textphone.phone = trim.substring(4);
            w(textphone);
            return;
        }
        TL_iv.RichText texturl = new TL_iv.textUrl();
        texturl.text = y(bk5Var);
        texturl.url = trim;
        w(texturl);
    }

    @Override // ild
    public final void t(u14 u14Var) {
        w(xi6.l(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // ild
    public final void u(u14 u14Var) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(u14Var);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(tg6 tg6Var) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(tg6Var);
        TL_iv.RichText x = x(this.c);
        this.c = textconcat;
        return x;
    }
}
