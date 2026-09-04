package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yi0 extends s4.t {
    public final /* synthetic */ cj0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(cj0 cj0Var) {
        super(true);
        this.S = cj0Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        byte b10;
        cj0 cj0Var = this.S;
        MessageObject messageObject = (MessageObject) cj0Var.N.get((B() - 1) - i10);
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
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
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.c0, s4.o0
    public final int j(s4.z0 z0Var) {
        return B0(z0Var);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int k(s4.z0 z0Var) {
        return C0(z0Var);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int l(s4.z0 z0Var) {
        return D0(z0Var);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return true;
    }
}
