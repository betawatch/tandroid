package r5;

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
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.p4;
import j$.util.DesugarCollections;
import j7.s5;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import oh.h4;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public static final u5.b l = new u5.b("CastContext", null);
    public static final Object m = new Object();
    public static volatile a n;
    public final Context a;
    public final n b;
    public final g c;
    public final k d;
    public final b e;
    public final u5.s f;
    public final com.google.android.gms.internal.cast.c g;
    public final com.google.android.gms.internal.cast.m h;
    public final List i;
    public final com.google.android.gms.internal.cast.r j;
    public final com.google.android.gms.internal.cast.e k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.o oVar, u5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.t d1Var;
        this.a = context;
        this.e = bVar;
        this.f = sVar;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.j = oVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.e(context, bVar, oVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.k;
        if (eVar != null) {
            hashMap.put(eVar.b, eVar.c);
        }
        int i10 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                b6.m.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.b;
                b6.m.g(str, "Category for SessionProvider must not be null or empty string.");
                b6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.c);
            }
        }
        bVar.C = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, oVar, hashMap);
            this.b = a2;
            try {
                l lVar = (l) a2;
                Parcel O0 = lVar.O0(lVar.M0(), 6);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rVar = queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
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
                        yVar = queryLocalInterface2 instanceof y ? (y) queryLocalInterface2 : new y(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    O02.recycle();
                    g gVar = new g(yVar, context);
                    this.c = gVar;
                    b6.m.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.r rVar2 = this.j;
                    if (rVar2 != null) {
                        rVar2.f = gVar;
                        a7.e eVar3 = rVar2.c;
                        b6.m.h(eVar3);
                        eVar3.post(new com.google.android.gms.internal.cast.q(rVar2, i10));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        d1Var = new com.google.android.gms.internal.cast.w(context, newFixedThreadPool instanceof k4 ? (k4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new p4((ScheduledExecutorService) newFixedThreadPool) : new l4(newFixedThreadPool));
                    } else {
                        d1Var = new d1();
                    }
                    b6.m.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    d1Var.zza();
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.s.d(M0, cVar);
                        lVar3.Q0(M0, 3);
                        cVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.w).isEmpty()) {
                            u5.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.w))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.w);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f.b(l.d.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(s5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.m.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.c.get(s5.a(str2));
                                        if (kVar != null) {
                                            hashMap2.put(str2, kVar);
                                        }
                                    }
                                    mVar.c.clear();
                                    mVar.c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new ai(this, 11));
                        com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
                        int i11 = 14;
                        e6.c = new org.telegram.ui.web.e0(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, i11);
                        e6.d = new y5.c[]{q5.y.d};
                        e6.b = false;
                        e6.a = 8427;
                        sVar.e(0, e6.e()).addOnSuccessListener(new h4(this, i11));
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
        b6.m.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    u5.s sVar = new u5.s(applicationContext, u5.s.k, com.google.android.gms.common.api.b.i, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.o(applicationContext, c2.c0.d(applicationContext), castOptions, sVar), sVar);
                    } catch (d e6) {
                        throw new RuntimeException(e6);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        k6.b a2;
        try {
            a2 = k6.c.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e6) {
            e = e6;
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
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.v a() {
        b6.m.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.s.a(O0, Bundle.CREATOR);
            O0.recycle();
            return c2.v.b(bundle);
        } catch (RemoteException e6) {
            l.a(e6, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        b6.m.e("Must be called from the main thread.");
        return this.c;
    }
}
