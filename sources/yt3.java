// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        va vaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((au3) obj).b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((yt3) obj2).a(i, z);
                }
                break;
            case 1:
                sy4 sy4Var = (sy4) obj;
                sy4Var.h++;
                sy4Var.j += z ? 1 : -1;
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                goc gocVar = (goc) obj;
                zka zkaVar = gocVar.w;
                if ((i == 1 || i == 3) && (vaVar = gocVar.a) != null) {
                    gocVar.s = z;
                    vaVar.removeCallbacks(zkaVar);
                    zkaVar.run();
                    break;
                }
                break;
        }
    }
}
