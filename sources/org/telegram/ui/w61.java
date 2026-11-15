package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w61(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.y5) this.c).getClass();
                break;
            case 2:
            case 4:
            default:
                super.dispatchDraw(canvas);
                break;
            case 3:
                bg.c0 c0Var = (bg.c0) this.c;
                c0Var.b(org.telegram.ui.ActionBar.j6.r1(0.65f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, (org.telegram.ui.ActionBar.e6) this.b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 5:
                ((ug.z0) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ug.z0 z0Var = (ug.z0) this.b;
                z0Var.f.setAlpha(((ug.x0) this.c).F1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, z0Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
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
            case 1:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.c;
                if (view != y5Var.t0 || !y5Var.G) {
                    return super.drawChild(canvas, view, j3);
                }
                int save = canvas.save();
                canvas.concat(y5Var.J);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save);
                return drawChild;
            case 4:
                Path path = (Path) this.b;
                tg.f0 f0Var = (tg.f0) this.c;
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
            case 0:
                super.invalidate();
                ai.l0 l0Var = ((t71) this.c).v0;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((pg.i) this.c).invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.l5) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.l5) this.b);
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
                int[] iArr = (int[]) this.b;
                t71 t71Var = (t71) this.c;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    if (t71Var.u0.getTranslationY() != iArr[1]) {
                        t71Var.u0.setTranslationY(-r6);
                        t71Var.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < t71Var.R) {
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
            case 5:
                super.onMeasure(i7, org.telegram.messenger.i20.B(2.0f, ((ug.x0) this.c).u1, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i7, i10, i11, i12);
                bg.c0 c0Var = (bg.c0) this.c;
                c0Var.setBounds(0, 0, i7, i10);
                c0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
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
            case 2:
                pg.i iVar = (pg.i) this.c;
                pg.d dVar = iVar.r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.messenger.ou) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.i3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(dVar);
                    if (!iVar.h) {
                        r1.h hVar = iVar.c.m;
                        if (((float) hVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
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
            case 2:
                super.setTranslationX(f10);
                ((pg.i) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                ((pg.i) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 3;
        this.c = new bg.c0(8);
        this.b = e6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context);
        this.a = 1;
        this.c = y5Var;
        this.b = new org.telegram.ui.Wallet.l5(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(Context context, t71 t71Var) {
        super(context);
        this.a = 0;
        this.c = t71Var;
        this.b = new int[2];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(tg.f0 f0Var, Context context) {
        super(context);
        this.a = 4;
        this.c = f0Var;
        this.b = new Path();
    }
}
