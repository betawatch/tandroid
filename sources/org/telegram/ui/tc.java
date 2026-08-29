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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tc extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final ArrayList c;
    public final wa1 d;
    public final org.telegram.ui.Components.p00 e;
    public boolean f;
    public final rc h;
    public boolean n;
    public Utilities.Callback r;
    public String s;
    public TLRPC.WallPaper v;
    public final HashMap w;
    public final HashMap x;

    public tc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.c = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.a = i10;
        this.b = c6Var;
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(getContext(), c6Var);
        this.e = p00Var;
        p00Var.setViewType(14);
        p00Var.setVisibility(0);
        addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        wa1 wa1Var = new wa1(activity, 3, c6Var);
        this.d = wa1Var;
        wa1Var.setClipToPadding(false);
        wa1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        wa1Var.setLayoutManager(j0Var);
        wa1Var.setAlpha(0.0f);
        rc rcVar = new rc(this, i10, c6Var);
        this.h = rcVar;
        wa1Var.setAdapter(rcVar);
        addView(wa1Var, i7.f6.c(130.0f, -1));
        wa1Var.setOnItemClickListener(new j(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new sc(this, i10), true);
        if (this.n) {
            AndroidUtilities.updateViewVisibilityAnimated(p00Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(p00Var, true, 1.0f, true, false);
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
            org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList.get(i11);
            if (!TextUtils.equals(this.s, fpVar.a()) && (!TextUtils.isEmpty(str) || !fpVar.a.a)) {
                z11 = false;
            }
            fpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        wa1 wa1Var = this.d;
        if (i10 >= 0 && !z10 && (wa1Var.getLayoutManager() instanceof f2.j0)) {
            ((f2.j0) wa1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < wa1Var.getChildCount(); i12++) {
            View childAt = wa1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.l11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.l11) childAt).g(((org.telegram.ui.Components.fp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (f5.d) new pc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.fp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.fp(org.telegram.ui.ActionBar.b4.a(this.a)));
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
