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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xc5 extends e implements fn7, yn5 {
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
    public zn5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public b29 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public td4 Y;
    public wc5 Z;
    public vc5 a;
    public d79 b;
    public iu3 c;
    public mb0 d;
    public a81 e;
    public di1 f;
    public AnimatorSet h;
    public ei1 n;
    public final rb0 r;
    public FrameLayout s;
    public zp4 w;
    public n8 x;
    public Drawable y;

    public xc5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new rb0((vnb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override // yn5
    public final void H(float f) {
        ei1 ei1Var = this.n;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(f);
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        ei1 ei1Var = this.n;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(0.0f);
    }

    @Override // yn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1((e) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final String b0(int i) {
        return getMessagesController().X1((Long) this.L.get(i)).first_name;
    }

    public final /* synthetic */ void c0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(kf7.a0(this.currentAccount).k0(arrayList2));
        countDownLatch.countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0316  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131748027, null));
        a aVar = this.actionBar;
        int i = aob.a7;
        yob.h(i, getResourceProvider(), aVar);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 25));
        byte b3 = 3;
        iy0 iy0Var = new iy0(this, context, b3);
        yob.h(i, getResourceProvider(), iy0Var);
        this.fragmentView = iy0Var;
        iy0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        byte b4 = 10;
        this.fragmentView.setOnTouchListener(new b02((byte) 10));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        oob oobVar = new oob((byte) 8, context, this);
        oobVar.setOrientation(1);
        iy0Var.addView(oobVar, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = hl.L(16.0f);
        int i2 = aob.d6;
        InsetDrawable d0 = aob.d0(L, getThemedColor(i2));
        uob M = yob.M(i2);
        vnb resourceProvider = getResourceProvider();
        frameLayout.setBackground(d0);
        yob.j(frameLayout, d0, M, null, resourceProvider);
        oobVar.addView(this.s, tre.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        mb0 mb0Var = new mb0((byte) 5, context, this);
        this.d = mb0Var;
        int i3 = this.Q;
        mb0Var.setRoundRadius(hl.L(i3 == 5 ? 16.0f : 32.0f));
        rb0 rb0Var = this.r;
        rb0Var.j(5L, null, null, null);
        this.d.setImageDrawable(rb0Var);
        this.d.setContentDescription(ob6.M0(2131752088, null));
        FrameLayout frameLayout2 = this.s;
        mb0 mb0Var2 = this.d;
        boolean z = ob6.a0;
        frameLayout2.addView(mb0Var2, tre.d(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 16.0f, z ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a81 a81Var = new a81(this, context, paint, b4);
        this.e = a81Var;
        FrameLayout frameLayout3 = this.s;
        boolean z2 = ob6.a0;
        frameLayout3.addView(a81Var, tre.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 16.0f, z2 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: sc5
            public final /* synthetic */ xc5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b2) {
                    case 0:
                        xc5 xc5Var = this.b;
                        xc5Var.O.n(xc5Var.E != null, new ea5(xc5Var, (byte) 4), new o1(xc5Var, (byte) 23), 0);
                        xc5Var.S.H(0);
                        xc5Var.S.K(43);
                        xc5Var.f.d();
                        break;
                    default:
                        xc5 xc5Var2 = this.b;
                        if (!xc5Var2.N) {
                            if (xc5Var2.c.a.length() != 0) {
                                xc5Var2.N = true;
                                hl.t1(xc5Var2.c);
                                xc5Var2.c.setEnabled(false);
                                if (!xc5Var2.O.g()) {
                                    zp4 zp4Var = xc5Var2.w;
                                    if (zp4Var != null) {
                                        zp4Var.f(true, true);
                                    }
                                    xc5Var2.W = xc5Var2.getMessagesController().S(xc5Var2.c.getText().toString(), xc5Var2.L, null, xc5Var2.Q, xc5Var2.T, xc5Var2.V, xc5Var2.U, xc5Var2.X, xc5Var2);
                                    break;
                                } else {
                                    xc5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) xc5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                hl.z3(xc5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new b29(R.raw.camera, hl.L(60.0f), hl.L(60.0f), false, null);
        di1 di1Var = new di1(b3, context, this);
        this.f = di1Var;
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(hl.L(0.0f), 0, 0, hl.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        di1 di1Var2 = this.f;
        boolean z3 = ob6.a0;
        frameLayout4.addView(di1Var2, tre.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 16.0f, z3 ? 15.0f : 0.0f, 16.0f));
        ei1 ei1Var = new ei1(this, context, b);
        this.n = ei1Var;
        ei1Var.setSize(hl.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        ei1 ei1Var2 = this.n;
        boolean z4 = ob6.a0;
        frameLayout5.addView(ei1Var2, tre.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        d0(false, false);
        iu3 iu3Var2 = new iu3(context, iy0Var, this, 0, false, null);
        this.c = iu3Var2;
        iu3Var2.setHint(ob6.M0((i3 == 0 || i3 == 4 || i3 == 5) ? 2131751087 : 2131751086, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            iu3 iu3Var3 = this.c;
            iu3Var3.setSelection(iu3Var3.getText().length());
            this.P = null;
        }
        TLRPC.User f = getUserConfig().f();
        int size = this.L.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (size == 2) {
                str2 = ob6.a0("GroupCreateMembersTwo", null, 2131749204, f.first_name, b0(0));
            } else if (size == 3) {
                str2 = ob6.a0("GroupCreateMembersThree", null, 2131749205, f.first_name, b0(0), b0(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = ob6.a0("GroupCreateMembersFive", null, 2131749207, f.first_name, b0(0), b0(1), b0(2), b0(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    iu3 iu3Var4 = this.c;
                    iu3Var4.w(0, iu3Var4.getText().length());
                }
            } else {
                str2 = ob6.a0("GroupCreateMembersFour", null, 2131749206, f.first_name, b0(0), b0(1), b0(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        iu3 iu3Var5 = this.c;
        boolean z5 = ob6.a0;
        frameLayout6.addView(iu3Var5, tre.d(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.Y = new td4(1, this.b);
        d79 d79Var2 = this.b;
        vc5 vc5Var = new vc5(this, context);
        this.a = vc5Var;
        d79Var2.setAdapter(vc5Var);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        oobVar.addView(this.b, tre.o(-1, -1));
        this.b.setOnScrollListener(new to2(this, (byte) 18));
        this.b.setOnItemClickListener(new tc5(this));
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.w = zp4Var;
        ko9.e(zp4Var);
        iy0Var.addView(this.w, zp4.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: sc5
            public final /* synthetic */ xc5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b) {
                    case 0:
                        xc5 xc5Var = this.b;
                        xc5Var.O.n(xc5Var.E != null, new ea5(xc5Var, (byte) 4), new o1(xc5Var, (byte) 23), 0);
                        xc5Var.S.H(0);
                        xc5Var.S.K(43);
                        xc5Var.f.d();
                        break;
                    default:
                        xc5 xc5Var2 = this.b;
                        if (!xc5Var2.N) {
                            if (xc5Var2.c.a.length() != 0) {
                                xc5Var2.N = true;
                                hl.t1(xc5Var2.c);
                                xc5Var2.c.setEnabled(false);
                                if (!xc5Var2.O.g()) {
                                    zp4 zp4Var2 = xc5Var2.w;
                                    if (zp4Var2 != null) {
                                        zp4Var2.f(true, true);
                                    }
                                    xc5Var2.W = xc5Var2.getMessagesController().S(xc5Var2.c.getText().toString(), xc5Var2.L, null, xc5Var2.Q, xc5Var2.T, xc5Var2.V, xc5Var2.U, xc5Var2.X, xc5Var2);
                                    break;
                                } else {
                                    xc5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) xc5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                hl.z3(xc5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(ob6.M0(2131751319, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final void d0(boolean z, boolean z2) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z2) {
            di1 di1Var = this.f;
            if (z) {
                di1Var.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            di1Var.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        if (z) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            di1 di1Var2 = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(di1Var2, (Property<di1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<ei1, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            di1 di1Var3 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(di1Var3, (Property<di1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<ei1, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new gf4((byte) 6, this, z));
        this.h.start();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = uc7.s5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                    return;
                }
                int childCount = this.b.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof bd5) {
                        ((bd5) childAt).f(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == jn7.S) {
            this.W = 0;
            this.N = false;
            zp4 zp4Var = this.w;
            if (zp4Var != null) {
                zp4Var.f(false, true);
            }
            iu3 iu3Var = this.c;
            if (iu3Var != null) {
                iu3Var.setEnabled(true);
                return;
            }
            return;
        }
        if (i == jn7.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            wc5 wc5Var = this.Z;
            if (wc5Var != null) {
                wc5Var.a(this, longValue);
            } else {
                jn7.f(this.currentAccount).k(jn7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new zu1(bundle), true);
            }
            if (this.G == null && this.H == null && this.I == null) {
                return;
            }
            getMessagesController().z(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O.c && super.dismissDialogOnPause(dialog);
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oi));
        arrayList.add(new apb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Pi));
        arrayList.add(new apb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.O.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.c;
        if (iu3Var == null || !iu3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        iu3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        xc5 xc5Var;
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.R);
        jn7.f(this.currentAccount).b(this, jn7.S);
        zn5 zn5Var = new zn5(2, true, true);
        this.O = zn5Var;
        zn5Var.a = this;
        zn5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = dze.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().X1(l) == null) {
                arrayList.add(l);
            }
        }
        if (arrayList.isEmpty()) {
            xc5Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            xc5Var = this;
            kf7.a0(this.currentAccount).a.c(new g65(xc5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                xc5Var.getMessagesController().i4((TLRPC.User) obj, true, false);
            }
        }
        xc5Var.X = xc5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.R);
        jn7.f(this.currentAccount).n(this, jn7.S);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.o();
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.r();
        }
        this.O.i();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.O.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.s();
        }
        vc5 vc5Var = this.a;
        if (vc5Var != null) {
            vc5Var.f();
        }
        this.O.k();
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            zp4 zp4Var = this.w;
            if (zp4Var != null) {
                zp4Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            d79 d79Var = this.b;
            if (d79Var != null) {
                d79Var.y1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            iu3 iu3Var = this.c;
            if (iu3Var == null || iu3Var.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(aob.G6));
            this.c.getEditText().u(getThemedColor(aob.k6), getThemedColor(aob.l6), getThemedColor(aob.p7));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            du3 du3Var = this.c.a;
            du3Var.requestFocus();
            hl.E3(du3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.O;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            iu3 iu3Var = this.c;
            if (iu3Var != null) {
                iu3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.O;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            String obj = iu3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    @Override // yn5
    public final void T() {
    }
}
