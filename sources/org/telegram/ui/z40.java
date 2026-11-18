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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class z40 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.a10 E;
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
    public org.telegram.ui.Components.m20 Y;
    public org.telegram.ui.Components.m20 Z;
    public final int a;
    public a0.h a0;
    public final te.c b;
    public ArrayList b0;
    public final te.a c;
    public org.telegram.ui.Components.m20 c0;
    public fi.u2 d;
    public int d0;
    public hi.m5 e;
    public org.telegram.ui.Components.xc0 e0;
    public org.telegram.ui.Components.c10 f;
    public boolean f0;
    public final HashSet g0;
    public r40 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public org.telegram.ui.Components.ck0 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final dh.g q0;
    public v4.c0 r;
    public final ui.f r0;
    public org.telegram.ui.Components.kv0 s;
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
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.b = new te.c(3, this, lrVar, 350L);
        this.c = new te.a(4, this, lrVar, 350L, false);
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
            org.telegram.messenger.mp messagesController = getMessagesController();
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
            org.telegram.ui.ActionBar.i6 i6Var = z40Var.resourceProvider;
            p40 p40Var = new p40(z40Var, i11);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            u1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new bg.l0(i12, u1Var, context, i6Var, p40Var, 5));
            return;
        }
        if (i7 == 0 && x40Var.G != 0 && !x40Var.n) {
            org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(context, z40Var, z40Var.J, z40Var.H, j10 != 0);
            z40Var.e0 = xc0Var;
            z40Var.showDialog(xc0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.r) {
                org.telegram.ui.Components.m20 m20Var = z40Var.Y;
                if (m20Var == null) {
                    org.telegram.ui.Components.m20 m20Var2 = new org.telegram.ui.Components.m20(z40Var.f.r.getContext(), "premium");
                    z40Var.Y = m20Var2;
                    z40Var.h.a(m20Var2);
                    z40Var.Y.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(m20Var);
                    z40Var.Y = null;
                }
                z40Var.p0();
                return;
            }
            if (h4Var.s) {
                org.telegram.ui.Components.m20 m20Var3 = z40Var.Z;
                if (m20Var3 == null) {
                    org.telegram.ui.Components.m20 m20Var4 = new org.telegram.ui.Components.m20(z40Var.f.r.getContext(), "miniapps");
                    z40Var.Z = m20Var4;
                    z40Var.h.a(m20Var4);
                    z40Var.Z.setOnClickListener(z40Var);
                } else {
                    z40Var.h.c(m20Var3);
                    z40Var.Z = null;
                }
                z40Var.p0();
                return;
            }
            Object object = h4Var.getObject();
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
                if (h4Var.P) {
                    int i13 = -z40Var.m0;
                    z40Var.m0 = i13;
                    org.telegram.messenger.g0.E3(i13, h4Var, null);
                    org.telegram.messenger.q2.E.a();
                    String q10 = j3 >= 0 ? org.telegram.messenger.o10.q(org.telegram.messenger.mp.u1(z40Var.currentAccount).c2(Long.valueOf(j3))) : "";
                    (org.telegram.messenger.mp.u1(z40Var.currentAccount).K3() ? org.telegram.ui.Components.lc.b0(z40Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, q10))) : org.telegram.ui.Components.lc.b0(z40Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, q10)), org.telegram.messenger.gd.M0(2131743522, null), new p40(z40Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.m20 m20Var5 = (org.telegram.ui.Components.m20) z40Var.a0.f(j3);
                if (m20Var5 != null) {
                    z40Var.h.c(m20Var5);
                } else {
                    if (i10 != 0 && z40Var.a0.m() == i10) {
                        return;
                    }
                    if (z40Var.N == 0 && z40Var.a0.m() == z40Var.getMessagesController().Y2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z40Var.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.S = M0;
                        u1Var2.U = org.telegram.messenger.gd.M0(2131745099, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        z40Var.showDialog(u1Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (z40Var.S && user.bot) {
                            if (j10 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.lc.b0(z40Var).t(org.telegram.messenger.gd.M0(2131753106, null), null).j();
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
                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                if (w10) {
                                    u1Var3.S = org.telegram.messenger.gd.M0(2131754459, null);
                                    u1Var3.U = org.telegram.messenger.gd.M0(2131754458, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131754464, null), new at(9, z40Var, user));
                                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                } else {
                                    u1Var3.U = org.telegram.messenger.gd.M0(2131752555, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                                }
                                z40Var.showDialog(u1Var3);
                                return;
                            }
                        }
                        z40Var.getMessagesController().e4(user, !z40Var.U, false);
                    } else if (object instanceof TLRPC.Chat) {
                        z40Var.getMessagesController().X3((TLRPC.Chat) object, !z40Var.U);
                    }
                    org.telegram.ui.Components.m20 m20Var6 = new org.telegram.ui.Components.m20(z40Var.f.r.getContext(), object);
                    z40Var.h.a(m20Var6);
                    m20Var6.setOnClickListener(z40Var);
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
        if (Build.VERSION.SDK_INT < 29 || !org.telegram.messenger.bz.f() || (fVar = z40Var.r0) == null) {
            return;
        }
        fVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
        int alpha = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.ks.I2);
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
        org.telegram.ui.Components.c10 c10Var = this.f;
        te.c cVar2 = this.b;
        c10Var.setTranslationY(cVar2.f);
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.h2
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
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752515, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748096, null));
        } else if (!z10) {
            int i14 = this.V;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750794, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131754267, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131754265, null));
                }
            } else if (!z11) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(i12 == 0 ? 2131748081 : 2131748097, null));
            } else if (i14 == 2) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750718, null));
            } else if (i14 == 1) {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748100, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748098, null));
            }
        } else if (this.I != 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752515, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131749308, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 7));
        this.f = new org.telegram.ui.Components.c10(context, this.resourceProvider);
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
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        wzVar.setViewType(6);
        wzVar.x = false;
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, wzVar, 1, null);
        this.s = kv0Var;
        kv0Var.addView(wzVar);
        this.s.e(true, false);
        this.s.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.r = new v4.c0(1, false);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.n = ck0Var;
        ck0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.ck0 ck0Var2 = this.n;
        x40 x40Var = new x40(this, context);
        this.w = x40Var;
        ck0Var2.setAdapter(x40Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        org.telegram.ui.Components.ck0 ck0Var3 = this.n;
        float f10 = -this.a;
        k0Var.addView(ck0Var3, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.s);
        this.n.setOnItemClickListener(new fi.g4(18, this, context));
        this.n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.ck0 ck0Var4 = this.n;
        ck0Var4.X1 = true;
        ck0Var4.Y1 = 0;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.E = a10Var;
        if (z11 || z12 || z10) {
            a10Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.l = org.telegram.messenger.ks.K2;
            y1Var.invalidateSelf();
            this.E.c.setImageDrawable(y1Var);
        }
        if (!z13) {
            k0Var.addView(this.E, org.telegram.ui.Components.a10.b());
        }
        this.E.setOnClickListener(new o40(this, i13));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
        int i16 = 3;
        if (z13) {
            this.G = new di.d1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, this.resourceProvider);
            this.G.addView(view, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, c8.ma.e(-1, -2, 87));
            hi.d dVar = new hi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131749289, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, c8.ma.q(-1, 48, 1.0f, org.telegram.messenger.ks.E1, 0, 0, 6, 0));
            dVar.setOnClickListener(new o40(this, i16));
            hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131749290, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, c8.ma.q(-1, 48, 1.0f, org.telegram.messenger.ks.E1, 6, 0, 0, 0));
            dVar2.setOnClickListener(new o40(this, i15));
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
        org.telegram.ui.Components.ck0 ck0Var5 = this.n;
        Objects.requireNonNull(ck0Var5);
        this.s0 = new dh.k(ck0Var5, k0Var, new q40(ck0Var5, 0));
        this.n.D0(new p40(this, i16));
        hi.m5 m5Var = new hi.m5(context, this.parentLayout);
        this.e = m5Var;
        ((te.a) m5Var.c).a(false, false);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O) {
            x40 x40Var = this.w;
            if (x40Var != null) {
                x40Var.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.r) {
            if (i7 == org.telegram.messenger.ks.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.y6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
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
                            String M0 = org.telegram.messenger.gd.M0(2131743489, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            u1Var.U = org.telegram.messenger.gd.M0(2131746577, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new n40(this, i7));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747387, null), new n40(this, 2));
                            showDialog(u1Var);
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
        org.telegram.ui.Components.a10 a10Var = this.E;
        if (a10Var != null) {
            a10Var.setTranslationY(-Math.max(this.n0, this.o0));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        if (k0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) view;
        if (m20Var.E) {
            this.c0 = null;
            this.h.c(m20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.m20 m20Var2 = this.c0;
        if (m20Var2 != null) {
            m20Var2.a();
        }
        this.c0 = m20Var;
        m20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.O);
        getNotificationCenter().c(this, org.telegram.messenger.ks.r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.O);
        getNotificationCenter().n(this, org.telegram.messenger.ks.r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.R);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.c10 c10Var = this.f;
            if (c10Var != null) {
                c10Var.updateColors();
            }
            org.telegram.ui.Components.a10 a10Var = this.E;
            if (a10Var != null) {
                a10Var.updateColors();
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
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.Y != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.Z != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.K;
                    if (hVar == null || hVar.h(j3) < 0) {
                        h4Var.c(this.a0.h(j3) >= 0, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((org.telegram.ui.Cells.x3) childAt).a((this.Y == null && this.a0.i()) ? "" : org.telegram.messenger.gd.M0(2131751446, null), new o40(this, i7));
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
                    org.telegram.messenger.mp messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.j1(j3);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.go(messagesController, tL_channels_inviteToChannel, j3, 6));
                    }
                    getNotificationCenter().k(org.telegram.messenger.ks.t, new Object[0]);
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
                String G = org.telegram.messenger.gd.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = G;
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
                org.telegram.messenger.mp messagesController2 = getMessagesController();
                if (j3 == 0) {
                    j3 = this.I;
                }
                TLRPC.Chat O0 = messagesController2.O0(Long.valueOf(j3));
                if (this.a0.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(this.a0.m(), "AddManyMembersAlertNamesText", O0 != null ? O0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.a0.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                    }
                    u1Var.U = spannableStringBuilder;
                } else {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754397, sb2, O0 != null ? O0.title : ""));
                }
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                if (!org.telegram.messenger.v3.T(O0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    c2VarArr[0].setMultiline(true);
                    if (this.a0.m() == 1) {
                        c2VarArr[0].e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754391, org.telegram.messenger.o10.k(getMessagesController().c2(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.gd.M0(2131754396, null), "", true, false, false);
                    }
                    c2VarArr[0].setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    linearLayout.addView(c2VarArr[0], c8.ma.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new c10(c2VarArr, i11));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754484, null), new at(10, this, c2VarArr));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                showDialog(u1Var);
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.m20 m20Var;
        org.telegram.ui.Components.m20 m20Var2;
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
            org.telegram.ui.Components.m20 m20Var3 = new org.telegram.ui.Components.m20(getParentActivity(), "premium");
            this.Y = m20Var3;
            this.h.a(m20Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (m20Var = this.Y) != null) {
            r40Var.c(m20Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.m20 m20Var4 = new org.telegram.ui.Components.m20(getParentActivity(), "miniApps");
            this.Z = m20Var4;
            this.h.a(m20Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (m20Var2 = this.Z) != null) {
            this.h.c(m20Var2);
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
                org.telegram.ui.Components.m20 m20Var5 = new org.telegram.ui.Components.m20(getParentActivity(), O0);
                this.h.a(m20Var5);
                m20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.f10 f10Var = this.h.d;
        AnimatorSet animatorSet = f10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f10Var.a.setupEndValues();
            f10Var.a.cancel();
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
            iVar.setHint(org.telegram.messenger.gd.M0(2131754394, null));
            return;
        }
        if (this.S || ((x40Var = this.w) != null && x40Var.H == 0)) {
            iVar.setHint(org.telegram.messenger.gd.M0(2131745574, null));
            return;
        }
        if (this.P || this.Q) {
            iVar.setHint(org.telegram.messenger.gd.M0(2131745573, null));
        } else if (this.R) {
            iVar.setHint(org.telegram.messenger.gd.M0(2131748095, null));
        } else {
            iVar.setHint(org.telegram.messenger.gd.M0(2131745400, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i7 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.gd.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131748427, org.telegram.messenger.gd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.gd.K0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i11)));
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
            org.telegram.ui.Components.ck0 ck0Var = this.n;
            if (ck0Var != null) {
                ck0Var.x1();
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
                if (childAt instanceof org.telegram.ui.Components.m20) {
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
