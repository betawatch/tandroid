package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s0(u0 u0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                u0 u0Var = this.b;
                ArrayList arrayList = u0Var.c2;
                if (this.c) {
                    u0Var.d2.addAll(list);
                }
                if (u0Var.n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    u0Var.n1(true, true);
                    u0Var.j1(true);
                    break;
                }
                break;
            default:
                u0.d1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
