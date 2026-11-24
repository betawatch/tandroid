// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ColorPicker$RadioButton;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ym2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ ym2(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.L == pVar.M) {
                    pVar.H.setVisibility(4);
                }
                pVar.E = null;
                break;
            default:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                if (pVar.L == 1) {
                    pVar.G.setVisibility(4);
                }
                for (int i = 0; i < colorPicker$RadioButtonArr.length; i++) {
                    if (colorPicker$RadioButtonArr[i].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i].setVisibility(4);
                    }
                }
                pVar.E = null;
                break;
        }
    }
}
