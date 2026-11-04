package za;

import android.content.SharedPreferences;
import android.text.TextUtils;
import b8.ke;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public static WeakReference d;
    public final SharedPreferences a;
    public ke b;
    public final ScheduledThreadPoolExecutor c;

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized s a() {
        s sVar;
        String C = this.b.C();
        Pattern pattern = s.d;
        sVar = null;
        if (!TextUtils.isEmpty(C)) {
            String[] split = C.split("!", -1);
            if (split.length == 2) {
                sVar = new s(split[0], split[1]);
            }
        }
        return sVar;
    }

    public final synchronized void b() {
        this.b = ke.l(this.a, this.c);
    }

    public final synchronized void c(s sVar) {
        this.b.H(sVar.c);
    }
}
