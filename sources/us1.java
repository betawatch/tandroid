// default package

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class us1 extends yc8 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ zu1 c;

    public us1(zu1 zu1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = zu1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        this.c.G((no6) this.b.get(0), oecVar, z, i2, z2, 0L);
    }

    @Override // yc8, ed8
    public final mn5 k(int i) {
        return new mn5(this.a, null, 0);
    }
}
