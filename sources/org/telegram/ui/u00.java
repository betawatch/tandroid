package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u00 extends pt0 {
    public final /* synthetic */ h10 a;

    public u00(h10 h10Var) {
        this.a = h10Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            jh.e1 e1Var = this.a.b;
            int childCount = e1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = e1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= q7Var.e ? null : q7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.t9 t9Var = i12 >= q7Var.e ? null : q7Var.a[i12].a;
                            ImageReceiver imageReceiver = t9Var.getImageReceiver();
                            t9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.t9 imageView = g7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = d2Var.getPhotoImage();
                            d2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    zt0 zt0Var = new zt0();
                    zt0Var.b = iArr[0];
                    zt0Var.c = iArr[1];
                    zt0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    zt0Var.n = -iArr[1];
                    zt0Var.a = photoImage;
                    zt0Var.o = false;
                    zt0Var.h = photoImage.getRoundRadius(true);
                    zt0Var.e = zt0Var.a.getBitmapSafe();
                    zt0Var.d.getLocationInWindow(iArr);
                    zt0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.g7 ? AndroidUtilities.dp(8.0f) : 0) - zt0Var.c;
                        if (dp > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return zt0Var;
                        }
                        int height = zt0Var.c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return zt0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean Y() {
        h10 h10Var = this.a;
        if (h10Var.J) {
            return true;
        }
        h10Var.h(h10Var.A, h10Var.B, h10Var.D, h10Var.C, h10Var.y, h10Var.F, h10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final CharSequence b0(int i10) {
        return h10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final int y() {
        return this.a.K;
    }
}
