package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class uf1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public uf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uf1.class == obj.getClass()) {
            uf1 uf1Var = (uf1) obj;
            int i10 = this.a;
            if (i10 == uf1Var.a && i10 == 0 && this.c.id == uf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
