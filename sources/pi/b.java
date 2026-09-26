package pi;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final Enum b;
    public volatile boolean c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.a = str;
        this.b = r22;
    }

    public final Enum a() {
        if (!this.c) {
            synchronized (this) {
                try {
                    if (!this.c) {
                        SharedPreferences sharedPreferences = d.a;
                        String str = this.a;
                        Enum r22 = this.b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.c = true;
        d.a.edit().putString(this.a, r32.name()).apply();
    }
}
