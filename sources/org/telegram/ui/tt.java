package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tt {
    public String a;
    public String b;
    public String c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt.class == obj.getClass()) {
            tt ttVar = (tt) obj;
            if (Objects.equals(this.a, ttVar.a) && Objects.equals(this.c, ttVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c);
    }
}
