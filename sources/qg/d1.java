package qg;

import ci.c6;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d1 extends g.p {
    public final /* synthetic */ c6 c;

    public d1(c6 c6Var) {
        this.c = c6Var;
    }

    @Override // g.p
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.t0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
