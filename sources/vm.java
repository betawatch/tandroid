// default package

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vm extends wld {
    public final ObjectAnimator a;
    public final boolean b;

    public vm(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames() - 1;
        if (z) {
            i = numberOfFrames;
            numberOfFrames = 0;
        } else {
            i = 0;
        }
        wm wmVar = new wm();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        wmVar.b = numberOfFrames2;
        int[] iArr = wmVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            wmVar.a = iArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < numberOfFrames2; i3++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i3) - 1 : i3);
            iArr[i3] = duration;
            i2 += duration;
        }
        wmVar.c = i2;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, numberOfFrames);
        zo2.a(ofInt, true);
        ofInt.setDuration(wmVar.c);
        ofInt.setInterpolator(wmVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // wld
    public final boolean a() {
        return this.b;
    }

    @Override // wld
    public final void b() {
        this.a.reverse();
    }

    @Override // wld
    public final void c() {
        this.a.start();
    }

    @Override // wld
    public final void d() {
        this.a.cancel();
    }
}
