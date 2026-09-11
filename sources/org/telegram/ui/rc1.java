package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class rc1 extends org.telegram.ui.Components.ll0 {
    public boolean X2;
    public float Y2;
    public final /* synthetic */ wd1 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc1(Context context, wd1 wd1Var) {
        super(context, null);
        this.Z2 = wd1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean F0(View view) {
        rc1 rc1Var = this.Z2.u0;
        View F = rc1Var.F(view);
        s4.c1 T = F == null ? null : rc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
                wd1 wd1Var = this.Z2;
                if (m32 && (T = wd1Var.u0.T(view)) != null) {
                    if (wd1Var.u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = wd1Var.u0.getMeasuredHeight() - wd1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = wd1Var.u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = wd1Var.u0.K(T2.b() + 1);
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

    @Override // org.telegram.ui.Components.ll0
    public final void g1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f7)) {
            return;
        }
        super.g1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.V0();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        wd1 wd1Var = this.Z2;
        if (action == 1) {
            if (!wd1Var.r0 && (wd1Var.B1 instanceof gj1) && wd1Var.L0[0].getVisibility() == 0) {
                wd1Var.f1(0, false, true);
            }
            wd1Var.r0 = false;
        }
        if (wd1Var.a2) {
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
            wd1Var.S1.a(motionEvent);
        }
        return this.X2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wd1 wd1Var = this.Z2;
        int i10 = 0;
        if (wd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.j81[] j81VarArr = wd1Var.J0;
                if (i11 >= j81VarArr.length) {
                    break;
                }
                j81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (wd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.j81[] j81VarArr2 = wd1Var.K0;
                if (i10 >= j81VarArr2.length) {
                    break;
                }
                j81VarArr2[i10].invalidate();
                i10++;
            }
        }
        uc1 uc1Var = wd1Var.D0;
        if (uc1Var != null) {
            uc1Var.invalidate();
        }
        uc1 uc1Var2 = wd1Var.E0;
        if (uc1Var2 != null) {
            uc1Var2.invalidate();
        }
    }
}
