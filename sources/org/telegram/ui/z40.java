package org.telegram.ui;

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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class z40 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.c10 E;
    public boolean F;
    public di.d1 G;
    public final long H;
    public final long I;
    public TLRPC.ChatFull J;
    public a0.h K;
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
    public org.telegram.ui.Components.p20 Y;
    public org.telegram.ui.Components.p20 Z;
    public final int a;
    public a0.h a0;
    public final te.c b;
    public ArrayList b0;
    public final te.a c;
    public org.telegram.ui.Components.p20 c0;
    public fi.u2 d;
    public int d0;
    public hi.l5 e;
    public org.telegram.ui.Components.yc0 e0;
    public org.telegram.ui.Components.e10 f;
    public boolean f0;
    public final HashSet g0;
    public r40 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public org.telegram.ui.Components.ek0 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final dh.g q0;
    public v4.c0 r;
    public final ui.f r0;
    public org.telegram.ui.Components.nv0 s;
    public dh.k s0;
    public final ArrayList t0;
    public final RectF u0;
    public final RectF v0;
    public x40 w;
    public v40 x;
    public u40 y;

    public z40(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.b = new te.c(3, this, nrVar, 350L);
        this.c = new te.a(4, this, nrVar, 350L, false);
        this.a0 = new a0.h();
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
        int i10 = bundle.getInt("chatType", 0);
        this.N = i10;
        this.O = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.P = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.Q = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.R = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.S = z13;
        this.V = bundle.getInt("chatAddType", 0);
        this.W = bundle.getBoolean("allowPremium", false);
        this.X = bundle.getBoolean("allowMiniapps", false);
        this.H = bundle.getLong("chatId");
        this.I = bundle.getLong("channelId");
        if (z10 || z11 || z13) {
            this.L = 0;
        } else if (z12) {
            this.L = getMessagesController().S6 - 1;
        } else {
            org.telegram.messenger.np messagesController = getMessagesController();
            this.L = i10 == 0 ? messagesController.a3 : messagesController.Z2;
        }
        if (i7 >= 31) {
            this.q0 = new dh.g(false);
            this.r0 = new ui.f(null);
        } else {
            this.q0 = null;
            this.r0 = null;
        }
    }

    public static void Z(z40 z40Var, Context context, View view, int i7) {
        long j3;
        int i10 = z40Var.L;
        long j10 = z40Var.I;
        x40 x40Var = z40Var.w;
        int i11 = 0;
        if (i7 == x40Var.x) {
            int i12 = z40Var.currentAccount;
            org.telegram.ui.ActionBar.h6 h6Var = z40Var.resourceProvider;
            p40 p40Var = new p40(z40Var, i11);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            t1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new bg.l0(i12, t1Var, context, h6Var, p40Var, 5));
            return;
        }
        if (i7 == 0 && x40Var.G != 0 && !x40Var.n) {
            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, z40Var, z40Var.J, z40Var.H, j10 != 0);
            z40Var.e0 = yc0Var;
            z40Var.showDialog(yc0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (i4Var.r) {
                org.telegram.ui.Components.p20 p20Var = z40Var.Y;
                if (p20Var == null) {
                    org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(z40Var.f.r.getContext(), "premium");
                    z40Var.Y = p20Var2;
                    z40Var.h.a(p20Var2);
                    z40Var.Y.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(p20Var);
                    z40Var.Y = null;
                }
                z40Var.p0();
                return;
            }
            if (i4Var.s) {
                org.telegram.ui.Components.p20 p20Var3 = z40Var.Z;
                if (p20Var3 == null) {
                    org.telegram.ui.Components.p20 p20Var4 = new org.telegram.ui.Components.p20(z40Var.f.r.getContext(), "miniapps");
                    z40Var.Z = p20Var4;
                    z40Var.h.a(p20Var4);
                    z40Var.Z.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(p20Var3);
                    z40Var.Z = null;
                }
                z40Var.p0();
                return;
            }
            Object object = i4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j3 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j3 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = z40Var.K;
            if (hVar == null || hVar.h(j3) < 0) {
                if (i4Var.P) {
                    int i13 = -z40Var.m0;
                    z40Var.m0 = i13;
                    org.telegram.messenger.g0.E3(i13, i4Var, null);
                    org.telegram.messenger.q2.E.a();
                    String q10 = j3 >= 0 ? org.telegram.messenger.p10.q(org.telegram.messenger.np.u1(z40Var.currentAccount).c2(Long.valueOf(j3))) : "";
                    (org.telegram.messenger.np.u1(z40Var.currentAccount).K3() ? org.telegram.ui.Components.lc.b0(z40Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743515, q10))) : org.telegram.ui.Components.lc.b0(z40Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743515, q10)), org.telegram.messenger.hd.N0(2131743514, null), new p40(z40Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.p20 p20Var5 = (org.telegram.ui.Components.p20) z40Var.a0.f(j3);
                if (p20Var5 != null) {
                    z40Var.h.c(p20Var5);
                } else {
                    if (i10 != 0 && z40Var.a0.m() == i10) {
                        return;
                    }
                    if (z40Var.N == 0 && z40Var.a0.m() == z40Var.getMessagesController().Y2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z40Var.getParentActivity());
                        String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                        t1Var2.S = N0;
                        t1Var2.U = org.telegram.messenger.hd.N0(2131745098, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        z40Var.showDialog(t1Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (z40Var.S && user.bot) {
                            if (j10 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.lc.b0(z40Var).t(org.telegram.messenger.hd.N0(2131753105, null), null).j();
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            if (j10 != 0) {
                                TLRPC.Chat O0 = z40Var.getMessagesController().O0(Long.valueOf(j10));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z40Var.getParentActivity());
                                boolean w10 = org.telegram.messenger.v3.w(4, O0);
                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                                if (w10) {
                                    t1Var3.S = org.telegram.messenger.hd.N0(2131754458, null);
                                    t1Var3.U = org.telegram.messenger.hd.N0(2131754457, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131754463, null), new at(9, z40Var, user));
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                } else {
                                    t1Var3.U = org.telegram.messenger.hd.N0(2131752554, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                }
                                z40Var.showDialog(t1Var3);
                                return;
                            }
                        }
                        z40Var.getMessagesController().e4(user, !z40Var.U, false);
                    } else if (object instanceof TLRPC.Chat) {
                        z40Var.getMessagesController().X3((TLRPC.Chat) object, !z40Var.U);
                    }
                    org.telegram.ui.Components.p20 p20Var6 = new org.telegram.ui.Components.p20(z40Var.f.r.getContext(), object);
                    z40Var.h.a(p20Var6);
                    p20Var6.setOnClickListener(z40Var);
                }
                z40Var.x0();
                if (z40Var.U || z40Var.T) {
                    org.telegram.messenger.g0.I3(z40Var.f.r);
                } else {
                    z40Var.p0();
                }
                if (z40Var.f.r.length() > 0) {
                    z40Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void e0(z40 z40Var) {
        if (z40Var.G == null) {
            return;
        }
        z40Var.c.a(!z40Var.a0.i(), true);
    }

    public static void f0(z40 z40Var, Canvas canvas, RectF rectF, Paint paint) {
        ui.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !org.telegram.messenger.cz.f() || (fVar = z40Var.r0) == null) {
            return;
        }
        fVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
        int alpha = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.ls.I2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 3) {
            if (i7 == 4) {
                l0();
                n0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        o0();
        org.telegram.ui.Components.e10 e10Var = this.f;
        te.c cVar2 = this.b;
        e10Var.setTranslationY(cVar2.f);
        n0();
        this.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((te.a) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // rh.c
    public final View S() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7;
        int i10 = 0;
        this.U = false;
        this.T = false;
        this.b0.clear();
        this.a0.b();
        this.c0 = null;
        boolean z10 = this.S;
        int i11 = 1;
        int i12 = this.N;
        int i13 = 2;
        if (i12 == 2) {
            this.F = true;
        } else {
            this.F = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.M);
        boolean z11 = this.Q;
        boolean z12 = this.P;
        boolean z13 = this.R;
        if (!isEmpty) {
            this.actionBar.setTitle(this.M);
        } else if (i12 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131752514, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748095, null));
        } else if (!z10) {
            int i14 = this.V;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131750793, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131754266, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131754264, null));
                }
            } else if (!z11) {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(i12 == 0 ? 2131748080 : 2131748096, null));
            } else if (i14 == 2) {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131750717, null));
            } else if (i14 == 1) {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748099, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748097, null));
            }
        } else if (this.I != 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131752514, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131749307, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 7));
        this.f = new org.telegram.ui.Components.e10(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        r40 r40Var = new r40(this, context, this.currentAccount);
        this.h = r40Var;
        r40Var.setDelegate(new n40(this, i10));
        this.h.getSpansContainer().setOnClickListener(new o40(this, i11));
        r40 r40Var2 = this.h;
        this.a0 = r40Var2.b;
        this.b0 = r40Var2.c;
        w0();
        int i15 = 4;
        this.f.r.setOnEditorActionListener(new fa(this, i15));
        this.f.r.setOnKeyListener(new s40(i10, this));
        this.f.r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            u0(arrayList, this.k0, this.l0);
        }
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(6);
        yzVar.x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.s = nv0Var;
        nv0Var.addView(yzVar);
        this.s.e(true, false);
        this.s.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.r = new v4.c0(1, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.n = ek0Var;
        ek0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.ek0 ek0Var2 = this.n;
        x40 x40Var = new x40(this, context);
        this.w = x40Var;
        ek0Var2.setAdapter(x40Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        org.telegram.ui.Components.ek0 ek0Var3 = this.n;
        float f10 = -this.a;
        k0Var.addView(ek0Var3, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.s);
        this.n.setOnItemClickListener(new fi.g4(18, this, context));
        this.n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.ek0 ek0Var4 = this.n;
        ek0Var4.X1 = true;
        ek0Var4.Y1 = 0;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.E = c10Var;
        if (z11 || z12 || z10) {
            c10Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.l = org.telegram.messenger.ls.K2;
            x1Var.invalidateSelf();
            this.E.c.setImageDrawable(x1Var);
        }
        if (!z13) {
            k0Var.addView(this.E, org.telegram.ui.Components.c10.b());
        }
        this.E.setOnClickListener(new o40(this, i13));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
        int i16 = 3;
        if (z13) {
            this.G = new di.d1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, this.resourceProvider);
            this.G.addView(view, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, c8.ma.e(-1, -2, 87));
            hi.e eVar = new hi.e(context, this.resourceProvider, true);
            eVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131749288, null));
            eVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(eVar, c8.ma.q(-1, 48, 1.0f, org.telegram.messenger.ls.E1, 0, 0, 6, 0));
            eVar.setOnClickListener(new o40(this, i16));
            hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
            eVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131749289, null));
            eVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(eVar2, c8.ma.q(-1, 48, 1.0f, org.telegram.messenger.ls.E1, 6, 0, 0, 0));
            eVar2.setOnClickListener(new o40(this, i15));
            i7 = -1;
            k0Var.addView(this.G, c8.ma.e(-1, -2, 87));
            l0();
        } else {
            i7 = -1;
        }
        x0();
        fi.u2 u2Var = new fi.u2(this, context);
        this.d = u2Var;
        k0Var.addView(u2Var, c8.ma.e(i7, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f, c8.ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.ek0 ek0Var5 = this.n;
        Objects.requireNonNull(ek0Var5);
        this.s0 = new dh.k(ek0Var5, k0Var, new q40(ek0Var5, 0));
        this.n.D0(new p40(this, i16));
        hi.l5 l5Var = new hi.l5(context, this.parentLayout);
        this.e = l5Var;
        ((te.a) l5Var.c).a(false, false);
        k0Var.addView(this.e, c8.ma.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view2 = this.fragmentView;
        n40 n40Var = new n40(this, i16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, n40Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.O) {
            x40 x40Var = this.w;
            if (x40Var != null) {
                x40Var.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.r) {
            if (i7 == org.telegram.messenger.ls.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i11 = org.telegram.messenger.np.I8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.q0) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + this.d0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + L2;
        RectF rectF = this.u0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = -L;
        rectF.inset(0.0f, f10);
        if (this.G != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.v0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f10);
        }
        gVar.g((this.G == null || this.c.e <= 0.0f) ? 1 : 2, this.t0);
        gVar.e(this.s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(boolean z10) {
        boolean z11;
        int i7 = 1;
        if (this.f0) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < this.a0.m(); i10++) {
                hashSet.add(Long.valueOf(this.a0.j(i10)));
            }
            boolean z12 = this.h0;
            boolean z13 = this.Y == null;
            HashSet hashSet2 = this.g0;
            if (z12 != z13) {
                if (this.i0 != (this.Z == null) && hashSet.size() == hashSet2.size()) {
                    z11 = false;
                    if (!z11) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            if (!hashSet2.contains(l10)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        if (z10) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String N0 = org.telegram.messenger.hd.N0(2131743481, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = org.telegram.messenger.hd.N0(2131746576, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new n40(this, i7));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747386, null), new n40(this, 2));
                            showDialog(t1Var);
                        }
                        return false;
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
            if (z11) {
            }
        }
        return true;
    }

    public final void l0() {
        di.d1 d1Var = this.G;
        if (d1Var == null) {
            return;
        }
        float f10 = this.c.e;
        d1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.G.setAlpha(f10);
        this.G.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // rh.c
    public final void m(r0.l1 l1Var) {
        this.o0 = l1Var.a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.c10 c10Var = this.E;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.n0, this.o0));
        }
    }

    public final void n0() {
        if (this.n.Y0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((org.telegram.messenger.g0.L(76.0f) + this.n0) * this.c.e);
        int i7 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i7 + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int z10 = org.telegram.messenger.f3.z(i7, this.n.getMeasuredHeight(), L);
        Rect rect = this.p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.n.setClipBounds(rect);
    }

    public final void o0() {
        int L = this.R ? org.telegram.messenger.g0.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(r3 + 48) + ((int) this.b.f), 0, org.telegram.messenger.g0.L(this.a) + this.n0 + L);
        this.s.setPadding(0, 0, 0, this.n0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (k0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) view;
        if (p20Var.E) {
            this.c0 = null;
            this.h.c(p20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.p20 p20Var2 = this.c0;
        if (p20Var2 != null) {
            p20Var2.a();
        }
        this.c0 = p20Var;
        p20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.O);
        getNotificationCenter().c(this, org.telegram.messenger.ls.r);
        getNotificationCenter().c(this, org.telegram.messenger.ls.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.O);
        getNotificationCenter().n(this, org.telegram.messenger.ls.r);
        getNotificationCenter().n(this, org.telegram.messenger.ls.R);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.e10 e10Var = this.f;
            if (e10Var != null) {
                e10Var.updateColors();
            }
            org.telegram.ui.Components.c10 c10Var = this.E;
            if (c10Var != null) {
                c10Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        long j3;
        int childCount = this.n.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                Object object = i4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        i4Var.c(this.Y != null, true);
                        i4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        i4Var.c(this.Z != null, true);
                        i4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.K;
                    if (hVar == null || hVar.h(j3) < 0) {
                        i4Var.c(this.a0.h(j3) >= 0, true);
                        i4Var.setCheckBoxEnabled(true);
                    } else {
                        i4Var.c(true, false);
                        i4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((org.telegram.ui.Cells.y3) childAt).a((this.Y == null && this.a0.i()) ? "" : org.telegram.messenger.hd.N0(2131751445, null), new o40(this, i7));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.a0.m(); i7++) {
            hashSet.add(Long.valueOf(this.a0.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.a0.m(); i10++) {
            arrayList.add(getMessagesController().c2(Long.valueOf(this.a0.j(i10))));
        }
        u40 u40Var = this.y;
        if (u40Var != null) {
            u40Var.i(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean i7 = this.a0.i();
        boolean z10 = this.S;
        int i10 = this.N;
        if (!i7 || i10 == 2 || !z10) {
            long j3 = this.H;
            int i11 = 1;
            if (!z10) {
                if (i10 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < this.a0.m(); i12++) {
                        arrayList.add(getMessagesController().s1(getMessagesController().c2(Long.valueOf(this.a0.j(i12)))));
                    }
                    org.telegram.messenger.np messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.j1(j3);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.ho(messagesController, tL_channels_inviteToChannel, j3, 6));
                    }
                    getNotificationCenter().k(org.telegram.messenger.ls.t, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j3);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new bn(bundle), true);
                    return true;
                }
                if (this.F) {
                    if (z10) {
                        r0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < this.a0.m(); i13++) {
                        arrayList2.add(Long.valueOf(this.a0.j(i13)));
                    }
                    if (this.P || this.Q) {
                        v40 v40Var = this.x;
                        if (v40Var != null) {
                            v40Var.a(arrayList2, this.Y != null, this.Z != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        jArr[i14] = ((Long) arrayList2.get(i14)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.O);
                    presentFragment(new f50(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = org.telegram.messenger.hd.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = G;
                StringBuilder sb2 = new StringBuilder();
                for (int i15 = 0; i15 < this.a0.m(); i15++) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.a0.j(i15)));
                    if (c22 != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                        sb2.append("**");
                    }
                }
                org.telegram.messenger.np messagesController2 = getMessagesController();
                if (j3 == 0) {
                    j3 = this.I;
                }
                TLRPC.Chat O0 = messagesController2.O0(Long.valueOf(j3));
                if (this.a0.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(this.a0.m(), "AddManyMembersAlertNamesText", O0 != null ? O0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.a0.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                    }
                    t1Var.U = spannableStringBuilder;
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754396, sb2, O0 != null ? O0.title : ""));
                }
                org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                if (!org.telegram.messenger.v3.T(O0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, getParentActivity(), this.resourceProvider);
                    d2VarArr[0] = d2Var;
                    d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    d2VarArr[0].setMultiline(true);
                    if (this.a0.m() == 1) {
                        d2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131754390, org.telegram.messenger.p10.k(getMessagesController().c2(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                    } else {
                        d2VarArr[0].e(org.telegram.messenger.hd.N0(2131754395, null), "", true, false, false);
                    }
                    d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    linearLayout.addView(d2VarArr[0], c8.ma.o(-1, -2));
                    d2VarArr[0].setOnClickListener(new c10(d2VarArr, i11));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754483, null), new at(10, this, d2VarArr));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                showDialog(t1Var);
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.p20 p20Var;
        org.telegram.ui.Components.p20 p20Var2;
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.h0 = z10;
        this.i0 = z11;
        r40 r40Var = this.h;
        if (r40Var == null) {
            this.j0 = arrayList;
            this.k0 = z10;
            this.l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.p20 p20Var3 = new org.telegram.ui.Components.p20(getParentActivity(), "premium");
            this.Y = p20Var3;
            this.h.a(p20Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (p20Var = this.Y) != null) {
            r40Var.c(p20Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.p20 p20Var4 = new org.telegram.ui.Components.p20(getParentActivity(), "miniApps");
            this.Z = p20Var4;
            this.h.a(p20Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (p20Var2 = this.Z) != null) {
            this.h.c(p20Var2);
            this.Z = null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            Object O0 = longValue < 0 ? getMessagesController().O0(Long.valueOf(-longValue)) : getMessagesController().c2(l10);
            if (O0 != null) {
                org.telegram.ui.Components.p20 p20Var5 = new org.telegram.ui.Components.p20(getParentActivity(), O0);
                this.h.a(p20Var5);
                p20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.i10 i10Var = this.h.d;
        AnimatorSet animatorSet = i10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.a.setupEndValues();
            i10Var.a.cancel();
        }
        org.telegram.messenger.g0.Z3(this.n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.n, new ii(this, i7, 21));
    }

    public final void w0() {
        x40 x40Var;
        ah.i iVar = this.f.r;
        if (iVar == null) {
            return;
        }
        if (this.N == 2) {
            iVar.setHint(org.telegram.messenger.hd.N0(2131754393, null));
            return;
        }
        if (this.S || ((x40Var = this.w) != null && x40Var.H == 0)) {
            iVar.setHint(org.telegram.messenger.hd.N0(2131745573, null));
            return;
        }
        if (this.P || this.Q) {
            iVar.setHint(org.telegram.messenger.hd.N0(2131745572, null));
        } else if (this.R) {
            iVar.setHint(org.telegram.messenger.hd.N0(2131748094, null));
        } else {
            iVar.setHint(org.telegram.messenger.hd.N0(2131745399, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i7 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.hd.a0(null, null, 2131748426, org.telegram.messenger.hd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 == 2 || !z11) {
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

    public final void y0() {
        try {
            org.telegram.ui.Components.ek0 ek0Var = this.n;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            r40 r40Var = this.h;
            if (r40Var == null || r40Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                View childAt = spansContainer.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.p20) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void s0(HashSet hashSet) {
    }

    @Override // rh.c
    public final /* synthetic */ void O() {
    }

    @Override // rh.c
    public final /* synthetic */ void w() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
