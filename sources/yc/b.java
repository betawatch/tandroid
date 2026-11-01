package yc;

import java.util.regex.Pattern;
import ve.r;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
