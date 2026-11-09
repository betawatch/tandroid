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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y90 extends org.telegram.ui.ActionBar.f2 {
    public FrameLayout a;
    public org.telegram.ui.Components.qj0 b;
    public v4.b0 c;
    public org.telegram.ui.Components.zh0 d;
    public org.telegram.ui.Components.cc e;
    public int f;
    public final r3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public y90() {
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
            if (((t90) arrayList.get(i10)).e == i7) {
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
        arrayList2.add(new t90(1, 0, null, 0, 0));
        arrayList2.add(new t90(2, 0, org.telegram.messenger.sc.c() <= 0 ? org.telegram.messenger.id.M0(2131748871, null) : org.telegram.messenger.sc.c() >= 100 ? org.telegram.messenger.id.M0(2131748870, null) : org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c()))), 0, 0));
        arrayList2.add(new t90(0, 0, org.telegram.messenger.id.M0(2131748848, null), 0, 0));
        arrayList2.add(t90.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.id.M0(2131748850, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(t90.b(1, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(t90.b(2, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(t90.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.id.M0(2131748855, null)));
        if (zArr[1]) {
            arrayList2.add(t90.b(16388, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(t90.b(8200, org.telegram.messenger.id.M0(2131748861, null)));
            arrayList2.add(t90.b(4112, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(t90.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.id.M0(2131748856, null)));
        if (zArr[2]) {
            arrayList2.add(t90.b(32, org.telegram.messenger.id.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(t90.b(64, org.telegram.messenger.id.N0("LiteOptionsTopics")));
            }
            arrayList2.add(t90.b(128, org.telegram.messenger.id.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.iz.o() < 1) {
                boolean z9 = org.telegram.messenger.r2.a;
            } else {
                arrayList2.add(t90.b(256, org.telegram.messenger.id.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.iz.o() < 1) {
                    boolean z10 = org.telegram.messenger.r2.a;
                } else {
                    arrayList2.add(t90.b(262144, org.telegram.messenger.id.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(t90.b(32768, org.telegram.messenger.id.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.ez0.c()) {
                arrayList2.add(t90.b(65536, org.telegram.messenger.id.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(t90.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.id.M0(2131748857, null)));
        arrayList2.add(t90.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.id.M0(2131748860, null)));
        arrayList2.add(t90.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.id.M0(2131748863, null)));
        arrayList2.add(t90.c(R.drawable.photo_star, 131072, org.telegram.messenger.id.M0(2131748853, null)));
        arrayList2.add(new t90(2, 0, "", 0, 0));
        arrayList2.add(new t90(5, 0, org.telegram.messenger.id.M0(2131748846, null), 0, 1));
        arrayList2.add(new t90(2, 0, org.telegram.messenger.id.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747066, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 12));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.b = qj0Var;
        qj0Var.r1();
        org.telegram.ui.Components.qj0 qj0Var2 = this.b;
        v4.b0 b0Var = new v4.b0();
        this.c = b0Var;
        qj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.qj0 qj0Var3 = this.b;
        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(this, 2);
        this.d = zh0Var;
        qj0Var3.setAdapter(zh0Var);
        this.b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.a.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new yr(this, 18));
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
                        t90 t90Var = (t90) arrayList.get(R);
                        int i10 = t90Var.a;
                        if (i10 == 3 || i10 == 4) {
                            x90 x90Var = (x90) childAt;
                            ImageView imageView = x90Var.e;
                            y90 y90Var = x90Var.D;
                            int i11 = t90Var.e;
                            if (i10 == 3) {
                                boolean z9 = Integer.bitCount(i11) > 1;
                                x90Var.w = z9;
                                if (z9) {
                                    x90Var.c(t90Var, true);
                                    int Z = y90Var.Z(i11);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.camera.q.l(imageView.animate().rotation((Z < 0 || !y90Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.xq.h, 240L);
                                }
                                x90Var.f.c(org.telegram.messenger.sc.e(i11), true);
                            } else {
                                x90Var.h.a(org.telegram.messenger.sc.e(i11), true);
                            }
                            x90Var.b(org.telegram.messenger.sc.f(), true);
                        } else if (i10 == 1) {
                            ((w90) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.sc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.sc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.sc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.sc.k();
        org.telegram.ui.Components.i5.t();
        org.telegram.ui.ActionBar.l6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
