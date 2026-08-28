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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public TLRPC.FileLocation A;
    public TLRPC.InputFile B;
    public TLRPC.InputFile C;
    public TLRPC.VideoSize D;
    public String E;
    public double F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.e40 J;
    public String K;
    public final int L;
    public final boolean M;
    public org.telegram.ui.Components.mi0 N;
    public final boolean O;
    public String P;
    public final Location Q;
    public int R;
    public int S;
    public org.telegram.ui.Components.bz T;
    public q60 U;
    public p60 a;
    public org.telegram.ui.Components.wk0 b;
    public org.telegram.ui.Components.ut c;
    public ih.d4 d;
    public kh.h6 e;
    public fd f;
    public AnimatorSet h;
    public gd n;
    public final org.telegram.ui.Components.z8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.j10 v;
    public org.telegram.ui.ActionBar.o1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public r60(Bundle bundle) {
        super(bundle);
        this.L = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.P = bundle.getString("address");
        this.Q = (Location) bundle.getParcelable("location");
        this.O = bundle.getBoolean("forImport", false);
        this.K = bundle.getString("title", null);
        this.M = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void T(r60 r60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(r60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        gd gdVar = this.n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.n;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String X(int i9) {
        return getMessagesController().getUser((Long) this.G.get(i9)).first_name;
    }

    public final void Y(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i9 = 0;
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
            fd fdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, (Property<fd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<gd, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            fd fdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, (Property<fd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<gd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new n60(i9, this, z10));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0310  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar != null) {
            utVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 22));
        ed edVar = new ed(2, context, this);
        edVar.setBackgroundColor(getThemedColor(i10));
        this.fragmentView = edVar;
        edVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new jh.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        ta1 ta1Var = new ta1(this, context, 14);
        ta1Var.setOrientation(1);
        edVar.addView(ta1Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.f6.d6)));
        ta1Var.addView(this.s, g7.e6.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        ih.d4 d4Var = new ih.d4(this, context, 8);
        this.d = d4Var;
        int i12 = this.L;
        d4Var.setRoundRadius(AndroidUtilities.dp(i12 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.z8 z8Var = this.r;
        z8Var.n(5L, null, null);
        this.d.setImageDrawable(z8Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        ih.d4 d4Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(d4Var2, g7.e6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kh.h6 h6Var = new kh.h6(this, context, paint, 10);
        this.e = h6Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(h6Var, g7.e6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.l60
            public final /* synthetic */ r60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        r60 r60Var = this.b;
                        r60Var.J.o(r60Var.y != null, new o00(r60Var, 8), new r5(r60Var, 7), 0);
                        r60Var.N.K(0);
                        r60Var.N.N(43);
                        r60Var.f.d();
                        break;
                    default:
                        r60 r60Var2 = this.b;
                        if (!r60Var2.I) {
                            if (r60Var2.c.a.length() != 0) {
                                r60Var2.I = true;
                                AndroidUtilities.hideKeyboard(r60Var2.c);
                                r60Var2.c.setEnabled(false);
                                if (!r60Var2.J.h()) {
                                    org.telegram.ui.Components.j10 j10Var = r60Var2.v;
                                    if (j10Var != null) {
                                        j10Var.f(true, true);
                                    }
                                    r60Var2.R = r60Var2.getMessagesController().createChat(r60Var2.c.getText().toString(), r60Var2.G, null, r60Var2.L, r60Var2.O, r60Var2.Q, r60Var2.P, r60Var2.S, r60Var2);
                                    break;
                                } else {
                                    r60Var2.H = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) r60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(r60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.N = new org.telegram.ui.Components.mi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        fd fdVar = new fd(this, context, 2);
        this.f = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.N);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        fd fdVar2 = this.f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(fdVar2, g7.e6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        gd gdVar = new gd(this, context, i9);
        this.n = gdVar;
        gdVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        gd gdVar2 = this.n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(gdVar2, g7.e6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        Y(false, false);
        org.telegram.ui.Components.ut utVar2 = new org.telegram.ui.Components.ut(context, edVar, this, 0, false, null);
        this.c = utVar2;
        utVar2.setHint(LocaleController.getString((i12 == 0 || i12 == 4 || i12 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str2 = this.K;
        if (str2 != null) {
            this.c.setText(str2);
            org.telegram.ui.Components.ut utVar3 = this.c;
            utVar3.setSelection(utVar3.getText().length());
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
                str = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, X(0));
            } else if (size == 3) {
                str = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, X(0), X(1));
            } else if (size != 4) {
                if (size == 5) {
                    str = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, X(0), X(1), X(2), X(3));
                }
                str = "";
                if (!TextUtils.isEmpty(str)) {
                    this.c.setText(str);
                    org.telegram.ui.Components.ut utVar4 = this.c;
                    utVar4.w(0, utVar4.getText().length());
                }
            } else {
                str = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, X(0), X(1), X(2));
            }
            if (!TextUtils.isEmpty(str)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.ut utVar5 = this.c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(utVar5, g7.e6.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.T = new org.telegram.ui.Components.bz(this.b, 1);
        org.telegram.ui.Components.wk0 wk0Var2 = this.b;
        p60 p60Var = new p60(this, context);
        this.a = p60Var;
        wk0Var2.setAdapter(p60Var);
        this.b.setLayoutManager(this.T);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        ta1Var.addView(this.b, g7.e6.n(-1, -1));
        this.b.setOnScrollListener(new l3(this, 14));
        this.b.setOnItemClickListener(new m60(this));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.v = j10Var;
        org.telegram.ui.Cells.e3.s2(j10Var);
        edVar.addView(this.v, org.telegram.ui.Components.j10.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.l60
            public final /* synthetic */ r60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        r60 r60Var = this.b;
                        r60Var.J.o(r60Var.y != null, new o00(r60Var, 8), new r5(r60Var, 7), 0);
                        r60Var.N.K(0);
                        r60Var.N.N(43);
                        r60Var.f.d();
                        break;
                    default:
                        r60 r60Var2 = this.b;
                        if (!r60Var2.I) {
                            if (r60Var2.c.a.length() != 0) {
                                r60Var2.I = true;
                                AndroidUtilities.hideKeyboard(r60Var2.c);
                                r60Var2.c.setEnabled(false);
                                if (!r60Var2.J.h()) {
                                    org.telegram.ui.Components.j10 j10Var2 = r60Var2.v;
                                    if (j10Var2 != null) {
                                        j10Var2.f(true, true);
                                    }
                                    r60Var2.R = r60Var2.getMessagesController().createChat(r60Var2.c.getText().toString(), r60Var2.G, null, r60Var2.L, r60Var2.O, r60Var2.Q, r60Var2.P, r60Var2.S, r60Var2);
                                    break;
                                } else {
                                    r60Var2.H = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) r60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(r60Var2.c);
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.updateInterfaces) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.b.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i9 == NotificationCenter.chatDidFailCreate) {
            this.R = 0;
            this.I = false;
            org.telegram.ui.Components.j10 j10Var = this.v;
            if (j10Var != null) {
                j10Var.f(false, true);
            }
            org.telegram.ui.Components.ut utVar = this.c;
            if (utVar != null) {
                utVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.chatDidCreated) {
            this.R = 0;
            long longValue = ((Long) objArr[0]).longValue();
            q60 q60Var = this.U;
            if (q60Var != null) {
                q60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new qn(bundle), true);
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

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        org.telegram.ui.Components.ut utVar = this.c;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.J.i(i9, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar == null || !utVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        utVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        r60 r60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(2, true, true);
        this.J = e40Var;
        e40Var.a = this;
        e40Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i9 = 0;
        if (longArray != null) {
            this.G = new ArrayList(longArray.length);
            int i10 = 0;
            while (i10 < longArray.length) {
                i10 = aa.d.g(longArray[i10], this.G, i10, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            Long l10 = (Long) this.G.get(i11);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            r60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            r60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.no0(r60Var, arrayList2, arrayList, countDownLatch, 10));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        }
        r60Var.S = getUserConfig().getGlobalTTl() * 60;
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
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar != null) {
            utVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar != null) {
            utVar.r();
        }
        this.J.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.J.k(i9, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar != null) {
            utVar.s();
        }
        p60 p60Var = this.a;
        if (p60Var != null) {
            p60Var.l();
        }
        this.J.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.pt ptVar = this.c.a;
            ptVar.requestFocus();
            AndroidUtilities.showKeyboard(ptVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e40 e40Var = this.J;
        if (e40Var != null) {
            e40Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.ut utVar = this.c;
            if (utVar != null) {
                utVar.setText(string);
            } else {
                this.K = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e40 e40Var = this.J;
        if (e40Var != null && (str = e40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ut utVar = this.c;
        if (utVar != null) {
            String obj = utVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }
}
