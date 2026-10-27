package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z60 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.g50 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.yj0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.yz X;
    public y60 Y;
    public x60 a;
    public org.telegram.ui.Components.nm0 b;
    public org.telegram.ui.Components.ru c;
    public di.k4 d;
    public fi.f6 e;
    public kd f;
    public AnimatorSet h;
    public ld n;
    public final org.telegram.ui.Components.j9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.j20 v;
    public org.telegram.ui.ActionBar.o1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public z60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void V(z60 z60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(z60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        ld ldVar = this.n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        ld ldVar = this.n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Z(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z11) {
            if (z10) {
                this.f.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            this.f.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        int i10 = 1;
        if (z10) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            kd kdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<ld, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            kd kdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<ld, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new s40(i10, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0305  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar != null) {
            ruVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.ActionBar.f7.i(i11, kVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, r9));
        jd jdVar = new jd(r9, context, this);
        org.telegram.ui.ActionBar.f7.i(i11, jdVar, getResourceProvider());
        this.fragmentView = jdVar;
        jdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new ei.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        za1 za1Var = new za1(this, context, 16);
        za1Var.setOrientation(1);
        jdVar.addView(za1Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        InsetDrawable e02 = org.telegram.ui.ActionBar.y6.e0(dp, getThemedColor(i13));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(e02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, e02, N, null, resourceProvider);
        za1Var.addView(this.s, org.telegram.ui.Components.kb1.o(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        di.k4 k4Var = new di.k4(this, context, 9);
        this.d = k4Var;
        int i14 = this.P;
        k4Var.setRoundRadius(AndroidUtilities.dp(i14 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.j9 j9Var = this.r;
        j9Var.n(5L, null, null);
        this.d.setImageDrawable(j9Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        di.k4 k4Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(k4Var2, org.telegram.ui.Components.kb1.h(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.f6 f6Var = new fi.f6(this, context, paint, 11);
        this.e = f6Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(f6Var, org.telegram.ui.Components.kb1.h(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u60
            public final /* synthetic */ z60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        z60 z60Var = this.b;
                        z60Var.N.n(z60Var.y != null, new r00(z60Var, 8), new u5(z60Var, 7), 0);
                        z60Var.R.M(0);
                        z60Var.R.P(43);
                        z60Var.f.d();
                        break;
                    default:
                        z60 z60Var2 = this.b;
                        if (!z60Var2.M) {
                            if (z60Var2.c.a.length() != 0) {
                                z60Var2.M = true;
                                AndroidUtilities.hideKeyboard(z60Var2.c);
                                z60Var2.c.setEnabled(false);
                                if (!z60Var2.N.g()) {
                                    org.telegram.ui.Components.j20 j20Var = z60Var2.v;
                                    if (j20Var != null) {
                                        j20Var.f(true, true);
                                    }
                                    z60Var2.V = z60Var2.getMessagesController().createChat(z60Var2.c.getText().toString(), z60Var2.K, null, z60Var2.P, z60Var2.S, z60Var2.U, z60Var2.T, z60Var2.W, z60Var2);
                                    break;
                                } else {
                                    z60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) z60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(z60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.R = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        kd kdVar = new kd(this, context, 2);
        this.f = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.R);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        kd kdVar2 = this.f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(kdVar2, org.telegram.ui.Components.kb1.h(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        ld ldVar = new ld(this, context, i10);
        this.n = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        ld ldVar2 = this.n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(ldVar2, org.telegram.ui.Components.kb1.h(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        a0(false, false);
        org.telegram.ui.Components.ru ruVar2 = new org.telegram.ui.Components.ru(context, jdVar, this, 0, false, null);
        this.c = ruVar2;
        ruVar2.setHint(LocaleController.getString((i14 == 0 || i14 == 4 || i14 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.O;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.ru ruVar3 = this.c;
            ruVar3.setSelection(ruVar3.getText().length());
            this.O = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.K.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (size == 2) {
                str2 = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, Z(0));
            } else if (size == 3) {
                str2 = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, Z(0), Z(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, Z(0), Z(1), Z(2), Z(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    org.telegram.ui.Components.ru ruVar4 = this.c;
                    ruVar4.w(0, ruVar4.getText().length());
                }
            } else {
                str2 = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Z(0), Z(1), Z(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.ru ruVar5 = this.c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(ruVar5, org.telegram.ui.Components.kb1.h(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var;
        nm0Var.u1();
        this.X = new org.telegram.ui.Components.yz(this.b, 1);
        org.telegram.ui.Components.nm0 nm0Var2 = this.b;
        x60 x60Var = new x60(this, context);
        this.a = x60Var;
        nm0Var2.setAdapter(x60Var);
        this.b.setLayoutManager(this.X);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        za1Var.addView(this.b, org.telegram.ui.Components.kb1.r(-1, -1));
        this.b.setOnScrollListener(new i3(this, 15));
        this.b.setOnItemClickListener(new v60(this));
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.v = j20Var;
        k6.c.h(j20Var);
        jdVar.addView(this.v, org.telegram.ui.Components.j20.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u60
            public final /* synthetic */ z60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z60 z60Var = this.b;
                        z60Var.N.n(z60Var.y != null, new r00(z60Var, 8), new u5(z60Var, 7), 0);
                        z60Var.R.M(0);
                        z60Var.R.P(43);
                        z60Var.f.d();
                        break;
                    default:
                        z60 z60Var2 = this.b;
                        if (!z60Var2.M) {
                            if (z60Var2.c.a.length() != 0) {
                                z60Var2.M = true;
                                AndroidUtilities.hideKeyboard(z60Var2.c);
                                z60Var2.c.setEnabled(false);
                                if (!z60Var2.N.g()) {
                                    org.telegram.ui.Components.j20 j20Var2 = z60Var2.v;
                                    if (j20Var2 != null) {
                                        j20Var2.f(true, true);
                                    }
                                    z60Var2.V = z60Var2.getMessagesController().createChat(z60Var2.c.getText().toString(), z60Var2.K, null, z60Var2.P, z60Var2.S, z60Var2.U, z60Var2.T, z60Var2.W, z60Var2);
                                    break;
                                } else {
                                    z60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) z60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(z60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.v.setContentDescription(LocaleController.getString(R.string.Done));
        this.v.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.k4) {
                    ((org.telegram.ui.Cells.k4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.j20 j20Var = this.v;
            if (j20Var != null) {
                j20Var.f(false, true);
            }
            org.telegram.ui.Components.ru ruVar = this.c;
            if (ruVar != null) {
                ruVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            y60 y60Var = this.Y;
            if (y60Var != null) {
                y60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wn(bundle), true);
            }
            if (this.F == null && this.G == null && this.H == null) {
                return;
            }
            getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.y, this.E, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ su0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ai));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar == null || !ruVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ruVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        z60 z60Var;
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(2, true, true);
        this.N = g50Var;
        g50Var.a = this;
        g50Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = c3.h0.j(longArray[i11], this.K, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            Long l4 = (Long) this.K.get(i12);
            if (getMessagesController().getUser(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (arrayList.isEmpty()) {
            z60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            z60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.e10(z60Var, arrayList2, arrayList, countDownLatch, 18));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        }
        z60Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar != null) {
            ruVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar != null) {
            ruVar.r();
        }
        this.N.i();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar != null) {
            ruVar.s();
        }
        x60 x60Var = this.a;
        if (x60Var != null) {
            x60Var.l();
        }
        this.N.k();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.j20 j20Var = this.v;
            if (j20Var != null) {
                j20Var.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.nm0 nm0Var = this.b;
            if (nm0Var != null) {
                nm0Var.A1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.ru ruVar = this.c;
            if (ruVar == null || ruVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.G6));
            this.c.getEditText().setLineColors(getThemedColor(org.telegram.ui.ActionBar.y6.k6), getThemedColor(org.telegram.ui.ActionBar.y6.l6), getThemedColor(org.telegram.ui.ActionBar.y6.p7));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.mu muVar = this.c.a;
            muVar.requestFocus();
            AndroidUtilities.showKeyboard(muVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.g50 g50Var = this.N;
        if (g50Var != null) {
            g50Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.ru ruVar = this.c;
            if (ruVar != null) {
                ruVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.g50 g50Var = this.N;
        if (g50Var != null && (str = g50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ru ruVar = this.c;
        if (ruVar != null) {
            String obj = ruVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }
}
