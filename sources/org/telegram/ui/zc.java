package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final ArrayList c;
    public final bb1 d;
    public final org.telegram.ui.Components.c10 e;
    public boolean f;
    public final xc h;
    public boolean n;
    public Utilities.Callback r;
    public String s;
    public TLRPC.WallPaper v;
    public final HashMap w;
    public final HashMap x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.c = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.a = i10;
        this.b = u6Var;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getContext(), u6Var);
        this.e = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        bb1 bb1Var = new bb1(activity, 4, u6Var);
        this.d = bb1Var;
        bb1Var.setClipToPadding(false);
        bb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        bb1Var.setLayoutManager(c0Var);
        bb1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, u6Var);
        this.h = xcVar;
        bb1Var.setAdapter(xcVar);
        addView(bb1Var, org.telegram.ui.Components.kb1.g(130.0f, -1));
        bb1Var.setOnItemClickListener(new h(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (this.n) {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, true, 1.0f, true, false);
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
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i11);
            if (!TextUtils.equals(this.s, ypVar.a()) && (!TextUtils.isEmpty(str) || !ypVar.a.a)) {
                z11 = false;
            }
            ypVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        bb1 bb1Var = this.d;
        if (i10 >= 0 && !z10 && (bb1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) bb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < bb1Var.getChildCount(); i12++) {
            View childAt = bb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.e31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.e31) childAt).g(((org.telegram.ui.Components.yp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.yp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.yp(org.telegram.ui.ActionBar.h4.a(this.a)));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        xc xcVar;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        ?? a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i10);
            if (ypVar.c != a2) {
                ypVar.c = a2;
                z10 = true;
            }
            i10++;
        }
        bb1 bb1Var = this.d;
        if (bb1Var == null) {
            return;
        }
        AndroidUtilities.forEachViews((RecyclerView) bb1Var, (Utilities.Callback<View>) new vc(this, 0));
        if (!z10 || (xcVar = this.h) == null) {
            return;
        }
        xcVar.l();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
