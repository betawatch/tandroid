package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wb extends wf.a {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public wb(int i9, String str) {
        super(i9, false);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || wb.class != obj.getClass()) {
            return false;
        }
        wb wbVar = (wb) obj;
        TL_stories.Boost boost = wbVar.d;
        boolean z11 = wbVar.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = wbVar.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z10 == z11;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z10 == z11 && this.g == wbVar.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public wb(TL_stories.Boost boost, boolean z10, int i9) {
        super(5, true);
        this.d = boost;
        this.f = z10;
        this.g = i9;
    }
}
