// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uv3 implements DialogInterface.OnShowListener {
    public final /* synthetic */ zv3 a;

    public uv3(zv3 zv3Var) {
        this.a = zv3Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        zv3 zv3Var = this.a;
        tvc tvcVar = zv3Var.m1;
        if (zv3Var.H0() && tvcVar.f()) {
            tvcVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 2));
        }
    }
}
