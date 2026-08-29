package qa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class v0 implements na.v {
    @Override // na.v
    public final na.u create(na.g gVar, ua.a aVar) {
        Class cls = aVar.a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new o(cls);
    }
}
