package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qy0 extends sg.a {
    public final org.telegram.messenger.iv c;
    public final String d;

    public qy0(int i3) {
        super(i3, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.iv ivVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || qy0.class != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        if (this.a != qy0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, qy0Var.d);
        }
        org.telegram.messenger.iv ivVar2 = this.c;
        return ivVar2 == null || (ivVar = qy0Var.c) == null || ivVar2.d == ivVar.d;
    }

    public qy0(org.telegram.messenger.iv ivVar) {
        super(2, false);
        this.c = ivVar;
    }

    public qy0(int i3, String str) {
        super(i3, false);
        this.d = str;
        this.c = null;
    }
}
