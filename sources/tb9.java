// default package

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tb9 extends ub9 {
    public final n29 f;
    public final ve9 h;

    public tb9(ko4 ko4Var, po5 po5Var, mz9 mz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ko4Var, po5Var, mz9Var, arrayList, arrayList2, arrayList3);
        Uri.parse(((xg0) po5Var.get(0)).a);
        long j = mz9Var.e;
        n29 n29Var = j <= 0 ? null : new n29(mz9Var.d, j, null);
        this.f = n29Var;
        this.h = n29Var == null ? new ve9(new n29(0L, -1L, null), (byte) 10) : null;
    }

    @Override // ub9
    public final String a() {
        return null;
    }

    @Override // ub9
    public final j63 b() {
        return this.h;
    }

    @Override // ub9
    public final n29 c() {
        return this.f;
    }
}
