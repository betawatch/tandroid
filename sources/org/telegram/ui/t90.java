package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t90 extends org.telegram.ui.ActionBar.d2 {
    public FrameLayout a;
    public org.telegram.ui.Components.tj0 b;
    public u4.b0 c;
    public org.telegram.ui.Components.bi0 d;
    public org.telegram.ui.Components.ac e;
    public int f;
    public final s3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public t90() {
        super(null);
        this.h = new s3(this, 10);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Z(int i3) {
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 28700) {
            return 1;
        }
        return i3 == this.f ? 2 : -1;
    }

    public final void a0(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((o90) arrayList.get(i10)).e == i3) {
                this.b.e1(new k2.q(this, i10, 13), 700, true);
                return;
            }
            i10++;
        }
    }

    public final void b0(int i3) {
        int Z = Z(i3);
        if (Z == -1) {
            return;
        }
        this.n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i3 = Build.VERSION.SDK_INT;
        arrayList2.add(new o90(1, 0, null, 0, 0));
        arrayList2.add(new o90(2, 0, org.telegram.messenger.lc.c() <= 0 ? org.telegram.messenger.bd.M0(2131748879, null) : org.telegram.messenger.lc.c() >= 100 ? org.telegram.messenger.bd.M0(2131748878, null) : org.telegram.messenger.bd.a0(null, null, 2131748880, String.format("%d%%", Integer.valueOf(org.telegram.messenger.lc.c()))), 0, 0));
        arrayList2.add(new o90(0, 0, org.telegram.messenger.bd.M0(2131748856, null), 0, 0));
        arrayList2.add(o90.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.bd.M0(2131748858, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(o90.b(1, org.telegram.messenger.bd.M0(2131748870, null)));
            arrayList2.add(o90.b(2, org.telegram.messenger.bd.M0(2131748872, null)));
        }
        arrayList2.add(o90.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.bd.M0(2131748863, null)));
        if (zArr[1]) {
            arrayList2.add(o90.b(16388, org.telegram.messenger.bd.M0(2131748870, null)));
            arrayList2.add(o90.b(8200, org.telegram.messenger.bd.M0(2131748869, null)));
            arrayList2.add(o90.b(4112, org.telegram.messenger.bd.M0(2131748872, null)));
        }
        arrayList2.add(o90.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.bd.M0(2131748864, null)));
        if (zArr[2]) {
            arrayList2.add(o90.b(32, org.telegram.messenger.bd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(o90.b(64, org.telegram.messenger.bd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(o90.b(128, org.telegram.messenger.bd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.az.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.a;
            } else {
                arrayList2.add(o90.b(256, org.telegram.messenger.bd.N0("LiteOptionsBlur2")));
            }
            if (i3 >= 33) {
                if (org.telegram.messenger.az.o() < 1) {
                    boolean z11 = org.telegram.messenger.r2.a;
                } else {
                    arrayList2.add(o90.b(262144, org.telegram.messenger.bd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(o90.b(32768, org.telegram.messenger.bd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.cz0.c()) {
                arrayList2.add(o90.b(65536, org.telegram.messenger.bd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(o90.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.bd.M0(2131748865, null)));
        arrayList2.add(o90.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.bd.M0(2131748868, null)));
        arrayList2.add(o90.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.bd.M0(2131748871, null)));
        arrayList2.add(o90.c(R.drawable.photo_star, 131072, org.telegram.messenger.bd.M0(2131748861, null)));
        arrayList2.add(new o90(2, 0, "", 0, 0));
        arrayList2.add(new o90(5, 0, org.telegram.messenger.bd.M0(2131748854, null), 0, 1));
        arrayList2.add(new o90(2, 0, org.telegram.messenger.bd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747074, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 13));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
        u4.b0 b0Var = new u4.b0();
        this.c = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.tj0 tj0Var3 = this.b;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(this, 2);
        this.d = bi0Var;
        tj0Var3.setAdapter(bi0Var);
        this.b.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.a.addView(this.b, b8.mf.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ur(this, 18));
        this.fragmentView = this.a;
        this.f = org.telegram.messenger.g0.Q1() ? 360864 : 360928;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
            View childAt = this.b.getChildAt(i3);
            if (childAt != null) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.s;
                    if (R < arrayList.size()) {
                        o90 o90Var = (o90) arrayList.get(R);
                        int i10 = o90Var.a;
                        if (i10 == 3 || i10 == 4) {
                            s90 s90Var = (s90) childAt;
                            ImageView imageView = s90Var.e;
                            t90 t90Var = s90Var.E;
                            int i11 = o90Var.e;
                            if (i10 == 3) {
                                boolean z10 = Integer.bitCount(i11) > 1;
                                s90Var.w = z10;
                                if (z10) {
                                    s90Var.c(o90Var, true);
                                    int Z = t90Var.Z(i11);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.camera.q.l(imageView.animate().rotation((Z < 0 || !t90Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.xq.h, 240L);
                                }
                                s90Var.f.c(org.telegram.messenger.lc.e(i11), true);
                            } else {
                                s90Var.h.a(org.telegram.messenger.lc.e(i11), true);
                            }
                            s90Var.b(org.telegram.messenger.lc.f(), true);
                        } else if (i10 == 1) {
                            ((r90) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.lc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.lc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.lc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.lc.k();
        org.telegram.ui.Components.g5.t();
        org.telegram.ui.ActionBar.k6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
