// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
