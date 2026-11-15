package x4;

import a9.h;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.m;
import e0.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import m9.y;
import pb.l;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ m c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ e(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, m mVar, int i7) {
        this.a = i7;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = mVar;
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
        g0.b bVar;
        j0[] j0VarArr;
        PersistableBundle persistableBundle;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
                    if (i7 >= size) {
                        shortcutInfoCompatSaverImpl.h(this.c);
                        return;
                    }
                    Object obj = arrayList.get(i7);
                    i7++;
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
                int i10 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = this.d;
                    if (i10 >= size2) {
                        shortcutInfoCompatSaverImpl2.h(this.c);
                        return;
                    }
                    int i11 = i10 + 1;
                    g0.b bVar2 = (g0.b) arrayList2.get(i10);
                    Set set = bVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = bVar2.h;
                        if (iconCompat != null) {
                            int i12 = iconCompat.i();
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    break;
                                } else {
                                    str = shortcutInfoCompatSaverImpl2.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    bVar = new g0.b();
                                    bVar.a = bVar2.a;
                                    bVar.b = bVar2.b;
                                    Intent[] intentArr = bVar2.c;
                                    bVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    bVar.d = bVar2.d;
                                    bVar.e = bVar2.e;
                                    bVar.f = bVar2.f;
                                    bVar.g = bVar2.g;
                                    bVar.h = bVar2.h;
                                    bVar.k = bVar2.k;
                                    bVar.l = bVar2.l;
                                    bVar.m = bVar2.m;
                                    j0VarArr = bVar2.i;
                                    if (j0VarArr != null) {
                                        bVar.i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
                                    }
                                    if (bVar2.j != null) {
                                        bVar.j = new HashSet(bVar2.j);
                                    }
                                    persistableBundle = bVar2.n;
                                    if (persistableBundle != null) {
                                        bVar.n = persistableBundle;
                                    }
                                    bVar.h = null;
                                    if (TextUtils.isEmpty(bVar.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = bVar.c;
                                    if (intentArr2 != null && intentArr2.length != 0) {
                                        f fVar = new f(bVar, str, str2);
                                        Bitmap f10 = str2 != null ? bVar2.h.f() : null;
                                        String str4 = bVar2.b;
                                        shortcutInfoCompatSaverImpl2.b.put(str4, fVar);
                                        if (f10 != null) {
                                            h hVar = new h(shortcutInfoCompatSaverImpl2, f10, str2, false, 11);
                                            m mVar = new m();
                                            shortcutInfoCompatSaverImpl2.e.submit(new l(11, mVar, hVar));
                                            y yVar2 = (y) shortcutInfoCompatSaverImpl2.c.put(str4, mVar);
                                            if (yVar2 != null) {
                                                yVar2.cancel(false);
                                            }
                                            mVar.b(new h(this, str4, mVar, false, 10), shortcutInfoCompatSaverImpl2.d);
                                        }
                                    }
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl2.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            bVar = new g0.b();
                            bVar.a = bVar2.a;
                            bVar.b = bVar2.b;
                            Intent[] intentArr3 = bVar2.c;
                            bVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            bVar.d = bVar2.d;
                            bVar.e = bVar2.e;
                            bVar.f = bVar2.f;
                            bVar.g = bVar2.g;
                            bVar.h = bVar2.h;
                            bVar.k = bVar2.k;
                            bVar.l = bVar2.l;
                            bVar.m = bVar2.m;
                            j0VarArr = bVar2.i;
                            if (j0VarArr != null) {
                            }
                            if (bVar2.j != null) {
                            }
                            persistableBundle = bVar2.n;
                            if (persistableBundle != null) {
                            }
                            bVar.h = null;
                            if (TextUtils.isEmpty(bVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        bVar = new g0.b();
                        bVar.a = bVar2.a;
                        bVar.b = bVar2.b;
                        Intent[] intentArr32 = bVar2.c;
                        bVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        bVar.d = bVar2.d;
                        bVar.e = bVar2.e;
                        bVar.f = bVar2.f;
                        bVar.g = bVar2.g;
                        bVar.h = bVar2.h;
                        bVar.k = bVar2.k;
                        bVar.l = bVar2.l;
                        bVar.m = bVar2.m;
                        j0VarArr = bVar2.i;
                        if (j0VarArr != null) {
                        }
                        if (bVar2.j != null) {
                        }
                        persistableBundle = bVar2.n;
                        if (persistableBundle != null) {
                        }
                        bVar.h = null;
                        if (TextUtils.isEmpty(bVar.e)) {
                        }
                    }
                    i10 = i11;
                }
                break;
        }
    }
}
