package yf;

import kh.s5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c1 extends f2.x {
    public final /* synthetic */ s5 c;

    public c1(s5 s5Var) {
        this.c = s5Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.o0.size() - 1) - i9;
        MessageObject.GroupedMessages groupedMessages = this.c.p0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
