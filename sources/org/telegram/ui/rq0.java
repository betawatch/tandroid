package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rq0 extends vu0 {
    public final /* synthetic */ cr0 a;

    public rq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        cr0 cr0Var = this.a;
        org.telegram.ui.Cells.s5 V = cr0.V(cr0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.u9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.b = iArr[0];
        fv0Var.c = iArr[1];
        fv0Var.d = cr0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        fv0Var.a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        fv0Var.k = V.getScale();
        V.g(false);
        return fv0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void G() {
        cr0 cr0Var = this.a;
        int childCount = cr0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cr0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int Q(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        cr0 cr0Var = this.a;
        if (!cr0Var.b.containsKey(valueOf)) {
            return -1;
        }
        cr0Var.b.remove(valueOf);
        int indexOf = cr0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            cr0Var.c.remove(indexOf);
        }
        if (cr0Var.e) {
            cr0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void W(int i10) {
        cr0 cr0Var = this.a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        org.telegram.ui.Cells.s5 V = cr0.V(cr0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) cr0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.u9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void Z(int i10) {
        cr0 cr0Var = this.a;
        int childCount = cr0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = cr0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = cr0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= cr0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = cr0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        cr0 cr0Var = this.a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = cr0Var.J.photos.get(i10);
            Y = cr0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = cr0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= cr0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f.get(i10);
            Y = cr0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = cr0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = cr0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = cr0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.s5) childAt).b(cr0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        cr0Var.i0(z10 ? 1 : 2);
        cr0Var.s0.a();
        return Y;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        cr0 cr0Var = this.a;
        ArrayList arrayList = cr0Var.f;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (cr0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                cr0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                cr0Var.Y(-1, searchImage);
            }
        }
        cr0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean u() {
        cr0 cr0Var = this.a;
        cr0Var.s0.i(0, true, true);
        cr0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean x(int i10) {
        cr0 cr0Var = this.a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && cr0Var.b.containsKey(Integer.valueOf(cr0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < cr0Var.f.size() && cr0Var.b.containsKey(((MediaController.SearchImage) cr0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean z() {
        return this.a.E;
    }
}
