package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wd1 extends org.telegram.ui.ActionBar.r2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.z8 d;
    public EditTextBoldCursor e;
    public vd1 f;
    public org.telegram.ui.Components.y9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.ar s;
    public org.telegram.ui.Components.um0 v;
    public TLRPC.TL_forumTopic w;
    public pg.a x;
    public un y;

    public static wd1 b0(long j10, long j11) {
        Bundle h = a1.g.h(j10, "chat_id");
        h.putLong("topic_id", j11);
        wd1 wd1Var = new wd1(h);
        wd1Var.h = new org.telegram.ui.Components.y9[2];
        wd1Var.n = "";
        wd1Var.F = new AnimationNotificationsLocker();
        return wd1Var;
    }

    public final void c0(Long l4, boolean z10) {
        org.telegram.ui.Components.y9[] y9VarArr = this.h;
        if (this.f == null || this.v == null) {
            return;
        }
        long longValue = l4 == null ? 0L : l4.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document f7 = org.telegram.ui.Components.t5.f(this.currentAccount, l4.longValue());
            if (f7 != null) {
                org.telegram.ui.Components.wc.b0(this).r(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new rd1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(10, this.currentAccount, longValue);
            t5Var.setColorFilter(org.telegram.ui.ActionBar.y6.v3);
            y9VarArr[1].setAnimatedEmojiDrawable(t5Var);
            y9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(1, null);
            h90Var.a(this.n);
            this.v.b(h90Var, false);
            y9VarArr[1].setImageDrawable(this.s);
            y9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.y9 y9Var = y9VarArr[0];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[1];
        y9VarArr[0] = y9Var2;
        y9VarArr[1] = y9Var;
        AndroidUtilities.updateViewVisibilityAnimated(y9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.Components.y9[] y9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new sd1(this));
        if (this.w == null) {
            this.actionBar.l().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.l().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.ActionBar.f7.i(i10, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        td1 td1Var = new td1(context, null);
        this.fragmentView = td1Var;
        org.telegram.ui.ActionBar.f7.i(i10, td1Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        td1Var.addView(linearLayout);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.w;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            q4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            q4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        org.telegram.ui.ActionBar.f7.B(this.e, org.telegram.ui.ActionBar.y6.Vd, getResourceProvider());
        org.telegram.ui.ActionBar.f7.V(this.e, org.telegram.ui.ActionBar.y6.Ud, getResourceProvider());
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new m0(this, 16));
        ud1 ud1Var = new ud1(context);
        final int i11 = 0;
        ud1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
            public final /* synthetic */ wd1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                wd1 wd1Var = this.b;
                switch (i12) {
                    case 0:
                        if (wd1Var.b == 0 && wd1Var.w == null) {
                            pg.a aVar = wd1Var.x;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = pg.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) pg.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.y6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bh.b0(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            wd1Var.E = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.z8 z8Var = wd1Var.d;
                        z8Var.setChecked(true ^ z8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9VarArr[i12] = y9Var;
            ud1Var.addView(y9Var, org.telegram.ui.Components.gb1.i(28, 28, 17));
        }
        frameLayout.addView(ud1Var, org.telegram.ui.Components.gb1.h(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(q4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        Drawable e02 = org.telegram.ui.ActionBar.y6.e0(dp, getThemedColor(i13));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.f7.k(linearLayout2, e02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, org.telegram.ui.Components.gb1.x(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            vd1 vd1Var = new vd1(this, this, getParentActivity());
            this.f = vd1Var;
            vd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.ar d = pg.d.d(this.E, "");
            this.x = (pg.a) d.a;
            this.v = new org.telegram.ui.Components.um0(context);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(d, this.v, 0, 0);
            arVar.w = true;
            this.f.setForumIconDrawable(arVar);
            this.s = arVar;
            org.telegram.ui.Components.um0 um0Var = this.v;
            org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
            ArrayList arrayList = um0Var.n;
            if (!arrayList.contains(y9Var2)) {
                arrayList.add(y9Var2);
            }
            org.telegram.ui.Components.um0 um0Var2 = this.v;
            org.telegram.ui.Components.y9 y9Var3 = y9VarArr[1];
            ArrayList arrayList2 = um0Var2.n;
            if (!arrayList2.contains(y9Var3)) {
                arrayList2.add(y9Var3);
            }
            y9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[1], false, 1.0f, false);
            this.x.d.add(y9VarArr[0]);
            this.x.d.add(y9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Ac, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ud1Var.addView(imageView, org.telegram.ui.Components.gb1.i(22, 22, 17));
            frameLayout2.addView(new View(context), org.telegram.ui.Components.gb1.g(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable e03 = org.telegram.ui.ActionBar.y6.e0(AndroidUtilities.dp(16.0f), getThemedColor(i13));
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
            org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(e03);
            org.telegram.ui.ActionBar.f7.k(frameLayout3, e03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            this.d = z8Var;
            z8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int themedColor = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.R(z8Var2, org.telegram.ui.ActionBar.y6.a0(themedColor, getThemedColor(i14), 16, 16), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.N(i14), getResourceProvider());
            final int i15 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
                public final /* synthetic */ wd1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i15;
                    wd1 wd1Var = this.b;
                    switch (i122) {
                        case 0:
                            if (wd1Var.b == 0 && wd1Var.w == null) {
                                pg.a aVar = wd1Var.x;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = pg.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) pg.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.y6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bh.b0(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                wd1Var.E = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.z8 z8Var3 = wd1Var.d;
                            z8Var3.setChecked(true ^ z8Var3.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, org.telegram.ui.Components.gb1.i(-1, 50, 119));
            frameLayout2.addView(frameLayout3, org.telegram.ui.Components.gb1.h(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            i9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(i9Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            c0(Long.valueOf(this.w.icon_emoji_id), true);
        } else {
            c0(0L, true);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
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
            this.E = findTopic.icon_color;
        } else {
            this.E = pg.a.k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        vd1 vd1Var = this.f;
        if (vd1Var != null) {
            vd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.lock();
        }
    }
}
