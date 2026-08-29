package p5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c2.v0;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
import h7.r5;
import j$.util.DesugarCollections;
import j7.l1;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public static final s5.b l = new s5.b("CastContext", null);
    public static final Object m = new Object();
    public static volatile a n;
    public final Context a;
    public final n b;
    public final g c;
    public final k d;
    public final b e;
    public final s5.s f;
    public final com.google.android.gms.internal.cast.d g;
    public final com.google.android.gms.internal.cast.n h;
    public final List i;
    public final com.google.android.gms.internal.cast.t j;
    public final com.google.android.gms.internal.cast.f k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.q qVar, s5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.v f1Var;
        this.a = context;
        this.e = bVar;
        this.f = sVar;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.j = qVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.f(context, bVar, qVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.k;
        if (fVar != null) {
            hashMap.put(fVar.b, fVar.c);
        }
        int i10 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                z5.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.b;
                z5.l.g(str, "Category for SessionProvider must not be null or empty string.");
                z5.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.c);
            }
        }
        bVar.B = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, qVar, hashMap);
            this.b = a2;
            try {
                l lVar = (l) a2;
                Parcel O0 = lVar.O0(lVar.M0(), 6);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rVar = queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 0);
                }
                O0.recycle();
                this.d = new k(rVar);
                try {
                    l lVar2 = (l) a2;
                    Parcel O02 = lVar2.O0(lVar2.M0(), 5);
                    IBinder readStrongBinder2 = O02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        yVar = queryLocalInterface2 instanceof y ? (y) queryLocalInterface2 : new y(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 0);
                    }
                    O02.recycle();
                    g gVar = new g(yVar, context);
                    this.c = gVar;
                    z5.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.t tVar = this.j;
                    if (tVar != null) {
                        tVar.f = gVar;
                        v0 v0Var = tVar.c;
                        z5.l.h(v0Var);
                        v0Var.post(new com.google.android.gms.internal.cast.s(tVar, i10));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        f1Var = new com.google.android.gms.internal.cast.y(context, newFixedThreadPool instanceof l4 ? (l4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new q4((ScheduledExecutorService) newFixedThreadPool) : new m4(newFixedThreadPool));
                    } else {
                        f1Var = new f1();
                    }
                    z5.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    f1Var.zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.u.d(M0, dVar);
                        lVar3.Q0(M0, 3);
                        dVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.w).isEmpty()) {
                            s5.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f.b(l1.l(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(r5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.n.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.c.get(r5.a(str2));
                                        if (lVar4 != null) {
                                            hashMap2.put(str2, lVar4);
                                        }
                                    }
                                    nVar.c.clear();
                                    nVar.c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new o1.a(this, 13));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.c = new o3.y(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new w5.c[]{o5.y.d};
                        b10.b = false;
                        b10.a = 8427;
                        sVar.e(0, b10.b()).addOnSuccessListener(new o4.g(this, 9));
                    } catch (RemoteException e10) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e10);
                    }
                } catch (RemoteException e11) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e11);
                }
            } catch (RemoteException e12) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e12);
            }
        } catch (RemoteException e13) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e13);
        }
    }

    public static a c(Context context) {
        z5.l.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    s5.s sVar = new s5.s(applicationContext, s5.s.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.q(applicationContext, c2.d0.d(applicationContext), castOptions, sVar), sVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        androidx.biometric.t a2;
        try {
            a2 = i6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a2.a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e16) {
            e = e16;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.w a() {
        z5.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.u.a(O0, Bundle.CREATOR);
            O0.recycle();
            return c2.w.b(bundle);
        } catch (RemoteException e10) {
            l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        z5.l.e("Must be called from the main thread.");
        return this.c;
    }
}
