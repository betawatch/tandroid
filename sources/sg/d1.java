package sg;

import fi.q5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d1 extends g.o {
    public final /* synthetic */ q5 c;

    public d1(q5 q5Var) {
        this.c = q5Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.t0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
