// default package

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
