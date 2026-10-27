package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rq0 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ tq0 d;

    public rq0(tq0 tq0Var, Context context) {
        this.d = tq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        tq0 tq0Var = this.d;
        if (tq0Var.J == null) {
            return TextUtils.isEmpty(tq0Var.v) ? e1Var.f == 3 : e1Var.b() < tq0Var.f.size();
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean P1;
        tq0 tq0Var = this.d;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        ArrayList arrayList = tq0Var.n;
        ArrayList arrayList2 = tq0Var.c;
        HashMap hashMap = tq0Var.b;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.setItemSize(tq0Var.R);
            org.telegram.ui.Components.y9 imageView = x5Var.getImageView();
            x5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                x5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                x5Var.b(tq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                P1 = PhotoViewer.P1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) tq0Var.f.get(i10);
                x5Var.e(searchImage);
                x5Var.getVideoInfoContainer().setVisibility(4);
                x5Var.b(tq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                P1 = PhotoViewer.P1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!P1, true);
            x5Var.getCheckBox().setVisibility((tq0Var.T != 0 || P1) ? 8 : 0);
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
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            o7Var.setPhotoEntry(photoEntry2);
            o7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            o7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
        if (i10 < arrayList.size()) {
            v8Var.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            v8Var.o(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        tq0 tq0Var = this.d;
        boolean z10 = tq0Var.r0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.q0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.o7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, null);
                a3Var.setForceDarkTheme(z10);
                viewGroup3 = a3Var;
            } else {
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, context, true);
                v8Var.setLayoutParams(new s4.q0(-1, -2));
                viewGroup2 = v8Var;
                if (z10) {
                    org.telegram.ui.ActionBar.f7.Y(v8Var.a, tq0Var.v0, null);
                    org.telegram.ui.ActionBar.f7.t(v8Var.e, org.telegram.ui.ActionBar.y6.rg, null, PorterDuff.Mode.MULTIPLY);
                    viewGroup2 = v8Var;
                }
            }
            return new org.telegram.ui.Components.wl0(viewGroup3);
        }
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context, null);
        x5Var.setDelegate(new qq0(this));
        x5Var.getCheckFrame().setVisibility(tq0Var.T != 0 ? 8 : 0);
        viewGroup2 = x5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.wl0(viewGroup3);
    }
}
