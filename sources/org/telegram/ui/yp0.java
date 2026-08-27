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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yp0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ aq0 d;

    public yp0(aq0 aq0Var, Context context) {
        this.d = aq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        aq0 aq0Var = this.d;
        if (aq0Var.F == null) {
            return TextUtils.isEmpty(aq0Var.v) ? o1Var.f == 3 : o1Var.b() < aq0Var.f.size();
        }
        return true;
    }

    @Override // f2.q0
    public final int h() {
        aq0 aq0Var = this.d;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!aq0Var.f.isEmpty()) {
            return aq0Var.f.size() + (!aq0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(aq0Var.v) || aq0Var.n.isEmpty()) {
            return 0;
        }
        return aq0Var.n.size() + 2;
    }

    @Override // f2.q0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.q0
    public final int j(int i10) {
        aq0 aq0Var = this.d;
        if (aq0Var.U) {
            return 2;
        }
        if (aq0Var.F != null) {
            return 0;
        }
        return aq0Var.f.isEmpty() ? i10 == aq0Var.n.size() ? 4 : 3 : i10 < aq0Var.f.size() ? 0 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean L1;
        aq0 aq0Var = this.d;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        ArrayList arrayList = aq0Var.n;
        ArrayList arrayList2 = aq0Var.c;
        HashMap hashMap = aq0Var.b;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.setItemSize(aq0Var.N);
            org.telegram.ui.Components.n9 imageView = q5Var.getImageView();
            q5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                q5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                q5Var.b(aq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) aq0Var.f.get(i10);
                q5Var.e(searchImage);
                q5Var.getVideoInfoContainer().setVisibility(4);
                q5Var.b(aq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            q5Var.getCheckBox().setVisibility((aq0Var.P != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = aq0Var.N;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            f7Var.setPhotoEntry(photoEntry2);
            f7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            f7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        if (i10 < arrayList.size()) {
            l8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            l8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        aq0 aq0Var = this.d;
        boolean z10 = aq0Var.n0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.y0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, h7.z5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.f7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, null);
                a3Var.setForceDarkTheme(z10);
                viewGroup3 = a3Var;
            } else {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, context, true);
                l8Var.setLayoutParams(new f2.y0(-1, -2));
                viewGroup2 = l8Var;
                if (z10) {
                    l8Var.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, aq0Var.r0, false));
                    l8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = l8Var;
                }
            }
            return new org.telegram.ui.Components.lk0(viewGroup3);
        }
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(context, null);
        q5Var.setDelegate(new xp0(this));
        q5Var.getCheckFrame().setVisibility(aq0Var.P != 0 ? 8 : 0);
        viewGroup2 = q5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.lk0(viewGroup3);
    }
}
