// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sv7 extends e99 {
    public final /* synthetic */ z8b F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv7(z8b z8bVar, Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2, sm0 sm0Var) {
        super(context, hw7Var, bitmap, bitmap2, sm0Var);
        this.F = z8bVar;
    }

    @Override // e99
    public final void g(u11 u11Var) {
        int indexOf = u11.a.indexOf(u11Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        z8b z8bVar = this.F;
        z8bVar.a1.b(indexOf);
        z8bVar.s(u11Var);
    }
}
