package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xb1 extends org.telegram.ui.Components.tl0 {
    public boolean U2;
    public float V2;
    public final /* synthetic */ ed1 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(Context context, ed1 ed1Var) {
        super(context, null);
        this.W2 = ed1Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean F0(View view) {
        xb1 xb1Var = this.W2.r0;
        View F = xb1Var.F(view);
        f2.m1 T = F == null ? null : xb1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.m1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = t1Var.m3();
                ed1 ed1Var = this.W2;
                if (m32 && (T = ed1Var.r0.T(view)) != null) {
                    if (ed1Var.r0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = ed1Var.r0.getMeasuredHeight() - ed1Var.r0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = ed1Var.r0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.m1 T2 = ed1Var.r0.K(T2.b() + 1);
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

    @Override // org.telegram.ui.Components.tl0
    public final void h1(View view, float f10, float f11, boolean z4) {
        if (z4 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f10)) {
            return;
        }
        super.h1(view, f10, f11, z4);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W2.V0();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ed1 ed1Var = this.W2;
        if (action == 1) {
            if (!ed1Var.o0 && (ed1Var.y1 instanceof pi1) && ed1Var.I0[0].getVisibility() == 0) {
                ed1Var.f1(0, false, true);
            }
            ed1Var.o0 = false;
        }
        if (ed1Var.X1) {
            if (motionEvent.getAction() == 0) {
                this.V2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.U2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.U2 && Math.abs(this.V2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.U2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.U2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            ed1Var.P1.a(motionEvent);
        }
        return this.U2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tl0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ed1 ed1Var = this.W2;
        int i10 = 0;
        if (ed1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr = ed1Var.G0;
                if (i11 >= n81VarArr.length) {
                    break;
                }
                n81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (ed1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr2 = ed1Var.H0;
                if (i10 >= n81VarArr2.length) {
                    break;
                }
                n81VarArr2[i10].invalidate();
                i10++;
            }
        }
        bc1 bc1Var = ed1Var.A0;
        if (bc1Var != null) {
            bc1Var.invalidate();
        }
        bc1 bc1Var2 = ed1Var.B0;
        if (bc1Var2 != null) {
            bc1Var2.invalidate();
        }
    }
}
