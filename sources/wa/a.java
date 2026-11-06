package wa;

import a8.p0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
