package w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import e0.p0;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g {
    public static final ArrayMap a;
    public static final ArrayMap b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, e eVar) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new f("Bundle is missing the collection", eVar);
        }
        int size = parcelableArrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = parcelableArrayList.get(i9);
            i9++;
            abstractCollection.add(f((Bundle) ((Parcelable) obj), eVar));
        }
    }

    public static Object b(Bundle bundle, e eVar) {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new f(aa.d.o("Missing enum name [", string, "]"), eVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new f(aa.d.o("Missing enum className [", string2, "]"), eVar);
        }
        try {
            return g(Class.forName(string2), "valueOf", eVar).invoke(null, string);
        } catch (ClassNotFoundException e10) {
            throw new f(aa.d.o("Enum class [", string2, "] not found"), eVar, e10);
        } catch (IllegalArgumentException e11) {
            throw new f(j2.h("Enum value [", string, "] does not exist in enum class [", string2, "]"), eVar, e11);
        } catch (ReflectiveOperationException e12) {
            throw new f(aa.d.o("Enum of class [", string2, "] missing valueOf method"), eVar, e12);
        }
    }

    public static Object c(Bundle bundle, e eVar) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new f("Bundle is missing the binder", eVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new f("Bundle is missing IInterface class name", eVar);
        }
        try {
            Object invoke = g(Class.forName(string), "asInterface", eVar).invoke(null, binder);
            if (invoke != null) {
                return invoke;
            }
            throw new f("Failed to get interface from binder", eVar);
        } catch (ClassNotFoundException e10) {
            throw new f("Binder for unknown IInterface: ".concat(string), eVar, e10);
        } catch (ReflectiveOperationException e11) {
            throw new f("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), eVar, e11);
        }
    }

    public static HashMap d(Bundle bundle, e eVar) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new f("Bundle is missing the map", eVar);
        }
        HashMap hashMap = new HashMap();
        int size = parcelableArrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = parcelableArrayList.get(i9);
            i9++;
            Bundle bundle2 = (Bundle) ((Parcelable) obj);
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new f("Bundle is missing key", eVar);
            }
            hashMap.put(f(bundle3, eVar), bundle4 == null ? null : f(bundle4, eVar));
        }
        return hashMap;
    }

    public static Object e(Bundle bundle, e eVar) {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new f("Bundle is missing the class name", eVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(null);
            ArrayList h = h(cls);
            int size = h.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = h.get(i9);
                i9++;
                Field field = (Field) obj;
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj2 = bundle.get(str);
                if (obj2 == null) {
                    obj2 = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj2 instanceof Bundle) {
                    field.set(newInstance, f((Bundle) obj2, eVar));
                } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return newInstance;
        } catch (ClassNotFoundException e10) {
            throw new f("Object for unknown class: ".concat(string), eVar, e10);
        } catch (IllegalArgumentException e11) {
            throw new f("Failed to deserialize class: ".concat(string), eVar, e11);
        } catch (NoSuchMethodException e12) {
            throw new f("Object missing no args constructor: ".concat(string), eVar, e12);
        } catch (ReflectiveOperationException e13) {
            throw new f("Constructor or field is not accessible: ".concat(string), eVar, e13);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)|4|(2:5|6)|65|66|67|68|69|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f8, code lost:
    
        r4.addSuppressed(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(Bundle bundle, e eVar) {
        ClassLoader classLoader = g.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i9 = bundle.getInt("tag_class_type");
        String str = (String) b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        e eVar2 = new e(bundle, str, eVar.b);
        try {
            switch (i9) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new f("Bundle is missing the primitive value", eVar2);
                    }
                    eVar2.close();
                    return obj;
                case 1:
                    Object c10 = c(bundle, eVar2);
                    eVar2.close();
                    return c10;
                case 2:
                    HashMap d = d(bundle, eVar2);
                    eVar2.close();
                    return d;
                case 3:
                    HashSet hashSet = new HashSet();
                    a(bundle, hashSet, eVar2);
                    eVar2.close();
                    return hashSet;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    a(bundle, arrayList, eVar2);
                    eVar2.close();
                    return arrayList;
                case 5:
                    Object e10 = e(bundle, eVar2);
                    eVar2.close();
                    return e10;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 == null) {
                        throw new f("IconCompat bundle is null", eVar2);
                    }
                    IconCompat a2 = IconCompat.a(bundle2);
                    if (a2 == null) {
                        throw new f("Failed to create IconCompat from bundle", eVar2);
                    }
                    eVar2.close();
                    return a2;
                case 7:
                    Object b10 = b(bundle, eVar2);
                    eVar2.close();
                    return b10;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new f("Class is missing the class name", eVar2);
                    }
                    try {
                        Class<?> cls = Class.forName(string);
                        eVar2.close();
                        return cls;
                    } catch (ClassNotFoundException e11) {
                        throw new f("Class name is unknown: ".concat(string), eVar2, e11);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new f("Bundle is missing the binder", eVar2);
                    }
                    eVar2.close();
                    return binder;
                case 10:
                    p0 a3 = p0.a(bundle);
                    eVar2.close();
                    return a3;
                default:
                    throw new f("Unsupported class type in bundle: " + i9, eVar2);
            }
        } catch (Throwable th) {
            eVar2.close();
            throw th;
        }
        eVar2.close();
        throw th;
    }

    public static Method g(Class cls, String str, e eVar) {
        if (cls == null || cls == Object.class) {
            throw new f("No method " + str + " in class " + cls, eVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return g(cls.getSuperclass(), str, eVar);
    }

    public static ArrayList h(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(h(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static String i(Class cls) {
        String str = (String) a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    public static Bundle j(Collection collection, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(o(it.next(), "<item " + i9 + ">", eVar));
            i9++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, e eVar) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", eVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e10) {
            throw new f("Enum missing name method", eVar, e10);
        }
    }

    public static Bundle l(Map map, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i9 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", o(entry.getKey(), "<key " + i9 + ">", eVar));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", o(entry.getValue(), "<value " + i9 + ">", eVar));
            }
            i9++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, e eVar) {
        String name = obj.getClass().getName();
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList h = h(obj.getClass());
            Bundle bundle = new Bundle(h.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            int size = h.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = h.get(i9);
                i9++;
                Field field = (Field) obj2;
                field.setAccessible(true);
                String j10 = ta.b.j(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(j10, o(obj3, field.getName(), eVar));
                    }
                } catch (IllegalAccessException e10) {
                    throw new f(ta.b.d("Field is not accessible: ", j10), eVar, e10);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e11) {
            throw new f("Class to deserialize is missing a no args constructor: ".concat(name), eVar, e11);
        }
    }

    public static Bundle n(Object obj, e eVar) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new f("Unsupported primitive type: ".concat(obj.getClass().getName()), eVar);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    public static Bundle o(Object obj, String str, e eVar) {
        ArrayDeque arrayDeque = eVar.b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).a == obj) {
                    throw new c("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), eVar);
                }
            }
        }
        e eVar2 = new e(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new f("Bundling of null object is not supported", eVar2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).l());
                eVar2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    eVar2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    eVar2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle l10 = l((Map) obj, eVar2);
                    eVar2.close();
                    return l10;
                }
                if (obj instanceof List) {
                    Bundle j10 = j((List) obj, eVar2);
                    j10.putInt("tag_class_type", 4);
                    eVar2.close();
                    return j10;
                }
                if (obj instanceof Set) {
                    Bundle j11 = j((Set) obj, eVar2);
                    j11.putInt("tag_class_type", 3);
                    eVar2.close();
                    return j11;
                }
                if (obj.getClass().isEnum()) {
                    Bundle k10 = k(obj, eVar2);
                    eVar2.close();
                    return k10;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    eVar2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new f("Object serializing contains an array, use a list or a set instead", eVar2);
                }
                if (!(obj instanceof p0)) {
                    Bundle m10 = m(obj, eVar2);
                    eVar2.close();
                    return m10;
                }
                Bundle c10 = ((p0) obj).c();
                c10.putInt("tag_class_type", 10);
                eVar2.close();
                return c10;
            }
            Bundle n10 = n(obj, eVar2);
            eVar2.close();
            return n10;
        } catch (Throwable th) {
            try {
                eVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
