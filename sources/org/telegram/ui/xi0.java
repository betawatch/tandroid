package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ xi0(cj0 cj0Var, int i10) {
        this.a = i10;
        this.b = cj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cj0 cj0Var = this.b;
                bj0 bj0Var = cj0Var.q0;
                HashSet hashSet = cj0Var.d0;
                if (hashSet.size() != 0 && bj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : cj0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    bj0Var.a(arrayList);
                    cj0Var.dismiss();
                    break;
                }
                break;
            default:
                cj0 cj0Var2 = this.b;
                cj0Var2.d0.clear();
                cj0Var2.Y.d.b(true);
                cj0Var2.U(true, false);
                break;
        }
    }
}
