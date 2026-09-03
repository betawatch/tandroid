package sa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements pa.v {
    public final /* synthetic */ int a;
    public final q5.c0 b;

    public /* synthetic */ d(int i10, q5.c0 c0Var) {
        this.a = i10;
        this.b = c0Var;
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        q5.c0 c0Var = this.b;
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
                ra.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = ra.d.j(type, cls2, ra.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new wa.a(cls)), c0Var.z(aVar));
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
                    ra.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = ra.d.j(type2, cls3, ra.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                pa.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new wa.a(type3));
                pa.u b11 = gVar.b(new wa.a(actualTypeArguments[1]));
                ra.m z4 = c0Var.z(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, z4);
        }
    }
}
