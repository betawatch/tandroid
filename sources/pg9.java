// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class pg9 implements k32 {
    public final /* synthetic */ n12 a;
    public final /* synthetic */ yg9 b;

    public pg9(yg9 yg9Var, n12 n12Var) {
        this.b = yg9Var;
        this.a = n12Var;
    }

    @Override // k32
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        boolean isEmpty = arrayList.isEmpty();
        yg9 yg9Var = this.b;
        if (!isEmpty) {
            yg9Var.Q.Y1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            pi9 pi9Var = yg9Var.Q;
            r47 r47Var = (r47) arrayList3.get(0);
            pi9Var.getClass();
            if (r47Var != null && r47Var.F0() != null) {
                TLRPC.Document F0 = r47Var.F0();
                TLRPC.Message message = r47Var.k;
                pi9Var.Z1(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // k32
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // k32
    public final void S() {
    }

    @Override // k32
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
