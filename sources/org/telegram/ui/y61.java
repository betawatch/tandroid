package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y61(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.n6) this.b).getClass();
                break;
            case 3:
            case 5:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                bg.d0 d0Var = (bg.d0) this.b;
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(0.65f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, (org.telegram.ui.ActionBar.i6) this.c)));
                d0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 6:
                ((ug.b1) this.c).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ug.b1 b1Var = (ug.b1) this.c;
                b1Var.f.setAlpha(((ug.z0) this.b).F1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, b1Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        switch (this.a) {
            case 2:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.b;
                if (view != n6Var.v0 || !n6Var.G) {
                    return super.drawChild(canvas, view, j3);
                }
                int save = canvas.save();
                canvas.concat(n6Var.J);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save);
                return drawChild;
            case 5:
                Path path = (Path) this.c;
                tg.f0 f0Var = (tg.f0) this.b;
                if (f0Var.h == null || (!((z10 = f0Var.f) && view == f0Var.d) && (z10 || view != f0Var.c))) {
                    return super.drawChild(canvas, view, j3);
                }
                float measuredWidth = ((z10 ? f0Var.e : 1.0f - f0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 1:
                super.invalidate();
                ai.l0 l0Var = ((x71) this.b).v0;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
            case 2:
            default:
                super.invalidate();
                break;
            case 3:
                super.invalidate();
                ((pg.i) this.b).invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.a6) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.a6) this.c);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int intrinsicHeight = org.telegram.ui.ActionBar.n6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.n6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.n6.i3.draw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(((x71) this.b).getThemedColor(org.telegram.ui.ActionBar.n6.Je));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 1:
                int[] iArr = (int[]) this.c;
                x71 x71Var = (x71) this.b;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    if (x71Var.u0.getTranslationY() != iArr[1]) {
                        x71Var.u0.setTranslationY(-r9);
                        x71Var.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < x71Var.R) {
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 6:
                super.onMeasure(i7, org.telegram.messenger.n10.C(2.0f, ((ug.z0) this.b).u1, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                bg.d0 d0Var = (bg.d0) this.b;
                d0Var.setBounds(0, 0, i7, i10);
                d0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.a) {
            case 3:
                pg.i iVar = (pg.i) this.b;
                pg.d dVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.ui.Components.hn) this.c).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.h3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(dVar);
                    if (!iVar.h) {
                        r1.h hVar = iVar.c.m;
                        if (((float) hVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.i = pg.i.a(displayMetrics, f10);
                        iVar.d.m.i = pg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.m.i);
                        iVar.c.h();
                        iVar.d.h();
                    }
                    iVar.n = false;
                    iVar.f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationX(f10);
                ((pg.i) this.b).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f10);
                ((pg.i) this.b).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = 4;
        this.b = new bg.d0(8);
        this.c = i6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(org.telegram.ui.Wallet.n6 n6Var, Context context) {
        super(context);
        this.a = 2;
        this.b = n6Var;
        this.c = new org.telegram.ui.Wallet.a6(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(x71 x71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = x71Var;
                super(context);
                this.c = new int[2];
                break;
            default:
                this.b = x71Var;
                this.c = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(tg.f0 f0Var, Context context) {
        super(context);
        this.a = 5;
        this.b = f0Var;
        this.c = new Path();
    }
}
