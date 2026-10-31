package xa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q {
    public static WeakReference d;
    public final SharedPreferences a;
    public bh.d b;
    public final ScheduledThreadPoolExecutor c;

    public q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized p a() {
        p pVar;
        String H = this.b.H();
        Pattern pattern = p.d;
        pVar = null;
        if (!TextUtils.isEmpty(H)) {
            String[] split = H.split("!", -1);
            if (split.length == 2) {
                pVar = new p(split[0], split[1]);
            }
        }
        return pVar;
    }

    public final synchronized void b() {
        this.b = bh.d.o(this.a, this.c);
    }

    public final synchronized void c(p pVar) {
        this.b.I(pVar.c);
    }
}
