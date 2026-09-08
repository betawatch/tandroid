package p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import ji.k5;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.ai0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public Object g;
    public Object h;

    public s0(Context context, e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.g(this, 8);
        this.h = new l7(this, 27);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((r4.c) this.c).v();
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.b).execute(new ai0(this, i10, serializable, 13));
    }

    public void c() {
        int i10;
        e eVar = (e) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((x.c == null ? false : x.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            i13 = -1;
                            break;
                        }
                        ComponentName componentName = ((r0) arrayList.get(i13)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 < 0) {
                        r0 r0Var = new r0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.F = new k5(this, r0Var);
                        if (!r0Var.w) {
                            r0Var.w = true;
                            r0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i13 >= i11) {
                        r0 r0Var2 = (r0) arrayList.get(i13);
                        if (!r0Var2.w) {
                            r0Var2.w = true;
                            r0Var2.r();
                        }
                        if (r0Var2.y == null) {
                            if (!r0Var2.w || (((n) r0Var2.h) == null && r0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                r0Var2.q();
                                r0Var2.n();
                            }
                        }
                        i10 = i11 + 1;
                        Collections.swap(arrayList, i13, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i11; size3--) {
                    r0 r0Var3 = (r0) arrayList.get(size3);
                    u d = eVar.d(r0Var3);
                    if (d != null) {
                        r0Var3.getClass();
                        x.b();
                        r0Var3.f = null;
                        r0Var3.h(null);
                        eVar.m(d, null);
                        eVar.a.b(514, d);
                        eVar.l.remove(d);
                    }
                    arrayList.remove(r0Var3);
                    r0Var3.F = null;
                    if (r0Var3.w) {
                        r0Var3.w = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public s0(AssetManager assetManager, Executor executor, r4.c cVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = r4.d.h;
                    break;
                case 26:
                    bArr = r4.d.g;
                    break;
                case 27:
                    bArr = r4.d.f;
                    break;
                case 28:
                case 29:
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    bArr = r4.d.e;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                    bArr = r4.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
