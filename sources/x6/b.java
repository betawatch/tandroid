package x6;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import n6.l;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class b extends b8.b implements a {
    public final Object b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 7);
        this.b = obj;
    }

    public static a K0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new f(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 7);
    }

    public static Object L0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(i2.d.j(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        l.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e7) {
            throw new IllegalArgumentException("Binder object is null.", e7);
        }
    }
}
