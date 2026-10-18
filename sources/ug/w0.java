package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w0(y0 y0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = y0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.b;
                ArrayList arrayList = y0Var.g0;
                if (this.c) {
                    y0Var.h0.addAll(list);
                }
                if (y0Var.r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    break;
                }
                break;
            default:
                y0.Q(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
