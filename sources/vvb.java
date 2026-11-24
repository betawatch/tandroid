// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vvb extends ja {
    public final TLRPC.TL_forumTopic c;

    public vvb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || vvb.class != obj.getClass()) {
            return false;
        }
        vvb vvbVar = (vvb) obj;
        if (this.a != vvbVar.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = vvbVar.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
