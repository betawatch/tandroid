package th;

import java.util.HashMap;
import org.telegram.messenger.q20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ j4(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                x4 x4Var = (x4) obj;
                e5 e5Var = this.b;
                HashMap hashMap = e5Var.H;
                int i10 = x4Var.e;
                int i11 = x4Var.f;
                long j10 = x4Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = e5Var.G[i10];
                    if (hashMap3 != null) {
                        hashMap3.remove(Long.valueOf(j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                e5 e5Var2 = this.b;
                e5Var2.n = false;
                if (tL_stories_allStories == null) {
                    e5Var2.q();
                    e5Var2.W();
                    break;
                } else {
                    e5Var2.b0(tL_stories_allStories, false, true, false);
                    e5Var2.T(false);
                    e5Var2.T(true);
                    break;
                }
        }
    }
}
