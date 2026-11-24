// default package

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s36 extends d {
    public mhb E;
    public ld5 F;
    public n36 G;
    public mhb H;
    public FrameLayout I;
    public uib J;
    public tu9 K;
    public n36 L;
    public mhb M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public r36 T;
    public hd U;
    public boolean V;
    public int W;
    public final boolean a;
    public final long b;
    public fja c;
    public fja d;
    public TLRPC.TL_chatInviteExported e;
    public p36 f;
    public mhb h;
    public ahb n;
    public q36 r;
    public TextView s;
    public mhb w;
    public TextView x;
    public ld5 y;

    /* JADX WARN: Multi-variable type inference failed */
    public s36(int i, long j) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i;
        this.b = j;
    }

    public final void Z(int i) {
        int[] iArr;
        long j = i;
        this.x.setText(k96.s(j, false));
        int currentTime = i - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            iArr = this.Q;
            if (i2 >= iArr.length) {
                break;
            }
            if (!z && currentTime < iArr[i2]) {
                arrayList.add(Integer.valueOf(currentTime));
                i3 = i2;
                z = true;
            }
            i2 = tb4.g(iArr[i2], i2, 1, arrayList);
        }
        if (!z) {
            arrayList.add(Integer.valueOf(currentTime));
            i3 = iArr.length;
        }
        int size = arrayList.size();
        int i4 = size + 1;
        String[] strArr = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == size) {
                strArr[i5] = k96.M0(2131748010, null);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[0]) {
                strArr[i5] = k96.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[1]) {
                strArr[i5] = k96.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[2]) {
                strArr[i5] = k96.G(1, "Weeks", new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i5] = k96.M0(2131748339, null);
                } else if (j2 < 31449600) {
                    strArr[i5] = k96.D0().v0().format(1000 * j);
                } else {
                    strArr[i5] = k96.D0().B0().format(1000 * j);
                }
            }
        }
        this.d.b(i3, null, strArr);
    }

    public final void a0(int i) {
        int[] iArr;
        int i2;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            iArr = this.S;
            if (i3 >= iArr.length) {
                break;
            }
            if (!z && i <= (i2 = iArr[i3])) {
                if (i != i2) {
                    arrayList.add(Integer.valueOf(i));
                }
                i4 = i3;
                z = true;
            }
            i3 = tb4.g(iArr[i3], i3, 1, arrayList);
        }
        if (!z) {
            arrayList.add(Integer.valueOf(i));
            i4 = iArr.length;
        }
        int size = arrayList.size();
        int i5 = size + 1;
        String[] strArr = new String[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 == size) {
                strArr[i6] = k96.M0(2131748010, null);
            } else {
                strArr[i6] = ((Integer) arrayList.get(i6)).toString();
            }
        }
        this.c.b(i4, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Gi));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.K6));
    }

    public final void b0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.S;
            if (i >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", k96.M0(2131748010, null));
                return;
            }
            i = tb4.g(iArr[i], i, 1, arrayList);
        }
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i = tL_chatInviteExported.expire_date;
        if (i > 0) {
            Z(i);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i2 = tL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            a0(i2);
            this.G.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        p36 p36Var = this.f;
        if (p36Var != null) {
            zkb.h(bkb.c6, null, p36Var);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        d0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            vu3.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        ahb ahbVar = this.n;
        if (ahbVar != null) {
            ahbVar.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            p36 p36Var2 = this.f;
            if (p36Var2 != null) {
                p36Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            mhb mhbVar = this.h;
            if (mhbVar != null) {
                mhbVar.setText(k96.M0(2131754198, null));
            }
        }
        q36 q36Var = this.r;
        if (q36Var != null) {
            q36Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.a;
        if (!z) {
            this.simpleActionBar.setTitle(k96.M0(2131748080, null));
        } else if (z) {
            this.simpleActionBar.setTitle(k96.M0(2131751265, null));
        }
        byte b2 = 2;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, b2));
        this.simpleActionBar.s(k96.M0(!z ? 2131751741 : 2131745754, null));
        m36 m36Var = new m36(this, context);
        tu9 tu9Var = new tu9(context, m36Var, this.resourceProvider, true);
        this.K = tu9Var;
        tu9Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        n81 n81Var = new n81((byte) 4, context, this);
        this.fragmentView = n81Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        s33 s33Var = s33.h;
        layoutTransition.setInterpolator(2, s33Var);
        layoutTransition.setInterpolator(0, s33Var);
        layoutTransition.setInterpolator(4, s33Var);
        layoutTransition.setInterpolator(1, s33Var);
        byte b3 = 3;
        layoutTransition.setInterpolator(3, s33Var);
        m36Var.setLayoutTransition(layoutTransition);
        m36Var.setOrientation(1);
        m36Var.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(91.0f));
        this.K.addView(m36Var);
        ld5 ld5Var = new ld5(context);
        this.y = ld5Var;
        ld5Var.setText(k96.M0(2131748790, null));
        m36Var.addView(this.y);
        fja fjaVar = new fja(context, null);
        this.d = fjaVar;
        m36Var.addView(fjaVar);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(k96.M0(2131743898, null));
        this.x.setOnClickListener(new v16(this, context, b));
        this.d.setCallback(new i36(this, b2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i >= iArr.length) {
                break;
            }
            i = tb4.g(iArr[i], i, 1, arrayList);
        }
        this.d.b(3, null, k96.G(1, "Hours", new Object[0]), k96.G(1, "Days", new Object[0]), k96.G(1, "Weeks", new Object[0]), k96.M0(2131748010, null));
        m36Var.addView(this.x, nme.o(-1, 50));
        mhb mhbVar = new mhb(12, this.resourceProvider, context);
        this.E = mhbVar;
        mhbVar.setText(k96.M0(2131743899, null));
        m36Var.addView(this.E);
        ld5 ld5Var2 = new ld5(context);
        this.F = ld5Var2;
        ld5Var2.setText(k96.M0(2131748788, null));
        m36Var.addView(this.F);
        fja fjaVar2 = new fja(context, null);
        this.c = fjaVar2;
        fjaVar2.setCallback(new i36(this, b3));
        b0();
        m36Var.addView(this.c);
        n36 n36Var = new n36(context, (byte) 0);
        this.G = n36Var;
        n36Var.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(k96.M0(2131743381, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new o36(this, (byte) 0));
        m36Var.addView(this.G, nme.o(-1, 50));
        mhb mhbVar2 = new mhb(12, this.resourceProvider, context);
        this.H = mhbVar2;
        mhbVar2.setText(k96.M0(2131743382, null));
        m36Var.addView(this.H);
        na7 messagesController = getMessagesController();
        long j = this.b;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        boolean z2 = (!hc2.t0(K0) || K0.join_request || K0.join_to_send) ? false : true;
        p36 p36Var = new p36(context);
        this.f = p36Var;
        int i2 = bkb.c6;
        zkb.h(i2, null, p36Var);
        this.f.setTag(Integer.valueOf(i2));
        this.f.f(k96.M0(2131754204, null), false, false);
        this.f.setOnClickListener(new v6((byte) 4, this, z2));
        m36Var.addView(this.f, nme.o(-1, 56));
        mhb mhbVar3 = new mhb(12, this.resourceProvider, context);
        this.h = mhbVar3;
        if (z2) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(k96.M0(2131754178, null));
        } else {
            mhbVar3.setText(k96.M0(2131754199, null));
        }
        m36Var.addView(this.h);
        if (K0 == null || K0.username == null) {
            TLRPC.ChatFull L0 = na7.q1(this.currentAccount).L0(j);
            if ((this.e == null && hc2.V(na7.q1(this.currentAccount).K0(Long.valueOf(j))) && L0 != null && L0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                ahb ahbVar = new ahb(context);
                this.n = ahbVar;
                zkb.h(i2, null, ahbVar);
                this.n.setDrawCheckRipple(true);
                this.n.f(k96.M0(2131745966, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new v16(this, new Runnable[1], (byte) 2));
                m36Var.addView(this.n, nme.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                zkb.X(this.s, bkb.z6, null);
                q36 q36Var = new q36(this, context, k96.M0(getConnectionsManager().isTestBackend() ? 2131745960 : 2131745961, null), this.resourceProvider);
                this.r = q36Var;
                q36Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                zkb.h(i2, getResourceProvider(), this.r);
                q36 q36Var2 = this.r;
                q36Var2.getClass();
                r62 r62Var = new r62(q36Var2, b);
                ht3 ht3Var = q36Var2.d;
                ht3Var.setImeOptions(6);
                ht3Var.setOnEditorActionListener(new gx1(r62Var, (byte) 2));
                this.r.addView(this.s, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                q36 q36Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                q36Var3.getClass();
                ImageView imageView = new ImageView(q36Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                q36Var3.addView(imageView, nme.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                ht3 ht3Var2 = q36Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ht3Var2.getLayoutParams();
                layoutParams.leftMargin = gl.L(24.0f);
                ht3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(gl.L(-1.0f));
                imageView.setTranslationX(gl.L(1.0f));
                m36Var.addView(this.r, nme.o(-1, 48));
                this.r.setVisibility(8);
                mhb mhbVar4 = new mhb(12, this.resourceProvider, context);
                this.w = mhbVar4;
                if (this.e != null) {
                    mhbVar4.setText(k96.M0(2131745964, null));
                } else {
                    mhbVar4.setText(gl.Y3(k96.M0(2131745965, null), new l36(this, (byte) 0)));
                }
                m36Var.addView(this.w, nme.o(-1, -2));
            }
        }
        n36 n36Var2 = new n36(context, (byte) 1);
        this.L = n36Var2;
        n36Var2.addTextChangedListener(new o36(this, (byte) 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(k96.M0(2131748704, null));
        n36 n36Var3 = this.L;
        int i3 = bkb.x6;
        zkb.D(n36Var3, i3, null);
        this.L.setLines(1);
        this.L.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        this.L.setSingleLine();
        n36 n36Var4 = this.L;
        int i4 = bkb.F6;
        zkb.X(n36Var4, i4, null);
        this.L.setTextSize(1, 16.0f);
        m36Var.addView(this.L, nme.o(-1, 50));
        mhb mhbVar5 = new mhb(12, this.resourceProvider, context);
        this.M = mhbVar5;
        mhbVar5.setText(k96.M0(2131748705, null));
        m36Var.addView(this.M);
        byte b4 = 17;
        if (z) {
            uib uibVar = new uib(context);
            this.J = uibVar;
            zkb.h(i2, null, uibVar);
            this.J.b(k96.M0(2131745830, null), false);
            zkb.X(this.J.getTextView(), bkb.o7, null);
            this.J.setOnClickListener(new b95(this, b4));
            m36Var.addView(this.J);
        }
        n81Var.addView(this.K, nme.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        zkb.h(bkb.Z6, getResourceProvider(), frameLayout);
        new mv5(n81Var, false, new bm0(b4));
        n81Var.addView(this.I, nme.e(-1, -2, 80));
        zkb.h(i2, null, this.y);
        zkb.h(i2, null, this.d);
        zkb.h(i2, null, this.x);
        zkb.h(i2, null, this.F);
        zkb.h(i2, null, this.c);
        zkb.h(i2, null, this.G);
        zkb.h(i2, null, this.L);
        zkb.X(this.G, i4, null);
        zkb.D(this.G, i3, null);
        zkb.X(this.x, i4, null);
        zkb.D(this.x, i3, null);
        this.G.setCursorVisible(false);
        c0(this.e);
        n81Var.setClipChildren(false);
        this.K.setClipChildren(false);
        m36Var.setClipChildren(false);
        return n81Var;
    }

    public final void d0(boolean z) {
        this.F.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
        this.G.setVisibility(z ? 0 : 8);
        this.H.setVisibility(z ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final tu9 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
