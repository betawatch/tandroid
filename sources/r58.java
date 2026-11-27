// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class r58 extends v8b {
    public final /* synthetic */ lcb I;
    public final /* synthetic */ o68 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r58(o68 o68Var, Context context, t58 t58Var, x53 x53Var, lcb lcbVar) {
        super(context, t58Var, x53Var);
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
