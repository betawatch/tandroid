package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj0 b;

    public /* synthetic */ rj0(wj0 wj0Var, int i10) {
        this.a = i10;
        this.b = wj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wj0 wj0Var = this.b;
                vj0 vj0Var = wj0Var.q0;
                HashSet hashSet = wj0Var.d0;
                if (hashSet.size() != 0 && vj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : wj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    vj0Var.a(arrayList);
                    wj0Var.dismiss();
                    break;
                }
                break;
            default:
                wj0 wj0Var2 = this.b;
                wj0Var2.d0.clear();
                wj0Var2.Y.d.b(true);
                wj0Var2.V(true, false);
                break;
        }
    }
}
