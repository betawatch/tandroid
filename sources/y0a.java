// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y0a implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1a b;

    public /* synthetic */ y0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ArrayList arrayList = b1aVar.b2;
                ei7 ei7Var = b1aVar.q2;
                b1aVar.i2 = str;
                byte b2 = b1aVar.m2;
                if (b2 == 1) {
                    gm.r(ei7Var);
                    gm.d3(ei7Var, 350L);
                    break;
                } else if (b2 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        gm.r(ei7Var);
                        gm.d3(ei7Var, 350L);
                        break;
                    } else {
                        gm.r(ei7Var);
                        arrayList.clear();
                        arrayList.addAll(oo0.f(b1aVar.l2.id));
                        b1aVar.h1(false, true);
                        b1aVar.e1(true);
                        break;
                    }
                } else if (b2 == 3) {
                    b1aVar.h1(false, true);
                    b1aVar.e1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                ArrayList arrayList2 = b1aVar.b2;
                if (!TextUtils.isEmpty(b1aVar.i2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    b1aVar.i1(true, true);
                    b1aVar.e1(true);
                    break;
                }
                break;
        }
    }
}
