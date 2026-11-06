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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w90 extends org.telegram.ui.ActionBar.f2 {
    public FrameLayout a;
    public org.telegram.ui.Components.pj0 b;
    public v4.b0 c;
    public org.telegram.ui.Components.yh0 d;
    public org.telegram.ui.Components.cc e;
    public int f;
    public final r3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public w90() {
        super(null);
        this.h = new r3(this, 10);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        return i7 == this.f ? 2 : -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((r90) arrayList.get(i10)).e == i7) {
                this.b.e1(new l2.q(this, i10, 12), 700, true);
                return;
            }
            i10++;
        }
    }

    public final void b0(int i7) {
        int Z = Z(i7);
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
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new r90(1, 0, null, 0, 0));
        arrayList2.add(new r90(2, 0, org.telegram.messenger.rc.c() <= 0 ? org.telegram.messenger.hd.M0(2131748870, null) : org.telegram.messenger.rc.c() >= 100 ? org.telegram.messenger.hd.M0(2131748869, null) : org.telegram.messenger.hd.a0(null, null, 2131748871, String.format("%d%%", Integer.valueOf(org.telegram.messenger.rc.c()))), 0, 0));
        arrayList2.add(new r90(0, 0, org.telegram.messenger.hd.M0(2131748847, null), 0, 0));
        arrayList2.add(r90.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.hd.M0(2131748849, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(r90.b(1, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(r90.b(2, org.telegram.messenger.hd.M0(2131748863, null)));
        }
        arrayList2.add(r90.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.hd.M0(2131748854, null)));
        if (zArr[1]) {
            arrayList2.add(r90.b(16388, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(r90.b(8200, org.telegram.messenger.hd.M0(2131748860, null)));
            arrayList2.add(r90.b(4112, org.telegram.messenger.hd.M0(2131748863, null)));
        }
        arrayList2.add(r90.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.hd.M0(2131748855, null)));
        if (zArr[2]) {
            arrayList2.add(r90.b(32, org.telegram.messenger.hd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(r90.b(64, org.telegram.messenger.hd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(r90.b(128, org.telegram.messenger.hd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.iz.o() < 1) {
                boolean z9 = org.telegram.messenger.r2.a;
            } else {
                arrayList2.add(r90.b(256, org.telegram.messenger.hd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.iz.o() < 1) {
                    boolean z10 = org.telegram.messenger.r2.a;
                } else {
                    arrayList2.add(r90.b(262144, org.telegram.messenger.hd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(r90.b(32768, org.telegram.messenger.hd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.cz0.c()) {
                arrayList2.add(r90.b(65536, org.telegram.messenger.hd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(r90.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.hd.M0(2131748856, null)));
        arrayList2.add(r90.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.hd.M0(2131748859, null)));
        arrayList2.add(r90.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.hd.M0(2131748862, null)));
        arrayList2.add(r90.c(R.drawable.photo_star, 131072, org.telegram.messenger.hd.M0(2131748852, null)));
        arrayList2.add(new r90(2, 0, "", 0, 0));
        arrayList2.add(new r90(5, 0, org.telegram.messenger.hd.M0(2131748845, null), 0, 1));
        arrayList2.add(new r90(2, 0, org.telegram.messenger.hd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747065, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 12));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        v4.b0 b0Var = new v4.b0();
        this.c = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.pj0 pj0Var3 = this.b;
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(this, 2);
        this.d = yh0Var;
        pj0Var3.setAdapter(yh0Var);
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.a.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new wr(this, 18));
        this.fragmentView = this.a;
        this.f = org.telegram.messenger.g0.Q1() ? 360864 : 360928;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt != null) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.s;
                    if (R < arrayList.size()) {
                        r90 r90Var = (r90) arrayList.get(R);
                        int i10 = r90Var.a;
                        if (i10 == 3 || i10 == 4) {
                            v90 v90Var = (v90) childAt;
                            ImageView imageView = v90Var.e;
                            w90 w90Var = v90Var.D;
                            int i11 = r90Var.e;
                            if (i10 == 3) {
                                boolean z9 = Integer.bitCount(i11) > 1;
                                v90Var.w = z9;
                                if (z9) {
                                    v90Var.c(r90Var, true);
                                    int Z = w90Var.Z(i11);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.camera.q.l(imageView.animate().rotation((Z < 0 || !w90Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.xq.h, 240L);
                                }
                                v90Var.f.c(org.telegram.messenger.rc.e(i11), true);
                            } else {
                                v90Var.h.a(org.telegram.messenger.rc.e(i11), true);
                            }
                            v90Var.b(org.telegram.messenger.rc.f(), true);
                        } else if (i10 == 1) {
                            ((u90) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.rc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.rc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.rc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.rc.k();
        org.telegram.ui.Components.i5.t();
        org.telegram.ui.ActionBar.k6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
