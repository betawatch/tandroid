package org.telegram.ui;

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
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xu0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.wu0 {
    public CharSequence A;
    public Editable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int J;
    public int K;
    public boolean L;
    public org.telegram.ui.Components.ux0 M;
    public org.telegram.ui.Components.wy N;
    public kh.b4 O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public boolean W;
    public org.telegram.ui.Cells.c6 X;
    public final boolean Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 a;
    public wu0 a0;
    public vu0 b;
    public boolean b0;
    public va1 c;
    public int c0;
    public f2.m0 d;
    public int d0;
    public ed e;
    public int e0;
    public final qn f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.s30 h;
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
    public final v5 u0;
    public final CharSequence[] v;
    public TLRPC.MessageMedia v0;
    public final boolean[] w;
    public boolean w0;
    public int x;
    public boolean x0;
    public int y;

    public xu0(qn qnVar) {
        super(null);
        this.y = 1;
        this.C = true;
        this.D = false;
        this.F = true;
        this.K = AndroidUtilities.dp(3.0f);
        this.c0 = -1;
        this.u0 = new v5(this, 12);
        this.Z = true;
        int i9 = getMessagesController().todoItemsMax;
        this.n = i9;
        this.v = new CharSequence[i9];
        this.w = new boolean[i9];
        this.f = qnVar;
        this.Y = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.H = false;
        this.J = 2;
    }

    public static void b0(xu0 xu0Var, View view, int i9) {
        int length;
        int i10;
        boolean z10 = xu0Var.Z;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i9 == xu0Var.e0) {
                i10 = z10 ? xu0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = xu0Var.A;
                length = i10 - (charSequence != null ? charSequence.length() : 0);
            } else if (i9 == xu0Var.f0) {
                Editable editable = xu0Var.B;
                i10 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i11 = xu0Var.j0;
                if (i9 < i11 || i9 >= xu0Var.y + i11) {
                    return;
                }
                int i12 = i9 - i11;
                int i13 = z10 ? xu0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = xu0Var.v[i12];
                length = i13 - (charSequence2 != null ? charSequence2.length() : 0);
                i10 = i13;
            }
            float f10 = i10;
            if (length > f10 - (0.7f * f10)) {
                c6Var.setText2("");
                return;
            }
            c6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.h5 textView2 = c6Var.getTextView2();
            int i14 = length < 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            textView2.setTag(Integer.valueOf(i14));
        }
    }

    public static void c0(xu0 xu0Var, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        if (xu0Var.Y && z10) {
            if (xu0Var.X == c6Var && xu0Var.L && xu0Var.x0) {
                xu0Var.i0();
                xu0Var.L = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = xu0Var.X;
            xu0Var.X = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.e;
            emojiButton.j(ogVar, false);
            va1 va1Var = xu0Var.c;
            View F = va1Var.F(c6Var);
            f2.q1 T = F == null ? null : va1Var.T(F);
            org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
            if (ux0Var != null) {
                ux0Var.f();
                org.telegram.ui.Components.ux0 ux0Var2 = xu0Var.M;
                if (ux0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && ux0Var2.getDelegate() != view) {
                        xu0Var.M.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 == null || c6Var2 == c6Var) {
                return;
            }
            if (xu0Var.L) {
                xu0Var.i0();
                xu0Var.j0(false);
                xu0Var.l0();
            }
            c6Var2.setEmojiButtonVisibility(false);
            c6Var2.getEmojiButton().j(ogVar, false);
        }
    }

    public static void d0(xu0 xu0Var, org.telegram.ui.Cells.c6 c6Var) {
        xu0Var.X = c6Var;
        if (!xu0Var.L) {
            xu0Var.p0(1);
        } else {
            xu0Var.i0();
            xu0Var.l0();
        }
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        boolean z11;
        if (this.Y) {
            if (i9 > AndroidUtilities.dp(50.0f) && this.U && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.T = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.T).commit();
                } else {
                    this.S = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.S).commit();
                }
            }
            if (this.L) {
                int i10 = z10 ? this.T : this.S;
                if (this.x0) {
                    i10 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = AndroidUtilities.displaySize.x;
                if (i11 != i12 || layoutParams.height != i10 || this.w0 != this.x0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.N.setLayoutParams(layoutParams);
                    this.R = layoutParams.height;
                    this.O.a();
                    this.e.requestLayout();
                    boolean z12 = this.w0;
                    if (z12 != this.x0) {
                        f0(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.w0 = this.x0;
                }
            }
            if (this.V == i9 && this.W == z10) {
                return;
            }
            this.V = i9;
            this.W = z10;
            boolean z13 = this.U;
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null) {
                this.U = c6Var.getEditField().isFocused() && this.O.c() && i9 > 0;
            } else {
                this.U = false;
            }
            if (this.U && this.L) {
                p0(0);
            }
            if (this.R != 0 && !(z11 = this.U) && z11 != z13 && !this.L) {
                this.R = 0;
                this.O.a();
                this.e.requestLayout();
            }
            if (this.U && this.P) {
                this.P = false;
                AndroidUtilities.cancelRunOnUIThread(this.u0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(getThemedColor(i9), false);
        this.actionBar.C(getThemedColor(i9), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i9));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.Z;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(this.E ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.J == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pu0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z10) {
            upperCase = LocaleController.getString(this.E ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.a = n10.e(1, upperCase);
        this.b = new vu0(this, context);
        ed edVar = new ed(3, context, this);
        this.e = edVar;
        edVar.setDelegate(this);
        ed edVar2 = this.e;
        this.fragmentView = edVar2;
        edVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new va1(context, 11, null);
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.c.setItemAnimator(nVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((f2.n) this.c.getItemAnimator()).C = false;
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        this.c.setLayoutManager(m0Var);
        new f2.h0(new jh.f(this, 6)).d(this.c);
        frameLayout.addView(this.c, g7.e6.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new i(this, 22));
        this.c.setOnScrollListener(new l3(this, 24));
        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(context, 4);
        this.h = s30Var;
        s30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Y) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, this.currentAccount, null, this.resourceProvider);
            this.M = ux0Var;
            ux0Var.y = true;
            ux0Var.A = true;
            ux0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.M, g7.e6.e(-2, 160, 51));
        }
        this.O = new kh.b4(this.e, false, null);
        h0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wy wyVar = this.N;
            if (wyVar != null) {
                wyVar.L.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.X.getEditField().setTextColor(-1);
                this.X.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0() {
        int i9;
        org.telegram.ui.Components.ux0 ux0Var = this.M;
        if (ux0Var != null) {
            ux0Var.setDelegate(null);
            this.M.f();
        }
        int i10 = this.y;
        this.w[i10] = false;
        int i11 = i10 + 1;
        this.y = i11;
        if (this.r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.r;
                if (i12 < iArr2.length) {
                    i9 = iArr2[i12];
                } else {
                    i9 = this.s + 1;
                    this.s = i9;
                }
                iArr[i12] = i9;
            }
            this.r = iArr;
        }
        if (this.y == this.v.length) {
            this.b.u(this.k0);
        }
        this.b.o(this.k0);
        q0();
        this.b0 = false;
        this.c0 = (this.j0 + this.y) - 1;
        this.b.m(this.l0);
    }

    public final void f0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new cg(this, f10, 3));
        ofFloat.addListener(new qu0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
        ofFloat.start();
    }

    public final boolean g0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.v0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i9 = 0;
            for (int i10 = 0; i10 < Math.min(this.y, charSequenceArr.length); i10++) {
                if (!TextUtils.isEmpty(charSequenceArr[i10])) {
                    i9++;
                }
            }
            boolean z13 = (this.E || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.X(this.A))) && i9 == todoList.list.size();
            if (z13) {
                for (int i11 = 0; i11 < i9; i11++) {
                    if (!TextUtils.equals(charSequenceArr[i11].toString(), todoList.list.get(i11).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.X(this.A));
            if (isEmpty) {
                for (int i12 = 0; i12 < this.y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i12]))); i12++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.Z;
            alertDialog$Builder.a.N = LocaleController.getString(z14 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(z14 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new dl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.a);
        }
        return z12;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        int i12 = org.telegram.ui.ActionBar.f6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        int i14 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        int i9;
        boolean z10;
        boolean z11 = this.H;
        CharSequence[] charSequenceArr = this.v;
        if (z11) {
            int i10 = 0;
            i9 = 0;
            while (true) {
                boolean[] zArr = this.w;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i10])) && zArr[i10]) {
                    i9++;
                }
                i10++;
            }
        } else {
            i9 = 0;
        }
        boolean z12 = this.Z;
        int i11 = z12 ? getMessagesController().todoTitleLengthMax : 255;
        int i12 = z12 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.jn.X(this.B)) || this.B.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.jn.X(this.A)) && this.A.length() <= i11) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.X(charSequenceArr[i13]))) {
                    if (charSequenceArr[i13].length() > i12) {
                        i14 = 0;
                        break;
                    }
                    i14++;
                }
                i13++;
            }
            if (i14 >= (z12 ? 1 : 2) && (!this.H || i9 >= 1)) {
                z10 = true;
                this.a.setEnabled((this.H && i9 == 0) || z10);
                this.a.setAlpha(z10 ? 1.0f : 0.5f);
            }
        }
        z10 = false;
        if (this.H) {
            this.a.setEnabled((this.H && i9 == 0) || z10);
            this.a.setAlpha(z10 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.H && i9 == 0) || z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        return this.c0 < 0;
    }

    public final void i0() {
        if (this.x0) {
            this.N.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.N.setLayoutParams(layoutParams);
            this.R = layoutParams.height;
            this.w0 = this.x0;
            this.x0 = false;
            f0(-AndroidUtilities.dp(120.0f));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0(boolean z10) {
        if (this.Y) {
            int i9 = 1;
            if (this.L) {
                org.telegram.ui.Components.wy wyVar = this.N;
                wyVar.L.B0();
                wyVar.E.scrollTo(0, 0);
                wyVar.G(1);
                wyVar.M.h1(0, 0);
                this.N.t(false);
                if (z10) {
                    this.N.A();
                }
                this.x0 = false;
                p0(0);
            }
            if (z10) {
                org.telegram.ui.Components.wy wyVar2 = this.N;
                if (wyVar2 == null || wyVar2.getVisibility() != 0) {
                    k0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.N.getMeasuredHeight());
                ofFloat.addUpdateListener(new ou0(this, i9));
                ofFloat.addListener(new qu0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
    }

    public final void k0() {
        org.telegram.ui.Components.wy wyVar;
        org.telegram.ui.Components.qg emojiButton;
        if (!this.L && (wyVar = this.N) != null && wyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.og.e, false);
            }
            this.N.setVisibility(8);
        }
        int i9 = this.R;
        this.R = 0;
        if (i9 != 0) {
            this.O.a();
        }
    }

    public final void l0() {
        this.O.e = true;
        EditTextBoldCursor editField = this.X.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        p0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.U || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.P = true;
        v5 v5Var = this.u0;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        AndroidUtilities.runOnUIThread(v5Var, 100L);
    }

    public final void m0(ng ngVar) {
        this.a0 = ngVar;
    }

    public final void n0(TLRPC.MessageMedia messageMedia, boolean z10) {
        o0(messageMedia, z10, -1);
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10, int i9) {
        int i10;
        this.v0 = messageMedia;
        this.E = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.A = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.A = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.A = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.y = size;
            this.x = size;
            this.s = 0;
            this.r = new int[size];
            int i11 = 0;
            while (true) {
                i10 = this.y;
                if (i11 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i11).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i11] = spannableStringBuilder2;
                charSequenceArr[i11] = Emoji.replaceEmoji(charSequenceArr[i11], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i11] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i11], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i11], tL_textWithEntities.entities, false, false, false, false);
                this.r[i11] = tL_messageMediaToDo.todo.list.get(i11).id;
                this.s = Math.max(this.s, this.r[i11]);
                i11++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.F = todoList.others_can_complete;
            this.D = todoList.others_can_append;
            if (this.E) {
                this.y = i10 + 1;
                q0();
                this.b0 = true;
                int i12 = this.j0;
                if (i9 < 0) {
                    i9 = this.y - 1;
                }
                this.c0 = i12 + i9;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!this.L) {
            return g0(z10);
        }
        if (!z10) {
            return false;
        }
        j0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.b0 || this.c0 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i9);
            this.c.getClass();
            if (RecyclerView.R(view) == this.c0) {
                break;
            } else {
                i9++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.c6) {
            AndroidUtilities.runOnUIThread(new yg(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
            this.c0 = -1;
        }
        this.b0 = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.Q = true;
        if (this.Y) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.wy wyVar = this.N;
            if (wyVar != null) {
                this.e.removeView(wyVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        if (this.Y) {
            j0(false);
            org.telegram.ui.Components.ux0 ux0Var = this.M;
            if (ux0Var != null) {
                ux0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.X;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.X.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.X.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        vu0 vu0Var = this.b;
        if (vu0Var != null) {
            vu0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(int i9) {
        org.telegram.ui.Cells.c6 c6Var;
        if (this.Y) {
            int i10 = 0;
            int i11 = 1;
            if (i9 != 1) {
                org.telegram.ui.Components.qg emojiButton = this.X.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.e, true);
                }
                org.telegram.ui.Components.wy wyVar = this.N;
                if (wyVar != null) {
                    this.L = false;
                    this.x0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        wyVar.setVisibility(8);
                    }
                }
                if (i9 == 0) {
                    this.R = 0;
                }
                this.O.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.wy wyVar2 = this.N;
            boolean z10 = wyVar2 != null && wyVar2.getVisibility() == 0;
            org.telegram.ui.Components.wy wyVar3 = this.N;
            if (wyVar3 != null && wyVar3.Y0 != UserConfig.selectedAccount) {
                this.e.removeView(wyVar3);
                this.N = null;
            }
            if (this.N == null) {
                org.telegram.ui.Components.wy wyVar4 = new org.telegram.ui.Components.wy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.N = wyVar4;
                wyVar4.t2 = false;
                wyVar4.Q0 = false;
                wyVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.N.setForseMultiwindowLayout(true);
                }
                this.N.setDelegate(new ru0(this));
                this.e.addView(this.N);
            }
            this.N.setVisibility(0);
            this.L = true;
            org.telegram.ui.Components.wy wyVar5 = this.N;
            if (this.S <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.S = AndroidUtilities.dp(150.0f);
                } else {
                    this.S = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.T <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.T = AndroidUtilities.dp(150.0f);
                } else {
                    this.T = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i12 = point.x > point.y ? this.T : this.S;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar5.getLayoutParams();
            layoutParams.height = i12;
            wyVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.X) != null) {
                AndroidUtilities.hideKeyboard(c6Var.getEditField());
            }
            this.R = i12;
            this.O.a();
            this.e.requestLayout();
            org.telegram.ui.Components.qg emojiButton2 = this.X.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.d, true);
            }
            if (z10 || this.U) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, 0.0f);
            ofFloat.addUpdateListener(new ou0(this, i10));
            ofFloat.addListener(new qu0(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final void q0() {
        this.d0 = -1;
        this.e0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.m0 = -1;
        this.t0 = 0;
        boolean z10 = this.Z;
        if (!z10 || !this.E) {
            this.d0 = 0;
            this.e0 = 1;
            this.h0 = 2;
            this.t0 = 4;
            this.i0 = 3;
        }
        int i9 = this.y;
        if (i9 != 0) {
            int i10 = this.t0;
            this.j0 = i10;
            this.t0 = i10 + i9;
        }
        if (i9 != this.v.length) {
            int i11 = this.t0;
            this.t0 = i11 + 1;
            this.k0 = i11;
        }
        int i12 = this.t0;
        int i13 = i12 + 1;
        this.t0 = i13;
        this.l0 = i12;
        if (z10 && this.E) {
            return;
        }
        int i14 = i12 + 2;
        this.t0 = i14;
        this.m0 = i13;
        if (z10) {
            int i15 = i12 + 3;
            this.t0 = i15;
            this.r0 = i14;
            if (this.F) {
                this.t0 = i12 + 4;
                this.q0 = i15;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i16 = this.t0;
            this.t0 = i16 + 1;
            this.n0 = i16;
        }
        int i17 = this.J;
        if (i17 != 1) {
            int i18 = this.t0;
            this.t0 = i18 + 1;
            this.o0 = i18;
        }
        if (i17 == 0) {
            int i19 = this.t0;
            this.t0 = i19 + 1;
            this.p0 = i19;
        }
        int i20 = this.t0;
        int i21 = i20 + 1;
        this.t0 = i21;
        this.s0 = i20;
        if (this.H) {
            this.f0 = i21;
            this.t0 = i20 + 3;
            this.g0 = i20 + 2;
        }
    }
}
