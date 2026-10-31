package tc;

import c3.i0;
import java.util.regex.Pattern;
import yc.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
