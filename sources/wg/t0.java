package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ t0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.Y1;
                tg.y yVar = w0Var.n2;
                w0Var.f2 = str;
                int i7 = w0Var.j2;
                if (i7 == 1) {
                    org.telegram.messenger.g0.r(yVar);
                    org.telegram.messenger.g0.i3(yVar, 350L);
                    break;
                } else if (i7 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(yVar);
                        org.telegram.messenger.g0.i3(yVar, 350L);
                        break;
                    } else {
                        org.telegram.messenger.g0.r(yVar);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.i2.id));
                        w0Var.m1(false, true);
                        w0Var.j1(true);
                        break;
                    }
                } else if (i7 == 3) {
                    w0Var.m1(false, true);
                    w0Var.j1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.b;
                ArrayList arrayList2 = w0Var2.Y1;
                if (!TextUtils.isEmpty(w0Var2.f2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    w0Var2.n1(true, true);
                    w0Var2.j1(true);
                    break;
                }
                break;
        }
    }
}
