package qa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ na.u e;
    public final /* synthetic */ na.u f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public s(String str, Field field, Method method, na.u uVar, na.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f = uVar2;
        this.g = z10;
        this.h = z11;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(va.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new na.j(a4.w.n("Accessor ", sa.c.d(method, false), " threw exception"), e10.getCause());
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
