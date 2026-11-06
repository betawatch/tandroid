package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sb extends rg.a {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public sb(int i7, String str) {
        super(i7, false);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z9 = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        TL_stories.Boost boost = sbVar.d;
        boolean z10 = sbVar.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sbVar.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z9 == z10;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z9 == z10 && this.g == sbVar.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public sb(TL_stories.Boost boost, boolean z9, int i7) {
        super(5, true);
        this.d = boost;
        this.f = z9;
        this.g = i7;
    }
}
