// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yo1 extends i98 {
    public final /* synthetic */ mu1 a;

    public yo1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            mu1 mu1Var = this.a;
            if (i < mu1Var.fb.size()) {
                mu1Var.mb((TLRPC.BotInlineResult) mu1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[LOOP:0: B:10:0x0029->B:17:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC] */
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        sq1 sq1Var;
        ImageReceiver imageReceiver;
        if (i >= 0) {
            mu1 mu1Var = this.a;
            if (i < mu1Var.fb.size() && (sq1Var = mu1Var.X1) != null && sq1Var.getListView() != null) {
                int childCount = mu1Var.X1.getListView().getChildCount();
                Object obj = mu1Var.fb.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = mu1Var.X1.getListView().getChildAt(i2);
                    if (childAt instanceof bw2) {
                        bw2 bw2Var = (bw2) childAt;
                        if (bw2Var.getResult() == obj) {
                            imageReceiver = bw2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                p98 p98Var = new p98();
                                p98Var.b = iArr[0];
                                p98Var.c = iArr[1];
                                p98Var.d = mu1Var.X1.getListView();
                                p98Var.a = imageReceiver;
                                p98Var.e = imageReceiver.p();
                                p98Var.h = imageReceiver.z();
                                return p98Var;
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
