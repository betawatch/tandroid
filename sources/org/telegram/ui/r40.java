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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class r40 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, qe.b, View.OnClickListener, sh.c {
    public org.telegram.ui.Components.l00 E;
    public boolean F;
    public ci.l1 G;
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
    public org.telegram.ui.Components.y10 Y;
    public org.telegram.ui.Components.y10 Z;
    public final int a;
    public a0.h a0;
    public final qe.c b;
    public ArrayList b0;
    public final qe.a c;
    public org.telegram.ui.Components.y10 c0;
    public ei.e3 d;
    public int d0;
    public gi.n5 e;
    public org.telegram.ui.Components.hc0 e0;
    public org.telegram.ui.Components.n00 f;
    public boolean f0;
    public final HashSet g0;
    public j40 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public org.telegram.ui.Components.tj0 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final eh.g q0;
    public u4.b0 r;
    public final si.f r0;
    public org.telegram.ui.Components.zu0 s;
    public eh.k s0;
    public final ArrayList t0;
    public final RectF u0;
    public final RectF v0;
    public p40 w;
    public n40 x;
    public m40 y;

    public r40(Bundle bundle) {
        super(bundle);
        int i3 = Build.VERSION.SDK_INT;
        this.a = i3 >= 31 ? 48 : 0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b = new qe.c(3, this, xqVar, 350L);
        this.c = new qe.a(4, this, xqVar, 350L, false);
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
            this.L = getMessagesController().P6 - 1;
        } else {
            org.telegram.messenger.hp messagesController = getMessagesController();
            this.L = i10 == 0 ? messagesController.Y2 : messagesController.X2;
        }
        if (i3 >= 31) {
            this.q0 = new eh.g(false);
            this.r0 = new si.f(null);
        } else {
            this.q0 = null;
            this.r0 = null;
        }
    }

    public static void Z(r40 r40Var, Context context, View view, int i3) {
        long j10;
        int i10 = r40Var.L;
        long j11 = r40Var.I;
        p40 p40Var = r40Var.w;
        int i11 = 0;
        if (i3 == p40Var.x) {
            int i12 = r40Var.currentAccount;
            org.telegram.ui.ActionBar.e6 e6Var = r40Var.resourceProvider;
            h40 h40Var = new h40(r40Var, i11);
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
            s1Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new cg.j0(i12, s1Var, context, e6Var, h40Var, 5));
            return;
        }
        if (i3 == 0 && p40Var.G != 0 && !p40Var.n) {
            org.telegram.ui.Components.hc0 hc0Var = new org.telegram.ui.Components.hc0(context, r40Var, r40Var.J, r40Var.H, j11 != 0);
            r40Var.e0 = hc0Var;
            r40Var.showDialog(hc0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (h4Var.r) {
                org.telegram.ui.Components.y10 y10Var = r40Var.Y;
                if (y10Var == null) {
                    org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(r40Var.f.r.getContext(), "premium");
                    r40Var.Y = y10Var2;
                    r40Var.h.a(y10Var2);
                    r40Var.Y.setOnClickListener(r40Var);
                } else {
                    r40Var.h.c(y10Var);
                    r40Var.Y = null;
                }
                r40Var.p0();
                return;
            }
            if (h4Var.s) {
                org.telegram.ui.Components.y10 y10Var3 = r40Var.Z;
                if (y10Var3 == null) {
                    org.telegram.ui.Components.y10 y10Var4 = new org.telegram.ui.Components.y10(r40Var.f.r.getContext(), "miniapps");
                    r40Var.Z = y10Var4;
                    r40Var.h.a(y10Var4);
                    r40Var.Z.setOnClickListener(r40Var);
                } else {
                    r40Var.h.c(y10Var3);
                    r40Var.Z = null;
                }
                r40Var.p0();
                return;
            }
            Object object = h4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j10 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = r40Var.K;
            if (hVar == null || hVar.h(j10) < 0) {
                if (h4Var.P) {
                    int i13 = -r40Var.m0;
                    r40Var.m0 = i13;
                    org.telegram.messenger.g0.G3(i13, h4Var, null);
                    org.telegram.messenger.p2.E.a();
                    String p10 = j10 >= 0 ? org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(r40Var.currentAccount).a2(Long.valueOf(j10))) : "";
                    (org.telegram.messenger.hp.s1(r40Var.currentAccount).D3() ? org.telegram.ui.Components.fc.a0(r40Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10))) : org.telegram.ui.Components.fc.a0(r40Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10)), org.telegram.messenger.bd.M0(2131743769, null), new h40(r40Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.y10 y10Var5 = (org.telegram.ui.Components.y10) r40Var.a0.f(j10);
                if (y10Var5 != null) {
                    r40Var.h.c(y10Var5);
                } else {
                    if (i10 != 0 && r40Var.a0.m() == i10) {
                        return;
                    }
                    if (r40Var.N == 0 && r40Var.a0.m() == r40Var.getMessagesController().W2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r40Var.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                        s1Var2.S = M0;
                        s1Var2.U = org.telegram.messenger.bd.M0(2131745304, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        r40Var.showDialog(s1Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (r40Var.S && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.fc.a0(r40Var).t(org.telegram.messenger.bd.M0(2131753108, null), null).j();
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat M02 = r40Var.getMessagesController().M0(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r40Var.getParentActivity());
                                boolean w10 = org.telegram.messenger.t3.w(4, M02);
                                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
                                if (w10) {
                                    s1Var3.S = org.telegram.messenger.bd.M0(2131754461, null);
                                    s1Var3.U = org.telegram.messenger.bd.M0(2131754460, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754466, null), new org.telegram.ui.Components.i41(16, r40Var, user));
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                } else {
                                    s1Var3.U = org.telegram.messenger.bd.M0(2131752566, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                }
                                r40Var.showDialog(s1Var3);
                                return;
                            }
                        }
                        r40Var.getMessagesController().X3(user, !r40Var.U, false);
                    } else if (object instanceof TLRPC.Chat) {
                        r40Var.getMessagesController().Q3((TLRPC.Chat) object, !r40Var.U);
                    }
                    org.telegram.ui.Components.y10 y10Var6 = new org.telegram.ui.Components.y10(r40Var.f.r.getContext(), object);
                    r40Var.h.a(y10Var6);
                    y10Var6.setOnClickListener(r40Var);
                }
                r40Var.x0();
                if (r40Var.U || r40Var.T) {
                    org.telegram.messenger.g0.K3(r40Var.f.r);
                } else {
                    r40Var.p0();
                }
                if (r40Var.f.r.length() > 0) {
                    r40Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void e0(r40 r40Var) {
        if (r40Var.G == null) {
            return;
        }
        r40Var.c.a(!r40Var.a0.i(), true);
    }

    public static void f0(r40 r40Var, Canvas canvas, RectF rectF, Paint paint) {
        si.f fVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !org.telegram.messenger.az.f() || (fVar = r40Var.r0) == null) {
            return;
        }
        fVar.l(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(org.telegram.messenger.hs.I2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // sh.c
    public final View R() {
        return this.fragmentView;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 != 3) {
            if (i3 == 4) {
                l0();
                n0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        o0();
        org.telegram.ui.Components.n00 n00Var = this.f;
        qe.c cVar2 = this.b;
        n00Var.setTranslationY(cVar2.f);
        n0();
        this.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((qe.a) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3;
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
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752526, null));
        } else if (z13) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748296, null));
        } else if (!z10) {
            int i14 = this.V;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750806, null));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754269, null));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754267, null));
                }
            } else if (!z11) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(i12 == 0 ? 2131748281 : 2131748297, null));
            } else if (i14 == 2) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750730, null));
            } else if (i14 == 1) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748300, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748298, null));
            }
        } else if (this.I != 0) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752526, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131749508, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 5));
        this.f = new org.telegram.ui.Components.n00(context, this.resourceProvider);
        l0 l0Var = new l0(9, context, this);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        j40 j40Var = new j40(this, context, this.currentAccount);
        this.h = j40Var;
        j40Var.setDelegate(new f40(this, i10));
        this.h.getSpansContainer().setOnClickListener(new g40(this, i11));
        j40 j40Var2 = this.h;
        this.a0 = j40Var2.b;
        this.b0 = j40Var2.c;
        w0();
        int i15 = 4;
        this.f.r.setOnEditorActionListener(new ea(this, i15));
        this.f.r.setOnKeyListener(new k40(i10, this));
        this.f.r.addTextChangedListener(new n0(this, 8));
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            u0(arrayList, this.k0, this.l0);
        }
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(6);
        izVar.x = false;
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, izVar, 1, null);
        this.s = zu0Var;
        zu0Var.addView(izVar);
        this.s.e(true, false);
        this.s.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.r = new u4.b0(1, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.n = tj0Var;
        tj0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.tj0 tj0Var2 = this.n;
        p40 p40Var = new p40(this, context);
        this.w = p40Var;
        tj0Var2.setAdapter(p40Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        org.telegram.ui.Components.tj0 tj0Var3 = this.n;
        float f10 = -this.a;
        l0Var.addView(tj0Var3, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, f10, 0.0f, f10));
        l0Var.addView(this.s);
        this.n.setOnItemClickListener(new ei.q4(18, this, context));
        this.n.setOnScrollListener(new h3(this, 14));
        org.telegram.ui.Components.tj0 tj0Var4 = this.n;
        tj0Var4.X1 = true;
        tj0Var4.Y1 = 0;
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.E = l00Var;
        if (z11 || z12 || z10) {
            l00Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
            w1Var.l = org.telegram.messenger.hs.K2;
            w1Var.invalidateSelf();
            this.E.c.setImageDrawable(w1Var);
        }
        if (!z13) {
            l0Var.addView(this.E, org.telegram.ui.Components.l00.b());
        }
        this.E.setOnClickListener(new g40(this, i13));
        this.E.e(this.F, false);
        this.E.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        int i16 = 3;
        if (z13) {
            this.G = new ci.l1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.resourceProvider);
            this.G.addView(view, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
            this.G.addView(linearLayout, b8.mf.e(-1, -2, 87));
            gi.d dVar = new gi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749489, null));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, b8.mf.q(-1, 48, 1.0f, org.telegram.messenger.hs.E1, 0, 0, 6, 0));
            dVar.setOnClickListener(new g40(this, i16));
            gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131749490, null));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, b8.mf.q(-1, 48, 1.0f, org.telegram.messenger.hs.E1, 6, 0, 0, 0));
            dVar2.setOnClickListener(new g40(this, i15));
            i3 = -1;
            l0Var.addView(this.G, b8.mf.e(-1, -2, 87));
            l0();
        } else {
            i3 = -1;
        }
        x0();
        ei.e3 e3Var = new ei.e3(this, context);
        this.d = e3Var;
        l0Var.addView(e3Var, b8.mf.e(i3, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f, b8.mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.tj0 tj0Var5 = this.n;
        Objects.requireNonNull(tj0Var5);
        this.s0 = new eh.k(tj0Var5, l0Var, new i40(tj0Var5, 0));
        this.n.D0(new h40(this, i16));
        gi.n5 n5Var = new gi.n5(context, this.parentLayout);
        this.e = n5Var;
        ((qe.a) n5Var.c).a(false, false);
        l0Var.addView(this.e, b8.mf.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.i1.d.add(this);
        }
        View view2 = this.fragmentView;
        f40 f40Var = new f40(this, i16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, f40Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O) {
            p40 p40Var = this.w;
            if (p40Var != null) {
                p40Var.f();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.r) {
            if (i3 == org.telegram.messenger.hs.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i11 = org.telegram.messenger.hp.C8;
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        eh.g gVar;
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
        int i3 = 1;
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
                            String M0 = org.telegram.messenger.bd.M0(2131743736, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = org.telegram.messenger.bd.M0(2131746778, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new f40(this, i3));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new f40(this, 2));
                            showDialog(s1Var);
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
        ci.l1 l1Var = this.G;
        if (l1Var == null) {
            return;
        }
        float f10 = this.c.e;
        l1Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(12.0f));
        this.G.setAlpha(f10);
        this.G.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // sh.c
    public final void m(r0.k1 k1Var) {
        this.o0 = k1Var.a.f(8).d;
        m0();
    }

    public final void m0() {
        org.telegram.ui.Components.l00 l00Var = this.E;
        if (l00Var != null) {
            l00Var.setTranslationY(-Math.max(this.n0, this.o0));
        }
    }

    public final void n0() {
        if (this.n.Y0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((org.telegram.messenger.g0.L(76.0f) + this.n0) * this.c.e);
        int i3 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(i3 + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int z10 = org.telegram.messenger.k5.z(i3, this.n.getMeasuredHeight(), L);
        Rect rect = this.p0;
        rect.set(0, measuredHeight, measuredWidth, z10);
        this.n.setClipBounds(rect);
    }

    public final void o0() {
        int L = this.R ? org.telegram.messenger.g0.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(r3 + 48) + ((int) this.b.f), 0, org.telegram.messenger.g0.L(this.a) + this.n0 + L);
        this.s.setPadding(0, 0, 0, this.n0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (k0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        if (y10Var.E) {
            this.c0 = null;
            this.h.c(y10Var);
            x0();
            p0();
            return;
        }
        org.telegram.ui.Components.y10 y10Var2 = this.c0;
        if (y10Var2 != null) {
            y10Var2.a();
        }
        this.c0 = y10Var;
        y10Var.b();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.O);
        getNotificationCenter().c(this, org.telegram.messenger.hs.r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.R);
        getUserConfig().t();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.O);
        getNotificationCenter().n(this, org.telegram.messenger.hs.r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.R);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.n00 n00Var = this.f;
            if (n00Var != null) {
                n00Var.updateColors();
            }
            org.telegram.ui.Components.l00 l00Var = this.E;
            if (l00Var != null) {
                l00Var.updateColors();
            }
            y0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        long j10;
        int childCount = this.n.getChildCount();
        int i3 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.Y != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        h4Var.c(this.Z != null, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.K;
                    if (hVar == null || hVar.h(j10) < 0) {
                        h4Var.c(this.a0.h(j10) >= 0, true);
                        h4Var.setCheckBoxEnabled(true);
                    } else {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.x3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((org.telegram.ui.Cells.x3) childAt).a((this.Y == null && this.a0.i()) ? "" : org.telegram.messenger.bd.M0(2131751458, null), new g40(this, i3));
                }
            }
        }
    }

    public final HashSet q0() {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < this.a0.m(); i3++) {
            hashSet.add(Long.valueOf(this.a0.j(i3)));
        }
        return hashSet;
    }

    public final void r0(int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.a0.m(); i10++) {
            arrayList.add(getMessagesController().a2(Long.valueOf(this.a0.j(i10))));
        }
        m40 m40Var = this.y;
        if (m40Var != null) {
            m40Var.h(i3, arrayList);
        }
        finishFragment();
    }

    public final boolean t0() {
        boolean i3 = this.a0.i();
        boolean z10 = this.S;
        int i10 = this.N;
        if (!i3 || i10 == 2 || !z10) {
            long j10 = this.H;
            int i11 = 1;
            if (!z10) {
                if (i10 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < this.a0.m(); i12++) {
                        arrayList.add(getMessagesController().q1(getMessagesController().a2(Long.valueOf(this.a0.j(i12)))));
                    }
                    org.telegram.messenger.hp messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.h1(j10);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new org.telegram.messenger.fj(messagesController, tL_channels_inviteToChannel, j10, 6));
                    }
                    getNotificationCenter().k(org.telegram.messenger.hs.t, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new wm(bundle), true);
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
                        n40 n40Var = this.x;
                        if (n40Var != null) {
                            n40Var.a(arrayList2, this.Y != null, this.Z != null);
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
                    presentFragment(new y40(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = org.telegram.messenger.bd.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = G;
                StringBuilder sb2 = new StringBuilder();
                for (int i15 = 0; i15 < this.a0.m(); i15++) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.a0.j(i15)));
                    if (a22 != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                        sb2.append("**");
                    }
                }
                org.telegram.messenger.hp messagesController2 = getMessagesController();
                if (j10 == 0) {
                    j10 = this.I;
                }
                TLRPC.Chat M0 = messagesController2.M0(Long.valueOf(j10));
                if (this.a0.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(this.a0.m(), "AddManyMembersAlertNamesText", M0 != null ? M0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.a0.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                    }
                    s1Var.U = spannableStringBuilder;
                } else {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754399, sb2, M0 != null ? M0.title : ""));
                }
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                if (!org.telegram.messenger.t3.T(M0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, getParentActivity(), this.resourceProvider);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2VarArr[0].setMultiline(true);
                    if (this.a0.m() == 1) {
                        c2VarArr[0].e(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754393, org.telegram.messenger.l10.j(getMessagesController().a2(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.bd.M0(2131754398, null), "", true, false, false);
                    }
                    c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new q00(c2VarArr, i11));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754486, null), new org.telegram.ui.Components.i41(17, this, c2VarArr));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                showDialog(s1Var);
                return true;
            }
        }
        return false;
    }

    public final void u0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.y10 y10Var;
        org.telegram.ui.Components.y10 y10Var2;
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.h0 = z10;
        this.i0 = z11;
        j40 j40Var = this.h;
        if (j40Var == null) {
            this.j0 = arrayList;
            this.k0 = z10;
            this.l0 = z11;
            return;
        }
        if (z10 && this.Y == null) {
            org.telegram.ui.Components.y10 y10Var3 = new org.telegram.ui.Components.y10(getParentActivity(), "premium");
            this.Y = y10Var3;
            this.h.a(y10Var3);
            this.Y.setOnClickListener(this);
        } else if (!z10 && (y10Var = this.Y) != null) {
            j40Var.c(y10Var);
            this.Y = null;
        }
        if (z11 && this.Z == null) {
            org.telegram.ui.Components.y10 y10Var4 = new org.telegram.ui.Components.y10(getParentActivity(), "miniApps");
            this.Z = y10Var4;
            this.h.a(y10Var4);
            this.Z.setOnClickListener(this);
        } else if (!z11 && (y10Var2 = this.Z) != null) {
            this.h.c(y10Var2);
            this.Z = null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            Object M0 = longValue < 0 ? getMessagesController().M0(Long.valueOf(-longValue)) : getMessagesController().a2(l10);
            if (M0 != null) {
                org.telegram.ui.Components.y10 y10Var5 = new org.telegram.ui.Components.y10(getParentActivity(), M0);
                this.h.a(y10Var5);
                y10Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.q00 q00Var = this.h.d;
        AnimatorSet animatorSet = q00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            q00Var.a.setupEndValues();
            q00Var.a.cancel();
        }
        org.telegram.messenger.g0.b4(this.n);
    }

    public final void v0(int i3) {
        if (this.isPaused) {
            return;
        }
        org.telegram.messenger.g0.K(this.n, new org.telegram.ui.Components.o2(this, i3, 15));
    }

    public final void w0() {
        p40 p40Var;
        bh.g gVar = this.f.r;
        if (gVar == null) {
            return;
        }
        if (this.N == 2) {
            gVar.setHint(org.telegram.messenger.bd.M0(2131754396, null));
            return;
        }
        if (this.S || ((p40Var = this.w) != null && p40Var.H == 0)) {
            gVar.setHint(org.telegram.messenger.bd.M0(2131745779, null));
            return;
        }
        if (this.P || this.Q) {
            gVar.setHint(org.telegram.messenger.bd.M0(2131745778, null));
        } else if (this.R) {
            gVar.setHint(org.telegram.messenger.bd.M0(2131748295, null));
        } else {
            gVar.setHint(org.telegram.messenger.bd.M0(2131745605, null));
        }
    }

    public final void x0() {
        boolean z10 = this.P;
        int i3 = this.N;
        boolean z11 = this.S;
        if (!z10 && !this.Q && !z11) {
            if (i3 == 2) {
                this.actionBar.setSubtitle(org.telegram.messenger.bd.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i10 = this.a0.i();
                int i11 = this.L;
                if (i10) {
                    this.actionBar.setSubtitle(org.telegram.messenger.bd.a0(null, null, 2131748627, org.telegram.messenger.bd.G(i11 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(org.telegram.messenger.bd.K0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i3 == 2 || !z11) {
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
            org.telegram.ui.Components.tj0 tj0Var = this.n;
            if (tj0Var != null) {
                tj0Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            j40 j40Var = this.h;
            if (j40Var == null || j40Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i3 = 0; i3 < spansContainer.getChildCount(); i3++) {
                View childAt = spansContainer.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Components.y10) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void s0(HashSet hashSet) {
    }

    @Override // sh.c
    public final /* synthetic */ void P() {
    }

    @Override // sh.c
    public final /* synthetic */ void w() {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
