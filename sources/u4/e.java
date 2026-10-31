package u4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.m;
import c5.w;
import e0.l0;
import j9.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import td.z1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ m c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ e(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, m mVar, int i10) {
        this.a = i10;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r4 != 5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        g0.c cVar;
        l0[] l0VarArr;
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
                    y yVar = (y) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (yVar != null) {
                        yVar.cancel(false);
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
                                    l0VarArr = cVar2.i;
                                    if (l0VarArr != null) {
                                        cVar.i = (l0[]) Arrays.copyOf(l0VarArr, l0VarArr.length);
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
                                        f fVar = new f(cVar, str, str2);
                                        Bitmap f7 = str2 != null ? cVar2.h.f() : null;
                                        String str4 = cVar2.b;
                                        shortcutInfoCompatSaverImpl2.b.put(str4, fVar);
                                        if (f7 != null) {
                                            w wVar = new w(shortcutInfoCompatSaverImpl2, f7, str2, false, 9);
                                            m mVar = new m();
                                            shortcutInfoCompatSaverImpl2.e.submit(new z1(5, mVar, wVar));
                                            y yVar2 = (y) shortcutInfoCompatSaverImpl2.c.put(str4, mVar);
                                            if (yVar2 != null) {
                                                yVar2.cancel(false);
                                            }
                                            mVar.a(new w(this, str4, mVar, false, 8), shortcutInfoCompatSaverImpl2.d);
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
                            l0VarArr = cVar2.i;
                            if (l0VarArr != null) {
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
                        l0VarArr = cVar2.i;
                        if (l0VarArr != null) {
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
