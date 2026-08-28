package yf;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d1 extends f2.y0 {
    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessagePosition currentPosition;
        int i9 = 0;
        rect.bottom = 0;
        if (!(view instanceof org.telegram.ui.Cells.t1) || (currentMessagesGroup = (t1Var = (org.telegram.ui.Cells.t1) view).getCurrentMessagesGroup()) == null || (currentPosition = t1Var.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) * 0.5f;
        int extraInsetHeight = t1Var.getExtraInsetHeight();
        int i10 = 0;
        while (true) {
            if (i10 >= currentPosition.siblingHeights.length) {
                break;
            }
            extraInsetHeight += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int round = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
        int size = currentMessagesGroup.posArray.size();
        while (true) {
            if (i9 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i9);
                byte b10 = groupedMessagePosition.minY;
                byte b11 = currentPosition.minY;
                if (b10 == b11 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b10 != b11 || groupedMessagePosition.maxY != currentPosition.maxY) && b10 == b11)) {
                    round = org.telegram.messenger.l0.A(4.0f, (int) Math.ceil(max * groupedMessagePosition.ph), round);
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        rect.bottom = -round;
    }
}
