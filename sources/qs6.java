// default package

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
