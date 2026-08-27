package zf;

import android.view.View;
import java.util.ArrayList;
import lh.r5;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b1 extends f2.y {
    public final /* synthetic */ r5 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r5 r5Var) {
        super(true);
        this.S = r5Var;
    }

    @Override // f2.y
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        r5 r5Var = this.S;
        ArrayList arrayList = r5Var.o0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = r5Var.p0;
        if (groupedMessages != null && size >= 0 && size < arrayList.size() && (position = groupedMessages.getPosition((MessageObject) arrayList.get(size))) != null && position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
            int size2 = groupedMessages.posArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.posArray.get(i11);
                if (groupedMessagePosition != position) {
                    byte b11 = groupedMessagePosition.minY;
                    byte b12 = position.minY;
                    if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // f2.y
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final boolean y0() {
        return false;
    }
}
