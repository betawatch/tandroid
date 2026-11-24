// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rw1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ rw1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
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
        pw1 pw1Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                if (chatActivityEnterView.o7) {
                    chatActivityEnterView.m2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    int i = ChatActivityEnterView.r7;
                    chatActivityEnterView.t(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.O5 = false;
                my1 my1Var = chatActivityEnterView.Z0;
                if (my1Var != null) {
                    my1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                kra kraVar = chatActivityEnterView.E5;
                if (kraVar != null) {
                    kraVar.a();
                }
                Bitmap bitmap = chatActivityEnterView.F5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.F5 = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.f2.setVisibility(8);
                    if (this.b && (pw1Var = chatActivityEnterView.z2) != null) {
                        pw1Var.setVisibility(8);
                    }
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 3:
                chatActivityEnterView.C2 = null;
                if (!this.b) {
                    chatActivityEnterView.z2.setVisibility(8);
                    break;
                }
                break;
            default:
                chatActivityEnterView.x0 = this.b ? 1.0f : 0.0f;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    wx1Var.Z();
                    break;
                }
                break;
        }
    }

    public rw1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
    }
}
