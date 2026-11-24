// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ zl7(im7 im7Var, long j, int i, byte b) {
        this.a = b;
        this.b = im7Var;
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
        byte b2 = 4;
        int i2 = this.d;
        long j = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                vf6 vf6Var = im7Var.c;
                ArrayList arrayList = im7Var.a;
                vf6 vf6Var2 = im7Var.F;
                hm7 hm7Var = (hm7) vf6Var2.f(j);
                if (hm7Var != null) {
                    HashMap hashMap = hm7Var.c;
                    hashMap.remove(Integer.valueOf(i2));
                    if (hashMap.isEmpty()) {
                        vf6Var2.l(j);
                        im7Var.E.remove(hm7Var);
                        ad7 messagesStorage = im7Var.getMessagesStorage();
                        messagesStorage.a.c(new ua7(messagesStorage, j, b2));
                        z = true;
                        i = 0;
                        while (i < arrayList.size()) {
                            k27 k27Var = (k27) arrayList.get(i);
                            if (k27Var != null && k27Var.N && k27Var.e1() == i2) {
                                arrayList.remove(i);
                                i--;
                                SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(k27Var.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(k27Var.e1());
                                    if (sparseArray.size() <= 0) {
                                        vf6Var.l(k27.B0(k27Var.k));
                                    }
                                }
                                z = true;
                            }
                            i++;
                        }
                        if (!z) {
                            im7Var.Z(false);
                            break;
                        }
                    } else {
                        ad7 messagesStorage2 = im7Var.getMessagesStorage();
                        messagesStorage2.a.c(new t67(messagesStorage2, hm7Var, (byte) 27));
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
                vf6 vf6Var3 = im7Var.c;
                ArrayList arrayList2 = im7Var.a;
                vf6 vf6Var4 = im7Var.F;
                hm7 hm7Var2 = (hm7) vf6Var4.f(j);
                if (hm7Var2 != null) {
                    vf6Var4.l(j);
                    im7Var.E.remove(hm7Var2);
                    ad7 messagesStorage3 = im7Var.getMessagesStorage();
                    messagesStorage3.a.c(new ua7(messagesStorage3, j, b2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = 0;
                while (i3 < arrayList2.size()) {
                    k27 k27Var2 = (k27) arrayList2.get(i3);
                    if (k27Var2 != null && k27Var2.N && k27Var2.e1() <= i2) {
                        arrayList2.remove(i3);
                        i3--;
                        SparseArray sparseArray2 = (SparseArray) vf6Var3.f(k27.B0(k27Var2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(k27Var2.e1());
                            if (sparseArray2.size() <= 0) {
                                vf6Var3.l(k27.B0(k27Var2.k));
                            }
                        }
                        z2 = true;
                    }
                    i3++;
                }
                if (z2) {
                    im7Var.Z(false);
                    im7Var.d0();
                    break;
                }
                break;
        }
    }
}
