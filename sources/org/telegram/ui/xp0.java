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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ zp0 d;

    public xp0(zp0 zp0Var, Context context) {
        this.d = zp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        zp0 zp0Var = this.d;
        if (zp0Var.F == null) {
            return TextUtils.isEmpty(zp0Var.v) ? n1Var.f == 3 : n1Var.b() < zp0Var.f.size();
        }
        return true;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        zp0 zp0Var = this.d;
        if (zp0Var.U) {
            return 2;
        }
        if (zp0Var.F != null) {
            return 0;
        }
        return zp0Var.f.isEmpty() ? i10 == zp0Var.n.size() ? 4 : 3 : i10 < zp0Var.f.size() ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean L1;
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        ArrayList arrayList = zp0Var.n;
        ArrayList arrayList2 = zp0Var.c;
        HashMap hashMap = zp0Var.b;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.setItemSize(zp0Var.N);
            org.telegram.ui.Components.t9 imageView = r5Var.getImageView();
            r5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                r5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                r5Var.b(zp0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f.get(i10);
                r5Var.e(searchImage);
                r5Var.getVideoInfoContainer().setVisibility(4);
                r5Var.b(zp0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            r5Var.getCheckBox().setVisibility((zp0Var.P != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = zp0Var.N;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            g7Var.setPhotoEntry(photoEntry2);
            g7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            g7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 < arrayList.size()) {
            m8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            m8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        zp0 zp0Var = this.d;
        boolean z10 = zp0Var.n0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, i7.f6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.g7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, null);
                a3Var.setForceDarkTheme(z10);
                viewGroup3 = a3Var;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, context, true);
                m8Var.setLayoutParams(new f2.x0(-1, -2));
                viewGroup2 = m8Var;
                if (z10) {
                    m8Var.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, zp0Var.r0, false));
                    m8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = m8Var;
                }
            }
            return new org.telegram.ui.Components.vk0(viewGroup3);
        }
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(context, null);
        r5Var.setDelegate(new wp0(this));
        r5Var.getCheckFrame().setVisibility(zp0Var.P != 0 ? 8 : 0);
        viewGroup2 = r5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.vk0(viewGroup3);
    }
}
