package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh0 b;

    public /* synthetic */ uh0(wh0 wh0Var, int i10) {
        this.a = i10;
        this.b = wh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wh0 wh0Var = this.b;
                vh0 vh0Var = wh0Var.i2;
                HashSet hashSet = wh0Var.V1;
                if (hashSet.size() != 0 && vh0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : wh0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    vh0Var.a(arrayList);
                    wh0Var.dismiss();
                    break;
                }
                break;
            default:
                wh0 wh0Var2 = this.b;
                wh0Var2.V1.clear();
                wh0Var2.Q1.d.b(true);
                wh0Var2.g1(true, false);
                break;
        }
    }
}
