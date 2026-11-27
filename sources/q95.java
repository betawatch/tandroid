// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class q95 extends FrameLayout {
    public int a;
    public sb5 b;
    public ka5 c;
    public wc2 d;
    public boolean e;
    public final boolean f;

    public q95(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public wc2 getParticipant() {
        return this.d;
    }

    public ka5 getRenderer() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f = j95.u5 ? 3.0f : 2.0f;
            float L = (hl.q.x - (hl.L(14.0f) << 1)) + (j95.u5 ? -hl.L(90.0f) : 0);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((j95.v5 ? L / 2.0f : L / f) + hl.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(ka5 ka5Var) {
        this.c = ka5Var;
    }
}
