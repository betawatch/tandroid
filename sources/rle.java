// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class rle {
    public static odc a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (odc) newInstance;
        } catch (IllegalAccessException e) {
            ho9.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            ho9.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ho9.l("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
