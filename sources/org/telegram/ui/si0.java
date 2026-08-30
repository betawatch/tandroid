package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class si0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public final di0 C;
    public final ki0 D;
    public final di0 E;
    public long F;
    public org.telegram.ui.Components.j5 G;
    public final li0 H;
    public final ci0 I;
    public final oi0 J;
    public final ArrayList K;
    public int L;
    public final a0.h M;
    public org.telegram.ui.Cells.t1 N;
    public int O;
    public org.telegram.ui.Components.ff P;
    public final Paint Q;
    public org.telegram.ui.Components.d R;
    public org.telegram.ui.Components.sd S;
    public org.telegram.ui.Components.lg T;
    public fi0 U;
    public int V;
    public ViewGroup W;
    public final ei0 X;
    public boolean Y;
    public float Z;
    public final Context a;
    public FrameLayout a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public gi0 b0;
    public final int c;
    public boolean c0;
    public lf.s0 d;
    public boolean d0;
    public i0.b e;
    public boolean e0;
    public Bitmap f;
    public final ih.j f0;
    public final sg.b g0;
    public BitmapShader h;
    public final ng.a h0;
    public RectF i0;
    public boolean j0;
    public boolean k0;
    public final int[] l0;
    public boolean m0;
    public Paint n;
    public boolean n0;
    public org.telegram.ui.Cells.t1 o0;
    public float p0;
    public float q0;
    public Matrix r;
    public final Rect r0;
    public boolean s;
    public ValueAnimator s0;
    public boolean t0;
    public org.telegram.ui.Cells.t1 u0;
    public boolean v;
    public org.telegram.ui.Components.k01 v0;
    public boolean w;
    public Paint w0;
    public boolean x;
    public boolean y;

    public si0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.c = i10;
        this.e = i0.b.e;
        this.K = new ArrayList();
        this.M = new a0.h();
        final int i11 = 1;
        this.Q = new Paint(1);
        this.l0 = new int[2];
        final int i12 = 0;
        this.n0 = false;
        this.r0 = new Rect();
        this.a = context;
        this.b = f6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.D1;
        this.d = launchActivity != null ? new lf.s0(launchActivity, true) : null;
        di0 di0Var = new di0(this, context, i11);
        this.C = di0Var;
        this.f0 = ih.j.d(1, di0Var, di0Var);
        di0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ai0
            public final /* synthetic */ si0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        di0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.bi0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                si0 si0Var = si0.this;
                if (si0Var.m0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(si0Var.P);
                AndroidUtilities.runOnUIThread(new yh0(si0Var, (EditText) view2, 0), 200L);
            }
        });
        sg.b bVar = new sg.b();
        this.g0 = bVar;
        ng.a aVar = new ng.a(bVar);
        this.h0 = aVar;
        aVar.d = new ug.i(di0Var);
        aVar.e = di0Var;
        ki0 ki0Var = new ki0(this, context, f6Var);
        this.D = ki0Var;
        ki0Var.setClipToPadding(false);
        di0Var.addView(ki0Var, k7.b6.e(-1, -1, 119));
        h hVar = new h(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(di0Var, hVar);
        li0 li0Var = new li0(this, context, f6Var);
        this.H = li0Var;
        li0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ai0
            public final /* synthetic */ si0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        li0Var.setOnItemClickListener(new j(this, 17));
        li0Var.setOnScrollListener(new l3(this, 19));
        li0Var.setItemAnimator(new ni0(null, li0Var, f6Var));
        oi0 oi0Var = new oi0(this);
        this.J = oi0Var;
        oi0Var.O = new pi0(this);
        li0Var.setLayoutManager(oi0Var);
        li0Var.i(new qi0());
        ci0 ci0Var = new ci0(this, context, f6Var);
        this.I = ci0Var;
        li0Var.setAdapter(ci0Var);
        li0Var.setVerticalScrollBarEnabled(false);
        li0Var.setOverScrollMode(2);
        ki0Var.addView(li0Var, k7.b6.c(-2.0f, -1));
        di0 di0Var2 = new di0(this, context, i12);
        this.E = di0Var2;
        di0Var.addView(di0Var2, k7.b6.c(-1.0f, -1));
        this.X = new ei0(this, di0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        lf.s0 s0Var = this.d;
        if (s0Var != null) {
            s0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.p2 p2Var) {
        mg.z zVar;
        if (this.b0 != null || p2Var == null) {
            return;
        }
        int i10 = this.c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.a0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.a0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        gi0 gi0Var = new gi0(5, this.c, getContext(), null, this.b);
        this.b0 = gi0Var;
        gi0Var.setClipChildren(false);
        this.b0.setClipToPadding(false);
        this.b0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.b0.setDelegate(new ii0(this, p2Var));
        this.b0.setTop(false);
        this.b0.setClipChildren(false);
        this.b0.setClipToPadding(false);
        this.b0.setVisibility(0);
        this.b0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.b0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.b0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.D.addView(this.a0, k7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.addView(this.b0, k7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b0.setScaleY(0.4f);
        this.b0.setScaleX(0.4f);
        this.b0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            t();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        gi0 gi0Var2 = this.b0;
        if (gi0Var2 != null && !gi0Var2.c1) {
            gi0Var2.c1 = true;
            gi0Var2.d1 = true;
            mg.d0 d0Var = gi0Var2.u0;
            if (d0Var != null && (zVar = d0Var.m) != null && !zVar.H1) {
                zVar.H1 = true;
                zVar.I1 = true;
                m51 m51Var = zVar.e0;
                if (m51Var != null) {
                    m51Var.invalidate();
                }
                b51 b51Var = zVar.f0;
                if (b51Var != null) {
                    b51Var.invalidate();
                }
            }
        }
        new ph.i3(this.C, false, new w3(this, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.c).hasAvailableEffects()) {
            t();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.n0) {
            return;
        }
        this.n0 = true;
        fi0 fi0Var = this.U;
        if (fi0Var != null) {
            fi0Var.invalidate();
        }
        org.telegram.ui.Components.lg lgVar = this.T;
        if (lgVar != null) {
            lgVar.invalidate();
        }
        e(new xh0(this, 2), false);
        this.C.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z4) {
        gi0 gi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = z4 && (viewGroup = this.W) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z10) {
            org.telegram.ui.ActionBar.p1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.W);
        }
        if (!z4 && (gi0Var = this.b0) != null && this.c0) {
            gi0Var.e();
            if (this.b0.getReactionsWindow() != null && this.b0.getReactionsWindow().a != null) {
                this.b0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.b0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.v = !z4;
        this.H.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, z4 ? 1.0f : 0.0f);
        this.s0 = ofFloat;
        ofFloat.addUpdateListener(new dg.b1(10, this, z10));
        this.s0.addListener(new org.telegram.ui.ActionBar.f(this, z4, z10, runnable));
        this.s0.setInterpolator(org.telegram.ui.Components.nr.h);
        this.s0.setDuration(350L);
        this.s0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l10 = l(messageObject);
        if (l10 == null) {
            g(messageObject);
            return;
        }
        l10.calculate();
        ArrayList<MessageObject> arrayList = l10.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            g(messageObject2);
        }
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.t1 t1Var;
        li0 li0Var = this.H;
        if (li0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= li0Var.getChildCount()) {
                t1Var = null;
                break;
            }
            View childAt = li0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                t1Var = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var.getMessageObject() == messageObject) {
                    break;
                }
            }
            i11++;
        }
        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (t1Var2 == null) {
            li0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.X3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.m3(), t1Var2.n3(), t1Var2.h3(), false);
        li0Var.getAdapter().m(i12);
    }

    public final void h(boolean z4) {
        this.s = z4;
        dismiss();
    }

    public final void i() {
        if (this.n0) {
            return;
        }
        this.n0 = true;
        ih.j.f(false);
        ih.j jVar = this.f0;
        if (jVar != null) {
            jVar.b(this.C);
        }
        super.dismiss();
        c();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.n0;
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.v0 == null || this.w0 == null) {
            return;
        }
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float dp = AndroidUtilities.dp(28.0f) + this.v0.c;
        float dp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f16 = dp / 2.0f;
        float f17 = f14 - f16;
        float f18 = dp2 / 2.0f;
        rectF.set(f17, f15 - f18, f14 + f16, f15 + f18);
        canvas.save();
        canvas.drawRoundRect(rectF, f18, f18, this.w0);
        this.v0.c(f17 + AndroidUtilities.dp(14.0f), f15, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long k() {
        MessageObject messageObject;
        if (this.k0 || this.b0 == null) {
            return 0L;
        }
        if (this.i0 != null) {
            this.k0 = true;
            return this.F;
        }
        org.telegram.ui.Cells.t1 t1Var = this.N;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.k0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.M.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void n(boolean z4) {
        oi0 oi0Var;
        li0 li0Var = this.H;
        if (li0Var == null || li0Var.getAdapter() == null || (oi0Var = this.J) == null) {
            return;
        }
        int h = li0Var.getAdapter().h();
        oi0Var.i1(z4 ? h > 10 ? h % 10 : 0 : h - 1, AndroidUtilities.dp(12.0f), z4);
        this.t0 = z4;
    }

    public final void o(long j10) {
        TLRPC.TL_availableEffect effect;
        this.F = j10;
        boolean i10 = this.M.i();
        ArrayList arrayList = this.K;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.b0 == null || (effect = MessagesController.getInstance(this.c).getEffect(j10)) == null) {
            return;
        }
        this.b0.setSelectedReactionAnimated(mg.q0.e(effect));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.Y) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.Y = false;
            return;
        }
        gi0 gi0Var = this.b0;
        if (gi0Var == null || gi0Var.getReactionsWindow() == null) {
            this.k0 = true;
            super.onBackPressed();
        } else {
            if (this.b0.getReactionsWindow().C) {
                return;
            }
            this.b0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        di0 di0Var = this.C;
        setContentView(di0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        di0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(di0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.o70 o70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        o70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        o70Var.Q(this.h0, rg.b.j(f6Var), false);
        ViewGroup viewGroup = o70Var.A;
        this.W = viewGroup;
        this.D.addView(viewGroup, k7.b6.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.M;
            if (i12 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    hVar.k(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= groupedMessages.messages.size()) {
                            groupedMessages.messages.add(messageObject);
                            break;
                        } else if (groupedMessages.messages.get(i13).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((MessageObject.GroupedMessages) hVar.n(i14)).calculate();
        }
        ArrayList arrayList2 = this.K;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.L;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.u0 == null) {
                    this.u0 = new org.telegram.ui.Cells.t1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.u0;
                t1Var.K7 = false;
                t1Var.M7 = false;
                t1Var.N7 = false;
                t1Var.O7 = false;
                t1Var.P7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                nh.y2 y2Var = t1Var.P0;
                y2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.j9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.C9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.o9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    i10 = i15;
                    t1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    y2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.n4();
                    i11 = t1Var.G8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.te = 0;
                    i11 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += t1Var.G8;
                        }
                    }
                    i10 = i15;
                }
            }
            this.L = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        li0 li0Var = this.H;
        li0Var.getAdapter().l();
        int h = li0Var.getAdapter().h();
        this.J.i1(h > 10 ? h % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.lg r(org.telegram.ui.Components.lg lgVar, boolean z4, View.OnClickListener onClickListener) {
        this.T = lgVar;
        int[] iArr = this.l0;
        lgVar.getLocationOnScreen(iArr);
        fi0 fi0Var = new fi0(this, getContext(), lgVar.b, this.b, lgVar, z4);
        this.U = fi0Var;
        fi0Var.setScaleX(this.T.getScaleX());
        this.U.setScaleY(this.T.getScaleY());
        org.telegram.ui.Components.lg lgVar2 = this.T;
        fi0 fi0Var2 = this.U;
        fi0Var2.B = lgVar2.B;
        fi0Var2.e0 = lgVar2.e0;
        fi0Var2.W.q(lgVar2.W.g, false, true);
        fi0Var2.a0 = lgVar2.a0;
        fi0Var2.setEmoji(lgVar2.f.f[0]);
        fi0Var2.i(lgVar2.s, lgVar2.r, true);
        fi0Var2.M.d(lgVar2.M.c, true);
        fi0Var2.x.d(lgVar2.x.c, true);
        int i10 = lgVar2.F;
        int i11 = lgVar2.G;
        fi0Var2.F = i10;
        fi0Var2.G = i11;
        float f10 = lgVar2.J;
        float f11 = lgVar2.K;
        fi0Var2.J = f10;
        fi0Var2.K = f11;
        this.U.M.d(lgVar.M.c, true);
        this.U.setOnClickListener(onClickListener);
        this.D.addView(this.U, new ViewGroup.LayoutParams(lgVar.getWidth(), lgVar.getHeight()));
        org.telegram.ui.Components.lg lgVar3 = this.T;
        lgVar.getHeight();
        this.V = lgVar3.m();
        int i12 = iArr[0];
        int width = this.T.getWidth();
        org.telegram.ui.Components.lg lgVar4 = this.T;
        lgVar.getHeight();
        iArr[0] = b.C(6.0f, width - lgVar4.m(), i12);
        return this.U;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.v0 = j10 > 0 ? new org.telegram.ui.Components.k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.w0 == null) {
            Paint paint = new Paint(1);
            this.w0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.H.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                this.I.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            ih.j.f(true);
            super.show();
            final float alpha = this.T.getAlpha();
            org.telegram.ui.Components.lg lgVar = this.T;
            if (lgVar != null) {
                lgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.im0.d(new Utilities.Callback2() { // from class: org.telegram.ui.zh0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    si0 si0Var = si0.this;
                    sg.b bVar = si0Var.g0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.lg lgVar2 = si0Var.T;
                    if (lgVar2 != null) {
                        lgVar2.setAlpha(alpha);
                    }
                    si0Var.f = bitmap;
                    Paint paint = new Paint(1);
                    si0Var.n = paint;
                    Bitmap bitmap3 = si0Var.f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    si0Var.h = bitmapShader;
                    paint.setShader(bitmapShader);
                    si0Var.r = new Matrix();
                    bVar.a(bitmap2);
                    tg.c.c(bVar, si0Var.C);
                    ViewGroup viewGroup = si0Var.W;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            di0 di0Var = this.E;
            if (di0Var != null) {
                di0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t() {
        if (this.c0) {
            return;
        }
        this.d0 = false;
        this.c0 = true;
        this.b0.p(null, null, true);
        this.b0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
        this.b0.r(false);
    }

    public void m(long j10) {
    }
}
