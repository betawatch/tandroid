package pi;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
