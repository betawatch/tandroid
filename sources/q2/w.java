package q2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
