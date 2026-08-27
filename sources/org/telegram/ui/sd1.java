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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sd1 extends org.telegram.ui.ActionBar.n2 {
    public int A;
    public AnimationNotificationsLocker B;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.o8 d;
    public EditTextBoldCursor e;
    public rd1 f;
    public org.telegram.ui.Components.n9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.dq s;
    public org.telegram.ui.Components.el0 v;
    public TLRPC.TL_forumTopic w;
    public wf.a x;
    public rn y;

    public static sd1 a0(long j10, long j11) {
        Bundle h = com.google.android.recaptcha.internal.a.h(j10, "chat_id");
        h.putLong("topic_id", j11);
        sd1 sd1Var = new sd1(h);
        sd1Var.h = new org.telegram.ui.Components.n9[2];
        sd1Var.n = "";
        sd1Var.B = new AnimationNotificationsLocker();
        return sd1Var;
    }

    public final void b0(Long l10, boolean z10) {
        org.telegram.ui.Components.n9[] n9VarArr = this.h;
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
                org.telegram.ui.Components.mc.a0(this).q(f10, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new nd1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(10, this.currentAccount, longValue);
            k5Var.setColorFilter(org.telegram.ui.ActionBar.g6.v3);
            n9VarArr[1].setAnimatedEmojiDrawable(k5Var);
            n9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(1, null);
            y70Var.a(this.n);
            this.v.b(y70Var, false);
            n9VarArr[1].setImageDrawable(this.s);
            n9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.n9 n9Var = n9VarArr[0];
        org.telegram.ui.Components.n9 n9Var2 = n9VarArr[1];
        n9VarArr[0] = n9Var2;
        n9VarArr[1] = n9Var;
        AndroidUtilities.updateViewVisibilityAnimated(n9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(n9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.n9[] n9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new od1(this));
        if (this.w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        pd1 pd1Var = new pd1(context, null);
        this.fragmentView = pd1Var;
        pd1Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        pd1Var.addView(linearLayout);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.w;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            j4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            j4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, h7.z5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new p0(this, 16));
        qd1 qd1Var = new qd1(context);
        final int i11 = 0;
        qd1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.md1
            public final /* synthetic */ sd1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                sd1 sd1Var = this.b;
                switch (i12) {
                    case 0:
                        if (sd1Var.b == 0 && sd1Var.w == null) {
                            wf.a aVar = sd1Var.x;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = wf.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) wf.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.g6.I.q()) {
                                aVar.h = new int[]{i0.b.d(0.2f, aVar.h[0], -1), i0.b.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new zf.z1(1, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            sd1Var.A = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        sd1Var.d.setChecked(!r9.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            n9VarArr[i12] = n9Var;
            qd1Var.addView(n9Var, h7.z5.e(28, 28, 17));
        }
        frameLayout.addView(qd1Var, h7.z5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(j4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.g6.d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.d0(dp, getThemedColor(i13)));
        linearLayout.addView(linearLayout2, h7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            rd1 rd1Var = new rd1(this, this, getParentActivity());
            this.f = rd1Var;
            rd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, h7.z5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.dq d = wf.c.d(this.A, "");
            this.x = (wf.a) d.a;
            this.v = new org.telegram.ui.Components.el0(context);
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(d, this.v, 0, 0);
            dqVar.w = true;
            this.f.setForumIconDrawable(dqVar);
            this.s = dqVar;
            org.telegram.ui.Components.el0 el0Var = this.v;
            org.telegram.ui.Components.n9 n9Var2 = n9VarArr[0];
            ArrayList arrayList = el0Var.n;
            if (!arrayList.contains(n9Var2)) {
                arrayList.add(n9Var2);
            }
            org.telegram.ui.Components.el0 el0Var2 = this.v;
            org.telegram.ui.Components.n9 n9Var3 = n9VarArr[1];
            ArrayList arrayList2 = el0Var2.n;
            if (!arrayList2.contains(n9Var3)) {
                arrayList2.add(n9Var3);
            }
            n9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(n9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(n9VarArr[1], false, 1.0f, false);
            this.x.d.add(n9VarArr[0]);
            this.x.d.add(n9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ac), PorterDuff.Mode.MULTIPLY));
            qd1Var.addView(imageView, h7.z5.e(22, 22, 17));
            frameLayout2.addView(new View(context), h7.z5.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i13)));
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            this.d = o8Var;
            o8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i13), getThemedColor(org.telegram.ui.ActionBar.g6.i6), 16, 16));
            final int i14 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.md1
                public final /* synthetic */ sd1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i14;
                    sd1 sd1Var = this.b;
                    switch (i122) {
                        case 0:
                            if (sd1Var.b == 0 && sd1Var.w == null) {
                                wf.a aVar = sd1Var.x;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = wf.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) wf.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.g6.I.q()) {
                                    aVar.h = new int[]{i0.b.d(0.2f, aVar.h[0], -1), i0.b.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new zf.z1(1, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                sd1Var.A = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            sd1Var.d.setChecked(!r9.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, h7.z5.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, h7.z5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(x8Var, h7.z5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, h7.z5.c(-1.0f, -1));
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
            this.A = wf.a.k[Math.abs(Utilities.random.nextInt() % 6)];
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
        this.B.unlock();
        rd1 rd1Var = this.f;
        if (rd1Var != null) {
            rd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.B.lock();
        }
    }
}
