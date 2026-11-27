// default package

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wm extends mqd {
    public final ObjectAnimator a;
    public final boolean b;

    public wm(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames() - 1;
        if (z) {
            i = numberOfFrames;
            numberOfFrames = 0;
        } else {
            i = 0;
        }
        xm xmVar = new xm();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        xmVar.b = numberOfFrames2;
        int[] iArr = xmVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            xmVar.a = iArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < numberOfFrames2; i3++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i3) - 1 : i3);
            iArr[i3] = duration;
            i2 += duration;
        }
        xmVar.c = i2;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, numberOfFrames);
        sp2.a(ofInt, true);
        ofInt.setDuration(xmVar.c);
        ofInt.setInterpolator(xmVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // mqd
    public final boolean a() {
        return this.b;
    }

    @Override // mqd
    public final void b() {
        this.a.reverse();
    }

    @Override // mqd
    public final void c() {
        this.a.start();
    }

    @Override // mqd
    public final void d() {
        this.a.cancel();
    }
}
