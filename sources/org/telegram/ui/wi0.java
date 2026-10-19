package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ wi0(bj0 bj0Var, int i10) {
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bj0 bj0Var = this.b;
                aj0 aj0Var = bj0Var.q0;
                HashSet hashSet = bj0Var.d0;
                if (hashSet.size() != 0 && aj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : bj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    aj0Var.a(arrayList);
                    bj0Var.dismiss();
                    break;
                }
                break;
            default:
                bj0 bj0Var2 = this.b;
                bj0Var2.d0.clear();
                bj0Var2.Y.d.b(true);
                bj0Var2.V(true, false);
                break;
        }
    }
}
