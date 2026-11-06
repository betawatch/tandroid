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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class w40 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, te.b, View.OnClickListener, rh.c {
    public org.telegram.ui.Components.p00 D;
    public boolean E;
    public bi.s1 F;
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
    public org.telegram.ui.Components.c20 X;
    public org.telegram.ui.Components.c20 Y;
    public a0.h Z;
    public final int a;
    public ArrayList a0;
    public final te.c b;
    public org.telegram.ui.Components.c20 b0;
    public final te.a c;
    public int c0;
    public di.b3 d;
    public org.telegram.ui.Components.mc0 d0;
    public fi.p5 e;
    public boolean e0;
    public org.telegram.ui.Components.r00 f;
    public final HashSet f0;
    public boolean g0;
    public o40 h;
    public boolean h0;
    public ArrayList i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public org.telegram.ui.Components.pj0 n;
    public int n0;
    public final Rect o0;
    public final dh.g p0;
    public final ri.f q0;
    public v4.b0 r;
    public dh.k r0;
    public org.telegram.ui.Components.av0 s;
    public final ArrayList s0;
    public final RectF t0;
    public final RectF u0;
    public u40 w;
    public s40 x;
    public r40 y;

    public w40(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b = new te.c(3, this, xqVar, 350L);
        this.c = new te.a(4, this, xqVar, 350L, false);
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
        int i10 = bundle.getInt("chatType", 0);
        this.M = i10;
        this.N = bundle.getBoolean("forImport", false);
        boolean z9 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z9;
        boolean z10 = bundle.getBoolean("isNeverShare", false);
        this.P = z10;
        boolean z11 = bundle.getBoolean("isCall", false);
        this.Q = z11;
        boolean z12 = bundle.getBoolean("addToGroup", false);
        this.R = z12;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (z9 || z10 || z12) {
            this.K = 0;
        } else if (z11) {
            this.K = getMessagesController().P6 - 1;
        } else {
            org.telegram.messenger.qp messagesController = getMessagesController();
            this.K = i10 == 0 ? messagesController.X2 : messagesController.W2;
        }
        if (i7 >= 31) {
            this.p0 = new dh.g(false);
            this.q0 = new ri.f(null);
        } else {
            this.p0 = null;
            this.q0 = null;
        }
    }

    public static void Z(w40 w40Var, Context context, View view, int i7) {
        long j3;
        int i10 = w40Var.K;
        long j10 = w40Var.H;
        u40 u40Var = w40Var.w;
        int i11 = 0;
        if (i7 == u40Var.x) {
            int i12 = w40Var.currentAccount;
            org.telegram.ui.ActionBar.f6 f6Var = w40Var.resourceProvider;
            m40 m40Var = new m40(w40Var, i11);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            u1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new bg.k0(i12, u1Var, context, f6Var, m40Var, 5));
            return;
        }
        if (i7 == 0 && u40Var.F != 0 && !u40Var.n) {
            org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(context, w40Var, w40Var.I, w40Var.G, j10 != 0);
            w40Var.d0 = mc0Var;
            w40Var.showDialog(mc0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.r) {
                org.telegram.ui.Components.c20 c20Var = w40Var.X;
                if (c20Var == null) {
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(w40Var.f.r.getContext(), "premium");
                    w40Var.X = c20Var2;
                    w40Var.h.a(c20Var2);
                    w40Var.X.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(c20Var);
                    w40Var.X = null;
                }
                w40Var.p0();
                return;
            }
            if (h4Var.s) {
                org.telegram.ui.Components.c20 c20Var3 = w40Var.Y;
                if (c20Var3 == null) {
                    org.telegram.ui.Components.c20 c20Var4 = new org.telegram.ui.Components.c20(w40Var.f.r.getContext(), "miniapps");
                    w40Var.Y = c20Var4;
                    w40Var.h.a(c20Var4);
                    w40Var.Y.setOnClickListener(w40Var);
                } else {
                    w40Var.h.c(c20Var3);
                    w40Var.Y = null;
                }
                w40Var.p0();
                return;
            }
            Object object = h4Var.getObject();
            boolean z9 = object instanceof TLRPC.User;
            if (z9) {
                j3 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j3 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = w40Var.J;
            if (hVar == null || hVar.h(j3) < 0) {
                if (h4Var.O) {
                    int i13 = -w40Var.l0;
                    w40Var.l0 = i13;
                    org.telegram.messenger.g0.G3(i13, h4Var, null);
                    org.telegram.messenger.p2.D.a();
                    String p10 = j3 >= 0 ? org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(w40Var.currentAccount).a2(Long.valueOf(j3))) : "";
                    (org.telegram.messenger.qp.s1(w40Var.currentAccount).D3() ? org.telegram.ui.Components.hc.a0(w40Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743761, p10))) : org.telegram.ui.Components.hc.a0(w40Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743761, p10)), org.telegram.messenger.hd.M0(2131743760, null), new m40(w40Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.c20 c20Var5 = (org.telegram.ui.Components.c20) w40Var.Z.f(j3);
                if (c20Var5 != null) {
                    w40Var.h.c(c20Var5);
                } else {
                    if (i10 != 0 && w40Var.Z.m() == i10) {
                        return;
                    }
                    if (w40Var.M == 0 && w40Var.Z.m() == w40Var.getMessagesController().V2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w40Var.getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.R = M0;
                        u1Var2.T = org.telegram.messenger.hd.M0(2131745295, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        w40Var.showDialog(u1Var2);
                        return;
                    }
                    if (z9) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (w40Var.R && user.bot) {
                            if (j10 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.hc.a0(w40Var).t(org.telegram.messenger.hd.M0(2131753108, null), null).j();
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            if (j10 != 0) {
                                TLRPC.Chat M02 = w40Var.getMessagesController().M0(Long.valueOf(j10));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w40Var.getParentActivity());
                                boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                if (w10) {
                                    u1Var3.R = org.telegram.messenger.hd.M0(2131754461, null);
                                    u1Var3.T = org.telegram.messenger.hd.M0(2131754460, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754466, null), new pu(6, w40Var, user));
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                } else {
                                    u1Var3.T = org.telegram.messenger.hd.M0(2131752566, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                }
                                w40Var.showDialog(u1Var3);
                                return;
                            }
                        }
                        w40Var.getMessagesController().X3(user, !w40Var.T, false);
                    } else if (object instanceof TLRPC.Chat) {
                        w40Var.getMessagesController().Q3((TLRPC.Chat) object, !w40Var.T);
                    }
                    org.telegram.ui.Components.c20 c20Var6 = new org.telegram.ui.Components.c20(w40Var.f.r.getContext(), object);
                    w40Var.h.a(c20Var6);
                    c20Var6.setOnClickListener(w40Var);
                }
                w40Var.x0();
                if (w40Var.T || w40Var.S) {
                    org.telegram.messenger.g0.K3(w40Var.f.r);
                } else {
                    w40Var.p0();
                }
                if (w40Var.f.r.length() > 0) {
                    w40Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void e0(w40 w40Var) {
        if (w40Var.F == null) {
            return;
        }
        w40Var.c.a(!w40Var.Z.i(), true);
    }

    public static void f0(w40 w40Var, Canvas canvas, RectF rectF, Paint paint) {
        ri.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !org.telegram.messenger.iz.f() || (fVar = w40Var.q0) == null) {
            return;
        }
        fVar.e(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.qs.I2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // rh.c
    public final View R() {
        return this.fragmentView;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
        org.telegram.ui.Components.r00 r00Var = this.f;
        te.c cVar2 = this.b;
        r00Var.setTranslationY(cVar2.f);
        n0();
        this.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((te.a) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7;
        int i10 = 0;
        this.T = false;
        this.S = false;
        this.a0.clear();
        this.Z.b();
        this.b0 = null;
        boolean z9 = this.R;
        int i11 = 1;
        int i12 = this.M;
        int i13 = 2;
        if (i12 == 2) {
            this.E = true;
        } else {
            this.E = !z9;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z10 = this.P;
        boolean z11 = this.O;
        boolean z12 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i12 == 2) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752526, null));
        } else if (z12) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748287, null));
        } else if (!z9) {
            int i14 = this.U;
            if (z11) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750806, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754267, null));
                }
            } else if (!z10) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(i12 == 0 ? 2131748272 : 2131748288, null));
            } else if (i14 == 2) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750730, null));
            } else if (i14 == 1) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748291, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748289, null));
            }
        } else if (this.H != 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752526, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131749499, null));
        }
        int i15 = 4;
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, i15));
        this.f = new org.telegram.ui.Components.r00(context, this.resourceProvider);
        k0 k0Var = new k0(9, context, this);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        o40 o40Var = new o40(this, context, this.currentAccount);
        this.h = o40Var;
        o40Var.setDelegate(new k40(this, i10));
        this.h.getSpansContainer().setOnClickListener(new l40(this, i11));
        o40 o40Var2 = this.h;
        this.Z = o40Var2.b;
        this.a0 = o40Var2.c;
        w0();
        this.f.r.setOnEditorActionListener(new fa(this, i15));
        this.f.r.setOnKeyListener(new p40(i10, this));
        this.f.r.addTextChangedListener(new m0(this, 8));
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            u0(arrayList, this.j0, this.k0);
        }
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(6);
        lzVar.x = false;
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, lzVar, 1, null);
        this.s = av0Var;
        av0Var.addView(lzVar);
        this.s.e(true, false);
        this.s.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        this.r = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.n = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.pj0 pj0Var2 = this.n;
        u40 u40Var = new u40(this, context);
        this.w = u40Var;
        pj0Var2.setAdapter(u40Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        org.telegram.ui.Components.pj0 pj0Var3 = this.n;
        float f10 = -this.a;
        k0Var.addView(pj0Var3, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, f10, 0.0f, f10));
        k0Var.addView(this.s);
        this.n.setOnItemClickListener(new di.p4(18, this, context));
        this.n.setOnScrollListener(new g3(this, 14));
        org.telegram.ui.Components.pj0 pj0Var4 = this.n;
        pj0Var4.W1 = true;
        pj0Var4.X1 = 0;
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.D = p00Var;
        if (z10 || z11 || z9) {
            p00Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.l = org.telegram.messenger.qs.K2;
            y1Var.invalidateSelf();
            this.D.c.setImageDrawable(y1Var);
        }
        if (!z12) {
            k0Var.addView(this.D, org.telegram.ui.Components.p00.b());
        }
        this.D.setOnClickListener(new l40(this, i13));
        this.D.e(this.E, false);
        this.D.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        int i16 = 3;
        if (z12) {
            this.F = new bi.s1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.resourceProvider);
            this.F.addView(view, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.F.addView(linearLayout, c8.ha.e(-1, -2, 87));
            fi.d dVar = new fi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749480, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, c8.ha.q(-1, 48, 1.0f, org.telegram.messenger.qs.E1, 0, 0, 6, 0));
            dVar.setOnClickListener(new l40(this, i16));
            fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749481, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, c8.ha.q(-1, 48, 1.0f, org.telegram.messenger.qs.E1, 6, 0, 0, 0));
            dVar2.setOnClickListener(new l40(this, i15));
            i7 = -1;
            k0Var.addView(this.F, c8.ha.e(-1, -2, 87));
            l0();
        } else {
            i7 = -1;
        }
        x0();
        di.b3 b3Var = new di.b3(this, context);
        this.d = b3Var;
        k0Var.addView(b3Var, c8.ha.e(i7, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f, c8.ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.pj0 pj0Var5 = this.n;
        Objects.requireNonNull(pj0Var5);
        this.r0 = new dh.k(pj0Var5, k0Var, new n40(pj0Var5, 0));
        this.n.D0(new m40(this, i16));
        fi.p5 p5Var = new fi.p5(context, this.parentLayout);
        this.e = p5Var;
        ((te.a) p5Var.c).a(false, false);
        k0Var.addView(this.e, c8.ha.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f1.d.add(this);
        }
        View view2 = this.fragmentView;
        k40 k40Var = new k40(this, i16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, k40Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            u40 u40Var = this.w;
            if (u40Var != null) {
                u40Var.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.r) {
            if (i7 == org.telegram.messenger.qs.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i11 = org.telegram.messenger.qp.C8;
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
        if (this.d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.p0) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + this.c0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + L2;
        RectF rectF = this.t0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = -L;
        rectF.inset(0.0f, f10);
        if (this.F != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.u0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f10);
        }
        gVar.g((this.F == null || this.c.e <= 0.0f) ? 1 : 2, this.s0);
        gVar.e(this.r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(boolean z9) {
        boolean z10;
        int i7 = 1;
        if (this.e0) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < this.Z.m(); i10++) {
                hashSet.add(Long.valueOf(this.Z.j(i10)));
            }
            boolean z11 = this.g0;
            boolean z12 = this.X == null;
            HashSet hashSet2 = this.f0;
            if (z11 != z12) {
                if (this.h0 != (this.Y == null) && hashSet.size() == hashSet2.size()) {
                    z10 = false;
                    if (!z10) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            if (!hashSet2.contains(l10)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    if (z10) {
                        if (z9) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String M0 = org.telegram.messenger.hd.M0(2131743727, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.hd.M0(2131746769, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new k40(this, i7));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747579, null), new k40(this, 2));
                            showDialog(u1Var);
                        }
                        return false;
                    }
                }
            }
            z10 = true;
            if (!z10) {
            }
            if (z10) {
            }
        }
        return true;
    }

    public final void l0() {
        bi.s1 s1Var = this.F;
        if (s1Var == null) {
            return;
        }
        float f10 = this.c.e;
        s1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.F.setAlpha(f10);
        this.F.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // rh.c
    public final void m(r0.k1 k1Var) {
        this.n0 = k1Var.a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.p00 p00Var = this.D;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.m0, this.n0));
        }
    }

    public final void n0() {
        if (this.n.Y0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((org.telegram.messenger.g0.L(76.0f) + this.m0) * this.c.e);
        int i7 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i7 + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int z9 = org.telegram.messenger.k5.z(i7, this.n.getMeasuredHeight(), L);
        Rect rect = this.o0;
        rect.set(0, measuredHeight, measuredWidth, z9);
        this.n.setClipBounds(rect);
    }

    public final void o0() {
        int L = this.Q ? org.telegram.messenger.g0.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(r3 + 48) + ((int) this.b.f), 0, org.telegram.messenger.g0.L(this.a) + this.m0 + L);
        this.s.setPadding(0, 0, 0, this.m0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (k0(z9)) {
            return super.onBackPressed(z9);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.b0 = null;
            this.h.c(c20Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.b0;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.b0 = c20Var;
        c20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.O);
        getNotificationCenter().c(this, org.telegram.messenger.qs.r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.O);
        getNotificationCenter().n(this, org.telegram.messenger.qs.r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.r00 r00Var = this.f;
            if (r00Var != null) {
                r00Var.updateColors();
            }
            org.telegram.ui.Components.p00 p00Var = this.D;
            if (p00Var != null) {
                p00Var.updateColors();
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
                    boolean z9 = object instanceof String;
                    if (z9 && "premium".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.X != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z9 && "miniapps".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.Y != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.h hVar = this.J;
                    if (hVar == null || hVar.h(j3) < 0) {
                        h4Var.c(this.Z.h(j3) >= 0, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((org.telegram.ui.Cells.x3) childAt).a((this.X == null && this.Z.i()) ? "" : org.telegram.messenger.hd.M0(2131751458, null), new l40(this, i7));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.Z.m(); i7++) {
            hashSet.add(Long.valueOf(this.Z.j(i7)));
        }
        return hashSet;
    }

    public final void r0(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            arrayList.add(getMessagesController().a2(Long.valueOf(this.Z.j(i10))));
        }
        r40 r40Var = this.y;
        if (r40Var != null) {
            r40Var.f(i7, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean i7 = this.Z.i();
        boolean z9 = this.R;
        int i10 = this.M;
        if (!i7 || i10 == 2 || !z9) {
            long j3 = this.G;
            int i11 = 1;
            if (!z9) {
                if (i10 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < this.Z.m(); i12++) {
                        arrayList.add(getMessagesController().q1(getMessagesController().a2(Long.valueOf(this.Z.j(i12)))));
                    }
                    org.telegram.messenger.qp messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.h1(j3);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.oj(messagesController, tL_channels_inviteToChannel, j3, 6));
                    }
                    getNotificationCenter().k(org.telegram.messenger.qs.t, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j3);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new an(bundle), true);
                    return true;
                }
                if (this.E) {
                    if (z9) {
                        r0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < this.Z.m(); i13++) {
                        arrayList2.add(Long.valueOf(this.Z.j(i13)));
                    }
                    if (this.O || this.P) {
                        s40 s40Var = this.x;
                        if (s40Var != null) {
                            s40Var.a(arrayList2, this.X != null, this.Y != null);
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
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new d50(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = org.telegram.messenger.hd.G(this.Z.m(), "AddManyMembersAlertTitle", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = G;
                StringBuilder sb2 = new StringBuilder();
                for (int i15 = 0; i15 < this.Z.m(); i15++) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.Z.j(i15)));
                    if (a22 != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                        sb2.append("**");
                    }
                }
                org.telegram.messenger.qp messagesController2 = getMessagesController();
                if (j3 == 0) {
                    j3 = this.H;
                }
                TLRPC.Chat M0 = messagesController2.M0(Long.valueOf(j3));
                if (this.Z.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(this.Z.m(), "AddManyMembersAlertNamesText", M0 != null ? M0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.Z.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                    }
                    u1Var.T = spannableStringBuilder;
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754399, sb2, M0 != null ? M0.title : ""));
                }
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                if (!org.telegram.messenger.t3.T(M0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2VarArr[0].setMultiline(true);
                    if (this.Z.m() == 1) {
                        c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754393, org.telegram.messenger.t10.j(getMessagesController().a2(Long.valueOf(this.Z.j(0))), true))), "", true, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.hd.M0(2131754398, null), "", true, false, false);
                    }
                    c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new y00(c2VarArr, i11));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754486, null), new pu(7, this, c2VarArr));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(u1Var);
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z9, boolean z10) {
        org.telegram.ui.Components.c20 c20Var;
        org.telegram.ui.Components.c20 c20Var2;
        HashSet hashSet = this.f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.g0 = z9;
        this.h0 = z10;
        o40 o40Var = this.h;
        if (o40Var == null) {
            this.i0 = arrayList;
            this.j0 = z9;
            this.k0 = z10;
            return;
        }
        if (z9 && this.X == null) {
            org.telegram.ui.Components.c20 c20Var3 = new org.telegram.ui.Components.c20(getParentActivity(), "premium");
            this.X = c20Var3;
            this.h.a(c20Var3);
            this.X.setOnClickListener(this);
        } else if (!z9 && (c20Var = this.X) != null) {
            o40Var.c(c20Var);
            this.X = null;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.c20 c20Var4 = new org.telegram.ui.Components.c20(getParentActivity(), "miniApps");
            this.Y = c20Var4;
            this.h.a(c20Var4);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (c20Var2 = this.Y) != null) {
            this.h.c(c20Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            Object M0 = longValue < 0 ? getMessagesController().M0(Long.valueOf(-longValue)) : getMessagesController().a2(l10);
            if (M0 != null) {
                org.telegram.ui.Components.c20 c20Var5 = new org.telegram.ui.Components.c20(getParentActivity(), M0);
                this.h.a(c20Var5);
                c20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.u00 u00Var = this.h.d;
        AnimatorSet animatorSet = u00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            u00Var.a.setupEndValues();
            u00Var.a.cancel();
        }
        org.telegram.messenger.g0.b4(this.n);
    }

    public final void v0(int i7) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.n, new org.telegram.ui.Components.r2(this, i7, 15));
    }

    public final void w0() {
        u40 u40Var;
        ah.i iVar = this.f.r;
        if (iVar == null) {
            return;
        }
        if (this.M == 2) {
            iVar.setHint(org.telegram.messenger.hd.M0(2131754396, null));
            return;
        }
        if (this.R || ((u40Var = this.w) != null && u40Var.G == 0)) {
            iVar.setHint(org.telegram.messenger.hd.M0(2131745770, null));
            return;
        }
        if (this.O || this.P) {
            iVar.setHint(org.telegram.messenger.hd.M0(2131745769, null));
        } else if (this.Q) {
            iVar.setHint(org.telegram.messenger.hd.M0(2131748286, null));
        } else {
            iVar.setHint(org.telegram.messenger.hd.M0(2131745596, null));
        }
    }

    public final void x0() {
        boolean z9 = this.O;
        int i7 = this.M;
        boolean z10 = this.R;
        if (!z9 && !this.P && !z10) {
            if (i7 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.Z.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.Z.i();
                int i11 = this.K;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.hd.a0(null, null, 2131748618, org.telegram.messenger.hd.G(i11 + (this.Q ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(this.Z.m(), "MembersCountSelected"), Integer.valueOf(this.Z.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i7 == 2 || !z10) {
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
            org.telegram.ui.Components.pj0 pj0Var = this.n;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            o40 o40Var = this.h;
            if (o40Var == null || o40Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i7 = 0; i7 < spansContainer.getChildCount(); i7++) {
                View childAt = spansContainer.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.c20) {
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
    public final /* synthetic */ void P() {
    }

    @Override // rh.c
    public final /* synthetic */ void w() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
