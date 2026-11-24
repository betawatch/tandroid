// default package

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vn extends ynd {
    public final ObjectAnimator a;
    public final boolean b;

    public vn(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames() - 1;
        if (z) {
            i = numberOfFrames;
            numberOfFrames = 0;
        } else {
            i = 0;
        }
        wn wnVar = new wn();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        wnVar.b = numberOfFrames2;
        int[] iArr = wnVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            wnVar.a = iArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < numberOfFrames2; i3++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i3) - 1 : i3);
            iArr[i3] = duration;
            i2 += duration;
        }
        wnVar.c = i2;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, numberOfFrames);
        kq2.a(ofInt, true);
        ofInt.setDuration(wnVar.c);
        ofInt.setInterpolator(wnVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // ynd
    public final boolean a() {
        return this.b;
    }

    @Override // ynd
    public final void b() {
        this.a.reverse();
    }

    @Override // ynd
    public final void c() {
        this.a.start();
    }

    @Override // ynd
    public final void d() {
        this.a.cancel();
    }
}
