package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class h {
    public i a;
    public p b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.a;
        iVar.g = this.d;
        String c3 = iVar.c(pattern);
        this.d = this.a.g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.a;
        iVar.g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.a;
        iVar.g = this.d;
        iVar.c(i.k);
        this.d = this.a.g;
    }

    public final s f(String str) {
        this.a.getClass();
        return new s(str);
    }
}
