// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zy9 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xy9(zy9 zy9Var, boolean z, byte b) {
        this.a = b;
        this.b = zy9Var;
        this.c = z;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = zy9Var.b2;
                if (z) {
                    zy9Var.c2.addAll(list);
                }
                if (zy9Var.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    zy9Var.i1(true, true);
                    zy9Var.e1(true);
                    break;
                }
                break;
            default:
                zy9Var.Z0(z, (Pair) obj);
                break;
        }
    }
}
