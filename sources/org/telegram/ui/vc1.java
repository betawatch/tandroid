package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vc1 extends org.telegram.ui.Components.vl0 {
    public boolean X2;
    public float Y2;
    public final /* synthetic */ ae1 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc1(Context context, ae1 ae1Var) {
        super(context, null);
        this.Z2 = ae1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean F0(View view) {
        vc1 vc1Var = this.Z2.u0;
        View F = vc1Var.F(view);
        s4.c1 T = F == null ? null : vc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = t1Var.m3();
                ae1 ae1Var = this.Z2;
                if (m32 && (T = ae1Var.u0.T(view)) != null) {
                    if (ae1Var.u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = ae1Var.u0.getMeasuredHeight() - ae1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = ae1Var.u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = ae1Var.u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.t1) || !((org.telegram.ui.Cells.t1) view2).n3()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                avatarImage.draw(canvas);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.vl0
    public final void g1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f7)) {
            return;
        }
        super.g1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.V0();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ae1 ae1Var = this.Z2;
        if (action == 1) {
            if (!ae1Var.r0 && (ae1Var.B1 instanceof kj1) && ae1Var.L0[0].getVisibility() == 0) {
                ae1Var.f1(0, false, true);
            }
            ae1Var.r0 = false;
        }
        if (ae1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.Y2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.X2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.X2 && Math.abs(this.Y2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.X2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.X2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            ae1Var.S1.a(motionEvent);
        }
        return this.X2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ae1 ae1Var = this.Z2;
        int i10 = 0;
        if (ae1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w81[] w81VarArr = ae1Var.J0;
                if (i11 >= w81VarArr.length) {
                    break;
                }
                w81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (ae1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.w81[] w81VarArr2 = ae1Var.K0;
                if (i10 >= w81VarArr2.length) {
                    break;
                }
                w81VarArr2[i10].invalidate();
                i10++;
            }
        }
        yc1 yc1Var = ae1Var.D0;
        if (yc1Var != null) {
            yc1Var.invalidate();
        }
        yc1 yc1Var2 = ae1Var.E0;
        if (yc1Var2 != null) {
            yc1Var2.invalidate();
        }
    }
}
