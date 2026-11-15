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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x90 extends org.telegram.ui.ActionBar.e2 {
    public FrameLayout a;
    public org.telegram.ui.Components.uj0 b;
    public v4.b0 c;
    public org.telegram.ui.Components.ci0 d;
    public org.telegram.ui.Components.xb e;
    public int f;
    public final r3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public x90() {
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
            if (((s90) arrayList.get(i10)).e == i7) {
                this.b.e1(new ai.r1(this, i10, 15), 700, true);
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
        arrayList2.add(new s90(1, 0, null, 0, 0));
        arrayList2.add(new s90(2, 0, org.telegram.messenger.qc.c() <= 0 ? org.telegram.messenger.hd.M0(2131748871, null) : org.telegram.messenger.qc.c() >= 100 ? org.telegram.messenger.hd.M0(2131748870, null) : org.telegram.messenger.hd.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.qc.c()))), 0, 0));
        arrayList2.add(new s90(0, 0, org.telegram.messenger.hd.M0(2131748848, null), 0, 0));
        arrayList2.add(s90.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.hd.M0(2131748850, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(s90.b(1, org.telegram.messenger.hd.M0(2131748862, null)));
            arrayList2.add(s90.b(2, org.telegram.messenger.hd.M0(2131748864, null)));
        }
        arrayList2.add(s90.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.hd.M0(2131748855, null)));
        if (zArr[1]) {
            arrayList2.add(s90.b(16388, org.telegram.messenger.hd.M0(2131748862, null)));
            arrayList2.add(s90.b(8200, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(s90.b(4112, org.telegram.messenger.hd.M0(2131748864, null)));
        }
        arrayList2.add(s90.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.hd.M0(2131748856, null)));
        if (zArr[2]) {
            arrayList2.add(s90.b(32, org.telegram.messenger.hd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(s90.b(64, org.telegram.messenger.hd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(s90.b(128, org.telegram.messenger.hd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.gz.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.a;
            } else {
                arrayList2.add(s90.b(256, org.telegram.messenger.hd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.gz.o() < 1) {
                    boolean z11 = org.telegram.messenger.r2.a;
                } else {
                    arrayList2.add(s90.b(262144, org.telegram.messenger.hd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(s90.b(32768, org.telegram.messenger.hd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.fz0.c()) {
                arrayList2.add(s90.b(65536, org.telegram.messenger.hd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(s90.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.hd.M0(2131748857, null)));
        arrayList2.add(s90.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.hd.M0(2131748860, null)));
        arrayList2.add(s90.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.hd.M0(2131748863, null)));
        arrayList2.add(s90.c(R.drawable.photo_star, 131072, org.telegram.messenger.hd.M0(2131748853, null)));
        arrayList2.add(new s90(2, 0, "", 0, 0));
        arrayList2.add(new s90(5, 0, org.telegram.messenger.hd.M0(2131748846, null), 0, 1));
        arrayList2.add(new s90(2, 0, org.telegram.messenger.hd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747066, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 13));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        org.telegram.ui.Components.uj0 uj0Var2 = this.b;
        v4.b0 b0Var = new v4.b0();
        this.c = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.uj0 uj0Var3 = this.b;
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(this, 2);
        this.d = ci0Var;
        uj0Var3.setAdapter(ci0Var);
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.a.addView(this.b, c8.ja.c(-1.0f, -1));
        this.b.setOnItemClickListener(new zr(this, 18));
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
                        s90 s90Var = (s90) arrayList.get(R);
                        int i10 = s90Var.a;
                        if (i10 == 3 || i10 == 4) {
                            w90 w90Var = (w90) childAt;
                            ImageView imageView = w90Var.e;
                            x90 x90Var = w90Var.E;
                            int i11 = s90Var.e;
                            if (i10 == 3) {
                                boolean z10 = Integer.bitCount(i11) > 1;
                                w90Var.w = z10;
                                if (z10) {
                                    w90Var.c(s90Var, true);
                                    int Z = x90Var.Z(i11);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.i20.n(imageView.animate().rotation((Z < 0 || !x90Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.er.h, 240L);
                                }
                                w90Var.f.c(org.telegram.messenger.qc.e(i11), true);
                            } else {
                                w90Var.h.a(org.telegram.messenger.qc.e(i11), true);
                            }
                            w90Var.b(org.telegram.messenger.qc.f(), true);
                        } else if (i10 == 1) {
                            ((v90) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.qc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.qc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.qc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qc.k();
        org.telegram.ui.Components.g5.t();
        org.telegram.ui.ActionBar.j6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
