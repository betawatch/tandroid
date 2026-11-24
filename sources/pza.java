// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pza extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rza c;

    public /* synthetic */ pza(rza rzaVar, boolean z, byte b) {
        this.a = b;
        this.c = rzaVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rza rzaVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    rzaVar.h.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    rzaVar.y.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        rza rzaVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    rzaVar.h.setVisibility(0);
                    break;
                }
                break;
            default:
                if (z) {
                    rzaVar.y.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
