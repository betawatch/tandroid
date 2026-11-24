// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
