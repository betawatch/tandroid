// default package

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uac {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static uac c;
    public final f8e a;

    public uac(f8e f8eVar) {
        this.a = f8eVar;
    }

    public final boolean a(gb0 gb0Var) {
        if (TextUtils.isEmpty(gb0Var.c)) {
            return true;
        }
        long j = gb0Var.f + gb0Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
