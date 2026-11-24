// default package

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class uzd {
    public static final Logger a = Logger.getLogger(uzd.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final c6c d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(2:2|3)|4|(24:6|(1:(1:9)(1:(1:69)))(1:70)|10|(3:57|58|(20:60|(1:62)(2:63|64)|14|(18:49|50|(1:52)|54|17|(1:21)|22|23|24|25|26|27|(1:43)(1:31)|(1:35)|36|(1:38)(1:42)|39|40)|16|17|(2:19|21)|22|23|24|25|26|27|(1:29)|43|(2:33|35)|36|(0)(0)|39|40))|12|13|14|(0)|16|17|(0)|22|23|24|25|26|27|(0)|43|(0)|36|(0)(0)|39|40)|71|10|(0)|12|13|14|(0)|16|17|(0)|22|23|24|25|26|27|(0)|43|(0)|36|(0)(0)|39|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0292, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0291, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Unsafe unsafe;
        c6c c6cVar;
        Class<?> cls;
        Class<?> cls2;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        Field f2;
        Field field;
        c6c c6cVar2;
        c6c c6cVar3;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        b = unsafe;
        c = jad.a;
        Class<?> cls3 = Long.TYPE;
        boolean i = i(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean i2 = i(cls4);
        if (unsafe != null) {
            if (!jad.a()) {
                c6cVar = new tzd(unsafe);
            } else if (i) {
                c6cVar = new szd(unsafe, (byte) 1);
            } else if (i2) {
                c6cVar = new szd(unsafe, (byte) 0);
            }
            d = c6cVar;
            Class<?> cls5 = Byte.TYPE;
            if (unsafe != null) {
                try {
                    cls2 = unsafe.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls3);
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(th);
                    cls = cls3;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 71);
                    sb.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
                }
                if (f() != null) {
                    if (jad.a()) {
                        cls = cls3;
                        z = true;
                    } else {
                        cls2.getMethod("getByte", cls3);
                        cls2.getMethod("putByte", cls3, cls5);
                        cls2.getMethod("getInt", cls3);
                        cls2.getMethod("putInt", cls3, cls4);
                        cls2.getMethod("getLong", cls3);
                        cls2.getMethod("putLong", cls3, cls3);
                        cls2.getMethod("copyMemory", cls3, cls3, cls3);
                        cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                        cls = cls3;
                        z = true;
                    }
                    e = z;
                    unsafe2 = b;
                    if (unsafe2 != null) {
                        try {
                            Class<?> cls6 = unsafe2.getClass();
                            cls6.getMethod("objectFieldOffset", Field.class);
                            cls6.getMethod("arrayBaseOffset", Class.class);
                            cls6.getMethod("arrayIndexScale", Class.class);
                            cls6.getMethod("getInt", Object.class, cls);
                            cls6.getMethod("putInt", Object.class, cls, cls4);
                            cls6.getMethod("getLong", Object.class, cls);
                            cls6.getMethod("putLong", Object.class, cls, cls);
                            cls6.getMethod("getObject", Object.class, cls);
                            cls6.getMethod("putObject", Object.class, cls, Object.class);
                            if (!jad.a()) {
                                cls6.getMethod("getByte", Object.class, cls);
                                cls6.getMethod("putByte", Object.class, cls, cls5);
                                cls6.getMethod("getBoolean", Object.class, cls);
                                cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                                cls6.getMethod("getFloat", Object.class, cls);
                                cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                                cls6.getMethod("getDouble", Object.class, cls);
                                cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                            }
                            z2 = true;
                        } catch (Throwable th2) {
                            Logger logger2 = a;
                            Level level2 = Level.WARNING;
                            String valueOf2 = String.valueOf(th2);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 71);
                            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                            sb2.append(valueOf2);
                            logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                        }
                        f = z2;
                        g = g(byte[].class);
                        g(boolean[].class);
                        h(boolean[].class);
                        g(int[].class);
                        h(int[].class);
                        g(long[].class);
                        h(long[].class);
                        g(float[].class);
                        h(float[].class);
                        g(double[].class);
                        h(double[].class);
                        g(Object[].class);
                        h(Object[].class);
                        f2 = f();
                        if (f2 != null && (c6cVar3 = d) != null) {
                            c6cVar3.a.objectFieldOffset(f2);
                        }
                        Field field2 = String.class.getDeclaredField("value");
                        boolean z3 = true;
                        field2.setAccessible(true);
                        field = (field2 == null && field2.getType() == char[].class) ? field2 : null;
                        if (field != null && (c6cVar2 = d) != null) {
                            c6cVar2.a.objectFieldOffset(field);
                        }
                        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z3 : false;
                    }
                    z2 = false;
                    f = z2;
                    g = g(byte[].class);
                    g(boolean[].class);
                    h(boolean[].class);
                    g(int[].class);
                    h(int[].class);
                    g(long[].class);
                    h(long[].class);
                    g(float[].class);
                    h(float[].class);
                    g(double[].class);
                    h(double[].class);
                    g(Object[].class);
                    h(Object[].class);
                    f2 = f();
                    if (f2 != null) {
                        c6cVar3.a.objectFieldOffset(f2);
                    }
                    Field field22 = String.class.getDeclaredField("value");
                    boolean z32 = true;
                    field22.setAccessible(true);
                    if (field22 == null) {
                    }
                    if (field != null) {
                        c6cVar2.a.objectFieldOffset(field);
                    }
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z32 : false;
                }
            }
            cls = cls3;
            z = false;
            e = z;
            unsafe2 = b;
            if (unsafe2 != null) {
            }
            z2 = false;
            f = z2;
            g = g(byte[].class);
            g(boolean[].class);
            h(boolean[].class);
            g(int[].class);
            h(int[].class);
            g(long[].class);
            h(long[].class);
            g(float[].class);
            h(float[].class);
            g(double[].class);
            h(double[].class);
            g(Object[].class);
            h(Object[].class);
            f2 = f();
            if (f2 != null) {
            }
            Field field222 = String.class.getDeclaredField("value");
            boolean z322 = true;
            field222.setAccessible(true);
            if (field222 == null) {
            }
            if (field != null) {
            }
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z322 : false;
        }
        c6cVar = null;
        d = c6cVar;
        Class<?> cls52 = Byte.TYPE;
        if (unsafe != null) {
        }
        cls = cls3;
        z = false;
        e = z;
        unsafe2 = b;
        if (unsafe2 != null) {
        }
        z2 = false;
        f = z2;
        g = g(byte[].class);
        g(boolean[].class);
        h(boolean[].class);
        g(int[].class);
        h(int[].class);
        g(long[].class);
        h(long[].class);
        g(float[].class);
        h(float[].class);
        g(double[].class);
        h(double[].class);
        g(Object[].class);
        h(Object[].class);
        f2 = f();
        if (f2 != null) {
        }
        Field field2222 = String.class.getDeclaredField("value");
        boolean z3222 = true;
        field2222.setAccessible(true);
        if (field2222 == null) {
        }
        if (field != null) {
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z3222 : false;
    }

    public static byte a(long j, byte[] bArr) {
        return d.B(bArr, g + j);
    }

    public static void b(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int j3 = j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        c(obj, (j3 & (~(kk7.d4 << i))) | ((b2 & 255) << i), j2);
    }

    public static void c(Object obj, int i, long j) {
        d.a.putInt(obj, j, i);
    }

    public static void d(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void e(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(obj, (j(obj, j2) & (~(kk7.d4 << i))) | ((b2 & 255) << i), j2);
    }

    public static Field f() {
        Field field;
        Field field2;
        if (jad.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                field2.setAccessible(true);
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static int g(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void h(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(Class cls) {
        if (!jad.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int j(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    public static long k(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    public static Object l(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static byte m(Object obj, long j) {
        return (byte) (j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte n(Object obj, long j) {
        return (byte) (j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
