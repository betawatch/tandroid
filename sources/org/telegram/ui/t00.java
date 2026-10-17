package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class t00 extends bu0 {
    public final /* synthetic */ g10 a;

    public t00(g10 g10Var) {
        this.a = g10Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = i7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = f2Var.getPhotoImage();
                            f2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    lu0 lu0Var = new lu0();
                    lu0Var.b = iArr[0];
                    lu0Var.c = iArr[1];
                    lu0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    lu0Var.n = -iArr[1];
                    lu0Var.a = photoImage;
                    lu0Var.o = false;
                    lu0Var.h = photoImage.getRoundRadius(true);
                    lu0Var.e = lu0Var.a.getBitmapSafe();
                    lu0Var.d.getLocationInWindow(iArr);
                    lu0Var.j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.i7 ? AndroidUtilities.dp(8.0f) : 0) - lu0Var.c;
                        if (dp > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return lu0Var;
                        }
                        int height = lu0Var.c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return lu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean Z() {
        g10 g10Var = this.a;
        if (g10Var.N) {
            return true;
        }
        g10Var.h(g10Var.E, g10Var.F, g10Var.H, g10Var.G, g10Var.y, g10Var.J, g10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final CharSequence c0(int i10) {
        return g10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int y() {
        return this.a.O;
    }
}
