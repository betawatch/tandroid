package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vf1 extends pg.a {
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
