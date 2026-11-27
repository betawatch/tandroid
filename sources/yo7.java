// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class yo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ yo7(ip7 ip7Var, long j, int i, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = j;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        boolean z2;
        byte b = this.a;
        byte b2 = 2;
        int i2 = this.d;
        long j = this.c;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                zh6 zh6Var = ip7Var.c;
                ArrayList arrayList = ip7Var.a;
                zh6 zh6Var2 = ip7Var.F;
                hp7 hp7Var = (hp7) zh6Var2.f(j);
                if (hp7Var != null) {
                    HashMap hashMap = hp7Var.c;
                    hashMap.remove(Integer.valueOf(i2));
                    if (hashMap.isEmpty()) {
                        zh6Var2.l(j);
                        ip7Var.E.remove(hp7Var);
                        jf7 messagesStorage = ip7Var.getMessagesStorage();
                        messagesStorage.a.c(new le7(messagesStorage, j, b2));
                        z = true;
                        i = 0;
                        while (i < arrayList.size()) {
                            r47 r47Var = (r47) arrayList.get(i);
                            if (r47Var != null && r47Var.N && r47Var.e1() == i2) {
                                arrayList.remove(i);
                                i--;
                                SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(r47Var.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(r47Var.e1());
                                    if (sparseArray.size() <= 0) {
                                        zh6Var.l(r47.B0(r47Var.k));
                                    }
                                }
                                z = true;
                            }
                            i++;
                        }
                        if (!z) {
                            ip7Var.Z(false);
                            break;
                        }
                    } else {
                        jf7 messagesStorage2 = ip7Var.getMessagesStorage();
                        messagesStorage2.a.c(new t87(messagesStorage2, hp7Var, (byte) 24));
                    }
                }
                z = false;
                i = 0;
                while (i < arrayList.size()) {
                }
                if (!z) {
                }
                break;
            default:
                zh6 zh6Var3 = ip7Var.c;
                ArrayList arrayList2 = ip7Var.a;
                zh6 zh6Var4 = ip7Var.F;
                hp7 hp7Var2 = (hp7) zh6Var4.f(j);
                if (hp7Var2 != null) {
                    zh6Var4.l(j);
                    ip7Var.E.remove(hp7Var2);
                    jf7 messagesStorage3 = ip7Var.getMessagesStorage();
                    messagesStorage3.a.c(new le7(messagesStorage3, j, b2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = 0;
                while (i3 < arrayList2.size()) {
                    r47 r47Var2 = (r47) arrayList2.get(i3);
                    if (r47Var2 != null && r47Var2.N && r47Var2.e1() <= i2) {
                        arrayList2.remove(i3);
                        i3--;
                        SparseArray sparseArray2 = (SparseArray) zh6Var3.f(r47.B0(r47Var2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(r47Var2.e1());
                            if (sparseArray2.size() <= 0) {
                                zh6Var3.l(r47.B0(r47Var2.k));
                            }
                        }
                        z2 = true;
                    }
                    i3++;
                }
                if (z2) {
                    ip7Var.Z(false);
                    ip7Var.d0();
                    break;
                }
                break;
        }
    }
}
