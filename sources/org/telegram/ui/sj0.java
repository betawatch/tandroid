package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public /* synthetic */ sj0(xj0 xj0Var, int i10) {
        this.a = i10;
        this.b = xj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xj0 xj0Var = this.b;
                wj0 wj0Var = xj0Var.q0;
                HashSet hashSet = xj0Var.d0;
                if (hashSet.size() != 0 && wj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : xj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    wj0Var.a(arrayList);
                    xj0Var.dismiss();
                    break;
                }
                break;
            default:
                xj0 xj0Var2 = this.b;
                xj0Var2.d0.clear();
                xj0Var2.Y.d.b(true);
                xj0Var2.V(true, false);
                break;
        }
    }
}
