// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tia implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ec9 c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ tia(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, ec9 ec9Var, byte b) {
        this.a = b;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = ec9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r9 != 5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        qia qiaVar;
        n58[] n58VarArr;
        PersistableBundle persistableBundle;
        byte b = this.a;
        ec9 ec9Var = this.c;
        ArrayList arrayList = this.b;
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
        switch (b) {
            case 0:
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str3 = (String) obj;
                    shortcutInfoCompatSaverImpl.b.remove(str3);
                    t76 t76Var = (t76) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (t76Var != null) {
                        t76Var.cancel(false);
                    }
                }
                shortcutInfoCompatSaverImpl.h(ec9Var);
                break;
            default:
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    qia qiaVar2 = (qia) obj2;
                    Set set = qiaVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = qiaVar2.h;
                        if (iconCompat != null) {
                            int i3 = iconCompat.i();
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    str = shortcutInfoCompatSaverImpl.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    qiaVar = new qia();
                                    qiaVar.a = qiaVar2.a;
                                    qiaVar.b = qiaVar2.b;
                                    Intent[] intentArr = qiaVar2.c;
                                    qiaVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    qiaVar.d = qiaVar2.d;
                                    qiaVar.e = qiaVar2.e;
                                    qiaVar.f = qiaVar2.f;
                                    qiaVar.g = qiaVar2.g;
                                    qiaVar.h = qiaVar2.h;
                                    qiaVar.k = qiaVar2.k;
                                    qiaVar.l = qiaVar2.l;
                                    qiaVar.m = qiaVar2.m;
                                    n58VarArr = qiaVar2.i;
                                    if (n58VarArr != null) {
                                        qiaVar.i = (n58[]) Arrays.copyOf(n58VarArr, n58VarArr.length);
                                    }
                                    if (qiaVar2.j != null) {
                                        qiaVar.j = new HashSet(qiaVar2.j);
                                    }
                                    persistableBundle = qiaVar2.n;
                                    if (persistableBundle != null) {
                                        qiaVar.n = persistableBundle;
                                    }
                                    qiaVar.h = null;
                                    if (TextUtils.isEmpty(qiaVar.e)) {
                                        u36.j("Shortcut must have a non-empty label");
                                        break;
                                    } else {
                                        Intent[] intentArr2 = qiaVar.c;
                                        if (intentArr2 == null || intentArr2.length == 0) {
                                            u36.j("Shortcut must have an intent");
                                            break;
                                        } else {
                                            wia wiaVar = new wia(qiaVar, str, str2);
                                            Bitmap f = str2 != null ? qiaVar2.h.f() : null;
                                            String str4 = qiaVar2.b;
                                            shortcutInfoCompatSaverImpl.b.put(str4, wiaVar);
                                            if (f != null) {
                                                tnd tndVar = new tnd((Object) shortcutInfoCompatSaverImpl, (Parcelable) f, (Object) str2, (byte) 11);
                                                ec9 ec9Var2 = new ec9();
                                                shortcutInfoCompatSaverImpl.e.submit(new us4((Object) ec9Var2, (Object) tndVar, (byte) 14));
                                                t76 t76Var2 = (t76) shortcutInfoCompatSaverImpl.c.put(str4, ec9Var2);
                                                if (t76Var2 != null) {
                                                    t76Var2.cancel(false);
                                                }
                                                ec9Var2.b(new rz1((Object) this, (Object) str4, (Object) ec9Var2, (byte) 3), shortcutInfoCompatSaverImpl.d);
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            qiaVar = new qia();
                            qiaVar.a = qiaVar2.a;
                            qiaVar.b = qiaVar2.b;
                            Intent[] intentArr3 = qiaVar2.c;
                            qiaVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            qiaVar.d = qiaVar2.d;
                            qiaVar.e = qiaVar2.e;
                            qiaVar.f = qiaVar2.f;
                            qiaVar.g = qiaVar2.g;
                            qiaVar.h = qiaVar2.h;
                            qiaVar.k = qiaVar2.k;
                            qiaVar.l = qiaVar2.l;
                            qiaVar.m = qiaVar2.m;
                            n58VarArr = qiaVar2.i;
                            if (n58VarArr != null) {
                            }
                            if (qiaVar2.j != null) {
                            }
                            persistableBundle = qiaVar2.n;
                            if (persistableBundle != null) {
                            }
                            qiaVar.h = null;
                            if (TextUtils.isEmpty(qiaVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        qiaVar = new qia();
                        qiaVar.a = qiaVar2.a;
                        qiaVar.b = qiaVar2.b;
                        Intent[] intentArr32 = qiaVar2.c;
                        qiaVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        qiaVar.d = qiaVar2.d;
                        qiaVar.e = qiaVar2.e;
                        qiaVar.f = qiaVar2.f;
                        qiaVar.g = qiaVar2.g;
                        qiaVar.h = qiaVar2.h;
                        qiaVar.k = qiaVar2.k;
                        qiaVar.l = qiaVar2.l;
                        qiaVar.m = qiaVar2.m;
                        n58VarArr = qiaVar2.i;
                        if (n58VarArr != null) {
                        }
                        if (qiaVar2.j != null) {
                        }
                        persistableBundle = qiaVar2.n;
                        if (persistableBundle != null) {
                        }
                        qiaVar.h = null;
                        if (TextUtils.isEmpty(qiaVar.e)) {
                        }
                    }
                }
                shortcutInfoCompatSaverImpl.h(ec9Var);
                break;
        }
    }
}
