// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tne {
    public static pfc a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (pfc) newInstance;
        } catch (IllegalAccessException e) {
            dq9.n("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            dq9.n("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            dq9.n("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
