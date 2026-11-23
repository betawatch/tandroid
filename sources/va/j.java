package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a a;

    public j(z9.a aVar) {
        this.a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j3 = bVar.f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j3 < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
