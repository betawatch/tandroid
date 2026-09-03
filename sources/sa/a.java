package sa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
