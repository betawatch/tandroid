package yc;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // yc.h
    public final df.c b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(ue.b.a(a2));
        }
        return null;
    }

    @Override // yc.h
    public final char d() {
        return '&';
    }
}
