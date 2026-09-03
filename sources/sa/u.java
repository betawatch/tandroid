package sa;

import java.lang.reflect.Field;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends t {
    public final ra.m b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.b = mVar;
    }

    @Override // sa.t
    public final Object a() {
        return this.b.u2();
    }

    @Override // sa.t
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new pa.j(w2.e("Cannot set value of 'static final' ", ua.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // sa.t
    public final Object b(Object obj) {
        return obj;
    }
}
