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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rga implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ea9 c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ rga(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, ea9 ea9Var, byte b) {
        this.a = b;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = ea9Var;
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
        oga ogaVar;
        l38[] l38VarArr;
        PersistableBundle persistableBundle;
        byte b = this.a;
        ea9 ea9Var = this.c;
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
                    t56 t56Var = (t56) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (t56Var != null) {
                        t56Var.cancel(false);
                    }
                }
                shortcutInfoCompatSaverImpl.h(ea9Var);
                break;
            default:
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    oga ogaVar2 = (oga) obj2;
                    Set set = ogaVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = ogaVar2.h;
                        if (iconCompat != null) {
                            int i3 = iconCompat.i();
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    str = shortcutInfoCompatSaverImpl.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    ogaVar = new oga();
                                    ogaVar.a = ogaVar2.a;
                                    ogaVar.b = ogaVar2.b;
                                    Intent[] intentArr = ogaVar2.c;
                                    ogaVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    ogaVar.d = ogaVar2.d;
                                    ogaVar.e = ogaVar2.e;
                                    ogaVar.f = ogaVar2.f;
                                    ogaVar.g = ogaVar2.g;
                                    ogaVar.h = ogaVar2.h;
                                    ogaVar.k = ogaVar2.k;
                                    ogaVar.l = ogaVar2.l;
                                    ogaVar.m = ogaVar2.m;
                                    l38VarArr = ogaVar2.i;
                                    if (l38VarArr != null) {
                                        ogaVar.i = (l38[]) Arrays.copyOf(l38VarArr, l38VarArr.length);
                                    }
                                    if (ogaVar2.j != null) {
                                        ogaVar.j = new HashSet(ogaVar2.j);
                                    }
                                    persistableBundle = ogaVar2.n;
                                    if (persistableBundle != null) {
                                        ogaVar.n = persistableBundle;
                                    }
                                    ogaVar.h = null;
                                    if (TextUtils.isEmpty(ogaVar.e)) {
                                        w26.j("Shortcut must have a non-empty label");
                                        break;
                                    } else {
                                        Intent[] intentArr2 = ogaVar.c;
                                        if (intentArr2 == null || intentArr2.length == 0) {
                                            w26.j("Shortcut must have an intent");
                                            break;
                                        } else {
                                            uga ugaVar = new uga(ogaVar, str, str2);
                                            Bitmap f = str2 != null ? ogaVar2.h.f() : null;
                                            String str4 = ogaVar2.b;
                                            shortcutInfoCompatSaverImpl.b.put(str4, ugaVar);
                                            if (f != null) {
                                                rld rldVar = new rld((Object) shortcutInfoCompatSaverImpl, (Parcelable) f, (Object) str2, (byte) 11);
                                                ea9 ea9Var2 = new ea9();
                                                shortcutInfoCompatSaverImpl.e.submit(new tq4((Object) ea9Var2, (Object) rldVar, (byte) 14));
                                                t56 t56Var2 = (t56) shortcutInfoCompatSaverImpl.c.put(str4, ea9Var2);
                                                if (t56Var2 != null) {
                                                    t56Var2.cancel(false);
                                                }
                                                ea9Var2.b(new ey1((Object) this, (Object) str4, (Object) ea9Var2, (byte) 3), shortcutInfoCompatSaverImpl.d);
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            ogaVar = new oga();
                            ogaVar.a = ogaVar2.a;
                            ogaVar.b = ogaVar2.b;
                            Intent[] intentArr3 = ogaVar2.c;
                            ogaVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            ogaVar.d = ogaVar2.d;
                            ogaVar.e = ogaVar2.e;
                            ogaVar.f = ogaVar2.f;
                            ogaVar.g = ogaVar2.g;
                            ogaVar.h = ogaVar2.h;
                            ogaVar.k = ogaVar2.k;
                            ogaVar.l = ogaVar2.l;
                            ogaVar.m = ogaVar2.m;
                            l38VarArr = ogaVar2.i;
                            if (l38VarArr != null) {
                            }
                            if (ogaVar2.j != null) {
                            }
                            persistableBundle = ogaVar2.n;
                            if (persistableBundle != null) {
                            }
                            ogaVar.h = null;
                            if (TextUtils.isEmpty(ogaVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        ogaVar = new oga();
                        ogaVar.a = ogaVar2.a;
                        ogaVar.b = ogaVar2.b;
                        Intent[] intentArr32 = ogaVar2.c;
                        ogaVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        ogaVar.d = ogaVar2.d;
                        ogaVar.e = ogaVar2.e;
                        ogaVar.f = ogaVar2.f;
                        ogaVar.g = ogaVar2.g;
                        ogaVar.h = ogaVar2.h;
                        ogaVar.k = ogaVar2.k;
                        ogaVar.l = ogaVar2.l;
                        ogaVar.m = ogaVar2.m;
                        l38VarArr = ogaVar2.i;
                        if (l38VarArr != null) {
                        }
                        if (ogaVar2.j != null) {
                        }
                        persistableBundle = ogaVar2.n;
                        if (persistableBundle != null) {
                        }
                        ogaVar.h = null;
                        if (TextUtils.isEmpty(ogaVar.e)) {
                        }
                    }
                }
                shortcutInfoCompatSaverImpl.h(ea9Var);
                break;
        }
    }
}
