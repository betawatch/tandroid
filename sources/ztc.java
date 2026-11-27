// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ztc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ztc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                duc ducVar = (duc) obj;
                ducVar.n = null;
                ducVar.d.setVisibility(ducVar.x ? 4 : 0);
                ducVar.f.setVisibility(ducVar.y ? 0 : 4);
                break;
            case 1:
                ((hyc) obj).f0 = null;
                break;
            case 2:
                ((jzc) ((tu) obj).b).c.setVisibility(4);
                break;
            default:
                ((r3d) obj).L = null;
                break;
        }
    }
}
