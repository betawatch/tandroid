// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wh8 extends e implements fn7, vma {
    public TLRPC.MessageMedia A0;
    public boolean B0;
    public boolean C0;
    public int E;
    public CharSequence F;
    public Editable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final byte O;
    public int P;
    public boolean Q;
    public zeb R;
    public o24 S;
    public rx5 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public s7 a;
    public int a0;
    public uh8 b;
    public boolean b0;
    public qob c;
    public zh8 c0;
    public x46 d;
    public final boolean d0;
    public iy0 e;
    public final boolean e0;
    public final zu1 f;
    public vh8 f0;
    public boolean g0;
    public lg5 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final CharSequence[] w;
    public int w0;
    public final boolean[] x;
    public int x0;
    public int y;
    public int y0;
    public final li7 z0;

    public wh8(zu1 zu1Var) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = hl.L(3.0f);
        this.h0 = -1;
        this.z0 = new li7(this, (byte) 8);
        this.e0 = true;
        int f = getMessagesController().l4.F3.f();
        this.n = f;
        this.w = new CharSequence[f];
        this.x = new boolean[f];
        this.f = zu1Var;
        this.d0 = yac.h(k5.a(this.currentAccount).a).p();
        this.M = false;
        this.O = (byte) 2;
    }

    @Override // vma
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (this.d0) {
            if (i > hl.L(50.0f) && this.Z && !hl.E && !hl.O1()) {
                if (z) {
                    this.Y = i;
                    uc7.d1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i;
                    uc7.d1().edit().putInt("kbd_height", this.X).commit();
                }
            }
            if (this.Q) {
                int i2 = z ? this.Y : this.X;
                if (this.C0) {
                    i2 += hl.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = hl.q.x;
                if (i3 != i4 || layoutParams.height != i2 || this.B0 != this.C0) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.e.requestLayout();
                    boolean z4 = this.B0;
                    if (z4 != this.C0) {
                        h0(z4 ? -hl.L(120.0f) : hl.L(120.0f));
                    }
                    this.B0 = this.C0;
                }
            }
            if (this.a0 == i && this.b0 == z) {
                return;
            }
            this.a0 = i;
            this.b0 = z;
            boolean z5 = this.Z;
            zh8 zh8Var = this.c0;
            if (zh8Var != null) {
                z2 = zh8Var.getEditField().isFocused() && this.T.c() && i > 0;
                this.Z = z2;
            } else {
                this.Z = false;
                z2 = false;
            }
            if (z2 && this.Q) {
                t0(0);
            }
            if (this.W != 0 && !(z3 = this.Z) && z3 != z5 && !this.Q) {
                this.W = 0;
                this.T.a();
                this.e.requestLayout();
            }
            if (this.Z && this.U) {
                this.U = false;
                hl.r(this.z0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Mi));
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        String upperCase;
        yob.h(aob.d6, getResourceProvider(), this.actionBar);
        a aVar = this.actionBar;
        int i = aob.G6;
        byte b = 1;
        yob.l(aVar, 1, i, getResourceProvider());
        yob.b(this.actionBar, i, getResourceProvider(), true);
        yob.l(this.actionBar, 3, aob.z8, getResourceProvider());
        byte b2 = 5;
        yob.l(this.actionBar, 5, i, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        vnb vnbVar = null;
        boolean z = this.e0;
        if (z) {
            this.actionBar.setTitle(ob6.M0(this.J ? 2131743759 : 2131743727, null));
        } else {
            a aVar2 = this.actionBar;
            if (this.O == 1) {
                aVar2.setTitle(ob6.M0(2131748018, null));
            } else {
                aVar2.setTitle(ob6.M0(2131748019, null));
            }
        }
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new oh8(this));
        s6 u = this.actionBar.u();
        if (z) {
            upperCase = ob6.M0(this.J ? 2131743760 : 2131743728, null);
        } else {
            upperCase = ob6.M0(2131751718, null).toUpperCase();
        }
        this.a = u.e(1, upperCase);
        this.b = new uh8(this, context);
        iy0 iy0Var = new iy0(this, context, (byte) 4);
        this.e = iy0Var;
        iy0Var.setDelegate(this);
        iy0 iy0Var2 = this.e;
        this.fragmentView = iy0Var2;
        yob.h(aob.a7, null, iy0Var2);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new qob(context, vnbVar, (byte) 10);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setVerticalScrollBarEnabled(false);
        ((zb3) this.c.getItemAnimator()).C = false;
        x46 x46Var = new x46(1, false);
        this.d = x46Var;
        this.c.setLayoutManager(x46Var);
        new lu5(new s10(this, b2)).h(this.c);
        frameLayout.addView(this.c, tre.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new zg4(this, (byte) 20));
        this.c.setOnScrollListener(new e98(this, b));
        lg5 lg5Var = new lg5(context, 4);
        this.h = lg5Var;
        lg5Var.setText(ob6.M0(2131746882, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, tre.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.d0) {
            jn7.e().b(this, jn7.l4);
            zeb zebVar = new zeb(context, this.currentAccount, null, this.resourceProvider);
            this.R = zebVar;
            zebVar.E = true;
            zebVar.F = true;
            zebVar.setHorizontalPadding(hl.L(24.0f));
            frameLayout.addView(this.R, tre.e(-2, jn7.p2, 51));
        }
        this.T = new rx5(this.e, false, null);
        j0();
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            o24 o24Var = this.S;
            if (o24Var != null) {
                o24Var.Q.i1();
            }
            zh8 zh8Var = this.c0;
            if (zh8Var != null) {
                int currentTextColor = zh8Var.getEditField().getCurrentTextColor();
                this.c0.getEditField().setTextColor(-1);
                this.c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void g0() {
        int i;
        zeb zebVar = this.R;
        if (zebVar != null) {
            zebVar.setDelegate(null);
            this.R.e();
        }
        int i2 = this.E;
        this.x[i2] = false;
        int i3 = i2 + 1;
        this.E = i3;
        if (this.r != null) {
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr2 = this.r;
                if (i4 < iArr2.length) {
                    i = iArr2[i4];
                } else {
                    i = this.s + 1;
                    this.s = i;
                }
                iArr[i4] = i;
            }
            this.r = iArr;
        }
        if (this.E == this.w.length) {
            this.b.s(this.p0);
        }
        this.b.i(this.p0);
        u0();
        this.g0 = false;
        this.h0 = (this.o0 + this.E) - 1;
        this.b.g(this.q0);
    }

    public final void h0(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qm1(this, f, (byte) 6));
        ofFloat.addListener(new ph8(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(hb.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hideKeyboardOnShow() {
        return this.h0 < 0;
    }

    public final boolean i0(boolean z) {
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z2 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z3 = false;
        if (z2) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i = 0;
            for (int i2 = 0; i2 < Math.min(this.E, charSequenceArr.length); i2++) {
                if (!TextUtils.isEmpty(charSequenceArr[i2])) {
                    i++;
                }
            }
            boolean z4 = (this.J || TextUtils.equals(todoList.title.text, a72.X(this.F))) && i == todoList.list.size();
            if (z4) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (!TextUtils.equals(charSequenceArr[i3].toString(), todoList.list.get(i3).title.text)) {
                        break;
                    }
                }
            }
            z3 = z4;
        } else {
            boolean isEmpty = TextUtils.isEmpty(a72.X(this.F));
            if (isEmpty) {
                for (int i4 = 0; i4 < this.E && (isEmpty = TextUtils.isEmpty(a72.X(charSequenceArr[i4]))); i4++) {
                }
            }
            z3 = isEmpty;
        }
        if (z && !z3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z5 = this.e0;
            String M0 = ob6.M0(z5 ? 2131752548 : 2131752554, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(z5 ? 2131752549 : 2131752555, null);
            alertDialog$Builder.j(ob6.M0(2131747307, null), new jz7((Object) this, (byte) 9));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
        }
        return z3;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = aob.w0(null, aob.d6, false);
            if (this.actionBar.z()) {
                w0 = aob.w0(null, aob.w8, false);
            }
            if (vm2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2 = this.M;
        CharSequence[] charSequenceArr = this.w;
        if (z2) {
            int i4 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.x;
                if (i4 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(a72.X(charSequenceArr[i4])) && zArr[i4]) {
                    i++;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = this.e0;
        if (z3) {
            i2 = getMessagesController().l4.P2.f();
            i3 = getMessagesController().l4.Q2.f();
        } else {
            i2 = jn7.d4;
            i3 = 100;
        }
        if ((TextUtils.isEmpty(a72.X(this.G)) || this.G.length() <= 200) && !TextUtils.isEmpty(a72.X(this.F)) && this.F.length() <= i2) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(a72.X(charSequenceArr[i5]))) {
                    if (charSequenceArr[i5].length() > i3) {
                        i6 = 0;
                        break;
                    }
                    i6++;
                }
                i5++;
            }
            if (i6 >= (z3 ? 1 : 2) && (!this.M || i >= 1)) {
                z = true;
                this.a.setEnabled((this.M && i == 0) || z);
                this.a.setAlpha(z ? 1.0f : 0.5f);
            }
        }
        z = false;
        if (this.M) {
            this.a.setEnabled((this.M && i == 0) || z);
            this.a.setAlpha(z ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.M && i == 0) || z);
        this.a.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void k0() {
        if (this.C0) {
            this.S.r(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams.height -= hl.L(120.0f);
            this.S.setLayoutParams(layoutParams);
            this.W = layoutParams.height;
            this.B0 = this.C0;
            this.C0 = false;
            h0(-hl.L(120.0f));
        }
    }

    public final void l0(boolean z) {
        if (this.d0) {
            byte b = 1;
            if (this.Q) {
                o24 o24Var = this.S;
                o24Var.Q.E0();
                o24Var.J.scrollTo(0, 0);
                o24Var.D(1);
                o24Var.R.g1(0, 0);
                this.S.r(false);
                if (z) {
                    this.S.z();
                }
                this.C0 = false;
                t0(0);
            }
            if (z) {
                o24 o24Var2 = this.S;
                if (o24Var2 == null || o24Var2.getVisibility() != 0) {
                    m0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                ofFloat.addUpdateListener(new nh8(this, b));
                ofFloat.addListener(new ph8(this, (byte) 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(hb.w);
                ofFloat.start();
            }
        }
    }

    public final void m0() {
        o24 o24Var;
        iz1 emojiButton;
        if (!this.Q && (o24Var = this.S) != null && o24Var.getVisibility() != 8) {
            zh8 zh8Var = this.c0;
            if (zh8Var != null && (emojiButton = zh8Var.getEmojiButton()) != null) {
                emojiButton.j(gz1.e, false);
            }
            this.S.setVisibility(8);
        }
        int i = this.W;
        this.W = 0;
        if (i != 0) {
            this.T.a();
        }
    }

    public final void n0(zh8 zh8Var, boolean z) {
        if (this.d0 && z) {
            if (this.c0 == zh8Var && this.Q && this.C0) {
                k0();
                this.Q = false;
            }
            zh8 zh8Var2 = this.c0;
            this.c0 = zh8Var;
            zh8Var.setEmojiButtonVisibility(true);
            iz1 emojiButton = zh8Var.getEmojiButton();
            gz1 gz1Var = gz1.e;
            emojiButton.j(gz1Var, false);
            qob qobVar = this.c;
            View G = qobVar.G(zh8Var);
            f89 U = G == null ? null : qobVar.U(G);
            zeb zebVar = this.R;
            if (zebVar != null) {
                zebVar.e();
                zeb zebVar2 = this.R;
                if (zebVar2 != null && U != null) {
                    View view = U.a;
                    if ((view instanceof zh8) && zebVar2.getDelegate() != view) {
                        this.R.setDelegate((zh8) view);
                    }
                }
            }
            if (zh8Var2 == null || zh8Var2 == zh8Var) {
                return;
            }
            if (this.Q) {
                k0();
                l0(false);
                p0();
            }
            zh8Var2.setEmojiButtonVisibility(false);
            zh8Var2.getEmojiButton().j(gz1Var, false);
        }
    }

    public final void o0(zh8 zh8Var) {
        this.c0 = zh8Var;
        if (!this.Q) {
            t0(1);
        } else {
            k0();
            p0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!this.Q) {
            return i0(z);
        }
        if (!z) {
            return false;
        }
        l0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.g0 || this.h0 < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i);
            this.c.getClass();
            if (RecyclerView.S(view) == this.h0) {
                break;
            } else {
                i++;
            }
        }
        if (view instanceof zh8) {
            hl.d3(new l(((zh8) view).getTextView(), (byte) 8), 300L);
            this.h0 = -1;
        }
        this.g0 = false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        u0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.V = true;
        if (this.d0) {
            jn7.e().n(this, jn7.l4);
            o24 o24Var = this.S;
            if (o24Var != null) {
                this.e.removeView(o24Var);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        if (this.d0) {
            l0(false);
            zeb zebVar = this.R;
            if (zebVar != null) {
                zebVar.e();
            }
            zh8 zh8Var = this.c0;
            if (zh8Var != null) {
                zh8Var.setEmojiButtonVisibility(false);
                this.c0.getTextView().clearFocus();
                hl.t1(this.c0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        uh8 uh8Var = this.b;
        if (uh8Var != null) {
            uh8Var.f();
        }
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        int i;
        qy qyVar;
        super.onThemeColorsChanged();
        try {
            qob qobVar = this.c;
            if (qobVar != null) {
                for (int i2 = 0; i2 < qobVar.getChildCount(); i2++) {
                    View childAt = qobVar.getChildAt(i2);
                    f89 U = qobVar.U(childAt);
                    if (U != null && (((i = U.f) == 4 || i == 5) && (childAt instanceof zh8) && (qyVar = ((zh8) childAt).d) != null)) {
                        qyVar.setTextColor(aob.p1(qyVar.isEnabled() ? 1.0f : 0.6f, getThemedColor(aob.G6)));
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0() {
        this.T.e = true;
        EditTextBoldCursor editField = this.c0.getEditField();
        editField.requestFocus();
        hl.E3(editField);
        t0(hl.D ? 0 : 2);
        if (hl.D || this.Z || hl.E || hl.O1()) {
            return;
        }
        this.U = true;
        li7 li7Var = this.z0;
        hl.r(li7Var);
        hl.d3(li7Var, 100L);
    }

    public final void q0(TLRPC.MessageMedia messageMedia, boolean z) {
        r0(messageMedia, z, -1);
    }

    public final void r0(TLRPC.MessageMedia messageMedia, boolean z, int i) {
        int i2;
        TLRPC.TodoList todoList;
        this.A0 = messageMedia;
        this.J = z;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(hl.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.F = spannableStringBuilder;
            CharSequence m = pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m;
            Spannable A5 = r47.A5(m, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = A5;
            r47.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i3 = 0;
            while (true) {
                i2 = this.E;
                todoList = tL_messageMediaToDo.todo;
                if (i3 >= i2) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = todoList.list.get(i3).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i3] = spannableStringBuilder2;
                CharSequence m2 = pv3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i3] = m2;
                Spannable A52 = r47.A5(m2, tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                charSequenceArr[i3] = A52;
                r47.b(A52, tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i3] = tL_messageMediaToDo.todo.list.get(i3).id;
                this.s = Math.max(this.s, this.r[i3]);
                i3++;
            }
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i2 + 1;
                u0();
                this.g0 = true;
                this.h0 = this.o0 + (i < 0 ? this.E - 1 : i);
            }
        }
    }

    public final void s0(int i, View view) {
        int length;
        int i2;
        if (view instanceof zh8) {
            zh8 zh8Var = (zh8) view;
            int i3 = this.j0;
            boolean z = this.e0;
            if (i == i3) {
                i2 = z ? getMessagesController().l4.P2.f() : jn7.d4;
                CharSequence charSequence = this.F;
                length = i2 - (charSequence != null ? charSequence.length() : 0);
            } else if (i == this.k0) {
                Editable editable = this.G;
                int length2 = editable != null ? editable.length() : 0;
                i2 = jn7.d3;
                length = 200 - length2;
            } else {
                int i4 = this.o0;
                if (i < i4 || i >= this.E + i4) {
                    return;
                }
                int i5 = i - i4;
                int f = z ? getMessagesController().l4.Q2.f() : 100;
                CharSequence charSequence2 = this.w[i5];
                length = f - (charSequence2 != null ? charSequence2.length() : 0);
                i2 = f;
            }
            float f2 = i2;
            if (length > f2 - (0.7f * f2)) {
                zh8Var.setText2("");
                return;
            }
            zh8Var.setText2(String.format("%d", Integer.valueOf(length)));
            ema textView2 = zh8Var.getTextView2();
            int i6 = length < 0 ? aob.p7 : aob.A6;
            yob.W(textView2, i6, null);
            textView2.setTag(Integer.valueOf(i6));
        }
    }

    public final void t0(int i) {
        zh8 zh8Var;
        if (this.d0) {
            byte b = 0;
            byte b2 = 1;
            if (i != 1) {
                iz1 emojiButton = this.c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(gz1.e, true);
                }
                o24 o24Var = this.S;
                if (o24Var != null) {
                    this.Q = false;
                    this.C0 = false;
                    if (hl.D || hl.E) {
                        o24Var.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.W = 0;
                }
                this.T.a();
                this.e.requestLayout();
                return;
            }
            o24 o24Var2 = this.S;
            boolean z = o24Var2 != null && o24Var2.getVisibility() == 0;
            o24 o24Var3 = this.S;
            if (o24Var3 != null && o24Var3.d1 != yac.t0) {
                this.e.removeView(o24Var3);
                o24Var3 = null;
                this.S = null;
            }
            if (o24Var3 == null) {
                o24 o24Var4 = new o24(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.S = o24Var4;
                o24Var4.x2 = false;
                o24Var4.V0 = false;
                o24Var4.setVisibility(8);
                if (hl.O1()) {
                    this.S.setForseMultiwindowLayout(true);
                }
                this.S.setDelegate(new qh8(this));
                this.e.addView(this.S);
            }
            this.S.setVisibility(0);
            this.Q = true;
            o24 o24Var5 = this.S;
            if (this.X <= 0) {
                if (hl.O1()) {
                    this.X = hl.L(150.0f);
                } else {
                    this.X = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                }
            }
            int i2 = this.Y;
            if (i2 <= 0) {
                if (hl.O1()) {
                    i2 = hl.L(150.0f);
                    this.Y = i2;
                } else {
                    i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                    this.Y = i2;
                }
            }
            Point point = hl.q;
            if (point.x <= point.y) {
                i2 = this.X;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o24Var5.getLayoutParams();
            layoutParams.height = i2;
            o24Var5.setLayoutParams(layoutParams);
            if (!hl.E && !hl.O1() && (zh8Var = this.c0) != null) {
                hl.t1(zh8Var.getEditField());
            }
            this.W = i2;
            this.T.a();
            this.e.requestLayout();
            iz1 emojiButton2 = this.c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(gz1.d, true);
            }
            if (z || this.Z) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            ofFloat.addUpdateListener(new nh8(this, b));
            ofFloat.addListener(new ph8(this, b2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(hb.w);
            ofFloat.start();
        }
    }

    public final void u0() {
        this.i0 = -1;
        this.j0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.u0 = -1;
        this.x0 = -1;
        this.r0 = -1;
        int i = 0;
        this.y0 = 0;
        boolean z = this.e0;
        if (!z || !this.J) {
            this.i0 = 0;
            this.j0 = 1;
            this.m0 = 2;
            this.y0 = 4;
            this.n0 = 3;
            i = 4;
        }
        int i2 = this.E;
        if (i2 != 0) {
            this.o0 = i;
            i += i2;
            this.y0 = i;
        }
        if (i2 != this.w.length) {
            int i3 = i + 1;
            this.y0 = i3;
            this.p0 = i;
            i = i3;
        }
        int i4 = i + 1;
        this.y0 = i4;
        this.q0 = i;
        if (z && this.J) {
            return;
        }
        int i5 = i + 2;
        this.y0 = i5;
        this.r0 = i4;
        if (z) {
            int i6 = i + 3;
            this.y0 = i6;
            this.w0 = i5;
            if (this.K) {
                this.y0 = i + 4;
                this.v0 = i6;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!xc2.T(chat) || chat.megagroup) {
            int i7 = this.y0;
            this.y0 = i7 + 1;
            this.s0 = i7;
        }
        byte b = this.O;
        if (b != 1) {
            int i8 = this.y0;
            this.y0 = i8 + 1;
            this.t0 = i8;
        }
        if (b == 0) {
            int i9 = this.y0;
            this.y0 = i9 + 1;
            this.u0 = i9;
        }
        int i10 = this.y0;
        int i11 = i10 + 1;
        this.y0 = i11;
        this.x0 = i10;
        if (this.M) {
            this.k0 = i11;
            this.y0 = i10 + 3;
            this.l0 = i10 + 2;
        }
    }
}
