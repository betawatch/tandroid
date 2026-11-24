// default package

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tt1 extends jb8 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ yv1 c;

    public tt1(yv1 yv1Var, Bitmap bitmap, ArrayList arrayList) {
        this.c = yv1Var;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        this.c.G((jo6) this.b.get(0), rccVar, z, i2, z2, 0L);
    }

    @Override // jb8, pb8
    public final jn5 k(int i) {
        return new jn5(this.a, null, 0);
    }
}
