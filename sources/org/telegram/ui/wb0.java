package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wb0 extends org.telegram.ui.ActionBar.r2 {
    public FrameLayout a;
    public org.telegram.ui.Components.nm0 b;
    public s4.c0 c;
    public hu d;
    public org.telegram.ui.Components.qc e;
    public int f;
    public final t3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public wb0() {
        super(null);
        this.h = new t3(this, 9);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int V(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        return i10 == this.f ? 2 : -1;
    }

    public final void W(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (((qb0) arrayList.get(i11)).e == i10) {
                this.b.e1(new i2.r(this, i11, 13), 700, true);
                return;
            }
            i11++;
        }
    }

    public final void X(int i10) {
        int V = V(i10);
        if (V == -1) {
            return;
        }
        this.n[V] = true;
        Z();
        Y();
    }

    public final void Y() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new qb0(1, 0, null, 0, 0));
        arrayList2.add(new qb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
        arrayList2.add(new qb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(qb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(qb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(qb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(qb0.c(R.drawable.msg2_smile_status, LiteMode.FLAGS_ANIMATED_EMOJI, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(qb0.b(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(qb0.b(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(qb0.b(LiteMode.FLAG_ANIMATED_EMOJI_CHAT, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(qb0.c(R.drawable.msg2_ask_question, this.f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(qb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(qb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(qb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(qb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(qb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(qb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.h21.c()) {
                arrayList2.add(qb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(qb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(qb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(qb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(qb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new qb0(2, 0, "", 0, 0));
        arrayList2.add(new qb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new qb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Z() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt != null) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.s;
                    if (R < arrayList.size()) {
                        qb0 qb0Var = (qb0) arrayList.get(R);
                        int i11 = qb0Var.a;
                        if (i11 == 3 || i11 == 4) {
                            vb0 vb0Var = (vb0) childAt;
                            ImageView imageView = vb0Var.e;
                            wb0 wb0Var = vb0Var.y;
                            int i12 = qb0Var.e;
                            if (i11 == 3) {
                                boolean z10 = Integer.bitCount(i12) > 1;
                                vb0Var.v = z10;
                                if (z10) {
                                    vb0Var.c(qb0Var, true);
                                    int V = wb0Var.V(i12);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.wh.q(imageView.animate().rotation((V < 0 || !wb0Var.n[V]) ? 0.0f : 180.0f), org.telegram.ui.Components.ds.h, 240L);
                                }
                                vb0Var.f.c(LiteMode.isEnabled(i12), true);
                            } else {
                                vb0Var.h.a(LiteMode.isEnabled(i12), true);
                            }
                            vb0Var.b(LiteMode.isPowerSaverApplied(), true);
                        } else if (i11 == 1) {
                            ((ub0) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || LiteMode.isPowerSaverApplied()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 9));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var;
        nm0Var.u1();
        org.telegram.ui.Components.nm0 nm0Var2 = this.b;
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.nm0 nm0Var3 = this.b;
        hu huVar = new hu(this, 1);
        this.d = huVar;
        nm0Var3.setAdapter(huVar);
        this.b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.a.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.b.setOnItemClickListener(new st(this, 17));
        this.fragmentView = this.a;
        this.f = AndroidUtilities.isTablet() ? 360864 : LiteMode.FLAGS_CHAT;
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.h);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        org.telegram.ui.Components.t5.u();
        org.telegram.ui.ActionBar.y6.r1(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
