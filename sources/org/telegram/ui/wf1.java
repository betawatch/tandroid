package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
