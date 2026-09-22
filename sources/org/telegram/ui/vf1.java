package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class vf1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public vf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf1.class == obj.getClass()) {
            vf1 vf1Var = (vf1) obj;
            int i10 = this.a;
            if (i10 == vf1Var.a && i10 == 0 && this.c.id == vf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
