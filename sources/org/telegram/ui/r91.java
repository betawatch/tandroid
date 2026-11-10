package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r91 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public r91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r91.class == obj.getClass()) {
            r91 r91Var = (r91) obj;
            int i7 = this.a;
            if (i7 == r91Var.a && i7 == 0 && this.c.id == r91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
