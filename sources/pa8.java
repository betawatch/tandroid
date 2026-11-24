// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pa8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa8 b;

    public /* synthetic */ pa8(qa8 qa8Var, byte b) {
        this.a = b;
        this.b = qa8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qa8 qa8Var = this.b;
        switch (b) {
            case 0:
                qa8Var.h = false;
                qa8Var.a = qa8Var.c;
                qa8Var.invalidate();
                int i = qa8Var.K;
                if (i >= 0) {
                    qa8Var.b(i);
                    qa8Var.K = -1;
                    break;
                }
                break;
            default:
                qa8Var.n = false;
                qa8Var.h = false;
                qa8Var.invalidate();
                int i2 = qa8Var.K;
                if (i2 >= 0) {
                    qa8Var.b(i2);
                    qa8Var.K = -1;
                }
                qa8Var.a();
                break;
        }
    }
}
