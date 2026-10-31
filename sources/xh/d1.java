package xh;

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.a) {
            case 0:
                contains = ((HashSet) this.b).contains(Long.valueOf(((f1) obj).b));
                break;
            case 1:
                contains = ((HashSet) this.b).contains(Long.valueOf(((f1) obj).b));
                break;
            default:
                ph.l1 l1Var = (ph.l1) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = l1Var.S1.disallow_unique_stargifts;
                } else {
                    l1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = l1Var.S1;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z10 = l1Var.S1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
