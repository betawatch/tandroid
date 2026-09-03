package qh;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ie0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class xa {
    public static String a;
    public static wa b;

    public static void a(boolean z4, Utilities.Callback callback) {
        ie0.e(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new mh.m6(6, new mh.m6(5, callback, z4), z4));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        return (id2.startsWith("US/") || "America/Nassau".equals(id2) || "America/Belize".equals(id2) || "America/Cayman".equals(id2) || "Pacific/Palau".equals(id2)) ? false : true;
    }
}
