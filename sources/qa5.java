// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class qa5 extends d implements gk7, x74, View.OnClickListener, swc {
    public un4 E;
    public boolean F;
    public eb0 G;
    public final long H;
    public final long I;
    public TLRPC.ChatFull J;
    public vf6 K;
    public final int L;
    public String M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public ya5 Y;
    public ya5 Z;
    public final byte a;
    public vf6 a0;
    public final y74 b;
    public ArrayList b0;
    public final fm0 c;
    public ya5 c0;
    public rj4 d;
    public int d0;
    public s71 e;
    public g38 e0;
    public no4 f;
    public boolean f0;
    public final HashSet g0;
    public ha5 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public o39 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final cq3 q0;
    public t26 r;
    public final lx4 r0;
    public zya s;
    public mdc s0;
    public final ArrayList t0;
    public final RectF u0;
    public final RectF v0;
    public oa5 w;
    public la5 x;
    public ka5 y;

    public qa5(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? (byte) 48 : (byte) 0;
        s33 s33Var = s33.h;
        this.b = new y74(3, this, s33Var, 350L);
        this.c = new fm0(4, this, s33Var, 350L, false);
        this.a0 = new vf6();
        this.b0 = new ArrayList();
        this.g0 = new HashSet();
        this.m0 = -4;
        this.p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.t0 = arrayList;
        RectF rectF = new RectF();
        this.u0 = rectF;
        RectF rectF2 = new RectF();
        this.v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i2 = bundle.getInt("chatType", 0);
        this.N = i2;
        this.O = bundle.getBoolean("forImport", false);
        boolean z = bundle.getBoolean("isAlwaysShare", false);
        this.P = z;
        boolean z2 = bundle.getBoolean("isNeverShare", false);
        this.Q = z2;
        boolean z3 = bundle.getBoolean("isCall", false);
        this.R = z3;
        boolean z4 = bundle.getBoolean("addToGroup", false);
        this.S = z4;
        this.V = bundle.getInt("chatAddType", 0);
        this.W = bundle.getBoolean("allowPremium", false);
        this.X = bundle.getBoolean("allowMiniapps", false);
        this.H = bundle.getLong("chatId");
        this.I = bundle.getLong("channelId");
        if (z || z2 || z4) {
            this.L = 0;
        } else if (z3) {
            this.L = getMessagesController().k4.w3.f() - 1;
        } else {
            this.L = i2 == 0 ? getMessagesController().Q2 : getMessagesController().P2;
        }
        if (i >= 31) {
            this.q0 = new cq3(false);
            this.r0 = new lx4(null);
        } else {
            this.q0 = null;
            this.r0 = null;
        }
    }

    @Override // swc
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.Ri));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.Qi));
        hashSet.add(Integer.valueOf(bkb.Pi));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        a createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 0;
        this.U = false;
        this.T = false;
        this.b0.clear();
        this.a0.b();
        this.c0 = null;
        boolean z = this.S;
        byte b2 = 1;
        int i = this.N;
        byte b3 = 2;
        if (i == 2) {
            this.F = true;
        } else {
            this.F = !z;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.M);
        boolean z2 = this.Q;
        boolean z3 = this.P;
        boolean z4 = this.R;
        if (!isEmpty) {
            this.actionBar.setTitle(this.M);
        } else if (i == 2) {
            this.actionBar.setTitle(k96.M0(2131752514, null));
        } else if (z4) {
            this.actionBar.setTitle(k96.M0(2131748096, null));
        } else if (z) {
            long j = this.I;
            a aVar = this.actionBar;
            if (j != 0) {
                aVar.setTitle(k96.M0(2131752514, null));
            } else {
                aVar.setTitle(k96.M0(2131749308, null));
            }
        } else {
            int i2 = this.V;
            if (z3) {
                a aVar2 = this.actionBar;
                if (i2 == 2) {
                    aVar2.setTitle(k96.M0(2131750793, null));
                } else if (i2 == 1) {
                    aVar2.setTitle(k96.M0(2131754266, null));
                } else {
                    aVar2.setTitle(k96.M0(2131754264, null));
                }
            } else if (z2) {
                a aVar3 = this.actionBar;
                if (i2 == 2) {
                    aVar3.setTitle(k96.M0(2131750717, null));
                } else if (i2 == 1) {
                    aVar3.setTitle(k96.M0(2131748100, null));
                } else {
                    aVar3.setTitle(k96.M0(2131748098, null));
                }
            } else {
                this.actionBar.setTitle(k96.M0(i == 0 ? 2131748081 : 2131748097, null));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 23));
        this.f = new no4(context, this.resourceProvider);
        yc ycVar = new yc((byte) 24, context, (Object) this);
        this.fragmentView = ycVar;
        ycVar.setFocusableInTouchMode(true);
        ycVar.setDescendantFocusability(131072);
        ha5 ha5Var = new ha5(this, context, this.currentAccount);
        this.h = ha5Var;
        ha5Var.setDelegate(new da5(this, b));
        this.h.getSpansContainer().setOnClickListener(new ea5(this, b2));
        ha5 ha5Var2 = this.h;
        this.a0 = ha5Var2.b;
        this.b0 = ha5Var2.c;
        v0();
        this.f.r.setOnEditorActionListener(new j(this, (byte) 12));
        this.f.r.setOnKeyListener(new ia5(this, b));
        this.f.r.addTextChangedListener(new b7(this, (byte) 25));
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            s0(arrayList, this.k0, this.l0);
        }
        pi4 pi4Var = new pi4(context, null);
        pi4Var.setViewType(6);
        pi4Var.x = false;
        zya zyaVar = new zya(context, pi4Var, 1, null);
        this.s = zyaVar;
        zyaVar.addView(pi4Var);
        this.s.e(true, false);
        this.s.d.setText(k96.M0(2131747975, null));
        this.r = new t26(1, false);
        o39 o39Var = new o39(context, null);
        this.n = o39Var;
        o39Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        o39 o39Var2 = this.n;
        oa5 oa5Var = new oa5(this, context);
        this.w = oa5Var;
        o39Var2.setAdapter(oa5Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(k96.a0 ? 1 : 2);
        o39 o39Var3 = this.n;
        float f = -this.a;
        ycVar.addView(o39Var3, nme.d(-1, -1.0f, kk7.D1, 0.0f, f, 0.0f, f));
        ycVar.addView(this.s);
        this.n.setOnItemClickListener(new k0(this, context, (byte) 13));
        this.n.setOnScrollListener(new ao2(this, (byte) 17));
        o39 o39Var4 = this.n;
        o39Var4.X1 = true;
        o39Var4.Y1 = false;
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.E = un4Var;
        if (z2 || z3 || z) {
            un4Var.c.setImageResource(R.drawable.floating_check);
        } else {
            ed0 ed0Var = new ed0(false);
            ed0Var.l = (short) 180;
            ed0Var.invalidateSelf();
            this.E.c.setImageDrawable(ed0Var);
        }
        if (!z4) {
            ycVar.addView(this.E, un4.b());
        }
        this.E.setOnClickListener(new ea5(this, b3));
        this.E.e(this.F, false);
        this.E.setContentDescription(k96.M0(2131748058, null));
        byte b4 = 3;
        if (z4) {
            this.G = new eb0(this, context);
            View view = new View(context);
            zkb.h(bkb.c7, this.resourceProvider, view);
            this.G.addView(view, nme.d(-1, 1.0f / gl.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(gl.L(14.0f), gl.L(14.0f), gl.L(14.0f), gl.L(14.0f));
            this.G.addView(linearLayout, nme.e(-1, -2, 87));
            u41 u41Var = new u41(this.resourceProvider, context, true);
            u41Var.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new cm2(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131749289, null));
            u41Var.i(spannableStringBuilder, false, true);
            linearLayout.addView(u41Var, nme.q(-1, 48, 1.0f, kk7.D1, 0, 0, 6, 0));
            u41Var.setOnClickListener(new ea5(this, b4));
            u41 u41Var2 = new u41(this.resourceProvider, context, true);
            u41Var2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new cm2(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) k96.M0(2131749290, null));
            u41Var2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(u41Var2, nme.q(-1, 48, 1.0f, kk7.D1, 6, 0, 0, 0));
            u41Var2.setOnClickListener(new ea5(this, (byte) 4));
            ycVar.addView(this.G, nme.e(-1, -2, 87));
            h0();
        }
        w0();
        rj4 rj4Var = new rj4(this, context);
        this.d = rj4Var;
        ycVar.addView(rj4Var, nme.e(-1, 0, 48));
        ycVar.addView(this.actionBar);
        ycVar.addView(this.f, nme.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        ycVar.addView(this.h);
        o39 o39Var5 = this.n;
        Objects.requireNonNull(o39Var5);
        this.s0 = new mdc(o39Var5, ycVar, new ga5(o39Var5, (byte) 0));
        this.n.E0(new fa5(this, b4));
        s71 s71Var = new s71(context, this.parentLayout);
        this.e = s71Var;
        ((fm0) s71Var.c).a(false, false);
        ycVar.addView(this.e, nme.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view2 = this.fragmentView;
        da5 da5Var = new da5(this, b4);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view2, da5Var);
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N) {
            oa5 oa5Var = this.w;
            if (oa5Var != null) {
                oa5Var.f();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == kk7.Q) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i3 = na7.q5;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.n.getChildAt(i4);
                if (childAt instanceof za5) {
                    ((za5) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT < 31 || (cq3Var = this.q0) == null) {
            return;
        }
        int L = gl.L(48.0f);
        int L2 = gl.L(48.0f) + this.d0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + L2;
        RectF rectF = this.u0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f = -L;
        rectF.inset(0.0f, f);
        if (this.G != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.v0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f);
        }
        cq3Var.g((this.G == null || this.c.e <= 0.0f) ? 1 : 2, this.t0);
        cq3Var.e(this.s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0(boolean z) {
        boolean z2;
        byte b = 1;
        if (this.f0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.a0.m(); i++) {
                hashSet.add(Long.valueOf(this.a0.j(i)));
            }
            boolean z3 = this.h0;
            boolean z4 = this.Y == null;
            HashSet hashSet2 = this.g0;
            if (z3 != z4) {
                if (this.i0 != (this.Z == null) && hashSet.size() == hashSet2.size()) {
                    z2 = false;
                    if (!z2) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l = (Long) it.next();
                            l.getClass();
                            if (!hashSet2.contains(l)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        if (z) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String M0 = k96.M0(2131743487, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131746579, null);
                            alertDialog$Builder.j(k96.M0(2131754213, null), new da5(this, b));
                            alertDialog$Builder.g(k96.M0(2131747387, null), new da5(this, (byte) 2));
                            showDialog(hdVar);
                        }
                        return false;
                    }
                }
            }
            z2 = true;
            if (!z2) {
            }
            if (z2) {
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.n, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
        arrayList.add(new blb(this.n, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(this.n, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.i7));
        arrayList.add(new blb(this.n, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(this.h.getSpansContainer(), 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Si));
        arrayList.add(new blb(this.h.getSpansContainer(), 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ti));
        arrayList.add(new blb(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void h0() {
        eb0 eb0Var = this.G;
        if (eb0Var == null) {
            return;
        }
        float f = this.c.e;
        eb0Var.setTranslationY((1.0f - f) * gl.L(12.0f));
        this.G.setAlpha(f);
        this.G.setVisibility(f > 0.0f ? 0 : 8);
    }

    public final void i0() {
        un4 un4Var = this.E;
        if (un4Var != null) {
            un4Var.setTranslationY(-Math.max(this.n0, this.o0));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.n.Z0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((gl.L(76.0f) + this.n0) * this.c.e);
        byte b = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + gl.L(b + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int x = ls6.x(b, this.n.getMeasuredHeight(), L);
        Rect rect = this.p0;
        rect.set(0, measuredHeight, measuredWidth, x);
        this.n.setClipBounds(rect);
    }

    public final void k0() {
        int L = this.R ? gl.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + gl.L(r3 + 48) + ((int) this.b.f), 0, gl.L(this.a) + this.n0 + L);
        this.s.setPadding(0, 0, 0, this.n0);
    }

    public final void l0() {
        long j;
        int childCount = this.n.getChildCount();
        byte b = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.n.getChildAt(i);
            if (childAt instanceof za5) {
                za5 za5Var = (za5) childAt;
                Object object = za5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    if (object instanceof String) {
                        String str = (String) object;
                        if ("premium".equalsIgnoreCase(str)) {
                            za5Var.c(this.Y != null, true);
                            za5Var.setCheckBoxEnabled(true);
                        } else if ("miniapps".equalsIgnoreCase(str)) {
                            za5Var.c(this.Z != null, true);
                            za5Var.setCheckBoxEnabled(true);
                        }
                    }
                    j = 0;
                }
                if (j != 0) {
                    vf6 vf6Var = this.K;
                    if (vf6Var == null || vf6Var.h(j) < 0) {
                        za5Var.c(this.a0.h(j) >= 0, true);
                        za5Var.setCheckBoxEnabled(true);
                    } else {
                        za5Var.c(true, false);
                        za5Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof l35) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((l35) childAt).a((this.Y == null && this.a0.i()) ? "" : k96.M0(2131751445, null), new ea5(this, b));
                }
            }
        }
    }

    public final void m0(Canvas canvas, RectF rectF, Paint paint) {
        lx4 lx4Var;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !gba.f() || (lx4Var = this.r0) == null) {
            return;
        }
        lx4Var.e(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
        int alpha = paint.getAlpha();
        paint.setAlpha(kk7.H2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    public final HashSet n0() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.a0.m(); i++) {
            hashSet.add(Long.valueOf(this.a0.j(i)));
        }
        return hashSet;
    }

    @Override // swc
    public final void o(vxc vxcVar) {
        this.o0 = vxcVar.a.f(8).d;
        i0();
    }

    public final void o0(Context context, View view, int i) {
        long j;
        oa5 oa5Var = this.w;
        byte b = 0;
        if (i == oa5Var.x) {
            int i2 = this.currentAccount;
            wjb wjbVar = this.resourceProvider;
            fa5 fa5Var = new fa5(this, b);
            hd hdVar = new hd(3, null, context);
            hdVar.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i2).sendRequest(createconferencecall, new vt0(i2, (Object) hdVar, (Object) context, (Object) wjbVar, (Object) fa5Var, (byte) 1));
            return;
        }
        long j2 = this.I;
        byte b2 = 1;
        if (i == 0 && oa5Var.G != 0 && !oa5Var.n) {
            g38 g38Var = new g38(context, this, this.J, this.H, j2 != 0);
            this.e0 = g38Var;
            showDialog(g38Var);
            return;
        }
        if (view instanceof za5) {
            za5 za5Var = (za5) view;
            if (za5Var.r) {
                ya5 ya5Var = this.Y;
                if (ya5Var == null) {
                    ya5 ya5Var2 = new ya5(this.f.r.getContext(), "premium");
                    this.Y = ya5Var2;
                    this.h.a(ya5Var2);
                    this.Y.setOnClickListener(this);
                } else {
                    this.h.c(ya5Var);
                    this.Y = null;
                }
                l0();
                return;
            }
            if (za5Var.s) {
                ya5 ya5Var3 = this.Z;
                if (ya5Var3 == null) {
                    ya5 ya5Var4 = new ya5(this.f.r.getContext(), "miniapps");
                    this.Z = ya5Var4;
                    this.h.a(ya5Var4);
                    this.Z.setOnClickListener(this);
                } else {
                    this.h.c(ya5Var3);
                    this.Z = null;
                }
                l0();
                return;
            }
            Object object = za5Var.getObject();
            boolean z = object instanceof TLRPC.User;
            if (z) {
                j = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j = -((TLRPC.Chat) object).id;
            }
            vf6 vf6Var = this.K;
            if (vf6Var == null || vf6Var.h(j) < 0) {
                if (za5Var.P) {
                    int i3 = -this.m0;
                    this.m0 = i3;
                    gl.A3(i3, za5Var, null);
                    pw0.E.a();
                    String r = j >= 0 ? l7c.r(na7.q1(this.currentAccount).V1(Long.valueOf(j))) : "";
                    (na7.q1(this.currentAccount).F3() ? u21.b0(this).Q(R.raw.star_premium_2, 36, gl.S2(k96.a0(null, null, 2131743521, r))) : u21.b0(this).K(R.raw.star_premium_2, gl.S2(k96.a0(null, null, 2131743521, r)), k96.M0(2131743520, null), new fa5(this, (byte) 2))).j();
                    return;
                }
                ya5 ya5Var5 = (ya5) this.a0.f(j);
                if (ya5Var5 != null) {
                    this.h.c(ya5Var5);
                } else {
                    int i4 = this.L;
                    if (i4 != 0 && this.a0.m() == i4) {
                        return;
                    }
                    if (this.N == 0 && this.a0.m() == getMessagesController().O2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = k96.M0(R.string.AppName, null);
                        hd hdVar2 = alertDialog$Builder.a;
                        hdVar2.S = M0;
                        hdVar2.U = k96.M0(2131745102, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        showDialog(hdVar2);
                        return;
                    }
                    if (z) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (this.S && user.bot) {
                            if (j2 != 0) {
                                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j2));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                                boolean w = hc2.w(4, K0);
                                hd hdVar3 = alertDialog$Builder2.a;
                                if (w) {
                                    hdVar3.S = k96.M0(2131754458, null);
                                    hdVar3.U = k96.M0(2131754457, null);
                                    alertDialog$Builder2.j(k96.M0(2131754463, null), new h45(this, user, b2));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                } else {
                                    hdVar3.U = k96.M0(2131752554, null);
                                    alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                                }
                                showDialog(hdVar3);
                                return;
                            }
                            if (user.bot_nochats) {
                                try {
                                    u21.b0(this).t(k96.M0(2131753105, null), null).j();
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                        }
                        getMessagesController().a4(user, !this.U, false);
                    } else if (object instanceof TLRPC.Chat) {
                        getMessagesController().T3((TLRPC.Chat) object, !this.U);
                    }
                    ya5 ya5Var6 = new ya5(this.f.r.getContext(), object);
                    this.h.a(ya5Var6);
                    ya5Var6.setOnClickListener(this);
                }
                w0();
                if (this.U || this.T) {
                    gl.E3(this.f.r);
                } else {
                    l0();
                }
                if (this.f.r.length() > 0) {
                    this.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (g0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            this.c0 = null;
            this.h.c(ya5Var);
            w0();
            l0();
            return;
        }
        ya5 ya5Var2 = this.c0;
        if (ya5Var2 != null) {
            ya5Var2.a();
        }
        this.c0 = ya5Var;
        ya5Var.b();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.N);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.Q);
        getUserConfig().s();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.N);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.Q);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            no4 no4Var = this.f;
            if (no4Var != null) {
                no4Var.updateColors();
            }
            un4 un4Var = this.E;
            if (un4Var != null) {
                un4Var.updateColors();
            }
            x0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i != 3) {
            if (i == 4) {
                h0();
                j0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        k0();
        no4 no4Var = this.f;
        y74 y74Var2 = this.b;
        no4Var.setTranslationY(y74Var2.f);
        j0();
        this.e.setTranslationY(gl.L(48.0f) + y74Var2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((fm0) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    public final void p0(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.a0.m(); i2++) {
            arrayList.add(getMessagesController().V1(Long.valueOf(this.a0.j(i2))));
        }
        ka5 ka5Var = this.y;
        if (ka5Var != null) {
            ka5Var.f(i, arrayList);
        }
        finishFragment();
    }

    public final boolean r0() {
        boolean i = this.a0.i();
        byte b = 2;
        boolean z = this.S;
        int i2 = this.N;
        if (!i || i2 == 2 || !z) {
            long j = this.H;
            if (!z) {
                if (i2 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i3 = 0; i3 < this.a0.m(); i3++) {
                        arrayList.add(getMessagesController().o1(getMessagesController().V1(Long.valueOf(this.a0.j(i3)))));
                    }
                    na7 messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.f1(j);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new w47((Object) messagesController, (Object) tL_channels_inviteToChannel, j, (byte) 8));
                    }
                    getNotificationCenter().k(kk7.s, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new mu1(bundle), true);
                    return true;
                }
                if (this.F) {
                    if (z) {
                        p0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < this.a0.m(); i4++) {
                        arrayList2.add(Long.valueOf(this.a0.j(i4)));
                    }
                    if (this.P || this.Q) {
                        la5 la5Var = this.x;
                        if (la5Var != null) {
                            la5Var.a(arrayList2, this.Y != null, this.Z != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr[i5] = ((Long) arrayList2.get(i5)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i2);
                    bundle2.putBoolean("forImport", this.O);
                    presentFragment(new wa5(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = k96.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = G;
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < this.a0.m(); i6++) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.a0.j(i6)));
                    if (V1 != null) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append("**");
                        sb.append(qu2.m(0, V1.first_name, V1.last_name));
                        sb.append("**");
                    }
                }
                na7 messagesController2 = getMessagesController();
                if (j == 0) {
                    j = this.I;
                }
                TLRPC.Chat K0 = messagesController2.K0(Long.valueOf(j));
                if (this.a0.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.G(this.a0.m(), "AddManyMembersAlertNamesText", K0 != null ? K0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.a0.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new z3c(gl.o()), indexOf, format.length() + indexOf, 33);
                    }
                    hdVar.U = spannableStringBuilder;
                } else {
                    hdVar.U = gl.S2(k96.a0(null, null, 2131754396, sb, K0 != null ? K0.title : ""));
                }
                ag2[] ag2VarArr = new ag2[1];
                if (!hc2.T(K0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    ag2 ag2Var = new ag2(1, this.resourceProvider, getParentActivity());
                    ag2VarArr[0] = ag2Var;
                    ag2Var.setBackground(bkb.L0(false));
                    ag2VarArr[0].setMultiline(true);
                    if (this.a0.m() == 1) {
                        ag2VarArr[0].e(gl.S2(k96.a0(null, null, 2131754390, l7c.k(getMessagesController().V1(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                    } else {
                        ag2VarArr[0].e(k96.M0(2131754395, null), "", true, false, false);
                    }
                    ag2VarArr[0].setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                    linearLayout.addView(ag2VarArr[0], nme.o(-1, -2));
                    ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, (byte) 3));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(k96.M0(2131754483, null), new h45(this, ag2VarArr, b));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                return true;
            }
        }
        return false;
    }

    public final void s0(ArrayList arrayList, boolean z, boolean z2) {
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.h0 = z;
        this.i0 = z2;
        ha5 ha5Var = this.h;
        if (ha5Var == null) {
            this.j0 = arrayList;
            this.k0 = z;
            this.l0 = z2;
            return;
        }
        ya5 ya5Var = this.Y;
        if (z) {
            if (ya5Var == null) {
                ya5 ya5Var2 = new ya5(getParentActivity(), "premium");
                this.Y = ya5Var2;
                this.h.a(ya5Var2);
                this.Y.setOnClickListener(this);
            }
        } else if (ya5Var != null) {
            ha5Var.c(ya5Var);
            this.Y = null;
        }
        ya5 ya5Var3 = this.Z;
        if (z2) {
            if (ya5Var3 == null) {
                ya5 ya5Var4 = new ya5(getParentActivity(), "miniApps");
                this.Z = ya5Var4;
                this.h.a(ya5Var4);
                this.Z.setOnClickListener(this);
            }
        } else if (ya5Var3 != null) {
            this.h.c(ya5Var3);
            this.Z = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            long longValue = l.longValue();
            Object K0 = longValue < 0 ? getMessagesController().K0(Long.valueOf(-longValue)) : getMessagesController().V1(l);
            if (K0 != null) {
                ya5 ya5Var5 = new ya5(getParentActivity(), K0);
                this.h.a(ya5Var5);
                ya5Var5.setOnClickListener(this);
            }
        }
        qo4 qo4Var = this.h.d;
        AnimatorSet animatorSet = qo4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            qo4Var.a.setupEndValues();
            qo4Var.a.cancel();
        }
        gl.V3(this.n);
    }

    public final void t0(int i) {
        if (this.isPaused) {
            return;
        }
        gl.K(this.n, new sm3((Object) this, i, (byte) 13));
    }

    public final void u0() {
        if (this.G == null) {
            return;
        }
        this.c.a(!this.a0.i(), true);
    }

    public final void v0() {
        oa5 oa5Var;
        l7 l7Var = this.f.r;
        if (l7Var == null) {
            return;
        }
        if (this.N == 2) {
            l7Var.setHint(k96.M0(2131754393, null));
            return;
        }
        if (this.S || ((oa5Var = this.w) != null && oa5Var.H == 0)) {
            l7Var.setHint(k96.M0(2131745577, null));
            return;
        }
        if (this.P || this.Q) {
            l7Var.setHint(k96.M0(2131745576, null));
        } else if (this.R) {
            l7Var.setHint(k96.M0(2131748095, null));
        } else {
            l7Var.setHint(k96.M0(2131745403, null));
        }
    }

    public final void w0() {
        boolean z = this.P;
        int i = this.N;
        boolean z2 = this.S;
        if (!z && !this.Q && !z2) {
            if (i == 2) {
                this.actionBar.setSubtitle(k96.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i2 = this.a0.i();
                int i3 = this.L;
                if (i2) {
                    this.actionBar.setSubtitle(k96.a0(null, null, 2131748427, k96.G(i3 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(k96.J0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i3)));
                }
            }
        }
        if (i == 2 || !z2) {
            return;
        }
        if (this.F && this.b0.isEmpty()) {
            this.E.e(false, true);
            this.F = false;
        } else {
            if (this.F || this.b0.isEmpty()) {
                return;
            }
            this.E.e(true, true);
            this.F = true;
        }
    }

    public final void x0() {
        try {
            o39 o39Var = this.n;
            if (o39Var != null) {
                o39Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            ha5 ha5Var = this.h;
            if (ha5Var == null || ha5Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i = 0; i < spansContainer.getChildCount(); i++) {
                View childAt = spansContainer.getChildAt(i);
                if (childAt instanceof ya5) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // swc
    public final void P() {
    }

    @Override // swc
    public final void w() {
    }

    public void q0(HashSet hashSet) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
