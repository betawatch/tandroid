// default package

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
