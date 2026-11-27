// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
