package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u51 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u51(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3 = i3;
    }

    @Override // org.telegram.ui.Components.tj0
    public Integer V0(int i3) {
        switch (this.f3) {
            case 1:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 8:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
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

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.f3) {
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                int b10 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b10 <= size) {
                    size = b10;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            case 10:
                int size2 = View.MeasureSpec.getSize(i10);
                int b11 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b11 <= size2) {
                    size2 = b11;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void r0(View view, View view2) {
        switch (this.f3) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.r0(view, view2);
                    break;
                }
                break;
            case 11:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.r0(view, view2);
                    break;
                }
                break;
            default:
                super.r0(view, view2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f3) {
            case 5:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                break;
            case 11:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i3, Rect rect) {
        switch (this.f3) {
            case 9:
                return false;
            default:
                return super.requestFocus(i3, rect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(Context context) {
        super(context, null);
        this.f3 = 12;
    }
}
