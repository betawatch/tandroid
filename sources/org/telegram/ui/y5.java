package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class y5 extends pg.a {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public y5(int i10, String str) {
        super(i10, false);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        TL_stories.Boost boost = y5Var.d;
        boolean z11 = y5Var.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = y5Var.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z10 == z11;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z10 == z11 && this.g == y5Var.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public y5(TL_stories.Boost boost, boolean z10, int i10) {
        super(5, true);
        this.d = boost;
        this.f = z10;
        this.g = i10;
    }
}
