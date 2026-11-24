// default package

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
