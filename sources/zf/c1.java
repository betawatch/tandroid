package zf;

import lh.r5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c1 extends f2.w {
    public final /* synthetic */ r5 c;

    public c1(r5 r5Var) {
        this.c = r5Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.o0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.p0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
