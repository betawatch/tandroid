package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi0 b;

    public /* synthetic */ ui0(zi0 zi0Var, int i10) {
        this.a = i10;
        this.b = zi0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zi0 zi0Var = this.b;
                yi0 yi0Var = zi0Var.m0;
                HashSet hashSet = zi0Var.Z;
                if (hashSet.size() != 0 && yi0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : zi0Var.e0.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    yi0Var.a(arrayList);
                    zi0Var.dismiss();
                    break;
                }
                break;
            default:
                zi0 zi0Var2 = this.b;
                zi0Var2.Z.clear();
                zi0Var2.U.d.b(true);
                zi0Var2.U(true, false);
                break;
        }
    }
}
