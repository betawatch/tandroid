package qe;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import c8.v9;
import h2.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.dt;
import org.telegram.ui.d10;
import s4.n;
import s4.r0;
import s4.u;
import s4.x;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public h(ca.i composer, pe.b bVar, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.e(composer, "composer");
        this.b = composer;
        this.c = bVar;
        this.d = jVar;
        this.e = hVarArr;
        this.f = bVar.a;
        int ordinal = jVar.ordinal();
        if (hVarArr != null) {
            h hVar = hVarArr[ordinal];
            if (hVar == null && hVar == this) {
                return;
            }
            hVarArr[ordinal] = this;
        }
    }

    public h a(me.d descriptor) {
        h hVar;
        h[] hVarArr = (h[]) this.e;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.c;
        j f10 = f.f(descriptor, bVar);
        char c10 = f10.a;
        ca.i iVar = (ca.i) this.b;
        iVar.j(c10);
        iVar.b = true;
        String str = (String) this.g;
        if (str != null) {
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            iVar.i();
            j(str);
            iVar.j(':');
            j(str2);
            this.g = null;
            this.h = null;
        }
        return ((j) this.d) == f10 ? this : (hVarArr == null || (hVar = hVarArr[f10.ordinal()]) == null) ? new h(iVar, bVar, f10, hVarArr) : hVar;
    }

    public void b(me.d descriptor, int i7) {
        ca.i iVar = (ca.i) this.b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        int ordinal = ((j) this.d).ordinal();
        boolean z9 = true;
        if (ordinal == 1) {
            if (!iVar.b) {
                iVar.j(',');
            }
            iVar.i();
            return;
        }
        if (ordinal == 2) {
            if (iVar.b) {
                this.a = true;
                iVar.i();
                return;
            }
            if (i7 % 2 == 0) {
                iVar.j(',');
                iVar.i();
            } else {
                iVar.j(':');
                iVar.k();
                z9 = false;
            }
            this.a = z9;
            return;
        }
        if (ordinal != 3) {
            if (!iVar.b) {
                iVar.j(',');
            }
            iVar.i();
            f.e(descriptor, (pe.b) this.c);
            j(descriptor.g(i7));
            iVar.j(':');
            iVar.k();
            return;
        }
        if (i7 == 0) {
            this.a = true;
        }
        if (i7 == 1) {
            iVar.j(',');
            iVar.k();
            this.a = false;
        }
    }

    public void c(int i7) {
        if (this.a) {
            j(String.valueOf(i7));
        } else {
            ((mc.a) ((ca.i) this.b).c).c(String.valueOf(i7));
        }
    }

    public void d(long j3) {
        if (this.a) {
            j(String.valueOf(j3));
        } else {
            ((mc.a) ((ca.i) this.b).c).c(String.valueOf(j3));
        }
    }

    public void e(me.d descriptor, int i7, long j3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        b(descriptor, i7);
        d(j3);
    }

    public void f() {
        ca.i iVar = (ca.i) this.b;
        iVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((mc.a) iVar.c).c("null");
    }

    public void g(me.d descriptor, int i7, ke.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        if (obj != null || ((p0) this.f).b) {
            kotlin.jvm.internal.j.e(descriptor, "descriptor");
            kotlin.jvm.internal.j.e(serializer, "serializer");
            b(descriptor, i7);
            if (serializer.d().c()) {
                i(serializer, obj);
            } else if (obj == null) {
                f();
            } else {
                i(serializer, obj);
            }
        }
    }

    public void h(me.d descriptor, int i7, ke.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i7);
        i(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(ke.a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.j.e(serializer, "serializer");
        p0 p0Var = ((pe.b) this.c).a;
        p0Var.getClass();
        int ordinal = ((pe.a) p0Var.f).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                v9 e10 = serializer.d().e();
                if (kotlin.jvm.internal.j.a(e10, me.f.b) || kotlin.jvm.internal.j.a(e10, me.f.e)) {
                    me.d d = serializer.d();
                    kotlin.jvm.internal.j.e(d, "<this>");
                    Iterator it = d.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) p0Var.e;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof pe.c) {
                            str = ((pe.c) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        String a10 = serializer.d().a();
                        this.g = str;
                        this.h = a10;
                    }
                    serializer.a(this, obj);
                }
            } else if (ordinal != 2) {
                throw new androidx.car.app.j();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.a(this, obj);
    }

    public void j(String value) {
        int i7;
        kotlin.jvm.internal.j.e(value, "value");
        ca.i iVar = (ca.i) this.b;
        iVar.getClass();
        kotlin.jvm.internal.j.e(value, "value");
        mc.a aVar = (mc.a) iVar.c;
        aVar.a(aVar.c, value.length() + 2);
        char[] cArr = aVar.b;
        int i10 = aVar.c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = i.b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    aVar.a(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = i.b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i7 = i13 + 1;
                            aVar.b[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = i.a[charAt];
                                kotlin.jvm.internal.j.b(str);
                                aVar.a(i13, str.length());
                                str.getChars(0, str.length(), aVar.b, i13);
                                int length3 = str.length() + i13;
                                aVar.c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = aVar.b;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                aVar.c = i13;
                            }
                        }
                    } else {
                        i7 = i13 + 1;
                        aVar.b[i13] = charAt;
                    }
                    i13 = i7;
                }
                aVar.a(i13, 1);
                aVar.b[i13] = '\"';
                aVar.c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        aVar.c = i12 + 1;
    }

    public void k(me.d descriptor, int i7, String value) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(value, "value");
        b(descriptor, i7);
        j(value);
    }

    public void l(me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        j jVar = (j) this.d;
        ca.i iVar = (ca.i) this.b;
        iVar.getClass();
        iVar.b = false;
        iVar.j(jVar.b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((u4.c) this.c).L();
            return null;
        }
    }

    public void n(int i7, Serializable serializable) {
        ((Executor) this.b).execute(new d10(this, i7, serializable, 25));
    }

    public void o() {
        int i7;
        s4.e eVar = (s4.e) this.c;
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
            int i10 = 0;
            while (true) {
                boolean z9 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((x.c == null ? false : x.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        ComponentName componentName = ((r0) arrayList.get(i12)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i12 < 0) {
                        r0 r0Var = new r0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.F = new m3(this, r0Var);
                        if (!r0Var.x) {
                            r0Var.x = true;
                            r0Var.r();
                        }
                        i7 = i10 + 1;
                        arrayList.add(i10, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i12 >= i10) {
                        r0 r0Var2 = (r0) arrayList.get(i12);
                        if (!r0Var2.x) {
                            r0Var2.x = true;
                            r0Var2.r();
                        }
                        if (r0Var2.D == null) {
                            if (!r0Var2.x || (((n) r0Var2.h) == null && r0Var2.w.isEmpty())) {
                                z9 = false;
                            }
                            if (z9) {
                                r0Var2.q();
                                r0Var2.n();
                            }
                        }
                        i7 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i7;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
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
                    if (r0Var3.x) {
                        r0Var3.x = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public boolean p(me.d dVar) {
        ((p0) this.f).getClass();
        return false;
    }

    public h(Context context, s4.e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.f(this, 12);
        this.h = new dt(this, 27);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public h(AssetManager assetManager, Executor executor, u4.c cVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = cVar;
        this.g = str;
        this.e = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 >= 24 && i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = u4.d.h;
                    break;
                case 26:
                    bArr = u4.d.g;
                    break;
                case 27:
                    bArr = u4.d.f;
                    break;
                case 28:
                case 29:
                case qs.T /* 30 */:
                    bArr = u4.d.e;
                    break;
                case qs.U /* 31 */:
                case 32:
                case 33:
                case 34:
                    bArr = u4.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
