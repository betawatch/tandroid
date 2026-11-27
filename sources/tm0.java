// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tm0 implements fd, nr7, sy4 {
    public final /* synthetic */ nx0 a;

    public /* synthetic */ tm0(nx0 nx0Var) {
        this.a = nx0Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        return this.a.Y(l2dVar);
    }

    @Override // sy4
    public final int h() {
        return aob.v0(aob.h5, this.a.J0);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.dismiss();
        bx4.g1(false, null);
    }
}
