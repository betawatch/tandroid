package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationBadge;
import w7.p;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a {
    public final SharedPreferences a;
    public long b;
    public long c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
    }

    public final void a() {
        if (this.c == 0) {
            return;
        }
        this.b = (((SystemClock.uptimeMillis() - this.c) * (10 - r4)) / 10) + ((this.b * p.b(this.d, 0, 9)) / 10);
        this.c = 0L;
        this.d++;
        this.a.edit().putLong("estimated", this.b).putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.d).apply();
    }

    public final float b() {
        if (this.b > 0) {
            return p.a((SystemClock.uptimeMillis() - this.c) / this.b, 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
