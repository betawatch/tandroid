package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ l(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        q qVar = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f.setFocusableInTouchMode(false);
                    break;
                }
                break;
            case 1:
                qVar.n.setFocusableInTouchMode(true);
                break;
            case 2:
                qVar.w.setVisibility(4);
                break;
            default:
                qVar.n.setFocusableInTouchMode(false);
                qVar.f.setVisibility(4);
                break;
        }
    }
}
