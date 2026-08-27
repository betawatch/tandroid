package pa;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u extends t {
    public final oa.m b;

    public u(oa.m mVar, v vVar) {
        super(vVar);
        this.b = mVar;
    }

    @Override // pa.t
    public final Object a() {
        return this.b.f2();
    }

    @Override // pa.t
    public final void c(Object obj, ua.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new ma.j(s3.c.e("Cannot set value of 'static final' ", ra.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // pa.t
    public final Object b(Object obj) {
        return obj;
    }
}
