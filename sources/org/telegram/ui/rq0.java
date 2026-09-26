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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class rq0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ tq0 d;

    public rq0(tq0 tq0Var, Context context) {
        this.d = tq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        tq0 tq0Var = this.d;
        if (tq0Var.J == null) {
            return TextUtils.isEmpty(tq0Var.v) ? c1Var.f == 3 : c1Var.b() < tq0Var.f.size();
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        tq0 tq0Var = this.d;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!tq0Var.f.isEmpty()) {
            return tq0Var.f.size() + (!tq0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(tq0Var.v) || tq0Var.n.isEmpty()) {
            return 0;
        }
        return tq0Var.n.size() + 2;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        tq0 tq0Var = this.d;
        if (tq0Var.Y) {
            return 2;
        }
        if (tq0Var.J != null) {
            return 0;
        }
        return tq0Var.f.isEmpty() ? i10 == tq0Var.n.size() ? 4 : 3 : i10 < tq0Var.f.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        tq0 tq0Var = this.d;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        ArrayList arrayList = tq0Var.n;
        ArrayList arrayList2 = tq0Var.c;
        HashMap hashMap = tq0Var.b;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setItemSize(tq0Var.R);
            org.telegram.ui.Components.w9 imageView = t5Var.getImageView();
            t5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                t5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                t5Var.b(tq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) tq0Var.f.get(i10);
                t5Var.e(searchImage);
                t5Var.getVideoInfoContainer().setVisibility(4);
                t5Var.b(tq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            t5Var.getCheckBox().setVisibility((tq0Var.T != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = tq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            k7Var.setPhotoEntry(photoEntry2);
            k7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            k7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (i10 < arrayList.size()) {
            r8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            r8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        tq0 tq0Var = this.d;
        boolean z10 = tq0Var.r0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.y5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.k7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context, null);
                d3Var.setForceDarkTheme(z10);
                viewGroup3 = d3Var;
            } else {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                r8Var.setLayoutParams(new s4.p0(-1, -2));
                viewGroup2 = r8Var;
                if (z10) {
                    r8Var.a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, tq0Var.v0, false));
                    r8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = r8Var;
                }
            }
            return new org.telegram.ui.Components.gl0(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new qq0(this));
        t5Var.getCheckFrame().setVisibility(tq0Var.T != 0 ? 8 : 0);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.gl0(viewGroup3);
    }
}
