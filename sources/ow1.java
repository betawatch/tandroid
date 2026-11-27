// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ow1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ow1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b = true;
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cx1 cx1Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                chatActivityEnterView.x0 = this.b ? 1.0f : 0.0f;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    my1Var.Y();
                    break;
                }
                break;
            case 1:
                if (chatActivityEnterView.T7) {
                    chatActivityEnterView.l2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 2:
                if (!this.b) {
                    int i = ChatActivityEnterView.X7;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.X5 = false;
                ez1 ez1Var = chatActivityEnterView.Z0;
                if (ez1Var != null) {
                    ez1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                mva mvaVar = chatActivityEnterView.L5;
                if (mvaVar != null) {
                    mvaVar.a();
                }
                Bitmap bitmap = chatActivityEnterView.O5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.O5 = null;
                    break;
                }
                break;
            case 3:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.e2.setVisibility(8);
                    if (this.b && (cx1Var = chatActivityEnterView.y2) != null) {
                        cx1Var.setVisibility(8);
                    }
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            default:
                chatActivityEnterView.B2 = null;
                if (!this.b) {
                    chatActivityEnterView.y2.setVisibility(8);
                    break;
                }
                break;
        }
    }

    public ow1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 2;
        this.c = chatActivityEnterView;
    }
}
