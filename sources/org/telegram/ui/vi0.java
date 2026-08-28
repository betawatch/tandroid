package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ vi0(bj0 bj0Var, int i9) {
        this.a = i9;
        this.b = bj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bj0 bj0Var = this.b;
                aj0 aj0Var = bj0Var.m0;
                HashSet hashSet = bj0Var.Z;
                if (hashSet.size() != 0 && aj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : bj0Var.e0.values()) {
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
                bj0Var2.Z.clear();
                bj0Var2.U.d.b(true);
                bj0Var2.T(true, false);
                break;
        }
    }
}
