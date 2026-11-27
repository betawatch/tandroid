// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z47 extends FrameLayout implements snb {
    public final vnb a;
    public final hn b;
    public final hn c;

    public z47(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        hn hnVar = new hn(true, true, true);
        this.b = hnVar;
        k43 k43Var = k43.h;
        hnVar.n(0.3f, 430L, k43Var);
        hnVar.x(hl.o());
        hnVar.u(aob.v0(aob.A8, vnbVar));
        hnVar.w(hl.L(18.0f));
        hnVar.q(!ob6.a0);
        hnVar.setCallback(this);
        Point point = hl.q;
        hnVar.N = point.x;
        hn hnVar2 = new hn(true, true, true);
        this.c = hnVar2;
        hnVar2.n(0.3f, 430L, k43Var);
        hnVar2.u(aob.v0(aob.B8, vnbVar));
        hnVar2.w(hl.L(14.0f));
        hnVar2.q(!ob6.a0);
        hnVar2.setCallback(this);
        hnVar2.N = point.x;
    }

    public final void a(CharSequence charSequence, boolean z) {
        this.c.t(charSequence, z && !ob6.a0, true);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.B8));
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.b.t(charSequence, z && !ob6.a0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = hl.L(29.0f);
        int L2 = hl.L(18.83f);
        hn hnVar = this.c;
        float U1 = hl.U1(hnVar.i(), L, L2);
        int paddingLeft = getPaddingLeft();
        int i = (int) U1;
        int L3 = i - hl.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = hl.L(32.0f) + i;
        hn hnVar2 = this.b;
        hnVar2.setBounds(paddingLeft, L3, measuredWidth, L4);
        hnVar2.draw(canvas);
        hnVar.setBounds(getPaddingLeft(), r0 - hl.L(32.0f), getMeasuredWidth() - getPaddingRight(), hl.L(32.0f) + r0);
        hnVar.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
    }

    @Override // snb
    public final void updateColors() {
        try {
            hn hnVar = this.b;
            vnb vnbVar = this.a;
            if (hnVar != null) {
                hnVar.u(aob.v0(aob.A8, vnbVar));
            }
            hn hnVar2 = this.c;
            if (hnVar2 != null) {
                hnVar2.u(aob.v0(aob.B8, vnbVar));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }
}
