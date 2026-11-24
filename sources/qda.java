// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qda implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ qda(KeyEvent.Callback callback, int i, byte b) {
        this.a = b;
        this.c = callback;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        int i = this.b;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                nfa nfaVar = (nfa) callback;
                nfaVar.n0[i].getViewTreeObserver().removeOnPreDrawListener(this);
                nfaVar.N(i);
                break;
            default:
                x7c x7cVar = (x7c) callback;
                ns9 ns9Var = x7cVar.n1;
                ns9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = ns9Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ns9Var.getChildAt(i2);
                    ns9Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i) {
                        if (R == 1 && ns9Var.getAdapter() == x7cVar.o1 && (childAt instanceof l35)) {
                            childAt = ((l35) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(ns9Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ns9Var.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
        }
        return true;
    }
}
