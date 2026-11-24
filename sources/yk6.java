// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yk6 extends tp5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // tp5
    public final ui6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        su5 su5Var = new su5();
        su5Var.g = ts2.m(1, 1, a);
        return su5Var;
    }

    @Override // tp5
    public final char c() {
        return '$';
    }
}
