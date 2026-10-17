package rg;

import ei.r5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c1 extends g.o {
    public final /* synthetic */ r5 c;

    public c1(r5 r5Var) {
        this.c = r5Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.t0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
