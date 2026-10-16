package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a a;

    public j(sb.a aVar) {
        this.a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (TextUtils.isEmpty(aVar.c)) {
            return true;
        }
        long j10 = aVar.f + aVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
