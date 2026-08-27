package t8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements y9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // y9.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                Context context = (Context) this.b;
                String d = hVar.d();
                da.a aVar = new da.a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    context = i10 >= 24 ? f0.b.a(context) : null;
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
                return new w9.g((Context) this.b, (String) this.c);
            default:
                z8.f fVar = (z8.f) this.c;
                z8.a aVar2 = (z8.a) this.b;
                z8.d dVar = aVar2.f;
                af.h hVar2 = new af.h();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<z8.i> set = aVar2.c;
                Set set2 = aVar2.g;
                for (z8.i iVar : set) {
                    int i11 = iVar.c;
                    int i12 = iVar.b;
                    boolean z11 = i11 == 0;
                    q qVar = iVar.a;
                    if (z11) {
                        if (i12 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(qVar);
                    } else if (i12 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(q.a(v9.a.class));
                }
                hVar2.a = DesugarCollections.unmodifiableSet(hashSet);
                hVar2.b = DesugarCollections.unmodifiableSet(hashSet2);
                hVar2.c = DesugarCollections.unmodifiableSet(hashSet3);
                hVar2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                hVar2.e = fVar;
                return dVar.u0(hVar2);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.a = 1;
        this.b = context;
        this.c = str;
    }
}
