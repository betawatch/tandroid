package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zi0 extends s4.t {
    public final /* synthetic */ dj0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(dj0 dj0Var) {
        super(true);
        this.S = dj0Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        byte b10;
        dj0 dj0Var = this.S;
        MessageObject messageObject = (MessageObject) dj0Var.N.get((B() - 1) - i10);
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        if (l4 != null) {
            MessageObject.GroupedMessagePosition position = l4.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l4.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l4.posArray.get(i11);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
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

    @Override // s4.d0, s4.p0
    public final int j(s4.a1 a1Var) {
        return B0(a1Var);
    }

    @Override // s4.s, s4.d0, s4.p0
    public final int k(s4.a1 a1Var) {
        return C0(a1Var);
    }

    @Override // s4.s, s4.d0, s4.p0
    public final int l(s4.a1 a1Var) {
        return D0(a1Var);
    }

    @Override // s4.s, s4.d0, s4.p0
    public final boolean y0() {
        return true;
    }
}
