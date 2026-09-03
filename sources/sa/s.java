package sa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ pa.u e;
    public final /* synthetic */ pa.u f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public s(String str, Field field, Method method, pa.u uVar, pa.u uVar2, boolean z4, boolean z10) {
        this.d = method;
        this.e = uVar;
        this.f = uVar2;
        this.g = z4;
        this.h = z10;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(xa.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new pa.j(android.support.v4.media.a.o("Accessor ", ua.c.d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.a);
        this.e.write(bVar, obj2);
    }
}
