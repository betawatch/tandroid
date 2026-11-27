// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wy3 extends cv9 {
    public int h;
    public boolean n;
    public float r;
    public final /* synthetic */ xy3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy3(xy3 xy3Var, Context context) {
        super(context);
        this.s = xy3Var;
        boolean z = xy3Var.h;
        this.n = z;
        this.r = z ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        oob oobVar = new oob((byte) 5, context, this);
        this.b = oobVar;
        oobVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = xy3.e0[i];
            vy3 vy3Var = new vy3(this, context, xy3.f0[i]);
            vy3Var.setContentDescription(xy3.f(i));
            this.b.addView(vy3Var);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (!this.n || this.d) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.a = false;
                return;
            } else if (action != 2) {
                return;
            }
        }
        this.a = true;
        if (!this.d) {
            this.e = -1;
        }
        this.s.requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.U1(this.r, hl.L(30.0f), hl.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30));
    }

    @Override // cv9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
