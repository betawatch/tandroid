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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s56 extends d {
    public njb E;
    public jf5 F;
    public n56 G;
    public njb H;
    public FrameLayout I;
    public vkb J;
    public ww9 K;
    public n56 L;
    public njb M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public r56 T;
    public he U;
    public boolean V;
    public int W;
    public final boolean a;
    public final long b;
    public hla c;
    public hla d;
    public TLRPC.TL_chatInviteExported e;
    public p56 f;
    public njb h;
    public bjb n;
    public q56 r;
    public TextView s;
    public njb w;
    public TextView x;
    public jf5 y;

    /* JADX WARN: Multi-variable type inference failed */
    public s56(int i, long j) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i;
        this.b = j;
    }

    public final void a0(int i) {
        int[] iArr;
        long j = i;
        this.x.setText(jb6.s(j, false));
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
            i2 = td4.g(iArr[i2], i2, 1, arrayList);
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
                strArr[i5] = jb6.M0(2131747936, null);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[0]) {
                strArr[i5] = jb6.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[1]) {
                strArr[i5] = jb6.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[2]) {
                strArr[i5] = jb6.G(1, "Weeks", new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i5] = jb6.M0(2131748288, null);
                } else if (j2 < 31449600) {
                    strArr[i5] = jb6.D0().v0().format(1000 * j);
                } else {
                    strArr[i5] = jb6.D0().B0().format(1000 * j);
                }
            }
        }
        this.d.b(i3, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Gi));
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.K6));
    }

    public final void b0(int i) {
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
            i3 = td4.g(iArr[i3], i3, 1, arrayList);
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
                strArr[i6] = jb6.M0(2131747936, null);
            } else {
                strArr[i6] = ((Integer) arrayList.get(i6)).toString();
            }
        }
        this.c.b(i4, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.S;
            if (i >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", jb6.M0(2131747936, null));
                return;
            }
            i = td4.g(iArr[i], i, 1, arrayList);
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
            this.simpleActionBar.setTitle(jb6.M0(2131748029, null));
        } else if (z) {
            this.simpleActionBar.setTitle(jb6.M0(2131751214, null));
        }
        byte b2 = 3;
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, b2));
        this.simpleActionBar.s(jb6.M0(!z ? 2131751690 : 2131745680, null));
        m56 m56Var = new m56(this, context);
        ww9 ww9Var = new ww9(context, m56Var, this.resourceProvider, true);
        this.K = ww9Var;
        ww9Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        w91 w91Var = new w91((byte) 4, context, this);
        this.fragmentView = w91Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        d53 d53Var = d53.h;
        byte b3 = 2;
        layoutTransition.setInterpolator(2, d53Var);
        layoutTransition.setInterpolator(0, d53Var);
        layoutTransition.setInterpolator(4, d53Var);
        layoutTransition.setInterpolator(1, d53Var);
        layoutTransition.setInterpolator(3, d53Var);
        m56Var.setLayoutTransition(layoutTransition);
        m56Var.setOrientation(1);
        m56Var.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(91.0f));
        this.K.addView(m56Var);
        jf5 jf5Var = new jf5(context);
        this.y = jf5Var;
        jf5Var.setText(jb6.M0(2131748739, null));
        m56Var.addView(this.y);
        hla hlaVar = new hla(context, null);
        this.d = hlaVar;
        m56Var.addView(hlaVar);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(jb6.M0(2131743824, null));
        this.x.setOnClickListener(new n06(this, context, b3));
        this.d.setCallback(new i56(this, b3));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i >= iArr.length) {
                break;
            }
            i = td4.g(iArr[i], i, 1, arrayList);
        }
        this.d.b(3, null, jb6.G(1, "Hours", new Object[0]), jb6.G(1, "Days", new Object[0]), jb6.G(1, "Weeks", new Object[0]), jb6.M0(2131747936, null));
        m56Var.addView(this.x, qoe.o(-1, 50));
        njb njbVar = new njb(12, this.resourceProvider, context);
        this.E = njbVar;
        njbVar.setText(jb6.M0(2131743825, null));
        m56Var.addView(this.E);
        jf5 jf5Var2 = new jf5(context);
        this.F = jf5Var2;
        jf5Var2.setText(jb6.M0(2131748737, null));
        m56Var.addView(this.F);
        hla hlaVar2 = new hla(context, null);
        this.c = hlaVar2;
        hlaVar2.setCallback(new i56(this, b2));
        c0();
        m56Var.addView(this.c);
        n56 n56Var = new n56(context, (byte) 0);
        this.G = n56Var;
        n56Var.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(jb6.M0(2131743307, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new o56(this, (byte) 0));
        m56Var.addView(this.G, qoe.o(-1, 50));
        njb njbVar2 = new njb(12, this.resourceProvider, context);
        this.H = njbVar2;
        njbVar2.setText(jb6.M0(2131743308, null));
        m56Var.addView(this.H);
        oc7 messagesController = getMessagesController();
        long j = this.b;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        boolean z2 = (!sd2.t0(L0) || L0.join_request || L0.join_to_send) ? false : true;
        p56 p56Var = new p56(context);
        this.f = p56Var;
        int i2 = cmb.c6;
        anb.h(i2, null, p56Var);
        this.f.setTag(Integer.valueOf(i2));
        this.f.f(jb6.M0(2131754172, null), false, false);
        this.f.setOnClickListener(new v6((byte) 4, this, z2));
        m56Var.addView(this.f, qoe.o(-1, 56));
        njb njbVar3 = new njb(12, this.resourceProvider, context);
        this.h = njbVar3;
        if (z2) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(jb6.M0(2131754146, null));
        } else {
            njbVar3.setText(jb6.M0(2131754167, null));
        }
        m56Var.addView(this.h);
        if (L0 == null || L0.username == null) {
            TLRPC.ChatFull M0 = oc7.r1(this.currentAccount).M0(j);
            if ((this.e == null && sd2.V(oc7.r1(this.currentAccount).L0(Long.valueOf(j))) && M0 != null && M0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                bjb bjbVar = new bjb(context);
                this.n = bjbVar;
                anb.h(i2, null, bjbVar);
                this.n.setDrawCheckRipple(true);
                this.n.f(jb6.M0(2131745892, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new n06(this, new Runnable[1], (byte) 3));
                m56Var.addView(this.n, qoe.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                anb.X(this.s, cmb.z6, null);
                q56 q56Var = new q56(this, context, jb6.M0(getConnectionsManager().isTestBackend() ? 2131745886 : 2131745887, null), this.resourceProvider);
                this.r = q56Var;
                q56Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                anb.h(i2, getResourceProvider(), this.r);
                q56 q56Var2 = this.r;
                q56Var2.getClass();
                q56Var2.d(new c82(q56Var2, b));
                this.r.addView(this.s, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                q56 q56Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                q56Var3.getClass();
                ImageView imageView = new ImageView(q56Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                q56Var3.addView(imageView, qoe.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                ru3 ru3Var = q56Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ru3Var.getLayoutParams();
                layoutParams.leftMargin = gm.L(24.0f);
                ru3Var.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(gm.L(-1.0f));
                imageView.setTranslationX(gm.L(1.0f));
                m56Var.addView(this.r, qoe.o(-1, 48));
                this.r.setVisibility(8);
                njb njbVar4 = new njb(12, this.resourceProvider, context);
                this.w = njbVar4;
                if (this.e != null) {
                    njbVar4.setText(jb6.M0(2131745890, null));
                } else {
                    njbVar4.setText(gm.X3(jb6.M0(2131745891, null), new l56(this, (byte) 0)));
                }
                m56Var.addView(this.w, qoe.o(-1, -2));
            }
        }
        n56 n56Var2 = new n56(context, (byte) 1);
        this.L = n56Var2;
        n56Var2.addTextChangedListener(new o56(this, (byte) 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(jb6.M0(2131748653, null));
        n56 n56Var3 = this.L;
        int i3 = cmb.x6;
        anb.D(n56Var3, i3, null);
        this.L.setLines(1);
        this.L.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        this.L.setSingleLine();
        n56 n56Var4 = this.L;
        int i4 = cmb.F6;
        anb.X(n56Var4, i4, null);
        this.L.setTextSize(1, 16.0f);
        m56Var.addView(this.L, qoe.o(-1, 50));
        njb njbVar5 = new njb(12, this.resourceProvider, context);
        this.M = njbVar5;
        njbVar5.setText(jb6.M0(2131748654, null));
        m56Var.addView(this.M);
        if (z) {
            vkb vkbVar = new vkb(context);
            this.J = vkbVar;
            anb.h(i2, null, vkbVar);
            this.J.b(jb6.M0(2131745756, null), false);
            anb.X(this.J.getTextView(), cmb.o7, null);
            this.J.setOnClickListener(new ca5(this, (byte) 20));
            m56Var.addView(this.J);
        }
        w91Var.addView(this.K, qoe.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        anb.h(cmb.Z6, getResourceProvider(), frameLayout);
        new mx5(w91Var, false, new bn0((byte) 17));
        w91Var.addView(this.I, qoe.e(-1, -2, 80));
        anb.h(i2, null, this.y);
        anb.h(i2, null, this.d);
        anb.h(i2, null, this.x);
        anb.h(i2, null, this.F);
        anb.h(i2, null, this.c);
        anb.h(i2, null, this.G);
        anb.h(i2, null, this.L);
        anb.X(this.G, i4, null);
        anb.D(this.G, i3, null);
        anb.X(this.x, i4, null);
        anb.D(this.x, i3, null);
        this.G.setCursorVisible(false);
        d0(this.e);
        w91Var.setClipChildren(false);
        this.K.setClipChildren(false);
        m56Var.setClipChildren(false);
        return w91Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i = tL_chatInviteExported.expire_date;
        if (i > 0) {
            a0(i);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i2 = tL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            b0(i2);
            this.G.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        p56 p56Var = this.f;
        if (p56Var != null) {
            anb.h(cmb.c6, null, p56Var);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        e0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            gw3.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        bjb bjbVar = this.n;
        if (bjbVar != null) {
            bjbVar.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            p56 p56Var2 = this.f;
            if (p56Var2 != null) {
                p56Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            njb njbVar = this.h;
            if (njbVar != null) {
                njbVar.setText(jb6.M0(2131754166, null));
            }
        }
        q56 q56Var = this.r;
        if (q56Var != null) {
            q56Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    public final void e0(boolean z) {
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
    public final ww9 getScrollViewForSimpleGlass() {
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
