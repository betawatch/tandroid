package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;

    public /* synthetic */ zi0(ej0 ej0Var, int i10) {
        this.a = i10;
        this.b = ej0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ej0 ej0Var = this.b;
                dj0 dj0Var = ej0Var.q0;
                HashSet hashSet = ej0Var.d0;
                if (hashSet.size() != 0 && dj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ej0Var.i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    dj0Var.a(arrayList);
                    ej0Var.dismiss();
                    break;
                }
                break;
            default:
                ej0 ej0Var2 = this.b;
                ej0Var2.d0.clear();
                ej0Var2.Y.d.b(true);
                ej0Var2.U(true, false);
                break;
        }
    }
}
