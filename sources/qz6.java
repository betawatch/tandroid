// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qz6 extends i98 {
    public final /* synthetic */ uz6 a;

    public qz6(uz6 uz6Var) {
        this.a = uz6Var;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            uz6 uz6Var = this.a;
            if (i < uz6Var.Q.size()) {
                uz6Var.y.c((TLRPC.BotInlineResult) uz6Var.Q.get(i), z, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[LOOP:0: B:6:0x001d->B:13:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[SYNTHETIC] */
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        if (i >= 0) {
            uz6 uz6Var = this.a;
            if (i < uz6Var.Q.size()) {
                int childCount = uz6Var.getListView().getChildCount();
                Object obj = uz6Var.Q.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = uz6Var.getListView().getChildAt(i2);
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
                                p98Var.d = uz6Var.getListView();
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
