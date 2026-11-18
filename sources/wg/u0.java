package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u0(w0 w0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = w0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.c2;
                if (this.c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    break;
                }
                break;
            default:
                w0.e1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
