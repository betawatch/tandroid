package u0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends r0.b {
    @Override // r0.b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // r0.b
    public final void c(View view, s0.c cVar) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cVar.i("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            cVar.b(s0.b.e);
            cVar.b(s0.b.f);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            cVar.b(s0.b.d);
            cVar.b(s0.b.g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r6 != 16908346) goto L30;
     */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i10, Bundle bundle) {
        if (super.d(view, i10, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.y(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min != nestedScrollView.getScrollY()) {
                nestedScrollView.y(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        return false;
    }
}
