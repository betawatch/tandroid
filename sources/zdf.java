// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class zdf {
    public static xye a;

    public static synchronized hdf a(kcf kcfVar) {
        hdf hdfVar;
        synchronized (zdf.class) {
            xye xyeVar = a;
            if (xyeVar == null) {
                xyeVar = new xye((byte) 3);
                a = xyeVar;
            }
            hdfVar = (hdf) xyeVar.c(kcfVar);
        }
        return hdfVar;
    }
}
