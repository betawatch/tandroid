// default package

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
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vs3 {
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static dcf l;
    public static bef m;
    public final Context a;
    public static final ThreadLocal i = new ThreadLocal();
    public static final v84 j = new v84((byte) 4);
    public static final i9d k = new i9d();
    public static final kdd b = new kdd();
    public static final egd c = new egd(3);

    public vs3(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (vue.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0304 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fd A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r30v0, types: [us3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.ThreadLocal, v84] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vs3 c(Context context, us3 us3Var, String str) {
        int i2;
        vs3 vs3Var;
        int i3;
        al5 Z;
        bef befVar;
        boolean z;
        al5 Z2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new ss3("null application Context");
        }
        ThreadLocal threadLocal = i;
        p7f p7fVar = (p7f) threadLocal.get();
        p7f p7fVar2 = new p7f();
        threadLocal.set(p7fVar2);
        ?? r7 = j;
        Long l2 = (Long) r7.get();
        long longValue = l2.longValue();
        try {
            r7.set(Long.valueOf(SystemClock.uptimeMillis()));
            rc0 a = us3Var.a(context, str, k);
            int i4 = a.a;
            int i5 = a.b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i4).length() + 19 + str.length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = a.c;
            if (i6 != 0) {
                if (i6 == -1) {
                    if (a.a != 0) {
                        i6 = -1;
                    }
                }
                if (i6 != 1 || a.b != 0) {
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        vs3 vs3Var2 = new vs3(applicationContext);
                        if (longValue == 0) {
                            r7.remove();
                        } else {
                            r7.set(l2);
                        }
                        Cursor cursor = p7fVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(p7fVar);
                        return vs3Var2;
                    }
                    if (i6 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i6);
                        throw new ss3(sb2.toString());
                    }
                    try {
                        try {
                            i3 = a.b;
                        } catch (ss3 e2) {
                            e = e2;
                            String message = e.getMessage();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb3.append("Failed to load remote module: ");
                            sb3.append(message);
                            Log.w("DynamiteModule", sb3.toString());
                            i2 = a.a;
                            if (i2 != 0 || us3Var.a(r7, str, new h30(i2)).c != -1) {
                                throw new ss3("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            vs3Var = new vs3(applicationContext);
                            return vs3Var;
                        }
                    } catch (ss3 e3) {
                        e = e3;
                        r7 = context;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb32.append("Failed to load remote module: ");
                        sb32.append(message2);
                        Log.w("DynamiteModule", sb32.toString());
                        i2 = a.a;
                        if (i2 != 0) {
                        }
                        throw new ss3("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (vs3.class) {
                                    try {
                                        if (!e(context)) {
                                            throw new ss3("Remote loading disabled");
                                        }
                                        Boolean bool = d;
                                        if (bool == null) {
                                            throw new ss3("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                            sb4.append("Selected remote version of ");
                                            sb4.append(str);
                                            sb4.append(", version >= ");
                                            sb4.append(i3);
                                            Log.i("DynamiteModule", sb4.toString());
                                            synchronized (vs3.class) {
                                                try {
                                                    befVar = m;
                                                } finally {
                                                }
                                            }
                                            if (befVar == null) {
                                                throw new ss3("DynamiteLoaderV2 was not cached.");
                                            }
                                            p7f p7fVar3 = (p7f) threadLocal.get();
                                            if (p7fVar3 == null || p7fVar3.a == null) {
                                                throw new ss3("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = p7fVar3.a;
                                            new br7(null);
                                            synchronized (vs3.class) {
                                                try {
                                                    z = g >= 2;
                                                } finally {
                                                }
                                            }
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                Z2 = befVar.a0(new br7(applicationContext2), str, i3, new br7(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                Z2 = befVar.Z(new br7(applicationContext2), str, i3, new br7(cursor2));
                                            }
                                            Context context2 = (Context) br7.U(Z2);
                                            if (context2 == null) {
                                                throw new ss3("Failed to get module context");
                                            }
                                            vs3Var = new vs3(context2);
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i3).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i3);
                                            Log.i("DynamiteModule", sb5.toString());
                                            dcf h2 = h(context);
                                            if (h2 == null) {
                                                throw new ss3("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel P = h2.P(h2.R(), 6);
                                            int readInt = P.readInt();
                                            P.recycle();
                                            if (readInt >= 3) {
                                                p7f p7fVar4 = (p7f) threadLocal.get();
                                                if (p7fVar4 == null) {
                                                    throw new ss3("No cached result cursor holder");
                                                }
                                                Z = h2.c0(new br7(context), str, i3, new br7(p7fVar4.a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                Z = h2.a0(new br7(context), str, i3);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                Z = h2.Z(new br7(context), str, i3);
                                            }
                                            Object U = br7.U(Z);
                                            if (U == null) {
                                                throw new ss3("Failed to load remote module.");
                                            }
                                            vs3Var = new vs3((Context) U);
                                        }
                                        return vs3Var;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (RemoteException e4) {
                            e = e4;
                            throw new ss3("Failed to load remote module.", e);
                        } catch (ss3 e5) {
                            throw e5;
                        } catch (Throwable th3) {
                            th = th3;
                            throw new ss3("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e6) {
                        e = e6;
                        throw new ss3("Failed to load remote module.", e);
                    } catch (ss3 e7) {
                        throw e7;
                    } catch (Throwable th4) {
                        th = th4;
                        throw new ss3("Failed to load remote module.", th);
                    }
                }
            }
            int i7 = a.a;
            int i8 = a.b;
            StringBuilder sb6 = new StringBuilder(str.length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i7);
            sb6.append(" and remote version is ");
            sb6.append(i8);
            sb6.append(".");
            throw new ss3(sb6.toString());
        } finally {
            v84 v84Var = j;
            if (longValue == 0) {
                v84Var.remove();
            } else {
                v84Var.set(l2);
            }
            Cursor cursor3 = p7fVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            i.set(p7fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017a, code lost:
    
        if (r4 == false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (vs3.class) {
                Boolean bool = d;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (ss3 unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f2 = f(context, str, z, true);
                                        String str2 = e;
                                        if (str2 == null || str2.isEmpty()) {
                                            return f2;
                                        }
                                        ClassLoader e3 = ufd.e();
                                        if (e3 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                rs3.b();
                                                String str3 = e;
                                                xve.h(str3);
                                                e3 = rs3.a(ClassLoader.getSystemClassLoader(), str3);
                                            } else {
                                                String str4 = e;
                                                xve.h(str4);
                                                e3 = new fsd(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        g(e3);
                                        declaredField.set(null, e3);
                                        d = bool2;
                                        return f2;
                                    } catch (ss3 unused2) {
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
                        return f(context, str, z, false);
                    } catch (ss3 e4) {
                        String message = e4.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                dcf h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        Parcel P = h2.P(h2.R(), 6);
                        int readInt2 = P.readInt();
                        P.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = i;
                            p7f p7fVar = (p7f) threadLocal.get();
                            if (p7fVar != null && (cursor = p7fVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) br7.U(h2.b0(new br7(context), str, z, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            p7f p7fVar2 = (p7f) threadLocal.get();
                                            if (p7fVar2 == null || p7fVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                p7fVar2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    remoteException = e5;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
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
                            br7 br7Var = new br7(context);
                            Parcel R = h2.R();
                            dld.b(R, br7Var);
                            R.writeString(str);
                            R.writeInt(z ? 1 : 0);
                            Parcel P2 = h2.P(R, 5);
                            readInt = P2.readInt();
                            P2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            br7 br7Var2 = new br7(context);
                            Parcel R2 = h2.R();
                            dld.b(R2, br7Var2);
                            R2.writeString(str);
                            R2.writeInt(z ? 1 : 0);
                            Parcel P3 = h2.P(R2, 3);
                            readInt = P3.readInt();
                            P3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e6) {
                        remoteException = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? TLObject.FLAG_28 : 0);
            if (j05.b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            h = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & jn7.M1) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x012e, code lost:
    
        if (r6 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z, boolean z2) {
        Throwable th;
        Exception exc;
        MatrixCursor matrixCursor;
        boolean z3;
        Cursor query;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (vs3.class) {
                                                e = matrixCursor.getString(2);
                                                int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                if (columnIndex >= 0) {
                                                    g = matrixCursor.getInt(columnIndex);
                                                }
                                                int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                if (columnIndex2 >= 0) {
                                                    z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                    f = z3;
                                                } else {
                                                    z3 = false;
                                                }
                                            }
                                            p7f p7fVar = (p7f) i.get();
                                            if (p7fVar == null || p7fVar.a != null) {
                                                z4 = false;
                                            } else {
                                                p7fVar.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new ss3("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof ss3) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new ss3(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new ss3("Failed to connect to dynamite module ContentResolver.");
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new ss3("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            bef befVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                befVar = queryLocalInterface instanceof bef ? (bef) queryLocalInterface : new bef(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 4);
            }
            m = befVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new ss3("Failed to instantiate dynamite loader", e2);
        }
    }

    public static dcf h(Context context) {
        dcf dcfVar;
        synchronized (vs3.class) {
            dcf dcfVar2 = l;
            if (dcfVar2 != null) {
                return dcfVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    dcfVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    dcfVar = queryLocalInterface instanceof dcf ? (dcf) queryLocalInterface : new dcf(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 4);
                }
                if (dcfVar != null) {
                    l = dcfVar;
                    return dcfVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new ss3("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
