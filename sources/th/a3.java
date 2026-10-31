package th;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.tz;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(int i10, View view, Object obj) {
        this.a = i10;
        this.b = view;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.c;
        View view = this.b;
        switch (i10) {
            case 0:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) view;
                boolean[] zArr = (boolean[]) obj;
                int i11 = ProfileStoriesView.s0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue > 0.2f) {
                    zArr[0] = true;
                    if (tz.o() > 0) {
                        org.telegram.messenger.i0.b4(profileStoriesView);
                        org.telegram.messenger.i0.h3(new sg.v(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue);
                profileStoriesView.invalidate();
                break;
            default:
                l lVar = (l) view;
                View view2 = (View) obj;
                lVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view2.setAlpha(f7);
                view2.setTranslationY((-org.telegram.messenger.i0.L(5.0f)) * floatValue2);
                lVar.D.setAlpha(floatValue2);
                lVar.D.setTranslationY(org.telegram.messenger.i0.L(5.0f) * f7);
                break;
        }
    }
}
