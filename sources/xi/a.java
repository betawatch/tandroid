package xi;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;

    public a(String str) {
        this.a = str;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                SharedPreferences sharedPreferences = d.a;
                this.c = sharedPreferences.contains(this.a);
                this.d = sharedPreferences.getBoolean(this.a, true);
                this.b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.c = true;
        this.b = true;
        d.a.edit().putBoolean(this.a, z9).apply();
    }
}
