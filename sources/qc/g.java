package qc;

import java.util.regex.Pattern;
import ne.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends h {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // qc.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ne.d dVar = new ne.d(1);
        dVar.h = a2;
        return dVar;
    }

    @Override // qc.h
    public final char d() {
        return '<';
    }
}
