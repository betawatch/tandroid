package qg;

import ci.c6;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class c1 extends g.p {
    public final /* synthetic */ c6 c;

    public c1(c6 c6Var) {
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
