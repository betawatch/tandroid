// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
