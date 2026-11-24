// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q44 extends tp5 {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // tp5
    public final ui6 b() {
        String a = a(e);
        if (a != null) {
            return e(ai5.a(a));
        }
        return null;
    }

    @Override // tp5
    public final char c() {
        return '&';
    }
}
