package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = i.m;

    @Override // qc.h
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ne.g gVar = new ne.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.c;
                int i11 = this.d;
                this.a.getClass();
                s sVar = new s(str2.substring(i11, i11 + 1));
                this.d++;
                return sVar;
            }
        }
        return f("\\");
    }

    @Override // qc.h
    public final char d() {
        return '\\';
    }
}
