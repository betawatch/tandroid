package vf;

import a8.ee;
import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        this.b = (((SystemClock.uptimeMillis() - this.c) * (10 - r4)) / 10) + ((this.b * ee.b(this.d, 0, 9)) / 10);
        this.c = 0L;
        this.d++;
        this.a.edit().putLong("estimated", this.b).putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.d).apply();
    }

    public final float b() {
        if (this.b > 0) {
            return ee.a((SystemClock.uptimeMillis() - this.c) / this.b, 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
