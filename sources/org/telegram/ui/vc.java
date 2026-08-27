package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vc extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final ArrayList c;
    public final ta1 d;
    public final org.telegram.ui.Components.h00 e;
    public boolean f;
    public final tc h;
    public boolean n;
    public Utilities.Callback r;
    public String s;
    public TLRPC.WallPaper v;
    public final HashMap w;
    public final HashMap x;

    public vc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.c = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.a = i10;
        this.b = c6Var;
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(getContext(), c6Var);
        this.e = h00Var;
        h00Var.setViewType(14);
        h00Var.setVisibility(0);
        addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        ta1 ta1Var = new ta1(activity, 3, c6Var);
        this.d = ta1Var;
        ta1Var.setClipToPadding(false);
        ta1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        ta1Var.setLayoutManager(k0Var);
        ta1Var.setAlpha(0.0f);
        tc tcVar = new tc(this, i10, c6Var);
        this.h = tcVar;
        ta1Var.setAdapter(tcVar);
        addView(ta1Var, h7.z5.c(130.0f, -1));
        ta1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new uc(this, i10), true);
        if (this.n) {
            AndroidUtilities.updateViewVisibilityAnimated(h00Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(h00Var, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.zo zoVar = (org.telegram.ui.Components.zo) arrayList.get(i11);
            if (!TextUtils.equals(this.s, zoVar.a()) && (!TextUtils.isEmpty(str) || !zoVar.a.a)) {
                z11 = false;
            }
            zoVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ta1 ta1Var = this.d;
        if (i10 >= 0 && !z10 && (ta1Var.getLayoutManager() instanceof f2.k0)) {
            ((f2.k0) ta1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ta1Var.getChildCount(); i12++) {
            View childAt = ta1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.b11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.b11) childAt).g(((org.telegram.ui.Components.zo) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new rc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.zo) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.zo(org.telegram.ui.ActionBar.b4.a(this.a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }
}
