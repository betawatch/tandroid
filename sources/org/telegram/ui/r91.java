package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r91 extends sg.a {
    public final TLRPC.TL_forumTopic c;

    public r91(int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i3, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || r91.class != obj.getClass()) {
            return false;
        }
        r91 r91Var = (r91) obj;
        if (this.a != r91Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = r91Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
