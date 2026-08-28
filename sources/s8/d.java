package s8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import y8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements x9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // x9.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                Context context = (Context) this.b;
                String d = hVar.d();
                ca.a aVar = new ca.a();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 24) {
                    context = i9 >= 24 ? f0.b.a(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z10;
                return aVar;
            case 1:
                return new v9.g((Context) this.b, (String) this.c);
            default:
                y8.g gVar = (y8.g) this.c;
                y8.a aVar2 = (y8.a) this.b;
                y8.d dVar = aVar2.f;
                b3.b bVar = new b3.b();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<y8.j> set = aVar2.c;
                Set set2 = aVar2.g;
                for (y8.j jVar : set) {
                    int i10 = jVar.c;
                    int i11 = jVar.b;
                    boolean z11 = i10 == 0;
                    r rVar = jVar.a;
                    if (z11) {
                        if (i11 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(rVar);
                    } else if (i11 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(u9.a.class));
                }
                bVar.a = DesugarCollections.unmodifiableSet(hashSet);
                bVar.b = DesugarCollections.unmodifiableSet(hashSet2);
                bVar.c = DesugarCollections.unmodifiableSet(hashSet3);
                bVar.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                bVar.e = gVar;
                return dVar.H1(bVar);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.a = 1;
        this.b = context;
        this.c = str;
    }
}
