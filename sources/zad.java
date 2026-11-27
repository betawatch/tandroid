// default package

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zad {
    public static final Object f = new Object();
    public static Context g;
    public static volatile Boolean h;
    public final ko9 a;
    public final String b;
    public final String c;
    public final Object d;
    public volatile iad e = null;

    public zad(ko9 ko9Var, String str, Object obj) {
        if (((Uri) ko9Var.b) == null) {
            lq5.j("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = ko9Var;
        String valueOf = String.valueOf((String) ko9Var.c);
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        String valueOf2 = String.valueOf((String) ko9Var.d);
        this.b = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
        this.d = obj;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (g == null) {
            synchronized (f) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (g != context) {
                    h = null;
                }
                g = context;
            }
        }
    }

    public static Object c(zcd zcdVar) {
        try {
            return zcdVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zcdVar.zzp();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static boolean e() {
        if (h == null) {
            Context context = g;
            if (context == null) {
                return false;
            }
            h = Boolean.valueOf(ive.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return h.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Object obj;
        String b;
        Object obj2 = null;
        if (g == null) {
            grb.i("Must call PhenotypeFlag.init() first");
            return null;
        }
        if (e() ? ((Boolean) c(new mt2("gms:phenotype:phenotype_flag:debug_bypass_phenotype", (byte) 3))).booleanValue() : false) {
            String str = this.b;
            Log.w("PhenotypeFlag", str.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(str) : new String("Bypass reading Phenotype values for flag: "));
        } else if (((Uri) this.a.b) != null) {
            if (this.e == null) {
                ContentResolver contentResolver = g.getContentResolver();
                Uri uri = (Uri) this.a.b;
                ConcurrentHashMap concurrentHashMap = iad.h;
                iad iadVar = (iad) concurrentHashMap.get(uri);
                if (iadVar == null) {
                    iadVar = new iad(contentResolver, uri);
                    iad iadVar2 = (iad) concurrentHashMap.putIfAbsent(uri, iadVar);
                    if (iadVar2 == null) {
                        iadVar.a.registerContentObserver(iadVar.b, false, iadVar.c);
                    } else {
                        iadVar = iadVar2;
                    }
                }
                this.e = iadVar;
            }
            String str2 = (String) c(new k7b(this, this.e, (byte) 13));
            if (str2 != null) {
                obj = d(str2);
                if (obj == null) {
                    return obj;
                }
                String str3 = this.c;
                if (e()) {
                    try {
                        b = gmf.b(g.getContentResolver(), str3);
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            b = gmf.b(g.getContentResolver(), str3);
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    if (b != null) {
                        obj2 = d(b);
                    }
                }
                return obj2 != null ? obj2 : this.d;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public abstract Object d(String str);
}
