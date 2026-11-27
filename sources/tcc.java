// default package

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tcc {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static tcc c;
    public final sae a;

    public tcc(sae saeVar) {
        this.a = saeVar;
    }

    public final boolean a(ia0 ia0Var) {
        if (TextUtils.isEmpty(ia0Var.c)) {
            return true;
        }
        long j = ia0Var.f + ia0Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
