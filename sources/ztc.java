// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
