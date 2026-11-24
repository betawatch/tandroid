// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AnimatorSet b;

    public /* synthetic */ pt(AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.start();
    }
}
