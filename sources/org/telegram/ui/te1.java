package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class te1 extends qg.a {
    public final TLRPC.TL_forumTopic c;

    public te1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && te1.class == obj.getClass()) {
            te1 te1Var = (te1) obj;
            int i10 = this.a;
            if (i10 == te1Var.a && i10 == 0 && this.c.id == te1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
