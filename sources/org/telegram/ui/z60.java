package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class z60 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, xd.b, View.OnClickListener, dh.d {
    public boolean B;
    public eg.t3 C;
    public final long D;
    public final long E;
    public TLRPC.ChatFull F;
    public a0.h G;
    public final int H;
    public String I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public boolean P;
    public boolean Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public org.telegram.ui.Components.p30 U;
    public org.telegram.ui.Components.p30 V;
    public a0.h W;
    public ArrayList X;
    public org.telegram.ui.Components.p30 Y;
    public int Z;
    public final int a;
    public org.telegram.ui.Components.fe0 a0;
    public final xd.c b;
    public boolean b0;
    public final xd.a c;
    public final HashSet c0;
    public oh.b3 d;
    public boolean d0;
    public fg.i0 e;
    public boolean e0;
    public org.telegram.ui.Components.d20 f;
    public ArrayList f0;
    public boolean g0;
    public r60 h;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public final Rect l0;
    public final og.e m0;
    public org.telegram.ui.Components.tl0 n;
    public final tg.d n0;
    public og.k o0;
    public final ArrayList p0;
    public final RectF q0;
    public f2.j0 r;
    public final RectF r0;
    public org.telegram.ui.Components.ax0 s;
    public x60 v;
    public v60 w;
    public u60 x;
    public org.telegram.ui.Components.a20 y;

    public z60(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.b = new xd.c(3, this, prVar, 350L);
        this.c = new xd.a(4, this, prVar, 350L, false);
        this.W = new a0.h();
        this.X = new ArrayList();
        this.c0 = new HashSet();
        this.i0 = -4;
        this.l0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.p0 = arrayList;
        RectF rectF = new RectF();
        this.q0 = rectF;
        RectF rectF2 = new RectF();
        this.r0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i11 = bundle.getInt("chatType", 0);
        this.J = i11;
        this.K = bundle.getBoolean("forImport", false);
        boolean z4 = bundle.getBoolean("isAlwaysShare", false);
        this.L = z4;
        boolean z10 = bundle.getBoolean("isNeverShare", false);
        this.M = z10;
        boolean z11 = bundle.getBoolean("isCall", false);
        this.N = z11;
        boolean z12 = bundle.getBoolean("addToGroup", false);
        this.O = z12;
        this.R = bundle.getInt("chatAddType", 0);
        this.S = bundle.getBoolean("allowPremium", false);
        this.T = bundle.getBoolean("allowMiniapps", false);
        this.D = bundle.getLong("chatId");
        this.E = bundle.getLong("channelId");
        if (z4 || z10 || z12) {
            this.H = 0;
        } else if (z11) {
            this.H = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            MessagesController messagesController = getMessagesController();
            this.H = i11 == 0 ? messagesController.maxMegagroupCount : messagesController.maxBroadcastCount;
        }
        if (i10 >= 31) {
            this.m0 = new og.e(false);
            this.n0 = new tg.d(null);
        } else {
            this.m0 = null;
            this.n0 = null;
        }
    }

    public static void U(z60 z60Var, Context context, View view, int i10) {
        long j10;
        int i11 = z60Var.H;
        long j11 = z60Var.E;
        x60 x60Var = z60Var.v;
        int i12 = 0;
        if (i10 == x60Var.w) {
            int i13 = z60Var.currentAccount;
            org.telegram.ui.ActionBar.g6 g6Var = z60Var.resourceProvider;
            p60 p60Var = new p60(z60Var, i12);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            d2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i13).sendRequest(createconferencecall, new lf.i0(i13, d2Var, context, g6Var, p60Var, 5));
            return;
        }
        if (i10 == 0 && x60Var.C != 0 && !x60Var.n) {
            org.telegram.ui.Components.fe0 fe0Var = new org.telegram.ui.Components.fe0(context, z60Var, z60Var.F, z60Var.D, j11 != 0);
            z60Var.a0 = fe0Var;
            z60Var.showDialog(fe0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.r) {
                org.telegram.ui.Components.p30 p30Var = z60Var.U;
                if (p30Var == null) {
                    org.telegram.ui.Components.p30 p30Var2 = new org.telegram.ui.Components.p30(z60Var.f.r.getContext(), "premium");
                    z60Var.U = p30Var2;
                    z60Var.h.a(p30Var2);
                    z60Var.U.setOnClickListener(z60Var);
                } else {
                    z60Var.h.c(p30Var);
                    z60Var.U = null;
                }
                z60Var.k0();
                return;
            }
            if (g4Var.s) {
                org.telegram.ui.Components.p30 p30Var3 = z60Var.V;
                if (p30Var3 == null) {
                    org.telegram.ui.Components.p30 p30Var4 = new org.telegram.ui.Components.p30(z60Var.f.r.getContext(), "miniapps");
                    z60Var.V = p30Var4;
                    z60Var.h.a(p30Var4);
                    z60Var.V.setOnClickListener(z60Var);
                } else {
                    z60Var.h.c(p30Var3);
                    z60Var.V = null;
                }
                z60Var.k0();
                return;
            }
            Object object = g4Var.getObject();
            boolean z4 = object instanceof TLRPC.User;
            if (z4) {
                j10 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = z60Var.G;
            if (hVar == null || hVar.h(j10) < 0) {
                if (g4Var.L) {
                    int i14 = -z60Var.i0;
                    z60Var.i0 = i14;
                    AndroidUtilities.shakeViewSpring(g4Var, i14);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(z60Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(z60Var.currentAccount).premiumFeaturesBlocked() ? org.telegram.ui.Components.qc.a0(z60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.qc.a0(z60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new p60(z60Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.p30 p30Var5 = (org.telegram.ui.Components.p30) z60Var.W.f(j10);
                if (p30Var5 != null) {
                    z60Var.h.c(p30Var5);
                } else {
                    if (i11 != 0 && z60Var.W.m() == i11) {
                        return;
                    }
                    if (z60Var.J == 0 && z60Var.W.m() == z60Var.getMessagesController().maxGroupCount) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z60Var.getParentActivity());
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                        d2Var2.O = string;
                        d2Var2.Q = LocaleController.getString(R.string.SoftUserLimitAlert);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        z60Var.showDialog(d2Var2);
                        return;
                    }
                    if (z4) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (z60Var.O && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.qc.a0(z60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z60Var.getParentActivity());
                                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
                                if (canAddAdmins) {
                                    d2Var3.O = LocaleController.getString(R.string.AddBotAdminAlert);
                                    d2Var3.Q = LocaleController.getString(R.string.AddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new rs(11, z60Var, user));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    d2Var3.Q = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                }
                                z60Var.showDialog(d2Var3);
                                return;
                            }
                        }
                        z60Var.getMessagesController().putUser(user, !z60Var.Q);
                    } else if (object instanceof TLRPC.Chat) {
                        z60Var.getMessagesController().putChat((TLRPC.Chat) object, !z60Var.Q);
                    }
                    org.telegram.ui.Components.p30 p30Var6 = new org.telegram.ui.Components.p30(z60Var.f.r.getContext(), object);
                    z60Var.h.a(p30Var6);
                    p30Var6.setOnClickListener(z60Var);
                }
                z60Var.s0();
                if (z60Var.Q || z60Var.P) {
                    AndroidUtilities.showKeyboard(z60Var.f.r);
                } else {
                    z60Var.k0();
                }
                if (z60Var.f.r.length() > 0) {
                    z60Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void Z(z60 z60Var) {
        if (z60Var.C == null) {
            return;
        }
        z60Var.c.a(!z60Var.W.i(), true);
    }

    public static void a0(z60 z60Var, Canvas canvas, RectF rectF, Paint paint) {
        tg.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (dVar = z60Var.n0) == null) {
            return;
        }
        dVar.I(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                g0();
                i0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        j0();
        org.telegram.ui.Components.d20 d20Var = this.f;
        xd.c cVar2 = this.b;
        d20Var.setTranslationY(cVar2.e);
        i0();
        this.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.e);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((xd.a) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // dh.d
    public final View N() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10 = 0;
        this.Q = false;
        this.P = false;
        this.X.clear();
        this.W.b();
        this.Y = null;
        boolean z4 = this.O;
        int i11 = 1;
        int i12 = this.J;
        int i13 = 2;
        if (i12 == 2) {
            this.B = true;
        } else {
            this.B = !z4;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.I);
        boolean z10 = this.M;
        boolean z11 = this.L;
        boolean z12 = this.N;
        if (!isEmpty) {
            this.actionBar.setTitle(this.I);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (!z4) {
            int i14 = this.R;
            if (z11) {
                if (i14 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (!z10) {
                this.actionBar.setTitle(LocaleController.getString(i12 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            } else if (i14 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            } else if (i14 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
            }
        } else if (this.E != 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
        }
        int i15 = 13;
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, i15));
        this.f = new org.telegram.ui.Components.d20(context, this.resourceProvider);
        l0 l0Var = new l0(this, context, 7);
        this.fragmentView = l0Var;
        l0Var.setFocusableInTouchMode(true);
        l0Var.setDescendantFocusability(131072);
        r60 r60Var = new r60(this, context, this.currentAccount);
        this.h = r60Var;
        r60Var.setDelegate(new o60(this, i10));
        this.h.getSpansContainer().setOnClickListener(new q60(this, i10));
        r60 r60Var2 = this.h;
        this.W = r60Var2.b;
        this.X = r60Var2.c;
        r0();
        this.f.r.setOnEditorActionListener(new ha(this, 4));
        this.f.r.setOnKeyListener(new s60(i10, this));
        this.f.r.addTextChangedListener(new n0(this, 6));
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            p0(arrayList, this.g0, this.h0);
        }
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.w = false;
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, u00Var, 1, null);
        this.s = ax0Var;
        ax0Var.addView(u00Var);
        this.s.e(true, false);
        this.s.d.setText(LocaleController.getString(R.string.NoResult));
        l0Var.addView(this.s);
        this.r = new f2.j0(1, false);
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.n = tl0Var;
        tl0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.tl0 tl0Var2 = this.n;
        x60 x60Var = new x60(this, context);
        this.v = x60Var;
        tl0Var2.setAdapter(x60Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.tl0 tl0Var3 = this.n;
        float f10 = -this.a;
        l0Var.addView(tl0Var3, k7.c6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        this.n.setOnItemClickListener(new hg.v0(17, this, context));
        this.n.setOnScrollListener(new l3(this, i15));
        org.telegram.ui.Components.tl0 tl0Var4 = this.n;
        tl0Var4.V1 = true;
        tl0Var4.W1 = 0;
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.y = a20Var;
        if (z10 || z11 || z4) {
            a20Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
            i2Var.l = 180;
            i2Var.invalidateSelf();
            this.y.c.setImageDrawable(i2Var);
        }
        if (!z12) {
            l0Var.addView(this.y, org.telegram.ui.Components.a20.b());
        }
        this.y.setOnClickListener(new q60(this, i11));
        this.y.e(this.B, false);
        this.y.setContentDescription(LocaleController.getString(R.string.Next));
        int i16 = 3;
        if (z12) {
            this.C = new eg.t3(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
            this.C.addView(view, k7.c6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.C.addView(linearLayout, k7.c6.e(-1, -2, 87));
            qh.d dVar = new qh.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, k7.c6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new q60(this, i13));
            qh.d dVar2 = new qh.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.oq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, k7.c6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new q60(this, i16));
            l0Var.addView(this.C, k7.c6.e(-1, -2, 87));
            g0();
        }
        s0();
        oh.b3 b3Var = new oh.b3(this, context);
        this.d = b3Var;
        l0Var.addView(b3Var, k7.c6.e(-1, 0, 48));
        l0Var.addView(this.actionBar);
        l0Var.addView(this.f, k7.c6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        l0Var.addView(this.h);
        org.telegram.ui.Components.tl0 tl0Var5 = this.n;
        Objects.requireNonNull(tl0Var5);
        this.o0 = new og.k(tl0Var5, l0Var, new us(tl0Var5, i10));
        this.n.C0(new p60(this, i16));
        fg.i0 i0Var = new fg.i0(context, this.parentLayout);
        this.e = i0Var;
        i0Var.b(false, false);
        l0Var.addView(this.e, k7.c6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.d1.d.add(this);
        }
        View view2 = this.fragmentView;
        o60 o60Var = new o60(this, i16);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view2, o60Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            x60 x60Var = this.v;
            if (x60Var != null) {
                x60Var.l();
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
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.m0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + this.Z;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + dp2;
        RectF rectF = this.q0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = -dp;
        rectF.inset(0.0f, f10);
        if (this.C != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.C.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.r0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f10);
        }
        eVar.g((this.C == null || this.c.e <= 0.0f) ? 1 : 2, this.p0);
        eVar.e(this.o0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(boolean z4) {
        boolean z10;
        if (this.b0) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < this.W.m(); i10++) {
                hashSet.add(Long.valueOf(this.W.j(i10)));
            }
            boolean z11 = this.d0;
            boolean z12 = this.U == null;
            HashSet hashSet2 = this.c0;
            if (z11 != z12) {
                if (this.e0 != (this.V == null) && hashSet.size() == hashSet2.size()) {
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
                        if (z4) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new o60(this, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new o60(this, 2));
                            showDialog(alertDialog$Builder.a);
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

    public final void g0() {
        eg.t3 t3Var = this.C;
        if (t3Var == null) {
            return;
        }
        float f10 = this.c.e;
        t3Var.setTranslationY((1.0f - f10) * AndroidUtilities.dp(12.0f));
        this.C.setAlpha(f10);
        this.C.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.k6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Zh));
        int i12 = org.telegram.ui.ActionBar.k6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.n6));
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        int i14 = org.telegram.ui.ActionBar.k6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.di));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.fe0 fe0Var = this.a0;
        if (fe0Var != null) {
            arrayList.addAll(fe0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.a20 a20Var = this.y;
        if (a20Var != null) {
            a20Var.setTranslationY(-Math.max(this.j0, this.k0));
        }
    }

    public final void i0() {
        if (this.n.Z0()) {
            this.n.setClipBounds(null);
            return;
        }
        int dp = (int) ((AndroidUtilities.dp(76.0f) + this.j0) * this.c.e);
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.b.e);
        int measuredWidth = this.n.getMeasuredWidth();
        int B = org.telegram.messenger.y3.B(i10, this.n.getMeasuredHeight(), dp);
        Rect rect = this.l0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.n.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int dp = this.N ? AndroidUtilities.dp(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r3 + 48) + ((int) this.b.e), 0, AndroidUtilities.dp(this.a) + this.j0 + dp);
        this.s.setPadding(0, 0, 0, this.j0);
    }

    @Override // dh.d
    public final void k(r0.m1 m1Var) {
        this.k0 = m1Var.a.f(8).d;
        h0();
    }

    public final void k0() {
        long j10;
        int childCount = this.n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z4 = object instanceof String;
                    if (z4 && "premium".equalsIgnoreCase((String) object)) {
                        g4Var.c(this.U != null, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z4 && "miniapps".equalsIgnoreCase((String) object)) {
                        g4Var.c(this.V != null, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.G;
                    if (hVar == null || hVar.h(j10) < 0) {
                        g4Var.c(this.W.h(j10) >= 0, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.u3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    ((org.telegram.ui.Cells.u3) childAt).b((this.U == null && this.W.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new q60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.W.m(); i10++) {
            hashSet.add(Long.valueOf(this.W.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.W.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.W.j(i11))));
        }
        u60 u60Var = this.x;
        if (u60Var != null) {
            u60Var.i(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean i10 = this.W.i();
        boolean z4 = this.O;
        int i11 = this.J;
        if (!i10 || i11 == 2 || !z4) {
            long j10 = this.D;
            int i12 = 1;
            if (!z4) {
                if (i11 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i13 = 0; i13 < this.W.m(); i13++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.W.j(i13))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j10, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new xn(bundle), true);
                    return true;
                }
                if (this.B) {
                    if (z4) {
                        m0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < this.W.m(); i14++) {
                        arrayList2.add(Long.valueOf(this.W.j(i14)));
                    }
                    if (this.L || this.M) {
                        v60 v60Var = this.w;
                        if (v60Var != null) {
                            v60Var.b(arrayList2, this.U != null, this.V != null);
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
                    bundle2.putBoolean("forImport", this.K);
                    presentFragment(new f70(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.W.m(), new Object[0]);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = formatPluralString;
                StringBuilder sb = new StringBuilder();
                for (int i16 = 0; i16 < this.W.m(); i16++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.W.j(i16)));
                    if (user != null) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append("**");
                        sb.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                if (j10 == 0) {
                    j10 = this.E;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (this.W.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.W.m(), chat != null ? chat.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.W.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                    }
                    d2Var.Q = spannableStringBuilder;
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb, chat != null ? chat.title : ""));
                }
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                    z1VarArr[0].setMultiline(true);
                    if (this.W.m() == 1) {
                        z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.W.j(0)))))), "", true, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(z1VarArr[0], k7.c6.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new r20(z1VarArr, i12));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Add), new rs(12, this, z1VarArr));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(d2Var);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (f0(z4)) {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) view;
        if (p30Var.y) {
            this.Y = null;
            this.h.c(p30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.p30 p30Var2 = this.Y;
        if (p30Var2 != null) {
            p30Var2.a();
        }
        this.Y = p30Var;
        p30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void p0(ArrayList arrayList, boolean z4, boolean z10) {
        org.telegram.ui.Components.p30 p30Var;
        org.telegram.ui.Components.p30 p30Var2;
        HashSet hashSet = this.c0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.d0 = z4;
        this.e0 = z10;
        r60 r60Var = this.h;
        if (r60Var == null) {
            this.f0 = arrayList;
            this.g0 = z4;
            this.h0 = z10;
            return;
        }
        if (z4 && this.U == null) {
            org.telegram.ui.Components.p30 p30Var3 = new org.telegram.ui.Components.p30(getParentActivity(), "premium");
            this.U = p30Var3;
            this.h.a(p30Var3);
            this.U.setOnClickListener(this);
        } else if (!z4 && (p30Var = this.U) != null) {
            r60Var.c(p30Var);
            this.U = null;
        }
        if (z10 && this.V == null) {
            org.telegram.ui.Components.p30 p30Var4 = new org.telegram.ui.Components.p30(getParentActivity(), "miniApps");
            this.V = p30Var4;
            this.h.a(p30Var4);
            this.V.setOnClickListener(this);
        } else if (!z10 && (p30Var2 = this.V) != null) {
            this.h.c(p30Var2);
            this.V = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            Object chat = longValue < 0 ? getMessagesController().getChat(Long.valueOf(-longValue)) : getMessagesController().getUser(l10);
            if (chat != null) {
                org.telegram.ui.Components.p30 p30Var5 = new org.telegram.ui.Components.p30(getParentActivity(), chat);
                this.h.a(p30Var5);
                p30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.g20 g20Var = this.h.d;
        AnimatorSet animatorSet = g20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.a.setupEndValues();
            g20Var.a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.n, new org.telegram.ui.Components.jm(this, i10, 14));
    }

    public final void r0() {
        x60 x60Var;
        lg.f fVar = this.f.r;
        if (fVar == null) {
            return;
        }
        if (this.J == 2) {
            fVar.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.O || ((x60Var = this.v) != null && x60Var.D == 0)) {
            fVar.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.L || this.M) {
            fVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.N) {
            fVar.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            fVar.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void s0() {
        boolean z4 = this.L;
        int i10 = this.J;
        boolean z10 = this.O;
        if (!z4 && !this.M && !z10) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.W.m(), new Object[0]));
            } else {
                boolean i11 = this.W.i();
                int i12 = this.H;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.N ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.W.m()), Integer.valueOf(this.W.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 == 2 || !z10) {
            return;
        }
        if (this.B && this.X.isEmpty()) {
            this.y.e(false, true);
            this.B = false;
        } else {
            if (this.B || this.X.isEmpty()) {
                return;
            }
            this.y.e(true, true);
            this.B = true;
        }
    }

    @Override // dh.d
    public final /* synthetic */ void I() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override // dh.d
    public final /* synthetic */ void t() {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
