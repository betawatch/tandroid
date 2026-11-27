// default package

import android.os.Handler;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class va3 implements or3 {
    public final mr3 a;
    public jr3 b;
    public boolean c;
    public final /* synthetic */ wa3 d;

    public va3(wa3 wa3Var, mr3 mr3Var) {
        this.d = wa3Var;
        this.a = mr3Var;
    }

    @Override // or3
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        gcc.X(handler, new vd2(this, (byte) 26));
    }
}
