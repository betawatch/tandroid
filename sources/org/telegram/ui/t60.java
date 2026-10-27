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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class t60 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, oe.d, View.OnClickListener, rh.d {
    public boolean E;
    public bi.t1 F;
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
    public org.telegram.ui.Components.x30 X;
    public org.telegram.ui.Components.x30 Y;
    public a0.h Z;
    public final int a;
    public ArrayList a0;
    public final oe.e b;
    public org.telegram.ui.Components.x30 b0;
    public final oe.b c;
    public int c0;
    public di.h3 d;
    public org.telegram.ui.Components.ue0 d0;
    public fi.f6 e;
    public boolean e0;
    public org.telegram.ui.Components.m20 f;
    public final HashSet f0;
    public boolean g0;
    public l60 h;
    public boolean h0;
    public ArrayList i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public org.telegram.ui.Components.nm0 n;
    public int n0;
    public final Rect o0;
    public final ch.f p0;
    public final hh.d q0;
    public s4.c0 r;
    public ch.j r0;
    public org.telegram.ui.Components.fy0 s;
    public final ArrayList s0;
    public final RectF t0;
    public final RectF u0;
    public r60 v;
    public p60 w;
    public o60 x;
    public org.telegram.ui.Components.j20 y;

    public t60(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.b = new oe.e(3, this, dsVar, 350L);
        this.c = new oe.b(4, this, dsVar, 350L, false);
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
            this.K = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            MessagesController messagesController = getMessagesController();
            this.K = i11 == 0 ? messagesController.maxMegagroupCount : messagesController.maxBroadcastCount;
        }
        if (i10 >= 31) {
            this.p0 = new ch.f();
            this.q0 = new hh.d(null);
        } else {
            this.p0 = null;
            this.q0 = null;
        }
    }

    public static void V(t60 t60Var, Context context, View view, int i10) {
        long j10;
        int i11 = t60Var.K;
        long j11 = t60Var.H;
        r60 r60Var = t60Var.v;
        int i12 = 0;
        if (i10 == r60Var.w) {
            int i13 = t60Var.currentAccount;
            org.telegram.ui.ActionBar.u6 u6Var = t60Var.resourceProvider;
            j60 j60Var = new j60(t60Var, i12);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
            e2Var.r(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i13).sendRequest(createconferencecall, new ag.p0(i13, e2Var, context, u6Var, j60Var, 6));
            return;
        }
        if (i10 == 0 && r60Var.F != 0 && !r60Var.n) {
            org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(context, t60Var, t60Var.I, t60Var.G, j11 != 0);
            t60Var.d0 = ue0Var;
            t60Var.showDialog(ue0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (k4Var.r) {
                org.telegram.ui.Components.x30 x30Var = t60Var.X;
                if (x30Var == null) {
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(t60Var.f.r.getContext(), "premium");
                    t60Var.X = x30Var2;
                    t60Var.h.a(x30Var2);
                    t60Var.X.setOnClickListener(t60Var);
                } else {
                    t60Var.h.c(x30Var);
                    t60Var.X = null;
                }
                t60Var.l0();
                return;
            }
            if (k4Var.s) {
                org.telegram.ui.Components.x30 x30Var3 = t60Var.Y;
                if (x30Var3 == null) {
                    org.telegram.ui.Components.x30 x30Var4 = new org.telegram.ui.Components.x30(t60Var.f.r.getContext(), "miniapps");
                    t60Var.Y = x30Var4;
                    t60Var.h.a(x30Var4);
                    t60Var.Y.setOnClickListener(t60Var);
                } else {
                    t60Var.h.c(x30Var3);
                    t60Var.Y = null;
                }
                t60Var.l0();
                return;
            }
            Object object = k4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j10 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = t60Var.J;
            if (hVar == null || hVar.h(j10) < 0) {
                if (k4Var.O) {
                    int i14 = -t60Var.l0;
                    t60Var.l0 = i14;
                    AndroidUtilities.shakeViewSpring(k4Var, i14);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(t60Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(t60Var.currentAccount).premiumFeaturesBlocked() ? org.telegram.ui.Components.wc.b0(t60Var).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.wc.b0(t60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new j60(t60Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.x30 x30Var5 = (org.telegram.ui.Components.x30) t60Var.Z.f(j10);
                if (x30Var5 != null) {
                    t60Var.h.c(x30Var5);
                } else {
                    if (i11 != 0 && t60Var.Z.m() == i11) {
                        return;
                    }
                    if (t60Var.M == 0 && t60Var.Z.m() == t60Var.getMessagesController().maxGroupCount) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t60Var.getParentActivity());
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
                        e2Var2.R = string;
                        e2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        t60Var.showDialog(e2Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (t60Var.R && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.wc.b0(t60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat chat = t60Var.getMessagesController().getChat(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t60Var.getParentActivity());
                                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder2.a;
                                if (canAddAdmins) {
                                    e2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                    e2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.voip.k1(14, t60Var, user));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    e2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                }
                                t60Var.showDialog(e2Var3);
                                return;
                            }
                        }
                        t60Var.getMessagesController().putUser(user, !t60Var.T);
                    } else if (object instanceof TLRPC.Chat) {
                        t60Var.getMessagesController().putChat((TLRPC.Chat) object, !t60Var.T);
                    }
                    org.telegram.ui.Components.x30 x30Var6 = new org.telegram.ui.Components.x30(t60Var.f.r.getContext(), object);
                    t60Var.h.a(x30Var6);
                    x30Var6.setOnClickListener(t60Var);
                }
                t60Var.t0();
                if (t60Var.T || t60Var.S) {
                    AndroidUtilities.showKeyboard(t60Var.f.r);
                } else {
                    t60Var.l0();
                }
                if (t60Var.f.r.length() > 0) {
                    t60Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void a0(t60 t60Var) {
        if (t60Var.F == null) {
            return;
        }
        t60Var.c.a(!t60Var.Z.i(), true);
    }

    public static void b0(t60 t60Var, Canvas canvas, RectF rectF, Paint paint) {
        hh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (dVar = t60Var.q0) == null) {
            return;
        }
        dVar.w(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                h0();
                j0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        k0();
        org.telegram.ui.Components.m20 m20Var = this.f;
        oe.e eVar2 = this.b;
        m20Var.setTranslationY(eVar2.f);
        j0();
        this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((oe.b) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // rh.d
    public final View O() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 0;
        this.T = false;
        this.S = false;
        this.a0.clear();
        this.Z.b();
        this.b0 = null;
        boolean z10 = this.R;
        int i11 = 1;
        int i12 = this.M;
        int i13 = 2;
        if (i12 == 2) {
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
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (!z10) {
            int i14 = this.U;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (!z11) {
                this.actionBar.setTitle(LocaleController.getString(i12 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            } else if (i14 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            } else if (i14 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
            }
        } else if (this.H != 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
        }
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, i11));
        this.f = new org.telegram.ui.Components.m20(context, this.resourceProvider);
        k0 k0Var = new k0(this, context, 7);
        this.fragmentView = k0Var;
        k0Var.setFocusableInTouchMode(true);
        k0Var.setDescendantFocusability(131072);
        l60 l60Var = new l60(this, context, this.currentAccount);
        this.h = l60Var;
        l60Var.setDelegate(new h60(this, i10));
        this.h.getSpansContainer().setOnClickListener(new i60(this, i11));
        l60 l60Var2 = this.h;
        this.Z = l60Var2.b;
        this.a0 = l60Var2.c;
        s0();
        int i15 = 4;
        this.f.r.setOnEditorActionListener(new la(this, i15));
        this.f.r.setOnKeyListener(new m60(i10, this));
        this.f.r.addTextChangedListener(new m0(this, 6));
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            q0(arrayList, this.j0, this.k0);
        }
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(6);
        c10Var.w = false;
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, c10Var, 1, null);
        this.s = fy0Var;
        fy0Var.addView(c10Var);
        this.s.e(true, false);
        this.s.d.setText(LocaleController.getString(R.string.NoResult));
        this.r = new s4.c0(1, false);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.n = nm0Var;
        nm0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.nm0 nm0Var2 = this.n;
        r60 r60Var = new r60(this, context);
        this.v = r60Var;
        nm0Var2.setAdapter(r60Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.nm0 nm0Var3 = this.n;
        float f7 = -this.a;
        k0Var.addView(nm0Var3, org.telegram.ui.Components.kb1.h(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        k0Var.addView(this.s);
        this.n.setOnItemClickListener(new di.x4(17, this, context));
        this.n.setOnScrollListener(new i3(this, 14));
        org.telegram.ui.Components.nm0 nm0Var4 = this.n;
        nm0Var4.W1 = true;
        nm0Var4.X1 = 0;
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.y = j20Var;
        if (z11 || z12 || z10) {
            j20Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
            j2Var.l = 180;
            j2Var.invalidateSelf();
            this.y.c.setImageDrawable(j2Var);
        }
        if (!z13) {
            k0Var.addView(this.y, org.telegram.ui.Components.j20.b());
        }
        this.y.setOnClickListener(new i60(this, i13));
        this.y.e(this.E, false);
        this.y.setContentDescription(LocaleController.getString(R.string.Next));
        int i16 = 3;
        if (z13) {
            this.F = new bi.t1(this, context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, this.resourceProvider);
            this.F.addView(view, org.telegram.ui.Components.kb1.h(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -2, 87));
            fi.d dVar = new fi.d(context, this.resourceProvider, true);
            dVar.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.i(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, org.telegram.ui.Components.kb1.t(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new i60(this, i16));
            fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
            dVar2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, org.telegram.ui.Components.kb1.t(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new i60(this, i15));
            k0Var.addView(this.F, org.telegram.ui.Components.kb1.i(-1, -2, 87));
            h0();
        }
        t0();
        di.h3 h3Var = new di.h3(this, context);
        this.d = h3Var;
        k0Var.addView(h3Var, org.telegram.ui.Components.kb1.i(-1, 0, 48));
        k0Var.addView(this.actionBar);
        k0Var.addView(this.f, org.telegram.ui.Components.kb1.h(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.h);
        org.telegram.ui.Components.nm0 nm0Var5 = this.n;
        Objects.requireNonNull(nm0Var5);
        this.r0 = new ch.j(nm0Var5, k0Var, new k60(nm0Var5, 0));
        this.n.D0(new j60(this, i16));
        fi.f6 f6Var = new fi.f6(context, this.parentLayout);
        this.e = f6Var;
        ((oe.b) f6Var.c).a(false, false);
        k0Var.addView(this.e, org.telegram.ui.Components.kb1.i(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        View view2 = this.fragmentView;
        h60 h60Var = new h60(this, i16);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, h60Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            r60 r60Var = this.v;
            if (r60Var != null) {
                r60Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.k4) {
                    ((org.telegram.ui.Cells.k4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        ch.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.p0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + this.c0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + dp2;
        RectF rectF = this.t0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f7 = -dp;
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
    public final boolean g0(boolean z10) {
        boolean z11;
        if (this.e0) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < this.Z.m(); i10++) {
                hashSet.add(Long.valueOf(this.Z.j(i10)));
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
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new h60(this, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new h60(this, 2));
                            showDialog(alertDialog$Builder.a);
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

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.n, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y6));
        if (this.d0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    public final void h0() {
        bi.t1 t1Var = this.F;
        if (t1Var == null) {
            return;
        }
        float f7 = this.c.e;
        t1Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        this.F.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    public final void i0() {
        org.telegram.ui.Components.j20 j20Var = this.y;
        if (j20Var != null) {
            j20Var.setTranslationY(-Math.max(this.m0, this.n0));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.n.Z0()) {
            this.n.setClipBounds(null);
            return;
        }
        int dp = (int) ((AndroidUtilities.dp(76.0f) + this.m0) * this.c.e);
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int C = org.telegram.messenger.t.C(i10, this.n.getMeasuredHeight(), dp);
        Rect rect = this.o0;
        rect.set(0, measuredHeight, measuredWidth, C);
        this.n.setClipBounds(rect);
    }

    @Override // rh.d
    public final void k(r0.k1 k1Var) {
        this.n0 = k1Var.a.f(8).d;
        i0();
    }

    public final void k0() {
        int dp = this.Q ? AndroidUtilities.dp(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r3 + 48) + ((int) this.b.f), 0, AndroidUtilities.dp(this.a) + this.m0 + dp);
        this.s.setPadding(0, 0, 0, this.m0);
    }

    public final void l0() {
        long j10;
        int childCount = this.n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) childAt;
                Object object = k4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        k4Var.c(this.X != null, true);
                        k4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        k4Var.c(this.Y != null, true);
                        k4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.J;
                    if (hVar == null || hVar.h(j10) < 0) {
                        k4Var.c(this.Z.h(j10) >= 0, true);
                        k4Var.setCheckBoxEnabled(true);
                    } else {
                        k4Var.c(true, false);
                        k4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    ((org.telegram.ui.Cells.z3) childAt).a((this.X == null && this.Z.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new i60(this, 0));
                }
            }
        }
    }

    public final HashSet m0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void n0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.Z.j(i11))));
        }
        o60 o60Var = this.x;
        if (o60Var != null) {
            o60Var.f(i10, arrayList);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (g0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (x30Var.y) {
            this.b0 = null;
            this.h.c(x30Var);
            t0();
            l0();
            return;
        }
        org.telegram.ui.Components.x30 x30Var2 = this.b0;
        if (x30Var2 != null) {
            x30Var2.a();
        }
        this.b0 = x30Var;
        x30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.m20 m20Var = this.f;
            if (m20Var != null) {
                m20Var.updateColors();
            }
            org.telegram.ui.Components.j20 j20Var = this.y;
            if (j20Var != null) {
                j20Var.updateColors();
            }
            u0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean p0() {
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
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.Z.j(i13))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j10, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new wn(bundle), true);
                    return true;
                }
                if (this.E) {
                    if (z10) {
                        n0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < this.Z.m(); i14++) {
                        arrayList2.add(Long.valueOf(this.Z.j(i14)));
                    }
                    if (this.O || this.P) {
                        p60 p60Var = this.w;
                        if (p60Var != null) {
                            p60Var.b(arrayList2, this.X != null, this.Y != null);
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
                    presentFragment(new z60(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = formatPluralString;
                StringBuilder sb2 = new StringBuilder();
                for (int i16 = 0; i16 < this.Z.m(); i16++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z.j(i16)));
                    if (user != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb2.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                if (j10 == 0) {
                    j10 = this.H;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (this.Z.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.Z.m(), chat != null ? chat.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.Z.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                    }
                    e2Var.T = spannableStringBuilder;
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb2, chat != null ? chat.title : ""));
                }
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1, this.resourceProvider);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                    y1VarArr[0].setMultiline(true);
                    if (this.Z.m() == 1) {
                        y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                    } else {
                        y1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(y1VarArr[0], org.telegram.ui.Components.kb1.r(-1, -2));
                    y1VarArr[0].setOnClickListener(new k20(y1VarArr, i12));
                    alertDialog$Builder.o(linearLayout);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Add), new org.telegram.ui.Components.voip.k1(15, this, y1VarArr));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(e2Var);
                return true;
            }
        }
        return false;
    }

    public final void q0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.x30 x30Var;
        org.telegram.ui.Components.x30 x30Var2;
        HashSet hashSet = this.f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.g0 = z10;
        this.h0 = z11;
        l60 l60Var = this.h;
        if (l60Var == null) {
            this.i0 = arrayList;
            this.j0 = z10;
            this.k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.x30 x30Var3 = new org.telegram.ui.Components.x30(getParentActivity(), "premium");
            this.X = x30Var3;
            this.h.a(x30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (x30Var = this.X) != null) {
            l60Var.c(x30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.x30 x30Var4 = new org.telegram.ui.Components.x30(getParentActivity(), "miniApps");
            this.Y = x30Var4;
            this.h.a(x30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (x30Var2 = this.Y) != null) {
            this.h.c(x30Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            Object chat = longValue < 0 ? getMessagesController().getChat(Long.valueOf(-longValue)) : getMessagesController().getUser(l4);
            if (chat != null) {
                org.telegram.ui.Components.x30 x30Var5 = new org.telegram.ui.Components.x30(getParentActivity(), chat);
                this.h.a(x30Var5);
                x30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.p20 p20Var = this.h.d;
        AnimatorSet animatorSet = p20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p20Var.a.setupEndValues();
            p20Var.a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.n);
    }

    public final void r0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.n, new org.telegram.ui.Components.h2(this, i10, 17));
    }

    public final void s0() {
        r60 r60Var;
        fi.c2 c2Var = this.f.r;
        if (c2Var == null) {
            return;
        }
        if (this.M == 2) {
            c2Var.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.R || ((r60Var = this.v) != null && r60Var.G == 0)) {
            c2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.O || this.P) {
            c2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.Q) {
            c2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            c2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void t0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.Z.m(), new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.Q ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.Z.m()), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 == 2 || !z11) {
            return;
        }
        if (this.E && this.a0.isEmpty()) {
            this.y.e(false, true);
            this.E = false;
        } else {
            if (this.E || this.a0.isEmpty()) {
                return;
            }
            this.y.e(true, true);
            this.E = true;
        }
    }

    public final void u0() {
        try {
            org.telegram.ui.Components.nm0 nm0Var = this.n;
            if (nm0Var != null) {
                nm0Var.A1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            l60 l60Var = this.h;
            if (l60Var == null || l60Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i10 = 0; i10 < spansContainer.getChildCount(); i10++) {
                View childAt = spansContainer.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.x30) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // rh.d
    public final /* synthetic */ void M() {
    }

    @Override // rh.d
    public final /* synthetic */ void t() {
    }

    public void o0(HashSet hashSet) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
