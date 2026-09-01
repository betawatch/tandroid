package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xp0 extends au0 {
    public final /* synthetic */ hq0 a;

    public xp0(hq0 hq0Var) {
        this.a = hq0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        hq0 hq0Var = this.a;
        org.telegram.ui.Cells.t5 V = hq0.V(hq0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = hq0Var.H;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        lu0Var.k = V.getScale();
        V.g(false);
        return lu0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void G() {
        hq0 hq0Var = this.a;
        int childCount = hq0Var.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hq0Var.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int Q(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        hq0 hq0Var = this.a;
        if (!hq0Var.b.containsKey(valueOf)) {
            return -1;
        }
        hq0Var.b.remove(valueOf);
        int indexOf = hq0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            hq0Var.c.remove(indexOf);
        }
        if (hq0Var.e) {
            hq0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void W(int i10) {
        hq0 hq0Var = this.a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        org.telegram.ui.Cells.t5 V = hq0.V(hq0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) hq0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.p9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void Z(int i10) {
        hq0 hq0Var = this.a;
        int childCount = hq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = hq0Var.H.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = hq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= hq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = hq0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z4;
        hq0 hq0Var = this.a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = hq0Var.G.photos.get(i10);
            Y = hq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = hq0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z4 = true;
            } else {
                photoEntry.editedInfo = null;
                z4 = false;
            }
        } else {
            if (i10 < 0 || i10 >= hq0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hq0Var.f.get(i10);
            Y = hq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = hq0Var.c.indexOf(searchImage.id);
                z4 = true;
            } else {
                searchImage.editedInfo = null;
                z4 = false;
            }
        }
        int childCount = hq0Var.H.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = hq0Var.H.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.t5) childAt).b(hq0Var.e ? Y : -1, z4, false);
            } else {
                i11++;
            }
        }
        hq0Var.i0(z4 ? 1 : 2);
        hq0Var.p0.a();
        return Y;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        hq0 hq0Var = this.a;
        ArrayList arrayList = hq0Var.f;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        if (hq0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                hq0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                hq0Var.Y(-1, searchImage);
            }
        }
        hq0Var.e0(i11, z4);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean u() {
        hq0 hq0Var = this.a;
        hq0Var.p0.f(0, true, true);
        hq0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean x(int i10) {
        hq0 hq0Var = this.a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && hq0Var.b.containsKey(Integer.valueOf(hq0Var.G.photos.get(i10).imageId)) : i10 >= 0 && i10 < hq0Var.f.size() && hq0Var.b.containsKey(((MediaController.SearchImage) hq0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean z() {
        return this.a.B;
    }
}
