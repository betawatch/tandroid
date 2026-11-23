package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s81 extends FrameLayout {
    public final /* synthetic */ int a;
    public float b;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s81(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float f10 = ((1.0f - this.b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.b;
                    if (f11 != 1.0f) {
                        this.b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (this.c) {
                    float f12 = this.b + 0.013333334f;
                    this.b = f12;
                    if (f12 > 1.0f) {
                        this.c = false;
                        this.b = 1.0f;
                    }
                } else {
                    float f13 = this.b - 0.013333334f;
                    this.b = f13;
                    if (f13 < 0.0f) {
                        this.c = true;
                        this.b = 0.0f;
                    }
                }
                ((TextView) this.d).setTranslationX(org.telegram.ui.Components.kr.f.getInterpolation(this.b) * org.telegram.messenger.g0.L(8.0f) * (org.telegram.messenger.gd.a0 ? -1 : 1));
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                super.setPressed(z10);
                if (this.c != z10) {
                    this.c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f10 = this.b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new hz0(this, 12));
                            ((ValueAnimator) this.d).addListener(new i71(this, 1));
                            org.telegram.ui.Cells.c0.q(5.0f, (ValueAnimator) this.d);
                            ((ValueAnimator) this.d).setDuration(350L);
                            ((ValueAnimator) this.d).start();
                            break;
                        }
                    }
                }
                break;
            default:
                super.setPressed(z10);
                break;
        }
    }
}
