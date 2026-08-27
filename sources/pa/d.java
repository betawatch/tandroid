package pa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements ma.v {
    public final /* synthetic */ int a;
    public final g5.b b;

    public /* synthetic */ d(g5.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // ma.v
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        g5.b bVar = this.b;
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
                oa.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = oa.d.j(type, cls2, oa.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new ta.a(cls)), bVar.l(aVar));
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
                    oa.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = oa.d.j(type2, cls3, oa.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                ma.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new ta.a(type3));
                ma.u b11 = gVar.b(new ta.a(actualTypeArguments[1]));
                oa.m l10 = bVar.l(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, l10);
        }
    }
}
