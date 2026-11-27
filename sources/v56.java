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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v56 extends e {
    public ilb E;
    public mf5 F;
    public q56 G;
    public ilb H;
    public FrameLayout I;
    public qmb J;
    public ny9 K;
    public q56 L;
    public ilb M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public u56 T;
    public id U;
    public boolean V;
    public int W;
    public final boolean a;
    public final long b;
    public zma c;
    public zma d;
    public TLRPC.TL_chatInviteExported e;
    public s56 f;
    public ilb h;
    public wkb n;
    public t56 r;
    public TextView s;
    public ilb w;
    public TextView x;
    public mf5 y;

    /* JADX WARN: Multi-variable type inference failed */
    public v56(int i, long j) {
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
        this.x.setText(ob6.s(j, false));
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
            i2 = qd4.g(iArr[i2], i2, 1, arrayList);
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
                strArr[i5] = ob6.M0(2131747933, null);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[0]) {
                strArr[i5] = ob6.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[1]) {
                strArr[i5] = ob6.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i5)).intValue() == iArr[2]) {
                strArr[i5] = ob6.G(1, "Weeks", new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i5] = ob6.M0(2131748285, null);
                } else if (j2 < 31449600) {
                    strArr[i5] = ob6.D0().v0().format(1000 * j);
                } else {
                    strArr[i5] = ob6.D0().B0().format(1000 * j);
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
            i3 = qd4.g(iArr[i3], i3, 1, arrayList);
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
                strArr[i6] = ob6.M0(2131747933, null);
            } else {
                strArr[i6] = ((Integer) arrayList.get(i6)).toString();
            }
        }
        this.c.b(i4, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Hi));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.L6));
    }

    public final void b0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.S;
            if (i >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", ob6.M0(2131747933, null));
                return;
            }
            i = qd4.g(iArr[i], i, 1, arrayList);
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
        s56 s56Var = this.f;
        if (s56Var != null) {
            yob.h(aob.d6, null, s56Var);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        d0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            pv3.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        wkb wkbVar = this.n;
        if (wkbVar != null) {
            wkbVar.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            s56 s56Var2 = this.f;
            if (s56Var2 != null) {
                s56Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            ilb ilbVar = this.h;
            if (ilbVar != null) {
                ilbVar.setText(ob6.M0(2131754194, null));
            }
        }
        t56 t56Var = this.r;
        if (t56Var != null) {
            t56Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.a;
        if (!z) {
            this.simpleActionBar.setTitle(ob6.M0(2131748026, null));
        } else if (z) {
            this.simpleActionBar.setTitle(ob6.M0(2131751242, null));
        }
        byte b2 = 3;
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, b2));
        this.simpleActionBar.u(ob6.M0(!z ? 2131751718 : 2131745674, null));
        p56 p56Var = new p56(this, context);
        ny9 ny9Var = new ny9(context, p56Var, this.resourceProvider, true);
        this.K = ny9Var;
        ny9Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        byte b3 = 4;
        w81 w81Var = new w81(b3, context, this);
        this.fragmentView = w81Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        k43 k43Var = k43.h;
        layoutTransition.setInterpolator(2, k43Var);
        layoutTransition.setInterpolator(0, k43Var);
        layoutTransition.setInterpolator(4, k43Var);
        layoutTransition.setInterpolator(1, k43Var);
        layoutTransition.setInterpolator(3, k43Var);
        p56Var.setLayoutTransition(layoutTransition);
        p56Var.setOrientation(1);
        p56Var.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(91.0f));
        this.K.addView(p56Var);
        mf5 mf5Var = new mf5(context);
        this.y = mf5Var;
        mf5Var.setText(ob6.M0(2131748736, null));
        p56Var.addView(this.y);
        zma zmaVar = new zma(context, null);
        this.d = zmaVar;
        p56Var.addView(zmaVar);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(ob6.M0(2131743792, null));
        this.x.setOnClickListener(new uv5(this, context, b3));
        this.d.setCallback(new l56(this, (byte) 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i >= iArr.length) {
                break;
            }
            i = qd4.g(iArr[i], i, 1, arrayList);
        }
        this.d.b(3, null, ob6.G(1, "Hours", new Object[0]), ob6.G(1, "Days", new Object[0]), ob6.G(1, "Weeks", new Object[0]), ob6.M0(2131747933, null));
        p56Var.addView(this.x, tre.o(-1, 50));
        ilb ilbVar = new ilb(12, this.resourceProvider, context);
        this.E = ilbVar;
        ilbVar.setText(ob6.M0(2131743793, null));
        p56Var.addView(this.E);
        mf5 mf5Var2 = new mf5(context);
        this.F = mf5Var2;
        mf5Var2.setText(ob6.M0(2131748734, null));
        p56Var.addView(this.F);
        zma zmaVar2 = new zma(context, null);
        this.c = zmaVar2;
        zmaVar2.setCallback(new l56(this, b2));
        b0();
        p56Var.addView(this.c);
        q56 q56Var = new q56(context, (byte) 0);
        this.G = q56Var;
        q56Var.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(ob6.M0(2131743275, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new r56(this, (byte) 0));
        p56Var.addView(this.G, tre.o(-1, 50));
        ilb ilbVar2 = new ilb(12, this.resourceProvider, context);
        this.H = ilbVar2;
        ilbVar2.setText(ob6.M0(2131743276, null));
        p56Var.addView(this.H);
        uc7 messagesController = getMessagesController();
        long j = this.b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        boolean z2 = (!xc2.t0(M0) || M0.join_request || M0.join_to_send) ? false : true;
        s56 s56Var = new s56(context);
        this.f = s56Var;
        int i2 = aob.d6;
        yob.h(i2, null, s56Var);
        this.f.setTag(Integer.valueOf(i2));
        this.f.f(ob6.M0(2131754200, null), false, false);
        this.f.setOnClickListener(new w6((byte) 4, this, z2));
        p56Var.addView(this.f, tre.o(-1, 56));
        ilb ilbVar3 = new ilb(12, this.resourceProvider, context);
        this.h = ilbVar3;
        if (z2) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(ob6.M0(2131754174, null));
        } else {
            ilbVar3.setText(ob6.M0(2131754195, null));
        }
        p56Var.addView(this.h);
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = uc7.s1(this.currentAccount).N0(j);
            if ((this.e == null && xc2.V(uc7.s1(this.currentAccount).M0(Long.valueOf(j))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                wkb wkbVar = new wkb(context);
                this.n = wkbVar;
                yob.h(i2, null, wkbVar);
                this.n.setDrawCheckRipple(true);
                this.n.f(ob6.M0(2131745886, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new uv5(this, new Runnable[1], (byte) 5));
                p56Var.addView(this.n, tre.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                yob.X(this.s, aob.A6, null);
                t56 t56Var = new t56(this, context, ob6.M0(getConnectionsManager().isTestBackend() ? 2131745880 : 2131745881, null), this.resourceProvider);
                this.r = t56Var;
                t56Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                yob.h(i2, getResourceProvider(), this.r);
                t56 t56Var2 = this.r;
                t56Var2.getClass();
                i72 i72Var = new i72(t56Var2, b);
                yt3 yt3Var = t56Var2.d;
                yt3Var.setImeOptions(6);
                yt3Var.setOnEditorActionListener(new vx1(i72Var, (byte) 2));
                this.r.addView(this.s, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                t56 t56Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                t56Var3.getClass();
                ImageView imageView = new ImageView(t56Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                t56Var3.addView(imageView, tre.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                yt3 yt3Var2 = t56Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yt3Var2.getLayoutParams();
                layoutParams.leftMargin = hl.L(24.0f);
                yt3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(hl.L(-1.0f));
                imageView.setTranslationX(hl.L(1.0f));
                p56Var.addView(this.r, tre.o(-1, 48));
                this.r.setVisibility(8);
                ilb ilbVar4 = new ilb(12, this.resourceProvider, context);
                this.w = ilbVar4;
                if (this.e != null) {
                    ilbVar4.setText(ob6.M0(2131745884, null));
                } else {
                    ilbVar4.setText(hl.X3(ob6.M0(2131745885, null), new o56(this, (byte) 0)));
                }
                p56Var.addView(this.w, tre.o(-1, -2));
            }
        }
        q56 q56Var2 = new q56(context, (byte) 1);
        this.L = q56Var2;
        q56Var2.addTextChangedListener(new r56(this, (byte) 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(ob6.M0(2131748650, null));
        q56 q56Var3 = this.L;
        int i3 = aob.y6;
        yob.D(q56Var3, i3, null);
        this.L.setLines(1);
        this.L.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        this.L.setSingleLine();
        q56 q56Var4 = this.L;
        int i4 = aob.G6;
        yob.X(q56Var4, i4, null);
        this.L.setTextSize(1, 16.0f);
        p56Var.addView(this.L, tre.o(-1, 50));
        ilb ilbVar5 = new ilb(12, this.resourceProvider, context);
        this.M = ilbVar5;
        ilbVar5.setText(ob6.M0(2131748651, null));
        p56Var.addView(this.M);
        if (z) {
            qmb qmbVar = new qmb(context);
            this.J = qmbVar;
            yob.h(i2, null, qmbVar);
            this.J.b(ob6.M0(2131745750, null), false);
            yob.X(this.J.getTextView(), aob.p7, null);
            this.J.setOnClickListener(new sa5(this, (byte) 18));
            p56Var.addView(this.J);
        }
        w81Var.addView(this.K, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        yob.h(aob.a7, getResourceProvider(), frameLayout);
        new rx5(w81Var, false, new bm0((byte) 17));
        w81Var.addView(this.I, tre.e(-1, -2, 80));
        yob.h(i2, null, this.y);
        yob.h(i2, null, this.d);
        yob.h(i2, null, this.x);
        yob.h(i2, null, this.F);
        yob.h(i2, null, this.c);
        yob.h(i2, null, this.G);
        yob.h(i2, null, this.L);
        yob.X(this.G, i4, null);
        yob.D(this.G, i3, null);
        yob.X(this.x, i4, null);
        yob.D(this.x, i3, null);
        this.G.setCursorVisible(false);
        c0(this.e);
        w81Var.setClipChildren(false);
        this.K.setClipChildren(false);
        p56Var.setClipChildren(false);
        return w81Var;
    }

    public final void d0(boolean z) {
        this.F.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
        this.G.setVisibility(z ? 0 : 8);
        this.H.setVisibility(z ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ny9 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
