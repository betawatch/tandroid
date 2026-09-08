package p4;

import android.media.MediaRoute2Info;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class w {
    public static void a(MediaRoute2Info.Builder builder, m mVar) {
        if (mVar.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(mVar.a());
        }
    }

    public static Set<String> b(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void d(MediaRoute2Info.Builder builder, Set<String> set) {
        builder.setDeduplicationIds(set);
    }

    public static void e(MediaRoute2Info.Builder builder, int i10) {
        builder.setType(i10);
    }
}
