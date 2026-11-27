// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ydc {
    public final qs a;
    public final qs b;
    public final qs c;

    public ydc(qs qsVar, qs qsVar2, qs qsVar3) {
        this.a = qsVar;
        this.b = qsVar2;
        this.c = qsVar3;
    }

    public abstract zdc a();

    public final Class b(Class cls) {
        String name = cls.getName();
        qs qsVar = this.c;
        Class cls2 = (Class) qsVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        qsVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        qs qsVar = this.a;
        Method method = (Method) qsVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ydc.class.getClassLoader()).getDeclaredMethod("read", ydc.class);
        qsVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        qs qsVar = this.b;
        Method method = (Method) qsVar.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, ydc.class);
        qsVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((zdc) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((zdc) this).e.readParcelable(zdc.class.getClassLoader());
    }

    public final aec h() {
        String readString = ((zdc) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (aec) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            grb.j("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            grb.j("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            grb.j("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            grb.j("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((zdc) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((zdc) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(aec aecVar) {
        if (aecVar == null) {
            ((zdc) this).e.writeString(null);
            return;
        }
        try {
            ((zdc) this).e.writeString(b(aecVar.getClass()).getName());
            zdc a = a();
            try {
                d(aecVar.getClass()).invoke(null, aecVar, a);
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
                grb.j("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                grb.j("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                grb.j("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                grb.j("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            grb.j(aecVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
