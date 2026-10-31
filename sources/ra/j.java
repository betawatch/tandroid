package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final hb.a a;

    public j(hb.a aVar) {
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
