package qg;

import android.view.View;
import ci.b6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c1 extends s4.t {
    public final /* synthetic */ b6 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(b6 b6Var) {
        super(true);
        this.S = b6Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        b6 b6Var = this.S;
        ArrayList arrayList = b6Var.s0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b6Var.t0;
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

    @Override // s4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return false;
    }
}
