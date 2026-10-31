package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ub1 extends hg.b {
    public final TLRPC.TL_forumTopic c;

    public ub1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ub1.class != obj.getClass()) {
            return false;
        }
        ub1 ub1Var = (ub1) obj;
        if (this.a != ub1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = ub1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
