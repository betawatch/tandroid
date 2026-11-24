// default package

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r4 {
    public static final r4 c;
    public static final r4 d;
    public static final r4 e;
    public static final r4 f;
    public static final r4 g;
    public static final r4 h;
    public final Object a;
    public final int b;

    static {
        new r4(null, 1, null, null);
        new r4(null, 2, null, null);
        new r4(null, 4, null, null);
        new r4(null, 8, null, null);
        c = new r4(null, 16, null, null);
        new r4(null, 32, null, null);
        new r4(null, 64, null, null);
        new r4(null, 128, null, null);
        new r4(null, 256, null, x4.class);
        new r4(null, 512, null, x4.class);
        new r4(null, 1024, null, y4.class);
        new r4(null, 2048, null, y4.class);
        d = new r4(null, TLObject.FLAG_12, null, null);
        e = new r4(null, TLObject.FLAG_13, null, null);
        new r4(null, TLObject.FLAG_14, null, null);
        new r4(null, 32768, null, null);
        new r4(null, 65536, null, null);
        new r4(null, 131072, null, c5.class);
        new r4(null, 262144, null, null);
        new r4(null, TLObject.FLAG_19, null, null);
        new r4(null, TLObject.FLAG_20, null, null);
        new r4(null, TLObject.FLAG_21, null, d5.class);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, a5.class);
        f = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        g = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i = Build.VERSION.SDK_INT;
        new r4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new r4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new r4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new r4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        h = new r4(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, b5.class);
        new r4(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, z4.class);
        new r4(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new r4(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new r4(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new r4(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new r4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new r4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new r4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new r4(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new r4(i >= 34 ? t4.e() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public r4(Object obj, int i, String str, Class cls) {
        this.b = i;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r4)) {
            return false;
        }
        Object obj2 = ((r4) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String e2 = u4.e(this.b);
        if (e2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(e2);
        return sb.toString();
    }
}
