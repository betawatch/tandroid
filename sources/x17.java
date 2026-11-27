// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x17 extends yc8 {
    public final /* synthetic */ b27 a;

    public x17(b27 b27Var) {
        this.a = b27Var;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            b27 b27Var = this.a;
            if (i < b27Var.Q.size()) {
                b27Var.y.s((TLRPC.BotInlineResult) b27Var.Q.get(i), z, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[LOOP:0: B:6:0x001d->B:13:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[SYNTHETIC] */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        if (i >= 0) {
            b27 b27Var = this.a;
            if (i < b27Var.Q.size()) {
                int childCount = b27Var.getListView().getChildCount();
                Object obj = b27Var.Q.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = b27Var.getListView().getChildAt(i2);
                    if (childAt instanceof vw2) {
                        vw2 vw2Var = (vw2) childAt;
                        if (vw2Var.getResult() == obj) {
                            imageReceiver = vw2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                fd8 fd8Var = new fd8();
                                fd8Var.b = iArr[0];
                                fd8Var.c = iArr[1];
                                fd8Var.d = b27Var.getListView();
                                fd8Var.a = imageReceiver;
                                fd8Var.e = imageReceiver.p();
                                fd8Var.h = imageReceiver.z();
                                return fd8Var;
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
