package zc;

import ed.h;
import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
