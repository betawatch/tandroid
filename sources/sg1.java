// default package

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sg1 extends ka {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public sg1(TL_stories.Boost boost, boolean z, int i) {
        super(5, true);
        this.d = boost;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || sg1.class != obj.getClass()) {
            return false;
        }
        sg1 sg1Var = (sg1) obj;
        TL_stories.Boost boost = sg1Var.d;
        boolean z2 = sg1Var.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = sg1Var.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z == z2;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z == z2 && this.g == sg1Var.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public sg1(int i, String str) {
        super(i, false);
        this.c = str;
    }
}
