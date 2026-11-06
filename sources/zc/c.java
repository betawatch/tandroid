package zc;

import ed.h;
import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // ed.h
    public final p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = com.google.android.recaptcha.internal.a.k(a10, 2, 2);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
