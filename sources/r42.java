// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r42 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ r42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                b52 b52Var = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((b52Var == null || !b52Var.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                b52 b52Var2 = chatAttachAlertPhotoLayout.Q;
                if (b52Var2 != null) {
                    b52Var2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.W3.I0();
                }
                b52 b52Var3 = chatAttachAlertPhotoLayout.Q;
                if (b52Var3 != null) {
                    b52Var3.setSystemUiVisibility(1028);
                }
                s42 s42Var = chatAttachAlertPhotoLayout.F;
                if (s42Var != null) {
                    s42Var.invalidate();
                    break;
                }
                break;
            default:
                azc azcVar = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                s42 s42Var2 = chatAttachAlertPhotoLayout.F;
                if (s42Var2 != null) {
                    s42Var2.invalidate();
                }
                b52 b52Var4 = chatAttachAlertPhotoLayout.Q;
                if (b52Var4 != null) {
                    b52Var4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                yc ycVar = chatAttachAlertPhotoLayout.k0;
                if (ycVar != null) {
                    ycVar.setVisibility(8);
                }
                if (azcVar != null) {
                    azcVar.setVisibility(8);
                    azcVar.setTag(null);
                }
                s42 s42Var3 = chatAttachAlertPhotoLayout.r;
                if (s42Var3 != null) {
                    s42Var3.setVisibility(8);
                }
                b52 b52Var5 = chatAttachAlertPhotoLayout.Q;
                if (b52Var5 != null) {
                    b52Var5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}
