package zc;

import bf.p;
import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
