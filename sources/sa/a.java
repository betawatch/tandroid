package sa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class a implements pa.v {
    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Type type = aVar.b;
        boolean z4 = type instanceof GenericArrayType;
        if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(gVar, gVar.b(new wa.a(genericComponentType)), ra.d.h(genericComponentType));
    }
}
