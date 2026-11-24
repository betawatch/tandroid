// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class py9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vz9 c;

    public /* synthetic */ py9(vz9 vz9Var, boolean z, byte b) {
        this.a = b;
        this.c = vz9Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        boolean z = this.b;
        vz9 vz9Var = this.c;
        switch (b) {
            case 0:
                vz9Var.j0.setVisibility(z ? 0 : 8);
                vz9Var.i0.setVisibility(z ? 8 : 0);
                vz9Var.G1 = null;
                if (!z && (arrayList2 = vz9Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = vz9Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    vz9Var.r0.E(false);
                }
                if (!z && (arrayList = vz9Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                FrameLayout frameLayout = vz9Var.k0;
                if (z && vz9Var.j0.getVisibility() == 0) {
                    r1 = 0;
                }
                frameLayout.setVisibility(r1);
                vz9Var.J1 = null;
                break;
        }
    }
}
