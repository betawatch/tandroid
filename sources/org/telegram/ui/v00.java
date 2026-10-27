package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v00 extends iu0 {
    public final /* synthetic */ j10 a;

    public v00(j10 j10Var) {
        this.a = j10Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                    su0 su0Var = new su0();
                    su0Var.b = iArr[0];
                    su0Var.c = iArr[1];
                    su0Var.d = r1Var;
                    r1Var.getLocationInWindow(iArr);
                    su0Var.n = -iArr[1];
                    su0Var.a = photoImage;
                    su0Var.o = false;
                    su0Var.h = photoImage.getRoundRadius(true);
                    su0Var.e = su0Var.a.getBitmapSafe();
                    su0Var.d.getLocationInWindow(iArr);
                    su0Var.j = 0;
                    if (PhotoViewer.Q1(messageObject) && (pinnedHeader = r1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.o7 ? AndroidUtilities.dp(8.0f) : 0) - su0Var.c;
                        if (dp > childAt.getHeight()) {
                            r1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return su0Var;
                        }
                        int height = su0Var.c - r1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            r1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return su0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean Z() {
        j10 j10Var = this.a;
        if (j10Var.N) {
            return true;
        }
        j10Var.h(j10Var.E, j10Var.F, j10Var.H, j10Var.G, j10Var.y, j10Var.J, j10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final CharSequence c0(int i10) {
        return j10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final int y() {
        return this.a.O;
    }
}
