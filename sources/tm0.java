// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
