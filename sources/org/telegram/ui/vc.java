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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vc extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final ArrayList c;
    public final va1 d;
    public final org.telegram.ui.Components.e00 e;
    public boolean f;
    public final tc h;
    public boolean n;
    public Utilities.Callback r;
    public String s;
    public TLRPC.WallPaper v;
    public final HashMap w;
    public final HashMap x;

    public vc(int i9, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.c = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.a = i9;
        this.b = b6Var;
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(getContext(), b6Var);
        this.e = e00Var;
        e00Var.setViewType(14);
        e00Var.setVisibility(0);
        addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        va1 va1Var = new va1(activity, 4, b6Var);
        this.d = va1Var;
        va1Var.setClipToPadding(false);
        va1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        va1Var.setLayoutManager(m0Var);
        va1Var.setAlpha(0.0f);
        tc tcVar = new tc(this, i9, b6Var);
        this.h = tcVar;
        va1Var.setAdapter(tcVar);
        addView(va1Var, g7.e6.c(130.0f, -1));
        va1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i9);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new uc(this, i9), true);
        if (this.n) {
            AndroidUtilities.updateViewVisibilityAnimated(e00Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(e00Var, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList.get(i10);
            if (!TextUtils.equals(this.s, bpVar.a()) && (!TextUtils.isEmpty(str) || !bpVar.a.a)) {
                z11 = false;
            }
            bpVar.d = z11;
            if (z11) {
                i9 = i10;
            }
            i10++;
        }
        va1 va1Var = this.d;
        if (i9 >= 0 && !z10 && (va1Var.getLayoutManager() instanceof f2.m0)) {
            ((f2.m0) va1Var.getLayoutManager()).h1(i9, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i11 = 0; i11 < va1Var.getChildCount(); i11++) {
            View childAt = va1Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.a11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.a11) childAt).g(((org.telegram.ui.Components.bp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new qc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.bp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.bp(org.telegram.ui.ActionBar.b4.a(this.a)));
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
