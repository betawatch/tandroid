// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uc5 extends d implements jm7, vn5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public wn5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public p09 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public wd4 Y;
    public tc5 Z;
    public sc5 a;
    public r59 b;
    public cv3 c;
    public kc0 d;
    public a91 e;
    public cj1 f;
    public AnimatorSet h;
    public dj1 n;
    public final pc0 r;
    public FrameLayout s;
    public wp4 w;
    public m8 x;
    public Drawable y;

    public uc5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new pc0((ylb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override // vn5
    public final void H(float f) {
        dj1 dj1Var = this.n;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(f);
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        dj1 dj1Var = this.n;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(0.0f);
    }

    @Override // vn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1((d) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    public final String c0(int i) {
        return getMessagesController().W1((Long) this.L.get(i)).first_name;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0316  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131748030, null));
        a aVar = this.actionBar;
        int i = cmb.Z6;
        anb.h(i, getResourceProvider(), aVar);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 25));
        byte b3 = 3;
        hz0 hz0Var = new hz0(this, context, b3);
        anb.h(i, getResourceProvider(), hz0Var);
        this.fragmentView = hz0Var;
        hz0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        byte b4 = 10;
        this.fragmentView.setOnTouchListener(new w02((byte) 10));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        qmb qmbVar = new qmb((byte) 8, context, this);
        qmbVar.setOrientation(1);
        hz0Var.addView(qmbVar, qoe.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = gm.L(16.0f);
        int i2 = cmb.c6;
        InsetDrawable d0 = cmb.d0(L, getThemedColor(i2));
        wmb M = anb.M(i2);
        ylb resourceProvider = getResourceProvider();
        frameLayout.setBackground(d0);
        anb.j(frameLayout, d0, M, null, resourceProvider);
        qmbVar.addView(this.s, qoe.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        kc0 kc0Var = new kc0((byte) 5, context, this);
        this.d = kc0Var;
        int i3 = this.Q;
        kc0Var.setRoundRadius(gm.L(i3 == 5 ? 16.0f : 32.0f));
        pc0 pc0Var = this.r;
        pc0Var.j(5L, null, null, null);
        this.d.setImageDrawable(pc0Var);
        this.d.setContentDescription(jb6.M0(2131752060, null));
        FrameLayout frameLayout2 = this.s;
        kc0 kc0Var2 = this.d;
        boolean z = jb6.a0;
        frameLayout2.addView(kc0Var2, qoe.d(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 16.0f, z ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a91 a91Var = new a91(this, context, paint, b4);
        this.e = a91Var;
        FrameLayout frameLayout3 = this.s;
        boolean z2 = jb6.a0;
        frameLayout3.addView(a91Var, qoe.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 16.0f, z2 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: pc5
            public final /* synthetic */ uc5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b2) {
                    case 0:
                        uc5 uc5Var = this.b;
                        uc5Var.O.n(uc5Var.E != null, new qn4(uc5Var, (byte) 26), new n1(uc5Var, (byte) 23), 0);
                        uc5Var.S.H(0);
                        uc5Var.S.K(43);
                        uc5Var.f.d();
                        break;
                    default:
                        uc5 uc5Var2 = this.b;
                        if (!uc5Var2.N) {
                            if (uc5Var2.c.a.length() != 0) {
                                uc5Var2.N = true;
                                gm.t1(uc5Var2.c);
                                uc5Var2.c.setEnabled(false);
                                if (!uc5Var2.O.g()) {
                                    wp4 wp4Var = uc5Var2.w;
                                    if (wp4Var != null) {
                                        wp4Var.f(true, true);
                                    }
                                    uc5Var2.W = uc5Var2.getMessagesController().Q(uc5Var2.c.getText().toString(), uc5Var2.L, null, uc5Var2.Q, uc5Var2.T, uc5Var2.V, uc5Var2.U, uc5Var2.X, uc5Var2);
                                    break;
                                } else {
                                    uc5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) uc5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                gm.z3(uc5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new p09(R.raw.camera, gm.L(60.0f), gm.L(60.0f), false, null);
        cj1 cj1Var = new cj1(b3, context, this);
        this.f = cj1Var;
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(gm.L(0.0f), 0, 0, gm.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        cj1 cj1Var2 = this.f;
        boolean z3 = jb6.a0;
        frameLayout4.addView(cj1Var2, qoe.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 16.0f, z3 ? 15.0f : 0.0f, 16.0f));
        dj1 dj1Var = new dj1(this, context, b);
        this.n = dj1Var;
        dj1Var.setSize(gm.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        dj1 dj1Var2 = this.n;
        boolean z4 = jb6.a0;
        frameLayout5.addView(dj1Var2, qoe.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        cv3 cv3Var2 = new cv3(context, hz0Var, this, 0, false, null);
        this.c = cv3Var2;
        cv3Var2.setHint(jb6.M0((i3 == 0 || i3 == 4 || i3 == 5) ? 2131751059 : 2131751058, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            cv3 cv3Var3 = this.c;
            cv3Var3.setSelection(cv3Var3.getText().length());
            this.P = null;
        }
        TLRPC.User f = getUserConfig().f();
        int size = this.L.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (size == 2) {
                str2 = jb6.a0("GroupCreateMembersTwo", null, 2131749207, f.first_name, c0(0));
            } else if (size == 3) {
                str2 = jb6.a0("GroupCreateMembersThree", null, 2131749208, f.first_name, c0(0), c0(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = jb6.a0("GroupCreateMembersFive", null, 2131749210, f.first_name, c0(0), c0(1), c0(2), c0(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    cv3 cv3Var4 = this.c;
                    cv3Var4.w(0, cv3Var4.getText().length());
                }
            } else {
                str2 = jb6.a0("GroupCreateMembersFour", null, 2131749209, f.first_name, c0(0), c0(1), c0(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        cv3 cv3Var5 = this.c;
        boolean z5 = jb6.a0;
        frameLayout6.addView(cv3Var5, qoe.d(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.Y = new wd4(1, this.b);
        r59 r59Var2 = this.b;
        sc5 sc5Var = new sc5(this, context);
        this.a = sc5Var;
        r59Var2.setAdapter(sc5Var);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        qmbVar.addView(this.b, qoe.o(-1, -1));
        this.b.setOnScrollListener(new ip2(this, (byte) 19));
        this.b.setOnItemClickListener(new qc5(this));
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.w = wp4Var;
        wm9.c(wp4Var);
        hz0Var.addView(this.w, wp4.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: pc5
            public final /* synthetic */ uc5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b) {
                    case 0:
                        uc5 uc5Var = this.b;
                        uc5Var.O.n(uc5Var.E != null, new qn4(uc5Var, (byte) 26), new n1(uc5Var, (byte) 23), 0);
                        uc5Var.S.H(0);
                        uc5Var.S.K(43);
                        uc5Var.f.d();
                        break;
                    default:
                        uc5 uc5Var2 = this.b;
                        if (!uc5Var2.N) {
                            if (uc5Var2.c.a.length() != 0) {
                                uc5Var2.N = true;
                                gm.t1(uc5Var2.c);
                                uc5Var2.c.setEnabled(false);
                                if (!uc5Var2.O.g()) {
                                    wp4 wp4Var2 = uc5Var2.w;
                                    if (wp4Var2 != null) {
                                        wp4Var2.f(true, true);
                                    }
                                    uc5Var2.W = uc5Var2.getMessagesController().Q(uc5Var2.c.getText().toString(), uc5Var2.L, null, uc5Var2.Q, uc5Var2.T, uc5Var2.V, uc5Var2.U, uc5Var2.X, uc5Var2);
                                    break;
                                } else {
                                    uc5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) uc5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                gm.z3(uc5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(jb6.M0(2131751291, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final /* synthetic */ void d0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(cf7.Y(this.currentAccount).i0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = oc7.s5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                    return;
                }
                int childCount = this.b.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof xc5) {
                        ((xc5) childAt).f(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == nm7.S) {
            this.W = 0;
            this.N = false;
            wp4 wp4Var = this.w;
            if (wp4Var != null) {
                wp4Var.f(false, true);
            }
            cv3 cv3Var = this.c;
            if (cv3Var != null) {
                cv3Var.setEnabled(true);
                return;
            }
            return;
        }
        if (i == nm7.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            tc5 tc5Var = this.Z;
            if (tc5Var != null) {
                tc5Var.a(this, longValue);
            } else {
                nm7.f(this.currentAccount).k(nm7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new yv1(bundle), true);
            }
            if (this.G == null && this.H == null && this.I == null) {
                return;
            }
            getMessagesController().x(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O.c && super.dismissDialogOnPause(dialog);
    }

    public final void e0(boolean z, boolean z2) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z2) {
            cj1 cj1Var = this.f;
            if (z) {
                cj1Var.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            cj1Var.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        if (z) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            cj1 cj1Var2 = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(cj1Var2, (Property<cj1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<dj1, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            cj1 cj1Var3 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(cj1Var3, (Property<cj1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<dj1, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new jf4((byte) 6, this, z));
        this.h.start();
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ni));
        arrayList.add(new cnb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Oi));
        arrayList.add(new cnb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.O.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.c;
        if (cv3Var == null || !cv3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        cv3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        uc5 uc5Var;
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.R);
        nm7.f(this.currentAccount).b(this, nm7.S);
        wn5 wn5Var = new wn5(2, true, true);
        this.O = wn5Var;
        wn5Var.a = this;
        wn5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = mle.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().W1(l) == null) {
                arrayList.add(l);
            }
        }
        if (arrayList.isEmpty()) {
            uc5Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            uc5Var = this;
            cf7.Y(this.currentAccount).a.c(new d65(uc5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                uc5Var.getMessagesController().c4((TLRPC.User) obj, true, false);
            }
        }
        uc5Var.X = uc5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.R);
        nm7.f(this.currentAccount).n(this, nm7.S);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.o();
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.r();
        }
        this.O.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.O.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.s();
        }
        sc5 sc5Var = this.a;
        if (sc5Var != null) {
            sc5Var.f();
        }
        this.O.k();
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            wp4 wp4Var = this.w;
            if (wp4Var != null) {
                wp4Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            r59 r59Var = this.b;
            if (r59Var != null) {
                r59Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            cv3 cv3Var = this.c;
            if (cv3Var == null || cv3Var.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(cmb.F6));
            this.c.getEditText().u(getThemedColor(cmb.j6), getThemedColor(cmb.k6), getThemedColor(cmb.o7));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            wu3 wu3Var = this.c.a;
            wu3Var.requestFocus();
            gm.E3(wu3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.O;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            cv3 cv3Var = this.c;
            if (cv3Var != null) {
                cv3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.O;
        if (wn5Var != null && (str = wn5Var.f) != null) {
            bundle.putString("path", str);
        }
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            String obj = cv3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    @Override // vn5
    public final void T() {
    }
}
