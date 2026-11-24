// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ os3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        va vaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((qs3) obj).b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((os3) obj2).a(i, z);
                }
                break;
            case 1:
                qw4 qw4Var = (qw4) obj;
                qw4Var.h++;
                qw4Var.j += z ? 1 : -1;
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                hmc hmcVar = (hmc) obj;
                xia xiaVar = hmcVar.w;
                if ((i == 1 || i == 3) && (vaVar = hmcVar.a) != null) {
                    hmcVar.s = z;
                    vaVar.removeCallbacks(xiaVar);
                    xiaVar.run();
                    break;
                }
                break;
        }
    }
}
