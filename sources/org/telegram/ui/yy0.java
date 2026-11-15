package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yy0 extends rg.a {
    public final org.telegram.messenger.ov c;
    public final String d;

    public yy0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.ov ovVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || yy0.class != obj.getClass()) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        if (this.a != yy0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, yy0Var.d);
        }
        org.telegram.messenger.ov ovVar2 = this.c;
        return ovVar2 == null || (ovVar = yy0Var.c) == null || ovVar2.d == ovVar.d;
    }

    public yy0(org.telegram.messenger.ov ovVar) {
        super(2, false);
        this.c = ovVar;
    }

    public yy0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
