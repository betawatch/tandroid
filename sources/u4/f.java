package u4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.l;
import c5.v;
import e0.p0;
import i9.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ f(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, l lVar, int i10) {
        this.a = i10;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r4 != 5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        g0.c cVar;
        p0[] p0VarArr;
        PersistableBundle persistableBundle;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
                    if (i10 >= size) {
                        shortcutInfoCompatSaverImpl.h(this.c);
                        return;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str3 = (String) obj;
                    shortcutInfoCompatSaverImpl.b.remove(str3);
                    w wVar = (w) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (wVar != null) {
                        wVar.cancel(false);
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = this.d;
                    if (i11 >= size2) {
                        shortcutInfoCompatSaverImpl2.h(this.c);
                        return;
                    }
                    int i12 = i11 + 1;
                    g0.c cVar2 = (g0.c) arrayList2.get(i11);
                    Set set = cVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = cVar2.h;
                        if (iconCompat != null) {
                            int i13 = iconCompat.i();
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    break;
                                } else {
                                    str = shortcutInfoCompatSaverImpl2.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    cVar = new g0.c();
                                    cVar.a = cVar2.a;
                                    cVar.b = cVar2.b;
                                    Intent[] intentArr = cVar2.c;
                                    cVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    cVar.d = cVar2.d;
                                    cVar.e = cVar2.e;
                                    cVar.f = cVar2.f;
                                    cVar.g = cVar2.g;
                                    cVar.h = cVar2.h;
                                    cVar.k = cVar2.k;
                                    cVar.l = cVar2.l;
                                    cVar.m = cVar2.m;
                                    p0VarArr = cVar2.i;
                                    if (p0VarArr != null) {
                                        cVar.i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
                                    }
                                    if (cVar2.j != null) {
                                        cVar.j = new HashSet(cVar2.j);
                                    }
                                    persistableBundle = cVar2.n;
                                    if (persistableBundle != null) {
                                        cVar.n = persistableBundle;
                                    }
                                    cVar.h = null;
                                    if (TextUtils.isEmpty(cVar.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = cVar.c;
                                    if (intentArr2 != null && intentArr2.length != 0) {
                                        h hVar = new h(cVar, str, str2);
                                        Bitmap f7 = str2 != null ? cVar2.h.f() : null;
                                        String str4 = cVar2.b;
                                        shortcutInfoCompatSaverImpl2.b.put(str4, hVar);
                                        if (f7 != null) {
                                            v vVar = new v(shortcutInfoCompatSaverImpl2, f7, str2, false, 11);
                                            l lVar = new l();
                                            shortcutInfoCompatSaverImpl2.e.submit(new e(lVar, vVar, false, 4));
                                            w wVar2 = (w) shortcutInfoCompatSaverImpl2.c.put(str4, lVar);
                                            if (wVar2 != null) {
                                                wVar2.cancel(false);
                                            }
                                            lVar.a(new v(this, str4, lVar, false, 10), shortcutInfoCompatSaverImpl2.d);
                                        }
                                    }
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl2.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            cVar = new g0.c();
                            cVar.a = cVar2.a;
                            cVar.b = cVar2.b;
                            Intent[] intentArr3 = cVar2.c;
                            cVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            cVar.d = cVar2.d;
                            cVar.e = cVar2.e;
                            cVar.f = cVar2.f;
                            cVar.g = cVar2.g;
                            cVar.h = cVar2.h;
                            cVar.k = cVar2.k;
                            cVar.l = cVar2.l;
                            cVar.m = cVar2.m;
                            p0VarArr = cVar2.i;
                            if (p0VarArr != null) {
                            }
                            if (cVar2.j != null) {
                            }
                            persistableBundle = cVar2.n;
                            if (persistableBundle != null) {
                            }
                            cVar.h = null;
                            if (TextUtils.isEmpty(cVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        cVar = new g0.c();
                        cVar.a = cVar2.a;
                        cVar.b = cVar2.b;
                        Intent[] intentArr32 = cVar2.c;
                        cVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        cVar.d = cVar2.d;
                        cVar.e = cVar2.e;
                        cVar.f = cVar2.f;
                        cVar.g = cVar2.g;
                        cVar.h = cVar2.h;
                        cVar.k = cVar2.k;
                        cVar.l = cVar2.l;
                        cVar.m = cVar2.m;
                        p0VarArr = cVar2.i;
                        if (p0VarArr != null) {
                        }
                        if (cVar2.j != null) {
                        }
                        persistableBundle = cVar2.n;
                        if (persistableBundle != null) {
                        }
                        cVar.h = null;
                        if (TextUtils.isEmpty(cVar.e)) {
                        }
                    }
                    i11 = i12;
                }
                break;
        }
    }
}
