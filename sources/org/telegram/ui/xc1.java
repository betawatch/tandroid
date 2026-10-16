package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xc1 extends org.telegram.ui.Components.mm0 {
    public boolean V2;
    public float W2;
    public final /* synthetic */ ce1 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(Context context, ce1 ce1Var) {
        super(context, null);
        this.X2 = ce1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        xc1 xc1Var = this.X2.u0;
        View F = xc1Var.F(view);
        s4.b1 T = F == null ? null : xc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.b1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                ce1 ce1Var = this.X2;
                if (m32 && (T = ce1Var.u0.T(view)) != null) {
                    if (ce1Var.u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = ce1Var.u0.getMeasuredHeight() - ce1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = ce1Var.u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.b1 T2 = ce1Var.u0.K(T2.b() + 1);
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

    @Override // org.telegram.ui.Components.mm0
    public final void h1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.h1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.X2.V0();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ce1 ce1Var = this.X2;
        if (action == 1) {
            if (!ce1Var.r0 && (ce1Var.B1 instanceof oj1) && ce1Var.L0[0].getVisibility() == 0) {
                ce1Var.f1(0, false, true);
            }
            ce1Var.r0 = false;
        }
        if (ce1Var.a2) {
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
            ce1Var.S1.a(motionEvent);
        }
        return this.V2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ce1 ce1Var = this.X2;
        int i10 = 0;
        if (ce1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = ce1Var.J0;
                if (i11 >= m91VarArr.length) {
                    break;
                }
                m91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (ce1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr2 = ce1Var.K0;
                if (i10 >= m91VarArr2.length) {
                    break;
                }
                m91VarArr2[i10].invalidate();
                i10++;
            }
        }
        ad1 ad1Var = ce1Var.D0;
        if (ad1Var != null) {
            ad1Var.invalidate();
        }
        ad1 ad1Var2 = ce1Var.E0;
        if (ad1Var2 != null) {
            ad1Var2.invalidate();
        }
    }
}
