// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er3 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ k47 d;

    public /* synthetic */ zq3(er3 er3Var, TLRPC.Document document, k47 k47Var, byte b) {
        this.a = b;
        this.b = er3Var;
        this.c = document;
        this.d = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        boolean z;
        TLRPC.Document F0;
        TLRPC.Document F02;
        byte b2 = this.a;
        k47 k47Var = this.d;
        TLRPC.Document document = this.c;
        er3 er3Var = this.b;
        byte b3 = 0;
        switch (b2) {
            case 0:
                ArrayList arrayList = er3Var.I;
                ArrayList arrayList2 = er3Var.H;
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (((k47) arrayList2.get(i)).F0() != null && ((k47) arrayList2.get(i)).F0().id == document.id) {
                        arrayList2.remove(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                arrayList.add(0, k47Var);
                                er3Var.J.put(k47Var.e1(), k47Var);
                                o1 o1Var = er3Var.T;
                                gm.r(o1Var);
                                gm.d3(o1Var, 60000L);
                            } else if (((k47) arrayList.get(i2)).F0() == null || ((k47) arrayList.get(i2)).F0().id != document.id) {
                                i2++;
                            }
                        }
                        er3Var.getNotificationCenter().k(nm7.f5, new Object[0]);
                        er3Var.getMessagesStorage().a.c(new ar3(er3Var, k47Var, b3));
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList3 = er3Var.I;
                ArrayList arrayList4 = er3Var.H;
                int i3 = 0;
                while (true) {
                    b = 1;
                    if (i3 < arrayList3.size()) {
                        k47 k47Var2 = (k47) arrayList3.get(i3);
                        if (k47Var2 == null || (F02 = k47Var2.F0()) == null || F02.id != document.id) {
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
                            k47 k47Var3 = (k47) arrayList4.get(i4);
                            if (k47Var3 == null || (F0 = k47Var3.F0()) == null || F0.id != document.id) {
                                i4++;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    arrayList4.add(0, k47Var);
                    er3Var.getMessagesStorage().a.c(new ar3(er3Var, k47Var, b));
                }
                er3Var.getNotificationCenter().k(nm7.f5, new Object[0]);
                break;
        }
    }
}
