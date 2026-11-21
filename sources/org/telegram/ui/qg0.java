package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ qg0(vg0 vg0Var, int i7) {
        this.a = i7;
        this.b = vg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                ug0 ug0Var = vg0Var.m2;
                HashSet hashSet = vg0Var.Z1;
                if (hashSet.size() != 0 && ug0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : vg0Var.e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    ug0Var.a(arrayList);
                    vg0Var.dismiss();
                    break;
                }
                break;
            default:
                vg0 vg0Var2 = this.b;
                vg0Var2.Z1.clear();
                vg0Var2.U1.d.b(true);
                vg0Var2.h1(true, false);
                break;
        }
    }
}
