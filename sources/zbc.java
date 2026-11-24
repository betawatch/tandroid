// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zbc {
    public final qt a;
    public final qt b;
    public final qt c;

    public zbc(qt qtVar, qt qtVar2, qt qtVar3) {
        this.a = qtVar;
        this.b = qtVar2;
        this.c = qtVar3;
    }

    public abstract acc a();

    public final Class b(Class cls) {
        String name = cls.getName();
        qt qtVar = this.c;
        Class cls2 = (Class) qtVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        qtVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        qt qtVar = this.a;
        Method method = (Method) qtVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, zbc.class.getClassLoader()).getDeclaredMethod("read", zbc.class);
        qtVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        qt qtVar = this.b;
        Method method = (Method) qtVar.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, zbc.class);
        qtVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((acc) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((acc) this).e.readParcelable(acc.class.getClassLoader());
    }

    public final bcc h() {
        String readString = ((acc) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (bcc) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            rjb.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            rjb.k("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            rjb.k("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            rjb.k("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((acc) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((acc) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(bcc bccVar) {
        if (bccVar == null) {
            ((acc) this).e.writeString(null);
            return;
        }
        try {
            ((acc) this).e.writeString(b(bccVar.getClass()).getName());
            acc a = a();
            try {
                d(bccVar.getClass()).invoke(null, bccVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                rjb.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                rjb.k("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                rjb.k("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                rjb.k("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            rjb.k(bccVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
