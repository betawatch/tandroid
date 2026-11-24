// default package

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t8c {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static t8c c;
    public final c6e a;

    public t8c(c6e c6eVar) {
        this.a = c6eVar;
    }

    public final boolean a(ga0 ga0Var) {
        if (TextUtils.isEmpty(ga0Var.c)) {
            return true;
        }
        long j = ga0Var.f + ga0Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
