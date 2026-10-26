package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t00 extends gu0 {
    public final /* synthetic */ h10 a;

    public t00(h10 h10Var) {
        this.a = h10Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            bi.r1 r1Var = this.a.b;
            int childCount = r1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = r1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= x7Var.e ? null : x7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.y9 y9Var = i12 >= x7Var.e ? null : x7Var.a[i12].a;
                            ImageReceiver imageReceiver = y9Var.getImageReceiver();
                            y9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    if (o7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y9 imageView = o7Var.getImageView();
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
                    qu0 qu0Var = new qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = iArr[1];
                    qu0Var.d = r1Var;
                    r1Var.getLocationInWindow(iArr);
                    qu0Var.n = -iArr[1];
                    qu0Var.a = photoImage;
                    qu0Var.o = false;
                    qu0Var.h = photoImage.getRoundRadius(true);
                    qu0Var.e = qu0Var.a.getBitmapSafe();
                    qu0Var.d.getLocationInWindow(iArr);
                    qu0Var.j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = r1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.o7 ? AndroidUtilities.dp(8.0f) : 0) - qu0Var.c;
                        if (dp > childAt.getHeight()) {
                            r1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return qu0Var;
                        }
                        int height = qu0Var.c - r1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            r1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return qu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean Z() {
        h10 h10Var = this.a;
        if (h10Var.N) {
            return true;
        }
        h10Var.h(h10Var.E, h10Var.F, h10Var.H, h10Var.G, h10Var.y, h10Var.J, h10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final CharSequence c0(int i10) {
        return h10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int y() {
        return this.a.O;
    }
}
