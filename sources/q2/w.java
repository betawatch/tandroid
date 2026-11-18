package q2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
