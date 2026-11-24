// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class pp3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ up3 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ k27 d;

    public /* synthetic */ pp3(up3 up3Var, TLRPC.Document document, k27 k27Var, byte b) {
        this.a = b;
        this.b = up3Var;
        this.c = document;
        this.d = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        boolean z;
        TLRPC.Document F0;
        TLRPC.Document F02;
        byte b2 = this.a;
        k27 k27Var = this.d;
        TLRPC.Document document = this.c;
        up3 up3Var = this.b;
        byte b3 = 0;
        switch (b2) {
            case 0:
                ArrayList arrayList = up3Var.I;
                ArrayList arrayList2 = up3Var.H;
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (((k27) arrayList2.get(i)).F0() != null && ((k27) arrayList2.get(i)).F0().id == document.id) {
                        arrayList2.remove(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                arrayList.add(0, k27Var);
                                up3Var.J.put(k27Var.e1(), k27Var);
                                o1 o1Var = up3Var.T;
                                gl.r(o1Var);
                                gl.d3(o1Var, 60000L);
                            } else if (((k27) arrayList.get(i2)).F0() == null || ((k27) arrayList.get(i2)).F0().id != document.id) {
                                i2++;
                            }
                        }
                        up3Var.getNotificationCenter().k(kk7.d5, new Object[0]);
                        up3Var.getMessagesStorage().a.c(new qp3(up3Var, k27Var, b3));
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList3 = up3Var.I;
                ArrayList arrayList4 = up3Var.H;
                int i3 = 0;
                while (true) {
                    b = 1;
                    if (i3 < arrayList3.size()) {
                        k27 k27Var2 = (k27) arrayList3.get(i3);
                        if (k27Var2 == null || (F02 = k27Var2.F0()) == null || F02.id != document.id) {
                            i3++;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList4.size()) {
                            k27 k27Var3 = (k27) arrayList4.get(i4);
                            if (k27Var3 == null || (F0 = k27Var3.F0()) == null || F0.id != document.id) {
                                i4++;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    arrayList4.add(0, k27Var);
                    up3Var.getMessagesStorage().a.c(new qp3(up3Var, k27Var, b));
                }
                up3Var.getNotificationCenter().k(kk7.d5, new Object[0]);
                break;
        }
    }
}
