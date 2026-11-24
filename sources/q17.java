// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q17 extends jb8 {
    public final /* synthetic */ u17 a;

    public q17(u17 u17Var) {
        this.a = u17Var;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            u17 u17Var = this.a;
            if (i < u17Var.Q.size()) {
                u17Var.y.r((TLRPC.BotInlineResult) u17Var.Q.get(i), z, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[LOOP:0: B:6:0x001d->B:13:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[SYNTHETIC] */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        if (i >= 0) {
            u17 u17Var = this.a;
            if (i < u17Var.Q.size()) {
                int childCount = u17Var.getListView().getChildCount();
                Object obj = u17Var.Q.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = u17Var.getListView().getChildAt(i2);
                    if (childAt instanceof lx2) {
                        lx2 lx2Var = (lx2) childAt;
                        if (lx2Var.getResult() == obj) {
                            imageReceiver = lx2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                qb8 qb8Var = new qb8();
                                qb8Var.b = iArr[0];
                                qb8Var.c = iArr[1];
                                qb8Var.d = u17Var.getListView();
                                qb8Var.a = imageReceiver;
                                qb8Var.e = imageReceiver.p();
                                qb8Var.h = imageReceiver.z();
                                return qb8Var;
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver == null) {
                    }
                }
            }
        }
        return null;
    }
}
