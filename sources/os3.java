// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class os3 extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ms3 h;
    public boolean n;
    public final boolean r;
    public boolean s;
    public s76 w;
    public o1 x;

    public os3(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.r = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30) : 0);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z3 = false;
                    if (z || z3) {
                        this.s = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    s76 s76Var = this.w;
                    if (!z) {
                        if (s76Var == null) {
                            s76Var = new s76(this);
                            this.w = s76Var;
                        }
                        s76Var.F = true;
                        s76Var.onTouch(this, motionEvent);
                    } else if (s76Var != null) {
                        if (s76Var.F) {
                            s76Var.d();
                        }
                        s76Var.F = false;
                    }
                    return z;
                }
                z3 = false;
                z = false;
                if (z) {
                }
                this.s = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                s76 s76Var2 = this.w;
                if (!z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.s = true;
                js3.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f = pointToPosition;
                js3.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || pointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.a;
                rect.set(left, top, right, bottom);
                rect.left -= this.b;
                rect.top -= this.c;
                rect.right += this.d;
                rect.bottom += this.e;
                if (b21.a()) {
                    z2 = ls3.a(this);
                } else {
                    Field field = ns3.a;
                    if (field != null) {
                        try {
                            z2 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z2 = false;
                }
                if (childAt3.isEnabled() != z2) {
                    boolean z5 = !z2;
                    if (b21.a()) {
                        ls3.b(this, z5);
                    } else {
                        Field field2 = ns3.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                ms3 ms3Var = this.h;
                if (ms3Var != null) {
                    ms3Var.b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = false;
                z = true;
            }
            if (z) {
            }
            this.s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            s76 s76Var22 = this.w;
            if (!z) {
            }
            return z;
        }
        z3 = false;
        z = false;
        if (z) {
        }
        this.s = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        s76 s76Var222 = this.w;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.x == null) {
            super.drawableStateChanged();
            ms3 ms3Var = this.h;
            if (ms3Var != null) {
                ms3Var.b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.r || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.r || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.r || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.r && this.n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.x == null) {
            o1 o1Var = new o1(this, (byte) 27);
            this.x = o1Var;
            post(o1Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !ks3.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        ks3.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        ks3.b.invoke(this, Integer.valueOf(pointToPosition));
                        ks3.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o1 o1Var = this.x;
        if (o1Var != null) {
            os3 os3Var = (os3) o1Var.b;
            os3Var.x = null;
            os3Var.removeCallbacks(o1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.n = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        ms3 ms3Var = null;
        if (drawable != null) {
            ms3 ms3Var2 = new ms3();
            Drawable drawable2 = ms3Var2.a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            ms3Var2.a = drawable;
            drawable.setCallback(ms3Var2);
            ms3Var2.b = true;
            ms3Var = ms3Var2;
        }
        this.h = ms3Var;
        super.setSelector(ms3Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
}
