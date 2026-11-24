// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uk extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ uk(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setTranslationX(0.0f);
                break;
            case 1:
                gl.B2(this.b);
                break;
            default:
                gl.B2(this.b);
                break;
        }
    }
}
