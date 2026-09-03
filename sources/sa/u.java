package sa;

import java.lang.reflect.Field;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u extends t {
    public final ra.m b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.b = mVar;
    }

    @Override // sa.t
    public final Object a() {
        return this.b.y2();
    }

    @Override // sa.t
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new pa.j(yh.k("Cannot set value of 'static final' ", ua.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // sa.t
    public final Object b(Object obj) {
        return obj;
    }
}
