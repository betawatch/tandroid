// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z0a implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1a b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z0a(b1a b1aVar, boolean z, byte b) {
        this.a = b;
        this.b = b1aVar;
        this.c = z;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = b1aVar.b2;
                if (z) {
                    b1aVar.c2.addAll(list);
                }
                if (b1aVar.m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    b1aVar.i1(true, true);
                    b1aVar.e1(true);
                    break;
                }
                break;
            default:
                b1aVar.Z0(z, (Pair) obj);
                break;
        }
    }
}
