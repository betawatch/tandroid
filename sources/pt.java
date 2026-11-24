// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
