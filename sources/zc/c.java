package zc;

import bf.p;
import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = e2.i(2, 2, a2);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
