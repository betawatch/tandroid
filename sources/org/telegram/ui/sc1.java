package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class sc1 extends org.telegram.ui.Components.vl0 {
    public boolean X2;
    public float Y2;
    public final /* synthetic */ xd1 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(Context context, xd1 xd1Var) {
        super(context, null);
        this.Z2 = xd1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean G0(View view) {
        sc1 sc1Var = this.Z2.u0;
        View G = sc1Var.G(view);
        s4.c1 U = G == null ? null : sc1Var.U(G);
        return U == null || U.f != 2;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 U;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                xd1 xd1Var = this.Z2;
                if (m32 && (U = xd1Var.u0.U(view)) != null) {
                    if (xd1Var.u0.L(U.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = xd1Var.u0.getMeasuredHeight() - xd1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = xd1Var.u0.U(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 U2 = xd1Var.u0.L(U2.b() + 1);
                        if (U2 == null) {
                            break;
                        }
                        View view2 = U2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.u1) || !((org.telegram.ui.Cells.u1) view2).n3()) {
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
    public final void i1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.i1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.V0();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xd1 xd1Var = this.Z2;
        if (action == 1) {
            if (!xd1Var.r0 && (xd1Var.B1 instanceof fj1) && xd1Var.L0[0].getVisibility() == 0) {
                xd1Var.f1(0, false, true);
            }
            xd1Var.r0 = false;
        }
        if (xd1Var.a2) {
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
            xd1Var.S1.a(motionEvent);
        }
        return this.X2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xd1 xd1Var = this.Z2;
        int i10 = 0;
        if (xd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = xd1Var.J0;
                if (i11 >= y81VarArr.length) {
                    break;
                }
                y81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (xd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr2 = xd1Var.K0;
                if (i10 >= y81VarArr2.length) {
                    break;
                }
                y81VarArr2[i10].invalidate();
                i10++;
            }
        }
        vc1 vc1Var = xd1Var.D0;
        if (vc1Var != null) {
            vc1Var.invalidate();
        }
        vc1 vc1Var2 = xd1Var.E0;
        if (vc1Var2 != null) {
            vc1Var2.invalidate();
        }
    }
}
