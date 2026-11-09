package q2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class w extends IOException {
    public final j2.m a;
    public final Uri b;
    public final Map c;
    public final long d;

    public w(j2.m mVar, Uri uri, Map map, long j3, Exception exc) {
        super(exc);
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j3;
    }
}
