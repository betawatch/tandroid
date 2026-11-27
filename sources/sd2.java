// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class sd2 extends FrameLayout {
    public uic a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z);

    public final void b(boolean z) {
        this.c = z;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 8));
        this.e.setInterpolator(k43.h);
        this.e.setDuration(320L);
        this.e.addListener(new z7((byte) 19, (Object) this, z));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f) {
        this.b = f;
        uic uicVar = this.a;
        if (uicVar != null) {
            uicVar.setPivotX(uicVar.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(hl.R1(0.8f, 1.0f, f));
            this.a.setScaleY(hl.R1(0.8f, 1.0f, f));
        }
        setAlpha(f);
        invalidate();
    }

    public void setTabs(uic uicVar) {
        this.a = uicVar;
        addView(uicVar, tre.c(-1.0f, -1));
    }
}
