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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wa5 extends d implements gk7, vl5 {
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
    public wl5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public oy8 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public wb4 Y;
    public va5 Z;
    public ua5 a;
    public o39 b;
    public rt3 c;
    public kb0 d;
    public s71 e;
    public vh1 f;
    public AnimatorSet h;
    public wh1 n;
    public final pb0 r;
    public FrameLayout s;
    public un4 w;
    public m8 x;
    public Drawable y;

    public wa5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new pb0((wjb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override // vl5
    public final void H(float f) {
        wh1 wh1Var = this.n;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        wh1 wh1Var = this.n;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(0.0f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1((d) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final String b0(int i) {
        return getMessagesController().V1((Long) this.L.get(i)).first_name;
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    public final /* synthetic */ void c0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(ad7.Y(this.currentAccount).i0(arrayList2));
        countDownLatch.countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0316  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131748081, null));
        a aVar = this.actionBar;
        int i = bkb.Z6;
        zkb.h(i, getResourceProvider(), aVar);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 24));
        byte b3 = 3;
        ay0 ay0Var = new ay0(this, context, b3);
        zkb.h(i, getResourceProvider(), ay0Var);
        this.fragmentView = ay0Var;
        ay0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        byte b4 = 10;
        this.fragmentView.setOnTouchListener(new jz1((byte) 10));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        pkb pkbVar = new pkb((byte) 8, context, this);
        pkbVar.setOrientation(1);
        ay0Var.addView(pkbVar, nme.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = gl.L(16.0f);
        int i2 = bkb.c6;
        InsetDrawable d0 = bkb.d0(L, getThemedColor(i2));
        vkb M = zkb.M(i2);
        wjb resourceProvider = getResourceProvider();
        frameLayout.setBackground(d0);
        zkb.j(frameLayout, d0, M, null, resourceProvider);
        pkbVar.addView(this.s, nme.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        kb0 kb0Var = new kb0((byte) 5, context, this);
        this.d = kb0Var;
        int i3 = this.Q;
        kb0Var.setRoundRadius(gl.L(i3 == 5 ? 16.0f : 32.0f));
        pb0 pb0Var = this.r;
        pb0Var.j(5L, null, null, null);
        this.d.setImageDrawable(pb0Var);
        this.d.setContentDescription(k96.M0(2131752111, null));
        FrameLayout frameLayout2 = this.s;
        kb0 kb0Var2 = this.d;
        boolean z = k96.a0;
        frameLayout2.addView(kb0Var2, nme.d(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 16.0f, z ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        s71 s71Var = new s71(this, context, paint, b4);
        this.e = s71Var;
        FrameLayout frameLayout3 = this.s;
        boolean z2 = k96.a0;
        frameLayout3.addView(s71Var, nme.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 16.0f, z2 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ra5
            public final /* synthetic */ wa5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b2) {
                    case 0:
                        wa5 wa5Var = this.b;
                        wa5Var.O.n(wa5Var.E != null, new iu4(wa5Var, (byte) 19), new n1(wa5Var, (byte) 23), 0);
                        wa5Var.S.H(0);
                        wa5Var.S.K(43);
                        wa5Var.f.d();
                        break;
                    default:
                        wa5 wa5Var2 = this.b;
                        if (!wa5Var2.N) {
                            if (wa5Var2.c.a.length() != 0) {
                                wa5Var2.N = true;
                                gl.t1(wa5Var2.c);
                                wa5Var2.c.setEnabled(false);
                                if (!wa5Var2.O.g()) {
                                    un4 un4Var = wa5Var2.w;
                                    if (un4Var != null) {
                                        un4Var.f(true, true);
                                    }
                                    wa5Var2.W = wa5Var2.getMessagesController().Q(wa5Var2.c.getText().toString(), wa5Var2.L, null, wa5Var2.Q, wa5Var2.T, wa5Var2.V, wa5Var2.U, wa5Var2.X, wa5Var2);
                                    break;
                                } else {
                                    wa5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) wa5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                gl.A3(wa5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new oy8(R.raw.camera, gl.L(60.0f), gl.L(60.0f), false, null);
        vh1 vh1Var = new vh1(b3, context, this);
        this.f = vh1Var;
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(gl.L(0.0f), 0, 0, gl.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        vh1 vh1Var2 = this.f;
        boolean z3 = k96.a0;
        frameLayout4.addView(vh1Var2, nme.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 16.0f, z3 ? 15.0f : 0.0f, 16.0f));
        wh1 wh1Var = new wh1(this, context, b);
        this.n = wh1Var;
        wh1Var.setSize(gl.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        wh1 wh1Var2 = this.n;
        boolean z4 = k96.a0;
        frameLayout5.addView(wh1Var2, nme.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        d0(false, false);
        rt3 rt3Var2 = new rt3(context, ay0Var, this, 0, false, null);
        this.c = rt3Var2;
        rt3Var2.setHint(k96.M0((i3 == 0 || i3 == 4 || i3 == 5) ? 2131751110 : 2131751109, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            rt3 rt3Var3 = this.c;
            rt3Var3.setSelection(rt3Var3.getText().length());
            this.P = null;
        }
        TLRPC.User f = getUserConfig().f();
        int size = this.L.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.c.getText())) {
            String str2 = "";
            try {
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (size == 2) {
                str2 = k96.a0("GroupCreateMembersTwo", null, 2131749258, f.first_name, b0(0));
            } else if (size == 3) {
                str2 = k96.a0("GroupCreateMembersThree", null, 2131749259, f.first_name, b0(0), b0(1));
            } else if (size != 4) {
                if (size == 5) {
                    str2 = k96.a0("GroupCreateMembersFive", null, 2131749261, f.first_name, b0(0), b0(1), b0(2), b0(3));
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.c.setText(str2);
                    rt3 rt3Var4 = this.c;
                    rt3Var4.w(0, rt3Var4.getText().length());
                }
            } else {
                str2 = k96.a0("GroupCreateMembersFour", null, 2131749260, f.first_name, b0(0), b0(1), b0(2));
            }
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.s;
        rt3 rt3Var5 = this.c;
        boolean z5 = k96.a0;
        frameLayout6.addView(rt3Var5, nme.d(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.Y = new wb4(1, this.b);
        o39 o39Var2 = this.b;
        ua5 ua5Var = new ua5(this, context);
        this.a = ua5Var;
        o39Var2.setAdapter(ua5Var);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(k96.a0 ? 1 : 2);
        pkbVar.addView(this.b, nme.o(-1, -1));
        this.b.setOnScrollListener(new ao2(this, (byte) 18));
        this.b.setOnItemClickListener(new sa5(this));
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.w = un4Var;
        vk9.c(un4Var);
        ay0Var.addView(this.w, un4.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: ra5
            public final /* synthetic */ wa5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b) {
                    case 0:
                        wa5 wa5Var = this.b;
                        wa5Var.O.n(wa5Var.E != null, new iu4(wa5Var, (byte) 19), new n1(wa5Var, (byte) 23), 0);
                        wa5Var.S.H(0);
                        wa5Var.S.K(43);
                        wa5Var.f.d();
                        break;
                    default:
                        wa5 wa5Var2 = this.b;
                        if (!wa5Var2.N) {
                            if (wa5Var2.c.a.length() != 0) {
                                wa5Var2.N = true;
                                gl.t1(wa5Var2.c);
                                wa5Var2.c.setEnabled(false);
                                if (!wa5Var2.O.g()) {
                                    un4 un4Var2 = wa5Var2.w;
                                    if (un4Var2 != null) {
                                        un4Var2.f(true, true);
                                    }
                                    wa5Var2.W = wa5Var2.getMessagesController().Q(wa5Var2.c.getText().toString(), wa5Var2.L, null, wa5Var2.Q, wa5Var2.T, wa5Var2.V, wa5Var2.U, wa5Var2.X, wa5Var2);
                                    break;
                                } else {
                                    wa5Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) wa5Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                gl.A3(wa5Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(k96.M0(2131751342, null));
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
            vh1 vh1Var = this.f;
            if (z) {
                vh1Var.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            vh1Var.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        if (z) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            vh1 vh1Var2 = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vh1Var2, (Property<vh1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<wh1, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            vh1 vh1Var3 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(vh1Var3, (Property<vh1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<wh1, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new id4((byte) 6, this, z));
        this.h.start();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = na7.q5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                    return;
                }
                int childCount = this.b.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof za5) {
                        ((za5) childAt).f(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == kk7.R) {
            this.W = 0;
            this.N = false;
            un4 un4Var = this.w;
            if (un4Var != null) {
                un4Var.f(false, true);
            }
            rt3 rt3Var = this.c;
            if (rt3Var != null) {
                rt3Var.setEnabled(true);
                return;
            }
            return;
        }
        if (i == kk7.Q) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            va5 va5Var = this.Z;
            if (va5Var != null) {
                va5Var.a(this, longValue);
            } else {
                kk7.f(this.currentAccount).k(kk7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new mu1(bundle), true);
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

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ni));
        arrayList.add(new blb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Oi));
        arrayList.add(new blb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
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
        rt3 rt3Var = this.c;
        if (rt3Var == null || !rt3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        rt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        wa5 wa5Var;
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Q);
        kk7.f(this.currentAccount).b(this, kk7.R);
        wl5 wl5Var = new wl5(2, true, true);
        this.O = wl5Var;
        wl5Var.a = this;
        wl5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = mue.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().V1(l) == null) {
                arrayList.add(l);
            }
        }
        if (arrayList.isEmpty()) {
            wa5Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            wa5Var = this;
            ad7.Y(this.currentAccount).a.c(new e45(wa5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                wa5Var.getMessagesController().Z3((TLRPC.User) obj, true, false);
            }
        }
        wa5Var.X = wa5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Q);
        kk7.f(this.currentAccount).n(this, kk7.R);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.o();
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.r();
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
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.s();
        }
        ua5 ua5Var = this.a;
        if (ua5Var != null) {
            ua5Var.f();
        }
        this.O.k();
        gl.W2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            un4 un4Var = this.w;
            if (un4Var != null) {
                un4Var.updateColors();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            o39 o39Var = this.b;
            if (o39Var != null) {
                o39Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            rt3 rt3Var = this.c;
            if (rt3Var == null || rt3Var.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(bkb.F6));
            this.c.getEditText().u(getThemedColor(bkb.j6), getThemedColor(bkb.k6), getThemedColor(bkb.o7));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            mt3 mt3Var = this.c.a;
            mt3Var.requestFocus();
            gl.F3(mt3Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.O;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            rt3 rt3Var = this.c;
            if (rt3Var != null) {
                rt3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.O;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            String obj = rt3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    @Override // vl5
    public final void T() {
    }
}
