// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class t5c extends xye {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean f(Object obj, String str, int i, boolean z) {
        g();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            rjb.m(e2);
            return false;
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // xye
    public Typeface a(Context context, yn4 yn4Var, Resources resources, int i) {
        g();
        try {
            Object newInstance = b.newInstance(null);
            for (zn4 zn4Var : yn4Var.a) {
                File c2 = aze.c(context);
                if (c2 == null) {
                    return null;
                }
                try {
                    if (aze.a(c2, resources, zn4Var.f) && f(newInstance, c2.getPath(), zn4Var.b, zn4Var.c)) {
                        c2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    c2.delete();
                    throw th;
                }
                c2.delete();
                return null;
            }
            g();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                rjb.m(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            rjb.m(e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface b(Context context, co4[] co4VarArr, int i) {
        File file;
        File c2;
        Typeface createFromFile;
        String readlink;
        if (co4VarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(xye.e(co4VarArr, i).a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file == null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            c2 = aze.c(context);
                            if (c2 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    c2.delete();
                                    throw th;
                                }
                                if (aze.b(c2, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(c2.getPath());
                                    c2.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                c2.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        c2 = aze.c(context);
                        if (c2 != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file == null) {
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
