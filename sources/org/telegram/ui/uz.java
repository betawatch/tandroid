package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uz {
    public long a;
    public int b;

    public uz(int i7, long j3) {
        this.a = j3;
        this.b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uz.class == obj.getClass()) {
            uz uzVar = (uz) obj;
            if (this.a == uzVar.a && this.b == uzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
