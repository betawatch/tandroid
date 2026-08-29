package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public TLRPC.FileLocation A;
    public TLRPC.InputFile B;
    public TLRPC.InputFile C;
    public TLRPC.VideoSize D;
    public String E;
    public double F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.s40 J;
    public String K;
    public final int L;
    public final boolean M;
    public org.telegram.ui.Components.xi0 N;
    public final boolean O;
    public String P;
    public final Location Q;
    public int R;
    public int S;
    public org.telegram.ui.Components.kz T;
    public s60 U;
    public r60 a;
    public org.telegram.ui.Components.jl0 b;
    public org.telegram.ui.Components.au c;
    public lh.y3 d;
    public cg.i0 e;
    public ed f;
    public AnimatorSet h;
    public fd n;
    public final org.telegram.ui.Components.e9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.u10 v;
    public org.telegram.ui.ActionBar.o1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public t60(Bundle bundle) {
        super(bundle);
        this.L = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.P = bundle.getString("address");
        this.Q = (Location) bundle.getParcelable("location");
        this.O = bundle.getBoolean("forImport", false);
        this.K = bundle.getString("title", null);
        this.M = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void U(t60 t60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(t60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        fd fdVar = this.n;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
        fd fdVar = this.n;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.G.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i10 = 0;
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
        if (z10) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            ed edVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(edVar, (Property<ed, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<fd, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            ed edVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(edVar2, (Property<ed, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<fd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new p60(i10, this, z10));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0310  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.a7;
        lVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 14));
        dd ddVar = new dd(2, context, this);
        ddVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = ddVar;
        ddVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new mh.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        ua1 ua1Var = new ua1(this, context, 15);
        ua1Var.setOrientation(1);
        ddVar.addView(ua1Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
        ua1Var.addView(this.s, i7.f6.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        lh.y3 y3Var = new lh.y3(this, context, 8);
        this.d = y3Var;
        int i13 = this.L;
        y3Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.e9 e9Var = this.r;
        e9Var.n(5L, null, null);
        this.d.setImageDrawable(e9Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        lh.y3 y3Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(y3Var2, i7.f6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        cg.i0 i0Var = new cg.i0(this, context, paint, 10);
        this.e = i0Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(i0Var, i7.f6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n60
            public final /* synthetic */ t60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t60 t60Var = this.b;
                        t60Var.J.o(t60Var.y != null, new q00(t60Var, 8), new s5(t60Var, 7), 0);
                        t60Var.N.K(0);
                        t60Var.N.N(43);
                        t60Var.f.d();
                        break;
                    default:
                        t60 t60Var2 = this.b;
                        if (!t60Var2.I) {
                            if (t60Var2.c.a.length() != 0) {
                                t60Var2.I = true;
                                AndroidUtilities.hideKeyboard(t60Var2.c);
                                t60Var2.c.setEnabled(false);
                                if (!t60Var2.J.h()) {
                                    org.telegram.ui.Components.u10 u10Var = t60Var2.v;
                                    if (u10Var != null) {
                                        u10Var.f(true, true);
                                    }
                                    t60Var2.R = t60Var2.getMessagesController().createChat(t60Var2.c.getText().toString(), t60Var2.G, null, t60Var2.L, t60Var2.O, t60Var2.Q, t60Var2.P, t60Var2.S, t60Var2);
                                    break;
                                } else {
                                    t60Var2.H = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) t60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(t60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.N = new org.telegram.ui.Components.xi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        ed edVar = new ed(this, context, 2);
        this.f = edVar;
        edVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.N);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        ed edVar2 = this.f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(edVar2, i7.f6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        fd fdVar = new fd(this, context, i10);
        this.n = fdVar;
        fdVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        fd fdVar2 = this.n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(fdVar2, i7.f6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.au auVar2 = new org.telegram.ui.Components.au(context, ddVar, this, 0, false, null);
        this.c = auVar2;
        auVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str2 = this.K;
        if (str2 != null) {
            this.c.setText(str2);
            org.telegram.ui.Components.au auVar3 = this.c;
            auVar3.setSelection(auVar3.getText().length());
            this.K = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.G.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            try {
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (size == 2) {
                str = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, Y(0));
            } else if (size == 3) {
                str = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, Y(0), Y(1));
            } else if (size != 4) {
                if (size == 5) {
                    str = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, Y(0), Y(1), Y(2), Y(3));
                }
                str = "";
                if (!TextUtils.isEmpty(str)) {
                    this.c.setText(str);
                    org.telegram.ui.Components.au auVar4 = this.c;
                    auVar4.w(0, auVar4.getText().length());
                }
            } else {
                str = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
            }
            if (!TextUtils.isEmpty(str)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.au auVar5 = this.c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(auVar5, i7.f6.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.b = jl0Var;
        jl0Var.p1();
        this.T = new org.telegram.ui.Components.kz(this.b, 1);
        org.telegram.ui.Components.jl0 jl0Var2 = this.b;
        r60 r60Var = new r60(this, context);
        this.a = r60Var;
        jl0Var2.setAdapter(r60Var);
        this.b.setLayoutManager(this.T);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        ua1Var.addView(this.b, i7.f6.n(-1, -1));
        this.b.setOnScrollListener(new m3(this, 14));
        this.b.setOnItemClickListener(new o60(this));
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.v = u10Var;
        oc.i.K1(u10Var);
        ddVar.addView(this.v, org.telegram.ui.Components.u10.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n60
            public final /* synthetic */ t60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t60 t60Var = this.b;
                        t60Var.J.o(t60Var.y != null, new q00(t60Var, 8), new s5(t60Var, 7), 0);
                        t60Var.N.K(0);
                        t60Var.N.N(43);
                        t60Var.f.d();
                        break;
                    default:
                        t60 t60Var2 = this.b;
                        if (!t60Var2.I) {
                            if (t60Var2.c.a.length() != 0) {
                                t60Var2.I = true;
                                AndroidUtilities.hideKeyboard(t60Var2.c);
                                t60Var2.c.setEnabled(false);
                                if (!t60Var2.J.h()) {
                                    org.telegram.ui.Components.u10 u10Var2 = t60Var2.v;
                                    if (u10Var2 != null) {
                                        u10Var2.f(true, true);
                                    }
                                    t60Var2.R = t60Var2.getMessagesController().createChat(t60Var2.c.getText().toString(), t60Var2.G, null, t60Var2.L, t60Var2.O, t60Var2.Q, t60Var2.P, t60Var2.S, t60Var2);
                                    break;
                                } else {
                                    t60Var2.H = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) t60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(t60Var2.c);
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
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.R = 0;
            this.I = false;
            org.telegram.ui.Components.u10 u10Var = this.v;
            if (u10Var != null) {
                u10Var.f(false, true);
            }
            org.telegram.ui.Components.au auVar = this.c;
            if (auVar != null) {
                auVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.R = 0;
            long longValue = ((Long) objArr[0]).longValue();
            s60 s60Var = this.U;
            if (s60Var != null) {
                s60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new tn(bundle), true);
            }
            if (this.B == null && this.C == null && this.D == null) {
                return;
            }
            getMessagesController().changeChatAvatar(longValue, null, this.B, this.C, this.D, this.F, this.E, this.y, this.A, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.J.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.J.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        org.telegram.ui.Components.au auVar = this.c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.e4.class}, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.J.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar == null || !auVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        auVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        t60 t60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(2, true, true);
        this.J = s40Var;
        s40Var.a = this;
        s40Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.G = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = a4.w.g(longArray[i11], this.G, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.G.size(); i12++) {
            Long l10 = (Long) this.G.get(i12);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            t60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            t60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new n20(t60Var, arrayList2, arrayList, countDownLatch, 4));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        t60Var.S = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.J.e();
        if (this.R != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.R, true);
        }
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.r();
        }
        this.J.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.J.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.s();
        }
        r60 r60Var = this.a;
        if (r60Var != null) {
            r60Var.l();
        }
        this.J.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.vt vtVar = this.c.a;
            vtVar.requestFocus();
            AndroidUtilities.showKeyboard(vtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.s40 s40Var = this.J;
        if (s40Var != null) {
            s40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.au auVar = this.c;
            if (auVar != null) {
                auVar.setText(string);
            } else {
                this.K = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.s40 s40Var = this.J;
        if (s40Var != null && (str = s40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            String obj = auVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ void P() {
    }
}
