package s4;

import android.media.MediaRoute2Info;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    public static void e(MediaRoute2Info.Builder builder, int i7) {
        builder.setType(i7);
    }
}
