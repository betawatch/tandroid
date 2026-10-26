package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class re1 extends qg.a {
    public final TLRPC.TL_forumTopic c;

    public re1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && re1.class == obj.getClass()) {
            re1 re1Var = (re1) obj;
            int i10 = this.a;
            if (i10 == re1Var.a && i10 == 0 && this.c.id == re1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
