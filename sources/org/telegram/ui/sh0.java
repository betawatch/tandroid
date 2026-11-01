package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh0 b;

    public /* synthetic */ sh0(uh0 uh0Var, int i10) {
        this.a = i10;
        this.b = uh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uh0 uh0Var = this.b;
                th0 th0Var = uh0Var.i2;
                HashSet hashSet = uh0Var.V1;
                if (hashSet.size() != 0 && th0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : uh0Var.a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    th0Var.a(arrayList);
                    uh0Var.dismiss();
                    break;
                }
                break;
            default:
                uh0 uh0Var2 = this.b;
                uh0Var2.V1.clear();
                uh0Var2.Q1.d.b(true);
                uh0Var2.g1(true, false);
                break;
        }
    }
}
