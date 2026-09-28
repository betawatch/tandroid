package zc;

import bf.p;
import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
