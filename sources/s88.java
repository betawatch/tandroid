// default package

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s88 extends Fade {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ PhotoViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s88(PhotoViewer photoViewer, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        switch (b) {
            case 1:
                this.d = photoViewer;
                this.b = z;
                this.c = z2;
                super(2);
                break;
            default:
                this.d = photoViewer;
                this.b = z;
                this.c = z2;
                break;
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.R1) {
                    onAppear.addListener(new l48(this, (byte) 8));
                    ((ObjectAnimator) onAppear).addUpdateListener(new u28(this, (byte) 1));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.b && this.c && view == this.d.R1) {
                    onDisappear.addListener(new l48(this, (byte) 9));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new u28(this, (byte) 2));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
