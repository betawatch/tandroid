package tc;

import c3.i0;
import java.util.regex.Pattern;
import yc.h;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // yc.h
    public final df.c b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = i0.m(2, 2, a2);
        return dVar;
    }

    @Override // yc.h
    public final char d() {
        return '$';
    }
}
