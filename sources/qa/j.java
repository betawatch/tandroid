package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final na.d a;

    public j(na.d dVar) {
        this.a = dVar;
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
