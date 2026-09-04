package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
