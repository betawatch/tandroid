package sa;

import java.lang.reflect.Field;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u extends t {
    public final ra.m b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.b = mVar;
    }

    @Override // sa.t
    public final Object a() {
        return this.b.s2();
    }

    @Override // sa.t
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new pa.j(v2.e("Cannot set value of 'static final' ", ua.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // sa.t
    public final Object b(Object obj) {
        return obj;
    }
}
