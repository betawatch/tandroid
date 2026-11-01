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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class u50 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, fe.e, View.OnClickListener, hh.d {
    public org.telegram.ui.Components.f10 D;
    public boolean E;
    public jg.a3 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.h J;
    public final int K;
    public String L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public org.telegram.ui.Components.s20 X;
    public org.telegram.ui.Components.s20 Y;
    public a0.h Z;
    public final int a;
    public ArrayList a0;
    public final fe.f b;
    public org.telegram.ui.Components.s20 b0;
    public final fe.b c;
    public int c0;
    public ih.c d;
    public org.telegram.ui.Components.hd0 d0;
    public kg.f0 e;
    public boolean e0;
    public org.telegram.ui.Components.h10 f;
    public final HashSet f0;
    public boolean g0;
    public m50 h;
    public boolean h0;
    public ArrayList i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public org.telegram.ui.Components.uk0 n;
    public int n0;
    public final Rect o0;
    public final tg.f p0;
    public final hi.f q0;
    public s4.a0 r;
    public tg.j r0;
    public org.telegram.ui.Components.ew0 s;
    public final ArrayList s0;
    public final RectF t0;
    public final RectF u0;
    public s50 w;
    public q50 x;
    public p50 y;

    public u50(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new fe.f(3, this, grVar, 350L);
        this.c = new fe.b(4, this, grVar, 350L, false);
        this.Z = new a0.h();
        this.a0 = new ArrayList();
        this.f0 = new HashSet();
        this.l0 = -4;
        this.o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.s0 = arrayList;
        RectF rectF = new RectF();
        this.t0 = rectF;
        RectF rectF2 = new RectF();
        this.u0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i11 = bundle.getInt("chatType", 0);
        this.M = i11;
        this.N = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.P = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.Q = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.R = z13;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (z10 || z11 || z13) {
            this.K = 0;
        } else if (z12) {
            this.K = getMessagesController().Q6 - 1;
        } else {
            org.telegram.messenger.wp messagesController = getMessagesController();
            this.K = i11 == 0 ? messagesController.X2 : messagesController.W2;
        }
        if (i10 >= 31) {
            this.p0 = new tg.f(false);
            this.q0 = new hi.f(null);
        } else {
            this.p0 = null;
            this.q0 = null;
        }
    }

    public static void Z(u50 u50Var, Context context, View view, int i10) {
        long j10;
        int i11 = u50Var.K;
        long j11 = u50Var.H;
        s50 s50Var = u50Var.w;
        int i12 = 0;
        if (i10 == s50Var.x) {
            int i13 = u50Var.currentAccount;
            org.telegram.ui.ActionBar.p6 p6Var = u50Var.resourceProvider;
            k50 k50Var = new k50(u50Var, i12);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
            x1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i13).sendRequest(createconferencecall, new q8(i13, x1Var, context, p6Var, k50Var, 0));
            return;
        }
        if (i10 == 0 && s50Var.F != 0 && !s50Var.n) {
            org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, u50Var, u50Var.I, u50Var.G, j11 != 0);
            u50Var.d0 = hd0Var;
            u50Var.showDialog(hd0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (j4Var.r) {
                org.telegram.ui.Components.s20 s20Var = u50Var.X;
                if (s20Var == null) {
                    org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(u50Var.f.r.getContext(), "premium");
                    u50Var.X = s20Var2;
                    u50Var.h.a(s20Var2);
                    u50Var.X.setOnClickListener(u50Var);
                } else {
                    u50Var.h.c(s20Var);
                    u50Var.X = null;
                }
                u50Var.p0();
                return;
            }
            if (j4Var.s) {
                org.telegram.ui.Components.s20 s20Var3 = u50Var.Y;
                if (s20Var3 == null) {
                    org.telegram.ui.Components.s20 s20Var4 = new org.telegram.ui.Components.s20(u50Var.f.r.getContext(), "miniapps");
                    u50Var.Y = s20Var4;
                    u50Var.h.a(s20Var4);
                    u50Var.Y.setOnClickListener(u50Var);
                } else {
                    u50Var.h.c(s20Var3);
                    u50Var.Y = null;
                }
                u50Var.p0();
                return;
            }
            Object object = j4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j10 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = u50Var.J;
            if (hVar == null || hVar.h(j10) < 0) {
                if (j4Var.O) {
                    int i14 = -u50Var.l0;
                    u50Var.l0 = i14;
                    org.telegram.messenger.i0.F3(i14, j4Var, null);
                    org.telegram.messenger.t2.D.a();
                    String p5 = j10 >= 0 ? org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(u50Var.currentAccount).Z1(Long.valueOf(j10))) : "";
                    (org.telegram.messenger.wp.r1(u50Var.currentAccount).A3() ? org.telegram.ui.Components.cc.a0(u50Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, p5))) : org.telegram.ui.Components.cc.a0(u50Var).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, p5)), org.telegram.messenger.dd.L0(2131743785, null), new k50(u50Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.s20 s20Var5 = (org.telegram.ui.Components.s20) u50Var.Z.f(j10);
                if (s20Var5 != null) {
                    u50Var.h.c(s20Var5);
                } else {
                    if (i11 != 0 && u50Var.Z.m() == i11) {
                        return;
                    }
                    if (u50Var.M == 0 && u50Var.Z.m() == u50Var.getMessagesController().V2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u50Var.getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                        x1Var2.R = L0;
                        x1Var2.T = org.telegram.messenger.dd.L0(2131745312, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        u50Var.showDialog(x1Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (u50Var.R && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.cc.a0(u50Var).t(org.telegram.messenger.dd.L0(2131753108, null), null).j();
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat L02 = u50Var.getMessagesController().L0(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u50Var.getParentActivity());
                                boolean w9 = org.telegram.messenger.w3.w(4, L02);
                                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
                                if (w9) {
                                    x1Var3.R = org.telegram.messenger.dd.L0(2131754461, null);
                                    x1Var3.T = org.telegram.messenger.dd.L0(2131754460, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131754466, null), new qv(7, u50Var, user));
                                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                } else {
                                    x1Var3.T = org.telegram.messenger.dd.L0(2131752566, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                }
                                u50Var.showDialog(x1Var3);
                                return;
                            }
                        }
                        u50Var.getMessagesController().U3(user, !u50Var.T, false);
                    } else if (object instanceof TLRPC.Chat) {
                        u50Var.getMessagesController().N3((TLRPC.Chat) object, !u50Var.T);
                    }
                    org.telegram.ui.Components.s20 s20Var6 = new org.telegram.ui.Components.s20(u50Var.f.r.getContext(), object);
                    u50Var.h.a(s20Var6);
                    s20Var6.setOnClickListener(u50Var);
                }
                u50Var.x0();
                if (u50Var.T || u50Var.S) {
                    org.telegram.messenger.i0.J3(u50Var.f.r);
                } else {
                    u50Var.p0();
                }
                if (u50Var.f.r.length() > 0) {
                    u50Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void e0(u50 u50Var) {
        if (u50Var.F == null) {
            return;
        }
        u50Var.c.a(!u50Var.Z.i(), true);
    }

    public static void f0(u50 u50Var, Canvas canvas, RectF rectF, Paint paint) {
        hi.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !org.telegram.messenger.uz.f() || (fVar = u50Var.q0) == null) {
            return;
        }
        fVar.e(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.at.I2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // hh.d
    public final View S() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10;
        int i11 = 0;
        this.T = false;
        this.S = false;
        this.a0.clear();
        this.Z.b();
        this.b0 = null;
        boolean z10 = this.R;
        int i12 = 1;
        int i13 = this.M;
        int i14 = 2;
        if (i13 == 2) {
            this.E = true;
        } else {
            this.E = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z11 = this.P;
        boolean z12 = this.O;
        boolean z13 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i13 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748302, null));
        } else if (!z10) {
            int i15 = this.U;
            if (z12) {
                if (i15 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750806, null));
                } else if (i15 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131754267, null));
                }
            } else if (!z11) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(i13 == 0 ? 2131748290 : 2131748303, null));
            } else if (i15 == 2) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750730, null));
            } else if (i15 == 1) {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748306, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748304, null));
            }
        } else if (this.H != 0) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752526, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131749509, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 25));
        this.f = new org.telegram.ui.Components.h10(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        m50 m50Var = new m50(this, context, this.currentAccount);
        this.h = m50Var;
        m50Var.setDelegate(new i50(this, i11));
        this.h.getSpansContainer().setOnClickListener(new j50(this, i12));
        m50 m50Var2 = this.h;
        this.Z = m50Var2.b;
        this.a0 = m50Var2.c;
        w0();
        int i16 = 4;
        this.f.r.setOnEditorActionListener(new ha(this, i16));
        this.f.r.setOnKeyListener(new n50(i11, this));
        this.f.r.addTextChangedListener(new n0(this, 8));
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            u0(arrayList, this.j0, this.k0);
        }
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.x = false;
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, zzVar, 1, null);
        this.s = ew0Var;
        ew0Var.addView(zzVar);
        this.s.e(true, false);
        this.s.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.r = new s4.a0(1, false);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.n = uk0Var;
        uk0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.uk0 uk0Var2 = this.n;
        s50 s50Var = new s50(this, context);
        this.w = s50Var;
        uk0Var2.setAdapter(s50Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(org.telegram.messenger.dd.X ? 1 : 2);
        org.telegram.ui.Components.uk0 uk0Var3 = this.n;
        float f7 = -this.a;
        l0Var.addView(uk0Var3, w7.b6.d(-1, -1.0f, org.telegram.messenger.at.E1, 0.0f, f7, 0.0f, f7));
        l0Var.addView(this.s);
        this.n.setOnItemClickListener(new mg.q0(17, this, context));
        this.n.setOnScrollListener(new h3(this, 14));
        org.telegram.ui.Components.uk0 uk0Var4 = this.n;
        uk0Var4.W1 = true;
        uk0Var4.X1 = 0;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.D = f10Var;
        if (z11 || z12 || z10) {
            f10Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
            c2Var.l = org.telegram.messenger.at.K2;
            c2Var.invalidateSelf();
            this.D.c.setImageDrawable(c2Var);
        }
        if (!z13) {
            l0Var.addView(this.D, org.telegram.ui.Components.f10.b());
        }
        this.D.setOnClickListener(new j50(this, i14));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        int i17 = 3;
        if (z13) {
            this.F = new jg.a3(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, this.resourceProvider);
            this.F.addView(view, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
            this.F.addView(linearLayout, w7.b6.e(-1, -2, 87));
            vh.d dVar = new vh.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131749490, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.b6.q(-1, 48, 1.0f, org.telegram.messenger.at.E1, 0, 0, 6, 0));
            dVar.setOnClickListener(new j50(this, i17));
            vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.L0(2131749491, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.b6.q(-1, 48, 1.0f, org.telegram.messenger.at.E1, 6, 0, 0, 0));
            dVar2.setOnClickListener(new j50(this, i16));
            i10 = -1;
            l0Var.addView(this.F, w7.b6.e(-1, -2, 87));
            l0();
        } else {
            i10 = -1;
        }
        x0();
        ih.c cVar = new ih.c(this, context);
        this.d = cVar;
        l0Var.addView(cVar, w7.b6.e(i10, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f, w7.b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.uk0 uk0Var5 = this.n;
        Objects.requireNonNull(uk0Var5);
        this.r0 = new tg.j(uk0Var5, l0Var, new l50(uk0Var5, 0));
        this.n.D0(new k50(this, i17));
        kg.f0 f0Var = new kg.f0(context, this.parentLayout);
        this.e = f0Var;
        ((fe.b) f0Var.c).a(false, false);
        l0Var.addView(this.e, w7.b6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        View view2 = this.fragmentView;
        i50 i50Var = new i50(this, i17);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(view2, i50Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.O) {
            s50 s50Var = this.w;
            if (s50Var != null) {
                s50Var.f();
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.at.r) {
            if (i10 == org.telegram.messenger.at.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i12 = org.telegram.messenger.wp.D8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.n.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.j4) {
                    ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y6));
        if (this.d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        tg.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.p0) == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(48.0f);
        int L2 = org.telegram.messenger.i0.L(48.0f) + this.c0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + L2;
        RectF rectF = this.t0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f7 = -L;
        rectF.inset(0.0f, f7);
        if (this.F != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.u0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f7);
        }
        fVar.g((this.F == null || this.c.e <= 0.0f) ? 1 : 2, this.s0);
        fVar.e(this.r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(boolean z10) {
        boolean z11;
        int i10 = 1;
        if (this.e0) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < this.Z.m(); i11++) {
                hashSet.add(Long.valueOf(this.Z.j(i11)));
            }
            boolean z12 = this.g0;
            boolean z13 = this.X == null;
            HashSet hashSet2 = this.f0;
            if (z12 != z13) {
                if (this.h0 != (this.Y == null) && hashSet.size() == hashSet2.size()) {
                    z11 = false;
                    if (!z11) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            if (!hashSet2.contains(l4)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        if (z10) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String L0 = org.telegram.messenger.dd.L0(2131743752, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.dd.L0(2131746785, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new i50(this, i10));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new i50(this, 2));
                            showDialog(x1Var);
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
        jg.a3 a3Var = this.F;
        if (a3Var == null) {
            return;
        }
        float f7 = this.c.e;
        a3Var.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(12.0f));
        this.F.setAlpha(f7);
        this.F.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // hh.d
    public final void m(r0.j1 j1Var) {
        this.n0 = j1Var.a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.f10 f10Var = this.D;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.m0, this.n0));
        }
    }

    public final void n0() {
        if (this.n.Y0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((org.telegram.messenger.i0.L(76.0f) + this.m0) * this.c.e);
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(i10 + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int z10 = org.telegram.messenger.m5.z(i10, this.n.getMeasuredHeight(), L);
        Rect rect = this.o0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.n.setClipBounds(rect);
    }

    public final void o0() {
        int L = this.Q ? org.telegram.messenger.i0.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(r3 + 48) + ((int) this.b.f), 0, org.telegram.messenger.i0.L(this.a) + this.m0 + L);
        this.s.setPadding(0, 0, 0, this.m0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (k0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (s20Var.D) {
            this.b0 = null;
            this.h.c(s20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.s20 s20Var2 = this.b0;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.b0 = s20Var;
        s20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.O);
        getNotificationCenter().c(this, org.telegram.messenger.at.r);
        getNotificationCenter().c(this, org.telegram.messenger.at.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.O);
        getNotificationCenter().n(this, org.telegram.messenger.at.r);
        getNotificationCenter().n(this, org.telegram.messenger.at.R);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.h10 h10Var = this.f;
            if (h10Var != null) {
                h10Var.updateColors();
            }
            org.telegram.ui.Components.f10 f10Var = this.D;
            if (f10Var != null) {
                f10Var.updateColors();
            }
            y0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0() {
        long j10;
        int childCount = this.n.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.n.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) childAt;
                Object object = j4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        j4Var.c(this.X != null, true);
                        j4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        j4Var.c(this.Y != null, true);
                        j4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar == null || hVar.h(j10) < 0) {
                        j4Var.c(this.Z.h(j10) >= 0, true);
                        j4Var.setCheckBoxEnabled(true);
                    } else {
                        j4Var.c(true, false);
                        j4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((org.telegram.ui.Cells.z3) childAt).a((this.X == null && this.Z.i()) ? "" : org.telegram.messenger.dd.L0(2131751458, null), new j50(this, i10));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void r0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().Z1(Long.valueOf(this.Z.j(i11))));
        }
        p50 p50Var = this.y;
        if (p50Var != null) {
            p50Var.g(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean i10 = this.Z.i();
        boolean z10 = this.R;
        int i11 = this.M;
        if (!i10 || i11 == 2 || !z10) {
            long j10 = this.G;
            int i12 = 1;
            if (!z10) {
                if (i11 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i13 = 0; i13 < this.Z.m(); i13++) {
                        arrayList.add(getMessagesController().p1(getMessagesController().Z1(Long.valueOf(this.Z.j(i13)))));
                    }
                    org.telegram.messenger.wp messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.g1(j10);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.rj(messagesController, tL_channels_inviteToChannel, j10, 6));
                    }
                    getNotificationCenter().k(org.telegram.messenger.at.t, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new un(bundle), true);
                    return true;
                }
                if (this.E) {
                    if (z10) {
                        r0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < this.Z.m(); i14++) {
                        arrayList2.add(Long.valueOf(this.Z.j(i14)));
                    }
                    if (this.O || this.P) {
                        q50 q50Var = this.x;
                        if (q50Var != null) {
                            q50Var.a(arrayList2, this.X != null, this.Y != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new b60(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = org.telegram.messenger.dd.G(this.Z.m(), "AddManyMembersAlertTitle", new Object[0]);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = G;
                StringBuilder sb2 = new StringBuilder();
                for (int i16 = 0; i16 < this.Z.m(); i16++) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.Z.j(i16)));
                    if (Z1 != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                        sb2.append("**");
                    }
                }
                org.telegram.messenger.wp messagesController2 = getMessagesController();
                if (j10 == 0) {
                    j10 = this.H;
                }
                TLRPC.Chat L0 = messagesController2.L0(Long.valueOf(j10));
                if (this.Z.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(this.Z.m(), "AddManyMembersAlertNamesText", L0 != null ? L0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.Z.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), indexOf, format.length() + indexOf, 33);
                    }
                    x1Var.T = spannableStringBuilder;
                } else {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754399, sb2, L0 != null ? L0.title : ""));
                }
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                if (!org.telegram.messenger.w3.T(L0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                    c2VarArr[0].setMultiline(true);
                    if (this.Z.m() == 1) {
                        c2VarArr[0].e(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754393, org.telegram.messenger.i20.j(getMessagesController().Z1(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.dd.L0(2131754398, null), "", true, false, false);
                    }
                    c2VarArr[0].setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                    linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new t10(c2VarArr, i12));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754486, null), new qv(8, this, c2VarArr));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                showDialog(x1Var);
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.s20 s20Var;
        org.telegram.ui.Components.s20 s20Var2;
        HashSet hashSet = this.f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.g0 = z10;
        this.h0 = z11;
        m50 m50Var = this.h;
        if (m50Var == null) {
            this.i0 = arrayList;
            this.j0 = z10;
            this.k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.s20 s20Var3 = new org.telegram.ui.Components.s20(getParentActivity(), "premium");
            this.X = s20Var3;
            this.h.a(s20Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (s20Var = this.X) != null) {
            m50Var.c(s20Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.s20 s20Var4 = new org.telegram.ui.Components.s20(getParentActivity(), "miniApps");
            this.Y = s20Var4;
            this.h.a(s20Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (s20Var2 = this.Y) != null) {
            this.h.c(s20Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            Object L0 = longValue < 0 ? getMessagesController().L0(Long.valueOf(-longValue)) : getMessagesController().Z1(l4);
            if (L0 != null) {
                org.telegram.ui.Components.s20 s20Var5 = new org.telegram.ui.Components.s20(getParentActivity(), L0);
                this.h.a(s20Var5);
                s20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.k10 k10Var = this.h.d;
        AnimatorSet animatorSet = k10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            k10Var.a.setupEndValues();
            k10Var.a.cancel();
        }
        org.telegram.messenger.i0.a4(this.n);
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                l0();
                n0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        o0();
        org.telegram.ui.Components.h10 h10Var = this.f;
        fe.f fVar2 = this.b;
        h10Var.setTranslationY(fVar2.f);
        n0();
        this.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((fe.b) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    public final void v0(int i10) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.i0.K(this.n, new org.telegram.ui.Components.qq(this, i10, 10));
    }

    public final void w0() {
        s50 s50Var;
        org.telegram.ui.ActionBar.n0 n0Var = this.f.r;
        if (n0Var == null) {
            return;
        }
        if (this.M == 2) {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131754396, null));
            return;
        }
        if (this.R || ((s50Var = this.w) != null && s50Var.G == 0)) {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131745786, null));
            return;
        }
        if (this.O || this.P) {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131745785, null));
        } else if (this.Q) {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131748301, null));
        } else {
            n0Var.setHint(org.telegram.messenger.dd.L0(2131745612, null));
        }
    }

    public final void x0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.dd.G(this.Z.m(), "Members", new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(org.telegram.messenger.dd.a0(null, null, 2131748634, org.telegram.messenger.dd.G(i12 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.dd.J0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 == 2 || !z11) {
            return;
        }
        if (this.E && this.a0.isEmpty()) {
            this.D.e(false, true);
            this.E = false;
        } else {
            if (this.E || this.a0.isEmpty()) {
                return;
            }
            this.D.e(true, true);
            this.E = true;
        }
    }

    public final void y0() {
        try {
            org.telegram.ui.Components.uk0 uk0Var = this.n;
            if (uk0Var != null) {
                uk0Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            m50 m50Var = this.h;
            if (m50Var == null || m50Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i10 = 0; i10 < spansContainer.getChildCount(); i10++) {
                View childAt = spansContainer.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.s20) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void s0(HashSet hashSet) {
    }

    @Override // hh.d
    public final /* synthetic */ void Q() {
    }

    @Override // hh.d
    public final /* synthetic */ void x() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
