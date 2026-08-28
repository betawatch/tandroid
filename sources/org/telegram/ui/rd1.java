package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rd1 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public AnimationNotificationsLocker B;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.s8 d;
    public EditTextBoldCursor e;
    public qd1 f;
    public org.telegram.ui.Components.o9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.fq s;
    public org.telegram.ui.Components.bl0 v;
    public TLRPC.TL_forumTopic w;
    public vf.a x;
    public qn y;

    public static rd1 Z(long j10, long j11) {
        Bundle g10 = e2.c.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        rd1 rd1Var = new rd1(g10);
        rd1Var.h = new org.telegram.ui.Components.o9[2];
        rd1Var.n = "";
        rd1Var.B = new AnimationNotificationsLocker();
        return rd1Var;
    }

    public final void a0(Long l10, boolean z10) {
        org.telegram.ui.Components.o9[] o9VarArr = this.h;
        if (this.f == null || this.v == null) {
            return;
        }
        long longValue = l10 == null ? 0L : l10.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document f10 = org.telegram.ui.Components.k5.f(this.currentAccount, l10.longValue());
            if (f10 != null) {
                org.telegram.ui.Components.oc.a0(this).q(f10, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new md1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(10, this.currentAccount, longValue);
            k5Var.setColorFilter(org.telegram.ui.ActionBar.f6.v3);
            o9VarArr[1].setAnimatedEmojiDrawable(k5Var);
            o9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(1, null);
            u70Var.a(this.n);
            this.v.b(u70Var, false);
            o9VarArr[1].setImageDrawable(this.s);
            o9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.o9 o9Var = o9VarArr[0];
        org.telegram.ui.Components.o9 o9Var2 = o9VarArr[1];
        o9VarArr[0] = o9Var2;
        o9VarArr[1] = o9Var;
        AndroidUtilities.updateViewVisibilityAnimated(o9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.o9[] o9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new nd1(this));
        if (this.w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        kVar.setBackgroundColor(getThemedColor(i9));
        this.actionBar.setCastShadows(false);
        od1 od1Var = new od1(context, null);
        this.fragmentView = od1Var;
        od1Var.setBackgroundColor(getThemedColor(i9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        od1Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.w;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.f6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, g7.e6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new o0(this, 16));
        pd1 pd1Var = new pd1(context);
        final int i10 = 0;
        pd1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld1
            public final /* synthetic */ rd1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                rd1 rd1Var = this.b;
                switch (i11) {
                    case 0:
                        if (rd1Var.b == 0 && rd1Var.w == null) {
                            vf.a aVar = rd1Var.x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = vf.a.k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.i = i13;
                            aVar.h = (int[]) vf.a.l.get(i13);
                            if (org.telegram.ui.ActionBar.f6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new f2.g(28, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            rd1Var.A = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s8 s8Var = rd1Var.d;
                        s8Var.setChecked(true ^ s8Var.d.h);
                        break;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9VarArr[i11] = o9Var;
            pd1Var.addView(o9Var, g7.e6.e(28, 28, 17));
        }
        frameLayout.addView(pd1Var, g7.e6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.f6.d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            qd1 qd1Var = new qd1(this, this, getParentActivity());
            this.f = qd1Var;
            qd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, g7.e6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.fq d = vf.c.d(this.A, "");
            this.x = (vf.a) d.a;
            this.v = new org.telegram.ui.Components.bl0(context);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(d, this.v, 0, 0);
            fqVar.w = true;
            this.f.setForumIconDrawable(fqVar);
            this.s = fqVar;
            org.telegram.ui.Components.bl0 bl0Var = this.v;
            org.telegram.ui.Components.o9 o9Var2 = o9VarArr[0];
            ArrayList arrayList = bl0Var.n;
            if (!arrayList.contains(o9Var2)) {
                arrayList.add(o9Var2);
            }
            org.telegram.ui.Components.bl0 bl0Var2 = this.v;
            org.telegram.ui.Components.o9 o9Var3 = o9VarArr[1];
            ArrayList arrayList2 = bl0Var2.n;
            if (!arrayList2.contains(o9Var3)) {
                arrayList2.add(o9Var3);
            }
            o9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(o9VarArr[1], false, 1.0f, false);
            this.x.d.add(o9VarArr[0]);
            this.x.d.add(o9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Ac), PorterDuff.Mode.MULTIPLY));
            pd1Var.addView(imageView, g7.e6.e(22, 22, 17));
            frameLayout2.addView(new View(context), g7.e6.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.d = s8Var;
            s8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.f6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.f6.i6), 16, 16));
            final int i13 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld1
                public final /* synthetic */ rd1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i13;
                    rd1 rd1Var = this.b;
                    switch (i112) {
                        case 0:
                            if (rd1Var.b == 0 && rd1Var.w == null) {
                                vf.a aVar = rd1Var.x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = vf.a.k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i132 = iArr[aVar.e];
                                aVar.i = i132;
                                aVar.h = (int[]) vf.a.l.get(i132);
                                if (org.telegram.ui.ActionBar.f6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new f2.g(28, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                rd1Var.A = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.s8 s8Var2 = rd1Var.d;
                            s8Var2.setChecked(true ^ s8Var2.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, g7.e6.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, g7.e6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(b9Var, g7.e6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, g7.e6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            a0(Long.valueOf(this.w.icon_emoji_id), true);
        } else {
            a0(0L, true);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.a, this.c);
            this.w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.A = findTopic.icon_color;
        } else {
            this.A = vf.a.k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.B.unlock();
        qd1 qd1Var = this.f;
        if (qd1Var != null) {
            qd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.B.lock();
        }
    }
}
