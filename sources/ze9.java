// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ze9 implements f42 {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ jf9 b;

    public ze9(jf9 jf9Var, i22 i22Var) {
        this.b = jf9Var;
        this.a = i22Var;
    }

    @Override // f42
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        boolean isEmpty = arrayList.isEmpty();
        jf9 jf9Var = this.b;
        if (!isEmpty) {
            jf9Var.Q.X1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            ch9 ch9Var = jf9Var.Q;
            k47 k47Var = (k47) arrayList3.get(0);
            ch9Var.getClass();
            if (k47Var != null && k47Var.F0() != null) {
                TLRPC.Document F0 = k47Var.F0();
                TLRPC.Message message = k47Var.k;
                ch9Var.Y1(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // f42
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // f42
    public final void S() {
    }

    @Override // f42
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
