package qa;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends t {
    public final pa.m b;

    public u(pa.m mVar, v vVar) {
        super(vVar);
        this.b = mVar;
    }

    @Override // qa.t
    public final Object a() {
        return this.b.p2();
    }

    @Override // qa.t
    public final void c(Object obj, va.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new na.j(u3.c.e("Cannot set value of 'static final' ", sa.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // qa.t
    public final Object b(Object obj) {
        return obj;
    }
}
