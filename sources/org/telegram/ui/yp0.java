package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yp0 extends zt0 {
    public final /* synthetic */ jq0 a;

    public yp0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.a;
        org.telegram.ui.Cells.s5 V = jq0.V(jq0Var, i10);
        if (V == null) {
            return null;
        }
        org.telegram.ui.Components.w9 imageView = V.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = jq0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.k = V.getScale();
        V.g(false);
        return ju0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void G() {
        jq0 jq0Var = this.a;
        int childCount = jq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int R(Object obj) {
        Object valueOf = obj instanceof MediaController.PhotoEntry ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        jq0 jq0Var = this.a;
        if (!jq0Var.b.containsKey(valueOf)) {
            return -1;
        }
        jq0Var.b.remove(valueOf);
        int indexOf = jq0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            jq0Var.c.remove(indexOf);
        }
        if (jq0Var.e) {
            jq0Var.h0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void X(int i10) {
        jq0 jq0Var = this.a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        org.telegram.ui.Cells.s5 V = jq0.V(jq0Var, i10);
        if (V != null) {
            if (albumEntry == null) {
                V.e((MediaController.SearchImage) jq0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void a0(int i10) {
        jq0 jq0Var = this.a;
        int childCount = jq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = jq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= jq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = jq0.V(this.a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        jq0 jq0Var = this.a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = jq0Var.J.photos.get(i10);
            Y = jq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = jq0Var.c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= jq0Var.f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) jq0Var.f.get(i10);
            Y = jq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = jq0Var.c.indexOf(searchImage.id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = jq0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = jq0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.s5) childAt).b(jq0Var.e ? Y : -1, z10, false);
            } else {
                i11++;
            }
        }
        jq0Var.i0(z10 ? 1 : 2);
        jq0Var.s0.a();
        return Y;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        jq0 jq0Var = this.a;
        ArrayList arrayList = jq0Var.f;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (jq0Var.b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                jq0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                jq0Var.Y(-1, searchImage);
            }
        }
        jq0Var.e0(i11, z10);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean u() {
        jq0 jq0Var = this.a;
        jq0Var.s0.h(0, true, true);
        jq0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        jq0 jq0Var = this.a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        return albumEntry != null ? i10 >= 0 && i10 < albumEntry.photos.size() && jq0Var.b.containsKey(Integer.valueOf(jq0Var.J.photos.get(i10).imageId)) : i10 >= 0 && i10 < jq0Var.f.size() && jq0Var.b.containsKey(((MediaController.SearchImage) jq0Var.f.get(i10)).id);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean z() {
        return this.a.E;
    }
}
