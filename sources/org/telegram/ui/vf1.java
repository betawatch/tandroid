package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
