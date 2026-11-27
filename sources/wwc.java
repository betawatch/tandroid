// default package

import java.util.TimeZone;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class wwc {
    public static String a;
    public static vwc b;

    public static boolean a() {
        String id = TimeZone.getDefault().getID();
        return (id.startsWith("US/") || "America/Nassau".equals(id) || "America/Belize".equals(id) || "America/Cayman".equals(id) || "Pacific/Palau".equals(id)) ? false : true;
    }
}
