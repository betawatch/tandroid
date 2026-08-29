package qa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements na.v {
    public final /* synthetic */ int a;
    public final oc.i b;

    public /* synthetic */ d(int i10, oc.i iVar) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // na.v
    public final na.u create(na.g gVar, ua.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        oc.i iVar = this.b;
        cls = Object.class;
        switch (i10) {
            case 0:
                Type type = aVar.b;
                Class cls2 = aVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                pa.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = pa.d.j(type, cls2, pa.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new ua.a(cls)), iVar.d2(aVar));
            default:
                Type type2 = aVar.b;
                Class cls3 = aVar.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    pa.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = pa.d.j(type2, cls3, pa.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                na.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new ua.a(type3));
                na.u b11 = gVar.b(new ua.a(actualTypeArguments[1]));
                pa.m d22 = iVar.d2(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, d22);
        }
    }
}
