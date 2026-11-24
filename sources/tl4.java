// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tl4 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl4(ss2 ss2Var, ts2 ts2Var) {
        this.a = (byte) 3;
        this.b = ts2Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ul4 ul4Var = (ul4) obj;
                if (ul4Var == null) {
                    ul4Var = new ul4(-3);
                }
                ((lv6) this.b).E(ul4Var);
                return;
            case 1:
                ul4 ul4Var2 = (ul4) obj;
                synchronized (vl4.c) {
                    aia aiaVar = vl4.d;
                    ArrayList arrayList = (ArrayList) aiaVar.get((String) this.b);
                    if (arrayList == null) {
                        return;
                    }
                    aiaVar.remove((String) this.b);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((vs2) arrayList.get(i)).accept(ul4Var2);
                    }
                    return;
                }
            case 2:
                ArrayList arrayList2 = new ArrayList();
                ((bi0) ((sg0) this.b).b).b((fi0) obj, arrayList2);
                return;
            default:
                ((ts2) this.b).d((fi0) obj);
                return;
        }
    }

    public /* synthetic */ tl4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
