package zh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i10, View view, Object obj) {
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
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new xh.x(profileStoriesView, 25), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue);
                profileStoriesView.invalidate();
                break;
            default:
                k kVar = (k) view;
                View view2 = (View) obj;
                kVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view2.setAlpha(f7);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                kVar.y.setAlpha(floatValue2);
                kVar.y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                break;
        }
    }
}
