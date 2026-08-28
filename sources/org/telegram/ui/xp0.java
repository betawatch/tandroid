package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ zp0 d;

    public xp0(zp0 zp0Var, Context context) {
        this.d = zp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        zp0 zp0Var = this.d;
        if (zp0Var.F == null) {
            return TextUtils.isEmpty(zp0Var.v) ? q1Var.f == 3 : q1Var.b() < zp0Var.f.size();
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!zp0Var.f.isEmpty()) {
            return zp0Var.f.size() + (!zp0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(zp0Var.v) || zp0Var.n.isEmpty()) {
            return 0;
        }
        return zp0Var.n.size() + 2;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        zp0 zp0Var = this.d;
        if (zp0Var.U) {
            return 2;
        }
        if (zp0Var.F != null) {
            return 0;
        }
        return zp0Var.f.isEmpty() ? i9 == zp0Var.n.size() ? 4 : 3 : i9 < zp0Var.f.size() ? 0 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean L1;
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        ArrayList arrayList = zp0Var.n;
        ArrayList arrayList2 = zp0Var.c;
        HashMap hashMap = zp0Var.b;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setItemSize(zp0Var.N);
            org.telegram.ui.Components.o9 imageView = t5Var.getImageView();
            t5Var.setTag(Integer.valueOf(i9));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
                t5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                t5Var.b(zp0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f.get(i9);
                t5Var.e(searchImage);
                t5Var.getVideoInfoContainer().setVisibility(4);
                t5Var.b(zp0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            t5Var.getCheckBox().setVisibility((zp0Var.P != 0 || L1) ? 8 : 0);
            return;
        }
        if (i10 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = zp0Var.N;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i9);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            i7Var.setPhotoEntry(photoEntry2);
            i7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            i7Var.setTag(Integer.valueOf(i9));
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (i9 < arrayList.size()) {
            p8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i9), false);
        } else {
            p8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        zp0 zp0Var = this.d;
        boolean z10 = zp0Var.n0;
        Context context = this.c;
        if (i9 != 0) {
            if (i9 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.a1(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, g7.e6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i9 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
            } else if (i9 != 3) {
                org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                c3Var.setForceDarkTheme(z10);
                viewGroup3 = c3Var;
            } else {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, context, true);
                p8Var.setLayoutParams(new f2.a1(-1, -2));
                viewGroup2 = p8Var;
                if (z10) {
                    p8Var.a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, zp0Var.r0, false));
                    p8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = p8Var;
                }
            }
            return new org.telegram.ui.Components.ik0(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new wp0(this));
        t5Var.getCheckFrame().setVisibility(zp0Var.P != 0 ? 8 : 0);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.ik0(viewGroup3);
    }
}
