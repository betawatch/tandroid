// default package

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qs6 extends IOException {
    public final n73 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public qs6(n73 n73Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = n73Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
