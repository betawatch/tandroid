package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u00 extends cu0 {
    public final /* synthetic */ i10 a;

    public u00(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            ai.u1 u1Var = this.a.b;
            int childCount = u1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = u1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= t7Var.e ? null : t7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.w9 w9Var = i12 >= t7Var.e ? null : t7Var.a[i12].a;
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = k7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = e2Var.getPhotoImage();
                            e2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    mu0 mu0Var = new mu0();
                    mu0Var.b = iArr[0];
                    mu0Var.c = iArr[1];
                    mu0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    mu0Var.n = -iArr[1];
                    mu0Var.a = photoImage;
                    mu0Var.o = false;
                    mu0Var.h = photoImage.getRoundRadius(true);
                    mu0Var.e = mu0Var.a.getBitmapSafe();
                    mu0Var.d.getLocationInWindow(iArr);
                    mu0Var.j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.k7 ? AndroidUtilities.dp(8.0f) : 0) - mu0Var.c;
                        if (dp > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return mu0Var;
                        }
                        int height = mu0Var.c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return mu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean Z() {
        i10 i10Var = this.a;
        if (i10Var.N) {
            return true;
        }
        i10Var.h(i10Var.E, i10Var.F, i10Var.H, i10Var.G, i10Var.y, i10Var.J, i10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final CharSequence c0(int i10) {
        return i10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int y() {
        return this.a.O;
    }
}
