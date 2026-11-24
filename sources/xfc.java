// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xfc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hgc b;

    public /* synthetic */ xfc(hgc hgcVar, byte b) {
        this.a = b;
        this.b = hgcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ml mlVar;
        ml mlVar2;
        byte b = this.a;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                hgcVar.i1 = null;
                hgcVar.f1 = 1.0f;
                hgcVar.Y0 = 0.0f;
                hgcVar.Z0 = 0.0f;
                hgcVar.s.invalidate();
                break;
            case 1:
                xgc.d().a.setAlpha(1.0f);
                gl.d3(new kbc(this, (byte) 8), 200L);
                break;
            case 2:
                hgcVar.L0.e();
                hgcVar.Z.setCornerRadius(-1.0f);
                hgcVar.E0 = false;
                hgcVar.Z.c0 = false;
                hgcVar.q0 = hgcVar.p0;
                hgcVar.y();
                break;
            case 3:
                for (be0 be0Var : hgcVar.W) {
                    vl vlVar = be0Var.e;
                    if (vlVar != null && (mlVar = vlVar.k) != null) {
                        mlVar.u0 = true;
                        mlVar.w0(false);
                    }
                }
                break;
            case 4:
                hgcVar.s();
                for (be0 be0Var2 : hgcVar.W) {
                    vl vlVar2 = be0Var2.e;
                    if (vlVar2 != null && (mlVar2 = vlVar2.k) != null) {
                        mlVar2.u0 = false;
                        mlVar2.x0();
                    }
                }
                hgcVar.S.setVisibility(8);
                break;
            case 5:
                hgcVar.F.setText(k96.M0(2131743248, null));
                hgcVar.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (hgcVar.a0.getTag() == null) {
                    hgcVar.a0.setVisibility(8);
                    break;
                }
                break;
            case 7:
                hgcVar.Z.setTranslationX(0.0f);
                hgcVar.Z.setTranslationY(0.0f);
                hgcVar.Z.setScaleY(1.0f);
                hgcVar.Z.setScaleX(1.0f);
                hgcVar.Z.setVisibility(8);
                break;
            case 8:
                hgcVar.E.setVisibility(8);
                break;
            default:
                hgcVar.f0.setVisibility(8);
                break;
        }
    }
}
