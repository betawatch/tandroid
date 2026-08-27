package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ xi0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dj0 dj0Var = this.b;
                cj0 cj0Var = dj0Var.m0;
                HashSet hashSet = dj0Var.Z;
                if (hashSet.size() != 0 && cj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : dj0Var.e0.values()) {
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
                dj0Var2.Z.clear();
                dj0Var2.U.d.b(true);
                dj0Var2.U(true, false);
                break;
        }
    }
}
