package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationBadge;
import w7.r;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        this.b = (((SystemClock.uptimeMillis() - this.c) * (10 - r4)) / 10) + ((this.b * r.b(this.d, 0, 9)) / 10);
        this.c = 0L;
        this.d++;
        this.a.edit().putLong("estimated", this.b).putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.d).apply();
    }

    public final float b() {
        if (this.b > 0) {
            return r.a((SystemClock.uptimeMillis() - this.c) / this.b, 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
