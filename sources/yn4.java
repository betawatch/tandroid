// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yn4 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yn4(mt2 mt2Var, nt2 nt2Var) {
        this.a = (byte) 3;
        this.b = nt2Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                zn4 zn4Var = (zn4) obj;
                if (zn4Var == null) {
                    zn4Var = new zn4(-3);
                }
                ((qx6) this.b).F(zn4Var);
                return;
            case 1:
                zn4 zn4Var2 = (zn4) obj;
                synchronized (ao4.c) {
                    vla vlaVar = ao4.d;
                    ArrayList arrayList = (ArrayList) vlaVar.get((String) this.b);
                    if (arrayList == null) {
                        return;
                    }
                    vlaVar.remove((String) this.b);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((pt2) arrayList.get(i)).accept(zn4Var2);
                    }
                    return;
                }
            case 2:
                ArrayList arrayList2 = new ArrayList();
                ((ci0) ((tg0) this.b).b).c((gi0) obj, arrayList2);
                return;
            default:
                ((nt2) this.b).e((gi0) obj);
                return;
        }
    }

    public /* synthetic */ yn4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
