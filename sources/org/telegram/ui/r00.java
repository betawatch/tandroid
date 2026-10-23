package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class r00 extends zt0 {
    public final /* synthetic */ e10 a;

    public r00(e10 e10Var) {
        this.a = e10Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                    ju0 ju0Var = new ju0();
                    ju0Var.b = iArr[0];
                    ju0Var.c = iArr[1];
                    ju0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    ju0Var.n = -iArr[1];
                    ju0Var.a = photoImage;
                    ju0Var.o = false;
                    ju0Var.h = photoImage.getRoundRadius(true);
                    ju0Var.e = ju0Var.a.getBitmapSafe();
                    ju0Var.d.getLocationInWindow(iArr);
                    ju0Var.j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.i7 ? AndroidUtilities.dp(8.0f) : 0) - ju0Var.c;
                        if (dp > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return ju0Var;
                        }
                        int height = ju0Var.c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean Z() {
        e10 e10Var = this.a;
        if (e10Var.N) {
            return true;
        }
        e10Var.h(e10Var.E, e10Var.F, e10Var.H, e10Var.G, e10Var.y, e10Var.J, e10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final CharSequence c0(int i10) {
        return e10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int y() {
        return this.a.O;
    }
}
