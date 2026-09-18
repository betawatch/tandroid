package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wf1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public wf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf1.class == obj.getClass()) {
            wf1 wf1Var = (wf1) obj;
            int i10 = this.a;
            if (i10 == wf1Var.a && i10 == 0 && this.c.id == wf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
