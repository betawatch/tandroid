package zc;

import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        dVar.g = e2.k(a10, 2, 2);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
