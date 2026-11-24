// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rt7 extends c79 {
    public final /* synthetic */ x6b F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt7(x6b x6bVar, Context context, gu7 gu7Var, Bitmap bitmap, Bitmap bitmap2, sl0 sl0Var) {
        super(context, gu7Var, bitmap, bitmap2, sl0Var);
        this.F = x6bVar;
    }

    @Override // c79
    public final void g(m01 m01Var) {
        int indexOf = m01.a.indexOf(m01Var);
        int i = indexOf + 1;
        if (i <= 1) {
            indexOf = i;
        }
        x6b x6bVar = this.F;
        x6bVar.a1.b(indexOf);
        x6bVar.s(m01Var);
    }
}
