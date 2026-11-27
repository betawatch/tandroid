// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t22 implements z22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iv2 b;

    public /* synthetic */ t22(iv2 iv2Var, byte b) {
        this.a = b;
        this.b = iv2Var;
    }

    @Override // z22
    public final String run() {
        byte b = this.a;
        iv2 iv2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = iv2Var.e;
                return !arrayList.isEmpty() ? f78.f().e((String) arrayList.get(0)) : "";
            default:
                ArrayList arrayList2 = iv2Var.e;
                return !arrayList2.isEmpty() ? f78.f().e((String) arrayList2.get(0)) : "";
        }
    }
}
