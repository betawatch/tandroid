package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sc1 extends org.telegram.ui.Components.qm0 {
    public boolean V2;
    public float W2;
    public final /* synthetic */ xd1 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(Context context, xd1 xd1Var) {
        super(context, null);
        this.X2 = xd1Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean F0(View view) {
        sc1 sc1Var = this.X2.u0;
        View F = sc1Var.F(view);
        s4.d1 T = F == null ? null : sc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.d1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                xd1 xd1Var = this.X2;
                if (m32 && (T = xd1Var.u0.T(view)) != null) {
                    if (xd1Var.u0.K(T.b() - 1) != null) {
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
                if (u1Var.n3() && (r11 = xd1Var.u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.d1 T2 = xd1Var.u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
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

    @Override // org.telegram.ui.Components.qm0
    public final void h1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.h1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.X2.V0();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xd1 xd1Var = this.X2;
        if (action == 1) {
            if (!xd1Var.r0 && (xd1Var.B1 instanceof ij1) && xd1Var.L0[0].getVisibility() == 0) {
                xd1Var.f1(0, false, true);
            }
            xd1Var.r0 = false;
        }
        if (xd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.W2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.V2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.V2 && Math.abs(this.W2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.V2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.V2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            xd1Var.S1.a(motionEvent);
        }
        return this.V2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xd1 xd1Var = this.X2;
        int i10 = 0;
        if (xd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr = xd1Var.J0;
                if (i11 >= p91VarArr.length) {
                    break;
                }
                p91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (xd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.p91[] p91VarArr2 = xd1Var.K0;
                if (i10 >= p91VarArr2.length) {
                    break;
                }
                p91VarArr2[i10].invalidate();
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
