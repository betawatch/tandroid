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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.w8 d;
    public EditTextBoldCursor e;
    public re1 f;
    public org.telegram.ui.Components.w9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.qq s;
    public org.telegram.ui.Components.rl0 v;
    public TLRPC.TL_forumTopic w;
    public ng.a x;
    public xn y;

    public static se1 a0(long j3, long j10) {
        Bundle e = w.c.e(j3, "chat_id");
        e.putLong("topic_id", j10);
        se1 se1Var = new se1(e);
        se1Var.h = new org.telegram.ui.Components.w9[2];
        se1Var.n = "";
        se1Var.F = new AnimationNotificationsLocker();
        return se1Var;
    }

    public final void b0(Long l4, boolean z10) {
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f == null || this.v == null) {
            return;
        }
        long longValue = l4 == null ? 0L : l4.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, l4.longValue());
            if (f7 != null) {
                org.telegram.ui.Components.xc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ne1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(10, this.currentAccount, longValue);
            q5Var.setColorFilter(org.telegram.ui.ActionBar.h6.v3);
            w9VarArr[1].setAnimatedEmojiDrawable(q5Var);
            w9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(1, null);
            m80Var.a(this.n);
            this.v.b(m80Var, false);
            w9VarArr[1].setImageDrawable(this.s);
            w9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.w9 w9Var = w9VarArr[0];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[1];
        w9VarArr[0] = w9Var2;
        w9VarArr[1] = w9Var;
        AndroidUtilities.updateViewVisibilityAnimated(w9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new oe1(this));
        if (this.w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        pe1 pe1Var = new pe1(context, null);
        this.fragmentView = pe1Var;
        pe1Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        pe1Var.addView(linearLayout);
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
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.x5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new m0(this, 16));
        qe1 qe1Var = new qe1(context);
        final int i11 = 0;
        qe1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.me1
            public final /* synthetic */ se1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                se1 se1Var = this.b;
                switch (i12) {
                    case 0:
                        if (se1Var.b == 0 && se1Var.w == null) {
                            ng.a aVar = se1Var.x;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = ng.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) ng.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.h6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            se1Var.E = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.w8 w8Var = se1Var.d;
                        w8Var.setChecked(true ^ w8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9VarArr[i12] = w9Var;
            qe1Var.addView(w9Var, w7.x5.e(28, 28, 17));
        }
        frameLayout.addView(qe1Var, w7.x5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.h6.d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.d0(dp, getThemedColor(i13)));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            re1 re1Var = new re1(this, this, getParentActivity());
            this.f = re1Var;
            re1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, w7.x5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.qq d = ng.d.d(this.E, "");
            this.x = (ng.a) d.a;
            this.v = new org.telegram.ui.Components.rl0(context);
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(d, this.v, 0, 0);
            qqVar.w = true;
            this.f.setForumIconDrawable(qqVar);
            this.s = qqVar;
            org.telegram.ui.Components.rl0 rl0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = rl0Var.n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.rl0 rl0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = rl0Var2.n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            this.x.d.add(w9VarArr[0]);
            this.x.d.add(w9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ac), PorterDuff.Mode.MULTIPLY));
            qe1Var.addView(imageView, w7.x5.e(22, 22, 17));
            frameLayout2.addView(new View(context), w7.x5.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i13)));
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.d = w8Var;
            w8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i13), getThemedColor(org.telegram.ui.ActionBar.h6.i6), 16, 16));
            final int i14 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.me1
                public final /* synthetic */ se1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i14;
                    se1 se1Var = this.b;
                    switch (i122) {
                        case 0:
                            if (se1Var.b == 0 && se1Var.w == null) {
                                ng.a aVar = se1Var.x;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = ng.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) ng.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.h6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                se1Var.E = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.w8 w8Var2 = se1Var.d;
                            w8Var2.setChecked(true ^ w8Var2.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, w7.x5.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, w7.x5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(f9Var, w7.x5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, w7.x5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.a, this.c);
            this.w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        re1 re1Var = this.f;
        if (re1Var != null) {
            re1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.lock();
        }
    }
}
