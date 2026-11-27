// default package

import android.os.Handler;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
