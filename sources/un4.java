// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class un4 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ un4(du2 du2Var, eu2 eu2Var) {
        this.a = (byte) 3;
        this.b = eu2Var;
    }

    @Override // gu2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                vn4 vn4Var = (vn4) obj;
                if (vn4Var == null) {
                    vn4Var = new vn4(-3);
                }
                ((hi2) this.b).M(vn4Var);
                return;
            case 1:
                vn4 vn4Var2 = (vn4) obj;
                synchronized (wn4.c) {
                    cka ckaVar = wn4.d;
                    ArrayList arrayList = (ArrayList) ckaVar.get((String) this.b);
                    if (arrayList == null) {
                        return;
                    }
                    ckaVar.remove((String) this.b);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((gu2) arrayList.get(i)).accept(vn4Var2);
                    }
                    return;
                }
            case 2:
                ArrayList arrayList2 = new ArrayList();
                ((bj0) ((xg0) this.b).b).b((fj0) obj, arrayList2);
                return;
            default:
                ((eu2) this.b).e((fj0) obj);
                return;
        }
    }

    public /* synthetic */ un4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
