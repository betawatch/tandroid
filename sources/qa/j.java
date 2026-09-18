package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u a;

    public j(u uVar) {
        this.a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j3 = bVar.f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j3 < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
