package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u0(w0 w0Var, boolean z9, int i7) {
        this.a = i7;
        this.b = w0Var;
        this.c = z9;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.b2;
                if (this.c) {
                    w0Var.c2.addAll(list);
                }
                if (w0Var.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    break;
                }
                break;
            default:
                w0.d1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
