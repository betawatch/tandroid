package z6;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o6.l;
import org.telegram.tgnet.TLObject;
import u7.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e {
    public static final s b;
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static final tb.a k;
    public static j l;
    public static k m;
    public final Context a;
    public static final ThreadLocal i = new ThreadLocal();
    public static final m1 j = new m1(3);
    public static final pa.d c = new pa.d();

    static {
        int i10 = 28;
        k = new tb.a(i10);
        b = new s(i10);
    }

    public e(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (l.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j10;
        e eVar;
        Boolean bool;
        y6.a V0;
        e eVar2;
        k kVar;
        boolean z10;
        y6.a V02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = i;
        i iVar = (i) threadLocal.get();
        i iVar2 = new i();
        threadLocal.set(iVar2);
        m1 m1Var = j;
        Long l4 = (Long) m1Var.get();
        long longValue = l4.longValue();
        try {
            m1Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            a3.l l02 = dVar.l0(context, str, k);
            j10 = longValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + l02.a + " and remote module " + str + ":" + l02.b);
                int i10 = l02.c;
                if (i10 != 0) {
                    if (i10 == -1) {
                        if (l02.a != 0) {
                            i10 = -1;
                        }
                    }
                    if (i10 != 1 || l02.b != 0) {
                        if (i10 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            eVar = new e(applicationContext);
                        } else {
                            if (i10 != 1) {
                                throw new b("VersionPolicy returned invalid code:" + i10);
                            }
                            try {
                                int i11 = l02.b;
                                try {
                                    synchronized (e.class) {
                                        if (!g(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        bool = d;
                                    }
                                    if (bool == null) {
                                        throw new b("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                        synchronized (e.class) {
                                            kVar = m;
                                        }
                                        if (kVar == null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        i iVar3 = (i) threadLocal.get();
                                        if (iVar3 == null || iVar3.a == null) {
                                            throw new b("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = iVar3.a;
                                        new y6.b(null);
                                        synchronized (e.class) {
                                            z10 = g >= 2;
                                        }
                                        if (z10) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            V02 = kVar.W0(new y6.b(applicationContext2), str, i11, new y6.b(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            V02 = kVar.V0(new y6.b(applicationContext2), str, i11, new y6.b(cursor));
                                        }
                                        Context context2 = (Context) y6.b.L0(V02);
                                        if (context2 == null) {
                                            throw new b("Failed to get module context");
                                        }
                                        eVar2 = new e(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                        j h10 = h(context);
                                        if (h10 == null) {
                                            throw new b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel L0 = h10.L0(h10.N0(), 6);
                                        int readInt = L0.readInt();
                                        L0.recycle();
                                        if (readInt >= 3) {
                                            i iVar4 = (i) threadLocal.get();
                                            if (iVar4 == null) {
                                                throw new b("No cached result cursor holder");
                                            }
                                            V0 = h10.W0(new y6.b(context), str, i11, new y6.b(iVar4.a));
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            V0 = h10.X0(new y6.b(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            V0 = h10.V0(new y6.b(context), str, i11);
                                        }
                                        Object L02 = y6.b.L0(V0);
                                        if (L02 == null) {
                                            throw new b("Failed to load remote module.");
                                        }
                                        eVar2 = new e((Context) L02);
                                    }
                                    eVar = eVar2;
                                } catch (RemoteException e10) {
                                    throw new b("Failed to load remote module.", e10);
                                } catch (b e11) {
                                    throw e11;
                                } catch (Throwable th2) {
                                    throw new b("Failed to load remote module.", th2);
                                }
                            } catch (b e12) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                int i12 = l02.a;
                                if (i12 == 0 || dVar.l0(context, str, new ag.j(i12)).c != -1) {
                                    throw new b("Remote load failed. No local fallback found.", e12);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            }
                        }
                        if (j10 == 0) {
                            j.remove();
                        } else {
                            j.set(l4);
                        }
                        Cursor cursor2 = iVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        i.set(iVar);
                        return eVar;
                    }
                }
                throw new b("No acceptable module " + str + " found. Local version is " + l02.a + " and remote version is " + l02.b + ".");
            } catch (Throwable th3) {
                th = th3;
                if (j10 == 0) {
                    j.remove();
                } else {
                    j.set(l4);
                }
                Cursor cursor3 = iVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                i.set(iVar);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j10 = longValue;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017d, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = d;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e11 = e(context, str, z10, true);
                                        String str2 = e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = g.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = e;
                                                    l.h(str3);
                                                    a2 = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = e;
                                                    l.h(str4);
                                                    a2 = new h(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(a2);
                                            declaredField.set(null, a2);
                                            d = bool2;
                                            return e11;
                                        }
                                        return e11;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (b e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                j h10 = h(context);
                try {
                    if (h10 == null) {
                        return 0;
                    }
                    try {
                        Parcel L0 = h10.L0(h10.N0(), 6);
                        int readInt2 = L0.readInt();
                        L0.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = i;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) y6.b.L0(h10.Y0(new y6.b(context), str, z10, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.a != null) {
                                                z11 = false;
                                            } else {
                                                iVar2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    remoteException = e13;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            y6.b bVar = new y6.b(context);
                            Parcel N0 = h10.N0();
                            n7.a.c(N0, bVar);
                            N0.writeString(str);
                            N0.writeInt(z10 ? 1 : 0);
                            Parcel L02 = h10.L0(N0, 5);
                            readInt = L02.readInt();
                            L02.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            y6.b bVar2 = new y6.b(context);
                            Parcel N02 = h10.N0();
                            n7.a.c(N02, bVar2);
                            N02.writeString(str);
                            N02.writeInt(z10 ? 1 : 0);
                            Parcel L03 = h10.L0(N02, 3);
                            readInt = L03.readInt();
                            L03.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e14) {
                        remoteException = e14;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0135, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z10, boolean z11) {
        Throwable th2;
        Exception exc;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z14 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        acquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i10 = 0; i10 < count; i10++) {
                                if (!query.moveToPosition(i10)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i11 = 0; i11 < columnCount; i11++) {
                                    int type = query.getType(i11);
                                    if (type == 0) {
                                        objArr[i11] = null;
                                    } else if (type == 1) {
                                        objArr[i11] = Long.valueOf(query.getLong(i11));
                                    } else if (type == 2) {
                                        objArr[i11] = Double.valueOf(query.getDouble(i11));
                                    } else if (type == 3) {
                                        objArr[i11] = query.getString(i11);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i11] = query.getBlob(i11);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i12 = matrixCursor.getInt(0);
                                        if (i12 > 0) {
                                            synchronized (e.class) {
                                                try {
                                                    e = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        g = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z12 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f = z12;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            i iVar = (i) i.get();
                                            if (iVar == null || iVar.a != null) {
                                                z13 = false;
                                            } else {
                                                iVar.a = matrixCursor;
                                            }
                                            z14 = z12;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z11 && z14) {
                                            throw new b("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i12;
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    if (exc instanceof b) {
                                        throw exc;
                                    }
                                    throw new b("V2 version check failed: " + exc.getMessage(), exc);
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th2;
                                    }
                                    matrixCursor2.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new b("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th5) {
                            try {
                                query.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th7) {
            th2 = th7;
        }
    }

    public static void f(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 8);
            }
            m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new b("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z10 = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? TLObject.FLAG_28 : 0);
            if (l6.e.b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 8);
                }
                if (jVar != null) {
                    l = jVar;
                    return jVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new b("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
