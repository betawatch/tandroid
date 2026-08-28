package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.Components.wk0 {
    public final /* synthetic */ int T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va1(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = i9;
    }

    @Override // org.telegram.ui.Components.wk0
    public Integer W0(int i9) {
        switch (this.T2) {
            case 1:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 8:
                return 0;
            default:
                return super.W0(i9);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 2:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                }
                break;
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z11 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z11 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z11);
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                int h = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h <= size) {
                    size = h;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            case 10:
                int size2 = View.MeasureSpec.getSize(i10);
                int h10 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h10 <= size2) {
                    size2 = h10;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void q0(View view, View view2) {
        switch (this.T2) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    break;
                }
                break;
            case 11:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    break;
                }
                break;
            default:
                super.q0(view, view2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.T2) {
            case 5:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
            case 11:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i9, Rect rect) {
        switch (this.T2) {
            case 9:
                return false;
            default:
                return super.requestFocus(i9, rect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(Context context) {
        super(context, null);
        this.T2 = 12;
    }
}
