package xi;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
