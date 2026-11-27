// default package

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn8 implements nu4, t69, mc5 {
    public final /* synthetic */ vn8 a;

    public /* synthetic */ tn8(vn8 vn8Var) {
        this.a = vn8Var;
    }

    @Override // mc5
    public final void a(ArrayList arrayList, boolean z, boolean z2) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.Z();
    }

    @Override // t69
    public final boolean e(int i, View view) {
        vn8 vn8Var = this.a;
        if (i < vn8Var.r || i >= vn8Var.s) {
            return false;
        }
        if (!vn8Var.E) {
            throw null;
        }
        vn8Var.Y(Long.valueOf(vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r)), view);
        return true;
    }

    @Override // nu4
    public final Object h(Object obj) {
        if (((Integer) obj).intValue() == this.a.x) {
            return Integer.valueOf(aob.p1(0.12f, aob.w0(null, aob.p7, false)));
        }
        return null;
    }
}
