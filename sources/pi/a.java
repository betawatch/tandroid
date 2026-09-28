package pi;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
