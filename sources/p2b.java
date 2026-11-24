// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p2b extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ x2b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2b(x2b x2bVar, Context context) {
        super(context);
        this.e = x2bVar;
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        x2b x2bVar = this.e;
        int L = gm.L(6.0f) + (x2bVar.Y1 - x2bVar.t0);
        int L2 = (x2bVar.Y1 - x2bVar.t0) - gm.L(13.0f);
        int i2 = gm.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        if (this.c) {
            int i5 = x2bVar.t0;
            int i6 = i2 << 1;
            if (i3 + i5 < i6) {
                i3 -= Math.min(i2, (i6 - i3) - i5);
                f = 1.0f - Math.min(1.0f, (r3 << 1) / gm.m);
            } else {
                f = 1.0f;
            }
            int i7 = x2bVar.t0;
            int i8 = i3 + i7;
            int i9 = gm.m;
            i = i8 < i9 ? Math.min(i9, (i9 - i3) - i7) : 0;
        } else {
            i = 0;
            f = 1.0f;
        }
        x2bVar.s0.setBounds(0, i3, getMeasuredWidth(), getMeasuredHeight());
        x2bVar.s0.draw(canvas);
        RectF rectF = this.b;
        if (f != 1.0f) {
            cmb.s0.setColor(cmb.v0(cmb.g5, x2bVar.J0));
            rectF.set(x2bVar.u0, x2bVar.t0 + i3, getMeasuredWidth() - x2bVar.u0, gm.L(24.0f) + x2bVar.t0 + i3);
            canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
        }
        int L3 = gm.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i4, (getMeasuredWidth() + L3) / 2, gm.L(4.0f) + i4);
        cmb.s0.setColor(cmb.v0(cmb.yj, x2bVar.J0));
        cmb.s0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i4 - gm.m) / gm.L(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        boolean z = i > gm.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = gm.B(cmb.v0(cmb.g5, x2bVar.J0)) > 0.721f;
            boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, x2bVar.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(x2bVar.getWindow(), z2);
        }
        if (i > 0) {
            cmb.s0.setColor(cmb.v0(cmb.g5, x2bVar.J0));
            canvas.drawRect(x2bVar.u0, gm.m - i, getMeasuredWidth() - x2bVar.u0, gm.m, cmb.s0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            x2b x2bVar = this.e;
            if (x2bVar.Y1 != 0 && motionEvent.getY() < x2bVar.Y1) {
                x2bVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i3 - i;
        x2b x2bVar = this.e;
        if (i5 != i6) {
            this.a = i6;
            t2b t2bVar = x2bVar.n1;
            if (t2bVar != null && x2bVar.Q1 != null) {
                t2bVar.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        x2bVar.U0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int max;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        x2b x2bVar = this.e;
        ArrayList arrayList = x2bVar.R1;
        x2bVar.a2 = true;
        int i5 = x2bVar.u0;
        setPadding(i5, gm.m, i5, 0);
        x2bVar.a2 = false;
        if (x2bVar.K0()) {
            int measuredWidth = x2bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gm.q.x;
            }
            x2bVar.n1.d = Math.max(1, measuredWidth / gm.L(gm.O1() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i) - gm.L(36.0f)) / x2bVar.n1.d;
            x2bVar.I1 = size2;
            x2bVar.J1 = size2;
        } else {
            x2bVar.n1.d = 5;
            x2bVar.I1 = (View.MeasureSpec.getSize(i) - gm.L(36.0f)) / x2bVar.n1.d;
            x2bVar.J1 = gm.L(82.0f);
        }
        float f = x2bVar.n1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x2bVar.m1.getLayoutParams();
        if (arrayList != null) {
            i4 = (Math.max(3, (int) Math.ceil(arrayList.size() / f)) * x2bVar.J1) + gm.L(48.0f) + marginLayoutParams.bottomMargin + x2bVar.t0 + gm.m;
        } else {
            if (x2bVar.Q1 != null) {
                i3 = (x2bVar.n1.n * x2bVar.J1) + (x2bVar.Q1.size() * gm.L(60.0f)) + gm.L(8.0f) + marginLayoutParams.bottomMargin + x2bVar.t0;
                max = gm.L(24.0f);
            } else {
                max = (Math.max(x2bVar.K0() ? 2 : 3, x2bVar.M1 != null ? (int) Math.ceil(r4.documents.size() / f) : 0) * x2bVar.J1) + gm.L(48.0f) + marginLayoutParams.bottomMargin + x2bVar.t0;
                i3 = gm.m;
            }
            i4 = i3 + max;
        }
        if (x2bVar.K0()) {
            i4 = (int) ((x2bVar.J1 * 0.15f) + i4);
        }
        float f2 = size / 5.0f;
        int i6 = ((double) i4) < ((double) f2) * 3.2d ? 0 : (int) (f2 * 2.0f);
        if (i6 != 0 && i4 < size) {
            i6 -= size - i4;
        }
        if (i6 == 0) {
            i6 = x2bVar.t0;
        }
        if (x2bVar.Q1 != null) {
            i6 += gm.L(8.0f);
        }
        if (x2bVar.m1.getPaddingTop() != i6) {
            x2bVar.a2 = true;
            x2bVar.m1.setPadding(gm.L(10.0f), i6, gm.L(10.0f), gm.L(8.0f));
            x2bVar.E1.setPadding(0, i6, 0, 0);
            x2bVar.a2 = false;
        }
        this.c = i4 >= size;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(i4, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.a2) {
            return;
        }
        super.requestLayout();
    }
}
