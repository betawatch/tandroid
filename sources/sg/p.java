package sg;

import org.telegram.messenger.cd;
import org.telegram.ui.un;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ p(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                s sVar = this.b;
                sVar.e = sVar.b();
                int i10 = sVar.f;
                int i11 = sVar.h;
                un unVar = sVar.a;
                if (sVar.b == null) {
                    q qVar = new q((unVar.getUserConfig().e() > unVar.a() ? 1 : (unVar.getUserConfig().e() == unVar.a() ? 0 : -1)) == 0 ? 3 : 0, unVar.getCurrentAccount(), sVar.getContext(), sVar.a, unVar.getResourceProvider());
                    qVar.m1 = 1.0f;
                    qVar.setWillNotDraw(false);
                    sVar.b = qVar;
                    int L = org.telegram.messenger.i0.L(4.0f) + (cd.X ? 0 : i11);
                    int L2 = org.telegram.messenger.i0.L(4.0f);
                    int L3 = org.telegram.messenger.i0.L(4.0f);
                    if (!cd.X) {
                        i11 = 0;
                    }
                    qVar.setPadding(L, L2, L3 + i11, org.telegram.messenger.i0.L(i10));
                    sVar.b.setDelegate(new n2.u(sVar, 25));
                    sVar.b.setClipChildren(false);
                    sVar.b.setClipToPadding(false);
                    sVar.addView(sVar.b, b6.e(-2, i10 + 70, 5));
                }
                sVar.c(false);
                if (!sVar.b.isEnabled()) {
                    sVar.y = false;
                    sVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    sVar.y = true;
                    sVar.b.p(sVar.e, unVar.p8, true);
                    sVar.b.r(false);
                    break;
                }
        }
    }
}
