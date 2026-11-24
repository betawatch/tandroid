// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yc9 implements t22 {
    public final /* synthetic */ x02 a;
    public final /* synthetic */ hd9 b;

    public yc9(hd9 hd9Var, x02 x02Var) {
        this.b = hd9Var;
        this.a = x02Var;
    }

    @Override // t22
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        boolean isEmpty = arrayList.isEmpty();
        hd9 hd9Var = this.b;
        if (!isEmpty) {
            hd9Var.Q.X1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            ye9 ye9Var = hd9Var.Q;
            k27 k27Var = (k27) arrayList3.get(0);
            ye9Var.getClass();
            if (k27Var != null && k27Var.F0() != null) {
                TLRPC.Document F0 = k27Var.F0();
                TLRPC.Message message = k27Var.k;
                ye9Var.Y1(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // t22
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // t22
    public final void S() {
    }

    @Override // t22
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
