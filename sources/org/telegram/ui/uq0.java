package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uq0 extends zu0 {
    public final /* synthetic */ fr0 a;

    public uq0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fr0 fr0Var = this.a;
        org.telegram.ui.Cells.t5 V = fr0.V(fr0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.z9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = fr0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        jv0Var.a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.k = V.getScale();
        V.g(false);
        return jv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void G() {
        fr0 fr0Var = this.a;
        int childCount = fr0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fr0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int R(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        fr0 fr0Var = this.a;
        if (!fr0Var.b.containsKey(valueOf)) {
            return -1;
        }
        fr0Var.b.remove(valueOf);
        int indexOf = fr0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            fr0Var.c.remove(indexOf);
        }
        if (fr0Var.e) {
            fr0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void X(int i10) {
        fr0 fr0Var = this.a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        org.telegram.ui.Cells.t5 V = fr0.V(fr0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) fr0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.z9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void a0(int i10) {
        fr0 fr0Var = this.a;
        int childCount = fr0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fr0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = fr0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= fr0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = fr0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        fr0 fr0Var = this.a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = fr0Var.J.photos.get(i10);
            Y = fr0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = fr0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= fr0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fr0Var.f.get(i10);
            Y = fr0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = fr0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = fr0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = fr0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.t5) childAt).b(fr0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        fr0Var.i0(z10 ? 1 : 2);
        fr0Var.s0.a();
        return Y;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fr0 fr0Var = this.a;
        ArrayList arrayList = fr0Var.f;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        if (fr0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                fr0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                fr0Var.Y(-1, searchImage);
            }
        }
        fr0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean u() {
        fr0 fr0Var = this.a;
        fr0Var.s0.h(0, true, true);
        fr0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean x(int i10) {
        fr0 fr0Var = this.a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && fr0Var.b.containsKey(Integer.valueOf(fr0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < fr0Var.f.size() && fr0Var.b.containsKey(((MediaController.SearchImage) fr0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean z() {
        return this.a.E;
    }
}
