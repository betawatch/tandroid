package rg;

import ei.r5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
