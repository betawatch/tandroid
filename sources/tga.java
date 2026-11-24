// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tga extends jb8 {
    public final /* synthetic */ uga a;

    public tga(uga ugaVar) {
        this.a = ugaVar;
    }

    @Override // jb8, pb8
    public final boolean L() {
        return true;
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        rc2 rc2Var;
        k47 messageObject;
        wga wgaVar = this.a.c;
        sea seaVar = wgaVar.r;
        if (seaVar != null) {
            int childCount = seaVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = wgaVar.r.getChildAt(i2);
                if (!(childAt instanceof rc2) || k47Var == null || (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) == null || messageObject.e1() != k47Var.e1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.s0;
                    imageReceiver = (arrayList == null || i < 0 || i >= arrayList.size()) ? rc2Var.V1(i) : rc2Var.V1(((Integer) messageObject.s0.get(i)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    qb8 qb8Var = new qb8();
                    qb8Var.b = iArr[0];
                    qb8Var.c = childAt.getPaddingTop() + iArr[1];
                    qb8Var.d = wgaVar.r;
                    qb8Var.m = null;
                    qb8Var.a = imageReceiver;
                    if (z) {
                        qb8Var.e = imageReceiver.p();
                    }
                    qb8Var.h = imageReceiver.z();
                    qb8Var.j = 0;
                    qb8Var.i = 0;
                    return qb8Var;
                }
            }
        }
        return null;
    }
}
