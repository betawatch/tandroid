package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s00 extends rt0 {
    public final /* synthetic */ f10 a;

    public s00(f10 f10Var) {
        this.a = f10Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final CharSequence C(int i9) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i9)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            gh.f1 f1Var = this.a.b;
            int childCount = f1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = f1Var.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        MessageObject messageObject2 = i11 >= s7Var.e ? null : s7Var.b[i11];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.o9 o9Var = i11 >= s7Var.e ? null : s7Var.a[i11].a;
                            ImageReceiver imageReceiver = o9Var.getImageReceiver();
                            o9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.o9 imageView = i7Var.getImageView();
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
                    bu0 bu0Var = new bu0();
                    bu0Var.b = iArr[0];
                    bu0Var.c = iArr[1];
                    bu0Var.d = f1Var;
                    f1Var.getLocationInWindow(iArr);
                    bu0Var.n = -iArr[1];
                    bu0Var.a = photoImage;
                    bu0Var.o = false;
                    bu0Var.h = photoImage.getRoundRadius(true);
                    bu0Var.e = bu0Var.a.getBitmapSafe();
                    bu0Var.d.getLocationInWindow(iArr);
                    bu0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = f1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.i7 ? AndroidUtilities.dp(8.0f) : 0) - bu0Var.c;
                        if (dp > childAt.getHeight()) {
                            f1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return bu0Var;
                        }
                        int height = bu0Var.c - f1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            f1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return bu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean Y() {
        f10 f10Var = this.a;
        if (f10Var.J) {
            return true;
        }
        f10Var.h(f10Var.A, f10Var.B, f10Var.D, f10Var.C, f10Var.y, f10Var.F, f10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final CharSequence b0(int i9) {
        return f10.d((MessageObject) this.a.f.get(i9), true, 0, null);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int y() {
        return this.a.K;
    }
}
