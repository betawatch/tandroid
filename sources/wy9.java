// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zy9 b;

    public /* synthetic */ wy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ArrayList arrayList = zy9Var.b2;
                bg7 bg7Var = zy9Var.q2;
                zy9Var.i2 = str;
                byte b2 = zy9Var.m2;
                if (b2 == 1) {
                    gl.r(bg7Var);
                    gl.d3(bg7Var, 350L);
                    break;
                } else if (b2 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        gl.r(bg7Var);
                        gl.d3(bg7Var, 350L);
                        break;
                    } else {
                        gl.r(bg7Var);
                        arrayList.clear();
                        arrayList.addAll(on0.f(zy9Var.l2.id));
                        zy9Var.h1(false, true);
                        zy9Var.e1(true);
                        break;
                    }
                } else if (b2 == 3) {
                    zy9Var.h1(false, true);
                    zy9Var.e1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                ArrayList arrayList2 = zy9Var.b2;
                if (!TextUtils.isEmpty(zy9Var.i2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    zy9Var.i1(true, true);
                    zy9Var.e1(true);
                    break;
                }
                break;
        }
    }
}
