package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ sc(bd bdVar, int i7) {
        this.a = i7;
        this.b = bdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(true);
                break;
            case 1:
                bd bdVar = this.b;
                bdVar.k0 = true;
                bdVar.n0();
                break;
            case 2:
                bd bdVar2 = this.b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.n0 = null;
                bdVar2.p0 = null;
                bdVar2.o0 = null;
                bdVar2.q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f.j(null, null, bdVar2.w, null);
                bdVar2.n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                break;
            default:
                bd bdVar3 = this.b;
                bdVar3.k0 = true;
                if (bdVar3.y.length() > 0) {
                    bdVar3.j0(bdVar3.y.getText().toString());
                }
                bdVar3.n0();
                break;
        }
    }
}
