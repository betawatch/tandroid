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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class qi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public final bi0 E;
    public final ii0 F;
    public final bi0 G;
    public long H;
    public org.telegram.ui.Components.p5 I;
    public final ji0 J;
    public final ai0 K;
    public final mi0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.t1 P;
    public int Q;
    public org.telegram.ui.Components.pf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.be U;
    public org.telegram.ui.Components.vg V;
    public di0 W;
    public int X;
    public ViewGroup Y;
    public final ci0 Z;
    public final Context a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public float b0;
    public final int c;
    public FrameLayout c0;
    public i0.b d;
    public ei0 d0;
    public Bitmap e;
    public boolean e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public final wh.f h0;
    public final gh.b i0;
    public final bh.b j0;
    public RectF k0;
    public boolean l0;
    public boolean m0;
    public Matrix n;
    public final int[] n0;
    public boolean o0;
    public boolean p0;
    public org.telegram.ui.Cells.t1 q0;
    public boolean r;
    public float r0;
    public boolean s;
    public float s0;
    public final Rect t0;
    public ValueAnimator u0;
    public boolean v;
    public boolean v0;
    public boolean w;
    public org.telegram.ui.Cells.t1 w0;
    public boolean x;
    public org.telegram.ui.Components.i11 x0;
    public float y;
    public Paint y0;

    public qi0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        final int i11 = 1;
        this.S = new Paint(1);
        this.n0 = new int[2];
        final int i12 = 0;
        this.p0 = false;
        this.t0 = new Rect();
        this.a = context;
        this.b = g6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        bi0 bi0Var = new bi0(this, context, i11);
        this.E = bi0Var;
        this.h0 = wh.f.d(1, bi0Var, bi0Var);
        bi0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yh0
            public final /* synthetic */ qi0 b;

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
        bi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.zh0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                qi0 qi0Var = qi0.this;
                if (qi0Var.o0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(qi0Var.R);
                AndroidUtilities.runOnUIThread(new wh0(qi0Var, (EditText) view2, 0), 200L);
            }
        });
        gh.b bVar = new gh.b();
        this.i0 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.j0 = bVar2;
        bVar2.f = new ih.k(bi0Var);
        bVar2.g = bi0Var;
        ii0 ii0Var = new ii0(this, context, g6Var);
        this.F = ii0Var;
        ii0Var.setClipToPadding(false);
        bi0Var.addView(ii0Var, w7.z5.e(-1, -1, 119));
        f fVar = new f(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(bi0Var, fVar);
        ji0 ji0Var = new ji0(this, context, g6Var);
        this.J = ji0Var;
        ji0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yh0
            public final /* synthetic */ qi0 b;

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
        ji0Var.setOnItemClickListener(new h(this, 18));
        ji0Var.setOnScrollListener(new j3(this, 19));
        ji0Var.setItemAnimator(new li0(null, ji0Var, g6Var));
        mi0 mi0Var = new mi0(this);
        this.L = mi0Var;
        mi0Var.O = new ni0(this);
        ji0Var.setLayoutManager(mi0Var);
        ji0Var.i(new oi0());
        ai0 ai0Var = new ai0(this, context, g6Var);
        this.K = ai0Var;
        ji0Var.setAdapter(ai0Var);
        ji0Var.setVerticalScrollBarEnabled(false);
        ji0Var.setOverScrollMode(2);
        ii0Var.addView(ji0Var, w7.z5.c(-2.0f, -1));
        bi0 bi0Var2 = new bi0(this, context, i12);
        this.G = bi0Var2;
        bi0Var.addView(bi0Var2, w7.z5.c(-1.0f, -1));
        this.Z = new ci0(this, bi0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        ah.n0 n0Var;
        if (this.d0 != null || o2Var == null) {
            return;
        }
        int i10 = this.c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.c0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.c0.setClipToPadding(false);
        this.c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        ei0 ei0Var = new ei0(5, this.c, getContext(), null, this.b);
        this.d0 = ei0Var;
        ei0Var.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.d0.setDelegate(new gi0(this, o2Var));
        this.d0.setTop(false);
        this.d0.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setVisibility(0);
        this.d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.F.addView(this.c0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.c0.addView(this.d0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.setScaleY(0.4f);
        this.d0.setScaleX(0.4f);
        this.d0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            s();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        ei0 ei0Var2 = this.d0;
        if (ei0Var2 != null && !ei0Var2.g1) {
            ei0Var2.g1 = true;
            ei0Var2.h1 = true;
            ah.t0 t0Var = ei0Var2.x0;
            if (t0Var != null && (n0Var = t0Var.m) != null && !n0Var.L1) {
                n0Var.L1 = true;
                n0Var.M1 = true;
                y41 y41Var = n0Var.h0;
                if (y41Var != null) {
                    y41Var.invalidate();
                }
                o41 o41Var = n0Var.i0;
                if (o41Var != null) {
                    o41Var.invalidate();
                }
            }
        }
        new ei.b4(this.E, false, new u3(this, 11));
    }

    public final void d(Runnable runnable, boolean z10) {
        ei0 ei0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.m1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        if (!z10 && (ei0Var = this.d0) != null && this.e0) {
            ei0Var.e();
            if (this.d0.getReactionsWindow() != null && this.d0.getReactionsWindow().a != null) {
                this.d0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.s = !z10;
        this.J.invalidate();
        this.w = true;
        this.x = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(10, this, z11));
        this.u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.u0.setInterpolator(org.telegram.ui.Components.bs.h);
        this.u0.setDuration(350L);
        this.u0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.c).hasAvailableEffects()) {
            s();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        di0 di0Var = this.W;
        if (di0Var != null) {
            di0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        d(new vh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void e(MessageObject messageObject) {
        MessageObject.GroupedMessages k10 = k(messageObject);
        if (k10 == null) {
            f(messageObject);
            return;
        }
        k10.calculate();
        ArrayList<MessageObject> arrayList = k10.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            f(messageObject2);
        }
    }

    public final void f(MessageObject messageObject) {
        org.telegram.ui.Cells.t1 t1Var;
        ji0 ji0Var = this.J;
        if (ji0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= ji0Var.getChildCount()) {
                t1Var = null;
                break;
            }
            View childAt = ji0Var.getChildAt(i11);
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
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (t1Var2 == null) {
            ji0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        t1Var2.W3(messageObject, t1Var2.getCurrentMessagesGroup(), t1Var2.l3(), t1Var2.m3(), t1Var2.g3(), false);
        ji0Var.getAdapter().m(i12);
    }

    public final void g(boolean z10) {
        this.r = z10;
        dismiss();
    }

    public final void h() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        wh.f.f(false);
        wh.f fVar = this.h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.x0 == null || this.y0 == null) {
            return;
        }
        float f13 = (f7 + f11) / 2.0f;
        float f14 = (f10 + f12) / 2.0f;
        float dp = AndroidUtilities.dp(28.0f) + this.x0.c;
        float dp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f15 = dp / 2.0f;
        float f16 = f13 - f15;
        float f17 = dp2 / 2.0f;
        rectF.set(f16, f14 - f17, f13 + f15, f14 + f17);
        canvas.save();
        canvas.drawRoundRect(rectF, f17, f17, this.y0);
        this.x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (this.m0 || this.d0 == null) {
            return 0L;
        }
        if (this.k0 != null) {
            this.m0 = true;
            return this.H;
        }
        org.telegram.ui.Cells.t1 t1Var = this.P;
        if (t1Var == null || (messageObject = t1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.m0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages k(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.O.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void m(boolean z10) {
        mi0 mi0Var;
        ji0 ji0Var = this.J;
        if (ji0Var == null || ji0Var.getAdapter() == null || (mi0Var = this.L) == null) {
            return;
        }
        int h = ji0Var.getAdapter().h();
        mi0Var.i1(z10 ? h > 10 ? h % 10 : 0 : h - 1, AndroidUtilities.dp(12.0f), z10);
        this.v0 = z10;
    }

    public final void n(long j10) {
        TLRPC.TL_availableEffect effect;
        this.H = j10;
        boolean i10 = this.O.i();
        ArrayList arrayList = this.M;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.d0 == null || (effect = MessagesController.getInstance(this.c).getEffect(j10)) == null) {
            return;
        }
        this.d0.setSelectedReactionAnimated(ah.i1.e(effect));
    }

    public final void o(org.telegram.ui.Components.j80 j80Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        j80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        j80Var.Q(this.j0, fh.c.k(g6Var), false);
        ViewGroup viewGroup = j80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.a0 = false;
            return;
        }
        ei0 ei0Var = this.d0;
        if (ei0Var == null || ei0Var.getReactionsWindow() == null) {
            this.m0 = true;
            super.onBackPressed();
        } else {
            if (this.d0.getReactionsWindow().C) {
                return;
            }
            this.d0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bi0 bi0Var = this.E;
        setContentView(bi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        bi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(bi0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
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
        ArrayList arrayList2 = this.M;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.N;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.w0 == null) {
                    this.w0 = new org.telegram.ui.Cells.t1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.t1 t1Var = this.w0;
                t1Var.N7 = false;
                t1Var.P7 = false;
                t1Var.Q7 = false;
                t1Var.R7 = false;
                t1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                ci.f3 f3Var = t1Var.S0;
                f3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = t1Var.m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = t1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = t1Var.r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    i10 = i15;
                    t1Var.U3(messageObject2, groupedMessages2, false, false, false, false);
                    f3Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    t1Var.m4();
                    i11 = t1Var.J8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    t1Var.xe = 0;
                    i11 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            t1Var.U3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += t1Var.J8;
                        }
                    }
                    i10 = i15;
                }
            }
            this.N = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        ji0 ji0Var = this.J;
        ji0Var.getAdapter().l();
        int h = ji0Var.getAdapter().h();
        this.L.i1(h > 10 ? h % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg q(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = vgVar;
        int[] iArr = this.n0;
        vgVar.getLocationOnScreen(iArr);
        di0 di0Var = new di0(this, getContext(), vgVar.b, this.b, vgVar, z10);
        this.W = di0Var;
        di0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.V;
        di0 di0Var2 = this.W;
        di0Var2.E = vgVar2.E;
        di0Var2.h0 = vgVar2.h0;
        di0Var2.c0.t(vgVar2.c0.i, false, true);
        di0Var2.d0 = vgVar2.d0;
        di0Var2.setEmoji(vgVar2.f.f[0]);
        di0Var2.i(vgVar2.s, vgVar2.r, true);
        di0Var2.P.d(vgVar2.P.c, true);
        di0Var2.x.d(vgVar2.x.c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        di0Var2.I = i10;
        di0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        di0Var2.M = f7;
        di0Var2.N = f10;
        this.W.P.d(vgVar.P.c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.V;
        vgVar.getHeight();
        this.X = vgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.V;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.sl.D(6.0f, width - vgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.x0 = j10 > 0 ? new org.telegram.ui.Components.i11(ai.nd.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.y0 == null) {
            Paint paint = new Paint(1);
            this.y0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.K.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    public final void s() {
        if (this.e0) {
            return;
        }
        this.f0 = false;
        this.e0 = true;
        this.d0.p(null, null, true);
        this.d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        this.d0.r(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            wh.f.f(true);
            super.show();
            final float alpha = this.V.getAlpha();
            org.telegram.ui.Components.vg vgVar = this.V;
            if (vgVar != null) {
                vgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.cn0.d(new Utilities.Callback2() { // from class: org.telegram.ui.xh0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    qi0 qi0Var = qi0.this;
                    gh.b bVar = qi0Var.i0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.vg vgVar2 = qi0Var.V;
                    if (vgVar2 != null) {
                        vgVar2.setAlpha(alpha);
                    }
                    qi0Var.e = bitmap;
                    Paint paint = new Paint(1);
                    qi0Var.h = paint;
                    Bitmap bitmap3 = qi0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    qi0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    qi0Var.n = new Matrix();
                    bVar.a(bitmap2);
                    hh.d.c(bVar, qi0Var.E);
                    ViewGroup viewGroup = qi0Var.Y;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            bi0 bi0Var = this.G;
            if (bi0Var != null) {
                bi0Var.bringToFront();
            }
            d(null, true);
        }
    }

    public void l(long j10) {
    }
}
