package wa;

import a8.p0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.b != 0) {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }
}
