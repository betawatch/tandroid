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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z90 extends org.telegram.ui.ActionBar.h2 {
    public FrameLayout a;
    public org.telegram.ui.Components.ck0 b;
    public v4.c0 c;
    public org.telegram.ui.Components.li0 d;
    public org.telegram.ui.Components.gc e;
    public int f;
    public final r3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public z90() {
        super(null);
        this.h = new r3(this, 11);
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
            if (((u90) arrayList.get(i10)).e == i7) {
                this.b.e1(new ai.s1(this, i10, 15), 700, true);
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
        arrayList2.add(new u90(1, 0, null, 0, 0));
        arrayList2.add(new u90(2, 0, org.telegram.messenger.pc.c() <= 0 ? org.telegram.messenger.gd.M0(2131748679, null) : org.telegram.messenger.pc.c() >= 100 ? org.telegram.messenger.gd.M0(2131748678, null) : org.telegram.messenger.gd.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c()))), 0, 0));
        arrayList2.add(new u90(0, 0, org.telegram.messenger.gd.M0(2131748656, null), 0, 0));
        arrayList2.add(u90.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.gd.M0(2131748658, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(u90.b(1, org.telegram.messenger.gd.M0(2131748670, null)));
            arrayList2.add(u90.b(2, org.telegram.messenger.gd.M0(2131748672, null)));
        }
        arrayList2.add(u90.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.gd.M0(2131748663, null)));
        if (zArr[1]) {
            arrayList2.add(u90.b(16388, org.telegram.messenger.gd.M0(2131748670, null)));
            arrayList2.add(u90.b(8200, org.telegram.messenger.gd.M0(2131748669, null)));
            arrayList2.add(u90.b(4112, org.telegram.messenger.gd.M0(2131748672, null)));
        }
        arrayList2.add(u90.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.gd.M0(2131748664, null)));
        if (zArr[2]) {
            arrayList2.add(u90.b(32, org.telegram.messenger.gd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(u90.b(64, org.telegram.messenger.gd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(u90.b(128, org.telegram.messenger.gd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.bz.o() < 1) {
                boolean z10 = org.telegram.messenger.s2.a;
            } else {
                arrayList2.add(u90.b(256, org.telegram.messenger.gd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.bz.o() < 1) {
                    boolean z11 = org.telegram.messenger.s2.a;
                } else {
                    arrayList2.add(u90.b(262144, org.telegram.messenger.gd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(u90.b(32768, org.telegram.messenger.gd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.mz0.c()) {
                arrayList2.add(u90.b(65536, org.telegram.messenger.gd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(u90.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.gd.M0(2131748665, null)));
        arrayList2.add(u90.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.gd.M0(2131748668, null)));
        arrayList2.add(u90.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.gd.M0(2131748671, null)));
        arrayList2.add(u90.c(R.drawable.photo_star, 131072, org.telegram.messenger.gd.M0(2131748661, null)));
        arrayList2.add(new u90(2, 0, "", 0, 0));
        arrayList2.add(new u90(5, 0, org.telegram.messenger.gd.M0(2131748654, null), 0, 1));
        arrayList2.add(new u90(2, 0, org.telegram.messenger.gd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746873, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 15));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.b = ck0Var;
        ck0Var.r1();
        org.telegram.ui.Components.ck0 ck0Var2 = this.b;
        v4.c0 c0Var = new v4.c0();
        this.c = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.ck0 ck0Var3 = this.b;
        org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(this, 2);
        this.d = li0Var;
        ck0Var3.setAdapter(li0Var);
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.a.addView(this.b, c8.ma.c(-1.0f, -1));
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
                        u90 u90Var = (u90) arrayList.get(R);
                        int i10 = u90Var.a;
                        if (i10 == 3 || i10 == 4) {
                            y90 y90Var = (y90) childAt;
                            ImageView imageView = y90Var.e;
                            z90 z90Var = y90Var.E;
                            int i11 = u90Var.e;
                            if (i10 == 3) {
                                boolean z10 = Integer.bitCount(i11) > 1;
                                y90Var.w = z10;
                                if (z10) {
                                    y90Var.c(u90Var, true);
                                    int Z = z90Var.Z(i11);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.n10.o(imageView.animate().rotation((Z < 0 || !z90Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.lr.h, 240L);
                                }
                                y90Var.f.c(org.telegram.messenger.pc.e(i11), true);
                            } else {
                                y90Var.h.a(org.telegram.messenger.pc.e(i11), true);
                            }
                            y90Var.b(org.telegram.messenger.pc.f(), true);
                        } else if (i10 == 1) {
                            ((x90) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.pc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.pc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.pc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.pc.k();
        org.telegram.ui.Components.o5.t();
        org.telegram.ui.ActionBar.n6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
