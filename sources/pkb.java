// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pkb extends LinearLayout {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkb(ContextThemeWrapper contextThemeWrapper, final s68 s68Var) {
        super(contextThemeWrapper);
        this.a = (byte) 17;
        this.b = new a8[]{r13, r13, r13, r13, r13};
        final byte b = 1;
        setOrientation(1);
        final byte b2 = 0;
        a8 c = r7.c(false, false, this, R.drawable.msg_speed_0_2, k96.M0(2131745026, null), false, null);
        c.d(-328966, -328966);
        c.setOnClickListener(new View.OnClickListener() { // from class: bla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                s68 s68Var2 = s68Var;
                switch (b3) {
                    case 0:
                        PhotoViewer photoViewer = s68Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.y(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = s68Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.y(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = s68Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.y(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = s68Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.y(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = s68Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.y(true, true, 2.0f);
                        break;
                }
            }
        });
        c.setSelectorColor(268435455);
        a8 c2 = r7.c(false, false, this, R.drawable.msg_speed_slow, k96.M0(2131745029, null), false, null);
        c2.d(-328966, -328966);
        c2.setOnClickListener(new View.OnClickListener() { // from class: bla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                s68 s68Var2 = s68Var;
                switch (b3) {
                    case 0:
                        PhotoViewer photoViewer = s68Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.y(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = s68Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.y(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = s68Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.y(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = s68Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.y(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = s68Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.y(true, true, 2.0f);
                        break;
                }
            }
        });
        c2.setSelectorColor(268435455);
        a8 c3 = r7.c(false, false, this, R.drawable.msg_speed_normal, k96.M0(2131745030, null), false, null);
        c3.d(-328966, -328966);
        final byte b3 = 2;
        c3.setOnClickListener(new View.OnClickListener() { // from class: bla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                s68 s68Var2 = s68Var;
                switch (b32) {
                    case 0:
                        PhotoViewer photoViewer = s68Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.y(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = s68Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.y(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = s68Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.y(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = s68Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.y(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = s68Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.y(true, true, 2.0f);
                        break;
                }
            }
        });
        c3.setSelectorColor(268435455);
        a8 c4 = r7.c(false, false, this, R.drawable.msg_speed_fast, k96.M0(2131745033, null), false, null);
        c4.d(-328966, -328966);
        final byte b4 = 3;
        c4.setOnClickListener(new View.OnClickListener() { // from class: bla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                s68 s68Var2 = s68Var;
                switch (b32) {
                    case 0:
                        PhotoViewer photoViewer = s68Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.y(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = s68Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.y(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = s68Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.y(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = s68Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.y(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = s68Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.y(true, true, 2.0f);
                        break;
                }
            }
        });
        c4.setSelectorColor(268435455);
        a8 c5 = r7.c(false, false, this, R.drawable.msg_speed_superfast, k96.M0(2131745027, null), false, null);
        c5.d(-328966, -328966);
        final byte b5 = 4;
        c5.setOnClickListener(new View.OnClickListener() { // from class: bla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                s68 s68Var2 = s68Var;
                switch (b32) {
                    case 0:
                        PhotoViewer photoViewer = s68Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.y(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = s68Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.y(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = s68Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.y(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = s68Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.y(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = s68Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.y(true, true, 2.0f);
                        break;
                }
            }
        });
        c5.setSelectorColor(268435455);
        View ar8Var = new ar8(contextThemeWrapper, (byte) 8);
        ar8Var.setMinimumWidth(gl.L(196.0f));
        ar8Var.setBackgroundColor(-15198184);
        addView(ar8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ar8Var.getLayoutParams();
        if (k96.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gl.L(8.0f);
        ar8Var.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                float f = chatActivityEnterView.y1;
                if (f < 1.0f) {
                    if (f <= 0.0f) {
                        super.dispatchDraw(canvas);
                        break;
                    } else {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.dispatchDraw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        break;
                    }
                }
                break;
            case 11:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                bgc bgcVar = (bgc) this.b;
                Camera camera = bgcVar.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = bgcVar.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f2 = -width;
                float f3 = -height;
                matrix.preTranslate(f2, f3);
                float f4 = width;
                float f5 = height;
                matrix.postTranslate(f4, f5);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = bgcVar.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f2, f3);
                matrix2.postTranslate(f4, f5);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 12:
                rv8 rv8Var = (rv8) this.b;
                pkb pkbVar = rv8Var.c;
                int i = rv8Var.e;
                if (i >= 0 && i < pkbVar.getChildCount()) {
                    float width2 = (r2.getWidth() / 2.0f) + r2.getLeft();
                    if (pkbVar.getChildAt(rv8Var.e).getWidth() != 0) {
                        if (Float.isNaN(rv8Var.f)) {
                            rv8Var.f = width2;
                        } else {
                            float f6 = rv8Var.f;
                            if (f6 != width2) {
                                float f7 = width2 - f6;
                                if (Math.abs(f7) >= 0.5f) {
                                    width2 = (f7 * 0.3f) + rv8Var.f;
                                }
                                rv8Var.f = width2;
                                pkbVar.invalidate();
                            }
                        }
                        canvas.drawCircle(rv8Var.f, pkbVar.getHeight() / 2.0f, (rv8Var.getHeight() - gl.L(6.0f)) / 2.0f, rv8Var.d);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        View view;
        final byte b = 0;
        switch (this.a) {
            case 16:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.b == null || !scrollSlidingTextTabStrip.o0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                final byte b2 = 1;
                if (motionEvent.getAction() == 0) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    int i2 = 0;
                    while (true) {
                        if (i2 < getChildCount()) {
                            view = getChildAt(i2);
                            if (x < view.getX() || x > view.getX() + view.getWidth() || y < view.getY() || y > view.getY() + view.getHeight()) {
                                i2++;
                            }
                        } else {
                            view = null;
                        }
                    }
                    scrollSlidingTextTabStrip.d0 = view;
                    if (view != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.d0));
                        scrollSlidingTextTabStrip.b.getClass();
                        scrollSlidingTextTabStrip.d0 = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view2 = scrollSlidingTextTabStrip.d0;
                    if (view2 != null) {
                        view2.setTranslationX(motionEvent.getX() - 0.0f);
                        int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.d0);
                        if (scrollSlidingTextTabStrip.n == indexOfChild) {
                            scrollSlidingTextTabStrip.invalidate();
                        }
                        if (motionEvent.getX() < gl.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(-gl.L(1.0f), 0);
                        } else if (motionEvent.getX() >= getWidth() - gl.L(16.0f)) {
                            scrollSlidingTextTabStrip.scrollBy(gl.L(1.0f), 0);
                        }
                        float width = (scrollSlidingTextTabStrip.d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.d0.getX();
                        int width2 = scrollSlidingTextTabStrip.d0.getWidth();
                        if (width < 0.0f) {
                            i = 0;
                        } else {
                            i = 0;
                            while (true) {
                                if (i < getChildCount()) {
                                    View childAt = getChildAt(i);
                                    float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                        i++;
                                    }
                                } else {
                                    i = getChildCount() - 1;
                                }
                            }
                        }
                        if (i != indexOfChild) {
                            ir9 ir9Var = scrollSlidingTextTabStrip.b;
                            sparseIntArray.get(i);
                            ir9Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view3 = scrollSlidingTextTabStrip.d0;
                    if (view3 != null) {
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gr9
                            public final /* synthetic */ pkb b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b3 = b;
                                pkb pkbVar = this.b;
                                switch (b3) {
                                    case 0:
                                        pkbVar.invalidate();
                                        ((ScrollSlidingTextTabStrip) pkbVar.b).invalidate();
                                        break;
                                    default:
                                        pkbVar.invalidate();
                                        ((ScrollSlidingTextTabStrip) pkbVar.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(s33.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                } else if (motionEvent.getAction() == 3) {
                    View view4 = scrollSlidingTextTabStrip.d0;
                    if (view4 != null) {
                        view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gr9
                            public final /* synthetic */ pkb b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b3 = b2;
                                pkb pkbVar = this.b;
                                switch (b3) {
                                    case 0:
                                        pkbVar.invalidate();
                                        ((ScrollSlidingTextTabStrip) pkbVar.b).invalidate();
                                        break;
                                    default:
                                        pkbVar.invalidate();
                                        ((ScrollSlidingTextTabStrip) pkbVar.b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(s33.h).start();
                    }
                    scrollSlidingTextTabStrip.d0 = null;
                }
                return scrollSlidingTextTabStrip.d0 != null || super.dispatchTouchEvent(motionEvent);
            case 17:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                if (((rqa) this.b).b0.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 19:
                if (((jva) this.b).u0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 9:
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (getChildAt(i).getVisibility() == 0) {
                        super.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                if (!(view instanceof j8) || ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).O == null) {
                    return super.drawChild(canvas, view, j);
                }
                return false;
            case 2:
                if (view != ((mb0) this.b).a) {
                    return super.drawChild(canvas, view, j);
                }
                return true;
            case 8:
                boolean drawChild = super.drawChild(canvas, view, j);
                wa5 wa5Var = (wa5) this.b;
                if (view == wa5Var.b && wa5Var.y != null) {
                    int measuredHeight = wa5Var.s.getMeasuredHeight();
                    wa5Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), wa5Var.y.getIntrinsicHeight() + measuredHeight);
                    wa5Var.y.draw(canvas);
                }
                return drawChild;
            case 10:
                xh8 xh8Var = (xh8) ((gx0) this.b).d;
                if (view == xh8Var.m2 && xh8Var.C2) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 15:
                er9 er9Var = (er9) this.b;
                if (view instanceof xza) {
                    ((xza) view).a(er9Var.j0);
                }
                if (view != er9Var.s) {
                    return super.drawChild(canvas, view, j);
                }
                return true;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                int i = 0;
                while (true) {
                    z92[] z92VarArr = (z92[]) this.b;
                    if (i >= z92VarArr.length) {
                        break;
                    } else {
                        z92VarArr[i].invalidate();
                        i++;
                    }
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((hgc) this.b).B0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                return ((ek4) this.b).d();
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                setPivotX(getWidth());
                break;
            case 5:
                int paddingLeft = getPaddingLeft();
                int i5 = (i4 - i2) / 2;
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt != ((by3) this.b).s.F && childAt != null) {
                        childAt.layout(paddingLeft, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i5);
                        paddingLeft = de9.w(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 7:
                ((no4) this.b).c.a(getMeasuredWidth());
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 16:
                super.onLayout(z, i, i2, i3, i4);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size;
        int i3 = i2;
        int i4 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(123.0f), TLObject.FLAG_30));
                break;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (i5 < childCount) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(R.id.width_tag);
                            Object tag2 = childAt.getTag(R.id.object_tag);
                            Object tag3 = childAt.getTag(R.id.fit_width_tag);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i, 0, i3, 0);
                            if (tag3 == null) {
                                if (tag instanceof Integer) {
                                    i7 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    int measuredHeight = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = measuredHeight;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = gl.L(6.0f) + measuredHeight;
                                } else if (tag2 == null) {
                                    i6 = Math.max(i6, childAt.getMeasuredWidth());
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i5++;
                        i3 = i2;
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        while (i4 < size2) {
                            ((View) arrayList.get(i4)).getLayoutParams().width = Math.max(i6, i7);
                            i4++;
                        }
                    }
                }
                super.onMeasure(i, i2);
                break;
            case 5:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec(gl.L(((by3) this.b).b.getChildCount() << 5), TLObject.FLAG_30)), i3);
                break;
            case 6:
                ek4 ek4Var = (ek4) this.b;
                super.onMeasure((!ek4Var.d() || (size = ek4Var.J) == null) ? i : View.MeasureSpec.makeMeasureSpec(size.getWidth(), TLObject.FLAG_30), i3);
                break;
            case 9:
                int childCount2 = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount2; i9++) {
                    if (getChildAt(i9).getVisibility() == 0) {
                        i8++;
                    }
                }
                int size3 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                int size4 = View.MeasureSpec.getSize(i3);
                if (i8 != 0) {
                    int min = Math.min(gl.L(56.0f), size3 / i8);
                    if (((PhotoViewer) this.b).k1.getVisibility() == 0) {
                        int max = Math.max(0, (min - gl.L(((PhotoViewer) this.b).d8 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.b).k1.setPadding(max, 0, max, 0);
                    }
                    while (i4 < childCount2) {
                        View childAt2 = getChildAt(i4);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                        }
                        i4++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i8), size4);
                    break;
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size3, size4);
                    break;
                }
            case 13:
                int size5 = View.MeasureSpec.getSize(i);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                hd9 hd9Var = (hd9) this.b;
                LinearLayout linearLayout = hd9Var.n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hd9Var.n0.getLayoutParams();
                    paddingRight += hd9Var.n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = hd9Var.o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) hd9Var.o0.getLayoutParams();
                    paddingRight += hd9Var.o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = hd9Var.p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) hd9Var.p0.getLayoutParams();
                    paddingRight += hd9Var.p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                hd9Var.l0 = Math.max(0, size5 - paddingRight);
                super.onMeasure(i, i2);
                break;
            case 14:
                int size6 = View.MeasureSpec.getSize(i);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                df9 df9Var = (df9) this.b;
                LinearLayout linearLayout4 = df9Var.O;
                LinearLayout linearLayout5 = df9Var.N;
                LinearLayout linearLayout6 = df9Var.M;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) linearLayout6.getLayoutParams();
                    paddingRight2 += linearLayout6.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) linearLayout5.getLayoutParams();
                    paddingRight2 += linearLayout5.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) linearLayout4.getLayoutParams();
                    paddingRight2 += linearLayout4.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                df9Var.L = Math.max(0, size6 - paddingRight2);
                super.onMeasure(i, i2);
                break;
            case 21:
                super.onMeasure(i, i2);
                if (k96.a0) {
                    ((ozb) this.b).c.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 22:
                super.onMeasure(i, i2);
                p3c p3cVar = (p3c) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) p3cVar.c.getLayoutParams();
                int L = gl.L(8.0f) + (p3cVar.a.getVisibility() == 8 ? gl.m : 0);
                if (p3cVar.P == 2 && gl.M1()) {
                    Point point = gl.q;
                    if (point.x <= point.y) {
                        i4 = gl.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i4;
                break;
            case 24:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((hmc) this.b).D0) * getMeasuredHeight()));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 16:
                super.setAlpha(f);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 20:
                zya zyaVar = (zya) this.b;
                be0 be0Var = zyaVar.b;
                if (getVisibility() == 8 && i == 0) {
                    zyaVar.c();
                    if (e66.e(3)) {
                        be0Var.getImageReceiver().w0(false);
                    }
                } else if (i == 8) {
                    be0Var.getImageReceiver().f();
                }
                super.setVisibility(i);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
