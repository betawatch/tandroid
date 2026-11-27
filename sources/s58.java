// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class s58 extends v8b {
    public final /* synthetic */ lcb I;
    public final /* synthetic */ o68 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s58(o68 o68Var, Context context, u58 u58Var, x53 x53Var, lcb lcbVar) {
        super(context, u58Var, x53Var);
        this.J = o68Var;
        this.I = lcbVar;
    }

    @Override // v8b
    public final void b(boolean z) {
        k68 k68Var = this.J.A1;
        if (k68Var != null) {
            lcb lcbVar = ((ccb) k68Var).d;
            lcbVar.i1 = z;
            lcbVar.U();
        }
    }

    @Override // v8b
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
