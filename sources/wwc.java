// default package

import java.util.TimeZone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class wwc {
    public static String a;
    public static vwc b;

    public static boolean a() {
        String id = TimeZone.getDefault().getID();
        return (id.startsWith("US/") || "America/Nassau".equals(id) || "America/Belize".equals(id) || "America/Cayman".equals(id) || "Pacific/Palau".equals(id)) ? false : true;
    }
}
