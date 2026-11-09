package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d a;

    public j(sa.d dVar) {
        this.a = dVar;
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
