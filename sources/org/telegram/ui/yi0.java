package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ yi0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dj0 dj0Var = this.b;
                cj0 cj0Var = dj0Var.q0;
                HashSet hashSet = dj0Var.d0;
                if (hashSet.size() != 0 && cj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : dj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    cj0Var.a(arrayList);
                    dj0Var.dismiss();
                    break;
                }
                break;
            default:
                dj0 dj0Var2 = this.b;
                dj0Var2.d0.clear();
                dj0Var2.Y.d.b(true);
                dj0Var2.V(true, false);
                break;
        }
    }
}
