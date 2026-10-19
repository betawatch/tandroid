package y2;

import java.io.IOException;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class k extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(Throwable th2) {
        super(r0.toString(), th2);
        String str;
        StringBuilder sb2 = new StringBuilder("Unexpected ");
        sb2.append(th2.getClass().getSimpleName());
        if (th2.getMessage() != null) {
            str = ": " + th2.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
    }
}
