package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ Object Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp0(KeyEvent.Callback callback, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = callback;
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 2:
                ((xh.s0) this.Y2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public Integer V0(int i10) {
        int i11;
        switch (this.X2) {
            case 1:
                i11 = ((SessionsActivity) this.Y2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
            case 2:
            default:
                return super.V0(i10);
            case 3:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        zh.k0 k0Var;
        switch (this.X2) {
            case 0:
                aq0 aq0Var = (aq0) this.Y2;
                Paint paint = aq0Var.w;
                RectF rectF = aq0Var.s;
                RectF rectF2 = aq0Var.r;
                RectF rectF3 = aq0Var.n;
                s4.c0 c0Var = aq0Var.b;
                if (!aq0Var.f.isEmpty()) {
                    float d = aq0Var.e.d(aq0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m10 = c0Var.m(clamp);
                    View m11 = c0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(aq0Var.x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                zh.o1 o1Var = (zh.o1) this.Y2;
                int i10 = -1;
                if (!o1Var.f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if (!(childAt instanceof zh.f0) || (k0Var = ((zh.f0) childAt).K) == null) {
                                i11++;
                            } else {
                                i10 = k0Var.a;
                            }
                        }
                    }
                }
                if (i10 > o1Var.F) {
                    o1Var.F = i10;
                    zh.a aVar = o1Var.i0.X1;
                    if (aVar != null) {
                        aVar.setCount(o1Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 3:
                if (!((zh.o1) this.Y2).f0) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.X2) {
            case 0:
                super.invalidate();
                kp0 kp0Var = ((aq0) this.Y2).F;
                if (kp0Var != null) {
                    kp0Var.run();
                    break;
                }
                break;
            case 3:
                super.invalidate();
                ((zh.o1) this.Y2).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 2:
                xh.s0 s0Var = (xh.s0) this.Y2;
                s0Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                s0Var.Q(2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
            case 3:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = notificationCenterDelegate;
    }
}
