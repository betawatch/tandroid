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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.e50 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.uj0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.yz X;
    public r60 Y;
    public q60 a;
    public org.telegram.ui.Components.im0 b;
    public org.telegram.ui.Components.qu c;
    public ci.k4 d;
    public ei.g6 e;
    public jd f;
    public AnimatorSet h;
    public kd n;
    public final org.telegram.ui.Components.h9 r;
    public FrameLayout s;
    public org.telegram.ui.Components.h20 v;
    public org.telegram.ui.ActionBar.m1 w;
    public Drawable x;
    public TLRPC.FileLocation y;

    public s60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void U(s60 s60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(s60Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        kd kdVar = this.n;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        kd kdVar = this.n;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
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
            jd jdVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, (Property<jd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<kd, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            jd jdVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, (Property<jd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<kd, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new l40(i10, this, z10));
        this.h.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02f9  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.a7;
        kVar.setBackgroundColor(getThemedColor(i11));
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, i12));
        id idVar = new id(2, context, this);
        idVar.setBackgroundColor(getThemedColor(i11));
        this.fragmentView = idVar;
        idVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new di.d(2));
        this.x = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        qa1 qa1Var = new qa1(this, context, 15);
        qa1Var.setOrientation(1);
        idVar.addView(qa1Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(16.0f), getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
        qa1Var.addView(this.s, w7.z5.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        ci.k4 k4Var = new ci.k4(this, context, 9);
        this.d = k4Var;
        int i13 = this.P;
        k4Var.setRoundRadius(AndroidUtilities.dp(i13 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.h9 h9Var = this.r;
        h9Var.n(5L, null, null);
        this.d.setImageDrawable(h9Var);
        this.d.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.s;
        ci.k4 k4Var2 = this.d;
        boolean z10 = LocaleController.isRTL;
        frameLayout2.addView(k4Var2, w7.z5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ei.g6 g6Var = new ei.g6(this, context, paint, 10);
        this.e = g6Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = LocaleController.isRTL;
        frameLayout3.addView(g6Var, w7.z5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        s60 s60Var = this.b;
                        s60Var.N.n(s60Var.y != null, new dz(s60Var, 9), new w5(s60Var, 7), 0);
                        s60Var.R.M(0);
                        s60Var.R.P(43);
                        s60Var.f.d();
                        break;
                    default:
                        s60 s60Var2 = this.b;
                        if (!s60Var2.M) {
                            if (s60Var2.c.a.length() != 0) {
                                s60Var2.M = true;
                                AndroidUtilities.hideKeyboard(s60Var2.c);
                                s60Var2.c.setEnabled(false);
                                if (!s60Var2.N.g()) {
                                    org.telegram.ui.Components.h20 h20Var = s60Var2.v;
                                    if (h20Var != null) {
                                        h20Var.f(true, true);
                                    }
                                    s60Var2.V = s60Var2.getMessagesController().createChat(s60Var2.c.getText().toString(), s60Var2.K, null, s60Var2.P, s60Var2.S, s60Var2.U, s60Var2.T, s60Var2.W, s60Var2);
                                    break;
                                } else {
                                    s60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) s60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(s60Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.R = new org.telegram.ui.Components.uj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        jd jdVar = new jd(this, context, 2);
        this.f = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.R);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.s;
        jd jdVar2 = this.f;
        boolean z12 = LocaleController.isRTL;
        frameLayout4.addView(jdVar2, w7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        kd kdVar = new kd(this, context, i10);
        this.n = kdVar;
        kdVar.setSize(AndroidUtilities.dp(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        kd kdVar2 = this.n;
        boolean z13 = LocaleController.isRTL;
        frameLayout5.addView(kdVar2, w7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        Z(false, false);
        org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, idVar, this, 0, false, null);
        this.c = quVar2;
        quVar2.setHint(LocaleController.getString((i13 == 0 || i13 == 4 || i13 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.O;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.qu quVar3 = this.c;
            quVar3.setSelection(quVar3.getText().length());
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
                str2 = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, Y(0));
            } else if (size == 3) {
                str2 = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, Y(0), Y(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, Y(0), Y(1), Y(2), Y(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    org.telegram.ui.Components.qu quVar4 = this.c;
                    quVar4.w(0, quVar4.getText().length());
                }
            } else {
                str2 = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, Y(0), Y(1), Y(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        org.telegram.ui.Components.qu quVar5 = this.c;
        boolean z14 = LocaleController.isRTL;
        frameLayout6.addView(quVar5, w7.z5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.b = im0Var;
        im0Var.p1();
        this.X = new org.telegram.ui.Components.yz(this.b, 1);
        org.telegram.ui.Components.im0 im0Var2 = this.b;
        q60 q60Var = new q60(this, context);
        this.a = q60Var;
        im0Var2.setAdapter(q60Var);
        this.b.setLayoutManager(this.X);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        qa1Var.addView(this.b, w7.z5.n(-1, -1));
        this.b.setOnScrollListener(new k3(this, 14));
        this.b.setOnItemClickListener(new n60(this));
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.v = h20Var;
        m.g3.p(h20Var);
        idVar.addView(this.v, org.telegram.ui.Components.h20.b());
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m60
            public final /* synthetic */ s60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        s60 s60Var = this.b;
                        s60Var.N.n(s60Var.y != null, new dz(s60Var, 9), new w5(s60Var, 7), 0);
                        s60Var.R.M(0);
                        s60Var.R.P(43);
                        s60Var.f.d();
                        break;
                    default:
                        s60 s60Var2 = this.b;
                        if (!s60Var2.M) {
                            if (s60Var2.c.a.length() != 0) {
                                s60Var2.M = true;
                                AndroidUtilities.hideKeyboard(s60Var2.c);
                                s60Var2.c.setEnabled(false);
                                if (!s60Var2.N.g()) {
                                    org.telegram.ui.Components.h20 h20Var2 = s60Var2.v;
                                    if (h20Var2 != null) {
                                        h20Var2.f(true, true);
                                    }
                                    s60Var2.V = s60Var2.getMessagesController().createChat(s60Var2.c.getText().toString(), s60Var2.K, null, s60Var2.P, s60Var2.S, s60Var2.U, s60Var2.T, s60Var2.W, s60Var2);
                                    break;
                                } else {
                                    s60Var2.L = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) s60Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(s60Var2.c);
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
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.h20 h20Var = this.v;
            if (h20Var != null) {
                h20Var.f(false, true);
            }
            org.telegram.ui.Components.qu quVar = this.c;
            if (quVar != null) {
                quVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            r60 r60Var = this.Y;
            if (r60Var != null) {
                r60Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new qn(bundle), true);
            }
            if (this.F == null && this.G == null && this.H == null) {
                return;
            }
            getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.y, this.E, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        org.telegram.ui.Components.qu quVar = this.c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar == null || !quVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        quVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        s60 s60Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(2, true, true);
        this.N = e50Var;
        e50Var.a = this;
        e50Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = com.google.android.gms.internal.play_billing.k3.h(longArray[i11], this.K, i11, 1);
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
            s60Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            s60Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.i90(s60Var, arrayList2, arrayList, countDownLatch, 15));
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
        s60Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.r();
        }
        this.N.i();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.s();
        }
        q60 q60Var = this.a;
        if (q60Var != null) {
            q60Var.l();
        }
        this.N.k();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.lu luVar = this.c.a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.N;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.qu quVar = this.c;
            if (quVar != null) {
                quVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e50 e50Var = this.N;
        if (e50Var != null && (str = e50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            String obj = quVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
