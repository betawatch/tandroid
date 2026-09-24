package pi;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public volatile boolean b;
    public volatile boolean c;

    public a(String str) {
        this.a = str;
    }

    public final boolean a() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.c = d.a.getBoolean(this.a, true);
                        this.b = true;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final synchronized void b(boolean z10) {
        this.c = z10;
        this.b = true;
        d.a.edit().putBoolean(this.a, z10).apply();
    }
}
