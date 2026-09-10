package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zf1 extends ng.a {
    public final TLRPC.TL_forumTopic c;

    public zf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zf1.class == obj.getClass()) {
            zf1 zf1Var = (zf1) obj;
            int i10 = this.a;
            if (i10 == zf1Var.a && i10 == 0 && this.c.id == zf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
