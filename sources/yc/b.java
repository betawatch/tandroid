package yc;

import java.util.regex.Pattern;
import ve.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Pattern e = i.m;

    @Override // yc.h
    public final df.c b() {
        this.d++;
        if (c() == '\n') {
            ve.g gVar = new ve.g(1);
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
                r rVar = new r(str2.substring(i11, i11 + 1));
                this.d++;
                return rVar;
            }
        }
        return f("\\");
    }

    @Override // yc.h
    public final char d() {
        return '\\';
    }
}
