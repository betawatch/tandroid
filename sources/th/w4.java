package th;

import java.util.List;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements r20 {
    public final /* synthetic */ x4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ w4(x4 x4Var, boolean z10, int i10, List list) {
        this.a = x4Var;
        this.b = z10;
        this.c = i10;
        this.d = list;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
