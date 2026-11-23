package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r61 extends org.telegram.ui.Components.ek0 {
    public boolean f3;
    public float g3;
    public final /* synthetic */ x71 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(Context context, x71 x71Var) {
        super(context, null);
        this.h3 = x71Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean F0(View view) {
        r61 r61Var = this.h3.w0;
        View F = r61Var.F(view);
        v4.f1 T = F == null ? null : r61Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4.f1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            r1Var.getMessageObject();
            ImageReceiver avatarImage = r1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = r1Var.K2();
                x71 x71Var = this.h3;
                if (K2 && (T = x71Var.w0.T(view)) != null) {
                    if (x71Var.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = r1Var.getTranslationX();
                int layoutHeight = r1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = x71Var.w0.getMeasuredHeight() - x71Var.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (r1Var.L2() && (r12 = x71Var.w0.T(view)) != null) {
                    int i7 = 0;
                    while (i7 < 20) {
                        i7++;
                        v4.f1 T2 = x71Var.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.r1) || !((org.telegram.ui.Cells.r1) view2).L2()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void j1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.r1) && !((org.telegram.ui.Cells.r1) view).E2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.h3.a1();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        x71 x71Var = this.h3;
        if (action == 1) {
            if (!x71Var.t0 && (x71Var.D1 instanceof rc1) && x71Var.N0[0].getVisibility() == 0) {
                x71Var.k1(0, false, true);
            }
            x71Var.t0 = false;
        }
        if (x71Var.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > org.telegram.messenger.g0.e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            x71Var.U1.a(motionEvent);
        }
        return this.f3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        x71 x71Var = this.h3;
        int i7 = 0;
        if (x71Var.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.k71[] k71VarArr = x71Var.L0;
                if (i10 >= k71VarArr.length) {
                    break;
                }
                k71VarArr[i10].invalidate();
                i10++;
            }
        }
        if (x71Var.M0 != null) {
            while (true) {
                org.telegram.ui.Components.k71[] k71VarArr2 = x71Var.M0;
                if (i7 >= k71VarArr2.length) {
                    break;
                }
                k71VarArr2[i7].invalidate();
                i7++;
            }
        }
        u61 u61Var = x71Var.F0;
        if (u61Var != null) {
            u61Var.invalidate();
        }
        u61 u61Var2 = x71Var.G0;
        if (u61Var2 != null) {
            u61Var2.invalidate();
        }
    }
}
