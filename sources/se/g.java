package se;

import c5.x;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends xe.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final ve.j a = new ve.j();
    public boolean c = false;
    public x d = new x(17, (short) 0);

    public g(Pattern pattern) {
        this.b = pattern;
    }

    @Override // xe.a
    public final void a(CharSequence charSequence) {
        x xVar = this.d;
        StringBuilder sb2 = (StringBuilder) xVar.c;
        if (xVar.b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        xVar.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // xe.a
    public final void d() {
        this.a.g = ((StringBuilder) this.d.c).toString();
        this.d = null;
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final q3.h h(d dVar) {
        if (this.c) {
            return null;
        }
        if (dVar.h && this.b == null) {
            return null;
        }
        return q3.h.a(dVar.b);
    }
}
