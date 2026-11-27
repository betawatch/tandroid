// default package

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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q86 extends e {
    public FrameLayout a;
    public d79 b;
    public x46 c;
    public v83 d;
    public v21 e;
    public int f;
    public final zj3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public q86() {
        super(null);
        this.h = new zj3(this, (byte) 23);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Y(int i) {
        if (i == 3) {
            return 0;
        }
        if (i == 28700) {
            return 1;
        }
        return i == this.f ? 2 : -1;
    }

    public final void Z(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((k86) arrayList.get(i2)).e == i) {
                this.b.g1(new wg((Object) this, i2, (byte) 11), 700, true);
                return;
            }
            i2++;
        }
    }

    public final void a0(int i) {
        int Y = Y(i);
        if (Y == -1) {
            return;
        }
        this.n[Y] = true;
        c0();
        b0();
    }

    public final void b0() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new k86(1, 0, 0, 0, null));
        arrayList2.add(new k86(2, 0, 0, 0, i86.c() <= 0 ? ob6.M0(2131748625, null) : i86.c() >= 100 ? ob6.M0(2131748624, null) : ob6.a0(null, null, 2131748626, String.format("%d%%", Integer.valueOf(i86.c())))));
        arrayList2.add(new k86(0, 0, 0, 0, ob6.M0(2131748602, null)));
        arrayList2.add(k86.c(R.drawable.msg2_sticker, 3, ob6.M0(2131748604, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(k86.b(1, ob6.M0(2131748616, null)));
            arrayList2.add(k86.b(2, ob6.M0(2131748618, null)));
        }
        arrayList2.add(k86.c(R.drawable.msg2_smile_status, 28700, ob6.M0(2131748609, null)));
        if (zArr[1]) {
            arrayList2.add(k86.b(16388, ob6.M0(2131748616, null)));
            arrayList2.add(k86.b(8200, ob6.M0(2131748615, null)));
            arrayList2.add(k86.b(4112, ob6.M0(2131748618, null)));
        }
        arrayList2.add(k86.c(R.drawable.msg2_ask_question, this.f, ob6.M0(2131748610, null)));
        if (zArr[2]) {
            arrayList2.add(k86.b(32, ob6.N0("LiteOptionsBackground")));
            if (!hl.O1()) {
                arrayList2.add(k86.b(64, ob6.N0("LiteOptionsTopics")));
            }
            arrayList2.add(k86.b(128, ob6.N0("LiteOptionsSpoiler")));
            if (xea.o() < 1) {
                boolean z = f11.a;
            } else {
                arrayList2.add(k86.b(256, ob6.N0("LiteOptionsBlur2")));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (xea.o() < 1) {
                    boolean z2 = f11.a;
                } else {
                    arrayList2.add(k86.b(262144, ob6.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(k86.b(32768, ob6.N0("LiteOptionsScale")));
            if (hnb.c()) {
                arrayList2.add(k86.b(65536, ob6.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(k86.c(R.drawable.msg2_call_earpiece, 512, ob6.M0(2131748611, null)));
        arrayList2.add(k86.c(R.drawable.msg2_videocall, 1024, ob6.M0(2131748614, null)));
        arrayList2.add(k86.c(R.drawable.msg2_gif, 2048, ob6.M0(2131748617, null)));
        arrayList2.add(k86.c(R.drawable.photo_star, 131072, ob6.M0(2131748607, null)));
        arrayList2.add(new k86(2, 0, 0, 0, ""));
        arrayList2.add(new k86(5, 0, 0, 1, ob6.M0(2131748600, null)));
        arrayList2.add(new k86(2, 0, 0, 0, ob6.N0("LiteSmoothTransitionsInfo")));
        this.d.E(arrayList, arrayList2);
    }

    public final void c0() {
        if (this.b != null) {
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt != null) {
                    this.b.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= 0) {
                        ArrayList arrayList = this.s;
                        if (S < arrayList.size()) {
                            k86 k86Var = (k86) arrayList.get(S);
                            int i2 = k86Var.a;
                            if (i2 == 3 || i2 == 4) {
                                p86 p86Var = (p86) childAt;
                                ImageView imageView = p86Var.e;
                                q86 q86Var = p86Var.E;
                                int i3 = k86Var.e;
                                if (i2 == 3) {
                                    boolean z = Integer.bitCount(i3) > 1;
                                    p86Var.w = z;
                                    if (z) {
                                        p86Var.c(k86Var, true);
                                        int Y = q86Var.Y(i3);
                                        imageView.clearAnimation();
                                        ik8.t(imageView.animate().rotation((Y < 0 || !q86Var.n[Y]) ? 0.0f : 180.0f), k43.h, 240L);
                                    }
                                    p86Var.f.c(i86.e(i3), true);
                                } else {
                                    p86Var.h.a(i86.e(i3), true);
                                }
                                p86Var.b(i86.f(), true);
                            } else if (i2 == 1) {
                                ((o86) childAt).a();
                            }
                        }
                    }
                }
            }
            if (this.e == null || i86.f()) {
                return;
            }
            this.e.b();
            this.e = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131746795, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 4));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        d79 d79Var2 = this.b;
        x46 x46Var = new x46();
        this.c = x46Var;
        d79Var2.setLayoutManager(x46Var);
        d79 d79Var3 = this.b;
        v83 v83Var = new v83(this, b);
        this.d = v83Var;
        d79Var3.setAdapter(v83Var);
        this.b.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        this.a.addView(this.b, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new e05((Object) this, (byte) 25));
        this.fragmentView = this.a;
        this.f = hl.O1() ? 360864 : 360928;
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = i86.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        i86.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i86.k();
        wl.t();
        aob.s1(true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
