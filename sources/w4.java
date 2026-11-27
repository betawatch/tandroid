// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class w4 extends AccessibilityNodeProvider {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public w4(ri6 ri6Var) {
        this.b = ri6Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        xo8 xo8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                v4 h = ((ri6) obj).h(i);
                if (h != null) {
                    return h.a;
                }
                return null;
            default:
                int[] iArr = {0, 0};
                ap8 ap8Var = (ap8) obj;
                ArrayList arrayList = ap8Var.a;
                ap8Var.getLocationOnScreen(iArr);
                if (i == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ap8Var);
                    ap8Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        obtain.addChild(ap8Var, ((xo8) arrayList.get(i2)).a);
                    }
                    return obtain;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        xo8Var = null;
                    } else if (((xo8) arrayList.get(i3)).a == i) {
                        xo8Var = (xo8) arrayList.get(i3);
                    } else {
                        i3++;
                    }
                }
                if (xo8Var == null) {
                    return null;
                }
                RectF rectF = xo8Var.d;
                if (rectF.isEmpty()) {
                    return null;
                }
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                obtain2.setSource(ap8Var, i);
                obtain2.setParent(ap8Var);
                obtain2.setPackageName(ap8Var.getContext().getPackageName());
                obtain2.addAction(16);
                obtain2.addAction(64);
                obtain2.setClickable(true);
                obtain2.setFocusable(true);
                obtain2.setEnabled(true);
                obtain2.setVisibleToUser(true);
                obtain2.setClassName(Button.class.getName());
                obtain2.setText(xo8Var.l.i());
                Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                obtain2.setBoundsInParent(rect);
                rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(rect);
                return obtain2;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        switch (this.a) {
            case 0:
                ((ri6) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        switch (this.a) {
            case 0:
                v4 l = ((ri6) this.b).l(i);
                if (l == null) {
                    return null;
                }
                return l.a;
            default:
                return super.findFocus(i);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        xo8 xo8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ri6) obj).E(i, i2, bundle);
            default:
                ap8 ap8Var = (ap8) obj;
                ArrayList arrayList = ap8Var.a;
                if (i == -1) {
                    return ap8Var.performAccessibilityAction(i2, bundle);
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        xo8Var = null;
                    } else if (((xo8) arrayList.get(i3)).a == i) {
                        xo8Var = (xo8) arrayList.get(i3);
                    } else {
                        i3++;
                    }
                }
                if (xo8Var != null) {
                    if (i2 == 64) {
                        if (((AccessibilityManager) ap8Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ap8Var.getContext().getPackageName());
                            obtain.setSource(ap8Var, i);
                            if (ap8Var.getParent() != null) {
                                ap8Var.getParent().requestSendAccessibilityEvent(ap8Var, obtain);
                            }
                        }
                    } else if (i2 == 16) {
                        zo8 zo8Var = ap8Var.y;
                        if (zo8Var != null) {
                            ProfileActivity profileActivity = ((bp8) zo8Var).b;
                            RectF rectF = ProfileActivity.Z6;
                            profileActivity.u2(0.0f, 0.0f, i);
                        }
                    }
                    return true;
                }
                return false;
        }
    }

    public w4(ap8 ap8Var) {
        this.b = ap8Var;
    }
}
